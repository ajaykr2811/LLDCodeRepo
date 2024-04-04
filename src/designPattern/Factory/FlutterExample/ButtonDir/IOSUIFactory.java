package designPattern.Factory.FlutterExample.ButtonDir;

import designPattern.Factory.FlutterExample.Button;
import designPattern.Factory.FlutterExample.UIFactory;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
