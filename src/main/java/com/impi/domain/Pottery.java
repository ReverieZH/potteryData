/*     */ package com.impi.domain

-INF.classes.com.impi.domain;
/*     */ 
/*     */ import com.impi.domain.GPS;
/*     */ import java.util.Arrays;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Transient;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pottery
/*     */ {
/*     */   @Id
/*     */   private Integer code;
/*     */   private String name;
/*     */   private String type;
/*     */   @Column(name = "culCode")
/*     */   private Integer culCode;
/*     */   @Transient
/*     */   private String culString;
/*     */   @Column(name = "collCode")
/*     */   private Integer collCode;
/*     */   @Column(name = "colName")
/*     */   private String colName;
/*     */   @Column(name = "colLong")
/*     */   private Double colLong;
/*     */   @Column(name = "colLat")
/*     */   private Double colLat;
/*     */   @Column(name = "siteCode")
/*     */   private Integer siteCode;
/*     */   @Column(name = "siteName")
/*     */   private String siteName;
/*     */   @Column(name = "siteLong")
/*     */   private Double siteLong;
/*     */   @Column(name = "siteLat")
/*     */   private Double siteLat;
/*     */   @Column(name = "Valure")
/*     */   private Integer valure;
/*     */   @Transient
/*     */   private String valureString;
/*     */   @Column(name = "Classifi")
/*     */   private Integer classifi;
/*     */   @Transient
/*     */   private String classifiString;
/*     */   private Double hight;
/*     */   private Double topdiameter;
/*     */   private Double botdiameter;
/*     */   private String color;
/*     */   @Column(name = "TexCode")
/*     */   private Integer texCode;
/*     */   @Transient
/*     */   private String textureString;
/*     */   private byte[] sketch;
/*     */   @Transient
/*     */   private String sketchData;
/*     */   private byte[] picture;
/*     */   @Transient
/*     */   private String pictureData;
/*     */   private String description;
/*     */   private String text;
/*     */   
/*     */   public Integer getCode() {
/*  70 */     return this.code;
/*     */   }
/*     */   
/*     */   public void setCode(Integer code) {
/*  74 */     this.code = code;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/*  79 */     return this.name;
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/*  83 */     this.name = name;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getType() {
/*  88 */     return this.type;
/*     */   }
/*     */   
/*     */   public void setType(String type) {
/*  92 */     this.type = type;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getCulCode() {
/*  97 */     return this.culCode;
/*     */   }
/*     */   
/*     */   public void setCulCode(Integer culCode) {
/* 101 */     this.culCode = culCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getCollCode() {
/* 106 */     return this.collCode;
/*     */   }
/*     */   
/*     */   public void setCollCode(Integer collCode) {
/* 110 */     this.collCode = collCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getColName() {
/* 115 */     return this.colName;
/*     */   }
/*     */   
/*     */   public void setColName(String colName) {
/* 119 */     this.colName = colName;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getColLong() {
/* 124 */     return this.colLong;
/*     */   }
/*     */   
/*     */   public void setColLong(Double colLong) {
/* 128 */     this.colLong = colLong;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getColLat() {
/* 133 */     return this.colLat;
/*     */   }
/*     */   
/*     */   public void setColLat(Double colLat) {
/* 137 */     this.colLat = colLat;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getSiteCode() {
/* 142 */     return this.siteCode;
/*     */   }
/*     */   
/*     */   public void setSiteCode(Integer siteCode) {
/* 146 */     this.siteCode = siteCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSiteName() {
/* 151 */     return this.siteName;
/*     */   }
/*     */   
/*     */   public void setSiteName(String siteName) {
/* 155 */     this.siteName = siteName;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getSiteLong() {
/* 160 */     return this.siteLong;
/*     */   }
/*     */   
/*     */   public void setSiteLong(Double siteLong) {
/* 164 */     this.siteLong = siteLong;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getSiteLat() {
/* 169 */     return this.siteLat;
/*     */   }
/*     */   
/*     */   public void setSiteLat(Double siteLat) {
/* 173 */     this.siteLat = siteLat;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getValure() {
/* 178 */     return this.valure;
/*     */   }
/*     */   
/*     */   public void setValure(Integer valure) {
/* 182 */     this.valure = valure;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getClassifi() {
/* 187 */     return this.classifi;
/*     */   }
/*     */   
/*     */   public void setClassifi(Integer classifi) {
/* 191 */     this.classifi = classifi;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getHight() {
/* 196 */     return this.hight;
/*     */   }
/*     */   
/*     */   public void setHight(Double hight) {
/* 200 */     this.hight = hight;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getTopdiameter() {
/* 205 */     return this.topdiameter;
/*     */   }
/*     */   
/*     */   public void setTopdiameter(Double topdiameter) {
/* 209 */     this.topdiameter = topdiameter;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getBotdiameter() {
/* 214 */     return this.botdiameter;
/*     */   }
/*     */   
/*     */   public void setBotdiameter(Double botdiameter) {
/* 218 */     this.botdiameter = botdiameter;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getColor() {
/* 223 */     return this.color;
/*     */   }
/*     */   
/*     */   public void setColor(String color) {
/* 227 */     this.color = color;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getTexCode() {
/* 232 */     return this.texCode;
/*     */   }
/*     */   
/*     */   public void setTexCode(Integer texCode) {
/* 236 */     this.texCode = texCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] getSketch() {
/* 241 */     return this.sketch;
/*     */   }
/*     */   
/*     */   public void setSketch(byte[] sketch) {
/* 245 */     this.sketch = sketch;
/*     */   }
/*     */   
/*     */   public byte[] getPicture() {
/* 249 */     return this.picture;
/*     */   }
/*     */   
/*     */   public void setPicture(byte[] picture) {
/* 253 */     this.picture = picture;
/*     */   }
/*     */   
/*     */   public String getDescription() {
/* 257 */     return this.description;
/*     */   }
/*     */   
/*     */   public void setDescription(String description) {
/* 261 */     this.description = description;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getText() {
/* 266 */     return this.text;
/*     */   }
/*     */   
/*     */   public void setText(String text) {
/* 270 */     this.text = text;
/*     */   }
/*     */   
/*     */   public String getCulString() {
/* 274 */     return this.culString;
/*     */   }
/*     */   
/*     */   public void setCulString(String culString) {
/* 278 */     this.culString = culString;
/*     */   }
/*     */   
/*     */   public String getValureString() {
/* 282 */     return this.valureString;
/*     */   }
/*     */   
/*     */   public void setValureString(String valureString) {
/* 286 */     this.valureString = valureString;
/*     */   }
/*     */   
/*     */   public String getClassifiString() {
/* 290 */     return this.classifiString;
/*     */   }
/*     */   
/*     */   public void setClassifiString(String classifiString) {
/* 294 */     this.classifiString = classifiString;
/*     */   }
/*     */   
/*     */   public String getTextureString() {
/* 298 */     return this.textureString;
/*     */   }
/*     */   
/*     */   public void setTextureString(String textureString) {
/* 302 */     this.textureString = textureString;
/*     */   }
/*     */   
/*     */   public String getSketchData() {
/* 306 */     return this.sketchData;
/*     */   }
/*     */   
/*     */   public void setSketchData(String sketchData) {
/* 310 */     this.sketchData = sketchData;
/*     */   }
/*     */   
/*     */   public String getPictureData() {
/* 314 */     return this.pictureData;
/*     */   }
/*     */   
/*     */   public void setPictureData(String pictureData) {
/* 318 */     this.pictureData = pictureData;
/*     */   }
/*     */   
/*     */   public void transform(GPS col_gps, GPS site_gps) {
/* 322 */     this.colLat = Double.valueOf(col_gps.getLat());
/* 323 */     this.colLong = Double.valueOf(col_gps.getLon());
/* 324 */     this.siteLong = Double.valueOf(site_gps.getLon());
/* 325 */     this.siteLat = Double.valueOf(site_gps.getLat());
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 330 */     return "Pottery{code=" + this.code + ", name='" + this.name + '\'' + ", type='" + this.type + '\'' + ", culCode=" + this.culCode + ", collCode=" + this.collCode + ", colName='" + this.colName + '\'' + ", colLong=" + this.colLong + ", colLat=" + this.colLat + ", siteCode=" + this.siteCode + ", siteName='" + this.siteName + '\'' + ", siteLong=" + this.siteLong + ", siteLat=" + this.siteLat + ", valure=" + this.valure + ", classifi=" + this.classifi + ", hight=" + this.hight + ", topdiameter=" + this.topdiameter + ", botdiameter=" + this.botdiameter + ", color='" + this.color + '\'' + ", texCode=" + this.texCode + ", sketch=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 350 */       Arrays.toString(this.sketch) + ", picture=" + 
/* 351 */       Arrays.toString(this.picture) + ", description='" + this.description + '\'' + ", text='" + this.text + '\'' + '}';
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Pottery.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */