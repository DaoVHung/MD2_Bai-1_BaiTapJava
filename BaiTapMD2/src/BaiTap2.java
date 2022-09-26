import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền $ bạn muốn chuyển thành tiền VNĐ ");
        int soTien = sc.nextInt();
        int rate = 23000;
        int Vnd = soTien * rate;
        System.out.println("Số tiền VNĐ : " + Vnd);
    }

}
