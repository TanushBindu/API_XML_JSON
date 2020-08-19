package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class DigitalFlags
{
    private String name;
    private String isEnrolled;
    @XmlElement
    public String getName ()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    @XmlElement
    public String getIsEnrolled ()
    {
        return isEnrolled;
    }
    public void setIsEnrolled (String isEnrolled)
    {
        this.isEnrolled = isEnrolled;
    }
}