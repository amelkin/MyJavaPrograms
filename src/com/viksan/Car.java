package com.viksan;


class Car {
    private String maker;
    private String color;
    private String bodyType;



    public Car(){
        maker = "Porshe";
        color = "Silver";
        bodyType = "Coupe";
    }
    private String accelerate() {
        String motion = "Accelerate...";
        return motion;
    }

    public void setCar(String brand, String paint, String style){
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " color " + color);
        System.out.println(maker + " type body " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }


}


