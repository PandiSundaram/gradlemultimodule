package com.pandi;



import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;



@Service
public class RailService {

    public static List<RailModel> getRailTime(){
        return Arrays.asList(new RailModel("sansadhapthi", LocalTime.of(12,30),LocalTime.of(3,30)),
                new RailModel("uzhalavan",LocalTime.of(8,30),LocalTime.of(12,30)));
    }


}
