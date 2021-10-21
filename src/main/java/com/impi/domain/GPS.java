/*    */ package com.impi.domain-INF.classes.com.impi.domain;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GPS
/*    */ {
/*    */   private double lat;
/*    */   private double lon;
/*    */   
/*    */   public GPS(double lat, double lon) {
/* 13 */     this.lat = lat;
/* 14 */     this.lon = lon;
/*    */   }
/*    */   
/*    */   public double getLat() {
/* 18 */     return this.lat;
/*    */   }
/*    */   
/*    */   public void setLat(double lat) {
/* 22 */     this.lat = lat;
/*    */   }
/*    */   
/*    */   public double getLon() {
/* 26 */     return this.lon;
/*    */   }
/*    */   
/*    */   public void setLon(double lon) {
/* 30 */     this.lon = lon;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 34 */     return "lat:" + this.lat + ",lon:" + this.lon;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\GPS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */