package com.example.sof3011_demo.filter.repository;

import com.example.sof3011_demo.filter.entity.Account;
import com.example.sof3011_demo.filter.entity.AccountRole;

public class UserRepository {

    // fake có 2 tài khoản
    // thực tế sẽ có 2 bảng account và role có quan hệ với nhau
    private static Account[] accounts = new Account[]{
            new Account("user", "123", AccountRole.USER),
            new Account("admin", "321", AccountRole.ADMIN)
    };

    public Account getByUsername(String username) {
        // Duyệt ds
        for (Account account : accounts) {
            // Nếu tên tài khoản trùng với giá trị tìm kiếm
            if (account.getUsername().equals(username)) {
                return account; // thì trả về Tài khoản
            }
        }

        // Không tìm thấy
        return null;
    }


}
