/*    */ package com.impi.domain

-INF.classes.com.impi.domain;
/*    */ 
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ 
/*    */ public class Provinces
/*    */ {
/*    */   @Id
/*    */   private Integer id;
/*    */   private Integer provinceid;
/*    */   private String province;
/*    */   
/*    */   public Integer getId() {
/* 14 */     return this.id;
/*    */   }
/*    */   
/*    */   public void setId(Integer id) {
/* 18 */     this.id = id;
/*    */   }
/*    */ 
/*    */   
/*    */   public Integer getProvinceid() {
/* 23 */     return this.provinceid;
/*    */   }
/*    */   
/*    */   public void setProvinceid(Integer provinceid) {
/* 27 */     this.provinceid = provinceid;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getProvince() {
/* 32 */     return this.province;
/*    */   }
/*    */   
/*    */   public void setProvince(String province) {
/* 36 */     this.province = province;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Provinces.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */