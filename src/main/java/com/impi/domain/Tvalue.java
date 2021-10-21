/*    */ package com.impi.domain

-INF.classes.com.impi.domain;
/*    */ 
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Table(name = "Tvalue")
/*    */ public class Tvalue
/*    */ {
/*    */   @Id
/*    */   private Integer code;
/*    */   private String name;
/*    */   
/*    */   public Integer getCode() {
/* 15 */     return this.code;
/*    */   }
/*    */   
/*    */   public void setCode(Integer code) {
/* 19 */     this.code = code;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getName() {
/* 24 */     return this.name;
/*    */   }
/*    */   
/*    */   public void setName(String name) {
/* 28 */     this.name = name;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Tvalue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */