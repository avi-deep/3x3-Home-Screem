//Global Variables
float btn1X, btn1Y, btn2X, btn2Y, btnWidth, btnHeight, borderRadius;
//
void setup() {
  
  //Display MAthhhh
  size(600,600);
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
  
  //Rectangle Setup
  rect(btn1X,btn1Y, btnWidth, btnHeight, borderRadius);
  rect(btn2X,btn1Y, btnWidth, btnHeight, borderRadius);
  
} //End setup()
//
void draw() {} //End draw()
//
void keyPressed() {} //End keyPressed()
//
void mousePressed() {} //End mousePressed()
//
//End MAIN 
