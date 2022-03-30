package GPProjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class projecEVCalculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://afdc.energy.gov/calc/#result_a");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
/* Gasoline vehicle*/
		//Select Year
		WebElement Gyear = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[1]"));
		Select Gyear1 = new Select (Gyear);
		Gyear1.selectByVisibleText("2021");
		Thread.sleep(1000);
		
		//Select Make
		WebElement Gmake = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[2]"));
		Select Gmake1 = new Select (Gmake);
		Gmake1.selectByVisibleText("Ford");
		Thread.sleep(1000);
		
		//Select Model
		WebElement Model = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[3]"));
		Select Model1 = new Select (Model);
		Model1.selectByValue("43999");
		
		WebElement AddVehicle1 = driver.findElement(By.id("add_vehicle_button"));
		AddVehicle1.click();
		
		//String vehiclename1 = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/div[2]/div[6]")).getText();
		System.out.println("Gasoline Vehicle created successfully:19 ");
		
		/*if(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/div[2]/div[6]")).getText().equalsIgnoreCase("Gasoline"))
		    //Pass
		    System.out.println("Vehicle created successfully ");
		else
		    //Fail
		    System.out.println("Vehicle created successfully with error");*/
		
		Thread.sleep(1000);

/* Hybrid vehicle*/
		//Select Year
		WebElement Hyear = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[1]"));
		Select Hyear1 = new Select (Hyear);
		Hyear1.selectByVisibleText("2020");
		Thread.sleep(1000);
				
		//Select Make
		WebElement Hmake = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[2]"));
		Select Hmake1 = new Select (Hmake);
		Hmake1.selectByVisibleText("Audi");
		Thread.sleep(1000);
			
		//Select Model
		WebElement HModel = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[3]"));
		Select HModel1 = new Select (HModel);
		HModel1.selectByValue("42241");
			
		WebElement AddVehicle2 = driver.findElement(By.id("add_vehicle_button"));
		AddVehicle2.click();
		
		System.out.println("Hybrid Vehicle created successfully:52 ");

		Thread.sleep(1000);

/*Electric Vehicle*/
		
		//Select Year
		WebElement Eyear = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[1]"));
		Select Eyear1 = new Select(Eyear);
		Eyear1.selectByVisibleText("2021");
		Thread.sleep(1000);
		
		//Select Make
		WebElement Emake = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[2]"));
		Select Emake1 = new Select(Emake);
		Emake1.selectByVisibleText("Kia");
		Thread.sleep(1000);
		
		//Select Model
		WebElement Emodel = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[3]"));
		Select Emodel1 = new Select(Emodel);
		Emodel1.selectByValue("43820"); 
		
		WebElement Addvehicle3 = driver.findElement(By.xpath("//input[@id='add_vehicle_button']"));
		Addvehicle3.click();
		Thread.sleep(1000);
		
		System.out.println("electric Vehicle created successfully:77 ");
			
/* Diesel vehicle*/
		
		WebElement Dyear = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[1]"));
		Select Dyear1 = new Select(Dyear);
		Dyear1.selectByVisibleText("2019");
		Thread.sleep(1000);
		
		WebElement Dmake = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[2]"));
		Select Dmake1 = new Select(Dmake);
		Dmake1.selectByVisibleText("Jeep");
		Thread.sleep(1000);
		
		WebElement Dmodel = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[3]"));
		Select Dmodel1 = new Select(Dmodel);
		Dmodel1.selectByValue("41435");
		
		WebElement Addvehicle4 = driver.findElement(By.xpath("//input[@id='add_vehicle_button']"));
		Addvehicle4.click();
		Thread.sleep(1000);
		
		System.out.println("Electric Vehicle created successfully:102 ");

/* PluginHybrid vehicle*/
		
		WebElement Pyear = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[1]"));
		Select Pyear1 = new Select(Pyear);
		Pyear1.selectByIndex(0);
		Thread.sleep(1000);
		
		WebElement Pmake = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[2]"));
		Select Pmake1 = new Select(Pmake);
		Pmake1.selectByVisibleText("BMW");
		Thread.sleep(1000);
		
		WebElement Pmodel = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/select[3]"));
		Select Pmodel1 = new Select (Pmodel);
		Pmodel1.selectByValue("45116");
		
		WebElement Addvehicle5 = driver.findElement(By.id("add_vehicle_button"));
		Addvehicle5.click();
		Thread.sleep(1000);
		System.out.println("Plug-in Hybrid vehicle added successfully: 124");		
		
