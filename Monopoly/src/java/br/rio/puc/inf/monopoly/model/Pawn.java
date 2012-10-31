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
	
	public Pawn( String name, float money )
	{
		setBoardSquarePosition( 0 );
		this.name = name;
		this.money = money;
	}
	
	public Pawn( String name, float money, Color color )
	{
		setBoardSquarePosition( 0 );
		this.name = name;
		this.money = money;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
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
	
	private String name;
	
	private float money;

}
