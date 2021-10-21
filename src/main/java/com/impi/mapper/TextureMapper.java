package com.impi.mapper

-INF.classes.com.impi.mapper;

import com.impi.domain.Texture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Mapper
@Repository
public interface TextureMapper extends Mapper<Texture> {
  @Select({"select count(*) from Texture"})
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\mapper\TextureMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */