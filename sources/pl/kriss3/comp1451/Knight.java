package pl.kriss3.comp1451;

public class Knight extends ChessPiece 
{
	public static final int KINIGHT_VALUE = 2;
	
	public Knight()
	{
		super(KINIGHT_VALUE);
	}	
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public void move()
	{
		System.out.println("like an L");
	}
}
