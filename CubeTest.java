import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CubeTest 
{
    @Test  //syntactic sugar, an "annotation" that plumbs this method is a unit testing method
    public void testCubeSurfArea() //we can name the method whatever we want
    {  
        Cube cube = new Cube();  //instantiating a Demo object is not necessary...why?
        int result = cube.surfaceArea(1);
        assertEquals(6, result);
    }
}
