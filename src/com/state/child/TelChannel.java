package com.state.child;

import com.state.bean.Work;
import com.state.father.State;

/**
 * Created by zzp on 2016/1/27.
 */
public class TelChannel implements State {
    /**
     * 加密
     *
     * @param work
     * @return
     */
    @Override
    public String encrytion(Work work) {
        if("0301".equals(work.getMedium())){
            return "tel渠道加密";
        }else {
            return new CourtChannel().encrytion(work);
        }
    }

    /**
     * 解密
     *
     * @param work
     * @return
     */
    @Override
    public String decrytion(Work work) {
        if("0301".equals(work.getMedium())){
            return "tel渠道解密";
        }else {
            return new CourtChannel().decrytion(work);
        }
    }
}
