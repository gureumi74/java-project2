package com.example.project2.week4.day19;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class ReadFileEx {

    Charset charset;
    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));
        // 인코딩 문제를 Charset.forName("EUC-KR")로 세팅하면 해결할 수 있다.


        String line;
        // 한 줄씩 읽어서 모두 읽어오는 것
        while ((line = br.readLine()) != null) {
                lines.add(line);
        }

        return lines;
    }

    public Hospital parse(String str) {
        // 주소에 붙은 , 를 행이랑 구분하기 위해 !로 바꿔줌
        String s = str.replaceAll(", ", "! ");
        // , 를 기준으로 나눠서 배열로 저장
        String[] strSplit = s.split(",");
        for(int i = 0; i < strSplit.length; i++) {
            strSplit[i] = strSplit[i].replaceAll("! ", ", ");
        }
        Address address = new Address(strSplit[10], strSplit[5], strSplit[7]);
        Hospital hospital = new Hospital(strSplit[1], strSplit[11], address);

        return hospital;
    }
    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for(String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> result = rfe.getLines("hospital_info_10lines.csv");
        List<Hospital> parsedHospital = rfe.getHospitals(result);
        for(int i = 0; i <  parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
//        }
        }
    }
}
