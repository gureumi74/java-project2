package com.example.project2.week4.day18;

import java.io.*;
import java.util.*;

public class CodeUp3108 {
    private HashMap<Integer, String> studentMap = new HashMap();
    public boolean contains(int id, String name) {
        return studentMap.containsKey(id) || studentMap.containsValue(name);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());

        CodeUp3108 solution = new CodeUp3108();
        for(int i = 0; i < caseNum; i++) {
            String[] input = br.readLine().split(" ");
            int id = Integer.parseInt(input[1]);
            if(input[0].equals("I")) {
                if(!solution.contains(id, input[2])) {
                    solution.studentMap.put(id, input[2]);
                }
            } else {
                if (solution.studentMap.containsKey(id)) {
                    solution.studentMap.remove(id, input[2]);
                }
            }
        }

        List<Map.Entry<Integer, String>> list = new ArrayList<>();
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for(Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
