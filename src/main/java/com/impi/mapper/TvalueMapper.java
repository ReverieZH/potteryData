package com.impi.mapper

-INF.classes.com.impi.mapper;

import com.impi.domain.Tvalue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Mapper
@Repository
public interface TvalueMapper extends Mapper<Tvalue> {
  @Select({"select count(*) from Tvalue"})
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\mapper\TvalueMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */