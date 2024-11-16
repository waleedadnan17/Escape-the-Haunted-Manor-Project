package com.hauntedmanor.game;

public class Spirit {  //Spirits are non playable characters that will interact with the Player during the game
    private String spiritName;
    private String dialogue;
    private boolean friendly;

    public Spirit(String spiritName, String dialogue, boolean friendly) { //Parameterized constructor for Spirit
        this.spiritName = spiritName;
        this.dialogue = dialogue;
        this.friendly = friendly;
    }

    public void interact(){
        System.out.println(spiritName + " says: \"" + dialogue + "\"");
    }

    public boolean isFriendly() { return friendly; }

//    public static void main(String[] args) {
//        Spirit s = new Spirit("Haunted Manor", "Haunted Manor", true);
//        s.interact();
//    }
}
