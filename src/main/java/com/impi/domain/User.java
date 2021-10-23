/*    */ package com.impi.domain;

/*    */
/*    */ import com.impi.domain.Role;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Transient;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Table(name = "User")
/*    */ public class User
/*    */ {
/*    */   @Id
/*    */   private Integer id;
/*    */   private String username;
/*    */   private String password;
/*    */   private String roleid;
/*    */   @Transient
/*    */   private String roleName;
/*    */   @Transient
/*    */   private Role role;
/*    */   
/*    */   public User() {}
/*    */   
/*    */   public User(String username, String password) {
/* 27 */     this.username = username;
/* 28 */     this.password = password;
/*    */   }
/*    */   
/*    */   public Integer getId() {
/* 32 */     return this.id;
/*    */   }
/*    */   
/*    */   public void setId(Integer id) {
/* 36 */     this.id = id;
/*    */   }
/*    */   
/*    */   public String getUsername() {
/* 40 */     return this.username;
/*    */   }
/*    */   
/*    */   public void setUsername(String username) {
/* 44 */     this.username = username;
/*    */   }
/*    */   
/*    */   public String getPassword() {
/* 48 */     return this.password;
/*    */   }
/*    */   
/*    */   public void setPassword(String password) {
/* 52 */     this.password = password;
/*    */   }
/*    */   
/*    */   public String getRoleid() {
/* 56 */     return this.roleid;
/*    */   }
/*    */   
/*    */   public void setRoleid(String roleid) {
/* 60 */     this.roleid = roleid;
/*    */   }
/*    */   
/*    */   public Role getRole() {
/* 64 */     return this.role;
/*    */   }
/*    */   
/*    */   public void setRole(Role role) {
/* 68 */     this.role = role;
/*    */   }
/*    */   
/*    */   public String getRoleName() {
/* 72 */     return this.roleName;
/*    */   }
/*    */   
/*    */   public void setRoleName(String roleName) {
/* 76 */     this.roleName = roleName;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 81 */     return "User{id=" + this.id + ", username='" + this.username + '\'' + ", password='" + this.password + '\'' + ", roleid='" + this.roleid + '\'' + ", roleName='" + this.roleName + '\'' + ", role='" + this.role + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\domain\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */