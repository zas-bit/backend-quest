package com.lq.model;

import com.lq.model.User;

import java.util.HashSet;

public class UserManager {
    public static void main(String[] args) {
        User user1 = new User(1L, "zas", "zas@example.com");
        User user2 = new User(1L, "zas_bit", "zas@example.com"); // 相同ID，不同名字
        System.out.println(user1); // 展示 toString()
        System.out.println("user1 equals user2? " + user1.equals(user2)); // 应输出 true，因为ID相同
        System.out.println("Welcome: " + user1.generateWelcomeMessage());
        // 测试在 HashSet 中的行为（依赖 hashCode & equals）
        HashSet<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2); // 由于equals判断相同，此元素不会被添加
        System.out.println("Set size (should be 1): " + userSet.size()); // 应为 1
    }
}

