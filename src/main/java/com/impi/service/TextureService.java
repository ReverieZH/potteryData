package com.impi.service

-INF.classes.com.impi.service;

import com.impi.domain.Texture;
import java.util.List;

public interface TextureService {
  List<Texture> selectAll();
  
  List<Texture> findAllByPage(int paramInt1, int paramInt2);
  
  Texture selectByKey(Integer paramInteger);
  
  int insert(Texture paramTexture);
  
  int update(Texture paramTexture);
  
  int delete(Integer paramInteger);
  
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\TextureService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */