package ru.Iam.tregulov.lesson28;

public class Tiger {

    void eat(String meal){
        if(!meal.equals("myaso")){
            throw new NeMyasoException("Tiger ne est " + meal);
        }else{
            System.out.println("Tiger est myaso");
        }
    }

    void drink(String fluid) throws NeVodaException{
        if(!fluid.equals("voda")){
            throw new NeVodaException("Tiger ne piot " + fluid);
        }else{
            System.out.println("Tiger piot vodu");
        }
    }
}
