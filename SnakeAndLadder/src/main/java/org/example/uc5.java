package org.example;

public class uc5 {
    public static  final int IS_NO_PLAY = 1;
    public static  final int IS_SNAKE = 2;
    public static  final int IS_LADDER = 3;



    public static void main(String[] args) {
        System.out.println("****WELCOME TO SNAKE AND LADDER PROBLEM *****");
        int player1 = 0,min = 1,max = 6,i = 1,j = 3,n = 100;
        int position = 0, stable = n, currantposition = 0;
        int position1 = n;
        System.out.println();
        System.out.println("player start its position from " + position + "player1");

        // role a die to get a number
        int die=(int) (Math.random() *( max - min + 1 ) + min);
        System.out.println(die);

        // to check for a option  No play,Snake And Ladder
        for( currantposition = 0 ;currantposition <= 100; currantposition++){
            System.out.println("to chek for a option No play, Snake ,Ladder:");
            int die2=(int) (Math.random() * ( j - i + 1 ) + i);
            switch(die2){
                case IS_NO_PLAY:
                    System.out.println("player stays at same position");
                    currantposition = 0;
                    System.out.println("next position of a player after rolling a die get :"+currantposition);
                    break;
                case IS_LADDER:
                    System.out.println("goes ahead by no of positions ");
                    position = position + die;
                    currantposition = currantposition + position;
                    System.out.println("player moves a die and recived and goes ahead by" + position);
                    System.out.println("player moves a die and recived and goes ahead current position is :" + currantposition);
                    if(currantposition > 100){
                        currantposition = currantposition - position - 1;
                        System.out.println("goes above 100 current position back :" + currantposition);

                    }

                    break;
                case IS_SNAKE:


                    position= currantposition-die;
                    if(currantposition>0){
                        System.out.println("player got snake on board then player behind recived in die :"+currantposition);
                        if(currantposition == 100){
                            System.out.println("player wins a game");
                        }
                    }
                    else{
                        currantposition = currantposition + position;
                        System.out.println("player moves behind position recieved in die and stays at same position");
                        System.out.println(+currantposition );
                        if(currantposition == 100){
                            System.out.println("player wins a game");
                        }

                    }
                    if(currantposition > 100){
                        currantposition = currantposition - die;
                        System.out.println("goes above 100 current position back :"+currantposition);

                    }
                    break;
                default :

            }
            // if player goes above 100
            if(currantposition > 100){
                currantposition = currantposition-die;
                System.out.println("goes above 100 current position back :" + currantposition);

            }
        }



    }
}
