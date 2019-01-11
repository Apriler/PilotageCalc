package ontime;

import com.ycjr.poiltcalculation.activity.ontime.OnTimeSpeedChange;

/**
 * 5.预计时间内的地速修正量
 * 输入： 1.早到或者晚到的时间差  单位：分钟，
 *       2.预定的飞行时间  单位：分钟 ，
 *       3.飞机的地速  单位：公里/小时 1-1999，
 *
 * 输出：地速修正量   单位： 公里/小时
 */
public class OnTimeSpeedChangeCalc {

    public static void main(String[] args) {



        double var2 = 0.0D;


        //早到或者晚到的时间差
        double var5 = 20;
        //预定的飞行时间
        double var8 = 15;
        //飞机的地速
        double var11 = 100;


        if (var8 != var2) {
            var2 = var11 * (var5 / var8);
        }


        System.out.println("地速修正量:"+var2 );
    }


}
