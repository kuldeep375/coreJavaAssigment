class OneBHK
{
	public int roomArea;
	public int hallArea;
	public int price;
	
	OneBHK()
	{
		roomArea=0;
		hallArea=0;
		price=0;
	}
	
	OneBHK(int roomArea, int hallArea,int price)
	{
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;	
	}

	void show()
	{
		System.out.println(roomArea+ " " +hallArea+ " " +price);
	}
}

class TwoBHK extends OneBHK
{
	public int room2Area; 
	TwoBHK()
	{
		super();
		room2Area=0;		
	}
	TwoBHK(int roomArea, int hallArea,int price,int room2Area)	
	{
		super(roomArea,hallArea,price);
		this.room2Area=room2Area;
	}

	void show()
	{
		System.out.println(super.roomArea+ " " +super.hallArea+ " " +super.price+ " " +room2Area);
	}
}

class Demo1
{
	public static void main(String args[])
	{
		TwoBHK tb = new TwoBHK(22,45,3500,25);
		tb.show();
	}
}