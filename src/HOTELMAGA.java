import java.util.HashMap;
import java.util.Scanner;



    class Customer {
        String name;
        String address;
        long adharId;
        String phonenumber;
        int numberOfPersons;

        public Customer(String name, String address, long adharId, int numberOfPersons , String phonenumber) {
            this.name = name;
            this.address = address;
            this.adharId = adharId;
            this.phonenumber=phonenumber;
            this.numberOfPersons = numberOfPersons;
        }
    }
    public class HOTELMAGA {
        public static void main(String[] args) {
            int totalRooms =10;
            HashMap<Integer, Customer > roomAssignments =new HashMap<>();
            Scanner scanner = new Scanner (System.in);
            for (int i= 1; i <= totalRooms; i++){
                System.out.println("enter details for room " +i);
                System.out.println( "Customer Name : ");
                String name = scanner.next();
                System.out.println( " ADDRESS : ");
                String Address = scanner.next();
                System.out.println( " adharid : ");
                long adharid = scanner.nextLong();
                System.out.println( " phonenumber : ");
                String phonenumber = scanner.next();
                System.out.println( "Number of persons :");
                int numberofpersons = Integer.parseInt(scanner.next());
                Customer customer =new Customer(name, Address, adharid ,numberofpersons , phonenumber);
                if(!roomAssignments.containsKey(i)){
                    roomAssignments.put(i,customer);
                    System.out.println("Room" + i + "assigned to "+ name);


                }else{
                    System.out.println("room" + i + " is already occupied .");
                    if(roomAssignments.size()==totalRooms);
                    System.out.println("all rooms are occupied");
                    break;

                }

            }
            scanner.close();
        }

    }


