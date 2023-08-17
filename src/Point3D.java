public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        this.z = z;
        super.setX(x);
        super.setY(y);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.z = z;
        super.setX(x);
        super.setY(y);
    }
    public float[] getXYZ() {
        float[] arr1 = {super.getX(), super.getY(), z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }
}
