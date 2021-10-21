/*    */ package com.impi.domain

-INF.classes.com.impi.domain;
/*    */ 
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Table(name = "Classifi")
/*    */ public class Classifi
/*    */ {
/*    */   @Id
/*    */   @Column(name = "Code")
/*    */   private Integer code;
/*    */   @Column(name = "Name")
/*    */   private String name;
/*    */   
/*    */   public Integer getCode() {
/* 18 */     return this.code;
/*    */   }
/*    */   
/*    */   public void setCode(Integer code) {
/* 22 */     this.code = code;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getName() {
/* 27 */     return this.name;
/*    */   }
/*    */   
/*    */   public void setName(String name) {
/* 31 */     this.name = name;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Classifi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */