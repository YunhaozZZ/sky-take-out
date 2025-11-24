package com.sky.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class BCryptUtil {

    // 加密
    public static String encrypt(String plainText) {
        return BCrypt.hashpw(plainText, BCrypt.gensalt());
    }

    // 校验
    public static boolean check(String plainText, String hashed) {
        return BCrypt.checkpw(plainText, hashed);
    }
}
