//Put all your variables up here outside the setup or draw functions
//What variables may you want?
//  x, y, number of steps to take, and current steps taken

int n = 300;
int steps = 0;
int x = 200;
int y = 200;
int r = (int)(Math.random() * 5);

void setup() {
	size(500, 500);
  frameRate(10);
}

void draw() {
	stroke(1);
  //starts random walking from 200,200
  rect(x, y, 10, 10);
  
  //Here is where you should create the new rectangles to create the illusion of 'random walking'
  // You will need to make sure you dont draw more rectangles than the limit of steps
  //You'll need to use the Math.random() to decide how to create randomness in your drawing of rectangles.
  // Keep your canvas and rectangle width and height as I've given you
  

  if(x < 0){
    x = 0;
  }else if(x > 500){
    x = 500;
  }

  if(y < 0){
    y = 0;
  }else if(y > 500){
    y = 500;
  }

  if(steps == 300){
    x = x;
    y = y;
    r = 5
  }

  if(r == 0){
    y = y - 10;
    r = (int)(Math.random() * 5);
    steps = steps + 1;
    // fill(255);
  }else if(r == 1){
    y = y + 10;
    r = (int)(Math.random() * 5);
    steps = steps + 1;
    // fill(255);
  }else if(r == 2){
    x = x - 10;
    r = (int)(Math.random() * 5);
    steps = steps + 1;
    // fill(255);
  }else if(r == 3){
    x = x + 10;
    r = (int)(Math.random() * 5);
    steps = steps + 1;
    // fill(255);
  }else if(r == 5){
    x = x;
    y = y;
  }else{
    r = int(random(0, 3));
    steps = steps + 1;
    // fill(255);
  }
  
  fill(0, 255, 0);
  rect(x, y, 10, 10);
  fill(255);
    println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);
}



	



