public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.5f, 1.4f);
        System.out.println(point2D);
        point2D.setXY(2.6f, 4.8f);
        float[] arr = point2D.getXY();
        for (float item : arr) {
            System.out.print(item + "\n");
        }

        Point3D point3D = new Point3D(3.4f, 1.5f, 8.6f);
        System.out.println(point3D);
        point3D.setXYZ(2.5f, 1.6f, 7.3f);
        float[] arr1 = point3D.getXYZ();
        for (float item1 : arr1) {
            System.out.print(item1 + "\n");
        }
    }
}