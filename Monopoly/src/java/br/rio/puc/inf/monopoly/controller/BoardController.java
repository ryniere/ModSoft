package br.rio.puc.inf.monopoly.controller;

import br.rio.puc.inf.monopoly.model.Board;
import br.rio.puc.inf.monopoly.model.BoardSquare;
import br.rio.puc.inf.monopoly.model.Pawn;

import java.util.List;

/**
 * <p>
 * </p>
 * 
 * @author ryniere
 * @version 1.0 Created on 27/10/2012
 */
public class BoardController
{

	public BoardController( final List<Pawn> pawnList )
	{
		super();

		setBoard( new Board( pawnList ) );
	}

	public Board getBoard()
	{
		return this.board;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @param numberOfSquaresToJump
	 * @param pawn
	 */
	public void jumpBoardSquares( final int numberOfSquaresToJump, final Pawn pawn )
	{
		final Board board = getBoard();
		final List<BoardSquare> boardSquareList = board.getBoardSquareList();
		final int pawnPosition = pawn.getBoardSquarePosition();
		final BoardSquare boardSquare = boardSquareList.get( pawnPosition );
		final List<Pawn> pawnList = boardSquare.getPawnList();
		pawnList.remove( pawn );

		final int boardSquareListSize = boardSquareList.size();

		final BoardSquare newBoardSquare;
		final int currentPositionPlusPositionsToJump = pawnPosition + numberOfSquaresToJump;
		if ( currentPositionPlusPositionsToJump < boardSquareListSize )
		{
			newBoardSquare = boardSquareList.get( currentPositionPlusPositionsToJump );
			pawn.setBoardSquarePosition( currentPositionPlusPositionsToJump );
		}
		else
		{
			final int squaresToJumpAtEnd = boardSquareListSize - pawnPosition;
			final int squaresToJumpAtBegin = numberOfSquaresToJump - squaresToJumpAtEnd;
			newBoardSquare = boardSquareList.get( squaresToJumpAtBegin );
			pawn.setBoardSquarePosition( squaresToJumpAtBegin );
		}
		newBoardSquare.getPawnList().add( pawn );
	}

	public void setBoard( final Board board )
	{
		this.board = board;
	}

	private Board board;

}
