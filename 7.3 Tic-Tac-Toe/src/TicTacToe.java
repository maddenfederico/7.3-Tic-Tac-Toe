import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;

public class TicTacToe extends PlayTicTacToe
{
	private boolean isGameOver;
	private String[][] gameBoard;
	public Scanner scan;
	public TicTacToe(Scanner in)
	{
		isGameOver = false;
		gameBoard = new String[3][3];
		scan = in;
		
		System.out.println("Tic Tac Toe initiated");
		
		
		
		while(!isGameOver)
		{
			playerMove(1);
			playerMove(2);
		}
	}
	

	private void playerMove(int player) 
	{
		String marker = null;
		int row = 0;
		int column = 0;
		if(player == 1)
		{
			System.out.println("Player One, please place an X");
			marker = "X";
		}
		if(player == 2)
		{
			System.out.println("Player Two, please place an O");
			marker = "O";
		}

		//reads player input to determine which square they will make their move on
		String move = scan.nextLine();
		
		//places player marker accordingly
		if(move.equals("UR") && gameBoard[0][2].isEmpty())
		{
			gameBoard[0][2] = marker;
			row = 0;
			column = 2;
		}
		else if(move.equals("UC") && gameBoard[0][1].isEmpty())
		{
			gameBoard[0][1] = marker;
			row = 0; 
			column = 2;
		}
		else if(move.equals("UL") && gameBoard[0][0].isEmpty())
		{
			gameBoard[0][0] = marker;
			row = 0;
			column = 0;
		}
		else if(move.equals("CR") && gameBoard[1][2].isEmpty())
		{
			gameBoard[1][2] = marker;
			row = 1;
			column = 2;
		}
		else if(move.equals("CC") && gameBoard[1][1].isEmpty())
		{
			gameBoard[1][1] = marker;
			row = 1;
			column = 1;
		}
		else if(move.equals("CL") && gameBoard[1][0].isEmpty())
		{
			gameBoard[1][0] = marker;
			row = 1;
			column = 0;
		}
		else if(move.equals("LR") && gameBoard[2][2].isEmpty())
		{
			gameBoard[2][2] = marker;
			row = 2;
			column = 2;
		}
		else if(move.equals("LC") && gameBoard[2][1].isEmpty())
		{
			gameBoard[2][1] = marker;
			row = 2;
			column = 1;
		}
		else if(move.equals("LL") && gameBoard[2][2].isEmpty())
		{
			gameBoard[2][2] = marker;
			row = 2;
			column = 2;
		}
		else
		{
			System.out.println("Invalid input, your turn is skipped.");
		}
		printBoard();
		checkIfWon(marker, row, column);
		
	}
	
	public void printBoard()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print("|" + gameBoard[i][j]);
			}
			System.out.print("|");
			System.out.println("------");
		}
	}
	
	private void checkIfWon(String theMarker, int theRow, int theColumn)
	{
		//check column
		for(int i = 0; i < 3; i++)
		{
			if(gameBoard[i][theColumn].equals(theMarker))
			{
				
			}
		}
	}
	

}
