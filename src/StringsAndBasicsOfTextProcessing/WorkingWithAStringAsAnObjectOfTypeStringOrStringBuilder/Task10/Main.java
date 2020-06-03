package StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeStringOrStringBuilder.Task10;

//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
// Определить количество предложений в строке X.

public class Main
{
    public static void main(String[] args)
    {

    StringBuilder x = new StringBuilder("Монах выхватил посох и встал на пути нарушителя:\n" +
            "– Зачем ты пришел к нам в монастырь? – спросил он.\n" +
            "– Какое тебе дело, пшел вон с дороги! – огрызнулся чужак.\n" +
            "– Уууу…– Многозначительно протянул монах. – Похоже, манерам тебя не учили. Ладно, я сегодня как раз в настроении, преподам тебе несколько уроков.\n" +
            "– Ты меня достал, монах, ангард! – прошипел незваный гость.\n" +
            "– Моя кровь начинает играть! – с восторгом простонал церковник, – Пожалуйста, постарайся не разочаровать меня.\n" +
            "С этими словами оба сорвались со своих мест и сцепились в беспощадной схватке.");

    String[] xArray = x.toString().split("");

    String[] SighnsArray = {".","!","?"};

    int count = 0;

        for(int i = 0 ; i < xArray.length; i ++)
        {
            for(int j = 0 ; j < SighnsArray.length; j ++)
            {
            if (xArray[i].equals(SighnsArray[j])) count++;
            }
        }
        System.out.println("Пример текста : \n" + x.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("Всего в данном тексте " + count + " предложений");

    }
}
