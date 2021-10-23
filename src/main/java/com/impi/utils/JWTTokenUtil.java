/*    */ package com.impi.utils;

/*    */
/*    */ import com.auth0.jwt.JWT;
/*    */ import com.auth0.jwt.JWTCreator;
/*    */ import com.auth0.jwt.JWTVerifier;
/*    */ import com.auth0.jwt.algorithms.Algorithm;
/*    */ import com.auth0.jwt.interfaces.DecodedJWT;
/*    */ import java.sql.Date;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JWTTokenUtil
/*    */ {
/*    */   private static final long EXPIRE_DATE = 180000000L;
/*    */   private static final String TOKEN_SECRET = "ZCfasfhuaUUHufguGuwu2020BQWE";
/*    */   
/*    */   public static String token(String username, String password) {
/* 21 */     String token = "";
/*    */     
/*    */     try {
/* 24 */       Date date = new Date(System.currentTimeMillis() + 180000000L);
/*    */       
/* 26 */       Algorithm algorithm = Algorithm.HMAC256("ZCfasfhuaUUHufguGuwu2020BQWE");
/*    */       
/* 28 */       Map<String, Object> header = new HashMap<>();
/* 29 */       header.put("typ", "JWT");
/* 30 */       header.put("alg", "HS256");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 36 */       token = JWT.create().withHeader(header).withClaim("username", username).withClaim("password", password).withExpiresAt(date).sign(algorithm);
/* 37 */     } catch (Exception e) {
/* 38 */       e.printStackTrace();
/* 39 */       return null;
/*    */     } 
/* 41 */     return token;
/*    */   }
/*    */   
/*    */   public static String token(Map<String, String> map) {
/* 45 */     String token = "";
/*    */     
/*    */     try {
/* 48 */       Date date = new Date(System.currentTimeMillis() + 180000000L);
/*    */       
/* 50 */       Algorithm algorithm = Algorithm.HMAC256("ZCfasfhuaUUHufguGuwu2020BQWE");
/*    */       
/* 52 */       Map<String, Object> header = new HashMap<>();
/* 53 */       header.put("typ", "JWT");
/* 54 */       header.put("alg", "HS256");
/*    */       
/* 56 */       JWTCreator.Builder builder = JWT.create();
/* 57 */       map.forEach((k, v) -> builder.withClaim(k, v));
/*    */ 
/*    */ 
/*    */       
/* 61 */       token = builder.withExpiresAt(date).sign(algorithm);
/* 62 */     } catch (Exception e) {
/* 63 */       e.printStackTrace();
/* 64 */       return null;
/*    */     } 
/* 66 */     return token;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static DecodedJWT verify(String token) {
/* 90 */     Algorithm algorithm = Algorithm.HMAC256("ZCfasfhuaUUHufguGuwu2020BQWE");
/* 91 */     JWTVerifier verifier = JWT.require(algorithm).build();
/* 92 */     DecodedJWT jwt = verifier.verify(token);
/* 93 */     return jwt;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\imp\\utils\JWTTokenUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */