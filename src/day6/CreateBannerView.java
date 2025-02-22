package day6;

public class CreateBannerView extends AbstractBanner implements IBannerPaint{
    private DeviceType deviceType;

    public CreateBannerView(DeviceType deviceType){
        this.deviceType = deviceType;
    }


    @Override
    public void showBannerOnCell() {
        BannerSize bannerSize = new BannerSize(200,100);
        Banner banner = new Banner();
        banner.showBannerWithSize(bannerSize);
    }

    // 子类强制要求实现这样的能力
    @Override
    public BannerSize assertBannerSize() {
        return createBannerSizeWithDeviceType(deviceType);
    }

    // 接口来规约底层能力
    @Override
    public void paintBannerOnCellPhone() {
        this.deviceType = DeviceType.MOBILE_PHONE;
        Banner banner = new Banner();
        banner.showBannerWithSize(assertBannerSize());
    }

    @Override
    public void paintBannerOnPC() {
        this.deviceType = DeviceType.PC;
        Banner banner = new Banner();
        banner.showBannerWithSize(assertBannerSize());
    }
}
