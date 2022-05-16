package com.company;

public class Main {

    public static void main(String[] args) {



        Shark Shark=new Shark();
        Shark.attack();
        Shark[]sharks=new Shark[23];

        Turtle Turtle=new Turtle();
        Turtle.swim();
        Turtle[] turtle=new Turtle[21];

        Eagle Eagle=new Eagle();
        Eagle.fly();
        Eagle[]eagle=new Eagle[20];

        Animal[] argei={Shark,Turtle,Eagle};

        if (Shark instanceof Animal){
            System.out.println();
        }else {
            System.out.println(false);
        }
        if (Turtle instanceof Animal){
            System.out.println();
            }else {
            System.out.println(false);
        }
        if (Eagle instanceof Animal){
            System.out.println();
        }else {
            System.out.println(false);
        }



    }
}
