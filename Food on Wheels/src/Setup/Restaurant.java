package Setup;
import java.util.*;
public class Restaurant  {
	private ArrayList<Restaurant> RestaurantList= new ArrayList<Restaurant>();
	Restaurant restaurant;
	private boolean approved=false;
	private int resID=0;
	private String resName,resAddress,resPhone;
	private ArrayList<FoodDetails> FoodList= new ArrayList<FoodDetails>();
	FileOperations fop= new FileOperations();
	
	public Restaurant getRestaurantList(int i) {
		return RestaurantList.get(i);
	}

	public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
		RestaurantList = restaurantList;
	}


	Restaurant(){
//	Restaurant res = new Restaurant(0,"KFC","DHA","051",true);
//	res.AddNewItem(0,0,"burger1",200.0);
//	res.AddNewItem(1,3,"burger2",200.0);
//	res.AddNewItem(2,0,"burger3",200.0);
//		
//	Restaurant res2 = new Restaurant(1,"MAC","DHA","021",true);
//	Restaurant res3 = new Restaurant(2,"Pizzahut","DHA","041",true);
//	RestaurantList.add(res);
//	RestaurantList.add(res2);
//	RestaurantList.add(res3);
	savedata();
	}
	

	public Restaurant(int resID, String resName, String resAddress, String resPhone, boolean approved) {
		
		this.resID = resID;
		this.resName = resName;
		this.resAddress = resAddress;
		this.resPhone = resPhone;
		this.approved=approved;
	}
	public void pop()
	{
	Restaurant res = new Restaurant(0,"KFC","DHA","051",true);
	Restaurant res2 = new Restaurant(1,"MAC","DHA","021",true);
	Restaurant res3 = new Restaurant(2,"KFC","DHA","041",true);
	RestaurantList.add(res);
	RestaurantList.add(res2);
	RestaurantList.add(res3);
	savedata();
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
	
	
	public void AddNewItem(int resID, String foodName, double foodPrice)
	{
		FoodDetails FD= new FoodDetails((FoodList.size()), resID, foodName,foodPrice);
		FoodList.add(FD);
		FD.save(FoodList);
	}
	public ArrayList<FoodDetails> getFoodList() {
		return FoodList;
	}
	
	public String getFullFoodList(int resID) {
		String data="";
		for (int i=0;i<FoodList.size();i++) 
		{	if (resID==FoodList.get(i).getResID())
			data=data+"\n"+FoodList.get(i).getfoodInfo();
		}
		
		return data;
	}



	public void setFoodList(ArrayList<FoodDetails> foodList) {
		FoodList = foodList;
	}


	public void AddNewResturant(int resID, String resName, String resAddress, String resPhone,boolean approved,int foodID, String foodName, double foodPrice)
	{
		FoodDetails FD= new FoodDetails(foodID, resID, foodName,foodPrice);
		FoodList.add(FD);
		restaurant= new Restaurant(resID, resName, resAddress, resPhone,approved);
		RestaurantList.add(restaurant);
	}
	public void savedata()
	{
		String data="";
		
		for (int i=0;i<RestaurantList.size();i++)
		{
			restaurant=RestaurantList.get(i);
			data=(String.valueOf(i)+","+restaurant.resName+","+restaurant.resAddress+","+restaurant.resPhone+","+restaurant.approved)+"\n"+data;
		}
			fop.writeFile("Restaurant_Data.txt", data);	
			FoodDetails fd= new FoodDetails();
			fd.save(FoodList);
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
	
//	public void EditFoodDetails(int id, String foodname, double foodPrice)
//	{
//		FoodList.get(id).setFoodName(foodname);
//		FoodList.get(id).setFoodPrice(foodPrice);
//		savedata();
//	}
	
	public void deleteFoodDetail(int id)
	{
		if(!(id>=FoodList.size()))
		FoodList.remove(id);
	}
	
	
	
	private void orders()
	{
		fop.readFile("OrdersList");
		
		
		
	}
}
