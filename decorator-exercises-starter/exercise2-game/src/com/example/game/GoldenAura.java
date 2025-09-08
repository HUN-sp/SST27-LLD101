package com.example.game;

/**
 * Decorator that adds golden aura with sprite change and small buffs.
 */
public class GoldenAura extends CharacterDecorator {
    private static final int SPEED_BUFF = 2;
    private static final int DAMAGE_BUFF = 5;
    private static final String GOLDEN_SPRITE = "golden_aura.png";

    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public void move() {
        System.out.println("✨ Golden aura shimmers as character moves at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("⚡ Golden aura flares as character attacks with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return wrappedCharacter.getSpeed() + SPEED_BUFF;
    }

    @Override
    public int getDamage() {
        return wrappedCharacter.getDamage() + DAMAGE_BUFF;
    }

    @Override
    public String getSprite() {
        return GOLDEN_SPRITE;
    }
}