package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //音楽のジャンルを格納
        List<String> music = List.of("rock", "jazz", "classic", "pops");
        
        music.stream()
                //'o'が含まれる音楽のジャンルを抽出
                .filter(name -> name.contains("o"))
                //大文字に変換
                .map(name -> name.toUpperCase())
                //変換したデータを出力
                .forEach(name -> System.out.println(name));
    }
}

