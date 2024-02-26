package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Александр";
        post.passport = "1206 № 123465";
        post.patronymic = "Викторович";
        post.phone = "+7 (988)-595-08-85";
        post.surname = "Грешников";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 8;
        post.birthday.year = 1985;
    }
}