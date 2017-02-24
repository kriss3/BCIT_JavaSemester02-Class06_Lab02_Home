package pl.kriss3.comp1451;

/**
 * Main entry to Lab6a 
 * @author krzysztof szczurowski
 * @since 2017-02-17
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class06_Lab01_InClass.git
 */
public class Main 
{
	public static void main(String[] args) 
	{
		ChessPiece[][] board = createChessBoard();
				
		for(int row=0;row<board.length; row++)
		{
			printEdge(144);
			System.out.print("|");
			for(int column=0; column<board[row].length; column++)
			{
				
				if(board[row][column] != null)
				{
					System.out.print(board[row][column].toString());
					System.out.print("|");
				}
				else 
				{
					System.out.printf("%18s", "|");
				}
			}
			System.out.println();
		}
		printEdge(144);
	}
	
	private static  ChessPiece[][] createChessBoard()
	{
		
		ChessPiece[][] chessBoard = new ChessPiece[8][8];
		
		ChessPiece rookB = new Rook();
		rookB.setColor(Color.BLACK);
		
		ChessPiece knightB = new Knight();
		knightB.setColor(Color.BLACK);
		
		ChessPiece bishopB = new Bishop();
		bishopB.setColor(Color.BLACK);
		
		ChessPiece queenB = new Queen();
		queenB.setColor(Color.BLACK);
		
		ChessPiece kingB = new King();
		kingB.setColor(Color.BLACK);
		
		ChessPiece pawnB = new Pawn();
		pawnB.setColor(Color.BLACK);
		
		
		ChessPiece rookW = new Rook();
		rookW.setColor(Color.WHITE);
		
		ChessPiece knightW = new Knight();
		knightW.setColor(Color.WHITE);
		
		ChessPiece bishopW = new Bishop();
		bishopW.setColor(Color.WHITE);
		
		ChessPiece queenW = new Queen();
		queenW.setColor(Color.WHITE);
		
		ChessPiece kingW = new King();
		kingW.setColor(Color.WHITE);
		
		ChessPiece pawnW = new Pawn();
		pawnW.setColor(Color.WHITE);
		
		
		//setup Whites Pawns
		for(int col = 0; col < chessBoard[1].length; col++)
		{
			chessBoard[1][col] = pawnW;
		}
		
		chessBoard[0][0] = rookW;
		chessBoard[0][1] = knightW;
		chessBoard[0][2] = bishopW;
		chessBoard[0][3] = queenW;
		chessBoard[0][4] = kingW;
		chessBoard[0][5] = bishopW;
		chessBoard[0][6] = knightW;
		chessBoard[0][7] = rookW;
		
		//setup Black Pawns
		for(int col = 0; col < chessBoard[6].length; col++)
		{
			chessBoard[6][col] = pawnB;
		}
		
		chessBoard[7][0] = rookB;
		chessBoard[7][1] = knightB;
		chessBoard[7][2] = bishopB;
		chessBoard[7][3] = queenB;
		chessBoard[7][4] = kingB;
		chessBoard[7][5] = bishopB;
		chessBoard[7][6] = knightB;
		chessBoard[7][7] = rookB;
		
		return chessBoard;
	}
	
	private static void printEdge(int val)
	{
		String result = "-";
		for(int i = 0; i< val; i++)
		{
			result+="-";
		}
		
		System.out.println(result);
	}
}
