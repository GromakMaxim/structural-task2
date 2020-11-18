package org.myorg;

public class App {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("11001","1001011")); //25+75=100 или 1100100
        System.out.println(bins.sum("11","100001")); //3+33=36 или 100100

        System.out.println(bins.mult("1011","1100")); //11*12=132 или 10000100
        System.out.println(bins.mult("1111011","1111011")); //123*123=15129 или 11101100011001
    }
}
