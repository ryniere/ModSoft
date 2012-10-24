package br.rio.puc.inf.monopoly.test;

import br.rio.puc.inf.monopoly.view.BoardView;

import javax.swing.JFrame;

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
		final BoardView boardView = new BoardView();

		final JFrame f = new JFrame();
		f.getContentPane().add( boardView );
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		f.setSize( 800, 804 );
		f.setVisible( true );

	}

}
