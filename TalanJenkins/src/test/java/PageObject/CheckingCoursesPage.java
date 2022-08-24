package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.Driver;

public class CheckingCoursesPage extends Driver {
	  
	
	 WebDriver driver;

	private By btn_oldsessions=By.xpath("//span[contains(@class,'nav-text ml-3')]");
	    private By btn_voircours=By.linkText("Voir Le Cours");  
	    private By btn_module=By.xpath("//a[contains(@id,'module_active_103')]");  
	    private By btn_coursnum=By.xpath("//a[contains(@id,'active_day_810')]");
	    private By btn_ressources=By.linkText("Ressources");
	    private By voila=By.xpath("//*[@id=\"resources-810\"]/div/h4");
	    
	    public CheckingCoursesPage(WebDriver driver) {
			this.driver=driver;
			//if(!driver.getTitle().equals("TalanAcademy")){
				//throw new IllegalStateException("this is not login page, the current page is"+driver.getCurrentUrl());}
		}
	    public void checkdiplayoldsessions() throws InterruptedException{
	    	driver.findElement(btn_oldsessions).getText().trim().equals("Mes sessions passées");
	    }
	    
	    public void clickoldsessions() throws InterruptedException{
			driver.findElement(btn_oldsessions).click();
			Thread.sleep(2000);
			driver.getCurrentUrl().equals("https://www.talan-academy.com/apprenti/passedSession");
	    }
	    public void clickvoircours() throws InterruptedException{
	    	driver.findElement(btn_voircours).click();
	        Thread.sleep(2000);
	    }
	    public void clickvoirmodule() throws InterruptedException{
	    	driver.findElement(btn_module).click();
	        Thread.sleep(2000);
	    }
	    public void clickvoircoursnum() throws InterruptedException{
	    	driver.findElement(btn_coursnum).click();
	        Thread.sleep(2000);
	    }
	    
	    public void clickvoirressources() throws InterruptedException{
	    	driver.findElement(btn_ressources).click();
	        Thread.sleep(2000);
	    }
	    public void checkreferences() {
	    	driver.findElement(voila).getText().trim().equals("Voilà les références théoriques du jour :");
	    }
}
