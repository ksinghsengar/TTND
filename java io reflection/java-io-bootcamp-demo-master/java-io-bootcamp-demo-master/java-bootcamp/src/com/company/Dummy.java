package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface Demo{
    int display(int a);

}

public class Dummy {

    public static void main(String[] args) {

//      Demo demo = a -> a+2;
//
//        System.out.println(demo.display(2));;

//        Consumer consumer=e-> System.out.println(e);

        List<Integer> list = Arrays.asList(1,2,3);

        list.forEach(e-> System.out.println(e));


//        int xyz=2;
//
//        Predicate<Integer> predicate= e-> {
//            System.out.println("filter>>>"+e);
//            return e%2!=0;
//        };
//
//        Function<Integer,Integer> function= e->{
//            System.out.println("map>>>"+e);
//            return e*xyz;
//        };
//
//
//        Optional<Integer> optional=list.stream()
//                        //intermediate
//                        .filter(predicate)
//                        .map(function)
//                        //terminal
//                        .findFirst();
//                        //.collect(Collectors.toList())
//
//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }
//        else{
//            System.out.println("Nothing to print");
//        }
//

    }
}

