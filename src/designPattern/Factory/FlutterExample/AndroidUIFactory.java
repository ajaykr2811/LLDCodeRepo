package designPattern.Factory.FlutterExample;

import designPattern.Factory.FlutterExample.ButtonDir.AndroidButton;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
