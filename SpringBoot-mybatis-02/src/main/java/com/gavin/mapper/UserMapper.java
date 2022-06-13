package com.gavin.mapper;

import com.gavin.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gavin
 * @date 2021/5/18 11:18
 */

@Mapper
@Repository
public interface UserMapper {

    public List<User> findUserAll();

    @Select("select * from user where userid=#{id}")
    public User findById(Integer id);

}
