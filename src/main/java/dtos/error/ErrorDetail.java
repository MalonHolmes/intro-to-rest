package dtos.error;

public class ErrorDetail {

    String title;
    int status;
    String detail;
    long timeStamp;
    String developerMessage;

    public void setTitle(String title){
        this.title = title;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }

    public void setTimeStamp(long timeStamp){
        this.timeStamp = timeStamp;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public String getTitle(){
        return title;
    }

    public int getStatus(){
        return status;
    }

    public String getDetail(){
        return detail;
    }

    public long getTimeStamp(){
        return timeStamp;
    }

    public String getDeveloperMessage(){
        return developerMessage;
    }
}
