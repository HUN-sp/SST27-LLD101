package com.example.game;

/**
 * Abstract base decorator that implements Character and wraps another Character.
 * All concrete decorators will extend this class.
 */
public abstract class CharacterDecorator implements Character {
    protected Character wrappedCharacter;

    public CharacterDecorator(Character character) {
        this.wrappedCharacter = character;
    }

    // Default implementations delegate to wrapped character
    @Override
    public void move() {
        wrappedCharacter.move();
    }

    @Override
    public void attack() {
        wrappedCharacter.attack();
    }

    @Override
    public int getSpeed() {
        return wrappedCharacter.getSpeed();
    }

    @Override
    public int getDamage() {
        return wrappedCharacter.getDamage();
    }

    @Override
    public String getSprite() {
        return wrappedCharacter.getSprite();
    }
}