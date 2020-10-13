class Tile
{
	public int edgelength;
	Tile()
	{
		edgelength=0;	
	}
	
	Tile(int edgelength)
	{
		this.edgelength=edgelength;
	}
}
	

class Floor
{
	public int length;
	public int width;

	Floor()
	{
		length=0;	
		width=0;	
	}

	Floor(int length,int width)
	{
		this.length=length;
		this.width=width;
	}

	void totalTiles(Tile t)
	{
		int sqarea=(2*t.edgelength);
		int farea=length*width;

		float totaltile = (float)(farea/sqarea);
		System.out.println("total tiles:  "+totaltile);
	}
}

class Floordemo
{
	public static void main(String args[])
	{
		Tile ts = new Tile(2);
		Floor f = new Floor(16,3);
		f.totalTiles(ts);
	}
}