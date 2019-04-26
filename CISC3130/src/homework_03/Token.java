package homework_03;

public class Token {
      
      private String fileNameString;
      private String word;
      private int place;
      
      
      public String getFileNameString() {
            return fileNameString;
      }
      public void setFileNameString(String fileNameString) {
            this.fileNameString = fileNameString;
      }
      public String getWord() {
            return word;
      }
      public void setWord(String word) {
            this.word = word;
      }
      public int getCounter() {
            return place;
      }
      public void setCounter(int counter) {
            this.place = counter;
      }
      @Override
      public String toString() {
            
            return "Token [fileNameString=" + fileNameString + ", word=" + word + ", counter=" + place + "]";
      }
      
      

}
