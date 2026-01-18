/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Player {

    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        if ((hp >= 0) && (hp <= 20)) {
            this.hp = hp;
        } else if (hp < 0) {
            this.hp = 0;
        } else if (hp > 20) {
            this.hp = 20;
        }
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        if ((mana >= 0) && (mana <= 50)) {
            this.mana = mana;
        } else if (mana < 0) {
            this.mana = 0;
        } else if (mana > 50) {
            this.mana = 50;
        }
    }

    public Houses getHouses() {
        return this.houses;
    }

    public void setHouses(Houses houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Player : " + name + " HP: " + hp + " Mana: " + mana + " || " + houses;
    }

    public boolean equals(Player player) {
        if (this.name.equals(this.houses)) {
            return true;
        } else {
            return false;
        }
    }

    public void attack(Player target, Spell spell) {
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor) houses).attackSpell(this, target, spell);
        } else if (getHouses() instanceof Hufflepuff) {
            ((Hufflepuff) houses).attackSpell(this, target, spell);
        }
    }

    public void protectFromPlayer(Player target) {
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor) houses).defense(this, target);
        } 
        else if (getHouses() instanceof Hufflepuff) {
            ((Hufflepuff) houses).defense(this, target);
        }
    }
}