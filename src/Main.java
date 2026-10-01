import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== TIC TAC TOE =====");
        System.out.println("Game Starting...");
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] = '_');
                System.out.print(" ");
            }
            System.out.println();
        }
        while (true) {
            System.out.print("ENTER ROW : ");
            int row = sc.nextInt();
            sc.nextLine();
            System.out.print("ENTER COLUMN : ");
            int column = sc.nextInt();
            if (row <= 3 && column <= 3) {
                if (board[row - 1][column - 1] == '_') {
                    board[row - 1][column - 1] = 'X';
                } else {
                    System.out.println();
                    System.out.println("Position already occupied");
                    System.out.println();
                }
            } else {
                System.out.println("Enter b/w 1 to 3");
                System.out.println();
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }


        }
    }







