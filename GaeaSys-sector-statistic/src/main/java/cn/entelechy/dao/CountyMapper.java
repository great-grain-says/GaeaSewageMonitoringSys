
package cn.entelechy.dao;


import cn.entelechy.entities.County;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CountyMapper {


    public List<County> getCounty(@Param("id") Integer id);


}
