package Java8.Basic.OtherUpdates;
import java.util.function.Supplier;

class Doctor{
   public Doctor() {
	System.out.println("Doctor Cunstructor........");
   }
}
public class CunstructorRef{
public static void main(String[] args) {
    Supplier<Doctor> s = Doctor::new;
    Doctor doctor = s.get();
    System.out.println(doctor.hashCode());
}
}
