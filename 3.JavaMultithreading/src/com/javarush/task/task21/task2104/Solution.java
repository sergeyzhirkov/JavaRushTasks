package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    public boolean equals(Object n) {
        if (this == n) return true;
        if (!(n instanceof Solution)) return false;

        Solution solution = (Solution) n;

        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        return last != null ? last.equals(solution.last) : solution.last == null;
    }

    public int hashCode() {
        int result = 0;
        if (first != null) {
            result += 31 * first.hashCode();
        }
        if (last != null) {
            result += last.hashCode();
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
        System.out.println(new Solution("9", "s").equals(new Solution("", "s")));
    }
}
