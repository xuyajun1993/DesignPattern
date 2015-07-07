package com.hnu.xyj.textboxs;

import java.util.Observable;
import java.util.Observer;

/**
 * 文本框类，
 *
 * @author xyj
 * @ClassName: TextField
 * @Description:
 */
public class TextField implements Observer {
    // 用于区分文本框
    private String textType = "";
    // 文本框内容
    private String Text = "";

    public TextField(String textType) {
        this.textType = textType;
    }

    public String getTextType() {
        return textType;
    }

    public void setTextType(String textType) {
        this.textType = textType;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    @Override
    public void update(Observable o, Object arg) {
        // 根据进度条，随时更新文本内容
        setText(arg.toString());
    }
}
