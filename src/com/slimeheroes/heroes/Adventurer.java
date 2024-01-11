package com.slimeheroes.heroes;

public class Adventurer implements HeroesImpl {

    @Override
    public void attak() { // 데미지 10
        System.out.println(" (이)가 몽둥이를 휘두룹니다. 부웅~");

    }

    @Override
    public void avoid() {
        System.out.println(" (이)가 몬스터의 공격을 회피합니다. 슈슉~ (O_<)/");
    }
}
