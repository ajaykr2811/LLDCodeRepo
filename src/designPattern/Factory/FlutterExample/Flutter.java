package designPattern.Factory.FlutterExample;

public class Flutter {
    void refresh(){
        System.out.println("Refreshing !!");
    }
    UIFactory getPlatform(Platform platform){
        return UIFactoryFactory.getPatform(platform);
    }
}
