package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;
    private static final int MIN_COUNT = 0;
    private static final int MAX_COUNT = 100;
    private static final int count = 20;


    public Post[] search(int ownerId, String domain, String query, boolean ownersOnly, int count) {
        if (count < MIN_COUNT) {
            System.out.println("Количество постов должно быть в диапазоне: 0-100");
        }
        if (count > MAX_COUNT) {
            System.out.println("Количество постов должно быть в диапазоне: 0-100");
        }
        return null;
    }

    public void delete(int ownerId, int postId) {
    }
}

