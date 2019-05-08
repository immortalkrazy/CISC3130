package homework_03;

import java.io.*;
import java.util.*;

public class Tokenizer implements Iterator<String>{
      
      private ArrayList<Token> tokensArray = new ArrayList<Token>();
      
      public Tokenizer(String file) throws FileNotFoundException {
            
            int place = 0;
            File fileName = new File(file);
            
            try (Scanner scanner = new Scanner(fileName)) {
                  
                  while(scanner.hasNext()) {
                        
                        String word = scanner.next();
                        place++;
                        tokensArray.add(new Token(file, word, place));
                
                  }
            }          
      }

      @Override
      public boolean hasNext() {
            
            return false;
      }

      @Override
      public String next() {
            
            return null;
      }
      
      

}
