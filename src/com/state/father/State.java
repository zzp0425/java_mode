package com.state.father;

import com.state.bean.Work;

/**
 * Created by zzp on 2016/1/27.
 * 状态模式父类
 */
public interface State {
    /**
     * 加密
     * @param work
     * @return
     */
    public String encrytion(Work work);

    /**
     * 解密
     * @param work
     * @return
     */
    public String decrytion(Work work);
}
