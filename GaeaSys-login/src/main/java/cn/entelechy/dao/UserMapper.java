package cn.entelechy.dao;


import cn.entelechy.entities.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    public Account findByName(String account_name);
    Account findById(Integer id);
}
