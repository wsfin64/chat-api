package br.com.wsfin64.apichat.entities;

public class Model {

    private String broadcaster_username;
    private Integer age;
    private String room_status;

    public String getBroadcaster_username() {
        return broadcaster_username;
    }

    public void setBroadcaster_username(String broadcaster_username) {
        this.broadcaster_username = broadcaster_username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRoom_status() {
        return room_status;
    }

    public void setStatus(String room_status) {
        this.room_status = room_status;
    }

    public String getUrl(){
        return "https://chaturbate.com/" + broadcaster_username;
    }
}
