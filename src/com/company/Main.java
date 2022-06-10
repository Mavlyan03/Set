package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        symmetric(new HashSet(Arrays.asList(1, 2, 3, 4, 55)),
                new HashSet<>(Arrays.asList(0, 1, 2, -3)));
    }

    public static Set<Integer> symmetric(Set<Integer> set1, Set<Integer> set2) {
        System.out.println("In set 1: " + set1);
        System.out.println("In set 2: " + set2 + "\n");

        Set<Integer> set1NotHave = new HashSet<>(set2);
        set1NotHave.removeAll(set1);
        Set<Integer> set2NotHave = new HashSet<>(set1);
        set2NotHave.removeAll(set2);

        Set<Integer> symmetricDifference = new HashSet<>(set1NotHave);
        symmetricDifference.addAll(set2NotHave);

        Set<Integer> symmetric = new HashSet<>(set1);
        symmetric.retainAll(set2);

        System.out.println("Set 1 don't have: " + set1NotHave);
        System.out.println("Set 2 don't have: " + set2NotHave + "\n");
        System.out.println("Symmetric Difference: " + symmetricDifference);
        // System.out.println("Symmetric between set1  and set2: " + symmetric);
        return symmetricDifference;
    }
}

      /**  Set<Integer> num = new HashSet<>();
        num.add(3);
        num.add(4);
        num.add(1);
        System.out.println("Set 1: " + num);

        Set<Integer> nums = new HashSet<>();
        nums.add(2);
        nums.add(1);
        nums.add(7);
        System.out.println("Set 2: " + nums);

        System.out.println("Symmetric difference: " + symmetricDifference(num, nums));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> num, Set<Integer> nums) {
        Set<Integer> number = new HashSet<>(num);
        number.removeAll(nums);
        nums.removeAll(num);
        number.addAll(nums);

        return number;
    } */








