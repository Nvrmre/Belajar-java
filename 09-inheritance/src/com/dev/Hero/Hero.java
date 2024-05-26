package com.dev.Hero;

public class Hero {
    public String name;
    public String role;
    public String ability;
    public String SkillName;

    public String weapon;

    public double baseDamage;
    public Double hp;

    public void showHero() {

        System.out.println("Name Hero\t: " + this.name);
        System.out.println("Role \t: " + this.role);
        System.out.println("Ability\t: " + this.ability);
        System.out.println("Hp \t: " + this.hp);
        System.out.println("Weapon \t: " + this.weapon);
        System.out.println("Damage \t: " + this.baseDamage);

    }

}
