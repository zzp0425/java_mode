package com.state.bean;

import com.state.child.TelChannel;
import com.state.father.State;

/**
 * Created by zzp on 2016/1/27.
 */
public class Work {
    private String medium;//渠道
    private String pin;//密码
    private String channelPik;//密钥
    private String index;//索引
    private String accNo;//账号

    private State state;


    public Work(){
        state = new TelChannel();
    }

    public String decryption(){
        return state.decrytion(this);
    }

    public String encryption(){
        return state.encrytion(this);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getChannelPik() {
        return channelPik;
    }

    public void setChannelPik(String channelPik) {
        this.channelPik = channelPik;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getIndex() {
        return index;

    }

    public void setIndex(String index) {
        this.index = index;
    }
}
