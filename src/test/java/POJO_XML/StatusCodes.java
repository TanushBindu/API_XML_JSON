package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class StatusCodes
{
    private String result;
    private String code;
    @XmlElement
    public String getResult ()
    {
        return result;
    }
    public void setResult (String result)
    {
        this.result = result;
    }
    @XmlElement
    public String getCode ()
    {
        return code;
    }
    public void setCode (String code)
    {
        this.code = code;
    }
}