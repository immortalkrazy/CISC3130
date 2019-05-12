package homework_04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

public class myMap {
      
      private ArrayList<LinkedList<Pair>> theTable;
      private int numElements;
      
      // constructor for the map
      public myMap() {
            theTable = new ArrayList<LinkedList<Pair>>();
            numElements = 0;
      }
            
      public void put(String key, Integer value) {
            
      }
      
      public boolean containsKey(String key) {
            
            return false;
      }
      
      public boolean conatinsValue(Integer value) {
            
            return false;
      }
      
      public boolean remove(Object key) {
            return false;            
      }
      
      public Integer get(String key) {
            return null;
      }
      
      public Set<Pair> entrySet(){
            return null;
      }
      
      private static class Pair {
            
            // private data fields for pair object
            private String str;
            private Integer value;
            
            // constructor which takes the string and a value
            public Pair(String str, Integer value) {
                  
                  this.str = str;
                  this.value = value;
            }
            // returns the String key stored in the pair object
            public String getKey() {
                  return str;
            }
            // returns the value stored pair object
            public Integer getValue() {
                  return value;
            }

            public Integer setValue(Integer val) {
                  // get the old value from the object
                  Integer oldValue = this.value;
                  // change value of the object with the given value
                  this.value = val;
                  // return old value
                  return oldValue;
            }
            @Override
            public int hashCode() {
                  final int prime = 31;
                  int result = 1;
                  result = prime * result + ((str == null) ? 0 : str.hashCode());
                  return result;
            }
            @Override
            public boolean equals(Object obj) {
                  if (this == obj)
                        return true;
                  if (obj == null)
                        return false;
                  if (getClass() != obj.getClass())
                        return false;
                  Pair other = (Pair) obj;
                  if (str == null) {
                        if (other.str != null)
                              return false;
                  } else if (!str.equals(other.str))
                        return false;
                  return true;
            } 
            
            
      }// end of private static inner pair class
      
      private int getIndex(String key) {
            
            return (new Pair(key, 0)).hashCode();
            
      }
      
      private int index (String str) {
            
            int total = 0;
            for (int i = 0; i < str.length(); i++) {
                  total += (str.charAt(i) - 'a');
            }
            return total % theTable.size();
      }
      
      

} // end of class
