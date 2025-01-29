package Java8.Basic.Lambda;

import java.util.function.Supplier;
public class RandomOTP{
public static void main(String [] args){
    Supplier<String> s = () -> {
              String otp = "";
              for(int i=1;i<4;i++){
                  otp = otp +(int)(math.random()*10);
              }
          return otp;
        }
       System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());
}
}
