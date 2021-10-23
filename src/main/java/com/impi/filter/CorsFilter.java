/*    */ package com.impi.filter;

/*    */
/*    */ import java.io.IOException;
/*    */ import javax.servlet.Filter;
/*    */ import javax.servlet.FilterChain;
/*    */ import javax.servlet.FilterConfig;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.commons.lang.StringUtils;
/*    */ 
/*    */ 
/*    */ public class CorsFilter
/*    */   implements Filter
/*    */ {
/*    */   public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
/* 19 */     HttpServletResponse response = (HttpServletResponse)res;
/* 20 */     HttpServletRequest request = (HttpServletRequest)req;
/*    */ 
/*    */     
/* 23 */     String origin = request.getHeader("Origin");
/* 24 */     if (StringUtils.isNotBlank(origin)) {
/* 25 */       response.setHeader("Access-Control-Allow-Origin", origin);
/*    */     }
/*    */ 
/*    */     
/* 29 */     String headers = request.getHeader("Access-Control-Request-Headers");
/* 30 */     if (StringUtils.isNotBlank(headers)) {
/* 31 */       response.setHeader("Access-Control-Allow-Headers", headers);
/* 32 */       response.setHeader("Access-Control-Expose-Headers", headers);
/*    */     } 
/*    */ 
/*    */     
/* 36 */     response.setHeader("Access-Control-Allow-Methods", "*");
/*    */     
/* 38 */     response.setHeader("Access-Control-Max-Age", "3600");
/*    */     
/* 40 */     response.setHeader("Access-Control-Allow-Credentials", "true");
/*    */     
/* 42 */     chain.doFilter((ServletRequest)request, (ServletResponse)response);
/*    */   }
/*    */   
/*    */   public void init(FilterConfig filterConfig) {}
/*    */   
/*    */   public void destroy() {}
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\filter\CorsFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */