package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create object of FileInputStream class
		
		FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\18Feb Morning\\18FebExcelTest.xlsx");
			
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int totalRows = mySheet.getLastRowNum();
		int totalCells = mySheet.getRow(0).getLastCellNum()-1;
		
		//outer for loop-->rows
		for(int i=0;i<=totalRows;i++)
		{
			for(int j=0;j<=totalCells;j++)
			{
					Cell myCell = mySheet.getRow(i).getCell(j);
					CellType myCellType = myCell.getCellType();
			
					if(myCellType==CellType.STRING)
				{
					System.out.print(myCell.getStringCellValue()+" ");
				}
				
				else if (myCellType==CellType.NUMERIC)
				{
					System.out.print(myCell.getNumericCellValue()+" ");
				}
					else if (myCellType==CellType.BOOLEAN)
				{
						System.out.print(myCell.getBooleanCellValue()+" ");
						
				}
					
					else if (myCellType==CellType.BLANK)
					{
					System.out.print(" ");	
					}
			}
			System.out.println();
		}
	}

}
