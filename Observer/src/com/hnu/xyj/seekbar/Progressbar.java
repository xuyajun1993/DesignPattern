package com.hnu.xyj.seekbar;

import java.util.Observable;
import java.util.Observer;

import com.hnu.xyj.buttons.Button;

/**
 * 进度条，既是观察按钮的观察者，也是被观察者。根据按钮的点击事件决定被哪个文本框观察
 */
public class Progressbar extends Observable implements Observer {

    /**
     * 进度条值（暂时做成静态，可以通过添加监听器实现数值动态变化）
     */
    private int value = 0;

    /**
     * 根据arg判断添加哪个文本框为观察者
     */
    @Override
    public void update(Observable o, Object arg) {
        // 删除所有观察自己的观察者
        this.deleteObservers();
        if (o instanceof Button) {
            System.out.println("Progressbar 添加观察者");
            Button button = (Button) o;
            // 添加观察者
            this.addObserver(button.getField());
            System.out.println(button.getField().getTextType());
        }
    }

    public void onProgressChanged() {
        // 通知观察者
        super.setChanged();
        super.notifyObservers(value);
    }

}
