package day6;

public abstract class AbstractBanner extends Banner {
    public AbstractBanner() {
        super();
    }
    // 添加一个决策点来解除硬编码的限制
    //思考题，如果添加一个参数来决定size可以吗？
    // 不好，因为底层不应该直接感知应用场景，不应该穿透到底层
    // 适配层抽象方法给子类实现策略的定制
    public abstract BannerSize assertBannerSize();

    // 继续抽象BannerSize的能力为子类赋能
    protected BannerSize createBannerSizeWithDeviceType(DeviceType deviceType){
        if (deviceType.equals(DeviceType.MOBILE_PHONE)){
            return new BannerSize(360,180);
        }
        if(deviceType.equals(DeviceType.PC)){
            return new BannerSize(1980,1080);
        }
        return new BannerSize(800,600);
    }
}
