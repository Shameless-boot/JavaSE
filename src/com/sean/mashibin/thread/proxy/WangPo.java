package com.sean.mashibin.thread.proxy;

/**
 * @author: Shaun
 * @create: 2020-05-14 16:36
 * @description: 代理人类
 */

public class WangPo implements KindWoman{
    // 被代理人
    private KindWoman kindWoman;

    public WangPo() {
        kindWoman = new PanJinLian();
    }

    public WangPo(KindWoman kindWoman) {
        this.kindWoman = kindWoman;
    }

    @Override
    public void MakeEyesWithMen() {
        kindWoman.MakeEyesWithMen();
    }

    @Override
    public void playWithMen() {
        kindWoman.playWithMen();
    }
}
