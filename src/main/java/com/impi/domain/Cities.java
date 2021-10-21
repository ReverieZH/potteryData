/*    */ package com.impi.domain

-INF.classes.com.impi.domain;
/*    */ 
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ 
/*    */ public class Cities
/*    */ {
/*    */   @Id
/*    */   private Integer id;
/*    */   private String cityid;
/*    */   private String city;
/*    */   private String provinceid;
/*    */   
/*    */   public Integer getId() {
/* 15 */     return this.id;
/*    */   }
/*    */   
/*    */   public void setId(Integer id) {
/* 19 */     this.id = id;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCityid() {
/* 24 */     return this.cityid;
/*    */   }
/*    */   
/*    */   public void setCityid(String cityid) {
/* 28 */     this.cityid = cityid;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCity() {
/* 33 */     return this.city;
/*    */   }
/*    */   
/*    */   public void setCity(String city) {
/* 37 */     this.city = city;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getProvinceid() {
/* 42 */     return this.provinceid;
/*    */   }
/*    */   
/*    */   public void setProvinceid(String provinceid) {
/* 46 */     this.provinceid = provinceid;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Cities.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */