/*    */ package com.impi.domain;

/*    */
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ 
/*    */ public class Areas
/*    */ {
/*    */   @Id
/*    */   private Integer id;
/*    */   private String areaid;
/*    */   private String area;
/*    */   private String cityid;
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
/*    */   public String getAreaid() {
/* 24 */     return this.areaid;
/*    */   }
/*    */   
/*    */   public void setAreaid(String areaid) {
/* 28 */     this.areaid = areaid;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getArea() {
/* 33 */     return this.area;
/*    */   }
/*    */   
/*    */   public void setArea(String area) {
/* 37 */     this.area = area;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCityid() {
/* 42 */     return this.cityid;
/*    */   }
/*    */   
/*    */   public void setCityid(String cityid) {
/* 46 */     this.cityid = cityid;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Areas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */