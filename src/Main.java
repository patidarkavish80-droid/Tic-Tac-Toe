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
        System.out.print("ENTER ROW : ");
        int row = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER COLUMN : ");
        int column = sc.nextInt();
        board[row-1][column-1] = 'X';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }
//        if(board[row][column]=='_'){
//            ;
//        }
    }
}




