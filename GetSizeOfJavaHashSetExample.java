package omatohjelmat;

import java.util.HashSet;

public class GetSizeOfJavaHashSetExample{
 
  public static void main(String[] args) {
   
    //create HashSet object
    HashSet hSet = new HashSet();
   
    /*
      To get the size of HashSet use
      int size() method of HashSet class. It returns the number of elements
      stored in HashSet object.    
    */
    System.out.println("Size of HashSet : " + hSet.size());
   
    //add elements to HashSet object
    hSet.add(new Integer("1"));
    hSet.add(new Integer("2"));
    hSet.add(new Integer("3"));
    hSet.add(new Integer("3"));
    hSet.add(new Integer("3"));
    hSet.add(new Integer("4"));
    
 
    System.out.println("Size of HashSet after addition : " + hSet.size());
   
    //remove one element from HashSet using remove method
    hSet.remove(new Integer("1"));
    System.out.println("Size of HashSet after removal : " + hSet.size());
  }
}
