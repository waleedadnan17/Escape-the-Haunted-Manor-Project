package com.hauntedmanor.game;

public class Item {
    private String itemName;
    private String itemDescription;

    public Item(String itemName, String itemDescription) { //Parameterized constructor for Item class
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItemName() {        //Getter for Item Name
        return itemName;
    }

    public String getItemDescription() {      //Setter for Item Name
        return itemDescription;
    }

    @Override  //Overrides toString method for the Item Object
    public String toString() {
        return itemName + ": " + itemDescription;
    }

}
