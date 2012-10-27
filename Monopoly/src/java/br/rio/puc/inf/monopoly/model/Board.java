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
	public Board( final List<Pawn> pawnList )
	{
		setImagePath( "images/tabuleiro.png" );
		setBoardSquareList( new LinkedList() );
		final List list = getBoardSquareList();

		final BoardSquare initalBoardSquare = new BoardSquare( 695, 14, 789, 107, true );
		initalBoardSquare.setName( "PARTIDA" );
		initalBoardSquare.getPawnList().addAll( pawnList );

		list.add( initalBoardSquare );

		final BoardSquare secondBoardSquare = new BoardSquare( 700, 110, 789, 170, true );
		secondBoardSquare.setName( "LEBLON" );
		secondBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		secondBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		secondBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		secondBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		secondBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		secondBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( secondBoardSquare );

		final BoardSquare thirdBoardSquare = new BoardSquare( 700, 175, 789, 235, true );
		thirdBoardSquare.setName( "SORTE-REVES" );
		thirdBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		thirdBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		thirdBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		thirdBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		thirdBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		thirdBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( thirdBoardSquare );

		final BoardSquare fourthBoardSquare = new BoardSquare( 700, 240, 789, 300, true );
		fourthBoardSquare.setName( "AV. PRESIDENTE VARGAS" );
		fourthBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		fourthBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		fourthBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		fourthBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		fourthBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		fourthBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( fourthBoardSquare );

		final BoardSquare fifthBoardSquare = new BoardSquare( 700, 305, 789, 365, true );
		fifthBoardSquare.setName( "AV. NOSSA S. DE COPACABANA" );
		fifthBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		fifthBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		fifthBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		fifthBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		fifthBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		fifthBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( fifthBoardSquare );

		final BoardSquare sixthBoardSquare = new BoardSquare( 705, 370, 789, 430, true );
		sixthBoardSquare.setName( "COMPANHIA FERROVIARIA" );
		sixthBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		sixthBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		sixthBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		sixthBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		sixthBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		sixthBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( sixthBoardSquare );

		final BoardSquare seventhBoardSquare = new BoardSquare( 705, 440, 789, 500, true );
		seventhBoardSquare.setName( "AV. BRIGADEIRO" );
		seventhBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		seventhBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		seventhBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		seventhBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		seventhBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		seventhBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( seventhBoardSquare );

		final BoardSquare eighthBoardSquare = new BoardSquare( 705, 505, 789, 565, true );
		eighthBoardSquare.setName( "COMPANHIA DE VIA��O" );
		eighthBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		eighthBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		eighthBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		eighthBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		eighthBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		eighthBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( eighthBoardSquare );

		final BoardSquare ninthBoardSquare = new BoardSquare( 705, 570, 789, 630, true );
		ninthBoardSquare.setName( "AV. REBOU�AS" );
		ninthBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		ninthBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		ninthBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		ninthBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		ninthBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		ninthBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( ninthBoardSquare );

		final BoardSquare tenthBoardSquare = new BoardSquare( 705, 640, 789, 700, true );
		tenthBoardSquare.setName( "AV. 9 DE JULHO" );
		tenthBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		tenthBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		tenthBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		tenthBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		tenthBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		tenthBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( tenthBoardSquare );

		final BoardSquare prisonBoardSquare = new BoardSquare( 705, 710, 789, 790, true );
		thirdBoardSquare.setName( "PRIS�O" );
		prisonBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		prisonBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		prisonBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		prisonBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		prisonBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		prisonBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );

		list.add( prisonBoardSquare );

		final BoardSquare europeAvBoardSquare = new BoardSquare( 635, 705, 702, 798, false );
		europeAvBoardSquare.setName( "AV. EUROPA" );
		europeAvBoardSquare.getPawnList().add( new Pawn( Color.blue ) );
		europeAvBoardSquare.getPawnList().add( new Pawn( Color.red ) );
		europeAvBoardSquare.getPawnList().add( new Pawn( Color.yellow ) );
		europeAvBoardSquare.getPawnList().add( new Pawn( Color.black ) );
		europeAvBoardSquare.getPawnList().add( new Pawn( Color.green ) );
		europeAvBoardSquare.getPawnList().add( new Pawn( Color.magenta ) );
		list.add( europeAvBoardSquare );

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
