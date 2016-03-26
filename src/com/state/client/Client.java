package com.state.client;

import com.state.bean.Work;
import com.state.child.TelChannel;
import com.state.father.State;

/**
 * Created by zzp on 2016/1/27.
 */
public class Client {
    public static void main(String[] args) {
        String encrytion = "";
        String decrytion = "";
        Work work = new Work();
        work.setMedium("0300");
        encrytion = work.encryption();
        decrytion = work.decryption();
        System.out.println(encrytion + " , " + decrytion);

        work.setMedium("0301");
        encrytion = work.encryption();
        decrytion = work.decryption();
        System.out.println(encrytion + " , " + decrytion);

        work.setMedium("0302");
        encrytion = work.encryption();
        decrytion = work.decryption();
        System.out.println(encrytion + " , " + decrytion);

        work.setMedium("0303");
        encrytion = work.encryption();
        decrytion = work.decryption();
        System.out.println(encrytion + " , " + decrytion);
    }
}
