package Setup;
import java.util.*;
public class FoodDetails {
	private int foodID ;
	private int resID ;
	private String foodName;
	private double foodPrice;
	
	FoodDetails()
	{
		
	}
	
	
	public FoodDetails(int foodID, int resID, String foodName, double foodPrice)
	{
		this.foodID=foodID;
		this.resID= resID;
		this.foodName= foodName;
		this.foodPrice= foodPrice;
		//save();
	}


	public int getFoodID() {
		return foodID;
	}


	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}


	public int getResID() {
		return resID;
	}


	public void setResID(int resID) {
		this.resID = resID;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public double getFoodPrice() {
		return foodPrice;
	}


	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}


	FileOperations fop=new FileOperations();

	public void save(ArrayList <FoodDetails>fd )
	{	String data="";
		for (int i=0;i<fd.size();i++)
		{data=(Integer.toString(fd.get(i).foodID)+","+Integer.toString(fd.get(i).resID)+","+fd.get(i).foodName+","+fd.get(i).foodPrice+"\n");}
		
		fop.writeFile("FoodDetails.txt", data);}
	

//	public void extract()
//	{
//		String data= fop.readFile("FoodDetails.txt");
//		String attributes[]=data.split(",");
//		foodID.add(Integer.parseInt(attributes[0]));
//		resID.add(Integer.parseInt(attributes[1]));
//		foodName.add(attributes[2]);
//		foodPrice.add(Double.parseDouble(attributes[3]));
//	}
	
	public String getfoodInfo()
	{	
		String data; 
		data=("Food ID= "+String.valueOf(foodID)+" | "+ "Food Name= "+foodName+" | "+"Price= "+String.valueOf(foodPrice));
		return data;
	}




	
//	public static void main(String[] args) {
//		FoodDetails fd= new FoodDetails(1,1,"burger",200.0);
//		FoodDetails f= new FoodDetails(2,1,"pizza",400.0);
//		fd.save();
//		f.save();
//		
//	}
	
		}
		
	
	
