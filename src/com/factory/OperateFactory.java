package com.factory;

import com.factory.father.Operation;
import com.factory.impl.OperateAdd;
import com.factory.impl.OperateDiv;
import com.factory.impl.OperateMul;
import com.factory.impl.OperateSub;

/**
 * 运算
 * Created by zzp on 2015/12/9.
 */
public class OperateFactory {
    /**
     * @param operate 0:+ 1:- 2:* 3:/
     * @return
     */
    public static Operation createOperaion(String operate){
        Operation oper = null;
        int type = trans(operate);
        switch (type){
            case 0 :
                oper = new OperateAdd();
                break;
            case 1 :
                oper = new OperateSub();
                break;
            case 2 :
                oper = new OperateMul();
                break;
            case 3 :
                oper = new OperateDiv();
                break;
        }
        return oper;
    }

    public static Integer trans(String operate){
        if ("+".equals(operate)){
            return 0;
        }else if("-".equals(operate)){
            return 1;
        }else if("*".equals(operate)){
            return 2;
        }else if("/".equals(operate)){
            return 3;
        }
        return 0;
    }
}
