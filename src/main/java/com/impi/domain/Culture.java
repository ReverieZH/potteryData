/*    */ package com.impi.domain

-INF.classes.com.impi.domain;
/*    */ 
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Table(name = "Culture")
/*    */ public class Culture
/*    */ {
/*    */   @Id
/*    */   @Column(name = "Ccode")
/*    */   private Integer ccode;
/*    */   @Column(name = "Name")
/*    */   private String name;
/*    */   @Column(name = "CulBegin")
/*    */   private String culBegin;
/*    */   @Column(name = "CulEnd")
/*    */   private String culEnd;
/*    */   @Column(name = "Type")
/*    */   private String type;
/*    */   @Column(name = "Abbr")
/*    */   private String abbr;
/*    */   @Column(name = "Region")
/*    */   private String region;
/*    */   
/*    */   public Integer getCcode() {
/* 29 */     return this.ccode;
/*    */   }
/*    */   
/*    */   public void setCcode(Integer ccode) {
/* 33 */     this.ccode = ccode;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getName() {
/* 38 */     return this.name;
/*    */   }
/*    */   
/*    */   public void setName(String name) {
/* 42 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCulBegin() {
/* 47 */     return this.culBegin;
/*    */   }
/*    */   
/*    */   public void setCulBegin(String culBegin) {
/* 51 */     this.culBegin = culBegin;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCulEnd() {
/* 56 */     return this.culEnd;
/*    */   }
/*    */   
/*    */   public void setCulEnd(String culEnd) {
/* 60 */     this.culEnd = culEnd;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getType() {
/* 65 */     return this.type;
/*    */   }
/*    */   
/*    */   public void setType(String type) {
/* 69 */     this.type = type;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getAbbr() {
/* 74 */     return this.abbr;
/*    */   }
/*    */   
/*    */   public void setAbbr(String abbr) {
/* 78 */     this.abbr = abbr;
/*    */   }
/*    */   
/*    */   public String getRegion() {
/* 82 */     return this.region;
/*    */   }
/*    */   
/*    */   public void setRegion(String region) {
/* 86 */     this.region = region;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 91 */     return "Culture{ccode=" + this.ccode + ", name='" + this.name + '\'' + ", culBegin='" + this.culBegin + '\'' + ", culEnd='" + this.culEnd + '\'' + ", type='" + this.type + '\'' + ", abbr='" + this.abbr + '\'' + ", region='" + this.region + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Culture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */