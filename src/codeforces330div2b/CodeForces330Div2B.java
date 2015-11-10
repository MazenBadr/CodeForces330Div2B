/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces330div2b;

import java.util.Scanner;

/**
 *
 * @author mazenbadr
 */
public class CodeForces330Div2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n / k];
        int[] b = new int[n / k];

        for (int i = 0; i < n / k; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n / k; i++) {
            b[i] = in.nextInt();
        }
        int max = (int) Math.pow(10, k);
        int allPos = 1;
        for (int i = 0; i < n / k; i++) {
            int pc = 0;
            int num = 0;
            while (num < max) {
                String s = num + "";
                int fn = Integer.parseInt(s.charAt(0) + "");
                if (fn != b[i]) {
                    pc++;
                }
                num += a[i];
            }
            if (pc != 0) {
                allPos *= pc;
            }
        }
        System.out.println(allPos % (Math.pow(10, 9) + 7));

    }

}
