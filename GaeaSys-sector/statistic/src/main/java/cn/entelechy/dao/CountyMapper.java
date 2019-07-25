
package cn.entelechy.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import cn.entelechy.entities.County;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountyMapper {


    public County getCounty(@Param("id") Integer id);


}
