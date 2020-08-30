package BasicOfOOP.Task3;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class Celendar
{
    String[] nameOfTheMonth = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};

    public Celendar(String nameOfTheMonth)
    {
        System.out.println("Вывод :");
        WeekendsAndHolydays weekendsAndHolydaysJan = new WeekendsAndHolydays(nameOfTheMonth);
        System.out.println(weekendsAndHolydaysJan.toString());
    }

    public class WeekendsAndHolydays
    {
        int[] weekends ;
        int[] holydays ;
        String name;

        public WeekendsAndHolydays(String name)
        {
            switch (name)
            {
                case "Январь" :
                    {
                        this.weekends = new int[]{1,12};
                        this.holydays = new int[]{13,25};
                        this.name = name;
                        break;
                    }

                case "Февраль" :
                {
                    this.weekends = new int[]{2,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Апрель" :
                {
                    this.weekends = new int[]{3,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Март" :
                {
                    this.weekends = new int[]{4,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Май" :
                {
                    this.weekends = new int[]{5,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Июнь" :
                {
                    this.weekends = new int[]{6,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Июль" :
                {
                    this.weekends = new int[]{7,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Август" :
                {
                    this.weekends = new int[]{8,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Сентябрь" :
                {
                    this.weekends = new int[]{9,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Октябрь" :
                {
                    this.weekends = new int[]{10,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Ноябрь" :
                {
                    this.weekends = new int[]{11,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                case "Декабрь" :
                {
                    this.weekends = new int[]{12,1};
                    this.holydays = new int[]{23};
                    this.name = name;
                    break;
                }

                default:
                {
                    this.weekends = null;
                    this.holydays = null;
                    this.name = null;
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