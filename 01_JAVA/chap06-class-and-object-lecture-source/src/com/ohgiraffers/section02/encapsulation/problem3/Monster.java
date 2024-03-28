package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

//    String name;
//    int hp;
//
//    public void setinfo(String info){
//        this.name = info;
//    }
//
//    public void setHp(int hp) {
//
//        if(hp > 0) {
//
//            this.hp = hp;
//        }else{
//            this.hp = 0;
//        }
//    }
//
//    public  String getInfo(){
//        return "몬스터의 이름은 " + this.name +"이고몸무게는 " +this.hp+"kg입니다";
//    }

    String kinds;
    int hp;

    public void setinfo(String info){
        this.kinds = info;
    }

    public void setHp(int hp) {

        if(hp > 0) {

            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }

    public  String getInfo(){
        return "몬스터의 이름은 " + this.kinds +"이고몸무게는 " +this.hp+"kg입니다";
    }
}
