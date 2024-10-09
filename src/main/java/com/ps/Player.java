package com.ps;

import java.util.ArrayList;

public class Player {

    private String playerName;
    private int health;
    private ArrayList<String> inventory;

    public Player(int health, ArrayList<String> inventory, String playerName) {
        this.health = 100;
        this.inventory = new ArrayList<>();
        this.playerName = playerName;


    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void move(String direction){
        System.out.println(playerName + " moves " + direction + ".");
    }
    public void takeDamage(int damage){
        health -= damage;

        if (health <= 0){
            System.out.println(playerName + "has no health left! Game over.");
        } else {
            System.out.println(playerName + "took" + damage + "damage. Current Health: " + health);
        }
    }

    public void pickUpItem(String item){
        inventory.add(item);
        System.out.println(playerName + " picked up: "+ item);
    }
    


}
