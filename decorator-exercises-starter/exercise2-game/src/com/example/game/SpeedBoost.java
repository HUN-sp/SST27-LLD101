package com.example.game;

/**
 * Decorator that adds speed boost to a character.
 */
public class SpeedBoost extends CharacterDecorator {
    private int speedIncrease;

    public SpeedBoost(Character character, int speedIncrease) {
        super(character);
        this.speedIncrease = speedIncrease;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite() + " (Speed Boosted!)");
    }

    @Override
    public int getSpeed() {
        return wrappedCharacter.getSpeed() + speedIncrease;
    }
}