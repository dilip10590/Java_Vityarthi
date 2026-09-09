import java.util.*;

public class SuperCalculator
{
    static Scanner sc = new Scanner(System.in);

    static void scientificFunctions() 
    {
        System.out.println("Functions: log, log10, exp, sin, cos, tan, asin, acos, atan, sinh, cosh, tanh");
        System.out.print("Enter a number: ");
        double x = sc.nextDouble();

        System.out.println("log(x) = " + Math.log(x));       
        System.out.println("log10(x) = " + Math.log10(x));   
        System.out.println("exp(x) = " + Math.exp(x));

        System.out.println("sin(x°) = " + Math.sin(Math.toRadians(x)));
        System.out.println("cos(x°) = " + Math.cos(Math.toRadians(x)));
        System.out.println("tan(x°) = " + Math.tan(Math.toRadians(x)));

        System.out.println("asin(x) = " + Math.toDegrees(Math.asin(x)));
        System.out.println("acos(x) = " + Math.toDegrees(Math.acos(x)));
        System.out.println("atan(x) = " + Math.toDegrees(Math.atan(x)));

        System.out.println("sinh(x) = " + Math.sinh(x));
        System.out.println("cosh(x) = " + Math.cosh(x));
        System.out.println("tanh(x) = " + Math.tanh(x));
    }

    static void matrixOperations() 
    {
        System.out.print("Enter size of matrix (n): ");
        int n = sc.nextInt();
        System.out.println("Enter matrix A:");
        int[][] A = new int[n][n]; 
        for(int i=0;i<n;i++)
        { 
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter element A["+i+"]["+j+"]: ");
                A[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter matrix B:");
        int[][] B = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter element B["+i+"]["+j+"]: ");
                B[i][j]=sc.nextInt();
            }
        }

        System.out.print("A+B:");
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                System.out.print((A[i][j]+B[i][j])+" ");
            }
        }

        System.out.print("A*B:");
        int[][] C = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(C[i][j]+" ");
            }
        }
    }

    static void quadraticSolver() 
    {
        System.out.print("Enter coefficients a: ");
        double a=sc.nextDouble();
        System.out.print("Enter coefficients b: ");
        double b=sc.nextDouble();
        System.out.print("Enter coefficients c: ");
        double c=sc.nextDouble();
        double d = b*b - 4*a*c;
        if(d>=0) 
        {
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots: "+r1+" , "+r2);
        } 
        else 
        {
            System.out.println("Complex roots");
        }
    }

    static void linearSolver2x2() 
    {
        System.out.println("Equation format: a1x + b1y = c1 ; a2x + b2y = c2");
        System.out.print("Enter a1: ");
        double a1=sc.nextDouble();
        System.out.print("Enter b1: ");
        double b1=sc.nextDouble();
        System.out.print("Enter c1: ");
        double c1=sc.nextDouble();
        System.out.print("Enter a2: ");
        double a2=sc.nextDouble();
        System.out.print("Enter b2: ");
        double b2=sc.nextDouble();
        System.out.print("Enter c2: ");
        double c2=sc.nextDouble();
        double det = a1*b2 - a2*b1;
        if(det==0)
        {
            System.out.println("No unique solution");
        }
        else 
        {
            double x=(c1*b2 - c2*b1)/det;
            double y=(a1*c2 - a2*c1)/det;
            System.out.println("Solution: x="+x+", y="+y);
        }
    }

    static void statistics()
    {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
                arr[i] = sc.nextDouble();
        }

        double sum=0;
        for(double v:arr)
        {
            sum+=v;
        }
        double mean = sum/n;
        System.out.println("Mean = " + mean);

        java.util.Arrays.sort(arr);
        double median;
            if(n % 2 == 0)
            {
                median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
            } 
            else 
            {
                median = arr[n/2];
            }
        System.out.println("Median = " + median);

        double variance=0;
        for(double v : arr)
        {
            double diff = v - mean;
            variance += diff * diff;
        }
        variance /= n;
        double stdDev = Math.sqrt(variance);
        System.out.println("Standard Deviation = " + stdDev);
    }

    static void primeNumbers()
    {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 1) 
        {
            System.out.println(n + " is Not Prime");
        }
        else 
        {
            int i;
            for (i = 2; i * i <= n; i++)
            {
                if (n % i == 0) 
                {
                    System.out.println(n + " is Not Prime");
                    break;
                }
            }
            if (i * i > n) 
            {
                System.out.println(n + " is Prime");
            }
        }
    }

    static void factorial()
    {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        System.out.println("Factorial("+n+") = " + fact);
    }

    static void power()
    {
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exp = sc.nextDouble();
        System.out.println("Power("+base+"^"+exp+") = " + Math.pow(base, exp));
    }                                                          

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("\n--- Super Calculator ---");
            System.out.println("1. Scientific Functions");
            System.out.println("2. Matrix Operations");
            System.out.println("3. Quadratic Solver");
            System.out.println("4. Linear Solver (2x2)");
            System.out.println("5. Statistics");
            System.out.println("6. power");
            System.out.println("7. Prime Numbers");
            System.out.println("8. Factorial");
            System.out.println("9. Exit");
            System.out.print("Enter the choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1 -> scientificFunctions();
                case 2 -> matrixOperations();
                case 3 -> quadraticSolver();
                case 4 -> linearSolver2x2();
                case 5 -> statistics();
                case 6 -> power();
                case 7 -> primeNumbers();
                case 8 -> factorial();
                case 9 -> { System.out.println("Thanks for using the Calculator!"); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
