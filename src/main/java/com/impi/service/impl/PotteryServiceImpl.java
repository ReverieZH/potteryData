/*    */ package com.impi.service.impl;

/*    */
/*    */ import com.github.pagehelper.PageHelper;
/*    */ import com.impi.domain.Pottery;
/*    */ import com.impi.mapper.PotteryMapper;
/*    */ import com.impi.service.PotteryService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ @Service("potteryService")
/*    */ public class PotteryServiceImpl
/*    */   implements PotteryService
/*    */ {
/*    */   @Autowired
/*    */   private PotteryMapper potteryMapper;
/*    */   
/*    */   public List<Pottery> selectAll() {
/* 20 */     return this.potteryMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<Pottery> findAllByPage(int pageNum, int pageSize) {
/* 25 */     long startTime = System.currentTimeMillis();
/* 26 */     PageHelper.startPage(pageNum, pageSize);
/* 27 */     List<Pottery> potteries = this.potteryMapper.selectAll();
/* 28 */     long endTime = System.currentTimeMillis();
/* 29 */     System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
/* 30 */     return potteries;
/*    */   }
/*    */ 
/*    */   
/*    */   public Pottery selectByKey(Integer code) {
/* 35 */     return (Pottery)this.potteryMapper.selectByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int insert(Pottery pottery) {
/* 40 */     return this.potteryMapper.insert(pottery);
/*    */   }
/*    */ 
/*    */   
/*    */   public int update(Pottery pottery) {
/* 45 */     return this.potteryMapper.updateByPrimaryKeySelective(pottery);
/*    */   }
/*    */ 
/*    */   
/*    */   public int delete(Integer code) {
/* 50 */     return this.potteryMapper.deleteByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCount() {
/* 55 */     return this.potteryMapper.getCount();
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\impl\PotteryServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */