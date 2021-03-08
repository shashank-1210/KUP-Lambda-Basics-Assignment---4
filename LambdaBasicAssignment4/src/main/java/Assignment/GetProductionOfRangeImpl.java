package Assignment;

import java.util.stream.LongStream;

public class GetProductionOfRangeImpl {

   public GetProductionOfRange get = (start,end) ->{

      return LongStream.rangeClosed(start, end).reduce(1,(a,b)->a*b);



   };


}
