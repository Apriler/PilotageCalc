package ontime;

import com.ycjr.poiltcalculation.activity.ontime.ChangeSpeedFlyDistance;

/**
 * 2.调整速度所需最短距离
 * 输入： 1.预定空速  单位：公里/小时 1-1999，
 *       2.平飞时可能使用的最小空速  单位：公里/小时 1-1999，
 *       3.平飞时可能使用的最大空速  单位：公里/小时 1-1999，
 *       4.可能产生的最大时刻差  单位：分钟 ，
 *
 * 输出：（早到）调整速度所需的最短距离   单位： 公里
 * （晚到）调整速度所需的最短距离   单位： 公里
 */
public class ChangeSpeedFlyDistanceCalc {

    public static void main(String[] args) {



        //预定空速
        double var3 = 100;
        //平飞时可能使用的最小空速
        double var6 = 20;
        //平飞时可能使用的最大空速
        double var9 = 150;
        //可能产生的最大时刻差
        double var12 = 10;


        var12 = var12 / 60.0D;
        double var14 = var12 * var3 * var6 / (var3 - var6);
        System.out.println("（早到）调整速度所需的最短距离 :"+var14 + "");
        double var16 = var12 * var3 * var9 / (var9 - var3);
        System.out.println("（晚到）调整速度所需的最短距离 :"+var16 + "");
    }


}
