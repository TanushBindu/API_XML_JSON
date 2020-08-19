package pojo;

import java.util.List;
public class StatusInfo
{
    private String passFail;

    private String statusDesc;

    private List<String> messages;

    public void setPassFail(String passFail){
        this.passFail = passFail;
    }
    public String getPassFail(){
        return this.passFail;
    }
    public void setStatusDesc(String statusDesc){
        this.statusDesc = statusDesc;
    }
    public String getStatusDesc(){
        return this.statusDesc;
    }
    public void setMessages(List<String> messages){
        this.messages = messages;
    }
    public List<String> getMessages(){
        return this.messages;
    }
}
