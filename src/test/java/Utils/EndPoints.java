package Utils;

public enum EndPoints
{
	List_of_user("/api/users?page=2"),
	Single_user("/api/users/2"),
	Single_user_not_found("/api/users/23"),
	List_resource("/api/unknown"),
	Single_resource("/api/unknown/2"),
	Single_user_not_found_resource("/api/unknown/23"),
	Delay_response("/api/users?delay=3"),
	Create_Single_user("/api/users");
	
	private String end;
	public String getEnd() 
	{
		return end;
	}
	EndPoints(String end)
	{
	 this.end=end;	
	}
}
