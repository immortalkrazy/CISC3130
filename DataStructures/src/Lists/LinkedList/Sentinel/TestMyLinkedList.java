package Lists.LinkedList.Sentinel;

import java.util.*;

public class TestMyLinkedList {

      public static void main(String[] args) {

          MyLinkedList<Integer> aList = new MyLinkedList<>();

          // for(int i=0; i<10; i++) {
          //
          //     aList.addFirst(i+1);
          //
          // }
          // print(aList);
          aList.addFirst(10);
          //System.out.println(aList);
          
          Iterator<Integer> iter = aList.iterator();
          while(iter.hasNext()) {
                System.out.println(iter.next());
          }

      }

      public static void print(MyLinkedList<Integer> list) {

          for (Integer e: list) {

              System.out.println(e + " ");

          }

      }


  }
