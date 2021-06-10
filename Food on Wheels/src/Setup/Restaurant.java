package Setup;
import java.util.*;
public class Restaurant  {
	ArrayList<Restaurant> RestaurantList= new ArrayList<Restaurant>();
	Restaurant restaurant;
	private boolean approved=false;
	private int resID=0;
	private String resName,resAddress,resPhone;
	FoodDetails FD;
	FileOperations fop= new FileOperations();
	Restaurant(){}

	public Restaurant(int resID, String resName, String resAddress, String resPhone, boolean approved) {
		
		this.resID = resID;
		this.resName = resName;
		this.resAddress = resAddress;
		this.resPhone = resPhone;
		this.approved=approved;
	}

	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResAddress() {
		return resAddress;
	}
	public void setResAddress(String resAddress) {
		this.resAddress = resAddress;
	}
	public String getResPhone() {
		return resPhone;
	}
	public void setResPhone(String resPhone) {
		this.resPhone = resPhone;
	}
	private void AddNewItem(int foodID, int resID, String foodName, double foodPrice)
	{
		FD= new FoodDetails(foodID, resID, foodName,foodPrice);
	}
	private void AddNewResturant(int resID, String resName, String resAddress, String resPhone,boolean approved,int foodID, String foodName, double foodPrice)
	{
		FD= new FoodDetails(foodID, resID, foodName,foodPrice);
		restaurant= new Restaurant(resID, resName, resAddress, resPhone,approved);
		RestaurantList.add(restaurant);
	}
	private void savedata()
	{
		String data="";
		
		for (int i=0;i<RestaurantList.size();i++)
		{
			restaurant=RestaurantList.get(i);
			data=(String.valueOf(i)+","+restaurant.resName+","+restaurant.resAddress+","+restaurant.resPhone+","+restaurant.approved)+"\n"+data;
		}
			fop.writeFile("Restaurant_Data.txt", data);	
	}
	private void getData()
	{	
		String data= fop.readFile("Restaurant_Data.txt");
		String record[]=data.split("\n");
		for (int i=0;i<record.length;i++)
		{	String atribute[]=record[i].split(",");
			for (int j=0;j<atribute.length;j++)
			{
				restaurant= new Restaurant (Integer.parseInt(atribute[0]),atribute[1],atribute[2], atribute[3],Boolean.getBoolean(atribute[4]));
				RestaurantList.add(i,restaurant);
			}
		}
	}
	private void orders()
	{
		fop.readFile("OrdersList");
		
		
		
	}
}
