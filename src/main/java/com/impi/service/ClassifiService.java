package com.impi.service;


import com.impi.domain.Classifi;
import java.util.List;

public interface ClassifiService {
  List<Classifi> selectAll();
  
  List<Classifi> findAllByPage(int paramInt1, int paramInt2);
  
  Classifi selectByKey(Integer paramInteger);
  
  int insert(Classifi paramClassifi);
  
  int update(Classifi paramClassifi);
  
  int delete(Integer paramInteger);
  
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\ClassifiService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */