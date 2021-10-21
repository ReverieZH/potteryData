 package com.impi.config;


import com.alibaba.druid.pool.DruidDataSource;
/*    */ import com.alibaba.druid.support.http.StatViewServlet;
/*    */ import com.alibaba.druid.support.http.WebStatFilter;
/*    */ import java.util.Arrays;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.servlet.Filter;
/*    */ import javax.servlet.Servlet;
/*    */ import javax.sql.DataSource;
/*    */ import org.springframework.boot.context.properties.ConfigurationProperties;
/*    */ import org.springframework.boot.web.servlet.FilterRegistrationBean;
/*    */ import org.springframework.boot.web.servlet.ServletRegistrationBean;
/*    */ import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.Configuration;
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
/*    */ @Configuration
/*    */ public class DruidConfig
/*    */ {
/*    */   @ConfigurationProperties(prefix = "spring.datasource")
/*    */   @Bean
/*    */   public DataSource druidDataSource() {
/* 33 */     return (DataSource)new DruidDataSource();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Bean
/*    */   public ServletRegistrationBean statViewServlet() {
/* 40 */     ServletRegistrationBean bean = new ServletRegistrationBean((Servlet)new StatViewServlet(), new String[] { "/druid/*" });
             Map<String, String> initParams = new HashMap<>();
/* 46 */     initParams.put("loginUsername", "admin");
/* 47 */     initParams.put("loginPassword", "123456");
/* 53 */     initParams.put("allow", "");
/* 59 */     bean.setInitParameters(initParams);
/* 60 */     return bean;
/*    */   }
/*    */   @Bean
/*    */   public FilterRegistrationBean webStatFilter() {
/* 67 */     FilterRegistrationBean bean = new FilterRegistrationBean();
/* 68 */     bean.setFilter((Filter)new WebStatFilter());
/* 72 */     Map<String, String> initParams = new HashMap<>();
/* 73 */     initParams.put("exclusions", "*.js,*.css,/druid/*,/jdbc/*");
/* 74 */     bean.setInitParameters(initParams);
/* 78 */     bean.setUrlPatterns(Arrays.asList(new String[] { "/*" }));
/* 81 */     return bean;
/*    */   }
/*    */ }


