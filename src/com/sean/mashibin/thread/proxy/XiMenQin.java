package com.sean.mashibin.thread.proxy;

/**
 * @author: Shaun
 * @create: 2020-05-14 16:36
 * @description: TODO
 */
public class XiMenQin {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.MakeEyesWithMen();
        wangPo.playWithMen();

        GuaJie guaJie = new GuaJie();
        wangPo = new WangPo(guaJie);
        wangPo.MakeEyesWithMen();
        wangPo.playWithMen();

    }
}
