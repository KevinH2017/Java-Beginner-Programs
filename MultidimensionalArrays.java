public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 1 dimensional array
        int[] values = {3, 5, 2343};

        System.out.println(values[2]);

        // Multi-dimensional array, can have arrays be different lengths
        int[][] grid = {
            {3, 5, 2343},
            {2, 4},
            {1, 2, 3, 4}
        };

        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        // 2D array of strings
        String[][] texts = new String[2][3];
        System.out.println(texts[0][1]);        // Default string values is null

        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);

        // Iterates through each row
        for (int row = 0; row<grid.length; row++){
            // Iterates through each column in each row
            for (int col = 0; col<grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");        // Adds a tab after each value
            }
            System.out.println();           // Helps show the different rows in console
        }

        String[][] words = new String[2][];
        System.out.println(words[0]);       // null is default value

        words[0] = new String[3];
        words[0][1] = "hi there";           // string value is assigned to array at words[0][1]
        System.out.println(words[0][1]);
    }
}
