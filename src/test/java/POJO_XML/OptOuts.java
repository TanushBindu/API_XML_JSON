package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class OptOuts
{
    private String flag;
    private String category;
    @XmlElement
    public String getFlag ()
    {
        return flag;
    }
    public void setFlag (String flag)
    {
        this.flag = flag;
    }
    @XmlElement
    public String getCategory ()
    {
        return category;
    }
    public void setCategory (String category)
    {
        this.category = category;
    }
}