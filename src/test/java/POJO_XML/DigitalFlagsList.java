package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class DigitalFlagsList
{
    private DigitalFlags[] digitalFlags;
    @XmlElement
    public DigitalFlags[] getDigitalFlags ()
    {
        return digitalFlags;
    }
    public void setDigitalFlags (DigitalFlags[] digitalFlags)
    {
        this.digitalFlags = digitalFlags;
    }
}