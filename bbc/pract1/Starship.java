import java.awt.*;

public class Starship {

    private Integer anchorX, anchorY;
    private Color shipColor;
    private String shipName;
    
    public Starship( String n, Color c) {
        
        anchorX = 0;
        anchorY = 0;
        shipColor = c;
        shipName = n;
        
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    
    public void draw( Graphics g ) {

        
        
        // back part body        
        g.setColor(Color.RED);
        g.fillOval(anchorX+50, anchorY, 10, 10);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX+50, anchorY, 10, 10);

        g.setColor(shipColor);
        g.fillRect(anchorX, anchorY, 55, 10);
        g.setColor(Color.BLACK);
        g.drawRect(anchorX, anchorY, 55, 10);
        
        
        // vertical shaft
        g.setColor(shipColor.darker());
        g.fillRect(anchorX+35, anchorY+10, 8, 25);
        g.setColor(Color.BLACK);
        g.drawRect(anchorX+35, anchorY+10, 8, 25);

        // lower part
        g.setColor(shipColor);
        g.fillRoundRect(anchorX+30, anchorY+35, 45, 20, 5, 5);
        g.setColor(Color.BLACK);
        g.drawRoundRect(anchorX+30, anchorY+35, 45, 20, 5, 5);

        // front part
        g.setColor(shipColor);
        g.fillOval(anchorX+85, anchorY+5, 30, 15);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX+85, anchorY+5, 30, 15);
        
        g.setColor(shipColor);
        g.fillRect(anchorX+65, anchorY+10, 65, 6);
        g.setColor(Color.BLACK);
        g.drawRect(anchorX+65, anchorY+10, 65, 6);

        // connector
        Polygon connector = new Polygon();
        connector.addPoint(anchorX+73, anchorY+16);
        connector.addPoint(anchorX+83, anchorY+16);
        connector.addPoint(anchorX+63, anchorY+35);
        connector.addPoint(anchorX+53, anchorY+35);
        g.setColor(shipColor.darker());
        g.fillPolygon(connector);
        g.setColor(Color.BLACK);
        g.drawPolygon(connector);
        
        // display ship name below ship
        // note: drawing color is already set to Color.BLACK
        g.drawString(shipName, anchorX+30, anchorY+70);
        
    } // end of draw
    
} // end of class Starship
