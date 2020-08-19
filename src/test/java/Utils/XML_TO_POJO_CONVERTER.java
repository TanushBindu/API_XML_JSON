package Utils;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import POJO_XML.Account;
import io.restassured.response.Response;

public class XML_TO_POJO_CONVERTER 
{
	public static Object xml_to_pojo(JAXBContext jaxbcontext,String res) throws JAXBException
	{
		Unmarshaller unmarshall = jaxbcontext.createUnmarshaller();
		Object s2 = unmarshall.unmarshal(new StringReader(res));
		return s2;
	}
}
