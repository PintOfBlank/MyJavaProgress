import java.util.*;

/*
Index.
0. Deprecated Version Fib (fib) - Mathematical Sequence. - O(n)
1. Fibonacci Sequence (fib) - Mathematical Sequence. - O(n)
2. Abs Function (myabs) - Absolute Value Of Inputted Number. - O(1)
3. Perfect Square Numbers (psn) - Mathematical Sequence. - O(n)
4. Bubble Sort (bubbleSort) - Sorting Algorithm. - O(n^2)
5. Sorted Squared (sortedSquares) - Leetcode Problem. - O(n^2)
6. Common Factors (commonFactors) - Factors Of Inputted Number. - O(n)
7. Pythagorean Theorem Solver (pythagSolver) - Solves Pythagorean Theorem. - O(n)
8. Factorial Function (factorial) - Factorialzation Of A Inputted Number. - O(n)
9. Perfect Square Root (perfectSqrt) - Returns Perfect Square Numbers. - O(n)
10. Quadratic Equation Solver (quad) - Solves Quadratic Equations. - O(1)
11. Testing Area (main) - Testing All Of These Functions. - O(NaN)
*/

public class Main {
    /* @0 | O(n)
   public static ArrayList<Integer> fib(int z) {
        ArrayList<Integer> returnvalue = new ArrayList<>();
        int d = 1;
        int x = 0;
        int k = 1;
        returnvalue.add(x);
        returnvalue.add(k);
        for (int i = 0; i < z-2; i++) {
            x = x+d;
            returnvalue.add(x);
            if (i == k) {
                k += 1;
                d += x;
                returnvalue.add(d);
            }
        }
        if (returnvalue.size() != z) {
            returnvalue.subList(z, returnvalue.size()).clear();
        }
        return returnvalue;
    }
    */

    //@1 | O(n)
    public static ArrayList<Integer> fib(int amount) {
        ArrayList<Integer> returnlist = new ArrayList<>();
        int sum;
        int pn = 0;
        int nn = 1;
        for (int i = 0; i < amount; i++) {
            returnlist.add(pn);
            sum = pn+nn;
            pn = nn;
            nn = sum;
        }

        return returnlist;
    }

    //@2 | O(1)
    public static double myabs(double d) {
        if (d < 0) {
            d = d*-1;
        }
        return d;
    }

    //@3 | O(n)
    public static ArrayList<Integer> psn(int d) {
        ArrayList<Integer> rr = new ArrayList<>();
        int osum = 1;
        int increment = 1;
        int valincrement = 2;
        for (int i = 0; i <= d; i++) {
            rr.add(osum);
            increment += valincrement;
            osum += increment;
        }
        if (rr.size() != d) {
            rr.subList(d, rr.size()).clear();
        }
        return rr;

    }

    //@4 | O(n^2)
    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int d = 0; d < array.length; d++) {
                if (array[i] < array[d]) {
                    temp = array[i];
                    array[i] = array[d];
                    array[d] = temp;
                }
            }
        }
        return array;
    }

    //@5 | O(n^2)
    public static int[] sortedSquares(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int d = 0; d < nums.length; d += 1) {
                nums[d] = Math.abs(nums[d]);
                if (nums[i] < nums[d]) {
                    temp = nums[i];
                    nums[i] = nums[d];
                    nums[d] = temp;
                }
            }
        }
        return nums;
    }
    /*debugging
    System.out.println("d: " + nums[d]);
    System.out.println("i: " + nums[i]);
    System.out.println("i placement: "+ i);
    System.out.println("d placement: " + d);
    System.out.println("i object: " + nums[i]);
    System.out.println("i placement: " + i);
    System.out.println("d object: " + nums[d]);
    System.out.println("d placement: " + d);
    */

    //@6 | O(n)
    public static ArrayList<Integer> commonFactors(int a) {
        ArrayList<Integer> rr = new ArrayList<>();
        if (0 < a) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    rr.add(i);
                }
            }
        } else if (0 > a) {
            for (int i = a; i < 0; i++) {
                if (a % i == 0) {
                    rr.add(i);
                }
            }
        }
        return rr;
    }

    //@7 | O(n)
    public static double pythagSolver(double bone, double uone, String identifier) {
        double rr;
        if (Objects.equals(identifier, "tan")) {
            bone = bone * bone;
            uone = uone * uone;
            rr = bone + uone;
            rr = Math.sqrt(rr);
        } else if (Objects.equals(identifier, "cos") | Objects.equals(identifier, "sin")) {
            bone = bone*bone;
            uone = uone*uone;
            rr = uone-bone;
            rr = Math.abs(rr);
            rr = Math.sqrt(rr);
        } else {
            rr = 0;
        }
        return rr;
    }

    //@8 | O(n)
    public static int factorial(int d) {
        int y = 1;
        for (int i = 1; i <= d; i++) {
            y *= i;
        }
        return y;
    }

    //@9 | O(n)
    public static double perfectSqrt(double num) {
        double rr = 0;
        for (int i = 0; i < num; i++) {
            if (i * i == num) {
                rr = i;
            } else  {
                rr = 1;
            }
        }
        return rr;
    }

    //@10 | O(1)
    public static ArrayList<Double> quad(double a, double b, double c) {
        ArrayList<Double> rr = new ArrayList<>();
        double var1 = b*-1;
        double var2 = b*b;
        var2 = Math.abs(var2);
        double var3 = 4*a*c;
        double var4 = 2*a;
        var2 = var2-var3;
        if (0 > var2) {
            return null;
        }
        var2 = Math.sqrt(var2);
        double fr = var1-var2;
        fr = fr/var4;
        rr.add(fr);
        double sr = var1+var2;
        sr = sr/var4;
        rr.add(sr);
        return rr;
    }

    //@11
    public static void main(String[] args) {
        System.out.println(pythagSolver(4, 5, "cos"));
        System.out.println(quad(6, 17, 12));
    }
}

