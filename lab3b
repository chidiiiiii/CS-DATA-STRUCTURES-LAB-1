// lab3b.java
// fall 2025
// Prof. Lehman
// Chidi Emenike
// Demonstrates recursive algorithm to "flood fill"
// an ASCII graphic

class lab3b {
    public static void main(String[] args) {

        // grid represents a graphic image
        char grid[][] = { { 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g' },
                { 'g', 'g', ' ', 'g', 'g', ' ', ' ', ' ', 'g' },
                { 'g', 'g', ' ', ' ', ' ', ' ', 'g', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', 'g', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', 'g', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'g' },
                { 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g' } };

        // show starting grid
        display(grid);

        // fill open space ' ' with 'r'
        floodFill(grid, 5, 3, 'r', 'g');
        display(grid);

        // fill same space with 'b'
        floodFill(grid, 5, 3, 'b', 'g');
        display(grid);

        // fill same space with '7'
        floodFill(grid, 5, 3, '7', 'g');
        display(grid);

        floodFill(grid, 0, 0, '-', ' ');  
        display(grid);
    } // main

    // flood fill 2D char array
public static void floodFill(char temp[][], int row, int col, char fillColor, char borderColor) {
    // base case: out of bounds
    if (row < 0) return;
    if (col < 0) return;
    if (row >= temp.length) return;
    if (col >= temp[0].length) return;

    // base case: already filled or hit border
    if (temp[row][col] != fillColor && temp[row][col] != borderColor) {

        // set current to fill color
        temp[row][col] = fillColor;

        // recursive calls
        floodFill(temp, row, col - 1, fillColor, borderColor); // left
        floodFill(temp, row, col + 1, fillColor, borderColor); // right
        floodFill(temp, row - 1, col, fillColor, borderColor); // up
        floodFill(temp, row + 1, col, fillColor, borderColor); // down

        // diagonals
        floodFill(temp, row - 1, col - 1, fillColor, borderColor); // up-left
        floodFill(temp, row - 1, col + 1, fillColor, borderColor); // up-right
        floodFill(temp, row + 1, col - 1, fillColor, borderColor); // down-left
        floodFill(temp, row + 1, col + 1, fillColor, borderColor); // down-right
    }
}// floodFill

    // display array
    public static void display(char temp[][]) {
        for (int r = 0; r < temp.length; r++) {
            for (int c = 0; c < temp[r].length; c++) {
                System.out.print(temp[r][c]);
            }
            System.out.println();
        }
        System.out.println();
    } // display

} // class
