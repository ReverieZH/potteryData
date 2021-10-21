/*     */ package com.impi.controller

-INF.classes.com.impi.controller;
/*     */ 
/*     */ import com.impi.domain.Classifi;
/*     */ import com.impi.domain.Culture;
/*     */ import com.impi.domain.GPS;
/*     */ import com.impi.domain.Pottery;
/*     */ import com.impi.domain.Tvalue;
/*     */ import com.impi.service.ClassifiService;
/*     */ import com.impi.service.CultureService;
/*     */ import com.impi.service.PotteryService;
/*     */ import com.impi.service.ValueService;
/*     */ import com.impi.utils.GPSConverterUtils;
/*     */ import java.io.IOException;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.ResponseBody;
/*     */ import org.springframework.web.multipart.MultipartFile;
/*     */ import sun.misc.BASE64Encoder;
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/pottery"})
/*     */ @CrossOrigin
/*     */ public class PotteryController
/*     */ {
/*     */   @Autowired
/*     */   private PotteryService potteryService;
/*     */   @Autowired
/*     */   private CultureService cultureService;
/*     */   @Autowired
/*     */   private ValueService valueService;
/*     */   @Autowired
/*     */   private ClassifiService classifiService;
/*     */   
/*     */   @RequestMapping({"/dataMain"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectByPage(Integer pageNum, Integer pageSize) {
/*  43 */     System.out.println("pageNum:" + pageNum + "pageSize:" + pageSize);
/*  44 */     Map<String, Object> map = new HashMap<>();
/*  45 */     List<Pottery> potteries = this.potteryService.findAllByPage(pageNum.intValue(), pageSize.intValue());
/*     */     
/*  47 */     int total = this.potteryService.getCount();
/*  48 */     if (potteries != null) {
/*  49 */       map.put("issuccess", Boolean.valueOf(true));
/*  50 */       map.put("potteries", potteries);
/*  51 */       map.put("total", Integer.valueOf(total));
/*     */     } else {
/*  53 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  55 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/selectAll"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> selectAll() {
/*  61 */     Map<String, Object> map = new HashMap<>();
/*  62 */     List<Pottery> potteries = this.potteryService.selectAll();
/*  63 */     int total = this.potteryService.getCount();
/*  64 */     if (potteries != null) {
/*  65 */       map.put("issuccess", Boolean.valueOf(true));
/*  66 */       map.put("potteries", potteries);
/*  67 */       map.put("total", Integer.valueOf(total));
/*     */     } else {
/*  69 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  71 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/add"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> addPottery(@RequestParam("sketchFile") MultipartFile sketchFile, @RequestParam("pictureFile") MultipartFile pictureFile, Pottery pottery) throws IOException {
/*  78 */     pottery.setSketch(sketchFile.getBytes());
/*  79 */     pottery.setPicture(pictureFile.getBytes());
/*  80 */     Map<String, Object> map = new HashMap<>();
/*  81 */     GPS col_gps = GPSConverterUtils.bd09_To_Gcj02(pottery.getColLat().doubleValue(), pottery.getColLong().doubleValue());
/*  82 */     GPS site_gps = GPSConverterUtils.bd09_To_Gcj02(pottery.getSiteLat().doubleValue(), pottery.getSiteLong().doubleValue());
/*  83 */     pottery.transform(col_gps, site_gps);
/*  84 */     int insert = this.potteryService.insert(pottery);
/*  85 */     if (insert > 0) {
/*  86 */       System.out.println("成功");
/*  87 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/*  89 */       System.out.println("失败");
/*  90 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/*  92 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/check"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> checkInfo(Integer code) {
/*  98 */     Map<String, Object> map = new HashMap<>();
/*  99 */     Pottery pottery = this.potteryService.selectByKey(code);
/* 100 */     if (pottery != null) {
/* 101 */       map.put("issuccess", Boolean.valueOf(true));
/* 102 */       GPS col_gps = GPSConverterUtils.gcj02_To_Bd09(pottery.getColLat().doubleValue(), pottery.getColLong().doubleValue());
/* 103 */       GPS site_gps = GPSConverterUtils.gcj02_To_Bd09(pottery.getSiteLat().doubleValue(), pottery.getSiteLong().doubleValue());
/* 104 */       pottery.transform(col_gps, site_gps);
/* 105 */       BASE64Encoder encoder = new BASE64Encoder();
/* 106 */       byte[] sketch = pottery.getSketch();
/* 107 */       if (sketch != null) {
/* 108 */         String sketchData = encoder.encode(sketch);
/* 109 */         pottery.setSketchData(sketchData);
/*     */       } else {
/* 111 */         pottery.setSketchData("");
/*     */       } 
/* 113 */       byte[] picture = pottery.getPicture();
/* 114 */       if (picture != null) {
/* 115 */         String pictureData = encoder.encode(picture);
/* 116 */         pottery.setPictureData(pictureData);
/*     */       } else {
/* 118 */         pottery.setPictureData("");
/*     */       } 
/* 120 */       map.put("pottery", pottery);
/*     */     } else {
/* 122 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/* 124 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/edit"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> editInfo(@RequestParam(value = "sketchFile", required = false) MultipartFile sketchFile, @RequestParam(value = "pictureFile", required = false) MultipartFile pictureFile, Pottery pottery) throws IOException {
/* 130 */     Map<String, Object> map = new HashMap<>();
/* 131 */     GPS col_gps = GPSConverterUtils.bd09_To_Gcj02(pottery.getColLat().doubleValue(), pottery.getColLong().doubleValue());
/* 132 */     GPS site_gps = GPSConverterUtils.bd09_To_Gcj02(pottery.getSiteLat().doubleValue(), pottery.getSiteLong().doubleValue());
/* 133 */     pottery.transform(col_gps, site_gps);
/* 134 */     if (sketchFile != null) {
/* 135 */       pottery.setSketch(sketchFile.getBytes());
/*     */     }
/* 137 */     if (pictureFile != null) {
/* 138 */       pottery.setSketch(pictureFile.getBytes());
/*     */     }
/* 140 */     System.out.println(pottery);
/* 141 */     int edit = this.potteryService.update(pottery);
/* 142 */     if (edit > 0) {
/* 143 */       System.out.println("成功");
/* 144 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/* 146 */       System.out.println("失败");
/* 147 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/* 149 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/delete"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> deleteInfo(Integer code) {
/* 155 */     Map<String, Object> map = new HashMap<>();
/* 156 */     int delete = this.potteryService.delete(code);
/* 157 */     if (delete > 0) {
/* 158 */       System.out.println("成功");
/* 159 */       map.put("issuccess", Boolean.valueOf(true));
/*     */     } else {
/* 161 */       System.out.println("失败");
/* 162 */       map.put("issuccess", Boolean.valueOf(false));
/*     */     } 
/* 164 */     return map;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/query"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> query(Integer culCode, Integer valure, Integer classCode, Integer texcode) {
/* 170 */     Map<String, Object> map = new HashMap<>();
/* 171 */     Culture culture = this.cultureService.selectByKey(culCode);
/* 172 */     if (culture != null) {
/* 173 */       map.put("culture", culture.getAbbr());
/*     */     }
/* 175 */     Tvalue tvalue = this.valueService.selectByKey(valure);
/* 176 */     if (tvalue != null) {
/* 177 */       map.put("value", tvalue.getName());
/*     */     }
/* 179 */     Classifi classifi = this.classifiService.selectByKey(classCode);
/* 180 */     if (classifi != null) {
/* 181 */       map.put("classifi", classifi.getName());
/*     */     }
/* 183 */     return map;
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\controller\PotteryController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */