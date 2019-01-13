package cloud;

import com.ycjr.poiltcalculation.activity.cloud.ModifyAngle;

/**
 * 5.修正角(未修盲区/修正盲区)
 * 输入： 1. 转弯半径  单位： 公里
 *       2. 盲区半径  单位：公里
 *       3.下降距离  单位: 公里
 *       4.进入角  单位： 度 0-360

 *
 * 输出： 修正角 单位 度
 */
public class ModifyAngleCalc {


    public static void main(String[] args) {
        float downMin = 0;
        float downSec = 0;

        //下降距离
        double var3 = 1000.0;
        //转弯半径
        double var5 = 100.0;
        //盲区半径
        double var7 = 200.0;
        //进入角
        double var9 = 200.0;

        double var10 = 3.141592653589793D * (double)var9 / 180.0D;
        double var12 = ((double)var5 * (1.0D + Math.cos(var10)) - (double)var7 * Math.sin(var10)) / ((double)var3 - (double)var5 * Math.sin(var10) - (double)var7 * Math.cos(var10));
        float var14 = CutShort(180.0D * Math.atan(var12) / 3.141592653589793D);
        System.out.println((Float.toString(var14)));

    }

    public  static float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
