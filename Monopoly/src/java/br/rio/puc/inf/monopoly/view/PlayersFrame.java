package br.rio.puc.inf.monopoly.view;

import br.rio.puc.inf.monopoly.Constants;
import br.rio.puc.inf.monopoly.model.Pawn;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PlayersFrame
	extends JFrame
	implements ActionListener
{

	public PlayersFrame()
	{
		super( "Monopoly" );
		this.setSize( 250, 500 );
		setResizable( false );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		final int xPos = ( ( screenSize.width / 2 ) - 125 );
		final int yPos = ( ( screenSize.height / 2 ) - 150 );
		this.setLocation( xPos, yPos );

		this.mTextField1 = new JTextField( 15 );
		this.mTextField2 = new JTextField( 15 );
		this.mTextField3 = new JTextField( 15 );
		this.mTextField4 = new JTextField( 15 );
		this.mTextField5 = new JTextField( 15 );
		this.mTextField6 = new JTextField( 15 );

		final Container contentPane = getContentPane();
		final FlowLayout layout = new FlowLayout();
		contentPane.setLayout( layout );

		final JLabel title = new JLabel( "Bem-Vindos ao Monopoly !" );
		title.setFont( new Font( "TimesRoman", Font.PLAIN, 20 ) );
		contentPane.add( title );

		final JLabel subtitle = new JLabel( "Entre com o nome dos jogadores:" );
		contentPane.add( subtitle );

		final JLabel label1 = new JLabel( "Player1: " );
		contentPane.add( label1 );
		contentPane.add( this.mTextField1 );

		final JLabel label2 = new JLabel( "Player2: " );
		contentPane.add( label2 );
		contentPane.add( this.mTextField2 );

		final JLabel label3 = new JLabel( "Player3: " );
		contentPane.add( label3 );
		contentPane.add( this.mTextField3 );

		final JLabel label4 = new JLabel( "Player4: " );
		contentPane.add( label4 );
		contentPane.add( this.mTextField4 );

		final JLabel label5 = new JLabel( "Player5: " );
		contentPane.add( label5 );
		contentPane.add( this.mTextField5 );

		final JLabel label6 = new JLabel( "Player6: " );
		contentPane.add( label6 );
		contentPane.add( this.mTextField6 );

		final JButton okBtn = new JButton( "Comece o Jogo!" );
		okBtn.addActionListener( this );
		contentPane.add( okBtn );

		this.mColorList = new LinkedList<Color>();
		this.mColorList.add( Color.blue );
		this.mColorList.add( Color.red );
		this.mColorList.add( Color.green );
		this.mColorList.add( Color.yellow );
		this.mColorList.add( Color.gray );
		this.mColorList.add( Color.orange );

		setVisible( true );
	}

	public static void main( final String[] args )
	{
		new PlayersFrame();
	}

	@Override
	public void actionPerformed( final ActionEvent arg0 )
	{
		final List<Pawn> playersList = new ArrayList<Pawn>();

		int index = 1;
		String player = getNextPlayerName( index );
		while ( !player.isEmpty() )
		{
			final Pawn pawn = new Pawn( player, Constants.INITIAL_MONEY );
			final int random = ( int ) ( Math.random() * this.mColorList.size() );
			final Color randomColor = this.mColorList.remove( random );
			pawn.setColor( randomColor );
			playersList.add( pawn );

			player = getNextPlayerName( ++index );
		}

		if ( playersList.size() > 1 )
		{
			new MonopolyMainFrame( playersList );
			dispose();
		}
		else
		{
			JOptionPane.showMessageDialog( this, "São necessários no mínimo 2 jogadores,\n"
				+ " e o preenchimento tem que ser na ordem." );
		}
	}

	String getNextPlayerName( final int index )
	{
		String name = "";
		switch ( index )
		{
			case 1 :
				name = this.mTextField1.getText();
				break;
			case 2 :
				name = this.mTextField2.getText();
				break;
			case 3 :
				name = this.mTextField3.getText();
				break;
			case 4 :
				name = this.mTextField4.getText();
				break;
			case 5 :
				name = this.mTextField5.getText();
				break;
			case 6 :
				name = this.mTextField6.getText();
				break;
			default :
		}
		return name;
	}

	List<Color> mColorList;

	JTextField mTextField1;

	JTextField mTextField2;

	JTextField mTextField3;

	JTextField mTextField4;

	JTextField mTextField5;

	JTextField mTextField6;

}
