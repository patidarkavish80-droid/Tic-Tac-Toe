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


        char current_player = 'X';
        while (true) {


            System.out.print("ENTER ROW : ");
            int row = sc.nextInt();
            sc.nextLine();
            System.out.print("ENTER COLUMN : ");
            int column = sc.nextInt();
            if (row <= 3 && column <= 3&& column >=1&&row>=1) {
                if (board[row - 1][column - 1] == '_') {
                    board[row - 1][column - 1] = current_player;
                    current_player = (current_player == 'X') ? 'O' : 'X';
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

            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' || board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' || board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' || board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' || board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'||board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X'||board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X') {
                System.out.println("X win.....!!!!");
                break;
            }
            if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' || board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' || board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' || board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' || board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O' ||board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O'||board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O') {
                System.out.println(" O Win....!!!!");
                break;
            }
            boolean draw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        draw = false;
                    }
                }

            }

            if (draw) {
                System.out.println("Game Draw!");
                break;
            }

            }
        }
    }








