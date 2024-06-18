package TestMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic.hrms.BaseClass;
import com.hrms.pom.Apply;
@Listeners(com.generic.hrms.Listner.class)
public class ApplyTest extends BaseClass{

	
	@Test
	public void ApplyNewAssisment() throws InterruptedException, AWTException {
		
		Apply a = new Apply(driver);
		a.getApplybtn().click();
		a.getApplyNewAssismentbtn().click();
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getWardNobtn());
		f.SelectorText(a.getWardNobtn(), "10");
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getNewWardNobtn());
		f.SelectorText(a.getNewWardNobtn(), "11");
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getOwnerShipbtn());
		f.SelectorText(a.getOwnerShipbtn(), "Individual");
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getPropertyTypebtn());
		f.SelectorText(a.getPropertyTypebtn(), "Independent Building");
		a.getSaveAndNextbtn().click();
		
		//2nd Page Fillup details
		
		a.getKhataNoBtn().sendKeys("1234");
		a.getPlotNoBtn().sendKeys("23456");
		a.getVillageBtn().sendKeys("Dhurwa");
		a.getAreaofPlotBtn().sendKeys("4");
		a.getRoadWidthBtn().sendKeys("1742.24");
		a.getPinNoBtn().sendKeys("834005");
		a.getBuildingNoBtn().sendKeys("Mimic IT Park");
		a.getStreetNoBtn().sendKeys("Industrial Area ");
		a.getLocationBtn().sendKeys("Namkum");
		a.getLandmarkBtn().sendKeys("IT Park");
		a.getPropertyAddressBtn().sendKeys("Mimic IT Park Industrial Area Namkum");
		a.getCheckboxBtn().click();
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getSubmit2ndPageBtn());
		a.getSubmit2ndPageBtn().submit();
		
		//3rd Page Fillup details
		
		a.getElectricityNoBtn().sendKeys("563467346734");
		a.getAccNoBtn().sendKeys("58745693214");
		a.getBookNoBtn().sendKeys("6467");
		f.SelectorText(a.getElectricityConsumerNoBtn(), "DS I/II/III");
		a.getBuildingApprovalNoBtn().sendKeys("257");
		
		f.RobotClass();
		
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getBuildingApprovalDateBtn());
		a.getBuildingApprovalDateBtn().sendKeys("18");
		a.getBuildingApprovalDateBtn().sendKeys("06");
		a.getBuildingApprovalDateBtn().sendKeys("2024");
		
		a.getWaterConsumerNoBtn().sendKeys("25874");
		
		f.RobotClass();
		
		a.getWaterConnectionDateBtn().sendKeys("18");
		a.getWaterConnectionDateBtn().sendKeys("06");
		a.getWaterConnectionDateBtn().sendKeys("2024");
		
		a.getSubmit3rdPageBtn().submit();
		
		//Fourth Form Fillup
		
		a.getAddownerBtn().click();
		a.getOwnerNameBtn().sendKeys("Piyush");
		f.SelectorText(a.getGenderBtn(), "Male");
		
		f.RobotClass();
		
		a.getDobBtn().sendKeys("05");
		a.getDobBtn().sendKeys("10");
		a.getDobBtn().sendKeys("1995");
		
		a.getGurdianNameBtn().sendKeys("Virendra Prasad");
		f.SelectorText(a.getRelationBtn(), "S/O");
		a.getMobileNoBtn().sendKeys("7847457457");
		a.getAadharNoBtn().sendKeys("224258698805");
		a.getPanNoBtn().sendKeys("WPK8337R54");
		a.getEmailidBtn().sendKeys("Test@yopmail.com");
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getArmedForceBtn());
		f.SelectorText(a.getArmedForceBtn(),"Yes");
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getSpeciallyAbled());
		f.SelectorText(a.getSpeciallyAbled(),"No");
		a.getSubmit4thBtn().submit();
		a.getSaveNextOwnerBtn().click();
		
		//Fifth formFillup
		
		a.getAddFloorBtn().click();
	
		f.SelectorText(a.getFloorNoBtn(), "Ground Floor");
		f.SelectorText(a.getUsesTypeBtn(), "Residential");
		f.SelectorText(a.getOccupancyTypeBtn(), "Self Occupied");
		f.SelectorText(a.getConstructionTypeBtn(), "Pucca With Asbestos/Corrugated Sheet (Acc)");
		a.getBuildUpAreaBtn().sendKeys("2222");
		
		f.RobotClass();
		
		a.getFromDateBtn().sendKeys("11");
		a.getFromDateBtn().sendKeys("06");
		a.getFromDateBtn().sendKeys("2024");
		
		f.RobotClass();
	
		a.getAddFloor().click();
		a.getSave5thNextBtn().click();
		
		//Sixth FormFillup
		f.ExplicitWait(driver, Duration.ofSeconds(10), a.getZoneBtn());
		f.SelectorText(a.getZoneBtn(), "Zone 2");
		f.SelectorText(a.getMobileTowerBtn(), "Yes");
		a.getTotalTowerAreaBtn().sendKeys("400");
		
		f.RobotClass();
		a.getTowerInstallationDateBtn().sendKeys("17");
		a.getTowerInstallationDateBtn().sendKeys("06");
		a.getTowerInstallationDateBtn().sendKeys("2024");
		
		f.SelectorText(a.getHordingBoardBtn(), "Yes");
		a.getHordingAreaBtn().sendKeys("450");
		
		f.RobotClass();
		a.getHordingInstallationDateBtn().sendKeys("15");
		a.getHordingInstallationDateBtn().sendKeys("06");
		a.getHordingInstallationDateBtn().sendKeys("2024");
		
		f.SelectorText(a.getPropertyPetrolPumpBtn(), "Yes");
		a.getPetrolPumpAreaBtn().sendKeys("455");
		
		f.RobotClass();
		a.getPetrolPumpCompletionDateBtn().sendKeys("08");
		a.getPetrolPumpCompletionDateBtn().sendKeys("06");
		a.getPetrolPumpCompletionDateBtn().sendKeys("2024");
		
		f.SelectorText(a.getRainWaterHarvestingBtn(), "Yes");
		
		f.RobotClass();
		a.getWaterHarvestingConstructionDateBtn().sendKeys("15");
		a.getWaterHarvestingConstructionDateBtn().sendKeys("06");
		a.getWaterHarvestingConstructionDateBtn().sendKeys("2024");
	}
	
	
}
