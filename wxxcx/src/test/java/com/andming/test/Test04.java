package com.andming.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        int[]  nums ={-1, 0, 1, 2, -1, -4};
        List<List<Integer>> arr = getArr(nums);
        for (List<Integer> list : arr) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
        public static List<List<Integer>> getArr(int[] nums)  {
            List<List<Integer>> res=new ArrayList<List<Integer>>();
            if(nums==null||nums.length<1)
                return res;
            Arrays.sort(nums);

            for(int i=0;i<nums.length;i++){
                int left=i+1;
                int right=nums.length-1;
                //去重的关键2--在第一个之后的数字都不能被取
                if(i==0||(i>0&&nums[i]!=nums[i-1])){
                    while(left<right){
                        int tmp=nums[i]+nums[left]+nums[right];
                        if(tmp==0){
                            List<Integer> list=new ArrayList<Integer>();
                            list.add(nums[i]);
                            list.add(nums[left]);
                            list.add(nums[right]);
                            res.add(new ArrayList<Integer>(list));
                            //去重的关键三 left+1==left&&right-1==right情况是不可取的
                            while(
                                    left+1<nums.length&&
                                            nums[left]==nums[left+1]&&
                                            right-1>=0&&
                                            nums[right]==nums[right-1]){
                                left++;
                                right--;
                            }
                            left++;
                            right--;
                        }
                        else if(tmp<0){
                            left++;
                        }
                        else{
                            right--;
                        }
                    }
                }
            }
            return res;
        }
}
