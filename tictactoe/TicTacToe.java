public class TicTacToe {
    public static void main(String[] args) {
        char b11 = 'X';
        char b12 = 'O';
        char b13 = ' ';
        char b21 = ' ';
        char b22 = ' ';
        char b23 = ' ';
        char b31 = ' ';
        char b32 = ' ';
        char b33 = ' ';

        System.out.println("Tic-Tac-Toe Board:");
        System.out.printf(" %c | %c | %c%n", b11, b12, b13);
        System.out.println("---|---|---");
        System.out.printf(" %c | %c | %c%n", b21, b22, b23);
        System.out.println("---|---|---");
        System.out.printf(" %c | %c | %c%n", b31, b32, b33);

    }
}
