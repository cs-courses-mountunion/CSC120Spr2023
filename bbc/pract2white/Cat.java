import java.awt.*;

public class Cat {
    
    private Integer anchorX, anchorY, size;
    private Color catColor;
    
    
    // constructor
    public Cat( Integer s, Color c ) {
        java.util.Random gen = new java.util.Random();
        anchorX = gen.nextInt(700);
        anchorY = gen.nextInt(240) + 200;
        size = s;
        catColor = c;
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    public void setSize( Integer s ) {
        size = s;
    }
    
    public void setColor( Color c ) {
        catColor = c;
    }
    
    
    // getters
    public Integer getAnchorX() {
        return anchorX;
    } // end of getAnchorX
    
    public Integer getAnchorY() {
        return anchorY;
    } // end of getAnchorY

    
    public void draw( Graphics g ) {

        Color c = catColor;  
             // just using a shorter name here for convenience!
        Color b = Color.black;
        Polygon body = new Polygon();
        
        // ears
        g.setColor(c);  g.fillArc(anchorX+size/5, anchorY-size/4, size/3, size/3, 280, 30);
                        g.fillArc(anchorX+size/5+size/3-5, anchorY-size/4, size/3, size/3, 230, 30);

        // head
        g.setColor(c);  g.fillOval(anchorX+size/3, anchorY, size/3, size/3);
        g.setColor(b);  g.drawOval(anchorX+size/3, anchorY, size/3, size/3);
        
        // eyes, nose, whiskers, mouth
        g.fillOval(anchorX+size/2-8, anchorY+5, 4, 4);
        g.fillOval(anchorX+size/2+3, anchorY+5, 4, 4);
        g.fillOval(anchorX+size/2-3, anchorY+size/6-3, 7, 7);
        g.drawLine(anchorX+size/2-7, anchorY+size/6, anchorX+size/2+7, anchorY+size/6);
        g.drawLine(anchorX+size/2-5, anchorY+size/6-3, anchorX+size/2+5, anchorY+size/6+3);
        g.drawLine(anchorX+size/2-5, anchorY+size/6+3, anchorX+size/2+5, anchorY+size/6-3);
        g.drawLine(anchorX+size/2-10, anchorY+size/6+9, anchorX+size/2+10, anchorY+size/6+9);
                
        // body
        body.addPoint(anchorX+size/2, anchorY+size/3);
        body.addPoint(anchorX+size/2-size/3, anchorY+size);
        body.addPoint(anchorX+size/2+size/3, anchorY+size);
        g.setColor(c);  g.fillPolygon(body);
        g.setColor(b);  g.drawPolygon(body);
        
        // paws
//        g.setColor(Color.white);
//        g.fillOval(anchorX+size/2-size/3-2, anchorY+size-5, size/3-5, 5);
//        g.fillOval(anchorX+size/2+7, anchorY+size-5, size/3-5, 5);
//        g.fillOval(anchorX+size/2-10, anchorY+size/2, 5, size/3);
//        g.fillOval(anchorX+size/2+5, anchorY+size/2, 5, size/3);
//        g.fillOval(anchorX+size/2-13, anchorY+5*size/6-5, 10, 10);
//        g.fillOval(anchorX+size/2+2, anchorY+5*size/6-5, 10, 10);
    
        // tail
        g.setColor(c); g.fillOval(anchorX+size/2+size/3, anchorY+size/2, 4, size/2);
        g.setColor(b); g.drawOval(anchorX+size/2+size/3, anchorY+size/2, 4, size/2);

    } // end of draw
    
} // end of class Cat
