package com.library.actiTime;

public interface AutoConst {
	
	public String xlpath="./data/input.xlsx";
	
	public String CHROME_KEY = "webdriver.chrome.driver";
	public String CHROME_PATH = "./driver/chromedriver.exe";
//	public String CHROME_PATH = ExcelLib.readExcel(xlpath, "sheet2", 0, 0);
	
	public String GECKO_KEY = "webdriver.gecko.driver";
	public String GECKO_PATH = "./driver/geckodriver.exe";
//	public String GECKO_PATH = ExcelLib.readExcel(xlpath,"Sheet2", 1, 0);
	
}
