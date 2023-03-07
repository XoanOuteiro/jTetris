final int MX = 350;
final int MY = 350;

void setup(){
  size(700,700);
  background(0);
  stroke(255);
  strokeWeight(15);
}

void draw(){
  constructFigure();
  background(0);  
  delay(1000);
}

void constructFigure(){
  
  float random = random(1,4);
  System.out.println(random);  

  if(random > 3){  //T
    point(MX,MY);
    point(MX+20,MY);
    point(MX,MY+20);
    point(MX,MY-20);
  } else if (random <= 3f){ //Square
    point(MX,MY);
    point(MX+20,MY);
    point(MX,MY+20);
    point(MX+20,MY+20);    
  }else if (random <= 2f){ // L
    point(MX,MY);
    point(MX,MY-20);
    point(MX,MY-40);
    point(MX+20,MY);    
  }else if (random <= 1){
    point(MX,MY);
    point(MX,MY-20);
    point(MX,MY-40);
    point(MX,MY+20);  
  }
  
}
