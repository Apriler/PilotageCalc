import com.ycjr.poiltcalculation.activity.airline.MoreThan1000Airline;
import com.ycjr.poiltcalculation.constants.CommonConst;

import java.util.Locale;

/**
 * 大圆圈航线诸元计算
 * 输入： 1.起点经度  单位：度，量程 180 ~ -180
 *       2.起点纬度  单位：度 ，量程：90 ~ -90
 *      3.终点经度  单位：度 ，量程：180 ~ -180
 *      4.终点纬度  单位：度 ，量程：90 ~ -90
 *      5.航线点经度  单位：度 ，量程：180 ~ -180
 *
 * 输出：风角   单位： 度
 */
public class AirLineCalc {
    static double radiusAvg = 6371.2D;

    public static void main(String[] args) {



        //起点经度
        double var3 = 100;
        //终点经度
        double var6 = 109;
        //起点纬度
        double var9 = 50;
        //终点纬度
        double var12 = 52;
        //航线点经度
        double var15 = 100;


        double var17 = 180.0D * Math.atan(Math.tan(3.141592653589793D * var12 / 180.0D) * Math.sin(3.141592653589793D * (var15 - var3) / 180.0D) / Math.sin(3.141592653589793D * (var6 - var3) / 180.0D) + Math.tan(3.141592653589793D * var9 / 180.0D) / Math.sin(3.141592653589793D * (var6 - var3) / 180.0D) * Math.sin(3.141592653589793D * (var6 - var15) / 180.0D)) / 3.141592653589793D;
//        EditText var19 = MoreThan1000Airline.this.et_lat_mid;
        Locale var20 = Locale.CHINA;
        Object[] var21 = new Object[]{var17};
        System.out.println("航线点纬度："+String.format(var20, "%.4f", var21));
        double var22 = calculatePathAngle(3.141592653589793D * var3 / 180.0D, 3.141592653589793D * var6 / 180.0D, 3.141592653589793D * var9 / 180.0D, 3.141592653589793D * var12 / 180.0D);
        double var24 = calculateDistancetoFly(3.141592653589793D * var3 / 180.0D, 3.141592653589793D * var6 / 180.0D, 3.141592653589793D * var9 / 180.0D, 3.141592653589793D * var12 / 180.0D);
//        EditText var26 = MoreThan1000Airline.this.angle;
        Locale var27 = Locale.CHINA;
        Object[] var28 = new Object[]{Math.round(var22 * CommonConst.RAD.d)};
        System.out.println("航线角："+String.format(var27, "%d", var28));
//        EditText var29 = MoreThan1000Airline.this.distance;
        Locale var30 = Locale.CHINA;
        Object[] var31 = new Object[]{Math.round(var24)};
        System.out.println("航程："+String.format(var30, "%d", var31));
        double var32 = Math.cos(3.141592653589793D * var12 / 180.0D) * Math.cos(3.141592653589793D * (var6 - var3) / 180.0D);
        double var34 = Math.cos(3.141592653589793D * var12 / 180.0D) * Math.sin(3.141592653589793D * (var6 - var3) / 180.0D);
        double var36 = Math.atan2(Math.sin(3.141592653589793D * var9 / 180.0D) + Math.sin(3.141592653589793D * var12 / 180.0D), Math.sqrt(Math.pow(var32 + Math.cos(3.141592653589793D * var9 / 180.0D), 2.0D) + Math.pow(var34, 2.0D)));
        double var38 = 3.141592653589793D * var3 / 180.0D + Math.atan2(var34, var32 + Math.cos(3.141592653589793D * var9 / 180.0D));
//        Log.i("MoreThan1000Airline", "onClick: lat=" + 180.0D * var36 / 3.141592653589793D);
//        Log.i("MoreThan1000Airline", "onClick: lon=" + 180.0D * var38 / 3.141592653589793D);
//        EditText var42 = MoreThan1000Airline.this.midLon;
        Locale var43 = Locale.CHINA;
        Object[] var44 = new Object[]{180.0D * var38 / 3.141592653589793D};
        System.out.println("中间点经度："+String.format(var43, "%.4f", var44));
//        EditText var45 = MoreThan1000Airline.this.midLat;
        Locale var46 = Locale.CHINA;
        Object[] var47 = new Object[]{180.0D * var36 / 3.141592653589793D};
        System.out.println("中间点纬度："+String.format(var46, "%.4f", var47));
    }

    public static double[] calculateBiasPoint(double var1, double var3, double var5, double var7) {
        if (var5 < 0.0D) {
            return null;
        } else {
            double[] var9 = new double[2];
            double var10 = var5 * Math.sin(var7) / radiusAvg / Math.cos(var1);
            var9[0] = var1 + var5 * Math.cos(var7) / radiusAvg;
            var9[1] = var3 + var10;
            return var9;
        }
    }

    public static double calculateDistancetoFly(double var1, double var3, double var5, double var7) {
        double var9 = Math.sin(var5) * Math.sin(var7) + Math.cos(var5) * Math.cos(var7) * Math.cos(var3 - var1);
        if (var9 > 1.0D - CommonConst.minGap.d) {
            return 0.0D;
        } else {
            return var9 < -1.0D + CommonConst.minGap.d ? radiusAvg : radiusAvg * Math.acos(var9);
        }
    }

    public static double calculatePathAngle(double var1, double var3, double var5, double var7) {
        double var9 = Math.cos(var5) * Math.tan(var7) - Math.sin(var5) * Math.cos(var3 - var1);
        double var11 = Math.sin(var3 - var1);
        if (equals(var3, var1) && var7 > var5) {
            return 0.0D;
        } else if (equals(var3, var1) && var7 < var5) {
            return 3.141592653589793D;
        } else {
            double var13;
            if (Math.abs(var11) < CommonConst.minGap.d) {
                var13 = 0.0D;
            } else {
                var13 = 1.5707963267948966D - Math.atan(Math.abs(var9) / Math.abs(var11));
            }

            if (var9 > 0.0D && var11 > 0.0D) {
                return Math.abs(var13);
            } else if (var9 > 0.0D && var11 < 0.0D) {
                return 6.283185307179586D - Math.abs(var13);
            } else {
                return var9 < 0.0D && var11 > 0.0D ? 3.141592653589793D - Math.abs(var13) : 3.141592653589793D + Math.abs(var13);
            }
        }
    }

    private static boolean equals(double var1, double var3) {

        return Math.abs(var1 - var3) < CommonConst.minGap.d;
    }


}
