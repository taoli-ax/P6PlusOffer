package day6.factory;

import day6.Banner;
import day6.DeviceType;

public interface BannerFactory extends ViewFactory{
    public Banner createBannerMatchWithDevice(DeviceType deviceType);

}
