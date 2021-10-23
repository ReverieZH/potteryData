/*    */ package com.impi.service.impl;

/*    */
/*    */ import com.github.pagehelper.PageHelper;
/*    */ import com.impi.domain.Classifi;
/*    */ import com.impi.mapper.ClassifiMapper;
/*    */ import com.impi.service.ClassifiService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ @Service
/*    */ public class ClassifiServiceImpl
/*    */   implements ClassifiService
/*    */ {
/*    */   @Autowired
/*    */   private ClassifiMapper classifiMapper;
/*    */   
/*    */   public List<Classifi> selectAll() {
/* 19 */     return this.classifiMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<Classifi> findAllByPage(int pageNum, int pageSize) {
/* 24 */     PageHelper.startPage(pageNum, pageSize);
/* 25 */     return this.classifiMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public Classifi selectByKey(Integer code) {
/* 30 */     return (Classifi)this.classifiMapper.selectByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int insert(Classifi classifi) {
/* 35 */     return this.classifiMapper.insert(classifi);
/*    */   }
/*    */ 
/*    */   
/*    */   public int update(Classifi classifi) {
/* 40 */     return this.classifiMapper.updateByPrimaryKeySelective(classifi);
/*    */   }
/*    */ 
/*    */   
/*    */   public int delete(Integer code) {
/* 45 */     return this.classifiMapper.deleteByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCount() {
/* 50 */     return this.classifiMapper.getCount();
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\impl\ClassifiServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */