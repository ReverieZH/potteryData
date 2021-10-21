/*    */ package com.impi.service.impl

-INF.classes.com.impi.service.impl;
/*    */ 
/*    */ import com.github.pagehelper.PageHelper;
/*    */ import com.github.pagehelper.PageInfo;
/*    */ import com.impi.domain.Role;
/*    */ import com.impi.mapper.RoleMapper;
/*    */ import com.impi.service.RoleService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ @Service
/*    */ public class RoleServiceImpl
/*    */   implements RoleService
/*    */ {
/*    */   @Autowired
/*    */   private RoleMapper roleMapper;
/*    */   
/*    */   public List<Role> selectAll() {
/* 20 */     return this.roleMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public PageInfo<Role> findAllByPage(int pageNum, int pageSize) {
/* 25 */     PageHelper.startPage(pageNum, pageSize);
/* 26 */     List<Role> roles = this.roleMapper.selectAll();
/* 27 */     PageInfo<Role> pageInfo = new PageInfo(roles);
/* 28 */     return pageInfo;
/*    */   }
/*    */ 
/*    */   
/*    */   public Role selectByKey(Integer code) {
/* 33 */     return (Role)this.roleMapper.selectByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int insert(Role role) {
/* 38 */     return this.roleMapper.insert(role);
/*    */   }
/*    */ 
/*    */   
/*    */   public int update(Role role) {
/* 43 */     return this.roleMapper.updateByPrimaryKeySelective(role);
/*    */   }
/*    */ 
/*    */   
/*    */   public int delete(Integer code) {
/* 48 */     return this.roleMapper.deleteByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCount() {
/* 53 */     return this.roleMapper.getCount();
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\impl\RoleServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */