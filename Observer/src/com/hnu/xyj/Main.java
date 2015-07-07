package com.hnu.xyj;

import com.hnu.xyj.buttons.Button;
import com.hnu.xyj.seekbar.Progressbar;
import com.hnu.xyj.textboxs.TextField;

/**
 *  模拟场景：界面上有三个文本框，三个按钮，一个进度条，要求三个按钮共用一个进度条，点击不同按钮，拖动进度条时相应的文本框内容改变
 */
public class Main {

    public static void main(String[] args) {
        // 定义进度条
        Progressbar progressbar = new Progressbar();
        // 定义几个文本框
        TextField lightField = new TextField("亮度文本框");
        TextField colorField = new TextField("颜色文本框");
        TextField saturationField = new TextField("饱和度文本框");
        // 定义几个按钮,第一个参数表示绑定的文本框，第二个表示观察自己的观察者
        Button lightButton = new Button(lightField, progressbar);
        Button colorButton = new Button(colorField, progressbar);
        Button saturationButton = new Button(saturationField, progressbar);

        // 模拟点击
        colorButton.click();
    }
}
