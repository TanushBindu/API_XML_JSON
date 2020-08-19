package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_extract
{
	private static FileInputStream f1;
	private static Properties pro;

	public static String get_property_baseurl() throws IOException
	{
		f1 = new FileInputStream(new File("D:\\API_FRAMEWORK\\REST_API\\global.properties"));
		pro = new Properties();
		pro.load(f1);
		return pro.getProperty("baseurl");
	}
	
	public static String getReportCinfogpath()
	{
		String Co_pa = pro.getProperty("config_file");
		return Co_pa;
	}
	public static void main(String[] args) 
	{
		System.out.println(getReportCinfogpath());
	}
}