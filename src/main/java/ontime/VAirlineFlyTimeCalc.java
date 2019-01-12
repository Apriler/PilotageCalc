package ontime;

import com.ycjr.poiltcalculation.activity.ontime.VAirlineFlyTime;

/**
 * 8.V型航线绕飞平飞时间
 * 输入： 1.消磨时间 单位：分钟 ，
 *       2.盘旋一周所需时间  单位：分钟  ，
 *       3.转弯角的径值  单位：度 0-360，
 *
 *注：该算法，app上有问题
 * 输出：平飞时间  单位：分钟
 */
public class VAirlineFlyTimeCalc {

    public static void main(String[] args) {


        //消磨时间
        double var3 = 100;

        //盘旋一周所需时间
        double var6 = 100;

        //转弯角的径值
        double var9 = 100;


        var3 = var3 / 60.0D;
        var6 = var6 / 60.0D;
        double var11 = var3 - 0.637D * var6 * (var9 - Math.sin(var9));
        double var13 = 2.0D * (1.0D - Math.cos(var9));
        double var15;
        if (var13 == 0.0D) {
            var15 = 0.0D;
        } else {
            var15 = var11 / var13;
        }

        System.out.println((60.0D * var15 + ""));

    }


}
