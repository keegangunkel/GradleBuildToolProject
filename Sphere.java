
public class Sphere {

    //Code to calculate volume and return it for tests
        public double volume (int radius, int height){
            //Equation to solve volume
            double volume = 4/3 * Math.PI * (radius*radius*radius);
            return volume;
        }
    //Code to calculate surface area and return it for tests
        public double surfaceArea (int radius, int height){
            //Equation to solve surface area
            double surfaceArea = 4 * Math.PI * (radius*radius);
            return surfaceArea;
        }
}
