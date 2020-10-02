package Automatization.ProjectForWork.Test3Final;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String args[]) throws IOException {
        //Loading an existing document
        File file = new File("D://Tovar2.pdf");
        PDDocument document = PDDocument.load(file);
        //Instantiate PDFTextStripper class
        PDFTextStripper pdfStripper = new PDFTextStripper();
        //Retrieving text from PDF document
        String text = pdfStripper.getText(document);
       // System.out.println(text);
        //Closing the document
        document.close();

        String[] strArrat = text.split("");

        System.out.println(strArrat.length);
        System.out.println("========================");

        for (int i = 0; i < strArrat.length;i++)
        {
           if ((strArrat[i].equals("9")) && (strArrat[i + 1].equals(" ")) && (strArrat[i - 1].equals(" ")))
           {
               if (strArrat[i].equals(" ")&&strArrat[i+1].equals(" ")&&strArrat[i+2].equals(" ")) continue;
               //System.out.println(strArrat[i-1] + strArrat[i] + strArrat[i+1]);
               for (int j = 0; j < 50;j++)
               {
                   System.out.print(strArrat[(i + 2) + j]);
               }

               System.out.println();
              // System.out.println("Bingo !!!");
           }


        }


    }
}
