import java.awt.*;

public class Car {

    private Integer anchorX, anchorY;
    private Color carColor;
    private String makeAndModel;
    
    public Car( Color c, String mAm) {
        
        anchorX = 0;
        anchorY = 0;
        carColor = c;
        makeAndModel = mAm;
        
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    
    public void draw( Graphics g ) {

        
        
        // upper body        
        g.setColor(carColor);
        g.fillRoundRect(anchorX+10, anchorY-12, 40, 30, 10, 10);
        g.setColor(Color.BLACK);
        g.drawRoundRect(anchorX+10, anchorY-12, 40, 30, 10, 10);
        
        // windshield
        g.setColor(Color.WHITE);
        g.fillRoundRect(anchorX+12, anchorY-10, 36, 26, 8, 8);
        

        // steering wheel
        g.setColor(Color.BLACK);
        g.drawOval(anchorX+32, anchorY-5, 14, 14);
        
        // tires
        g.fillRect(anchorX+5, anchorY+14, 7, 10);
        g.fillRect(anchorX+50, anchorY+14, 7, 10);
        
        // lower body
        g.setColor(carColor);
        g.fillRoundRect(anchorX, anchorY, 60, 18, 12, 12);
        g.setColor(Color.BLACK);
        g.drawRoundRect(anchorX, anchorY, 60, 18, 12, 12);
        
        // headlights
        g.setColor(Color.YELLOW);
        g.fillOval(anchorX+6, anchorY+5, 8, 8);
        g.fillOval(anchorX+48, anchorY+5, 8, 8);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX+6, anchorY+5, 8, 8);
        g.drawOval(anchorX+48, anchorY+5, 8, 8);

        // display make and model below car
        // note: drawing color is already set to Color.BLACK
        g.drawString(makeAndModel, anchorX, anchorY+40);
        
    } // end of draw
    
} // end of class Car
