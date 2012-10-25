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
	 */
	public BoardSquare( final int initialX, final int initialY, final int finalX, final int finalY )
	{
		setInitialXPosition( initialX );
		setInitialYPosition( initialY );
		setFinalXPosition( finalX );
		setFinalYPosition( finalY );
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

	/**
	 * <p>
	 * Field <code>pawnList</code>
	 * </p>
	 */
	private List<Pawn> pawnList;

}
