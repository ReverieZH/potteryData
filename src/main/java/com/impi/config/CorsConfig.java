package com.impi.config;

 import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.Configuration;
/*    */ import org.springframework.web.cors.CorsConfiguration;
/*    */ import org.springframework.web.cors.CorsConfigurationSource;
/*    */ import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
/*    */ import org.springframework.web.filter.CorsFilter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Configuration
/*    */ public class CorsConfig
/*    */ {
/*    */   private CorsConfiguration buildConfig() {
/* 18 */     CorsConfiguration corsConfiguration = new CorsConfiguration();
/* 19 */     corsConfiguration.addAllowedOrigin("*");
/* 20 */     corsConfiguration.addAllowedHeader("*");
/* 21 */     corsConfiguration.addAllowedMethod("*");
/* 22 */     return corsConfiguration;
/*    */   }
/*    */   @Bean
/*    */   public CorsFilter corsFilter() {
/* 26 */     UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
/* 27 */     source.registerCorsConfiguration("/**", buildConfig());
/* 28 */     return new CorsFilter((CorsConfigurationSource)source);
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\config\CorsConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */