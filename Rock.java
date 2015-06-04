// **********************
// Rock, Paper, Scisors *
// ********************** 
import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.*;

public class Rock {

    public static void main(String[] args) {
    	//variables
        String playerOne = null, playerTwo, playerOnePlay, playerTwoPlay;
        int turns = 0;
        int rock = 0;
        int paper = 0;
        int scissors = 0;
        int nPlay = 0;
        int win1 = 0;
        int win2 = 0;
        String response = " ";
        
		//scanner for taking user input
        Scanner scan = new Scanner(System.in);
		
        String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
        int computerInt; //Randomly generated number used to determine 
        //computer's play 
		//game instructions
        System.out.println("This game lets you play Rock, Paper and Scissors !\n"
                + "Rock = R, Paper"
                + "= P, and Scissors = S.");
		//choosing the game mode
        System.out.println("Press A for two player mode or press B to play the computer");
        //storing user input as a variable
        response = scan.next();
        //converting user input to uppercase
        response = response.toUpperCase();
        //while statement to prevent user from crashing the game & getting correct input
        while (!response.equals("A") && !response.equals("B")) {
            System.out.println("Please press A for two player mode or press B to play the computer");
            response = scan.next();
        }
		//User vs Computer game mode
        if (response.equals("B")) {
			//getting users name
            System.out.println("Please enter the name of player one: ");
            playerOne = scan.next();
            //playing the game 3 times before a winner has been decided
            while (nPlay != 3) {
            	//random generator for the computer
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
                //checking for correct input
                while (!playerOnePlay.equals("R") && !playerOnePlay.equals("P") && !playerOnePlay.equals("S")) {
                    System.out.println(playerOne + "Please enter one of the following:\n " + "Rock = R, Paper"
                            + "= P, and scissors = S.");
                    playerOnePlay = scan.next();

                }
				//keeping track of user inputs
                if (playerOnePlay.equals("R")) {
                    rock = rock + 1;
                } else if (playerOnePlay.equals("S")) {
                    scissors = scissors + 1;
                } else if (playerOnePlay.equals("P")) {
                    paper = paper + 1;
                }

                //Print computer's play 
                System.out.println("Computer play is: " + computerPlay);

                //See who won. Uses nested if statements and store wins
                if (playerOnePlay.equals(computerPlay)) {
                    System.out.println("It's a tie!");
                } else if (playerOnePlay.equals("R")) {
                    if (computerPlay.equals("S")) {
                        System.out.println("Rock crushes scissors." + playerOne + " You win!! The computer lost");
                        win1 = win1 + 1;
                    }
                } else if (computerPlay.equals("P")) {
                    System.out.println("Paper eats rock. The computer Wins :)");
                    win2 = win2 + 1;
                } else if (playerOnePlay.equals("P")) {
                    if (computerPlay.equals("S")) {
                        System.out.println("Scissor cuts paper." + playerOne + " You lose!! The computer wins :)");
                        win2 = win2 + 1;
                    }
                } else if (computerPlay.equals("R")) {
                    System.out.println("Paper eats rock. The computer Lost!!" + playerOne + " You Win!");
                    win1 = win1 + 1;
                } else if (playerOnePlay.equals("S")) {
                    if (computerPlay.equals("P")) {
                        System.out.println("Scissor cuts paper." + playerOne + " You win!! The computer lost");
                        win1 = win1 + 1;
                    }
                } else if (computerPlay.equals("R")) {
                    System.out.println("Rock breaks scissors." + playerOne + " You lose!! the computer wins");
                     win2 = win2 + 1;
                }
                //storing 
                nPlay++;
                turns = turns + 2;
            }
		
            System.out.println("**********************************");
            //checking who won
            if (win1 > win2) {
                System.out.println("The winner is: " + playerOne);
            } else if (win2 > win1) {
                System.out.println("The computer has won!");
            } else {
                System.out.println("It's a Tie!");
            }
			//printing the total number of turns
            System.out.println("Total Turns: " + turns);
			//Printing the most popular move in the game
            System.out.println("Most popular move: ");
            if (rock > paper && rock > scissors) {
                System.out.println("Rock: " + rock);
            } else if (paper > rock && paper > scissors) {
                System.out.println("Paper: " + paper);
            } else if (scissors > rock && scissors > paper) {
                System.out.println("scissors: " + scissors);
            }
			//getting the most used move
            double max = Math.max(rock, Math.max(paper, scissors));
            System.out.println("Most used move: " + max);
            System.out.println("**********************************");
        }
        
        //Two player game mode
        if (response.equals("A")) {
			//getting the users names
            System.out.println("Please enter the name of player one: ");
            playerOne = scan.next();

            System.out.println("Please enter the name of player two: ");
            playerTwo = scan.next();
			//runing the game three times 
            while (nPlay != 3) {
				//getting users input as a move
                System.out.println(playerOne + " Please Enter your move: ");
                playerOnePlay = scan.next();
                //changing it to upper case 
                playerOnePlay = playerOnePlay.toUpperCase();
                //checking for the correct input
                while (!playerOnePlay.equals("R") && !playerOnePlay.equals("P") && !playerOnePlay.equals("S")) {
                    System.out.println(playerOne + " Please enter one of the following:\n " + "Rock = R, Paper"
                            + "= P, and scissors = S.");
                    playerOnePlay = scan.next();

                }
				//repeating the same process for player two
                if (playerOnePlay.equals("R")) {
                    rock = rock + 1;
                } else if (playerOnePlay.equals("S")) {
                    scissors = scissors + 1;
                } else if (playerOnePlay.equals("P")) {
                    paper = paper + 1;
                }
				//geting player twos input
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

                //See who won. Using nested if statements and recording the winner
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
                    System.out.println("Paper eats rock." + playerTwo + " You Lose!!" + playerOne + " You Win!");
                    win1 = win1 + 1;
                } else if (playerOnePlay.equals("S")) {
                    if (playerTwoPlay.equals("P")) {
                        System.out.println("Scissor cuts paper." + playerOne + " You win!!" + playerTwo + "You Lose");
                        win1 = win1 + 1;
                    }
                } else if (playerTwoPlay.equals("R")) {
                    System.out.println("Rock breaks scissors." + playerOne + " You lose!!" + playerTwo + "You Win");
                    win2 = win2 + 1;
                }
             	//storing the number of plays   
                nPlay++;
                //adding the number of turns to the total
                turns = turns + 2;
            }

            System.out.println("**********************************");
            //checking who won using if statements
            if (win1 > win2) {
                System.out.println("The winer is: " + playerOne);
            } else if (win2 > win1) {
                System.out.println("The Winner is :" + playerTwo);
            } else {
                System.out.println("It's a Tie!");
            }
			//printing the Total turns in the game
            System.out.println("Total Turns: " + turns);
			//Printing the most popular move
            System.out.println("Most popular move: ");
            if (rock > paper && rock > scissors) {
                System.out.println("Rock: " + rock);
            } else if (paper > rock && paper > scissors) {
                System.out.println("Paper: " + paper);
            } else if (scissors > rock && scissors > paper) {
                System.out.println("scissors: " + scissors);
            }
			//printing the most used move similar to above 
            double max = Math.max(rock, Math.max(paper, scissors));
            System.out.println("Most used move: " + max);
            System.out.println("**********************************");

        }
    }
}
