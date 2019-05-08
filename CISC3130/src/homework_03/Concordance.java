package homework_03;

import java.io.FileNotFoundException;
import java.util.*;

public class Concordance {
      
      private String file;      
      private Map<String, ArrayList<Token>> myMap;
     
      public Concordance() {
            
            myMap = new TreeMap<String, ArrayList<Token>>();
            
      }
      
      public boolean add() throws FileNotFoundException {
            
            Tokenizer tz = new Tokenizer(file);
            
            while (tz.hasNext()) {
                  
                  Token temp = tz.next();
                  
                  if (!myMap.containsKey(temp.getWord())) {
                        
                       myMap.put(temp.getWord(), new ArrayList<Token>());
                       
                  }
                  else {
                        
                        myMap.get(temp.getWord()).add(temp);                        
                  }
                  
            }
            
            return true;
            
      }

      public int count (String s) {
            
          return  myMap.get(s).size();
            
      }
      
}
