import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by malviyas on 7/25/2017.
 */
enum Day {MON,TUE,WED,THU,FRI,SAT,SUN}
enum Month {JAN ,FEB,MAR}
enum Year {YEAR2015,YEAR2016,YEAR2017,YEAR2018,YEAR2019,YEAR2020}
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface TimeStamp {

    Day d();
    Month m();
    Year y();
}
