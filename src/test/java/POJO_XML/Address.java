package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class Address
{
    private String indicator;
    private String country;
    private String city;
    private String type;
    private String addressAddedDate;
    private String prov;
    private String postalZip;
    private String line1;
    @XmlElement
    public String getIndicator ()
    {
        return indicator;
    }
    public void setIndicator (String indicator)
    {
        this.indicator = indicator;
    }
    @XmlElement
    public String getCountry ()
    {
        return country;
    }
    public void setCountry (String country)
    {
        this.country = country;
    }
    @XmlElement
    public String getCity ()
    {
        return city;
    }
    public void setCity (String city)
    {
        this.city = city;
    }
    @XmlElement
    public String getType ()
    {
        return type;
    }
    public void setType (String type)
    {
        this.type = type;
    }
    @XmlElement
    public String getAddressAddedDate ()
    {
        return addressAddedDate;
    }
    public void setAddressAddedDate (String addressAddedDate)
    {
        this.addressAddedDate = addressAddedDate;
    }
    @XmlElement
    public String getProv ()
    {
        return prov;
    }
    public void setProv (String prov)
    {
        this.prov = prov;
    }
    @XmlElement
    public String getPostalZip ()
    {
        return postalZip;
    }
    public void setPostalZip (String postalZip)
    {
        this.postalZip = postalZip;
    }
    @XmlElement
    public String getLine1 ()
    {
        return line1;
    }
    public void setLine1 (String line1)
    {
        this.line1 = line1;
    }
}