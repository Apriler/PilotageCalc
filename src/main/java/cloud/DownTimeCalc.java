package cloud;

import com.ycjr.poiltcalculation.activity.cloud.DownTime;

/**
 * 计算转弯坡度
 * 输入： 1.穿云高度  单位:公里/小时
 *       2.降至高度   单位： 米
 *       3.下降率  单位：米/秒
 *
 *
 * 输出： 下降时间
 */
public class DownTimeCalc {


    public static void main(String[] args) {
        float downMin = 0;
        float downSec = 0;

        //穿云高度
        double var3 = 1000.0;
        //降至高度
        double var5 = 200.0;
        //下降率
        double var7 = 200.0;

        double var8 = 60.0F * downMin + downSec + (var3 - var5) / var7;
        downMin = (float)((int)(var8 / 60.0F));
        downSec = CutShort((double)(var8 - 60.0F * downMin));

        if (true) {
            var3 = var5;
            var5 = 0.0F;
            var7 = 0.0F;
        }
        System.out.println("穿云高度："+(var3));
        System.out.println("降至高度："+(var5));
        System.out.println("下降率："+(var7));
        System.out.println("下降时间（分）："+(downMin));
        System.out.println("下降时间（秒）："+(downSec));
    }

    public  static float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
