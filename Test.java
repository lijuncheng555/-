package c;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] l = new String[3];
        Doctor i1 = new Doctor("wu", "wu", "wu",0, 0);
        Doctor i2 = new Doctor("wu", "wu", "wu",0, 0);
        System.out.println("�����������������Ա����䣬ÿѧ�ڽ���ѧ�ѣ�ÿ�¹���");
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
                System.out.println("��");
            }

        }
        int g1 = i1.getFare();
        double g2 = in.nextDouble();
        i1.setSalary(g2);
        System.out.println("�����ѧ��(" + g1 + "Ԫ):");
        int z = in.nextInt();
        while (z != g1) {
            if (z != g1) {
                break;
            } else {
                System.out.println("������");
            }
            z = in.nextInt();
        }
        System.out.println("�ɷѳɹ�");
        System.out.println(i1);
        System.out.println("1Ϊ����ѧ�ѣ�2Ϊ��ѯѧ�ѣ�3Ϊ��ѯ���ʣ�0Ϊ������");
        s:
        for (int w = 0; w < 4; w++) {
            int i = in.nextInt();
            switch (i) {
                case 1:
                    System.out.println("����ѧ��Ϊ" + i1.payFare(g1));
                    break;
                case 2:
                    System.out.println("��ѯѧ��Ϊ" + i2.chackFare(g1));
                    break;
                case 3:
                    System.out.println("��ѯ����Ϊ��ÿ�½�˰ǰ��" + i1.getSalary(g2));
                    System.out.println("��ѯ����Ϊ��ÿ�½�˰��" + (i1.getSalary(g2) - (i1.getSalary(g2) * 0.1) - 105));
                    System.out.println("��ѯ����Ϊ��ÿ�꽻˰��" + ((i1.getSalary(g2) - (i1.getSalary(g2) * 0.1) - 105) * 9 - 2 * g1));
                    break;
                case 0:
                    break s;

            }
        }
        System.out.println("�����������������Ա����䣬ÿѧ��");
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
                System.out.println("��");
            }

        }
        int g3 = i1.getFare();
        double g4 = in.nextDouble();
        i2.setSalary(g4);
        System.out.println("�����ѧ�ѣ�" + g3 + "Ԫ��:");
        int z1 = in.nextInt();
        while (z1 != g3) {
            if (z1 != g3) {
                break;
            } else {
                System.out.println("������");
            }
            z1 = in.nextInt();
        }
        System.out.println("���ɳɹ�");
        System.out.println(i2);
        System.out.println("1Ϊ����ѧ�ѣ�2Ϊ��ѯѧ�ѣ�3Ϊ��ѯ���ʣ�0Ϊ������");
        o:
        for (int w = 0; w < 4; w++) {
            int i3 = in.nextInt();
            switch (i3) {
                case 1:
                    System.out.println(i2.payFare(g3));
                    break;
                case 2:
                    System.out.println("��ѯѧ��Ϊ��" + i2.chackFare(g3));
                    break;
                case 3:
                    System.out.println("��ѯ����Ϊ��ÿ�½�˰ǰ��" + i1.getSalary(g4));
                    System.out.println("��ѯ����Ϊ��ÿ�½�˰��" + (i1.getSalary(g4) - (i1.getSalary(g4) * 0.1) - 105));
                    System.out.println("��ѯ����Ϊ��ÿ�꽻˰��" + ((i1.getSalary(g4) - (i1.getSalary(g4) * 0.1) - 105) * 9 - 2 * g3));
                    break;
                case 0:
                    break o;
            }
        }
    }


}
