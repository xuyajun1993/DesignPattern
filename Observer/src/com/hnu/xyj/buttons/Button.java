package com.hnu.xyj.buttons;

import java.util.Observable;

import com.hnu.xyj.seekbar.Progressbar;
import com.hnu.xyj.textboxs.TextField;

/**
 * button类
 *
 * @author xyj
 * @Description:
 */
public class Button extends Observable {
    // button绑定的文本框
    private TextField field;

    public Button(TextField field, Progressbar bar) {
        this.field = field;
        this.addObserver(bar);
    }

    // button共有的点击事件
    public void click() {
        super.setChanged();
        super.notifyObservers();
    }

    public TextField getField() {
        return field;
    }

    public void setField(TextField field) {
        this.field = field;
    }

}
