import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        int column_counter = 4;
        Integer[][] starter = { { 0, 5, 4, 2 }, { 14, 28, 22, 30 }, { 17, 32, 15, 1 }, { 20, 35, 11, 25 },
                { 27, 19, 24, 9 }, { 21, 8, 33, 7 }, { 3, 31, 6, 12 }, { 34, 10, 23, 18 }, { 13, 26, 16, 29 } };

        List<Integer> list_of_nums = new ArrayList<Integer>();
        for (Integer[] a : starter) {
            list_of_nums.addAll(Arrays.asList(a));
        }
        List<Integer[]> num_matrix = Arrays.asList(starter);
        int num_counter = starter.length;
        boolean valid = true;
        int row_zero = 0;

        // determining if the puzzle is solveable
        boolean grid_odd = false;
        if (column_counter % 2 == 1) {
            grid_odd = true;
        }

        // finding the total number of inversions and determining if it is odd or even
        boolean inversion_odd = false;
        boolean zero_odd = false;
        int inversions = 0;
        for (int i = 0; i < list_of_nums.size(); i++) {
            for (int j = i; j < list_of_nums.size(); j++) {
                if (list_of_nums.get(j) > 0 && list_of_nums.get(i) > list_of_nums.get(j)) {
                    inversions++;
                }
            }
        }

        // finding the row where the zero is
        for (int i = num_matrix.size() - 1; i >= 0; i--) {
            for (int j = num_matrix.get(i).length - 1; j >= 0; j--) {
                if (num_matrix.get(i)[j] == 0) {
                    row_zero = num_matrix.size() - i;
                }
            }
        }

        if ((row_zero % 2 == 1)) {
            zero_odd = true;
        }

        if (inversions % 2 == 1) {
            inversion_odd = true;
        }
        System.out.println("Inversion: " + inversions);
        System.out.println("Zero Row: " + row_zero);
        System.out.println("Grid odd: " + grid_odd + ", inversion odd: " + inversion_odd + ", zero odd: " + zero_odd);
        if ((grid_odd == true && inversion_odd == false) || (grid_odd == false && (zero_odd == !inversion_odd))) {
            if (valid)
                System.out.println("The puzzle has " + num_counter + " tiles");
        } else {
            System.out.println("Semantic Error: Rule 4 Violated");
        }

    }
}
