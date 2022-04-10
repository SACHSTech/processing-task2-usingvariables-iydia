import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Assignment: 5.3 Processing Task 2 - Using Variables
   * Author: Lydia He
   * Date: Wed Feb 23, 2021
   * Description: Make a drawing that is dynamic to changes in size

   */

  public void settings() {
    // Set size of drawing
    size(100, 600);
  }
  
  public void setup() {
    // Initialize setup values that will be consistent throughout the code
    background(0, 0, 0);
  }

  public void draw() {
    // Red arc
    stroke(255, 0, 6);
    fill(255, 0, 6);
    ellipse(width/2, height/2, width*100/145, height*100/145);

    // Orange arc
    stroke(255, 127, 0);
    fill(255, 127, 0);
    ellipse(width/2, height/2, width*10/16, height*10/16);

    // Yellow arc
    stroke(255, 210, 0);
    fill(255, 210, 0);
    ellipse(width/2, height/2, width*100/177, height*100/177);
    
    // Green arc
    stroke(100, 206, 0);
    fill(100, 206, 0);
    ellipse(width/2, height/2, width/2, height/2);
    
    // Blue arc
    stroke(0, 188, 247);
    fill(0, 188, 247);
    ellipse(width/2, height/2, width*100/229, height*100/229);
    
    // Purple arc
    stroke(102, 102, 255);
    fill(102, 102, 255);
    ellipse(width/2, height/2, width*100/266, height*100/266);

    // Inside of rainbow (black)
    stroke(0, 0, 0);
    fill(0, 0, 0);
    ellipse(width/2, height/2, width*10/32, height*10/32);

    // Cut off rainbow at 180°
    rect(0, height/2, width, height/2);

    // Left cloud
    stroke(255);
    fill(255);
    ellipse(width*100/615, height/2, width*100/666, height*100/666);
    ellipse(width*1/4, height/2, width*10/74, height*10/74);
    ellipse(width*10/32, height/2, width*100/833, height*100/833);

    // Right cloud
    ellipse(width*100/119, height/2, width*100/666, height*100/666);
    ellipse(width*100/133, height/2, width*10/74, height*10/74);
    ellipse(width*100/145, height/2, width*100/833, height*100/833);

  }
}