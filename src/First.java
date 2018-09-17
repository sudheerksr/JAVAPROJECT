import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class First {
	@Test
	public static void evenNumbers() {
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {

				System.out.println(i);

			}

		}

	}

	@Test
	public void twoDimentionalArray() {
		int[][] a = { { 5, 2, 9 }, { 4, 6, 8 } };
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");

			}

			System.out.println();

		}
	}

	@Test
	public void fibocanic() {
		int n = 10, t1 = 0, t2 = 1;
		for (int i = 1; i < n; i++) {
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

	// Factorial of a number 
	@Test
	public void factorial() {
		int i,fact=1;
		int n=5;
		for ( i = 1; i <= n; i++) {
			fact=fact*i;			
		}
		System.out.println("Factorial of number...."+n+"  is...."+fact);
	}
	
	@Test
	public void factRecursion() {
	
		
	}

	@Test
	public void duplicateChar() {
		String s = "totalqa";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == null) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}

		}
		Set<Character> set = map.keySet();
		java.util.Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			Character ch = it.next();
			System.out.println(ch + "....." + map.get(ch));

		}
	}

	@Test
	public void getRowAndColumnCount() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Sudheer Reddy\\Downloads\\Commodity-Tracksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("TRACKSHEET");
		XSSFRow row = sheet.getRow(0);
		int columCount = row.getLastCellNum();
		int rowCount = sheet.getLastRowNum();
		System.out.println("Column count is..." + columCount + "\n Row count is..." + rowCount);
	}

	@Test
	public void writeData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Sudheer Reddy\\Downloads\\Commodity-Tracksheet.xlsx");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Sudheer Reddy\\Downloads\\Commodity-Tracksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		fis.close();
		XSSFSheet sheet = workbook.getSheet("TRACKSHEET");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		int colNum = -1;
		for (int i = 0; i < row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase("Results")) {
				colNum = i;
			}
		}
		row = sheet.getRow(1);
		if (row == null) {
			sheet.createRow(1);
		}
		cell = row.getCell(colNum);
		if (cell == null) {
			cell = row.createCell(colNum);
		}
		fos = new FileOutputStream("C:\\Users\\Sudheer Reddy\\Downloads\\Commodity-Tracksheet.xlsx");
		workbook.write(fos);
		fos.close();
		fis.close();
	}

	@Test
	public void readData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Sudheer Reddy\\Downloads\\Commodity-Tracksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("TRACKSHEET");
		XSSFRow row=sheet.getRow(0);
		int colNum=-1;
		for (int i = 0; i <row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equals("UserName")){
				colNum=i;				
			}			
		}
		row=sheet.getRow(1);
		XSSFCell cell=row.getCell(colNum);
		String value=cell.getStringCellValue();
		System.out.println("Value is...."+value);		
	}
	
	@Test 
	public void readFileUsingFileInputStream() throws IOException {
		File file=new File("C:\\Users\\Sudheer Reddy\\Desktop\\JAVA.txt");
		if (file.exists()==false){
			file.createNewFile();			
		}
		String text;
		FileReader fr=new FileReader(file.getAbsolutePath());
		BufferedReader br=new BufferedReader(fr);
		while ((text=br.readLine())!=null) {
			System.out.println("Read is..."+text);			
		}
		System.out.println("Text is..."+text);
		br.close();
	}
	@Test
	public void writeTextFile() throws IOException {
		File file=new File("C:\\Users\\Sudheer Reddy\\Desktop\\JAVA1.txt");
		if (file.exists()==false){
			file.createNewFile();			
		}
		FileWriter fw=new FileWriter(file.getAbsolutePath());
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("");
		bw.close();		
	}
}