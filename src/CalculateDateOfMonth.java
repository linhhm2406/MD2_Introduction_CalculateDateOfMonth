import java.util.Scanner;

public class CalculateDateOfMonth {
    public static void main(String[] args) {
        Scanner inputMonth = new Scanner(System.in);

        System.out.print("Nhap vao thang muon kiem tra : ");
        byte month = inputMonth.nextByte();

        String dateQty;
        switch (month){
            case 2 :
                dateQty = "28 hoac 29";
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                dateQty = "30";
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dateQty = "31";
                break;
            default:
                dateQty = "";
        }
        if (dateQty ==""){
            System.out.println("Vui long nhap so cua thang");
        } else {
            System.out.printf("Thang %d co %s ngay",month,dateQty);
        }
    }
}
