/*     */ package com.impi.controller;

/*     */
/*     */ import com.impi.domain.Tvalue;
/*     */ import com.impi.service.ValueService;
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
/*     */ @RequestMapping({"/value"})
/*     */ @CrossOrigin
/*     */ public class ValueController
/*     */ {
/*     */   @Autowired
/*     */   private ValueService valueService;
/*     */   
/*     */   @RequestMapping({"/dataMain"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectByPage(Integer pageNum, Integer pageSize) {
/*  27 */     Map<String, Object> map = new HashMap<>();
/*  28 */     List<Tvalue> tvalues = this.valueService.findAllByPage(pageNum.intValue(), pageSize.intValue());
/*  29 */     int total = this.valueService.getCount();
/*  30 */     if (tvalues != null) {
/*  31 */       map.put("issuccess", Boolean.valueOf(true));
/*  32 */       map.put("tvalues", tvalues);
/*  33 */       map.put("total", Integer.valueOf(total));
/*     */     } else {
/*  35 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  37 */     return map;
/*     */   }
/*     */   @RequestMapping({"/selectAll"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectAll() {
/*  42 */     Map<String, Object> map = new HashMap<>();
/*  43 */     List<Tvalue> tvalues = this.valueService.selectAll();
/*  44 */     if (tvalues != null) {
/*  45 */       map.put("issuccess", Boolean.valueOf(true));
/*  46 */       map.put("tvalues", tvalues);
/*     */     } else {
/*  48 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  50 */     return map;
/*     */   }
/*     */   @RequestMapping({"/add"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> addTvalue(Tvalue tvalue) {
/*  55 */     Map<String, Object> map = new HashMap<>();
/*  56 */     int insert = this.valueService.insert(tvalue);
/*  57 */     if (insert > 0) {
/*  58 */       System.out.println("成功");
/*  59 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/*  61 */       System.out.println("失败");
/*  62 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  64 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/check"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> checkInfo(Integer code) {
/*  70 */     Map<String, Object> map = new HashMap<>();
/*  71 */     Tvalue tvalue = this.valueService.selectByKey(code);
/*  72 */     if (tvalue != null) {
/*  73 */       map.put("issuccess", Boolean.valueOf(true));
/*  74 */       map.put("tvalue", tvalue);
/*     */     } else {
/*  76 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  78 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/edit"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> editInfo(Tvalue tvalue) {
/*  84 */     Map<String, Object> map = new HashMap<>();
/*  85 */     int edit = this.valueService.update(tvalue);
/*  86 */     if (edit > 0) {
/*  87 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/*  89 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  91 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/delete"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> deleteInfo(Integer code) {
/*  97 */     Map<String, Object> map = new HashMap<>();
/*  98 */     int delete = this.valueService.delete(code);
/*  99 */     if (delete > 0) {
/* 100 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/* 102 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/* 104 */     return map;
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\controller\ValueController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */