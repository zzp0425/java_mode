package com.delegator;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zzp on 2016/1/25.
 */
public class Delegator4Map extends Delegator {
    private Map orginClass = null;//原始对象
    private Map proxyClass = null;//代理对象

    public Map getOrginClass() {
        return orginClass;
    }

    public Map getProxyClass() {
        return proxyClass;
    }

    public Delegator4Map(Map orgin){
        super(orgin);
        orginClass = orgin;
        proxyClass = (Map) super.obj_proxy;
    }

    /**
     * Processes a method invocation on a proxy instance and returns
     * the result.  This method will be invoked on an invocation handler
     * when a method is invoked on a proxy instance that it is
     * associated with.
     *
     * @param proxy  the proxy instance that the method was invoked on
     * @param method the <code>Method</code> instance corresponding to
     *               the interface method invoked on the proxy instance.  The declaring
     *               class of the <code>Method</code> object will be the interface that
     *               the method was declared in, which may be a superinterface of the
     *               proxy interface that the proxy class inherits the method through.
     * @param args   an array of objects containing the values of the
     *               arguments passed in the method invocation on the proxy instance,
     *               or <code>null</code> if interface method takes no arguments.
     *               Arguments of primitive types are wrapped in instances of the
     *               appropriate primitive wrapper class, such as
     *               <code>java.lang.Integer</code> or <code>java.lang.Boolean</code>.
     * @return the value to return from the method invocation on the
     * proxy instance.  If the declared return type of the interface
     * method is a primitive type, then the value returned by
     * this method must be an instance of the corresponding primitive
     * wrapper class; otherwise, it must be a type assignable to the
     * declared return type.  If the value returned by this method is
     * <code>null</code> and the interface method's return type is
     * primitive, then a <code>NullPointerException</code> will be
     * thrown by the method invocation on the proxy instance.  If the
     * value returned by this method is otherwise not compatible with
     * the interface method's declared return type as described above,
     * a <code>ClassCastException</code> will be thrown by the method
     * invocation on the proxy instance.
     * @throws Throwable the exception to throw from the method
     *                   invocation on the proxy instance.  The exception's type must be
     *                   assignable either to any of the exception types declared in the
     *                   <code>throws</code> clause of the interface method or to the
     *                   unchecked exception types <code>java.lang.RuntimeException</code>
     *                   or <code>java.lang.Error</code>.  If a checked exception is
     *                   thrown by this method that is not assignable to any of the
     *                   exception types declared in the <code>throws</code> clause of
     *                   the interface method, then an
     *                   {@link UndeclaredThrowableException} containing the
     *                   exception that was thrown by this method will be thrown by the
     *                   method invocation on the proxy instance.
     * @see UndeclaredThrowableException
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("size".equals(method.getName())){
            Object ret = new Integer(-1);
            System.out.println("调用代理方法");
            return ret;
        } else {
            System.out.println("调用原始方法");
            return super.invoke(proxy, method, args);
        }
    }

    public static void main(String[] args) {
        Delegator4Map rm = new Delegator4Map(new Hashtable());
        Map map = rm.getProxyClass();
        System.out.println(map.size());
        System.out.println(map.toString());
    }
}
