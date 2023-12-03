public class shortestpath {
    public static float getshortestpath(String path) {
        // Tc O(n)
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // North
            if (dir == 'N') {
                y++;
                // South
            } else if (dir == 'S') {
                y--;
                // East
            } else if (dir == 'E') {
                x++;
                // West
            } else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.print(getshortestpath(path));
    }

}
