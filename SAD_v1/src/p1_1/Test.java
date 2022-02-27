package p1_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

class Test{
  public static void main(String[] args) {
    BufferedReader in = new EditableBufferReader(
      new InputStreamReader(System.in));
    String str = null;
    try {
      str = in.read();
    } catch (IOException e) { e.printStackTrace(); }
    System.out.println("\nline is: " + str);
  }
}
