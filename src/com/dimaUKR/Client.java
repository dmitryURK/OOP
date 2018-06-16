package com.dimaUKR;


import java.time.LocalDate;

public class Client {

    Client(){

    }
    Client(String name){
        setName(name);
    }
    public void setName(String name){
        System.out.println("Имя клиента = "+name);
    }
    public void setBirdDate(LocalDate date){
        System.out.println("Дата рождения=" + date);
    }
    public void setAddress(String address){
        System.out.println("Адрес = "+address);
    }

}
