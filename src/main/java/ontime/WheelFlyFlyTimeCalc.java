package ontime;

import com.ycjr.poiltcalculation.activity.ontime.WheelFlyFlyTime;

/**
 * 7.转弯绕飞:盘旋消磨时间
 * 输入： 1.转弯坡度 单位：度 1-89，
 *       2.真空速  单位：公里/小时  1-1999，
 *
 *  注：该算法，app上有问题
 *
 * 输出：转弯角度  单位：度
 */
public class WheelFlyFlyTimeCalc {

    public static void main(String[] args) {


        //转弯坡度
        double var3 = 50;


        //真空速
        double var6 = 100;


        double var8 = 6.283185307179586D * var3 / (9.81D * Math.tan(3.141592653589793D * var6 / 180.0D));
        System.out.println((String.valueOf(60.0D * var8)));

    }


}
