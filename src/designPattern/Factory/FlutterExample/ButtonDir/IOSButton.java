package designPattern.Factory.FlutterExample.ButtonDir;

import designPattern.Factory.FlutterExample.Button;

public class IOSButton implements Button {
    @Override
    public void Click() {
        System.out.println("IOS Button clicked");
    }
}
