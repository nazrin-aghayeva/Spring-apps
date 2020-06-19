package app.service;

import org.springframework.stereotype.Service;

@Service
public class Calc {
    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }
}
