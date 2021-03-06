package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSkill;

    public Hero() {
    }


    public Hero(int heroHealth, int heroDamage, String heroSkill) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSkill = heroSkill;

    }

    public Hero(int heroDamage, int heroHealth) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSkill() {
        return heroSkill;
    }
}

