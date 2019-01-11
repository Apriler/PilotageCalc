package ontime;

import com.ycjr.poiltcalculation.activity.ontime.FlyTrueSpeed;

/**
 * 3.按应飞地速调整应飞真空速
 * 输入： 1.检查点前的真空速  单位：公里/小时 1-1999，
 *       2.剩余距离  单位：公里 ，
 *       3.剩余时间  单位：分钟 ，
 *       4.检查点前的实际地速  单位：公里/小时 1-1999，
 *
 * 输出：应飞真空速   单位： 公里/小时
 *
 */
public class FlyTrueSpeedCalc {

    public static void main(String[] args) {



        //检查点前的真空速
        double var3 = 100;
        //剩余距离
        double var6 = 200;
        //剩余时间
        double var9 = 15;
        //检查点前的实际地速
        double var12 = 100;


        var9 = var9 / 60.0D;

        double var14;
        if (var9 == 0.0D) {
            var14 = 0.0D;
        } else {
            var14 = var6 / var9;
        }

        double var16 = var3 + var14 - var12;
        System.out.println("应飞真空速: "+var16 + "");
    }


}
