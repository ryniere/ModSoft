package br.rio.puc.inf.monopoly.model;

/**
 * <p>
 * </p>
 * 
 * @author ryniere
 * @version 1.0 Created on 25/10/2012
 */
public class AbstractGameItem
{

	public String getImagePath()
	{
		return this.imagePath;
	}

	public void setImagePath( final String imagePath )
	{
		this.imagePath = imagePath;
	}

	private String imagePath;

}
