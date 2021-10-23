package com.impi.mapper;


import com.impi.domain.Culture;
import com.impi.domain.Pottery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PotteryMapper extends tk.mybatis.mapper.common.Mapper<Pottery> {
  @Select({"select count(*) from pottery"})
  int getCount();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\mapper\PotteryMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */