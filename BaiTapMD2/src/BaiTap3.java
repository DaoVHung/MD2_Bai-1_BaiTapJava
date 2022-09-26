import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số có 3 chữ số :");
        int num = Integer.parseInt(sc.nextLine());
        int a = num/100;
        num = num%100;
        int b = num/10;
        int c = num%10;
            switch (a){
                case 0:
                    System.out.print(" Không Trăm ");
                    break;
                case 1:
                    System.out.print("Một Trăm ");
                    break;
                case 2:
                    System.out.print("Hai Trăm ");
                    break;
                case 3:
                    System.out.print("Ba Trăm ");
                    break;
                case 4:
                    System.out.print("Bốn Trăm ");
                    break;
                case 5:
                    System.out.print("Năm Trăm ");
                    break;
                case 6:
                    System.out.print("Sáu Trăm ");
                    break;
                case 7:
                    System.out.print("Bảy Trăm ");
                    break;
                case 8:
                    System.out.print("Tám Trăm ");
                    break;
                case 9:
                    System.out.print("Chín Trăm ");
            }
            switch(b){
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print("Mười ");
                    break;
                case 2:
                    System.out.print("Hai Mươi ");
                    break;
                case 3:
                    System.out.print("Ba Mươi ");
                    break;
                case 4:
                    System.out.print("Bốn Mươi ");
                    break;
                case 5:
                    System.out.print("Năm Mươi ");
                    break;
                case 6:
                    System.out.print("Sáu Mươi ");
                    break;
                case 7:
                    System.out.print("Bảy Mươi ");
                    break;
                case 8:
                    System.out.print("Tám Mươi ");
                    break;
                case 9:
                    System.out.print("Chín Mươi ");
               }
               switch (c){
                   case 0:
                       System.out.print(" ");
                       break;
                   case 1:
                       System.out.print("Mốt ");
                       break;
                   case 2:
                       System.out.print("Hai ");
                       break;
                   case 3:
                       System.out.print("Ba ");
                       break;
                   case 4:
                       System.out.print("Bốn ");
                       break;
                   case 5:
                       System.out.print("Năm ");
                       break;
                   case 6:
                       System.out.print("Sáu ");
                       break;
                   case 7:
                       System.out.print("Bảy ");
                       break;
                   case 8:
                       System.out.print("Tám ");
                       break;
                   case 9:
                       System.out.print("Chín ");
               }

    }
}
