package cloud;

import com.ycjr.poiltcalculation.activity.cloud.DownDistance;

/**
 * 2.下降距离
 * 输入： 1.平飞速度  单位: 公里/小时 1-1999
 *       2.平飞时间  单位： 分 秒
 *       3.下降真速  单位：公里/小时 1-1999
 *       4.下降时间  单位： 分 秒
 *       5.台前速度  单位：公里/小时 1-1999
 *       6.台前时间  单位： 分 秒
 *
 *
 * 输出： 下降距离  单位：公里
 */
public class DownDistanceCalc {


    public static void main(String[] args) {


        //平飞速度
        double var3 = 100.0;
        //平飞时间 分
        double var5 = 1.0;
        //平飞时间 秒
        double var7 = 20.0;
        //下降真速
        double var9 = 200.0;
        //下降时间 分
        double var11 = 1.0;
        //下降时间 秒
        double var13 = 10.0;
        //台前速度
        double var15 = 200.0;
        //台前时间 分
        double var17 = 1.0;
        //台前时间 秒
        double var19 = 20.0;


        double var20 = (double)((var9 * (var13 + 60.0F * var11) + var3 * (var7 + 60.0F * var5) + var15 * (var19 + 60.0F * var17)) / 3600.0F);
        float var22 = CutShort(var20);
        System.out.println("下降距离"+(Float.toString(var22)));

    }

    public static float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
