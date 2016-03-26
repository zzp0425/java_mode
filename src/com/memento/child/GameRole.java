package com.memento.child;

/**
 * Created by zzp on 2016/1/28.
 * 游戏角色
 */
public class GameRole {

    private Integer vit;//生命力
    private Integer atk;//攻击力
    private Integer def;//防御力


    /**
     * 保存角色状态
     * @return
     */
    public Memento saveRoleState(){
        return new Memento(vit, atk, def);
    }

    /**
     * 恢复角色状态
     * @param memento
     */
    public void recoveryState(Memento memento){
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }


    /**
     * 显示角色状态
     */
    public void showRoleState(){
        System.out.println(this.toString());
    }

    /**
     * 初始化状态
     */
    public void instanceState(){
        this.def = 100;
        this.vit = 100;
        this.atk = 100;
    }

    /**
     * 战斗结束后状态
     */
    public void fighting(){
        this.def = 0;
        this.vit = 0;
        this.atk = 0;
    }



    @Override
    public String toString() {
        return "角色当前状态：\n生命力：" + this.vit + "\n攻击力：" + this.atk + "\n防御力" + this.def + "\n";
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
