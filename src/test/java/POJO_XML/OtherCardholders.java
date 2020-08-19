package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class OtherCardholders
{
    private String fisrtName;
    private String lastName;
    private StatusCodesList statusCodesList;
    private String name;
    private String accountRelationship;
    private String sin;
    private String cardNbr;
    private String pinLockedOut;
    private String id;
    private String transferToCardNbr;
    private String addressAvailable;
    @XmlElement
    public String getFisrtName ()
    {
        return fisrtName;
    }
    public void setFisrtName (String fisrtName)
    {
        this.fisrtName = fisrtName;
    }
    @XmlElement
    public String getLastName ()
    {
        return lastName;
    }
    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }
    @XmlElement
    public StatusCodesList getStatusCodesList ()
    {
        return statusCodesList;
    }
    public void setStatusCodesList (StatusCodesList statusCodesList)
    {
        this.statusCodesList = statusCodesList;
    }
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
    public String getAccountRelationship ()
    {
        return accountRelationship;
    }
    public void setAccountRelationship (String accountRelationship)
    {
        this.accountRelationship = accountRelationship;
    }
    @XmlElement
    public String getSin ()
    {
        return sin;
    }
    public void setSin (String sin)
    {
        this.sin = sin;
    }
    @XmlElement
    public String getCardNbr ()
    {
        return cardNbr;
    }
    public void setCardNbr (String cardNbr)
    {
        this.cardNbr = cardNbr;
    }
    @XmlElement
    public String getPinLockedOut ()
    {
        return pinLockedOut;
    }
    public void setPinLockedOut (String pinLockedOut)
    {
        this.pinLockedOut = pinLockedOut;
    }
    @XmlElement
    public String getId ()
    {
        return id;
    }
    public void setId (String id)
    {
        this.id = id;
    }
    @XmlElement
    public String getTransferToCardNbr ()
    {
        return transferToCardNbr;
    }
    public void setTransferToCardNbr (String transferToCardNbr)
    {
        this.transferToCardNbr = transferToCardNbr;
    }
    @XmlElement
    public String getAddressAvailable ()
    {
        return addressAvailable;
    }
    public void setAddressAvailable (String addressAvailable)
    {
        this.addressAvailable = addressAvailable;
    }
}
