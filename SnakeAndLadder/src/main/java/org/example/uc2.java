package org.example;

public class uc2 {
    public static void main(String[] args) {
        System.out.println("****WELCOME TO SNAKE AND LADDER PROBLEM *****");
        int player1 = 0, min = 1, max = 6;
        int position = 0;
        System.out.println();
        System.out.println("player start its position from " +position + "player1");

        // role a die to get a number
        int die = (int) (Math . random () * ( max - min + 1 ) + min);
        System.out.println(die);

    }


}
