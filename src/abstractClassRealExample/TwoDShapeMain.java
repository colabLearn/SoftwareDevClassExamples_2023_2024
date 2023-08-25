package abstractClassRealExample;

public class TwoDShapeMain {
		public static void main(String[] args) {
			Circle myCircle = new Circle("Cicle 1", 12.5);
			Square mySquare = new Square("Square 1", 17.2);
			Rectangle myRect = new Rectangle("Rect 1", 14.2, 6.4);
			
			myCircle.shapeInfo();
			mySquare.shapeInfo();
			myRect.shapeInfo();
		}
}
