
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public enum Bombard {
    Calc;

    private static final String TAG = "Bombard";
    double CC;
    double D;
    double FYJ = 0.0D;
    double GJ = 0.0D;
    double PI = 3.1415926D;
    double STANP = 760.0D;
    double STANSIGMA = 1.224D;
    double STANTAO = 288.4D;
    double STEP;
    double T;
    double delta = 0.001D;
    double y10;
    double y20;
    double y30;
    double y40;
    double y50;
    double y60;
    double zG = 9.8066D;
    double zK = 1.404D;
    double zR = 29.27D;

    static {
        Bombard[] var0 = new Bombard[]{Calc};
    }

    private Bombard() {
    }

    public static void main(String[] var0) {
        Bombard.CalcResult var1 = Calc.calculate(20.6D, 500.0D, 3000.0D, 50.0D);
        PrintStream var2 = System.out;
        Object[] var3 = new Object[]{var1.delta, (int)var1.T, var1.shootDistance, var1.horizontalSpeed, var1.verticalSpeed, var1.landingAngle};
        var2.println(String.format("退拽:%f%n时间:%d%n射程:%f%n水平速度:%f%n垂直速度:%f%n落角:%f%n", var3));
    }

    Double Cx0(double var1) {
//        Log.i("Bombard", "m=" + var1);
        String var4 = "c:/";
        File var5 = new File(var4 + "a.txt");

        FileInputStream var6;
        try {
            var6 = new FileInputStream(var5);
        } catch (FileNotFoundException var20) {
            var20.printStackTrace();
            return null;
        }

        Scanner var7 = new Scanner(var6);
        double var8 = 100.0D * var1 / 100.0D;
        double var10 = (1.0D + 100.0D * var1) / 100.0D;

        double var12;
        double var15;
        do {
            var12 = (double)var7.nextFloat();
//            Log.i("Bombard", "Cx0: tmp=" + var12);
            var15 = (double)var7.nextFloat();
        } while(var7.hasNextFloat() && var1 >= 0.1D && Math.abs(var12 - var8) > 0.005D);

        double var10000 = (double)var7.nextFloat();
        return var15 + ((double)var7.nextFloat() - var15) / (var10 - var8) * (var1 - var8);
    }

    void Lg_Kt1(double var1, double var3) {
        while(this.y30 > var3) {
            double var5;
            if (this.y30 < 13000.0D) {
                var5 = this.STANTAO - 0.00586D * this.y30;
            } else {
                var5 = this.STANTAO - 76.17999999999999D;
            }

            double var7 = Math.sqrt(this.y40 * this.y40 + this.y50 * this.y50) / Math.sqrt(var5 * this.zK * this.zG * this.zR);
            double var9 = this.CC * Math.sqrt(this.zG / var5) * Math.exp(this.y60 / this.zR) * this.Cx0(var7);
            double var11 = this.y40;
            double var13 = this.y50;
            double var15 = -var9 * this.y40;
            double var17 = -var9 * this.y50 - this.zG;
            double var19 = -this.y50 / var5;
            double var21 = this.y40 + var15 * (var1 / 2.0D);
            double var23 = this.y50 + var17 * (var1 / 2.0D);
            double var25 = this.y50 + var17 * (var1 / 2.0D);
            double var27;
            if (var25 < 13000.0D) {
                var27 = this.STANTAO - 0.00586D * var25;
            } else {
                var27 = this.STANTAO - 76.17999999999999D;
            }

            double var29 = Math.sqrt(Math.pow(this.y40 + var15 * (var1 / 2.0D), 2.0D) + Math.pow(this.y50 + var17 * (var1 / 2.0D), 2.0D)) / Math.sqrt(var27 * this.zK * this.zG * this.zR);
            double var31 = this.y60 + var19 * (var1 / 2.0D);
            double var33 = this.CC * Math.sqrt(this.zG / var27) * Math.exp(var31 / this.zR) * this.Cx0(var29);
            double var35 = -var33 * (this.y40 + var15 * (var1 / 2.0D));
            double var37 = -var33 * (this.y50 + var17 * (var1 / 2.0D)) - this.zG;
            double var39 = -(this.y50 + var17 * (var1 / 2.0D)) / var27;
            double var41 = this.y40 + var35 * (var1 / 2.0D);
            double var43 = this.y50 + var37 * (var1 / 2.0D);
            double var45 = this.y50 + var37 * (var1 / 2.0D);
            double var47;
            if (var45 < 13000.0D) {
                var47 = this.STANTAO - 0.00586D * var45;
            } else {
                var47 = this.STANTAO - 76.17999999999999D;
            }

            double var49 = Math.sqrt(Math.pow(this.y40 + var35 * (var1 / 2.0D), 2.0D) + Math.pow(this.y50 + var37 * (var1 / 2.0D), 2.0D)) / Math.sqrt(var47 * this.zK * this.zG * this.zR);
            double var51 = this.y60 + var39 * (var1 / 2.0D);
            double var53 = this.CC * Math.sqrt(this.zG / var47) * Math.exp(var51 / this.zR) * this.Cx0(var49);
            double var55 = -var53 * (this.y40 + var35 * (var1 / 2.0D));
            double var57 = -var53 * (this.y50 + var37 * (var1 / 2.0D)) - this.zG;
            double var59 = -(this.y50 + var37 * (var1 / 2.0D)) / var47;
            double var61 = this.y40 + var1 * var55;
            double var63 = this.y50 + var1 * var57;
            double var65 = this.y50 + var1 * var57;
            double var67;
            if (var65 < 13000.0D) {
                var67 = this.STANTAO - 0.00586D * var65;
            } else {
                var67 = this.STANTAO - 76.17999999999999D;
            }

            double var69 = Math.sqrt(Math.pow(this.y40 + var1 * var55, 2.0D) + Math.pow(this.y50 + var1 * var57, 2.0D)) / Math.sqrt(var67 * this.zK * this.zG * this.zR);
            double var71 = this.y60 + var1 * var59;
            double var73 = this.CC * Math.sqrt(this.zG / var67) * Math.exp(var71 / this.zR) * this.Cx0(var69);
            double var75 = -var73 * (this.y40 + var1 * var55);
            double var77 = -var73 * (this.y50 + var1 * var57) - this.zG;
            double var79 = -(this.y50 + var1 * var57) / var67;
            this.y10 += var1 / 6.0D * (1.0D + 1.0D + 2.0D * 1.0D + 2.0D * 1.0D);
            this.y20 += var1 / 6.0D * (var61 + var11 + 2.0D * var21 + 2.0D * var41);
            this.y30 += var1 / 6.0D * (var63 + var13 + 2.0D * var23 + 2.0D * var43);
            this.y40 += var1 / 6.0D * (var75 + var15 + 2.0D * var35 + 2.0D * var55);
            this.y50 += var1 / 6.0D * (var77 + var17 + 2.0D * var37 + 2.0D * var57);
            this.y60 += var1 / 6.0D * (var79 + var19 + 2.0D * var39 + 2.0D * var59);
        }

    }

    void Lg_Kt2(double var1, double var3) {
        while(this.y30 < var3) {
            double var5;
            if (this.y30 < 13000.0D) {
                var5 = this.STANTAO - 0.00586D * this.y30;
            } else {
                var5 = this.STANTAO - 76.17999999999999D;
            }

            double var7 = Math.sqrt(this.y40 * this.y40 + this.y50 * this.y50) / Math.sqrt(var5 * this.zK * this.zG * this.zR);
            double var9 = this.CC * Math.sqrt(this.zG / var5) * Math.exp(this.y60 / this.zR) * this.Cx0(var7);
            double var11 = this.y40;
            double var13 = this.y50;
            double var15 = -var9 * this.y40;
            double var17 = -var9 * this.y50 - this.zG;
            double var19 = -this.y50 / var5;
            double var21 = this.y40 + var15 * (var1 / 2.0D);
            double var23 = this.y50 + var17 * (var1 / 2.0D);
            double var25 = this.y50 + var17 * (var1 / 2.0D);
            double var27;
            if (var25 < 13000.0D) {
                var27 = this.STANTAO - 0.00586D * var25;
            } else {
                var27 = this.STANTAO - 76.17999999999999D;
            }

            double var29 = Math.sqrt(Math.pow(this.y40 + var15 * (var1 / 2.0D), 2.0D) + Math.pow(this.y50 + var17 * (var1 / 2.0D), 2.0D)) / Math.sqrt(var27 * this.zK * this.zG * this.zR);
            double var31 = this.y60 + var19 * (var1 / 2.0D);
            double var33 = this.CC * Math.sqrt(this.zG / var27) * Math.exp(var31 / this.zR) * this.Cx0(var29);
            double var35 = -var33 * (this.y40 + var15 * (var1 / 2.0D));
            double var37 = -var33 * (this.y50 + var17 * (var1 / 2.0D)) - this.zG;
            double var39 = -(this.y50 + var17 * (var1 / 2.0D)) / var27;
            double var41 = this.y40 + var35 * (var1 / 2.0D);
            double var43 = this.y50 + var37 * (var1 / 2.0D);
            double var45 = this.y50 + var37 * (var1 / 2.0D);
            double var47;
            if (var45 < 13000.0D) {
                var47 = this.STANTAO - 0.00586D * var45;
            } else {
                var47 = this.STANTAO - 76.17999999999999D;
            }

            double var49 = Math.sqrt(Math.pow(this.y40 + var35 * (var1 / 2.0D), 2.0D) + Math.pow(this.y50 + var37 * (var1 / 2.0D), 2.0D)) / Math.sqrt(var47 * this.zK * this.zG * this.zR);
            double var51 = this.y60 + var39 * (var1 / 2.0D);
            double var53 = this.CC * Math.sqrt(this.zG / var47) * Math.exp(var51 / this.zR) * this.Cx0(var49);
            double var55 = -var53 * (this.y40 + var35 * (var1 / 2.0D));
            double var57 = -var53 * (this.y50 + var37 * (var1 / 2.0D)) - this.zG;
            double var59 = -(this.y50 + var37 * (var1 / 2.0D)) / var47;
            double var61 = this.y40 + var1 * var55;
            double var63 = this.y50 + var1 * var57;
            double var65 = this.y50 + var1 * var57;
            double var67;
            if (var65 < 13000.0D) {
                var67 = this.STANTAO - 0.00586D * var65;
            } else {
                var67 = this.STANTAO - 76.17999999999999D;
            }

            double var69 = Math.sqrt(Math.pow(this.y40 + var1 * var55, 2.0D) + Math.pow(this.y50 + var1 * var57, 2.0D)) / Math.sqrt(var67 * this.zK * this.zG * this.zR);
            double var71 = this.y60 + var1 * var59;
            double var73 = this.CC * Math.sqrt(this.zG / var67) * Math.exp(var71 / this.zR) * this.Cx0(var69);
            double var75 = -var73 * (this.y40 + var1 * var55);
            double var77 = -var73 * (this.y50 + var1 * var57) - this.zG;
            double var79 = -(this.y50 + var1 * var57) / var67;
            this.y10 += var1 / 6.0D * (1.0D + 1.0D + 2.0D * 1.0D + 2.0D * 1.0D);
            this.y20 += var1 / 6.0D * (var61 + var11 + 2.0D * var21 + 2.0D * var41);
            this.y30 += var1 / 6.0D * (var63 + var13 + 2.0D * var23 + 2.0D * var43);
            this.y40 += var1 / 6.0D * (var75 + var15 + 2.0D * var35 + 2.0D * var55);
            this.y50 += var1 / 6.0D * (var77 + var17 + 2.0D * var37 + 2.0D * var57);
            this.y60 += var1 / 6.0D * (var79 + var19 + 2.0D * var39 + 2.0D * var59);
        }

    }

    public Bombard.CalcResult calculate(double var1, double var3, double var5, double var7) {
        Bombard.CalcResult var9 = new Bombard.CalcResult();
        if (var1 == 21.2D) {
            this.D = 0.53749D;
        }

        if (var1 == 20.6D) {
            this.D = 0.21656D;
        }

        if (var1 == 21.3D) {
            this.D = 0.59084D;
        }

        if (var1 == 21.1D) {
            this.D = 0.4841D;
        } else {
            this.D = (var1 - 20.197D) / 1.8645D;
        }

        this.y10 = 0.0D;
        this.y20 = 0.0D;
        this.y30 = var5;
        this.y40 = var3 / 3.6D * Math.cos(this.GJ - this.FYJ);
        this.y50 = var3 / 3.6D * Math.sin(this.GJ - this.FYJ);
        if (this.y30 <= 500.0D) {
            this.CC = 1.224D * this.D / 1.228D;
        } else if (this.y30 <= 1000.0D && this.y30 > 500.0D) {
            this.CC = 1.224D * this.D / 1.2195D;
        } else if (this.y30 <= 1500.0D && this.y30 > 1000.0D) {
            this.CC = 1.224D * this.D / 1.205D;
        } else if (this.y30 <= 2000.0D && this.y30 > 1500.0D) {
            this.CC = 1.224D * this.D / 1.195D;
        } else if (this.y30 <= 2500.0D && this.y30 > 2000.0D) {
            this.CC = 1.224D * this.D / 1.183D;
        } else if (this.y30 <= 3000.0D && this.y30 > 2500.0D) {
            this.CC = 1.224D * this.D / 1.168D;
        } else if (this.y30 <= 4000.0D && this.y30 > 3000.0D) {
            this.CC = 1.224D * this.D / 1.156D;
        } else if (this.y30 <= 4500.0D && this.y30 > 4000.0D) {
            this.CC = 1.224D * this.D / 1.14D;
        } else if (this.y30 <= 5000.0D && this.y30 > 4500.0D) {
            this.CC = 1.224D * this.D / 1.129D;
        } else if (this.y30 <= 5500.0D && this.y30 > 5000.0D) {
            this.CC = 1.224D * this.D / 1.118D;
        } else if (this.y30 <= 6000.0D && this.y30 > 5500.0D) {
            this.CC = 1.224D * this.D / 1.108D;
        } else if (this.y30 <= 6500.0D && this.y30 > 6000.0D) {
            this.CC = 1.224D * this.D / 1.095D;
        } else if (this.y30 <= 7000.0D && this.y30 > 6500.0D) {
            this.CC = 1.224D * this.D / 1.078D;
        } else if (this.y30 <= 7500.0D && this.y30 > 7000.0D) {
            this.CC = 1.224D * this.D / 1.066D;
        } else if (this.y30 <= 8000.0D && this.y30 > 7500.0D) {
            this.CC = 1.224D * this.D / 1.05D;
        } else if (this.y30 <= 8500.0D && this.y30 > 8000.0D) {
            this.CC = 1.224D * this.D / 1.055D;
        } else if (this.y30 <= 9000.0D && this.y30 > 8500.0D) {
            this.CC = 1.224D * this.D / 1.046D;
        } else if (this.y30 <= 9500.0D && this.y30 > 9000.0D) {
            this.CC = 1.224D * this.D / 1.022D;
        } else if (this.y30 <= 10000.0D && this.y30 > 9500.0D) {
            this.CC = 1.224D * this.D / 1.01D;
        } else if (this.y30 > 10000.0D) {
            this.CC = 1.224D * this.D;
        }

        if (var5 >= 2000.0D) {
            this.STEP = 2.0D;
        } else {
            this.STEP = 1.0D;
        }

        if (this.y30 < 13000.0D) {
            this.y60 = 170.64846416382252D * Math.log(1.0D - 0.00586D * var5 / this.STANTAO);
        } else {
            this.y60 = 170.64846416382252D * Math.log(1.0D - 76.17999999999999D / this.STANTAO) - (var5 - 13000.0D) / (this.STANTAO - 76.18D);
        }

        this.Lg_Kt1(this.STEP, var7);
        if (this.y30 == var7) {
            this.T = this.y10;
            this.delta = var3 / 3.6D * this.y10 - this.y20;
        } else {
            this.Lg_Kt2(-this.STEP / 4.0D, var7);
        }

        if (this.y30 == var7) {
            this.T = this.y10;
            this.delta = var3 / 3.6D * this.y10 - this.y20;
        } else {
            this.Lg_Kt1((this.y30 - var7) / Math.abs(this.y50), var7);
            this.T = this.y10;
            this.delta = var3 / 3.6D * this.y10 - this.y20;
        }

        var9.delta = this.delta;
        var9.T = this.T;
        var9.horizontalSpeed = this.y40;
        var9.verticalSpeed = this.y50;
        var9.speed = Math.sqrt(this.y40 * this.y40 + this.y50 * this.y50);
        var9.shootDistance = this.y20;
        var9.landingAngle = 180.0D - 180.0D * Math.atan2(this.y40, this.y50) / this.PI;
        return var9;
    }

    public class CalcResult {
        public double T;
        public double delta;
        public double horizontalSpeed;
        public double landingAngle;
        public double shootDistance;
        public double speed;
        public double verticalSpeed;

        public CalcResult() {
        }
    }
}
