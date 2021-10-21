package com.impi.service

-INF.classes.com.impi.service;

import com.impi.domain.Pottery;
import java.util.List;

public interface PotteryService {
  List<Pottery> selectAll();
  
  List<Pottery> findAllByPage(int paramInt1, int paramInt2);
  
  Pottery selectByKey(Integer paramInteger);
  
  int insert(Pottery paramPottery);
  
  int update(Pottery paramPottery);
  
  int delete(Integer paramInteger);
  
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\PotteryService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */