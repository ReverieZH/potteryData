/*    */ package com.impi.controller;

/*    */
/*    */ import com.github.pagehelper.PageInfo;
/*    */ import com.impi.domain.User;
/*    */ import com.impi.service.UserService;
/*    */ import com.impi.utils.JWTTokenUtil;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.CrossOrigin;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"/user"})
/*    */ @CrossOrigin
/*    */ public class UserController
/*    */ {
/*    */   @Autowired
/*    */   private UserService userService;
/*    */   
/*    */   @RequestMapping({"/login"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> login(String username, String password) {
/* 30 */     System.out.println("登陆---------");
/* 31 */     Map<String, Object> map = new HashMap<>();
/* 32 */     System.out.println(username + " " + password);
/*    */     try {
/* 34 */       User user = this.userService.login(username, password);
/* 35 */       String token = JWTTokenUtil.token(username, password);
/* 36 */       map.put("token", token);
/* 37 */       map.put("issuccess", Boolean.valueOf(true));
/* 38 */       map.put("role", user.getRole());
/* 39 */       map.put("msg", "登录成功");
/* 40 */     } catch (Exception e) {
/* 41 */       map.put("issuccess", Boolean.valueOf(false));
/* 42 */       System.out.println(e.getMessage());
/* 43 */       map.put("msg", e.getMessage());
/*    */     } 
/* 45 */     return map;
/*    */   }
/*    */   
/*    */   @RequestMapping({"/info"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> info(String token) {
/* 51 */     Map<String, Object> map = new HashMap<>();
/* 52 */     System.out.println("info     " + token);
/* 53 */     map.put("roles", "admin");
/* 54 */     map.put("name", "admin");
/* 55 */     map.put("avatar", "admin");
/* 56 */     map.put("introduction", "admin");
/* 57 */     return map;
/*    */   }
/*    */   
/*    */   @RequestMapping({"/dataMain"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> selectByPage(Integer pageNum, Integer pageSize) {
/* 63 */     Map<String, Object> map = new HashMap<>();
/* 64 */     PageInfo<User> page = this.userService.findAllByPage(pageNum, pageSize);
/* 65 */     List<User> users = page.getList();
/* 66 */     if (users != null) {
/* 67 */       map.put("issuccess", Boolean.valueOf(true));
/* 68 */       map.put("users", users);
/* 69 */       long total = page.getTotal();
/* 70 */       map.put("total", Long.valueOf(total));
/*    */     } else {
/* 72 */       map.put("issuccess", Boolean.valueOf(false));
/*    */     } 
/* 74 */     return map;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\controller\UserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */