/*    */ package com.impi.interceptors

-INF.classes.com.impi.interceptors;
/*    */ 
/*    */ import com.auth0.jwt.exceptions.AlgorithmMismatchException;
/*    */ import com.auth0.jwt.exceptions.SignatureVerificationException;
/*    */ import com.auth0.jwt.exceptions.TokenExpiredException;
/*    */ import com.fasterxml.jackson.databind.ObjectMapper;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.springframework.web.servlet.HandlerInterceptor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JWTInterceptor
/*    */   implements HandlerInterceptor
/*    */ {
/*    */   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
/* 21 */     Map<String, Object> map = new HashMap<>();
/* 22 */     String token = request.getHeader("token");
/* 23 */     System.out.println("header:" + token);
/*    */     
/*    */     try {
/* 26 */       return true;
/*    */     
/*    */     }
/* 29 */     catch (SignatureVerificationException e) {
/* 30 */       e.printStackTrace();
/* 31 */       map.put("msg", "无效签名");
/* 32 */     } catch (TokenExpiredException e) {
/* 33 */       e.printStackTrace();
/* 34 */       map.put("msg", "token过期");
/* 35 */     } catch (AlgorithmMismatchException e) {
/* 36 */       e.printStackTrace();
/* 37 */       map.put("msg", "token算法不一致");
/* 38 */     } catch (Exception e) {
/* 39 */       e.printStackTrace();
/* 40 */       map.put("msg", "token无效");
/*    */     } 
/* 42 */     map.put("issuccess", Boolean.valueOf(false));
/* 43 */     String json = (new ObjectMapper()).writeValueAsString(map);
/* 44 */     response.setContentType("application/json;charset=UTF-8");
/* 45 */     response.getWriter().println(json);
/* 46 */     return false;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\interceptors\JWTInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */