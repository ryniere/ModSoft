package br.rio.puc.inf.monopoly.view;

import java.awt.BasicStroke;
import java.awt.Color;
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
	public BoardView()
	{
		super();
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
			final BufferedImage image = ImageIO.read( new File( "images/tabuleiro.png" ) );

			final Graphics2D g = ( Graphics2D ) g1;
			final Dimension size = getSize();

			// as coordenadas não são mais em pixels, mas relativas ao plano cartesiano definido
			// acima
			g.drawImage( image, null, 0, 0 );

			g.setColor( Color.yellow );
			g.drawOval( 75, 50, 21, 21 );
			g.setColor( Color.red );
			g.fillOval( 75 + 1, 50, 20, 20 );
			g.dispose();

		}
		catch ( final IOException e )
		{

		}
	}

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
