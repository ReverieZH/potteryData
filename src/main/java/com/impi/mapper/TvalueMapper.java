package com.impi.mapper;


import com.impi.domain.Tvalue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TvalueMapper extends tk.mybatis.mapper.common.Mapper<Tvalue> {
  @Select({"select count(*) from Tvalue"})
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\mapper\TvalueMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */