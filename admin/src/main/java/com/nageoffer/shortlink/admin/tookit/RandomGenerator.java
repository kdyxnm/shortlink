package com.nageoffer.shortlink.admin.tookit;

import java.security.SecureRandom;

public class RandomGenerator {

    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();
    private static final int RANDOM_GID_LENGTH = 6;

    /**
     * 生成指定长度的随机字符串
     * @param length 长度
     * @return 随机字符串
     */
    public static String generateRandomString() {
        return generateRandomString(RANDOM_GID_LENGTH);
    }

    /**
     * 生成指定长度的随机字符串
     * @param length 长度
     * @return 随机字符串
     */
    public static String generateRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(CHARACTERS.charAt(SECURE_RANDOM.nextInt(CHARACTERS.length())));
        }
        return stringBuilder.toString();
    }
}
