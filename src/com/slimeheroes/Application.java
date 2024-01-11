package com.slimeheroes;

import com.slimeheroes.heroes.Adventurer;
import com.slimeheroes.heroes.archers.Archer2ndClass;
import com.slimeheroes.heroes.archers.Archer3rdClass;
import com.slimeheroes.heroes.magicians.Magician;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /* 1. 게임 시작하면서 스토리 설명
         * 2. 이름 스캐너로 받기.*/

        System.out.println("게임이 시작됩니다.");

        System.out.println("모험가의 이름을 지어주세요 : ");

        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("스토리 - 대충 마을이 슬라임들의 공격을 받아 위험한 상황이다. 그때 어느 모험ㄴ가 나타나 마을을 위해 나선다.");
        System.out.println("모험가 " + userName + "(이)가 마을을 지키기 위해 마을 사람들의 환호를 받으며 슬라임 왕국으로 떠납니다!");
        System.out.println("뚜벅 뚜벅...");

        while (true) {
            System.out.println("Σ(°ロ°) !?!!");
            System.out.println("앗! 갑자기 슬라임이 나타났다!!! ");
            // 몬스터가 나타났을때 몬스터 음성 문자로 출력 ..ex 피카츄 : (삐까삐까!) 몬스터 클래스에 입력 ?
            System.out.println("전투를 준비하자!");
            System.out.println("1.몽둥이 휘두르기!!  2.공격 피해버리기!!");
            // 행동 선택지 메소드로 만들어보기
        }

//            Adventurer adventurer = new Adventurer();
//            System.out.print(userName);
//            adventurer.attak();


    }
}
