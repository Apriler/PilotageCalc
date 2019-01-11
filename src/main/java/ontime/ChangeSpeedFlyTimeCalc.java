package ontime;

import com.ycjr.poiltcalculation.activity.ontime.ChangeSpeedFlyTime;

/**
 * 4.调速飞行时间
 * 输入： 1.原地速  单位：公里/小时 1-1999，
 *       2.地速修正量  单位：公里/小时 ，
 *       3.调速后补偿的时间误差  单位：分钟 ，
 *
 *
 * 输出：调速飞行时间   单位： 分钟
 *
 */
public class ChangeSpeedFlyTimeCalc {

    public static void main(String[] args) {




        double var2 = 0.0D;


        //原地速
        double var5 = 200;
        //地速修正量
        double var8 = 15;
        //调速后补偿的时间误差
        double var11 = 10;


        var11 = var11 / 60.0D;
        if (var8 != var2) {
            var2 = var11 * (var5 / var8);
        }

        System.out.println("调速飞行时间:"+(60.0D * var2 + ""));
    }


}
