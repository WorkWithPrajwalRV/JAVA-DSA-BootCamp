import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String Department = input.next();

        switch (empID) {
            case 1:
                System.out.println("Kunal");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                System.out.println("Emp number 3 : ");
                switch (Department) {
                    case "It":
                        System.out.println("It Departemnt");
                        break;
                    case "Marketing":
                        System.out.println("Marketing Management");
                        break;
                    default:
                        System.out.println("No department assigned");
                }    
                break;  
            case 4:
                System.out.println("Xavier");
                break;
            default:
                System.out.println("Invalid EmpId");
        }

    }
}
