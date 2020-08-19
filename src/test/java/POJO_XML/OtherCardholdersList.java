package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class OtherCardholdersList
{
    private OtherCardholders otherCardholders;
    @XmlElement
    public OtherCardholders getOtherCardholders ()
    {
        return otherCardholders;
    }
    public void setOtherCardholders (OtherCardholders otherCardholders)
    {
        this.otherCardholders = otherCardholders;
    }
}
