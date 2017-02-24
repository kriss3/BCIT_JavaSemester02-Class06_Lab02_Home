package pl.kriss3.comp1451;

public class Bishop extends ChessPiece 
{
	public static final int BISHOP_VALUE = 3;
	
	public Bishop()
	{
		super(BISHOP_VALUE);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public void move()
	{
		System.out.println("diagonally");
	}
	
}
