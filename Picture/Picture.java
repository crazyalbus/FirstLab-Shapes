
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square ground;
    private Square sky;
    private Square wall;
    private Square window;
    private Square window2;
    private Square window3;
    private Square window4;
    private Triangle roof;
    private Circle sun;
    private Square treeTrunk1;
    private Square treeTrunk2;
    private Triangle treeTop1;
    private Triangle treeTop2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        ground = new Square();
        ground.changeSize(400);
        ground.changeColor("green");
        ground.moveHorizontal(-110);
        ground.moveVertical(140);
        ground.makeVisible();
        
        sky = new Square();
        sky.changeSize(300);
        sky.changeColor("blue");
        sky.moveHorizontal(-60);
        sky.moveVertical(-140);
        sky.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.moveHorizontal(-20);
        wall.changeSize(120);
        wall.makeVisible();
        
        //top left window
        window = new Square();
        window.changeColor("white");
        //window.moveHorizontal(10);
        window.moveVertical(100);
        window.makeVisible();
        
        //top right window
        window2 = new Square();
        window2.changeColor("white");
        window2.moveHorizontal(50);
        window2.moveVertical(100);
        window2.makeVisible();
        
        //lower left window
        window3 = new Square();
        window3.changeColor("white");
        //window3.moveHorizontal(10);
        window3.moveVertical(145);
        window3.makeVisible();
        
        //lower right window
        window4 = new Square();
        window4.changeColor("white");
        window4.moveHorizontal(50);
        window4.moveVertical(145);
        window4.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(60, 180);
        roof.changeColor("black");
        roof.moveHorizontal(48);
        roof.moveVertical(60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(170);
        sun.moveVertical(10);
        sun.changeSize(60);
        sun.makeVisible();
        
        //tree 2
        treeTrunk2 = new Square();
        treeTrunk2.changeSize(15);
        treeTrunk2.changeColor("black");
        treeTrunk2.moveHorizontal(165);
        treeTrunk2.moveVertical(160);
        treeTrunk2.makeVisible();
        
        treeTrunk2 = new Square();
        treeTrunk2.changeSize(15);
        treeTrunk2.changeColor("black");
        treeTrunk2.moveHorizontal(165);
        treeTrunk2.moveVertical(145);
        treeTrunk2.makeVisible();
        
        treeTrunk2 = new Square();
        treeTrunk2.changeSize(15);
        treeTrunk2.changeColor("black");
        treeTrunk2.moveHorizontal(165);
        treeTrunk2.moveVertical(130);
        treeTrunk2.makeVisible();
        
        treeTop2 = new Triangle();
        treeTop2.changeSize(100, 40);
        treeTop2.changeColor("red");
        treeTop2.moveHorizontal(181);
        treeTop2.moveVertical(78);
        treeTop2.makeVisible();
        
        //tree 1
        treeTrunk1 = new Square();
        treeTrunk1.changeSize(15);
        treeTrunk1.changeColor("black");
        treeTrunk1.moveHorizontal(140);
        treeTrunk1.moveVertical(170);
        treeTrunk1.makeVisible();
        
        treeTrunk1 = new Square();
        treeTrunk1.changeSize(15);
        treeTrunk1.changeColor("black");
        treeTrunk1.moveHorizontal(140);
        treeTrunk1.moveVertical(155);
        treeTrunk1.makeVisible();
        
        treeTrunk1 = new Square();
        treeTrunk1.changeSize(15);
        treeTrunk1.changeColor("black");
        treeTrunk1.moveHorizontal(140);
        treeTrunk1.moveVertical(140);
        treeTrunk1.makeVisible();
        
        treeTop1 = new Triangle();
        treeTop1.changeSize(100, 40);
        treeTop1.changeColor("magenta");
        treeTop1.moveHorizontal(156);
        treeTop1.moveVertical(88);
        treeTop1.makeVisible();
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
