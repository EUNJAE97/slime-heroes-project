package com.slimeheroes;

import com.slimeheroes.heroes.Adventurer;
import com.slimeheroes.heroes.magicians.Magician;

import java.util.Scanner;

public class Application {
    public String userName;

    public static void main(String[] args) {
        /* 1. 게임 시작하면서 스토리 설명
        * 2. 이름 스캐너로 받기.*/

        System.out.println("게임이 시작됩니다.");

        System.out.println("모험가의 이름을 지어주세요 : ");
        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        Adventurer adventurer = new Adventurer();
        adventurer.attak(userName);
    }
}
