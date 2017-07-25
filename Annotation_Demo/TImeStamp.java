import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by malviyas on 7/25/2017.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface TimeStamp {
    public enum day {Mon,Tue,Wed,Thu,Fri,Sat,Sun}
    public enum month {Jan,Feb,Mar}
    public enum year {YEAR2015,YEAR2016,YEAR2017,YEAR2018,YEAR2019,YEAR2020}
    day d();
    month m();
    year y();
}
