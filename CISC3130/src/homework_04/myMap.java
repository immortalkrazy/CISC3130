package homework_04;

import java.util.Set;

public class myMap {
      
      public void put(String key, Integer value) {
            
      }
      
      public boolean containsKey(String key) {
            return false;
      }
      
      public boolean conatinsValue(Integer valueInteger ) {
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
            
            private String str;
            private Integer value;
            
            public Pair(String str, Integer value) {
                  
                  this.str = str;
                  this.value = value;
            }

            public String getKey() {
                  return str;
            }

            public Integer getValue() {
                  return value;
            }

            public Integer setValue(Integer value) {
                  this.value = value;
                  return value;
            }
            
            
            
            
            
      }
      
      

}
