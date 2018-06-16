package com.dimaUKR;

// наследование классов
public class Vipclient extends Client {

    Vipclient(){
        setFreeDelivery();
    }

    public void setFreeDelivery() {
        System.out.println("Это вип клиент для него доставка бесплатна!");
    }

    @Override
    public void setName(String name) {
        System.out.println("Используется перегрузка унаследованого метода из класса Client");
        super.setName(name);
    }
}
