package Chess_Game;

import Chess_Game.Entities.Board;
import Chess_Game.Entities.Cell;
import Chess_Game.Entities.Move;
import Chess_Game.Entities.Player;
import Chess_Game.Entities.gamePieces.*;
import Chess_Game.enums.Color;
import Chess_Game.enums.GameStatus;

import java.util.Scanner;

public class ChessGame {

    private static ChessGame instance;
    private Board board;
    private Player white;
    private Player black;
    private GameStatus gameStatus;


    private ChessGame() {
        Cell[][] cells = new Cell[8][8];

        //making board and adjusting pieces .
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Cell curr;
                if ((i + j) % 2 == 0)
                    curr = new Cell(i, j, Color.BLACK);
                else curr = new Cell(i, j, Color.WHITE);


                if (i == 0 || i == 7) {
                    Color c = i == 0 ? Color.WHITE : Color.BLACK;
                    if (j == 0 || j == 7)
                        curr.setPiece(new Rook(c));
                    else if (j == 1 || j == 6)
                        curr.setPiece(new Knight(c));
                    else if (j == 2 || j == 5)
                        curr.setPiece(new Bishop(c));
                    else if (j == 3)
                        curr.setPiece(new Queen(c));
                    else curr.setPiece(new King(c));
                    curr.setVacant(false);
                } else if (i == 1) {
                    curr.setPiece(new Pawn(Color.WHITE));
                    curr.setVacant(false);
                } else if (i == 6) {
                    curr.setPiece(new Pawn(Color.BLACK));
                    curr.setVacant(false);
                }

                cells[i][j] = curr;

            }
        }

        this.board = new Board(cells);
        gameStatus = GameStatus.NOTSTARTED;
    }

    public static ChessGame getInstance() {
        if (instance == null)
            instance = new ChessGame();
        return instance;
    }

    public void setPlayers(Player p1, Player p2) {
        this.white = p1;
        this.black = p2;
        white.changeTurn(); // initial turn set to True for beginning
    }

    public void setGameStatus(GameStatus status) {
        this.gameStatus = status;
    }

    public void start() {
        while (!isGameOver()) {
            Player currPlayer = white.getIsTurn() ? white : black;
            Move move = getPlayerMove(currPlayer);
            board.makeMove(move);

            white.changeTurn();
            black.changeTurn();

        }
    }

    private Move getPlayerMove(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source row");
        int sx = sc.nextInt();
        System.out.println("Enter source col");
        int sy = sc.nextInt();
        System.out.println("Enter destination row");
        int dx = sc.nextInt();
        System.out.println("Enter destination col");
        int dy = sc.nextInt();

        return new Move(player, sx, sy, dx, dy);
    }

    private boolean isGameOver() {
        return false;
    }

}
