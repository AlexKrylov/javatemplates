package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        WatchMaker watchMaker = new RomeWatchMaker();
        Watch watch = watchMaker.createWatch();
        watch.showTime();
    }
}
