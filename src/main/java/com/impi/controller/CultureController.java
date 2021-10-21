/*     */ package com.impi.controller

-INF.classes.com.impi.controller;
/*     */ 
/*     */ import com.impi.domain.Culture;
/*     */ import com.impi.service.CultureService;
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
/*     */ @RequestMapping({"/culture"})
/*     */ @CrossOrigin
/*     */ public class CultureController
/*     */ {
/*     */   @Autowired
/*     */   private CultureService cultureService;
/*     */   
/*     */   @RequestMapping({"/dataMain"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectByPage(Integer pageNum, Integer pageSize) {
/*  29 */     Map<String, Object> map = new HashMap<>();
/*  30 */     List<Culture> cultures = this.cultureService.findAllByPage(pageNum.intValue(), pageSize.intValue());
/*  31 */     int total = this.cultureService.getCount();
/*  32 */     if (cultures != null) {
/*  33 */       map.put("issuccess", Boolean.valueOf(true));
/*  34 */       map.put("cultures", cultures);
/*  35 */       map.put("total", Integer.valueOf(total));
/*     */     } else {
/*  37 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  39 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/selectAll"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectAll() {
/*  45 */     Map<String, Object> map = new HashMap<>();
/*  46 */     List<Culture> cultures = this.cultureService.selectAll();
/*  47 */     if (cultures != null) {
/*  48 */       map.put("issuccess", Boolean.valueOf(true));
/*  49 */       map.put("cultures", cultures);
/*     */     } else {
/*  51 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  53 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/add"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> addTvalue(Culture culture) {
/*  60 */     Map<String, Object> map = new HashMap<>();
/*  61 */     System.out.println(culture);
/*  62 */     int insert = this.cultureService.insert(culture);
/*  63 */     if (insert > 0) {
/*  64 */       System.out.println("成功");
/*  65 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/*  67 */       System.out.println("失败");
/*  68 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  70 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/check"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> checkInfo(Integer code) {
/*  76 */     Map<String, Object> map = new HashMap<>();
/*  77 */     Culture culture = this.cultureService.selectByKey(code);
/*  78 */     if (culture != null) {
/*  79 */       map.put("issuccess", Boolean.valueOf(true));
/*  80 */       map.put("culture", culture);
/*     */     } else {
/*  82 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  84 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/edit"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> editInfo(Culture culture) {
/*  90 */     Map<String, Object> map = new HashMap<>();
/*  91 */     int edit = this.cultureService.update(culture);
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
/* 104 */     int delete = this.cultureService.delete(code);
/* 105 */     if (delete > 0) {
/* 106 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/* 108 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/* 110 */     return map;
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\controller\CultureController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */