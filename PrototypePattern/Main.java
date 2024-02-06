package PrototypePattern;
/*
 * This concept is to copy existing object rather than creating a new instance form scratch because creating a new object may be 
 * costly. This approch saves costly resources and time , especially when object creation is a heavy process
 * 
 * So suppose there is some complex logic while creating a object . so why to execute than again and again while creating a new object
 * just create a copy of that object and make whatever number of objects we want 
 * 
 * So We have to make the Network Connection class Cloneable by implementing the Cloneable interface
 * also overide the clone() Method 
 * Now we can make clone of that object
 */

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        
        NetworkConnection connection=new NetworkConnection();
        connection.setIp("19.90.20.122");
        connection.loadImpData();

        System.out.println(connection);

        NetworkConnection connection2=(NetworkConnection) connection.clone();
        System.out.println(connection2);

    }
}
