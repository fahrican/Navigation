package data;

public class Point {

    private float posX;
    private float posY;

    public Point(float posX, float posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public boolean checkForSamePosition(Point object) {

        if (this.getPosX() == object.getPosX()
                && this.getPosY() == object.getPosY()) {
            return true;
        }
        return false;
    }
}
