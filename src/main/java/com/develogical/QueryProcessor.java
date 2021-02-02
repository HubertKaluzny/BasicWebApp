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
            query = query.replaceAll("\\D+","_");
            String[] numbers = query.split("_");
            int result = 0;
            for (String number : numbers) {
                try {
                    int num = Integer.parseInt(number);
                    result += num;
                } catch (NumberFormatException e) {
                    //do nothing
                }
            }
            return Integer.toString(result);
        } else if (query.toLowerCase().contains("what is your name")) {
            return "teamNameHere";
        }
        return "";
    }
}
