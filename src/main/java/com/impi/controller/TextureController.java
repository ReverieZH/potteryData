/*     */ package com.impi.controller

-INF.classes.com.impi.controller;
/*     */ 
/*     */ import com.impi.domain.Texture;
/*     */ import com.impi.service.TextureService;
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
/*     */ @RequestMapping({"/texture"})
/*     */ @CrossOrigin
/*     */ public class TextureController
/*     */ {
/*     */   @Autowired
/*     */   private TextureService textureService;
/*     */   
/*     */   @RequestMapping({"/dataMain"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectByPage(Integer pageNum, Integer pageSize) {
/*  29 */     Map<String, Object> map = new HashMap<>();
/*  30 */     List<Texture> textures = this.textureService.findAllByPage(pageNum.intValue(), pageSize.intValue());
/*  31 */     int total = this.textureService.getCount();
/*  32 */     if (textures != null) {
/*  33 */       map.put("issuccess", Boolean.valueOf(true));
/*  34 */       map.put("textures", textures);
/*  35 */       map.put("total", Integer.valueOf(total));
/*     */     } else {
/*  37 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  39 */     return map;
/*     */   }
/*     */   @RequestMapping({"/selectAll"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectAll() {
/*  44 */     Map<String, Object> map = new HashMap<>();
/*  45 */     List<Texture> textures = this.textureService.selectAll();
/*  46 */     if (textures != null) {
/*  47 */       map.put("issuccess", Boolean.valueOf(true));
/*  48 */       map.put("textures", textures);
/*     */     } else {
/*  50 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  52 */     return map;
/*     */   }
/*     */   @RequestMapping({"/add"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> addTvalue(Texture texture) {
/*  57 */     Map<String, Object> map = new HashMap<>();
/*  58 */     int insert = this.textureService.insert(texture);
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
/*  73 */     Texture texture = this.textureService.selectByKey(code);
/*  74 */     if (texture != null) {
/*  75 */       map.put("issuccess", Boolean.valueOf(true));
/*  76 */       map.put("texture", texture);
/*     */     } else {
/*  78 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  80 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/edit"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> editInfo(Texture texture) {
/*  86 */     Map<String, Object> map = new HashMap<>();
/*  87 */     int edit = this.textureService.update(texture);
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
/* 100 */     int delete = this.textureService.delete(code);
/* 101 */     if (delete > 0) {
/* 102 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/* 104 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/* 106 */     return map;
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\controller\TextureController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */