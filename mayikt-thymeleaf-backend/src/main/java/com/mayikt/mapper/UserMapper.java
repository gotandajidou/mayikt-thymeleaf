package com.mayikt.mapper;

import com.mayikt.entity.UserEntity;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
   @Insert("INSERT into users values (null,#{userName}, #{age});")

    int insertuser(@Param("userName") String userName,@Param("age") Integer age);
   @Select("SELECT id as id,name as userName ,age as age from users")
   UserEntity selectByUserId(@Param("id") Integer id);
}

