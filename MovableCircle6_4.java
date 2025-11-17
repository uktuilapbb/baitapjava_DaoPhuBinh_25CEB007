public class MovableCircle6_4 {
    public class MovableCircle implements Movable6_3 {
        private int radius;
        private MovablePoint6_3 center;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            center = new MovablePoint6_3(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }
        public void moveUp() {
            center.moveUp();
        }
        public void moveDown() {
            center.moveDown();
        }
        public void moveLeft() {
            center.moveLeft();
        }
        public void moveRight() {
            center.moveRight();
        }


        public String toString() {
            return "MovableCircle[radius=" + radius + ", center=" + center + "]";
        }
    }

}
