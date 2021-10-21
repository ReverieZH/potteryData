package com.impi.mapper

-INF.classes.com.impi.mapper;

import com.impi.domain.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Mapper
@Repository
public interface UserMapper extends Mapper<User> {
  @Select({"select count(*) from User"})
  int getCount();
  
  @Select({"select a.* ,b.* FROM Cpottery.User a natural join Cpottery.Role b where a.username=#{username} and a.password=#{password} and a.roleid=b.roleid"})
  @Results({@Result(id = true, column = "id", property = "id"), @Result(column = "username", property = "username"), @Result(column = "password", property = "password"), @Result(column = "roleid", property = "role.roleid"), @Result(column = "roleName", property = "role.roleName"), @Result(column = "description", property = "role.description"), @Result(column = "pottery", property = "role.pottery"), @Result(column = "addPottery", property = "role.addPottery"), @Result(column = "editPottery", property = "role.editPottery"), @Result(column = "deletePottery", property = "role.deletePottery"), @Result(column = "checkPottery", property = "role.checkPottery"), @Result(column = "classifi", property = "role.classifi"), @Result(column = "addClassifi", property = "role.addClassifi"), @Result(column = "editClassifi", property = "role.editClassifi"), @Result(column = "checkClassifi", property = "role.checkClassifi"), @Result(column = "deleteClassifi", property = "role.deleteClassifi"), @Result(column = "culture", property = "role.culture"), @Result(column = "addCulture", property = "role.addCulture"), @Result(column = "editCulture", property = "role.editCulture"), @Result(column = "deleteCulture", property = "role.deleteCulture"), @Result(column = "checkCulture", property = "role.checkCulture"), @Result(column = "texture", property = "role.texture"), @Result(column = "addTexture", property = "role.addTexture"), @Result(column = "editTexture", property = "role.editTexture"), @Result(column = "deleteTexture", property = "role.deleteTexture"), @Result(column = "checkTexture", property = "role.checkTexture"), @Result(column = "tvalue", property = "role.tvalue"), @Result(column = "addTvalue", property = "role.addTvalue"), @Result(column = "editTvalue", property = "role.editTvalue"), @Result(column = "deleteTvalue", property = "role.deleteTvalue"), @Result(column = "checkTvalue", property = "role.checkTvalue"), @Result(column = "roleCol", property = "role.roleCol"), @Result(column = "logCheck", property = "role.logCheck"), @Result(column = "userManage", property = "role.userManage")})
  User login(@Param("username") String paramString1, @Param("password") String paramString2);
  
  @Select({"select a.* ,b.roleName FROM Cpottery.User a natural join Cpottery.Role b where a.roleid=b.roleid"})
  @Results({@Result(id = true, column = "id", property = "id"), @Result(column = "username", property = "username"), @Result(column = "password", property = "password"), @Result(column = "roleid", property = "roleid"), @Result(column = "roleName", property = "roleName")})
  List<User> selectAllUser();
}


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\mapper\UserMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */