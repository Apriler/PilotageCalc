package turn;

import com.ycjr.poiltcalculation.activity.turn.TurnPodu;

/**
 * 计算转弯坡度
 * 输入： 1.速度  单位:公里/小时  ，量程：1-1999
 *       2.半径   单位： 米 量程：0-500
 *
 *
 * 输出： 坡度  单位：度 ，量程：1-89
 */
public class TurnPoduCalc {

    public static void main(String[] args) {
        //速度
        double var3 = 1000.0;
        //半径
        double var5 = 200.0;


        double var6 = (double)var3 / 3.6D;
        double var8 = 57.29577951308232D * Math.atan(var6 * var6 / (1000.0D * 9.81D * (double)var5));
        float var10 = CutShort(var8);
        System.out.println(Float.toString(var10));
    }

    public  static  float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
