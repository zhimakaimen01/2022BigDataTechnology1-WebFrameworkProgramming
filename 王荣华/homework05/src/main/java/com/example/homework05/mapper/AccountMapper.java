package com.example.homework05.mapper;

import com.example.homework05.model.Account;

import javax.management.relation.Role;
import java.util.List;

public interface AccountMapper {
    // 通过用户名获取账户信息
    Account getAccountByUsername(String username);

    // 通过用户id获取账户角色信息
    List<Role> getAccountRoleById(Integer id);
}
