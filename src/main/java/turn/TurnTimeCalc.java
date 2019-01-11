package turn;

import com.ycjr.poiltcalculation.activity.turn.TurnTime;

/**
 * 计算转弯时间
 * 输入： 1.速度  单位:公里/小时  ，量程：1-1999
 *       2.坡度  单位：度 ，量程：1-89
 *       3.转角  单位：度，量程 0-360
 * 输出： 半径   单位： 米
 */
public class TurnTimeCalc {

    public static void main(String[] args) {
        //速度
        double var3 = 100.0;
        //坡度
        double var5 = 30.0;
        //转角
        double var7 = 360.0;

        double var8 = 3.141592653589793D * (double) var5 / 180.0D;
        double var10 = (double) var3 / 3.6D;
        double var12 = 6.283185307179586D * (var10 * var10 / (9.81D * Math.tan(var8))) * (double) var7 / (360.0D * var10);
        int var14 = (int) (var12 / 60.0D);
        double var15 = var12 - (double) (var14 * 60);
        float var17 = CutShort(var15);

        System.out.println(String.valueOf(var14));
        System.out.println(String.valueOf((int) var17));
    }

    public static float CutShort(double var1) {
        double var3 = (double) ((int) (var1 * 10.0D)) / 10.0D;
        if ((double) ((float) (var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float) var3;
    }
}
