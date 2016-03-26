package com.memento.child;

/**
 * Created by zzp on 2016/1/28.
 * 备忘录
 */
public class Memento {
    private Integer vit;//生命力
    private Integer atk;//攻击力
    private Integer def;//防御力


    public Memento(int vit, int atk, int def){
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

}
