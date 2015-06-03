// *************
// Rock.java 
// ************* 

import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.*;

public class Rock {

    public static void main(String[] args) {
        String playerOne = null, playerTwo, winner, popularMove, playerOnePlay, playerTwoPlay;
        int turns = 0;
        int rock = 0;
        int paper = 0;
        int scissors = 0;
        int nPlay = 0;
        int win1 = 0;
        int win2 = 0;
        String response = " ";

        Scanner scan = new Scanner(System.in);

        String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
        int computerInt; //Randomly generated number used to determine 
        //computer's play 

        System.out.println("This game lets you play Rock, Paper and Scissors !\n"
                + "Rock = R, Paper"
                + "= P, and Scissors = S.");

        System.out.println("Press A for two player mode or press B to play the computer");
        response = scan.next();
        response = response.toUpperCase();
        while (!response.equals("A") && !response.equals("B")) {
            System.out.println("Please press A for two player mode or press B to play the computer");
            response = scan.next();
        }

        if (response.equals("B")) {

            System.out.println("Please enter the name of player one: ");
            playerOne = scan.next();
            while (nPlay != 3) {
                Random generator = new Random();

                //Generate computer's play (0,1,2) 
                computerInt = generator.nextInt(3) + 1;

    //Translate computer's randomly generated play to 
                //string using if //statements 
                if (computerInt == 1) {
                    computerPlay = "R";
                    rock = rock + 1;
                } else if (computerInt == 2) {
                    computerPlay = "P";

                    paper = paper + 1;
                } else if (computerInt == 3) {
                    computerPlay = "S";
                    scissors = scissors + 1;
                }

    //Get player's play from input-- note that this is 
                // stored as a string 
                System.out.println("Enter your play: ");
                playerOnePlay = scan.next();
                //Make player's play uppercase for ease of comparison 
                playerOnePlay = playerOnePlay.toUpperCase();
                while (!playerOnePlay.equals("R") && !playerOnePlay.equals("P") && !playerOnePlay.equals("S")) {
                    System.out.println(playerOne + "Please enter one of the following:\n " + "Rock = R, Paper"
                            + "= P, and scissors = S.");
                    playerOnePlay = scan.next();

                }

                if (playerOnePlay.equals("R")) {
                    rock = rock + 1;
                } else if (playerOnePlay.equals("S")) {
                    scissors = scissors + 1;
                } else if (playerOnePlay.equals("P")) {
                    paper = paper + 1;
                }

                //Print computer's play 
                System.out.println("Computer play is: " + computerPlay);

                //See who won. Use nested ifs 
                if (playerOnePlay.equals(computerPlay)) {
                    System.out.println("It's a tie!");
                } else if (playerOnePlay.equals("R")) {
                    if (computerPlay.equals("S")) {
                        System.out.println("Rock crushes scissors." + playerOne + " You win!! The computer lost");
                        win1 = win1 + 1;
                    }
                } else if (computerPlay.equals("P")) {
                    System.out.println("Paper eats rock.The computer lost!! The computer Wins :)");
                    win2 = win2 + 1;
                } else if (playerOnePlay.equals("P")) {
                    if (computerPlay.equals("S")) {
                        System.out.println("Scissor cuts paper." + playerOne + " You lose!! The computer wins :)");
                        win2 = win2 + 1;
                    }
                } else if (computerPlay.equals("R")) {
                    System.out.println("Paper eats rock. The computer wins!!" + playerOne + " You Lose :(");
                    win2 = win2 + 1;
                } else if (playerOnePlay.equals("S")) {
                    if (computerPlay.equals("P")) {
                        System.out.println("Scissor cuts paper." + playerOne + " You win!! The computer lost");
                        win1 = win1 + 1;
                    }
                } else if (computerPlay.equals("R")) {
                    System.out.println("Rock breaks scissors." + playerOne + " You lose!! the computer wins");
                }
                win1 = win1 + 1;
                nPlay++;
                turns = turns + 2;
            }

            System.out.println("**********************************");
            if (win1 > win2) {
                System.out.println("The winner is: " + playerOne);
            } else if (win2 > win1) {
                System.out.println("The computer has won!");
            } else {
                System.out.println("It's a Tie!");
            }

            System.out.println("Total Turns: " + turns);

            System.out.println("Most popular move: ");
            if (rock > paper && rock > scissors) {
                System.out.println("Rock: " + rock);
            } else if (paper > rock && paper > scissors) {
                System.out.println("Paper: " + paper);
            } else if (scissors > rock && scissors > paper) {
                System.out.println("scissors: " + scissors);
            }

            double max = Math.max(rock, Math.max(paper, scissors));
            System.out.println("Most used move: " + max);
            System.out.println("**********************************");
        }
        if (response.equals("A")) {

            System.out.println("Please enter the name of player one: ");
            playerOne = scan.next();

            System.out.println("Please enter the name of player two: ");
            playerTwo = scan.next();

            while (nPlay != 3) {

                System.out.println(playerOne + " Please Enter your move: ");
                playerOnePlay = scan.next();
                playerOnePlay = playerOnePlay.toUpperCase();
                while (!playerOnePlay.equals("R") && !playerOnePlay.equals("P") && !playerOnePlay.equals("S")) {
                    System.out.println(playerOne + " Please enter one of the following:\n " + "Rock = R, Paper"
                            + "= P, and scissors = S.");
                    playerOnePlay = scan.next();

                }

                if (playerOnePlay.equals("R")) {
                    rock = rock + 1;
                } else if (playerOnePlay.equals("S")) {
                    scissors = scissors + 1;
                } else if (playerOnePlay.equals("P")) {
                    paper = paper + 1;
                }

                System.out.println(playerTwo + " Please enter your move: ");
                playerTwoPlay = scan.next();
                playerTwoPlay = playerTwoPlay.toUpperCase();
                while (!playerTwoPlay.equals("R") && !playerTwoPlay.equals("P") && !playerTwoPlay.equals("S")) {
                    System.out.println(playerTwo + "Please enter one of the following:\n " + "Rock = R, Paper"
                            + "= P, and scissors = S.");
                    playerTwoPlay = scan.next();

                }

                if (playerTwoPlay.equals("R")) {
                    rock = rock + 1;
                } else if (playerTwoPlay.equals("S")) {
                    scissors = scissors + 1;
                } else if (playerTwoPlay.equals("P")) {
                    paper = paper + 1;
                }

                //See who won. Use nested ifs 
                if (playerOnePlay.equals(playerTwoPlay)) {
                    System.out.println("It's a tie!");
                } else if (playerOnePlay.equals("R")) {
                    if (playerTwoPlay.equals("S")) {
                        System.out.println("Rock crushes scissors." + playerOne + " You win!! :) " + playerTwo + " You Lose :(");
                        win1 = win1 + 1;
                    }
                } else if (playerTwoPlay.equals("P")) {
                    System.out.println("Paper eats rock." + playerOne + "You lose!! :(" + playerTwo + " Wins :)");
                    win2 = win2 + 1;
                } else if (playerOnePlay.equals("P")) {
                    if (playerTwoPlay.equals("S")) {
                        System.out.println("Scissor cuts paper." + playerOne + " You lose!!" + playerTwo + "You Win :)");
                        win2 = win2 + 1;
                    }
                } else if (playerTwoPlay.equals("R")) {
                    System.out.println("Paper eats rock." + playerTwo + " You win!!" + playerOne + " You Lose :(");
                    win2 = win2 + 1;
                } else if (playerOnePlay.equals("S")) {
                    if (playerTwoPlay.equals("P")) {
                        System.out.println("Scissor cuts paper." + playerOne + " You win!!" + playerTwo + "You Lose");
                        win1 = win1 + 1;
                    }
                } else if (playerTwoPlay.equals("R")) {
                    System.out.println("Rock breaks scissors." + playerOne + " You lose!!" + playerTwo + "You Win");
                }
                win1 = win1 + 1;
                nPlay++;
                turns = turns + 2;
            }

            System.out.println("**********************************");
            if (win1 > win2) {
                System.out.println("The winer is: " + playerOne);
            } else if (win2 > win1) {
                System.out.println("The Winner is :" + playerTwo);
            } else {
                System.out.println("It's a Tie!");
            }

            System.out.println("Total Turns: " + turns);

            System.out.println("Most popular move: ");
            if (rock > paper && rock > scissors) {
                System.out.println("Rock: " + rock);
            } else if (paper > rock && paper > scissors) {
                System.out.println("Paper: " + paper);
            } else if (scissors > rock && scissors > paper) {
                System.out.println("scissors: " + scissors);
            }

            double max = Math.max(rock, Math.max(paper, scissors));
            System.out.println("Most used move: " + max);
            System.out.println("**********************************");

        }
    }
}
