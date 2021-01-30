package com.smatrfoxpro.test.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public List<String> words() {
        List<String> words = new ArrayList<>();
        words.add("Амстердам");
        words.add("Воронеж");
        words.add("Барселона");
        words.add("Гамбург");
        words.add("Днепр");
        words.add("Евпатория");
        words.add("Житомир");
        words.add("Зеленоград");
        words.add("Ивано-Франковск");
        words.add("Йоханнесбург");
        words.add("Казань");
        words.add("Лас-Вегас");
        words.add("Магадан");
        words.add("Новосибирск");
        words.add("Омск");
        words.add("Павлоград");
        words.add("Рим");
        words.add("Самара");
        words.add("Тверь");
        words.add("Умань");
        words.add("Филадельфия");
        words.add("Харьков");
        words.add("Цзинин");
        words.add("Челябинск");
        words.add("Шанхай");
        words.add("Щёлково");
        words.add("Ыгдыр");
        words.add("Эдинбург");
        words.add("Юрмала");
        words.add("Якутск");

        return words;
    }

}
