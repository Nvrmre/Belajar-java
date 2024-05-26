package com.dev;

// import scanner dari java utility
import java.util.Scanner;

// membuat class player 
class Player {
    String Nickname;
    private int level = 1;
    private int exp = 0;
    private int hp = 100;
    Mission Mission;

    // membuat constructor
    Player() {
        this.Nickname = Nickname;

    }

    // getter
    public int getlevel() {
        return level;
    }

    public int getexp() {
        return exp += 100;
    }

    public int gethp() {
        return hp;
    }

    // setter
    public void setLevel() {

    }

}

// membuat class misi
class Mission {
    String dificult;
    String missionName;

    Mission() {

    }
}

// class monster
class Monster {

    Monster() {

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player = new Player();
        int selectrole;
        System.out.print("Enter Nickname : ");
        player.Nickname = input.nextLine();
        System.out.print("\n");
        System.out.println("1 Mage");
        System.out.println("2 Assasin");
        System.out.println("3 Archer");
        System.out.println("Select Your character role");
        selectrole = input.nextInt();

        switch (selectrole) {
            case 1:
                System.out.println("Your is magician");
                break;
            case 2:
                System.out.println("Your is silent assasin");
                break;
            case 3:
                System.out.println("Your is the best archer");
                break;
            default:
                break;
        }

    }

}