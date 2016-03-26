package com.observer.delegator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zzp on 2016/1/25.
 */
public class Event {
    private Object object;//要执行方法的对象
    private String methodName;//方法名
    private Object[] params;//要执行方法的参数
    private Class[] paramTypes;//要执行方法的参数的类型

    public Event(Object object, String methodName, Object ... params){
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(params);
    }

    /**
     * 组装参数类型
     * @param params
     */
    public void contractParamTypes(Object... params){
        if (params == null || params.length == 0){
           return;
        }
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            paramTypes[i] = params[i].getClass();
        }
    }



    /**
     * 执行指定方法
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getMethod(this.getMethodName(), this.getParamTypes());

        if (null == method){
            return;
        }

        method.invoke(object, params);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }
}
