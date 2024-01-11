package com.slimeheroes.heroes.archers;

import com.slimeheroes.heroes.HeroesImpl;

public class Archer implements HeroesImpl {
    @Override
    public void attak() {
        System.out.println(" (이)가 몬스터에게 화살을 쏩니다. 딱!");
    }

    @Override
    public void avoid() {
        System.out.println(" (이)가 몬스터의 공격을 회피합니다. 슈슉~ (O_<)/");

    }
    public void skill1() {
        System.out.println(" (이)가 더블 에로우를 시전합니다. 따 닥!");
    }
}
