package com.impi.service;


import com.impi.domain.Culture;
import java.util.List;

public interface CultureService {
  List<Culture> selectAll();
  
  List<Culture> findAllByPage(int paramInt1, int paramInt2);
  
  Culture selectByKey(Integer paramInteger);
  
  int insert(Culture paramCulture);
  
  int update(Culture paramCulture);
  
  int delete(Integer paramInteger);
  
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\CultureService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */