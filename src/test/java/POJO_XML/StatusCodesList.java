package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class StatusCodesList
{
    private StatusCodes[] statusCodes;
    @XmlElement
    public StatusCodes[] getStatusCodes ()
    {
        return statusCodes;
    }

    public void setStatusCodes (StatusCodes[] statusCodes)
    {
        this.statusCodes = statusCodes;
    }
}
