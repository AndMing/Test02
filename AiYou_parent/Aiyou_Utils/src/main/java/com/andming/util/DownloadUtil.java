package com.andming.util;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @ClassName: DownloadUtil
 * @Description: 说明
 * @author: 明明 E-mail:andming5@126.com
 * @date: 2019/8/8 20:58
 * @Version: 1.0
 */
public class DownloadUtil {
    public static void download()  throws Exception{

        String filePath="G:\\工具\\get.xls";
        HSSFWorkbook workbook = new HSSFWorkbook();

        HSSFSheet sheet = workbook.createSheet();

        Cell cell=null;

        for (int i = 0; i < 2; i++) {
            HSSFRow row = sheet.createRow(i);
            for (int j = 0; j < 10; j++) {
                cell = row.createCell(j);
                //5.设置单元格的内容
                cell.setCellValue("传智播客");
                //6.设置单元格的样式
                CellStyle cellStyle = workbook.createCellStyle();

                Font font = workbook.createFont();


                font.setFontHeightInPoints((short)28);//字体大小
                font.setFontName("华文行楷");//字体名称


                cellStyle.setFont(font);// 设置单元格样式的字体
                cell.setCellStyle(cellStyle);// 将单元格样式作用于
                // 7.保存，关闭流
            }

        }

        OutputStream os = new FileOutputStream(filePath );
        workbook.write(os);
        os.close();




    }
/**
 * 功能描述:
 *
 * @param:
 * @return:
 * @date: 2019/8/9 11:18
 */

    public static void main(String[] args) throws Exception {
        
        download();
    }


    public String ass(int a,int  v,int c) throws Exception{

        return "user";
    }

}
