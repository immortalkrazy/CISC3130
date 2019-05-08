package homework_03;

import java.io.*;
import java.util.*;

public class Tokenizer implements Iterator<Token>{
      
      private int place;
      private String file;
      private Scanner sc;
      private File fileName;
      
//      private ArrayList<Token> tokensArray = new ArrayList<Token>();
      
      public Tokenizer(String file) throws FileNotFoundException {
            
            place = 0;
            this.file = file;
            fileName = new File(file);
            sc = new Scanner(fileName);
            
            
//            try (Scanner scanner = new Scanner(fileName)) {
//                  
//                  while(scanner.hasNext()) {
//                        
//                        String word = scanner.next();
//                        place++;
//                        tokensArray.add(new Token(file, word, place));
//                
//                  }
//            }          
      }

      @Override
      public boolean hasNext() {
            
            return sc.hasNext();
      }

      @Override
      public Token next() {
            
            String word = sc.next();
            place++;
            return new Token(file, word, place);
            
      }
      
            

}
