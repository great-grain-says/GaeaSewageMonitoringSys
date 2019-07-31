package cn.entelechy.Service;


import cn.entelechy.entities.Account;

public interface UserService {
    public Account findByname(String name);
    Account findById(Integer id);
}
