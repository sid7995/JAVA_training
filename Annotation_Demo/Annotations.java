import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by malviyas on 7/24/2017.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@interface Company {
    String name();
    String location();

}
