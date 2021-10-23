/*    */ package com.impi.service.impl;

/*    */
/*    */ import com.github.pagehelper.PageHelper;
/*    */ import com.impi.domain.Culture;
/*    */ import com.impi.mapper.CultureMapper;
/*    */ import com.impi.service.CultureService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class CultureServiceImpl
/*    */   implements CultureService
/*    */ {
/*    */   @Autowired
/*    */   private CultureMapper cultureMapper;
/*    */   
/*    */   public List<Culture> selectAll() {
/* 20 */     return this.cultureMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<Culture> findAllByPage(int pageNum, int pageSize) {
/* 25 */     PageHelper.startPage(pageNum, pageSize);
/* 26 */     return this.cultureMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public Culture selectByKey(Integer code) {
/* 31 */     return (Culture)this.cultureMapper.selectByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int insert(Culture culture) {
/* 36 */     return this.cultureMapper.insert(culture);
/*    */   }
/*    */ 
/*    */   
/*    */   public int update(Culture culture) {
/* 41 */     return this.cultureMapper.updateByPrimaryKeySelective(culture);
/*    */   }
/*    */ 
/*    */   
/*    */   public int delete(Integer code) {
/* 46 */     return this.cultureMapper.deleteByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCount() {
/* 51 */     return this.cultureMapper.getCount();
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\impl\CultureServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */