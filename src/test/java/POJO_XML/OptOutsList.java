package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class OptOutsList
{
    private OptOuts[] optOuts;
    @XmlElement
    public OptOuts[] getOptOuts ()
    {
        return optOuts;
    }
    public void setOptOuts (OptOuts[] optOuts)
    {
        this.optOuts = optOuts;
    }
}