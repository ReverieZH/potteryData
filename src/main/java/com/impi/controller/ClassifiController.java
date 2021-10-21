/*     */ package com.impi.controller;


/*     */ 
/*     */ import com.impi.domain.Classifi;
/*     */ import com.impi.service.ClassifiService;
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
/*     */ @Controller
/*     */ @RequestMapping({"/classifi"})
/*     */ @CrossOrigin
/*     */ public class ClassifiController
/*     */ {
/*     */   @Autowired
/*     */   private ClassifiService classifiService;
/*     */   
/*     */   @RequestMapping({"/dataMain"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectByPage(Integer pageNum, Integer pageSize) {
/*  27 */     Map<String, Object> map = new HashMap<>();
/*  28 */     List<Classifi> classifis = this.classifiService.findAllByPage(pageNum.intValue(), pageSize.intValue());
/*  29 */     int total = this.classifiService.getCount();
/*  30 */     if (classifis != null) {
/*  31 */       map.put("issuccess", Boolean.valueOf(true));
/*  32 */       map.put("classifis", classifis);
/*  33 */       map.put("total", Integer.valueOf(total));
/*     */     } else {
/*  35 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  37 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/selectAll"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectAll() {
/*  43 */     Map<String, Object> map = new HashMap<>();
/*  44 */     List<Classifi> classifis = this.classifiService.selectAll();
/*  45 */     if (classifis != null) {
/*  46 */       map.put("issuccess", Boolean.valueOf(true));
/*  47 */       map.put("classifis", classifis);
/*     */     } else {
/*  49 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  51 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/add"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> addTvalue(Classifi classifi) {
/*  57 */     Map<String, Object> map = new HashMap<>();
/*  58 */     int insert = this.classifiService.insert(classifi);
/*  59 */     if (insert > 0) {
/*  60 */       System.out.println("成功");
/*  61 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/*  63 */       System.out.println("失败");
/*  64 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  66 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/check"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> checkInfo(Integer code) {
/*  72 */     Map<String, Object> map = new HashMap<>();
/*  73 */     Classifi classifi = this.classifiService.selectByKey(code);
/*  74 */     if (classifi != null) {
/*  75 */       map.put("issuccess", Boolean.valueOf(true));
/*  76 */       map.put("classifi", classifi);
/*     */     } else {
/*  78 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  80 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/edit"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> editInfo(Classifi classifi) {
/*  86 */     Map<String, Object> map = new HashMap<>();
/*  87 */     int edit = this.classifiService.update(classifi);
/*  88 */     if (edit > 0) {
/*  89 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/*  91 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  93 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/delete"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> deleteInfo(Integer code) {
/*  99 */     Map<String, Object> map = new HashMap<>();
/* 100 */     int delete = this.classifiService.delete(code);
/* 101 */     if (delete > 0) {
/* 102 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/* 104 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/* 106 */     return map;
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\controller\ClassifiController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */