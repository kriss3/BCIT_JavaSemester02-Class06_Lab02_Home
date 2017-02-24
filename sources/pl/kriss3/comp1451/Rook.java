package pl.kriss3.comp1451;

public class Rook extends ChessPiece 
{
	public static final int ROOK_VALUE = 5;
	
	public Rook()
	{
		super(ROOK_VALUE);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public void move()
	{
		System.out.println("horizontally or vertically");
	}
	
}
