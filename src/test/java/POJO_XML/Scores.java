package POJO_XML;

import javax.xml.bind.annotation.XmlElement;

public class Scores
{
    private String summitScore;
    private String amlScore;
    private String fusionScore;
    @XmlElement
    public String getSummitScore ()
    {
        return summitScore;
    }
    public void setSummitScore (String summitScore)
    {
        this.summitScore = summitScore;
    }
    @XmlElement
    public String getAmlScore ()
    {
        return amlScore;
    }
    public void setAmlScore (String amlScore)
    {
        this.amlScore = amlScore;
    }
    @XmlElement
    public String getFusionScore ()
    {
        return fusionScore;
    }
    public void setFusionScore (String fusionScore)
    {
        this.fusionScore = fusionScore;
    }
}

