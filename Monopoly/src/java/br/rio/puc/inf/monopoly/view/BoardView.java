package br.rio.puc.inf.monopoly.view;

import br.rio.puc.inf.monopoly.model.Board;
import br.rio.puc.inf.monopoly.model.BoardSquare;
import br.rio.puc.inf.monopoly.model.Pawn;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 * <p>
 * </p>
 * 
 * @author ryniere
 * @version 1.0 Created on 23/10/2012
 */
public class BoardView
	extends JComponent
{

	private static final GeneralPath PATH;

	/**
	 * <p>
	 * Field <code>serialVersionUID</code>
	 * </p>
	 */
	private static final long serialVersionUID = 1L;

	private static final BasicStroke STROKE_FINO = new BasicStroke( 0.1f );

	/**
	 * <p>
	 * </p>
	 */
	public BoardView( final Board board )
	{
		super();
		setBoard( board );
	}

	public Board getBoard()
	{
		return this.board;
	}

	/**
	 * @param g1
	 *            -
	 */
	@Override
	protected void paintComponent( final Graphics g1 )
	{

		try
		{
			final Board board = getBoard();
			final BufferedImage image = ImageIO.read( new File( board.getImagePath() ) );

			final Graphics2D g = ( Graphics2D ) g1;
			final Dimension size = getSize();

			// as coordenadas não são mais em pixels, mas relativas ao plano cartesiano definido
			// acima
			g.drawImage( image, null, 0, 0 );
			for ( final BoardSquare boardSquare : board.getBoardSquareList() )
			{
				int xPawns;
				int yPawns;
				if ( boardSquare.isHorizontalSquare() )
				{
					xPawns = 3;
					yPawns = 2;
				}
				else
				{
					xPawns = 2;
					yPawns = 3;
				}
				final int initX = boardSquare.getInitialXPosition();
				final int initY = boardSquare.getInitialYPosition();
				final int finalX = boardSquare.getFinalXPosition();
				final int finalY = boardSquare.getFinalYPosition();

				final int xLength = finalX - initX;
				final int yLength = finalY - initY;

				final int xDiff = xLength / xPawns;
				final int yDiff = yLength / yPawns;
				int x = initX;
				int y = initY;
				int count = 1;
				for ( final Pawn pawn : boardSquare.getPawnList() )
				{
					g.setColor( pawn.getColor() );
					g.fillOval( x + 2, y + 4, 25, 25 );

					count++;
					if ( count <= xPawns )
					{
						x += xDiff;
					}
					else
					{
						count = 1;
						x = initX;
						y += yDiff;
					}
				}

			}
			g.dispose();

		}
		catch ( final IOException e )
		{

		}
	}

	public void setBoard( final Board board )
	{
		this.board = board;
	}

	private Board board;

	static
	{
		PATH = new GeneralPath( GeneralPath.WIND_EVEN_ODD );

		final Random rand = new Random();
		final int n = 10;
		double x = Math.abs( rand.nextInt( 100 ) ) - 50;
		double y = Math.abs( rand.nextInt( 100 ) ) - 50;
		double tx, ty;
		for ( int i = 0; i < n; i++ )
		{
			tx = Math.abs( rand.nextInt( 100 ) ) - 50;
			ty = Math.abs( rand.nextInt( 100 ) ) - 50;
			PATH.append( new Line2D.Double( x, y, tx, ty ), true );
			x = tx;
			y = ty;
		}
	}

}
