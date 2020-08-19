package DUMP;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import pojo.Employee;

public class Marshaller_xml 
{
	public static void main(String[] args) throws JAXBException 
	{
		JAXBContext jaxbcontext = JAXBContext.newInstance(Employee.class);
		Marshaller mars = jaxbcontext.createMarshaller();
		
	}
}
