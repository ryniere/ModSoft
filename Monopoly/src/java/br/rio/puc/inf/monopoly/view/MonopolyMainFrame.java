package br.rio.puc.inf.monopoly.view;

import br.rio.puc.inf.monopoly.controller.BoardController;
import br.rio.puc.inf.monopoly.model.Board;
import br.rio.puc.inf.monopoly.model.Pawn;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MonopolyMainFrame
	/* extends JFrame */implements ActionListener
{

	MonopolyMainFrame( final List<Pawn> pawnList )
	{
		this.mPawnList = pawnList;
		testBoardView();
	}

	@Override
	public void actionPerformed( final ActionEvent arg0 )
	{

		final int numero1 = ( int ) ( Math.random() * 6 ) + 1;
		final int numero2 = ( int ) ( Math.random() * 6 ) + 1;

		this.mBarraNotficacoes.setText( "Resultado dos dados: " + numero1 + " e " + numero2 + "." );

		final Pawn pawn = this.mPawnList.get( this.mCurrentPawn );
		this.mCurrentPawn++;
		if ( this.mCurrentPawn == this.mPawnList.size() )
		{
			this.mCurrentPawn = 0;
		}

		this.mBoardController.jumpBoardSquares( numero1 + numero2, pawn );

		this.mBoardView.repaint();

	}

	public void testBoardView()
	{

		this.mBoardController = new BoardController( this.mPawnList );
		final Board board = this.mBoardController.getBoard();
		this.mBoardView = new BoardView( board );

		final JFrame f = new JFrame( "Monopoly" );

		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		f.setExtendedState( JFrame.MAXIMIZED_BOTH );
		f.setVisible( true );

		final JPanel borderPanel = new JPanel();
		borderPanel.setLayout( new BorderLayout( 30, 0 ) );
		borderPanel.add( this.mBoardView, BorderLayout.CENTER );

		final JPanel gridPanel = new JPanel();
		gridPanel.setLayout( new GridLayout( 20, 3 ) );

		final JButton sortear = new JButton( "Jogar Dados" );
		sortear.addActionListener( this );

		gridPanel.add( new JLabel( "" ) );
		gridPanel.add( new JLabel( "  Jogadores:  " ) );
		gridPanel.add( new JLabel( "" ) );
		for ( int i = 0; i < this.mPawnList.size(); i++ )
		{
			final Pawn pawn = this.mPawnList.get( i );
			final JLabel label = new JLabel( pawn.getName() + " - " + String.valueOf( pawn.getMoney() ) );
			label.setForeground( pawn.getColor() );
			gridPanel.add( label );
		}
		gridPanel.add( new JLabel( "" ) );
		gridPanel.add( sortear );

		borderPanel.add( gridPanel, BorderLayout.WEST );

		this.mBarraNotficacoes = new JLabel( "Aqui diz de quem eh a vez" );
		borderPanel.add( this.mBarraNotficacoes, BorderLayout.SOUTH );

		f.getContentPane().add( borderPanel );

	}

	JLabel mBarraNotficacoes;

	BoardController mBoardController = null;

	BoardView mBoardView = null;

	int mCurrentPawn = 0;

	List<Pawn> mPawnList;
}
