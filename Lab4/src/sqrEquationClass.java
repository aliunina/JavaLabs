public class sqrEquationClass {
    /**
     * Метод для вычисления дискриминанта
     * @param a входной параметр а
     * @param b входной параметр b
     * @param c входной параметр с
     * @return возврат дискриминанта
     */
    public static double sqrDiscrim(double a, double b, double c){
        return (b*b - 4 * a * c);
    }
    /**
     * Метод для вычисления корней квадратного уравнения
     * @param a входной параметр а
     * @param b входной параметр b
     * @param D входной параметр D
     * @return возврат массива корней
     */
    public static double[] sqrDiscrimCheck(double a, double b, double D){
        double[] roots = new double[2];
        if (D == 0){
            roots[0] = (-b/(2*a));
            roots[1] = 0;
        } else if (D < 0) {
            roots[0] = roots[1] = 0;
        } else {
            roots[0] = (-b + Math.sqrt(D)/(2*a));
            roots[1] = (-b + Math.sqrt(D)/(2*a));
        }
        return roots;
    }
}
