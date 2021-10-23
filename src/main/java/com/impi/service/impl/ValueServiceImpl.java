/*    */ package com.impi.service.impl;

/*    */
/*    */ import com.github.pagehelper.PageHelper;
/*    */ import com.impi.domain.Tvalue;
/*    */ import com.impi.mapper.TvalueMapper;
/*    */ import com.impi.service.ValueService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ @Service
/*    */ public class ValueServiceImpl
/*    */   implements ValueService
/*    */ {
/*    */   @Autowired
/*    */   private TvalueMapper tvalueMapper;
/*    */   
/*    */   public List<Tvalue> selectAll() {
/* 19 */     return this.tvalueMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<Tvalue> findAllByPage(int pageNum, int pageSize) {
/* 24 */     PageHelper.startPage(pageNum, pageSize);
/* 25 */     return this.tvalueMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public Tvalue selectByKey(Integer code) {
/* 30 */     return (Tvalue)this.tvalueMapper.selectByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int insert(Tvalue tvalue) {
/* 35 */     return this.tvalueMapper.insert(tvalue);
/*    */   }
/*    */ 
/*    */   
/*    */   public int update(Tvalue tvalue) {
/* 40 */     return this.tvalueMapper.updateByPrimaryKeySelective(tvalue);
/*    */   }
/*    */ 
/*    */   
/*    */   public int delete(Integer code) {
/* 45 */     return this.tvalueMapper.deleteByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCount() {
/* 50 */     return this.tvalueMapper.getCount();
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\impl\ValueServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */