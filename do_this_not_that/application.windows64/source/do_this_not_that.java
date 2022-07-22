import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class do_this_not_that extends PApplet {

//Global Variables
float btn1X, btn1Y, btn2X, btn2Y, btnWidth, btnHeight, borderRadius;
int black;
//
public void setup() {
  
  //Display MAthhhh
  
  int appWidth = width;
  int appHeight = height;
  
  if (width > displayWidth || height > displayHeight) { //Canvase is too big
      appWidth = displayHeight;
      appHeight = displayHeight; 
      println("Canvas too big, please resize.");
  } else {
    println("Canvas size approved!");
  } //END
  
  //Dispay Orientation
  
  String ls="landscape / square", p="portrait", DO="Display Orientation", instruct="Please Turn your phone";
  String orientation = ( appWidth>=appHeight) ? ls : p; // Terinary Operater, repeast if-Else to pop variabel
  println(DO, "---->", orientation);
  if (orientation == ls) {
    println("Canvas size approved!");
  } else {
    appWidth *= 0;
    appHeight *=0;
    print(instruct);
  }
  
  //Population --> appHeight/appWidth
  
  
  
  //Population
  float row3 = height - height*2/7;
  
  btn1X = width/7;
  btn2X = width - width*3/7;
  btn1Y = row3; 
  btnWidth = width*2/7;
  btnHeight = height/7;
  borderRadius = 5;
  black = 0xff000000;
  

  
} //End setup()
//
public void draw() {
  background(black);
  //Rectangle Setup
  rect(btn1X,btn1Y, btnWidth, btnHeight, borderRadius);
  rect(btn2X,btn1Y, btnWidth, btnHeight, borderRadius);
  
  //rect();// Func of btn1
  //ellipse(); //func of btn2
} //End draw()
//
public void keyPressed() {} //End keyPressed()
//
public void mousePressed() {} //End mousePressed()
//
//End MAIN 
  public void settings() {  size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "do_this_not_that" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
