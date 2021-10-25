public class GeometryMain 
{
    public static void main(String[] args)
    {
        System.out.println("Create cube object.");

        Cube cube = new Cube();

        int x = 1;
        
        int result = cube.surfaceArea(x);

        if (result == 6)
        {
            System.out.println("Passed for value 6");
        }

        cube.surfaceArea(x);

        System.out.println("Areas is: " + result);
    }
}
