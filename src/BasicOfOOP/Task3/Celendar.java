package BasicOfOOP.Task3;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class Celendar
{
    String[] nameOfTheMonth = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};

    WeekendsAndHolydays weekendsAndHolydaysJan = new WeekendsAndHolydays("Январь",new int[]{12,13,25},new int[]{28,29});
    WeekendsAndHolydays weekendsAndHolydaysFeb = new WeekendsAndHolydays("Февраль",new int[]{13,23},new int[]{3});

    public Celendar()
    {
        System.out.println("Example :");
        System.out.println(weekendsAndHolydaysJan.toString());
        System.out.println(weekendsAndHolydaysFeb.toString());
    }

    public class WeekendsAndHolydays
    {
        int[] weekends ;
        int[] holydays ;
        String name;

        public WeekendsAndHolydays(String name, int[] weekends, int[] holydays)
        {
            for(int i = 0; i < nameOfTheMonth.length; i++)
            {
                if (name.equals(nameOfTheMonth[i]))
                {
                    this.weekends = weekends;
                    this.holydays = holydays;
                    this.name = name;
                    break;
                }
                else
                {
                    this.weekends = null;
                    this.holydays = null;
                    this.name = "Месяц не найден";
                    break;
                }
            }
        }

        @Override
        public String toString() {
            return "Название месяца " +
                    name +
                    " Выходные " + Arrays.toString(weekends) +
                    " Праздничные дни " + Arrays.toString(holydays);
        }
    }




}
