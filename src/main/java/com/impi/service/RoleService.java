package com.impi.service

-INF.classes.com.impi.service;

import com.github.pagehelper.PageInfo;
import com.impi.domain.Role;
import java.util.List;

public interface RoleService {
  List<Role> selectAll();
  
  PageInfo<Role> findAllByPage(int paramInt1, int paramInt2);
  
  Role selectByKey(Integer paramInteger);
  
  int insert(Role paramRole);
  
  int update(Role paramRole);
  
  int delete(Integer paramInteger);
  
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\RoleService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */