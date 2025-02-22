package day6;


import day6.factory.BannerFactory;
import day6.factory.ViewFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Abstract 抽象子类继承目标底层能力（基类，接口）\n" +
                "用抽象的方法将适配层需要外部场景参数开放出去，\n" +
                "就像一个探针，根据外部场景参数的变化而确定需要的类。\n"
        );
//        MobilePhoneBanner mobilePhoneBanner = new MobilePhoneBanner();
//        mobilePhoneBanner.showBanner();
        System.out.println(
                "-----------------------------");

        System.out.println("继续封装工厂方法，通过配置场景参数的工厂方法来进一解耦");

        ViewFactory factory = null;
        // 配置策略点
        Map configMap = new HashMap<DeviceType, String>();
        configMap.put(DeviceType.MOBILE_PHONE,"day6.factory.BannerFactory");
        configMap.put(DeviceType.PC,"day6.factory.GoodsShelfFactory");

        try {
            factory = (ViewFactory)Class.forName(configMap.get(DeviceType.MOBILE_PHONE).toString()).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }

        if(factory instanceof BannerFactory){
            ((BannerFactory) factory).createBannerMatchWithDevice(DeviceType.MOBILE_PHONE).showBanner();
        }

    }
}