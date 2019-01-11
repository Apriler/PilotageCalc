package groundspeed;

import com.ycjr.poiltcalculation.activity.groundspeed.PianLiuActiviy;

import java.util.Locale;

/**
 * 计算偏流角
 * 输入： 1.空速  单位：公里/小时，量程 1-1999
 *       2.风速  单位：公里/小时 ，量程：1-1999
 *       3.风角  单位：度 ，量程：0-360
 *
 * 输出：偏流角   单位： 度
 */
public class PianLiuAngleCalc {

    public static void main(String[] args) {
        //空速
        double var7 = 100.0;

        //风速
        double var5 = 100;
        //风角
        double var3 = 30.0;

        double var8 = (double)var5 * Math.sin(3.141592653589793D * (double)var3 / 180.0D) / (double)var7;
        Locale var11 = Locale.CHINA;
        Object[] var12 = new Object[]{180.0D * Math.asin(var8) / 3.141592653589793D};
        System.out.println(String.format(var11, "%.1f", var12));
    }

    public static float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
