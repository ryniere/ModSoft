package br.rio.puc.inf.monopoly.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * </p>
 * 
 * @author ryniere
 * @version 1.0 Created on 25/10/2012
 */
public class BoardSquare
{

	/**
	 * <p>
	 * </p>
	 * 
	 * @param initialX
	 * @param initialY
	 * @param finalX
	 * @param finalY
	 * @param isHorizontalSquare
	 */
	public BoardSquare(
		final int initialX,
		final int initialY,
		final int finalX,
		final int finalY,
		final boolean isHorizontalSquare )
	{
		setInitialXPosition( initialX );
		setInitialYPosition( initialY );
		setFinalXPosition( finalX );
		setFinalYPosition( finalY );
		setHorizontalSquare( isHorizontalSquare );
		setPawnList( new ArrayList<Pawn>() );
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @return
	 */
	public int getFinalXPosition()
	{
		return this.finalXPosition;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @return
	 */
	public int getFinalYPosition()
	{
		return this.finalYPosition;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @return
	 */
	public int getInitialXPosition()
	{
		return this.initialXPosition;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @return
	 */
	public int getInitialYPosition()
	{
		return this.initialYPosition;
	}

	public String getName()
	{
		return this.name;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @return
	 */
	public List<Pawn> getPawnList()
	{
		return this.pawnList;
	}

	public boolean isHorizontalSquare()
	{
		return this.horizontalSquare;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @param finalXPosition
	 */
	public void setFinalXPosition( final int finalXPosition )
	{
		this.finalXPosition = finalXPosition;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @param finalYPosition
	 */
	public void setFinalYPosition( final int finalYPosition )
	{
		this.finalYPosition = finalYPosition;
	}

	public void setHorizontalSquare( final boolean horizontalSquare )
	{
		this.horizontalSquare = horizontalSquare;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @param initialXPosition
	 */
	public void setInitialXPosition( final int initialXPosition )
	{
		this.initialXPosition = initialXPosition;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @param initialYPosition
	 */
	public void setInitialYPosition( final int initialYPosition )
	{
		this.initialYPosition = initialYPosition;
	}

	public void setName( final String name )
	{
		this.name = name;
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @param pawnList
	 */
	public void setPawnList( final List<Pawn> pawnList )
	{
		this.pawnList = pawnList;
	}

	/**
	 * <p>
	 * Field <code>finalXPosition</code>
	 * </p>
	 */
	private int finalXPosition;

	/**
	 * <p>
	 * Field <code>finalYPosition</code>
	 * </p>
	 */
	private int finalYPosition;

	private boolean horizontalSquare;

	/**
	 * <p>
	 * Field <code>initialXPosition</code>
	 * </p>
	 */
	private int initialXPosition;

	/**
	 * <p>
	 * Field <code>initialYPosition</code>
	 * </p>
	 */
	private int initialYPosition;

	private String name;

	/**
	 * <p>
	 * Field <code>pawnList</code>
	 * </p>
	 */
	private List<Pawn> pawnList;

}
