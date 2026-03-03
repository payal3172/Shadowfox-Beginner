//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class Contact{
    private String name;
    private String phone;
    private String email;

    public Contact(String name,String phone,String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

//Call Getter Methods
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
// Call Setter Methods
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    //Overriding the Methods
    @ Override
    public String toString(){
        return "Name:" +name+"Phone:" +phone+"Email:" +email;
    }
}
//Contact Management System : Details of Contacts :
//Add contact , View Contact , Update Contact , Delete Contact
//Main Class

public class ContactManagementSystem{
     static ArrayList <Contact> contacts = new ArrayList <> ();
     static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        while(true){
        System.out.println("\n Contact Management System ");
        System.out.println("1. Add Contact . ");
        System.out.println("2. View Contact .");
        System.out.println("3. Update Contact .");
        System.out.println("4. Delete Contact .");
        System.out.println("3. Exit");
        System.out.println("Choose An Option");

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1 :
                addContact();
                break;
            case 2 :
                viewContact();
                break;
            case 3 :
                updateContact();
                break;
            case 4 :
                deleteContact();
                break;
            case 5 :
                System.out.println("Exiting -----------");
                break;
            default :
                System.out.println("Invalid Choice. Try Again");
             }
        }
    }
//Add new Contact By Using addContact().
        private static void addContact(){
            System.out.print(" Enter Name of Contact ");
            String name = sc.nextLine();

            System.out.println(" Enter Contact Number ");
            String phone = sc.nextLine();

            System.out.println(" Enter Email of Contct");
            String email = sc.nextLine();

            contacts.add(new Contact(name, phone, email));

            System.out.println(" Contact Added Sucessfully ");
        }
//View Contact by Using viewContact().
        private static void viewContact(){
            if(contacts.isEmpty()){
                System.out.println("NO Contacts Found");
            }else{
                System.out.println("Contacts");
                for(Contact contact : contacts){
                    System.out.println("yes");
                }
            }
        }
        private static void updateContact(){
            System.out.println("Enter name of the Contact to Update");
            String name = sc.nextLine();

            for(Contact contact : contacts){
                if(contact.getName().equalsIgnoreCase(name)){
                    System.out.println("Enter new naame (leave blank to keep Current):");
                    String newName = sc.nextLine();
                    if(!newName.isEmpty())contact.setName(newName);

                    System.out.println("Enter new Contact number(leave blank to keep current):");
                    String newPhone = sc.nextLine();
                    if(!newPhone.isEmpty())contact.setPhone(newPhone);

                    System.out.println("Enter new email(leave blank to keep current):");
                    String newEmail = sc.nextLine();
                    if(!newEmail.isEmpty())contact.setEmail(newEmail);

                    System.out.println("Contact Updatted Successfully");
                    return;
                }
            }
            System.out.println("Contact Not Found");
        }
        private static void deleteContact(){
            System.out.println("Enter name of Contact to delete");
            String name = sc.nextLine();
            for(Contact contact : contacts){
                if(contact.getName().equalsIgnoreCase(name)){
                    contacts.remove(contact);
                    System.out.println("Contact Deleted Successfully");
                    return;
                }
            }
            System.out.println("Contact Not Found");
        
    }
}


