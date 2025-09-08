package com.example.game;

/**
 * Demo showing decorator pattern with runtime composition and removal.
 */
public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("=== Base Character ===");
        base.move();
        base.attack();
        System.out.println("Stats: Speed=" + base.getSpeed() + ", Damage=" + base.getDamage() + ", Sprite=" + base.getSprite());

        System.out.println("\n=== Base + SpeedBoost + DamageBoost ===");
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        buffed.move();
        buffed.attack();
        System.out.println("Stats: Speed=" + buffed.getSpeed() + ", Damage=" + buffed.getDamage() + ", Sprite=" + buffed.getSprite());

        System.out.println("\n=== Adding Golden Aura ===");
        Character shiny = new GoldenAura(buffed);
        shiny.move();
        shiny.attack();
        System.out.println("Stats: Speed=" + shiny.getSpeed() + ", Damage=" + shiny.getDamage() + ", Sprite=" + shiny.getSprite());

        System.out.println("\n=== Removing Golden Aura (recomposition) ===");
        Character withoutAura = new DamageBoost(new SpeedBoost(base, 3), 15); // rebuild without aura
        withoutAura.move();
        withoutAura.attack();
        System.out.println("Stats: Speed=" + withoutAura.getSpeed() + ", Damage=" + withoutAura.getDamage() + ", Sprite=" + withoutAura.getSprite());

        System.out.println("\n=== Complex Composition Example ===");
        Character superBuffed = new GoldenAura(new DamageBoost(new SpeedBoost(new DamageBoost(base, 5), 10), 20));
        superBuffed.move();
        superBuffed.attack();
        System.out.println("Stats: Speed=" + superBuffed.getSpeed() + ", Damage=" + superBuffed.getDamage() + ", Sprite=" + superBuffed.getSprite());
    }
}