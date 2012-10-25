package br.rio.puc.inf.monopoly.model;

import java.awt.Color;

/**
 * <p>
 * </p>
 * 
 * @author ryniere
 * @version 1.0 Created on 25/10/2012
 */
public class Pawn
{

	/**
	 * <p>
	 * </p>
	 * 
	 * @param color
	 */
	public Pawn( final Color color )
	{
		setColor( color );
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @return
	 */
	public Color getColor()
	{
		return this.color;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @param color
	 */
	public void setColor( final Color color )
	{
		this.color = color;
	}

	/**
	 * <p>
	 * Field <code>color</code>
	 * </p>
	 */
	private Color color;

}
