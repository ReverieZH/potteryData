/*     */ package com.impi.domain;

/*     */
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ 
/*     */ @Table(name = "Role")
/*     */ public class Role
/*     */ {
/*     */   @Id
/*     */   private Integer roleid;
/*     */   @Column(name = "roleName")
/*     */   private String roleName;
/*     */   private String description;
/*     */   private String pottery;
/*     */   @Column(name = "addPottery")
/*     */   private String addPottery;
/*     */   @Column(name = "editPottery")
/*     */   private String editPottery;
/*     */   @Column(name = "deletePottery")
/*     */   private String deletePottery;
/*     */   @Column(name = "checkPottery")
/*     */   private String checkPottery;
/*     */   private String classifi;
/*     */   @Column(name = "addClassifi")
/*     */   private String addClassifi;
/*     */   @Column(name = "editClassifi")
/*     */   private String editClassifi;
/*     */   @Column(name = "checkClassifi")
/*     */   private String checkClassifi;
/*     */   @Column(name = "deleteClassifi")
/*     */   private String deleteClassifi;
/*     */   private String culture;
/*     */   @Column(name = "addCulture")
/*     */   private String addCulture;
/*     */   @Column(name = "editCulture")
/*     */   private String editCulture;
/*     */   @Column(name = "deleteCulture")
/*     */   private String deleteCulture;
/*     */   @Column(name = "checkCulture")
/*     */   private String checkCulture;
/*     */   private String texture;
/*     */   @Column(name = "addTexture")
/*     */   private String addTexture;
/*     */   @Column(name = "editTexture")
/*     */   private String editTexture;
/*     */   @Column(name = "deleteTexture")
/*     */   private String deleteTexture;
/*     */   @Column(name = "checkTexture")
/*     */   private String checkTexture;
/*     */   private String tvalue;
/*     */   @Column(name = "addTvalue")
/*     */   private String addTvalue;
/*     */   @Column(name = "editTvalue")
/*     */   private String editTvalue;
/*     */   @Column(name = "deleteTvalue")
/*     */   private String deleteTvalue;
/*     */   @Column(name = "checkTvalue")
/*     */   private String checkTvalue;
/*     */   @Column(name = "roleCol")
/*     */   private String roleCol;
/*     */   @Column(name = "logCheck")
/*     */   private String logCheck;
/*     */   @Column(name = "userManage")
/*     */   private String userManage;
/*     */   
/*     */   public Integer getRoleid() {
/*  69 */     return this.roleid;
/*     */   }
/*     */   
/*     */   public void setRoleid(Integer roleid) {
/*  73 */     this.roleid = roleid;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRoleName() {
/*  78 */     return this.roleName;
/*     */   }
/*     */   
/*     */   public void setRoleName(String roleName) {
/*  82 */     this.roleName = roleName;
/*     */   }
/*     */   
/*     */   public String getDescription() {
/*  86 */     return this.description;
/*     */   }
/*     */   
/*     */   public void setDescription(String description) {
/*  90 */     this.description = description;
/*     */   }
/*     */   
/*     */   public String getPottery() {
/*  94 */     return this.pottery;
/*     */   }
/*     */   
/*     */   public void setPottery(String pottery) {
/*  98 */     this.pottery = pottery;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAddPottery() {
/* 103 */     return this.addPottery;
/*     */   }
/*     */   
/*     */   public void setAddPottery(String addPottery) {
/* 107 */     this.addPottery = addPottery;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEditPottery() {
/* 112 */     return this.editPottery;
/*     */   }
/*     */   
/*     */   public void setEditPottery(String editPottery) {
/* 116 */     this.editPottery = editPottery;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDeletePottery() {
/* 121 */     return this.deletePottery;
/*     */   }
/*     */   
/*     */   public void setDeletePottery(String deletePottery) {
/* 125 */     this.deletePottery = deletePottery;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCheckPottery() {
/* 130 */     return this.checkPottery;
/*     */   }
/*     */   
/*     */   public void setCheckPottery(String checkPottery) {
/* 134 */     this.checkPottery = checkPottery;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getClassifi() {
/* 139 */     return this.classifi;
/*     */   }
/*     */   
/*     */   public void setClassifi(String classifi) {
/* 143 */     this.classifi = classifi;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAddClassifi() {
/* 148 */     return this.addClassifi;
/*     */   }
/*     */   
/*     */   public void setAddClassifi(String addClassifi) {
/* 152 */     this.addClassifi = addClassifi;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEditClassifi() {
/* 157 */     return this.editClassifi;
/*     */   }
/*     */   
/*     */   public void setEditClassifi(String editClassifi) {
/* 161 */     this.editClassifi = editClassifi;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCheckClassifi() {
/* 166 */     return this.checkClassifi;
/*     */   }
/*     */   
/*     */   public void setCheckClassifi(String checkClassifi) {
/* 170 */     this.checkClassifi = checkClassifi;
/*     */   }
/*     */   
/*     */   public String getDeleteClassifi() {
/* 174 */     return this.deleteClassifi;
/*     */   }
/*     */   
/*     */   public void setDeleteClassifi(String deleteClassifi) {
/* 178 */     this.deleteClassifi = deleteClassifi;
/*     */   }
/*     */   
/*     */   public String getCulture() {
/* 182 */     return this.culture;
/*     */   }
/*     */   
/*     */   public void setCulture(String culture) {
/* 186 */     this.culture = culture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAddCulture() {
/* 191 */     return this.addCulture;
/*     */   }
/*     */   
/*     */   public void setAddCulture(String addCulture) {
/* 195 */     this.addCulture = addCulture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEditCulture() {
/* 200 */     return this.editCulture;
/*     */   }
/*     */   
/*     */   public void setEditCulture(String editCulture) {
/* 204 */     this.editCulture = editCulture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDeleteCulture() {
/* 209 */     return this.deleteCulture;
/*     */   }
/*     */   
/*     */   public void setDeleteCulture(String deleteCulture) {
/* 213 */     this.deleteCulture = deleteCulture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCheckCulture() {
/* 218 */     return this.checkCulture;
/*     */   }
/*     */   
/*     */   public void setCheckCulture(String checkCulture) {
/* 222 */     this.checkCulture = checkCulture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTexture() {
/* 227 */     return this.texture;
/*     */   }
/*     */   
/*     */   public void setTexture(String texture) {
/* 231 */     this.texture = texture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAddTexture() {
/* 236 */     return this.addTexture;
/*     */   }
/*     */   
/*     */   public void setAddTexture(String addTexture) {
/* 240 */     this.addTexture = addTexture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEditTexture() {
/* 245 */     return this.editTexture;
/*     */   }
/*     */   
/*     */   public void setEditTexture(String editTexture) {
/* 249 */     this.editTexture = editTexture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDeleteTexture() {
/* 254 */     return this.deleteTexture;
/*     */   }
/*     */   
/*     */   public void setDeleteTexture(String deleteTexture) {
/* 258 */     this.deleteTexture = deleteTexture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCheckTexture() {
/* 263 */     return this.checkTexture;
/*     */   }
/*     */   
/*     */   public void setCheckTexture(String checkTexture) {
/* 267 */     this.checkTexture = checkTexture;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTvalue() {
/* 272 */     return this.tvalue;
/*     */   }
/*     */   
/*     */   public void setTvalue(String tvalue) {
/* 276 */     this.tvalue = tvalue;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAddTvalue() {
/* 281 */     return this.addTvalue;
/*     */   }
/*     */   
/*     */   public void setAddTvalue(String addTvalue) {
/* 285 */     this.addTvalue = addTvalue;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEditTvalue() {
/* 290 */     return this.editTvalue;
/*     */   }
/*     */   
/*     */   public void setEditTvalue(String editTvalue) {
/* 294 */     this.editTvalue = editTvalue;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDeleteTvalue() {
/* 299 */     return this.deleteTvalue;
/*     */   }
/*     */   
/*     */   public void setDeleteTvalue(String deleteTvalue) {
/* 303 */     this.deleteTvalue = deleteTvalue;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCheckTvalue() {
/* 308 */     return this.checkTvalue;
/*     */   }
/*     */   
/*     */   public void setCheckTvalue(String checkTvalue) {
/* 312 */     this.checkTvalue = checkTvalue;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRoleCol() {
/* 317 */     return this.roleCol;
/*     */   }
/*     */   
/*     */   public void setRoleCol(String roleCol) {
/* 321 */     this.roleCol = roleCol;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLogCheck() {
/* 326 */     return this.logCheck;
/*     */   }
/*     */   
/*     */   public void setLogCheck(String logCheck) {
/* 330 */     this.logCheck = logCheck;
/*     */   }
/*     */   
/*     */   public String getUserManage() {
/* 334 */     return this.userManage;
/*     */   }
/*     */   
/*     */   public void setUserManage(String userManage) {
/* 338 */     this.userManage = userManage;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 343 */     return "Role{roleid=" + this.roleid + ", roleName='" + this.roleName + '\'' + ", description='" + this.description + '\'' + ", pottery='" + this.pottery + '\'' + ", addPottery='" + this.addPottery + '\'' + ", editPottery='" + this.editPottery + '\'' + ", deletePottery='" + this.deletePottery + '\'' + ", checkPottery='" + this.checkPottery + '\'' + ", classifi='" + this.classifi + '\'' + ", addClassifi='" + this.addClassifi + '\'' + ", editClassifi='" + this.editClassifi + '\'' + ", checkClassifi='" + this.checkClassifi + '\'' + ", deleteClassifi='" + this.deleteClassifi + '\'' + ", culture='" + this.culture + '\'' + ", addCulture='" + this.addCulture + '\'' + ", editCulture='" + this.editCulture + '\'' + ", deleteCulture='" + this.deleteCulture + '\'' + ", checkCulture='" + this.checkCulture + '\'' + ", texture='" + this.texture + '\'' + ", addTexture='" + this.addTexture + '\'' + ", editTexture='" + this.editTexture + '\'' + ", deleteTexture='" + this.deleteTexture + '\'' + ", checkTexture='" + this.checkTexture + '\'' + ", tvalue='" + this.tvalue + '\'' + ", addTvalue='" + this.addTvalue + '\'' + ", editTvalue='" + this.editTvalue + '\'' + ", deleteTvalue='" + this.deleteTvalue + '\'' + ", checkTvalue='" + this.checkTvalue + '\'' + ", roleCol='" + this.roleCol + '\'' + ", logCheck='" + this.logCheck + '\'' + '}';
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\Role.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */