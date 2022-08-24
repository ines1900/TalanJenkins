package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.Driver;

public class UpdatePage extends Driver {
	 
	WebDriver driver;

	 private By btn_fleche=By.xpath("//*[@id=\"mainSidebarCollapse\"]");
	    private By btn_name=By.xpath("//a[contains(@id,'userAccount')]");
	    private By btn_profil=By.xpath("//*[@id=\"menu\"]/div/div/div/div/h4/span/span/a[1]");
	private By champs_name=By.xpath("//input[contains(@id,'student_lastName')]");
	    private By champs_familyname=By.xpath("//input[contains(@id,'student_firstName')]");  
	    private By champs_birthday=By.xpath("//input[contains(@id,'student_birthday')]");
	    private By champs_mobilenumber=By.xpath("//input[contains(@id,'student_tel')]");
	    private By champs_town=By.xpath("//select[contains(@id,'student_city')]");
	    private By btn_submit=By.xpath("//button[contains(@id,'student_save')]");
	    private By sentance=By.xpath("//div[contains(@class,'swal-text')]");
	    private By btn_OK=By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]");
	    
	    
	    public UpdatePage(WebDriver driver) {
			this.driver=driver;
			//if(!driver.getTitle().equals("TalanAcademy")){
				//throw new IllegalStateException("this is not login page, the current page is"+driver.getCurrentUrl());
			}
	    public void verifyprofil() {
			 driver.getCurrentUrl().equals("https://www.taan-academy.com/apprenti/dashboard/");
			}
		
		public void clickprofil() throws InterruptedException {
		     driver.findElement(btn_fleche).click();
		     Thread.sleep(2000);
		     driver.findElement(btn_name).click();
		     driver.findElement(btn_profil).click();
		}
		
		
		public void deletolddata() {
			 driver.findElement(champs_name).clear();
			 driver.findElement(champs_familyname).clear();
			 driver.findElement(champs_birthday).clear();
			 driver.findElement(champs_mobilenumber).clear();
			 
			}
		public void inputnewdata(String name,String familyname,String birthday,String mobilenumber,String town) {
			 driver.findElement(champs_name).sendKeys(name);
			 driver.findElement(champs_familyname).sendKeys(familyname);
			 driver.findElement(champs_birthday).sendKeys(birthday);
			 driver.findElement(champs_mobilenumber).sendKeys(mobilenumber);
			 driver.findElement(champs_town).sendKeys(town);
			 
			}
		public void submit() {
			 driver.findElement(btn_submit).click();
			 
			}
	    public void verifymodifsubmit() throws InterruptedException {
			
			driver.findElement(sentance).getText().trim().equals("Profil mis à jour avec succès");
			Thread.sleep(2000);
	        driver.findElement(btn_OK).click();
	    }
			//Assert.assertEquals(Verifytext, "Paste the text here which needs to be verified");
		/*	if(driver.findElement(sentance).getText().equals("Profil mis à jour avec succès")) {
				driver.findElement(btn_OK).click();
			}
			else {throw new IllegalStateException("your submission didn't work");}
		}*/
}
