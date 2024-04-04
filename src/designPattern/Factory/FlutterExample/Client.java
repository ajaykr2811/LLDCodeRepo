package designPattern.Factory.FlutterExample;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory ui = flutter.getPlatform(Platform.Android);

        Button button = ui.createButton();
        button.Click();
    }
}
