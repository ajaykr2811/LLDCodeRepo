package designPattern.Factory.FlutterExample;

import designPattern.Factory.FlutterExample.ButtonDir.IOSUIFactory;

public class UIFactoryFactory {
    public static UIFactory getPatform(Platform platform){
        if(platform.equals(Platform.Android)){
            return new AndroidUIFactory();
        }
        if(platform.equals(Platform.IOS)){
            return new IOSUIFactory();
        }
        return null;
    }
}
