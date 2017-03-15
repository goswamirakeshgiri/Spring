package com.rg.bean;

public class Client {

	public static void main(String[] args) {
		int n=3;
		System.out.println(countNumbersWithUniqueDigits(n));
		
		
	}
	public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        int rst = 10, count = 9;
        for (int i = 2; i <= n; i++) {
            count *= (10 - i + 1);
            rst += count;
        }
        return rst;
    }

	
}
