package pl.kriss3.comp1451;

/**
 * Chess Piece class to abstract chess piece.
 * It should be able to represent any chess piece on the chess board;
 * @author kszczurowski
 * @since 2017-02-17
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class06_Lab01_InClass.git
 */
public class ChessPiece 
{
	private Color color;
	private int value;
	
	public ChessPiece(int value)
	{
		this.value = value;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ChessPiece))
			return false;
		ChessPiece other = (ChessPiece) obj;
		if (color != other.color)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	public int getValue()
	{
		return value;
	}
	
	public void setColor(Color c)
	{
		this.color = c;
	}
	
	public void move()
	{
		System.out.println("moving ...");
	}
	
	@Override
	public String toString()
	{
		return String.format("%5s %6s %4s", color, this.getClass().getSimpleName(),value);
	}
}
