package Automatization.ProjectForWork.Test2;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("D:\\Tovar.pdf");
        PDDocument.load(file);
    }
}
