package br.rio.puc.inf.monopoly.model;

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
		list.add( secondBoardSquare );

		final BoardSquare thirdBoardSquare = new BoardSquare( 700, 175, 789, 235, true );
		thirdBoardSquare.setName( "SORTE-REVES" );
		list.add( thirdBoardSquare );

		final BoardSquare fourthBoardSquare = new BoardSquare( 700, 240, 789, 300, true );
		fourthBoardSquare.setName( "AV. PRESIDENTE VARGAS" );
		list.add( fourthBoardSquare );

		final BoardSquare fifthBoardSquare = new BoardSquare( 700, 305, 789, 365, true );
		fifthBoardSquare.setName( "AV. NOSSA S. DE COPACABANA" );
		list.add( fifthBoardSquare );

		final BoardSquare sixthBoardSquare = new BoardSquare( 705, 370, 789, 430, true );
		sixthBoardSquare.setName( "COMPANHIA FERROVIARIA" );
		list.add( sixthBoardSquare );

		final BoardSquare seventhBoardSquare = new BoardSquare( 705, 440, 789, 500, true );
		seventhBoardSquare.setName( "AV. BRIGADEIRO" );
		list.add( seventhBoardSquare );

		final BoardSquare eighthBoardSquare = new BoardSquare( 705, 505, 789, 565, true );
		eighthBoardSquare.setName( "COMPANHIA DE VIACAO" );
		list.add( eighthBoardSquare );

		final BoardSquare ninthBoardSquare = new BoardSquare( 705, 570, 789, 630, true );
		ninthBoardSquare.setName( "AV. REBOUCAS" );
		list.add( ninthBoardSquare );

		final BoardSquare tenthBoardSquare = new BoardSquare( 705, 640, 789, 700, true );
		tenthBoardSquare.setName( "AV. 9 DE JULHO" );
		list.add( tenthBoardSquare );

		final BoardSquare prisonBoardSquare = new BoardSquare( 705, 710, 789, 790, true );
		prisonBoardSquare.setName( "PRISAO" );
		list.add( prisonBoardSquare );

		final BoardSquare europeAvBoardSquare = new BoardSquare( 635, 705, 702, 798, false );
		europeAvBoardSquare.setName( "AV. EUROPA" );
		list.add( europeAvBoardSquare );

		final BoardSquare reverseLuckBoardSquare = new BoardSquare( 568, 705, 634, 798, false );
		reverseLuckBoardSquare.setName( "SORTE-REVES" );
		list.add( reverseLuckBoardSquare );

		final BoardSquare augustaStreetBoardSquare = new BoardSquare( 501, 705, 634, 798, false );
		augustaStreetBoardSquare.setName( "R. AUGUSTA" );
		list.add( augustaStreetBoardSquare );

		final BoardSquare pacaembuAvBoardSquare = new BoardSquare( 434, 705, 501, 798, false );
		pacaembuAvBoardSquare.setName( "AV. PACAEMBU" );
		list.add( pacaembuAvBoardSquare );

		final BoardSquare taxiCompanyBoardSquare = new BoardSquare( 367, 705, 434, 798, false );
		taxiCompanyBoardSquare.setName( "CIA DE TAXI" );
		list.add( taxiCompanyBoardSquare );

		final BoardSquare reverseLuck3BoardSquare = new BoardSquare( 299, 705, 367, 798, false );
		reverseLuck3BoardSquare.setName( "SORTE-REVES" );
		list.add( reverseLuck3BoardSquare );

		final BoardSquare interlagosBoardSquare = new BoardSquare( 231, 705, 299, 798, false );
		interlagosBoardSquare.setName( "INTERLAGOS" );
		list.add( interlagosBoardSquare );

		final BoardSquare profitOrShareBoardSquare = new BoardSquare( 166, 705, 231, 798, false );
		profitOrShareBoardSquare.setName( "LUCROS OU DIVIDENDOS" );
		list.add( profitOrShareBoardSquare );

		final BoardSquare morumbiBoardSquare = new BoardSquare( 98, 705, 166, 798, false );
		morumbiBoardSquare.setName( "MORUMBI" );
		list.add( morumbiBoardSquare );

		final BoardSquare stopBoardSquare = new BoardSquare( 1, 705, 98, 798, true );
		stopBoardSquare.setName( "PARADA" );
		list.add( stopBoardSquare );

		final BoardSquare flamengoBoardSquare = new BoardSquare( 1, 638, 98, 705, true );
		flamengoBoardSquare.setName( "FLAMENGO" );
		list.add( flamengoBoardSquare );

		final BoardSquare reverseLuck4BoardSquare = new BoardSquare( 1, 571, 98, 638, true );
		reverseLuck4BoardSquare.setName( "SORTE-REVES" );
		list.add( reverseLuck4BoardSquare );

		final BoardSquare botafogoStreetBoardSquare = new BoardSquare( 1, 502, 98, 572, true );
		botafogoStreetBoardSquare.setName( "BOTAFOGO" );
		list.add( botafogoStreetBoardSquare );

		final BoardSquare taxBoardSquare = new BoardSquare( 1, 438, 98, 504, true );
		taxBoardSquare.setName( "IMPOSTO DE RENDA" );
		list.add( taxBoardSquare );

		final BoardSquare navigationCompanyBoardSquare = new BoardSquare( 1, 371, 98, 437, true );
		navigationCompanyBoardSquare.setName( "CIA DE NAVEGAÇÃO" );
		list.add( navigationCompanyBoardSquare );

		final BoardSquare brasilAvBoardSquare = new BoardSquare( 1, 303, 98, 368, true );
		brasilAvBoardSquare.setName( "AVENIDA BRASIL" );
		list.add( brasilAvBoardSquare );

		final BoardSquare reverseLuck5BoardSquare = new BoardSquare( 1, 237, 98, 301, true );
		reverseLuck5BoardSquare.setName( "SORTE-REVES" );
		list.add( reverseLuck5BoardSquare );

		final BoardSquare paulistaAvBoardSquare = new BoardSquare( 1, 171, 98, 237, true );
		paulistaAvBoardSquare.setName( "AVENIDA PAULISTA" );
		list.add( paulistaAvBoardSquare );

		final BoardSquare jardimEuropaBoardSquare = new BoardSquare( 1, 106, 98, 171, true );
		jardimEuropaBoardSquare.setName( "JARDIM EUROPA" );
		list.add( jardimEuropaBoardSquare );

		final BoardSquare goToPrisionBoardSquare = new BoardSquare( 1, 13, 98, 104, true );
		goToPrisionBoardSquare.setName( "VÁ PARA A PRISÃO" );
		list.add( goToPrisionBoardSquare );

		final BoardSquare copacabanaBoardSquare = new BoardSquare( 106, 13, 169, 104, false );
		copacabanaBoardSquare.setName( "COPACABANA" );
		list.add( copacabanaBoardSquare );

		final BoardSquare airCompanyBoardSquare = new BoardSquare( 171, 13, 236, 104, false );
		airCompanyBoardSquare.setName( "CIA AÉREA" );
		list.add( airCompanyBoardSquare );

		final BoardSquare vieiraSoutoAvBoardSquare = new BoardSquare( 237, 13, 301, 104, false );
		vieiraSoutoAvBoardSquare.setName( "AVENIDA VIEIRA SOUTO" );
		list.add( vieiraSoutoAvBoardSquare );

		final BoardSquare atlanticaAvBoardSquare = new BoardSquare( 303, 13, 366, 104, false );
		atlanticaAvBoardSquare.setName( "AVENIDA ATLÂNTICA" );
		list.add( atlanticaAvBoardSquare );

		final BoardSquare airTaxiCompanyBoardSquare = new BoardSquare( 367, 13, 435, 104, false );
		airTaxiCompanyBoardSquare.setName( "CIA TAXI AÉREO" );
		list.add( airTaxiCompanyBoardSquare );

		final BoardSquare ipanemaBoardSquare = new BoardSquare( 434, 13, 500, 104, false );
		ipanemaBoardSquare.setName( "IPANEMA" );
		list.add( ipanemaBoardSquare );

		final BoardSquare reverseLuck6BoardSquare = new BoardSquare( 500, 13, 565, 104, false );
		reverseLuck6BoardSquare.setName( "SORTE-REVES" );
		list.add( reverseLuck6BoardSquare );

		final BoardSquare jardimPaulistaBoardSquare = new BoardSquare( 564, 13, 630, 104, false );
		jardimPaulistaBoardSquare.setName( "JARDIM PAULISTA" );
		list.add( jardimPaulistaBoardSquare );

		final BoardSquare brooklinBoardSquare = new BoardSquare( 627, 13, 697, 104, false );
		brooklinBoardSquare.setName( "BROOKLIN" );
		list.add( brooklinBoardSquare );

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
