package cloud;

import com.ycjr.poiltcalculation.activity.cloud.FlatTime;

/**
 * 4.背台平飞时间(未修盲区/修正盲区)
 * 输入： 1.下降距离  单位: 公里
 *       2.转弯半径  单位： 公里
 *       3.盲区半径  单位：公里
 *       4.进入角  单位： 度 0-360
 *       5.修正角  单位：度 0-360
 *       6.转弯坡度 单位： 度 1-89
 *       7.平飞真速 单位 公里/小时 1-1999
 *

 * 输出： 背飞时间  单位：分 秒
 */
public class FlatTimeCalc {


    public static void main(String[] args) {


        //下降距离
        double var3 = 1000.0;
        //转弯半径
        double var5 = 100.0;
        //盲区半径
        double var7 = 200.0;
        //进入角
        double var9 = 200.0;
        //修正角
        double var11 = 10.0;
        //转弯坡度
        double var13 = 10.0;
        //平飞真速
        double var15 = 100.0;


        double var16 = 3.141592653589793D * (double)var9 / 180.0D;
        double var18 = 3.141592653589793D * (double)var11 / 180.0D;
        double var20 = 3.141592653589793D * (double)var13 / 180.0D;
        double var22 = 3.141592653589793D * 2.0D * ((double)(var9 - var11) / 360.0D) * (double)var15 / (3.6D * 9.81D * Math.tan(var20)) + 3600.0D * (((double)var3 - (double)var5 * Math.sin(var16) - (double)var7 * Math.cos(var16)) / ((double)var15 * Math.cos(var18)));
        float var24 = (float)((int)(var22 / 60.0D));
        double var25 = var22 - (double)(60.0F * var24);
        float var27 = CutShort(var25);
        System.out.print(((int) var24 + "分 "));
        System.out.println(((int) var27 + "秒"));

    }

    public static float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
