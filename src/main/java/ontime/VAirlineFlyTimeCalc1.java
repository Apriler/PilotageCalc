package ontime;

import com.ycjr.poiltcalculation.activity.ontime.VAirlineFlyDistance;

/**
 * 10.V型航线绕飞最短距离
 * 输入： 1.速度 单位：公里/小时 1-1999 ，
 *       2.坡度  单位：分钟  1-89，
 *       3.转弯角的径值  单位：度 0-360，
 *       4.消磨时间 单位：分钟
 *
 *
 * 输出：按V型航线绕飞最短距离  单位：公里
 */
public class VAirlineFlyTimeCalc1 {

    public static void main(String[] args) {


        //速度
        double var3 = 100;

        //坡度
        double var6 = 50;

        //转弯角的径值
        double var9 = 50;

        //消磨时间
        double var12 = 2;

        var12 = var12 / 60.0D;


        double var14 = 3.141592653589793D * var6 / 180.0D;
        double var16 = var3 / 3.6D;
        double var18 = 360.0D * 6.283185307179586D * (var16 * var16 / (9.81D * Math.tan(var14))) / (360.0D * var16) / 3600.0D;
        double var21;
        if (var9 == 60.0D) {
            var21 = var16 * (var12 + 0.45D * var18);
        } else if (var9 == 45.0D) {
            var21 = var16 * (2.4D * var12 + 0.33D * var18);
        } else if (var9 == 90.0D) {
            var21 = 0.637D * var16;
        } else {
            label34: {
                double var23;
                double var25;
                double var27;
                try {
                    var23 = var12 * (Math.cos(var9) / (1.0D - Math.cos(var9)));
                    var25 = 0.637D * var18 * (var9 * Math.cos(var9) - Math.sin(var9));
                    var27 = Math.cos(var9);
                } catch (Exception var37) {
                    var21 = 0.0D;
                    break label34;
                }

                var21 = var16 * (var23 - var25 / (1.0D - var27));
            }
        }

        System.out.println((var21 + ""));




    }


}
