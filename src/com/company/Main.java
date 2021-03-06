package com.company;


public class Main {
    public Hero[] createHero() {

        Hero hero1 = new Hero(450, 38, "Can dodge.");

        Hero hero2 = new Hero(45, 380);

        Hero hero3 = new Hero(420, 40, "Can stun.");

        Hero [] array = new Hero[]{hero1, hero2, hero3};

        return array;
    }

    public static void main(String[] args) {
        Boss boss1 = new Boss(60, 800, "strength");
        System.out.println("Boss statistics:" + "\nHealth: " + boss1.getBossHealth() + "\nDamage: "
                + boss1.getBossDamage() + "\nDefense type: " + boss1.getBossDefenseType() + " \n");

        Main main = new Main();
        Hero[] hero = main.createHero();

        for (int i = 0; i < main.createHero().length; i++) {
            if (hero[i].getHeroSkill() == null)
                System.out.println("Hero health : " + hero[i].getHeroHealth() + " , damage : " + hero[i].getHeroDamage() + " skiils : " + "Haven't skills");
            else
                System.out.println("Hero health : " + hero[i].getHeroHealth() + " , damage : " + hero[i].getHeroDamage() + " , skills : " + hero[i].getHeroSkill());
        }
    }

}


