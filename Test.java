package c;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] l = new String[3];
        Doctor i1 = new Doctor("wu", "wu", "wu",0, 0);
        Doctor i2 = new Doctor("wu", "wu", "wu",0, 0);
        System.out.println("请依次输入姓名，性别，年龄，每学期缴纳学费，每月工资");
        for (int n = 0; n < 3; n++) {
            String g = in.nextLine();
            l[n] = g;
        }
        i1.setName(l[0]);
        i1.setGender(l[1]);
        i1.setAge(l[2]);
        while (true) {
            try {
                Scanner t = new Scanner(System.in);
                i1.setXue(t.nextInt());
              
                break;
            } catch (Exception exception) {
                System.out.println("无");
            }

        }
        int g1 = i1.getFare();
        double g2 = in.nextDouble();
        i1.setSalary(g2);
        System.out.println("请缴纳学费(" + g1 + "元):");
        int z = in.nextInt();
        while (z != g1) {
            if (z != g1) {
                break;
            } else {
                System.out.println("金额错误");
            }
            z = in.nextInt();
        }
        System.out.println("缴费成功");
        System.out.println(i1);
        System.out.println("1为缴纳学费，2为查询学费，3为查询工资，0为结束：");
        s:
        for (int w = 0; w < 4; w++) {
            int i = in.nextInt();
            switch (i) {
                case 1:
                    System.out.println("缴纳学费为" + i1.payFare(g1));
                    break;
                case 2:
                    System.out.println("查询学费为" + i2.chackFare(g1));
                    break;
                case 3:
                    System.out.println("查询工资为（每月交税前）" + i1.getSalary(g2));
                    System.out.println("查询工资为（每月交税后）" + (i1.getSalary(g2) - (i1.getSalary(g2) * 0.1) - 105));
                    System.out.println("查询工资为（每年交税后）" + ((i1.getSalary(g2) - (i1.getSalary(g2) * 0.1) - 105) * 9 - 2 * g1));
                    break;
                case 0:
                    break s;

            }
        }
        System.out.println("请依次输入姓名，性别，年龄，每学期");
        for (int n = 0; n < 3; n++) {
            String g = in.nextLine();
            l[n] = g;
        }
        i2.setName(l[0]);
        i2.setGender(l[1]);
        i2.setAge(l[2]);
        while (true) {
            try {
                Scanner t = new Scanner(System.in);
                i1.setXue(t.nextInt());
                break;
            } catch (Exception exception) {
                System.out.println("无");
            }

        }
        int g3 = i1.getFare();
        double g4 = in.nextDouble();
        i2.setSalary(g4);
        System.out.println("请缴纳学费（" + g3 + "元）:");
        int z1 = in.nextInt();
        while (z1 != g3) {
            if (z1 != g3) {
                break;
            } else {
                System.out.println("金额错误");
            }
            z1 = in.nextInt();
        }
        System.out.println("缴纳成功");
        System.out.println(i2);
        System.out.println("1为缴纳学费，2为查询学费，3为查询工资，0为结束：");
        o:
        for (int w = 0; w < 4; w++) {
            int i3 = in.nextInt();
            switch (i3) {
                case 1:
                    System.out.println(i2.payFare(g3));
                    break;
                case 2:
                    System.out.println("查询学费为：" + i2.chackFare(g3));
                    break;
                case 3:
                    System.out.println("查询工资为（每月交税前）" + i1.getSalary(g4));
                    System.out.println("查询工资为（每月交税后）" + (i1.getSalary(g4) - (i1.getSalary(g4) * 0.1) - 105));
                    System.out.println("查询工资为（每年交税后）" + ((i1.getSalary(g4) - (i1.getSalary(g4) * 0.1) - 105) * 9 - 2 * g3));
                    break;
                case 0:
                    break o;
            }
        }
    }


}
