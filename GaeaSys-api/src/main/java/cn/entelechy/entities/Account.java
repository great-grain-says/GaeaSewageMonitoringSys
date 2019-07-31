package cn.entelechy.entities;

public class Account {
    private Integer id;
    private String account_name;
    private String account_pwd;
    private String account_salt;
    private String account_perms;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_pwd() {
        return account_pwd;
    }

    public void setAccount_pwd(String account_pwd) {
        this.account_pwd = account_pwd;
    }

    public String getAccount_salt() {
        return account_salt;
    }

    public void setAccount_salt(String account_salt) {
        this.account_salt = account_salt;
    }

    public String getAccount_perms() {
        return account_perms;
    }

    public void setAccount_perms(String account_perms) {
        this.account_perms = account_perms;
    }
}
