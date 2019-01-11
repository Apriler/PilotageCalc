package turn;

import com.ycjr.poiltcalculation.activity.turn.TurnAngleSpeed;

import java.util.Locale;

/**
 * 计算转弯角速度
 * 输入： 1.转角  单位：度，量程 0-360
 *       2.转时  单位：度 ，量程：1-89
 *
 * 输出：角速度   单位： 度/秒
 */
public class TurnAngleSpeedCalc {

    public static void main(String[] args) {
        //速度
        double var3 = 100.0;
        //转时 :分
        double var5 = 0;
        //转时 :秒
        double var7 = 30.0;

        double var8 = (double)(var3 / (var7 + 60.0F * var5));
        float var10 = CutShort(var8);
        Locale var12 = Locale.CHINA;
        Object[] var13 = new Object[]{var10};
        System.out.println(String.format(var12, "%.2f", var13));
    }

    public static float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
