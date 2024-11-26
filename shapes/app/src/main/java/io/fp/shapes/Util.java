package io.fp.shapes;

public class Util {

    public Util(){

    }
    
    public static double accumulateArea(Shape shapes[]) {
        double accumulateArea = 0;
        for(Shape shape : shapes){
            if (shape != null) {
                accumulateArea += shape.area();
            }
        }
        return accumulateArea;
    }

    public static double accumulateCircumference(Shape shapes[]) {
        double accumulateCircumference = 0;
        for(Shape shape : shapes){
            if (shape != null) {
                accumulateCircumference += shape.circumference();
            }
        }
        return accumulateCircumference;
    }
    	public static double accumulateArea(Object[] objects) {
		double result = 0.0;
		for (Object object : objects) {
			if (object!=null) {
				if (object instanceof Rectangle) {
					result+=((Rectangle)object).area();
				} 
				if (object instanceof Circle) {
					result+=((Circle)object).area();
				}
				if (object instanceof Rectanglecircle) {
					result+=((Rectanglecircle)object).area();
				}
			}
		}
		return result;
	}
	
	public static double accumulateCircumference(Object[] objects) {
		double result = 0.0;
		for (Object object : objects) {
			if (object!=null) {
				if (object instanceof Rectangle) {
					result+=((Rectangle)object).circumference();
				}
				if (object instanceof Circle) {
					result+=((Circle)object).circumference();
				} 
				if (object instanceof Rectanglecircle) {
					result+=((Rectanglecircle)object).circumference();
				}
			}
		}
		return result;
	}

}
