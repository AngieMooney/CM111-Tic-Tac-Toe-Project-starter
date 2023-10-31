import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // Define variables to represent the tic-tac-toe board
        char b11 = ' ';
        char b12 = ' ';
        char b13 = ' ';
        char b21 = ' ';
        char b22 = ' ';
        char b23 = ' ';
        char b31 = ' ';
        char b32 = ' ';
        char b33 = ' ';

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Iterate through rows and columns for user initialization
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("Enter value for row " + row + " column " + col + ": ");
                char input = scanner.nextLine().charAt(0);

                if (input == 'X' || input == 'O' || input == '.') {
                    if (row == 1) {
                        if (col == 1) b11 = input;
                        else if (col == 2) b12 = input;
                        else b13 = input;
                    } else if (row == 2) {
                        if (col == 1) b21 = input;
                        else if (col == 2) b22 = input;
                        else b23 = input;
                    } else {
                        if (col == 1) b31 = input;
                        else if (col == 2) b32 = input;
                        else b33 = input;
                    }
                } else {
                    System.out.println("Invalid input. Please enter 'X', 'O', or '.'.");
                    col--;
                }
            }
        }

        // Print the initialized tic-tac-toe board
        printBoard(b11, b12, b13, b21, b22, b23, b31, b32, b33);

        // X's turn to make a move
        System.out.println("It is X's turn");
        System.out.print("Enter row for move (1-3): ");
        int rowForX = scanner.nextInt();
        System.out.print("Enter column for move (1-3): ");
        int colForX = scanner.nextInt();

        // Update the board variable based on X's move
        if (rowForX >= 1 && rowForX <= 3 && colForX >= 1 && colForX <= 3) {
            if (rowForX == 1) {
                if (colForX == 1) b11 = 'X';
                else if (colForX == 2) b12 = 'X';
                else b13 = 'X';
            } else if (rowForX == 2) {
                if (colForX == 1) b21 = 'X';
                else if (colForX == 2) b22 = 'X';
                else b23 = 'X';
            } else {
                if (colForX == 1) b31 = 'X';
                else if (colForX == 2) b32 = 'X';
                else b33 = 'X';
            }
        } else {
            System.out.println("Invalid move. Please enter row and column values between 1 and 3.");
        }

        // Print the updated tic-tac-toe board
        printBoard(b11, b12, b13, b21, b22, b23, b31, b32, b33);

        // Close the Scanner
        scanner.close();
    }

    // Method to print the tic-tac-toe board
    public static void printBoard(char b11, char b12, char b13, char b21, char b22, char b23, char b31, char b32, char b33) {
        System.out.println("Tic-Tac-Toe Board:");
        System.out.printf("%c|%c|%c%n", b11, b12, b13);
        System.out.println("-----");
        System.out.printf("%c|%c|%c%n", b21, b22, b23);
        System.out.println("-----");
        System.out.printf("%c|%c|%c%n", b31, b32, b33);
    }
}
