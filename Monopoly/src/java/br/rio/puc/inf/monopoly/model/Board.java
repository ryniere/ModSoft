package br.rio.puc.inf.monopoly.model;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * </p>
 * 
 * @author ryniere
 * @version 1.0 Created on 25/10/2012
 */
public class Board
	extends AbstractGameItem
{

	/**
	 * <p>
	 * </p>
	 */
	public Board()
	{
		setImagePath( "images/tabuleiro.png" );
		setBoardSquareList( new LinkedList() );
		final List list = getBoardSquareList();
		final BoardSquare initalBoardSquare = new BoardSquare( 695, 14, 789, 107 );
		initalBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		initalBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		initalBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		initalBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		initalBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		initalBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );
		list.add( initalBoardSquare );

	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @return
	 */
	public List<BoardSquare> getBoardSquareList()
	{
		return this.boardSquareList;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @param boardSquareList
	 */
	public void setBoardSquareList( final List<BoardSquare> boardSquareList )
	{
		this.boardSquareList = boardSquareList;
	}

	/**
	 * <p>
	 * Field <code>boardSquareList</code>
	 * </p>
	 */
	private List<BoardSquare> boardSquareList;

}
