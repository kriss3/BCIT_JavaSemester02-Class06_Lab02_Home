package pl.kriss3.comp1451;

public class Pawn extends ChessPiece 
{
	public static final int PAWN_VALUE = 2;
	boolean hasBeenPromoted;
	ChessPiece newPiece;

	public Pawn()
	{
		super(PAWN_VALUE);
	}
	
	public void promote(ChessPiece newPiece)
	{
		//cannot be King or a Pawn
		String newObjName = null;
		if(newPiece != null)
		{
			newObjName = newPiece.getClass().getSimpleName();
		}
		if(newObjName != "Pawn" || newObjName != "King")
		{
			switch(newObjName)
			{
			case "Rook" :
			{
				newPiece = new Rook();
				break;
			}
			}
			hasBeenPromoted = true;
		}
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasBeenPromoted ? 1231 : 1237);
		result = prime * result + ((newPiece == null) ? 0 : newPiece.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Pawn))
			return false;
		Pawn other = (Pawn) obj;
		if (hasBeenPromoted != other.hasBeenPromoted)
			return false;
		if (newPiece == null) {
			if (other.newPiece != null)
				return false;
		} else if (!newPiece.equals(other.newPiece))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public void move()
	{
		System.out.println("forward 1");
	}
}
