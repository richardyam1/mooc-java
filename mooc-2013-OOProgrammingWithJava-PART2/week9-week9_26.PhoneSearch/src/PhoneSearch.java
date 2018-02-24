/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */
import java.util.*;
public class PhoneSearch {
    
    private Scanner reader;
    private Map<String, Set<String>> phoneNumbers;
    private Map<String, Address> address; 
    private List<String> filter;
    public PhoneSearch(Scanner reader){
        this.reader = reader;
        this.phoneNumbers = new HashMap<String, Set<String>>();
        this.address = new HashMap<String, Address>();
        this.filter = new ArrayList<String>();
    }
    
    public void phoneSearchStart(){
        System.out.println("phone search");
        System.out.println("available operations");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        
        while(true){
            System.out.print("command: ");
            String command = reader.nextLine();
            if(command.equals("x")){
                break;
            }
            else if(command.equals("1")){
                addNumber(this.reader);
            }
            else if(command.equals("2")){
                searchByName(this.reader);
            }
            else if(command.equals("3")){
                searchByNumber(this.reader);
            }
            else if(command.equals("4")){
                addAddress(this.reader);
            }
            else if(command.equals("5")){
                searchInfo(this.reader);
            }
            else if(command.equals("6")){
                deleteInfo(this.reader);
            }
            else{
                filterInfo(this.reader);
            }
        }
    }
    
    public void addNumber(Scanner reader){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        if(!this.phoneNumbers.containsKey(name)){
           this.phoneNumbers.put(name, new HashSet<String>());
        }
        this.phoneNumbers.get(name).add(number);
    }
    
    public void searchByName(Scanner reader){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        if(!this.phoneNumbers.containsKey(name)){
            System.out.println("  not found");
        }
        else{
            //for(String s : this.phoneNumbers.keySet()){
                for(String n : this.phoneNumbers.get(name)){
                    System.out.println(" " + n);
                }
            //}            
        }        
    }
    
    public void searchByNumber(Scanner reader){
        Boolean numberFound = false;
        System.out.print("number: ");
        String number = reader.nextLine();
        for(String name : this.phoneNumbers.keySet()){
            for(String n : this.phoneNumbers.get(name)){
                if(n.equals(number)){
                    System.out.println(" " + name);
                    numberFound = true;
                }
            }            
        }
        if(numberFound == false){
            System.out.println(" not found");
        }
    }
    
    public void addAddress(Scanner reader){
        
        System.out.print("whose address: ");
        String name = reader.nextLine();
        
        System.out.print("street: ");
        String street = reader.nextLine();
        
        System.out.print("city: ");
        String city = reader.nextLine();
        
        this.address.put(name, new Address(street, city));            
               
    }
    
    public void searchInfo(Scanner reader){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        if(!this.address.containsKey(name) && !this.phoneNumbers.containsKey(name)){
            System.out.println("  not found");
        }
        
        else{
            if(!this.address.containsKey(name)){
                System.out.println("  address unknown");
            }
            else{
                System.out.println("  address: " + this.address.get(name));
            }

            if(!this.phoneNumbers.containsKey(name)){
                System.out.println("  phone number not found");
            }
            else{
                System.out.println("  phone numbers: ");
                for(String s : this.phoneNumbers.keySet()){
                    for(String n : this.phoneNumbers.get(name)){
                        System.out.println("   " + n);
                    }
                }  
            }
        }
    }
    
    public void deleteInfo(Scanner reader){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        this.phoneNumbers.remove(name);
        this.address.remove(name);
    }
    
    public void filterInfo(Scanner reader){
        filter.clear();
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        if(keyword.equals("")){
            for(String name : this.address.keySet()){
                printInfo(name);
            }
        }
        else{
            for(String name : this.phoneNumbers.keySet()){
               // if(!this.names.contains(name)){
                    if(name.indexOf(keyword)!= -1){
                        this.filter.add(name);
                    }
                    else{
                        if(this.address.get(name) != null){
                            String street = this.address.get(name).getStreet();
                            String city = this.address.get(name).getCity();
                            if(street.indexOf(keyword) != -1 || city.indexOf(keyword) != -1){
                                this.filter.add(name);

                            }
                        }
                     
                    }
               // }

            }
        }
        
        if(filter.isEmpty()){
            System.out.println("  keyword not found");
        }
        else{
            Collections.sort(filter);
            for(String filterName : filter){
                printInfo(filterName);
            }
        }
    }
    
    public void printInfo(String name){
        System.out.println(name);
        if(this.address.get(name) != null){
            System.out.println("  address: " + this.address.get(name));
        }
        else{
            System.out.println("  address unknown");
        }
        
        if(this.phoneNumbers.get(name) != null){
            System.out.println("  phone numbers: ");
            for(String n : this.phoneNumbers.get(name)){
                System.out.println("   " + n);
            }
        }
        else{
            System.out.println("  phone number not found");
        }

    }
}
