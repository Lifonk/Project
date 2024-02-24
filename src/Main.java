import java.util.Scanner;

public class Main
{
    public static void WordCounter(String SetOfWords)
    {
        int Counter = 1;
        char[] charArray = SetOfWords.toCharArray();
        for(int i = 0; i < charArray.length; i++)
        {
            if(charArray[i] == ' ')
            {
                Counter++;
            }
        }
        System.out.println("Количество слов в ведённом тексте: " + Counter);
    }

    public static void CharCounter(String SetOfWords, boolean CoutSpace)
    {
        char[] charArray = SetOfWords.toCharArray();
        if(CoutSpace == true)
        {
            System.out.println("Количество символов в ведённом тексте: " + charArray.length);
        }
        else
        {
            int Counter = 0;
            for(int i = 0; i < charArray.length; i++)
            {
                if(charArray[i] == ' ')
                {
                    Counter++;
                }
            }
            System.out.println("Количество символов не считая пробелов в ведённом тексте: " + (charArray.length - Counter));
        }
    }
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        int Counter = 1; int CouterChar = 0;
        String SetOfWords = Scan.nextLine();
        WordCounter(SetOfWords);
        CharCounter(SetOfWords,true);
        CharCounter(SetOfWords,false);
    }
}