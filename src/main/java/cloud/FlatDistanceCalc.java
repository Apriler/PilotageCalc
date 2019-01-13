package cloud;

import com.ycjr.poiltcalculation.activity.cloud.FlatDistance;

/**
 * 3.背台平飞距离(未修盲区/修正盲区)
 * 输入： 1.下降距离  单位: 公里
 *       2.转弯半径  单位： 公里
 *       3.盲区半径  单位：公里
 *       4.进入角  单位： 度 0-360
 *       5.修正角  单位：度 0-360
 *

 * 输出： 背飞距离  单位：公里
 */
public class FlatDistanceCalc {


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



        double var12 = 3.141592653589793D * (double)var9 / 180.0D;
        double var14 = 3.141592653589793D * (double)var11 / 180.0D;
        double var16 = ((double)var3 - (double)var5 * Math.sin(var12) - (double)var7 * Math.cos(var12)) / Math.cos(var14);
        float var18 = CutShort(var16);
        System.out.println("背飞距离: "+(Float.toString(var18)));

    }

    public static float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