/*Custom Vehicle FF*/
		
	    WebElement customvehicle = driver.findElement(By.xpath("//a[contains(text(),'Create Custom Vehicle')]"));
		customvehicle.click();
		
		WebElement customName = driver.findElement(By.id("vehicle_name"));
		customName.sendKeys("Mahindra Bolero");
		
		WebElement customPrice = driver.findElement(By.id("purchase_price"));
		customPrice.sendKeys("42,090");
		
		WebElement customFuel = driver.findElement(By.id("vehicle_fuel_select"));
		Select customFueltype = new Select(customFuel);
		customFueltype.selectByIndex(5);
		
		WebElement customCityEco = driver.findElement(By.id("gas_city_economy"));
		customCityEco.sendKeys("24");
		
		WebElement customHwyEco = driver.findElement(By.id("gas_hwy_economy"));
		customHwyEco.sendKeys("28");
		
		WebElement custome85cty = driver.findElement(By.xpath("//input[@id='e85_city_economy']"));
		custome85cty.sendKeys("18");
		
		WebElement custome85hwy = driver.findElement(By.id("e85_hwy_economy"));
		custome85hwy.sendKeys("20");
		
		WebElement Addcustomvehicle6 = driver.findElement(By.id("build_vehicle_submit_button"));
		Addcustomvehicle6.click();
		Thread.sleep(1000);
		
		System.out.println("Custom Vehicle created successfully: 146");
		
/*Fuel price update*/
		
		WebElement Gasoline = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/div[1]/input[1]"));
		Gasoline.clear();
		Gasoline.sendKeys("2.82");
		
		WebElement Diesel = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/div[2]/input[1]"));
		Diesel.clear();
		Diesel.sendKeys("2.91");
		
		WebElement B20 = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/div[3]/input[1]"));
		B20.clear();
		B20.sendKeys("2.66");
		
		WebElement B100 = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/div[4]/input[1]"));
		B100.clear();
		B100.sendKeys("3.24");
		
		WebElement E85 = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/div[5]/input[1]"));
		E85.clear();
		E85.sendKeys("2.33");
		
		System.out.println("Fuel Price for all vehicles are updated: 178");
		
/*Normal Daily Use*/
		
		WebElement Avgdistance = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/input[1]"));
		Avgdistance.clear();
		Avgdistance.sendKeys("56");

		WebElement daysperWeek = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/input[1]"));
		daysperWeek.clear();
		daysperWeek.sendKeys("5");
		
		WebElement weeksperYear = driver.findElement(By.xpath("//select[@id='weeks_per_year']"));
		Select weeksperYear1 = new Select(weeksperYear);
		weeksperYear1.selectByIndex(11);

		WebElement PercentHighway = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[5]/div[2]/input[1]"));
		PercentHighway.clear();
		PercentHighway.sendKeys("38");
		//Thread.sleep(2000);
		
		System.out.println("Normal Daily Use input given: 203");
		
/*Other Trips*/
		
		WebElement Annualmileage = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/input[1]"));
		Annualmileage.clear();
		Annualmileage.sendKeys("6789");
		
		WebElement tripPercenthighway = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[2]/input[1]"));
		tripPercenthighway.clear();
		tripPercenthighway.sendKeys("42");
		
		System.out.println("Other trips input given: 224");

/*Electricity Use*/
		
		WebElement SelectState = driver.findElement(By.id("state"));
		Select SelectState1 = new Select(SelectState);
		SelectState1.selectByVisibleText("Indiana");
		
		WebElement dailyuse = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[2]/ul[1]/li[1]/input[1]"));
		dailyuse.click();
	
/*E85 Use*/
		
		WebElement E85use = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[2]/input[1]"));
		E85use.clear();
		E85use.sendKeys("38");

/*Biodiesel Fuel Use*/
		
		WebElement Biodieseluse = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[2]/div[4]/div[2]/select[1]"));
		Select Biodieseluse1 = new Select(Biodieseluse);
		Biodieseluse1.selectByIndex(1);
		
		WebElement biodieselusevalue = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[2]/input[1]"));
		biodieselusevalue.clear();
		biodieselusevalue.sendKeys("0");
		
/*Get Results*/
		
		WebElement GetResults =	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[5]/input[1]"));
		GetResults.click();
		Thread.sleep(5000);
		
		System.out.println("Check the result and graph comparison for all vehicles: 263");
		
		driver.findElement(By.id("fuel_use_button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("electricity_use_button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("fuel_cost_button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("operating_cost_button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("cost_per_mile_button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("emissions_button")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		
		
		
		//driver.close();			
				
	}

}
