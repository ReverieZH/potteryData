/*    */ package com.impi.domain;

/*    */
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Table(name = "Texture")
/*    */ public class Texture
/*    */ {
/*    */   @Id
/*    */   private Integer tcode;
/*    */   private String tname;
/*    */   
/*    */   public Integer getTcode() {
/* 15 */     return this.tcode;
/*    */   }
/*    */   
/*    */   public void setTcode(Integer tcode) {
/* 19 */     this.tcode = tcode;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getTname() {
/* 24 */     return this.tname;
/*    */   }
/*    */   
/*    */   public void setTname(String tname) {
/* 28 */     this.tname = tname;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Texture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */