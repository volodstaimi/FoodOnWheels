package Setup;

public class FoodDetails {
	private int foodID,resID;
	private String foodName;
	private double foodPrice;
	
	FoodDetails()
	{
		
	}
	
	
	public FoodDetails(int foodID, int resID, String foodName, double foodPrice) {
		super();
		this.foodID = foodID;
		this.resID = resID;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}


	FileOperations fop=new FileOperations();
	public void save()
	{	String data=(Integer.toString(foodID)+","+Integer.toString(resID)+","+foodName+","+foodPrice+"\n");
		fop.writeFile("FoodDetails", data);}
	
}
