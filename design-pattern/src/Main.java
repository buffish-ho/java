import com.buffish.client.*;

public class Main {
    public static void main(String[] args) {
        // 单例模式
        SingletonClient.run();
        // 简单工厂模式
        SimpleFactoryClient.run();
        // 工厂方法模式
        FactoryMethodClient.run();
        // 抽象工厂模式
        AbstractedFactoryClient.run();
    }
}
