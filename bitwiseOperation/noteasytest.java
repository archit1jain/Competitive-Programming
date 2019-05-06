    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package bitwiseOperation;

import java.util.Arrays;

    /**
     *
     * @author Archit
     */
    public class noteasytest {
        public static void main(String[] args){
            int[] prime = {2,3,5,7,11,13,17,19};
            int[] count = new int[prime.length];
            int n =1323;
            int ans =0;
            for(int i =1;i<n;i++){
                for(int j =0;j<prime.length;j++){
                    if(i%prime[j]==0){
                        ans++;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
