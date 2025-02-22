package day6;

public class BannerSize {
    public String bannerSize;
    public  BannerSize(float width, float height) {
        bannerSize = width + "x" + height;
        System.out.println(bannerSize);
    }
    public String getBannerSize() {
        return bannerSize;
    }
}
