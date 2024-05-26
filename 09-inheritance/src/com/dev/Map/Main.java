package com.dev.Map;

import com.dev.Hero.Role.Mage;
import com.dev.Hero.Role.Tank;
import com.dev.Hero.Role.Warrior;
import com.dev.Hero.Role.Assasin;
import com.dev.Player.Player;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Gojo santoso";

        Mage mage = new Mage();
        mage.name = "Lulubis";
        mage.weapon = "Tongkat idrus";
        mage.baseDamage = 30.00;
        mage.ability = "win the fight";
        mage.hp = 2340.00;
        mage.role = "mage";
        mage.showHero();
        mage.magicDamage();
        player.display();


        Assasin assasin = new Assasin();
        assasin.name = "Rexalina";
        assasin.weapon = "Elucidator";
        assasin.baseDamage = 90;
        assasin.SkillName = " Long Time";
        


    }
}
