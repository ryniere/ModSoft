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

	public Pawn()
	{
		setBoardSquarePosition( 0 );
	}

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

	public int getBoardSquarePosition()
	{
		return this.boardSquarePosition;
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

	public void setBoardSquarePosition( final int boardSquarePosition )
	{
		this.boardSquarePosition = boardSquarePosition;
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

	private int boardSquarePosition;

	/**
	 * <p>
	 * Field <code>color</code>
	 * </p>
	 */
	private Color color;

}
