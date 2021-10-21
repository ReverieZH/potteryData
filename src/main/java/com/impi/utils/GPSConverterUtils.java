/*     */ package com.impi.utils

-INF.classes.com.impi.utils;
/*     */ 
/*     */ import com.impi.domain.GPS;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GPSConverterUtils
/*     */ {
/*     */   public static final String BAIDU_LBS_TYPE = "bd09ll";
/*  16 */   public static double pi = Math.PI;
/*  17 */   public static double a = 6378245.0D;
/*  18 */   public static double ee = 0.006693421622965943D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static GPS gps84_To_Gcj02(double lat, double lon) {
/*  26 */     if (outOfChina(lat, lon)) {
/*  27 */       return null;
/*     */     }
/*  29 */     double dLat = transformLat(lon - 105.0D, lat - 35.0D);
/*  30 */     double dLon = transformLon(lon - 105.0D, lat - 35.0D);
/*  31 */     double radLat = lat / 180.0D * pi;
/*  32 */     double magic = Math.sin(radLat);
/*  33 */     magic = 1.0D - ee * magic * magic;
/*  34 */     double sqrtMagic = Math.sqrt(magic);
/*  35 */     dLat = dLat * 180.0D / a * (1.0D - ee) / magic * sqrtMagic * pi;
/*  36 */     dLon = dLon * 180.0D / a / sqrtMagic * Math.cos(radLat) * pi;
/*  37 */     double mgLat = lat + dLat;
/*  38 */     double mgLon = lon + dLon;
/*  39 */     return new GPS(mgLat, mgLon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static GPS gcj_To_Gps84(double lat, double lon) {
/*  46 */     GPS gps = transform(lat, lon);
/*  47 */     double lontitude = lon * 2.0D - gps.getLon();
/*  48 */     double latitude = lat * 2.0D - gps.getLat();
/*  49 */     return new GPS(latitude, lontitude);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static GPS gcj02_To_Bd09(double gg_lat, double gg_lon) {
/*  59 */     double x = gg_lon, y = gg_lat;
/*  60 */     double z = Math.sqrt(x * x + y * y) + 2.0E-5D * Math.sin(y * pi);
/*  61 */     double theta = Math.atan2(y, x) + 3.0E-6D * Math.cos(x * pi);
/*  62 */     double bd_lon = z * Math.cos(theta) + 0.0065D;
/*  63 */     double bd_lat = z * Math.sin(theta) + 0.006D;
/*  64 */     return new GPS(bd_lat, bd_lon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static GPS bd09_To_Gcj02(double bd_lat, double bd_lon) {
/*  72 */     double x = bd_lon - 0.0065D, y = bd_lat - 0.006D;
/*  73 */     double z = Math.sqrt(x * x + y * y) - 2.0E-5D * Math.sin(y * pi);
/*  74 */     double theta = Math.atan2(y, x) - 3.0E-6D * Math.cos(x * pi);
/*  75 */     double gg_lon = z * Math.cos(theta);
/*  76 */     double gg_lat = z * Math.sin(theta);
/*  77 */     return new GPS(gg_lat, gg_lon);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static GPS bd09_To_Gps84(double bd_lat, double bd_lon) {
/*  88 */     GPS gcj02 = bd09_To_Gcj02(bd_lat, bd_lon);
/*  89 */     GPS map84 = gcj_To_Gps84(gcj02.getLat(), gcj02
/*  90 */         .getLon());
/*  91 */     return map84;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean outOfChina(double lat, double lon) {
/* 102 */     if (lon < 72.004D || lon > 137.8347D)
/* 103 */       return true; 
/* 104 */     if (lat < 0.8293D || lat > 55.8271D)
/* 105 */       return true; 
/* 106 */     return false;
/*     */   }
/*     */   
/*     */   public static GPS transform(double lat, double lon) {
/* 110 */     if (outOfChina(lat, lon)) {
/* 111 */       return new GPS(lat, lon);
/*     */     }
/* 113 */     double dLat = transformLat(lon - 105.0D, lat - 35.0D);
/* 114 */     double dLon = transformLon(lon - 105.0D, lat - 35.0D);
/* 115 */     double radLat = lat / 180.0D * pi;
/* 116 */     double magic = Math.sin(radLat);
/* 117 */     magic = 1.0D - ee * magic * magic;
/* 118 */     double sqrtMagic = Math.sqrt(magic);
/* 119 */     dLat = dLat * 180.0D / a * (1.0D - ee) / magic * sqrtMagic * pi;
/* 120 */     dLon = dLon * 180.0D / a / sqrtMagic * Math.cos(radLat) * pi;
/* 121 */     double mgLat = lat + dLat;
/* 122 */     double mgLon = lon + dLon;
/* 123 */     return new GPS(mgLat, mgLon);
/*     */   }
/*     */ 
/*     */   
/*     */   public static double transformLat(double x, double y) {
/* 128 */     double ret = -100.0D + 2.0D * x + 3.0D * y + 0.2D * y * y + 0.1D * x * y + 0.2D * Math.sqrt(Math.abs(x));
/* 129 */     ret += (20.0D * Math.sin(6.0D * x * pi) + 20.0D * Math.sin(2.0D * x * pi)) * 2.0D / 3.0D;
/* 130 */     ret += (20.0D * Math.sin(y * pi) + 40.0D * Math.sin(y / 3.0D * pi)) * 2.0D / 3.0D;
/* 131 */     ret += (160.0D * Math.sin(y / 12.0D * pi) + 320.0D * Math.sin(y * pi / 30.0D)) * 2.0D / 3.0D;
/* 132 */     return ret;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static double transformLon(double x, double y) {
/* 138 */     double ret = 300.0D + x + 2.0D * y + 0.1D * x * x + 0.1D * x * y + 0.1D * Math.sqrt(Math.abs(x));
/* 139 */     ret += (20.0D * Math.sin(6.0D * x * pi) + 20.0D * Math.sin(2.0D * x * pi)) * 2.0D / 3.0D;
/* 140 */     ret += (20.0D * Math.sin(x * pi) + 40.0D * Math.sin(x / 3.0D * pi)) * 2.0D / 3.0D;
/* 141 */     ret += (150.0D * Math.sin(x / 12.0D * pi) + 300.0D * Math.sin(x / 30.0D * pi)) * 2.0D / 3.0D;
/*     */     
/* 143 */     return ret;
/*     */   }
/*     */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\imp\\utils\GPSConverterUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */