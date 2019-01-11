package groundspeed;

import com.ycjr.poiltcalculation.activity.groundspeed.HangJiAngleActivity;

import java.util.Locale;

/**
 * 计算航向
 * 输入： 1.航迹角  单位：度，量程 0-360
 *       2.偏流角  单位：度 ，量程：0-360
 *       3.左侧风还是右侧风  单位：布尔
 *
 * 输出：航向   单位： 度
 */
public class HangXiangCalc {

    public static void main(String[] args) {



        //航迹角
        double var3 = 30.0;
        //偏流角
        double var5 = 100;
        //左侧风还是右侧风
        boolean isLeft = true;


        double var7;
        if (isLeft) {
            var7 = var3 - var5;
        } else {
            var7 = var3 + var5;
        }

        System.out.println(var7);
    }


}
