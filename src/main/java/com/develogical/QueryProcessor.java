package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist. " +
                    "Shakespeare produced most of his known works between 1589 and 1613.";
        } else if (query.toLowerCase().contains("turing")) {
            return "Alan Mathison Turing was an English mathematician, computer scientist, " +
                    "logician, cryptanalyst, philosopher, and theoretical biologist. " +
                    "Turing was highly influential in the development of theoretical " +
                    "computer science, providing a formalisation of the concepts of " +
                    "algorithm and computation with the Turing machine, which can be " +
                    "considered a model of a general-purpose computer.";
        } else if (query.toLowerCase().contains("plus")) {
            String[] nums = query.split("plus");
            int num1=Integer.parseInt(nums[0]);
            int num2=Integer.parseInt(nums[0]);
            int result = num1 + num2;
            return Integer.toString(result);
        } else if (query.toLowerCase().contains("what is your name")) {
            return "teamNameHere";
        } else if (query.toLowerCase().contains("following is the largest")) {
            String[] parts = query.split(","); 
            int num1 = Integer.parseInt(parts[0]); 
            int num2 = Integer.parseInt(parts[1]); 
            int num3 = Integer.parseInt(parts[2]); 
            
            int result;

            if (num1 > num2 && num1 > num3) {
                result = num1; 
            } else if (num2 > num3) {
                result = num2; 
            } else { 
                result = num3; 
            }

            return Integer.toString(result); 
        } 
        return "";
    }
}
