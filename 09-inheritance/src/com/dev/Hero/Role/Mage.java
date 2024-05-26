package com.dev.Hero.Role;

import com.dev.Hero.Hero;

public class Mage extends Hero {
    double MageDamage;
    
    public void magicDamage() {
        double damage = this.baseDamage;
       System.out.println(damage + " magic damage");
}

}

