package br.rio.puc.inf.monopoly.test;

import br.rio.puc.inf.monopoly.controller.BoardController;
import br.rio.puc.inf.monopoly.model.Board;
import br.rio.puc.inf.monopoly.model.Pawn;
import br.rio.puc.inf.monopoly.view.BoardView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * <p>
 * </p>
 * 
 * @author ryniere
 * @version 1.0 Created on 23/10/2012
 */
public class MainTest
{

	/**
	 * <p>
	 * </p>
	 * 
	 * @param args
	 */
	public static void main( final String[] args )
	{
		testBoardView();
	}

	public static void testBoardView()
	{

		final List<Pawn> pawnList = new ArrayList<Pawn>();
		final Pawn bluePawn = new Pawn( Color.blue );
		pawnList.add( bluePawn );
		pawnList.add( new Pawn( Color.red ) );
		pawnList.add( new Pawn( Color.yellow ) );
		pawnList.add( new Pawn( Color.black ) );
		pawnList.add( new Pawn( Color.green ) );
		pawnList.add( new Pawn( Color.magenta ) );

		final BoardController boardController = new BoardController( pawnList );
		final Board board = boardController.getBoard();
		final BoardView boardView = new BoardView( board );

		final JFrame f = new JFrame( "Monopoly" );

		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		f.setExtendedState( JFrame.MAXIMIZED_BOTH );
		f.setVisible( true );

		final JPanel borderPanel = new JPanel();
		borderPanel.setLayout( new BorderLayout( 30, 0 ) );
		borderPanel.add( boardView, BorderLayout.CENTER );

		final JPanel gridPanel = new JPanel();
		gridPanel.setLayout( new GridLayout( 20, 3 ) );

		gridPanel.add( new JLabel( "" ) );
		gridPanel.add( new JLabel( "  Jogadores:  " ) );
		gridPanel.add( new JLabel( "" ) );
		// for inserido os jogadores
		gridPanel.add( new JLabel( "" ) );
		gridPanel.add( new JButton( "Sorter Dados" ) );

		borderPanel.add( gridPanel, BorderLayout.WEST );

		borderPanel.add( new JLabel( "Aqui fica sendo um lugar que diz de quem eh a vez" ), BorderLayout.SOUTH );

		f.getContentPane().add( borderPanel );

	}

}
