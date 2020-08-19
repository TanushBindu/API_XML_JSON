package pojo;

import java.util.List;
public class Retrive_offer
{
    private List<DeclineReasons> declineReasons;

    private StatusInfo statusInfo;

    public void setDeclineReasons(List<DeclineReasons> declineReasons){
        this.declineReasons = declineReasons;
    }
    public List<DeclineReasons> getDeclineReasons(){
        return this.declineReasons;
    }
    public void setStatusInfo(StatusInfo statusInfo){
        this.statusInfo = statusInfo;
    }
    public StatusInfo getStatusInfo(){
        return this.statusInfo;
    }
}
