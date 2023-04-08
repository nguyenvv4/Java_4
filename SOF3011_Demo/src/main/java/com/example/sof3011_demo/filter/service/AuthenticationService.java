package com.example.sof3011_demo.filter.service;

import com.example.sof3011_demo.filter.entity.Account;
import com.example.sof3011_demo.filter.repository.UserRepository;

public class AuthenticationService {

    private UserRepository userRepository = new UserRepository();

    public Account authenticate(String username, String password) {
        // 1. Kiểm tra tài khoản tồn tại
        Account account = userRepository.getByUsername(username);
        if (account == null) { // NULL là không tồn tại
            return null; // Không hợp lệ
        }

        // 2. Kiểm tra mật khẩu trùng khớp
        // Nếu không khớp thì trả về không hợp lệ
        if(!account.getPassword().equals(password)) {
            return null;
        }

        return account; // OKKKK
    }
}
