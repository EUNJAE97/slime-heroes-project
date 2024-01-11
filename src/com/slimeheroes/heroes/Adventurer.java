package com.slimeheroes.heroes;

public class Adventurer implements HeroesImpl {
    public int attak(String userName) {
        /* 1. 출력문 (몽둥이를 휘두릅니다.)
        * 2. damage 변수에 값을 담기.
        * 3. 값을 리턴하기. */
        System.out.println(userName + "가(이) 몽둥이를 휘두릅니다.");
    }

    @Override
    public void attak() {

    }

    @Override
    public void avoid() {

    }
}
