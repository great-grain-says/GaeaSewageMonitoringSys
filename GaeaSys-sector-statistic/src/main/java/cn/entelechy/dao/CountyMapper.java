
package cn.entelechy.dao;


import cn.entelechy.entities.County;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CountyMapper {


    public County getCounty(@Param("id") Integer id);


}
