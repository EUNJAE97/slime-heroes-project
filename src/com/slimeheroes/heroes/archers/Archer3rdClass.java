package com.slimeheroes.heroes.archers;

public class Archer3rdClass extends Archer {
    @Override
    public void attak() { // 기본공격 데미지 10
        System.out.println(" (이)가 몬스터에게 화살을 쏩니다. 딱!");
    }

    @Override
    public void avoid() {
        System.out.println(" (이)가 몬스터의 공격을 회피합니다. 슈슉~ (O_<)");

    }


    public void skill1() { // 더블 에로우 데미지 20
        System.out.println("더블 에로우를 시전합니다. 따 닥!");
    }
    public void skill2() {// 헤드샷 데미지 50
        System.out.println(" (이)가 헤드샷을 시전합니다. 머리 조준! 헤드샷!");
    }
    public void skill3() { // 스나이핑 데미지 100
        System.out.println(" (이)가 스나이핑을 시전합니다. 숨참고.. 팡!!!");
    }
}