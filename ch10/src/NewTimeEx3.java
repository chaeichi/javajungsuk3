import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}

class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        System.out.println(today);
        System.out.println(date);
        System.out.println(today.with(firstDayOfNextMonth())); // 다음 달의 첫 날
        System.out.println(today.with(firstDayOfMonth())); // 이 달의 첫 날
        System.out.println(today.with(lastDayOfMonth())); // 이 달의 마지막 날
        System.out.println(today.with(firstInMonth(WEDNESDAY))); // 이 달의 첫번째 수요일
        System.out.println(today.with(lastInMonth(WEDNESDAY))); // 이 달의 마지막 수요일
        System.out.println(today.with(previous(WEDNESDAY))); // 지난 주 수요일
        System.out.println(today.with(previousOrSame(WEDNESDAY))); // 지난 주 수요일(오늘 포함)
        System.out.println(today.with(next(WEDNESDAY))); // 다음 주 수요일
        System.out.println(today.with(nextOrSame(WEDNESDAY))); // 다음 주 수요일(오늘 포함)
        System.out.println(today.with(dayOfWeekInMonth(4, WEDNESDAY))); // 이 달의 4번째 수요일
    }
}