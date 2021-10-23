/*    */ package com.impi.service.impl;

/*    */
/*    */ import com.github.pagehelper.PageHelper;
/*    */ import com.github.pagehelper.PageInfo;
/*    */ import com.impi.domain.User;
/*    */ import com.impi.mapper.UserMapper;
/*    */ import com.impi.service.UserService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ import org.springframework.transaction.annotation.Propagation;
/*    */ import org.springframework.transaction.annotation.Transactional;
/*    */ 
/*    */ 
/*    */ @Service
/*    */ @Transactional
/*    */ public class UserSeriveImpl
/*    */   implements UserService
/*    */ {
/*    */   @Autowired
/*    */   private UserMapper userMapper;
/*    */   
/*    */   @Transactional(propagation = Propagation.SUPPORTS)
/*    */   public User login(String username, String password) {
/* 25 */     User select = this.userMapper.login(username, password);
/* 26 */     if (select != null) {
/* 27 */       return select;
/*    */     }
/* 29 */     throw new RuntimeException("登录失败");
/*    */   }
/*    */ 
/*    */   
/*    */   public PageInfo<User> findAllByPage(Integer pageNum, Integer pageSize) {
/* 34 */     PageHelper.startPage(pageNum.intValue(), pageSize.intValue());
/* 35 */     List<User> users = this.userMapper.selectAllUser();
/* 36 */     PageInfo<User> pageInfo = new PageInfo(users);
/* 37 */     return pageInfo;
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\impl\UserSeriveImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */