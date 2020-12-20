package Automatization.ProjectForWork;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Main
{
    public static void main(String[] args) throws IOException {
        System.out.println(readParaFromPDF("D:\\Tovar.pdf",3, "Enter Start Text Here", "Enter Ending Text Here"));
        //Enter FilePath, Page Number, StartsWith, EndsWith
    }
    public static String readParaFromPDF(String pdfPath, int pageNo, String strStartIndentifier, String strEndIdentifier) {
        String returnString = "";
        try {
            PDDocument document = PDDocument.load(new File(pdfPath));
            document.getClass();
            if (!document.isEncrypted()) {
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);
                PDFTextStripper tStripper = new PDFTextStripper();
                tStripper.setStartPage(pageNo);
                tStripper.setEndPage(pageNo);
                String pdfFileInText = tStripper.getText(document);
                String strStart = strStartIndentifier;
                String strEnd = strEndIdentifier;
                int startInddex = pdfFileInText.indexOf(strStart);
                int endInddex = pdfFileInText.indexOf(strEnd);
                returnString = pdfFileInText.substring(startInddex, endInddex) + strEnd;
            }
        } catch (Exception e) {
            returnString = "No ParaGraph Found";
        }
        return returnString;
    }


}
