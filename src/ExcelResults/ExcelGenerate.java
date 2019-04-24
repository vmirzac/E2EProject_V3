package ExcelResults;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import com.common.excelreport.ExcelReportGenerator;
import org.xml.sax.SAXException;

import static javax.print.attribute.standard.MediaSizeName.D;

public class ExcelGenerate {

    public static void main(String[]args) throws ParserConfigurationException, IOException, SAXException
    {
        ExcelReportGenerator.generateExcelReport("MyProject.xls", "D:\\workspace”");

    }
}
