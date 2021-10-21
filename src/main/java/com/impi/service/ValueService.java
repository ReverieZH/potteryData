package com.impi.service

-INF.classes.com.impi.service;

import com.impi.domain.Tvalue;
import java.util.List;

public interface ValueService {
  List<Tvalue> selectAll();
  
  List<Tvalue> findAllByPage(int paramInt1, int paramInt2);
  
  Tvalue selectByKey(Integer paramInteger);
  
  int insert(Tvalue paramTvalue);
  
  int update(Tvalue paramTvalue);
  
  int delete(Integer paramInteger);
  
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\ValueService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */