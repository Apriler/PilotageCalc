package ontime;

import com.ycjr.poiltcalculation.activity.ontime.LoopAirlineFlyTime;

/**
 * 9.环线航线绕飞平飞时间
 * 输入： 1.消磨时间 单位：分钟 ，
 *       2.速度  单位：公里/小时  1-1999，
 *       3.坡度  单位：度  1-89，
 *
 *
 *
 * 输出：平飞时间  单位：分钟
 */
public class LoopAirlineFlyTimeCalc {

    public static void main(String[] args) {


        //消磨时间
        double var3 = 50;

        //速度
        double var6 = 100;

        //坡度
        double var9 = 50;

        var3 = var3 / 60.0D;

        double var11 = 3.141592653589793D * var6 / 180.0D;
        double var13 = var9 / 3.6D;
        double var15 = (var3 - (double)((int)(360.0D * 6.283185307179586D * (var13 * var13 / (9.81D * Math.tan(var11))) / (360.0D * var13) / 3600.0D))) / 2.0D;
        System.out.println((60.0D * var15 + ""));


    }


}
