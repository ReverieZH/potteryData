/*     */ package com.impi.controller;

/*     */
/*     */ import com.github.pagehelper.PageInfo;
/*     */ import com.impi.domain.Role;
/*     */ import com.impi.service.RoleService;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.ResponseBody;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/role"})
/*     */ @CrossOrigin
/*     */ public class RoleController
/*     */ {
/*     */   @Autowired
/*     */   private RoleService roleService;
/*     */   
/*     */   @RequestMapping({"/dataMain"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectByPage(Integer pageNum, Integer pageSize) {
/*  30 */     Map<String, Object> map = new HashMap<>();
/*  31 */     PageInfo<Role> page = this.roleService.findAllByPage(pageNum.intValue(), pageSize.intValue());
/*  32 */     List<Role> roles = page.getList();
/*  33 */     if (roles != null) {
/*  34 */       map.put("issuccess", Boolean.valueOf(true));
/*  35 */       map.put("roles", roles);
/*  36 */       long total = page.getTotal();
/*  37 */       map.put("total", Long.valueOf(total));
/*     */     } else {
/*  39 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  41 */     return map;
/*     */   }
/*     */   @RequestMapping({"/selectAll"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectAll() {
/*  46 */     Map<String, Object> map = new HashMap<>();
/*  47 */     List<Role> roles = this.roleService.selectAll();
/*  48 */     if (roles != null) {
/*  49 */       map.put("issuccess", Boolean.valueOf(true));
/*  50 */       map.put("roles", roles);
/*     */     } else {
/*  52 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  54 */     return map;
/*     */   }
/*     */   @RequestMapping({"/add"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> addTvalue(Role role) {
/*  59 */     Map<String, Object> map = new HashMap<>();
/*  60 */     System.out.println(role);
/*  61 */     int insert = this.roleService.insert(role);
/*  62 */     if (insert > 0) {
/*  63 */       System.out.println("成功");
/*  64 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/*  66 */       System.out.println("失败");
/*  67 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  69 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/check"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> checkInfo(Integer code) {
/*  75 */     Map<String, Object> map = new HashMap<>();
/*  76 */     Role role = this.roleService.selectByKey(code);
/*  77 */     if (role != null) {
/*  78 */       map.put("issuccess", Boolean.valueOf(true));
/*  79 */       map.put("role", role);
/*     */     } else {
/*  81 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  83 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/edit"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> editInfo(Role role) {
/*  89 */     Map<String, Object> map = new HashMap<>();
/*  90 */     System.out.println(role);
/*  91 */     int edit = this.roleService.update(role);
/*  92 */     if (edit > 0) {
/*  93 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/*  95 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  97 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/delete"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> deleteInfo(Integer code) {
/* 103 */     Map<String, Object> map = new HashMap<>();
/* 104 */     int delete = this.roleService.delete(code);
/* 105 */     if (delete > 0) {
/* 106 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/* 108 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/* 110 */     return map;
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\controller\RoleController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */