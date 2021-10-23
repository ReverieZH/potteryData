package com.impi.service;


import com.github.pagehelper.PageInfo;
import com.impi.domain.User;

public interface UserService {
  User login(String paramString1, String paramString2);
  
  PageInfo<User> findAllByPage(Integer paramInteger1, Integer paramInteger2);
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\UserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */