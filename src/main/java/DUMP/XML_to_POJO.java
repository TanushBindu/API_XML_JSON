package DUMP;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import pojo.Employee;
public class XML_to_POJO 
{
	public static void main(String[] args) throws JAXBException 
	{
		String xml = "<employee>\r\n" + 
				"  <name>Tanush</name>\r\n" + 
				"  <age>25</age>\r\n" + 
				"</employee>";
		
		JAXBContext jaxbcontext = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshall = jaxbcontext.createUnmarshaller();
		Employee s1 = (Employee)unmarshall.unmarshal(new StringReader(xml));
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		
		Marshaller mars = jaxbcontext.createMarshaller();
		s1.setAge(30);
		s1.setName("Bindu");
		StringWriter s2 = new StringWriter();
		mars.marshal(s1, s2);
		System.out.println(s2);
	}
}