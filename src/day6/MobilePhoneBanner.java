package day6;

public class MobilePhoneBanner {
    // agent适配
    private CreateBannerView createBannerView;

    // 将要做的事情交给委托(agent)对象
    public MobilePhoneBanner() {
        createBannerView = new CreateBannerView(DeviceType.MOBILE_PHONE);
    }
    // 直接使用已完成的委托对象的结果
    public void showBanner() {
        createBannerView.paintBannerOnCellPhone();
    }
}
