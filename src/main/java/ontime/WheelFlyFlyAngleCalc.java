package ontime;

import com.ycjr.poiltcalculation.activity.ontime.WheelFlyFlyAngle;

/**
 * 6.转弯绕飞:计算转弯角度
 * 输入： 1.早到时间 单位：分钟，
 *       2.真空速  单位：公里/小时  1-1999，
 *
 *
 * 输出：转弯角度  单位：度
 */
public class WheelFlyFlyAngleCalc {

    public static void main(String[] args) {


        //早到时间
        double var3 = 10;


        //真空速
        double var6 = 100;


        var6 = var6 / 60.0D;
        if (var6 != 0.0D) {
            double var8 = 10.0D * Math.cbrt(var3 * 100.0D * Math.tan(var6) / var6);
            System.out.println("转弯角度: " +(int)var8 + "");
        } else {
            System.out.println("转弯角度: " + 0);
        }

    }


}
