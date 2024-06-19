package com.hrms.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apply {

	@FindBy(xpath="//span[text()='Apply']")
	private WebElement Applybtn;
	
	@FindBy(xpath="//span[text()='Apply New Assessment']")
	private WebElement ApplyNewAssismentbtn;
	
	@FindBy(xpath="//select[@name='wardNo']")
	private WebElement WardNobtn;
	
	@FindBy(xpath="//select[@name='newWardNo']")
	private WebElement NewWardNobtn;
	
	@FindBy(xpath="//select[@name='ownerShiptype']")
	private WebElement OwnerShipbtn;
	
	@FindBy(xpath="//select[@name='propertyType']")
	private WebElement PropertyTypebtn;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveAndNextbtn;
	
	// Second Form 
	
	@FindBy(xpath="//input[@placeholder='Enter Khata No.']")
	private WebElement KhataNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Plot No.']")
	private WebElement PlotNoBtn;

	@FindBy(xpath="//input[@placeholder='Enter Village/Mauja Name']")
	private WebElement VillageBtn;
	
	@FindBy(xpath="//input[@placeholder='EnterArea of Plot.']")
	private WebElement AreaofPlotBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Road Width']")
	private WebElement RoadWidthBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Pin no.']")
	private WebElement PinNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter building name.']")
	private WebElement BuildingNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter street name']")
	private WebElement StreetNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter location.']")
	private WebElement LocationBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter landmark']")
	private WebElement LandmarkBtn;

	@FindBy(xpath="//input[@placeholder='Enter Property Address']")
	private WebElement PropertyAddressBtn;

	@FindBy(xpath="//input[@name='addressCheckbox']")
	private WebElement CheckboxBtn;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit2ndPageBtn;

	//Third Form
	
	@FindBy(xpath="//input[@placeholder='Enter Electricity K. No']")
	private WebElement ElectricityNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter ACC No.']")
	private WebElement AccNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter BIND/BOOK No.']")
	private WebElement BookNoBtn;
	
	@FindBy(xpath="//select[@name='electrictyConsumerNo']")
	private WebElement ElectricityConsumerNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Building Plan Approval No.']")
	private WebElement BuildingApprovalNoBtn;

	@FindBy(xpath="//input[@name='bpApprovalDate']")
	private WebElement BuildingApprovalDateBtn;
	
	@FindBy(xpath="//input[@placeholder='Water Consumer No.']")
	private WebElement WaterConsumerNoBtn;
	
	@FindBy(xpath="//input[@name='waterConnectionDate']")
	private WebElement WaterConnectionDateBtn;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit3rdPageBtn;
	
	//Fourth Form
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement AddownerBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter owner name']")
	private WebElement OwnerNameBtn;
	
	@FindBy(xpath="//select[@name='gender']")
	private WebElement GenderBtn;
	
	@FindBy(xpath="//input[@name='dob']")
	private WebElement DobBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter guardian name']")
	private WebElement GurdianNameBtn;
	
	@FindBy(xpath="//select[@name='relation']")
	private WebElement RelationBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter mobile no']")
	private WebElement MobileNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter aadhar no.']")
	private WebElement AadharNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter pan no.']")
	private WebElement PanNoBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter email.']")
	private WebElement EmailidBtn;
	
	@FindBy(xpath="//select[@name='isArmedForce']")
	private WebElement ArmedForceBtn;
	
	@FindBy(xpath="//select[@name='isSpeciallyAbled']")
	private WebElement SpeciallyAbled;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit4thBtn;
	
	@FindBy(xpath="//button[normalize-space()='Save & Next']")
	private WebElement SaveNextOwnerBtn;
	
	// Fifth Form fillup
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement AddFloorBtn;
	
	@FindBy(xpath="//select[contains(@name,'floorNo')]")
	private WebElement FloorNoBtn;
	
	@FindBy(xpath="//select[@name='useType']")
	private WebElement UsesTypeBtn;
	
	@FindBy(xpath="//select[@name='occupancyType']")
	private WebElement OccupancyTypeBtn;
	
	@FindBy(xpath="//select[@placeholder='Enter guardian name']")
	private WebElement ConstructionTypeBtn;
	
	@FindBy(xpath="//input[@name='buildupArea']")
	private WebElement BuildUpAreaBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter dateFrom no']")
	private WebElement FromDateBtn;
	
	@FindBy(xpath="//button[contains(@type,'submit')]")
	private WebElement AddFloor;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement Save5thNextBtn;
	
	//Sixth Form Fillup
	
	@FindBy(xpath="//select[@name='zone']")
	private WebElement ZoneBtn;
	
	@FindBy(xpath="//select[@name='mobileTowerStatus']")
	private WebElement MobileTowerBtn;
	
	@FindBy(xpath="//input[@name='mobileTowerArea']")
	private WebElement TotalTowerAreaBtn;
	
	@FindBy(xpath="//input[@placeholder='dd-mm-yyyy']")
	private WebElement TowerInstallationDateBtn;
	
	@FindBy(xpath="//select[@name='hoardingStatus']")
	private WebElement HordingBoardBtn;
	
	@FindBy(xpath="//input[@name='hoardingArea']")
	private WebElement HordingAreaBtn;
	
	@FindBy(xpath="//input[@name='hoardingDate']")
	private WebElement HordingInstallationDateBtn;
	
	@FindBy(xpath="//select[@name='petrolPumpStatus']")
	private WebElement PropertyPetrolPumpBtn;
	
	@FindBy(xpath="//input[@name='petrolPumpArea']")
	private WebElement PetrolPumpAreaBtn;

	@FindBy(xpath="//input[@name='petrolPumpDate']")
	private WebElement PetrolPumpCompletionDateBtn;
	
	@FindBy(xpath="//select[@name='waterHarvestingStatus']")
	private WebElement RainWaterHarvestingBtn;
	
	@FindBy(xpath="//input[@name='waterHarvestingDate']")
	private WebElement WaterHarvestingConstructionDateBtn;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Save6thNextBtn;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit6thNextBtn;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement SubmitFinalBtn;
	
//	@FindBy(xpath="//div[@class='cursor-pointer text-center']")
	
	
	
	public WebElement getSubmitFinalBtn() {
				return SubmitFinalBtn;
	}

	public WebElement getSubmit6thNextBtn() {
		return Submit6thNextBtn;
	}

	public WebElement getZoneBtn() {
		return ZoneBtn;
	}

	public WebElement getMobileTowerBtn() {
		return MobileTowerBtn;
	}

	public WebElement getTotalTowerAreaBtn() {
		return TotalTowerAreaBtn;
	}

	public WebElement getTowerInstallationDateBtn() {
		return TowerInstallationDateBtn;
	}

	public WebElement getHordingBoardBtn() {
		return HordingBoardBtn;
	}

	public WebElement getHordingAreaBtn() {
		return HordingAreaBtn;
	}

	public WebElement getHordingInstallationDateBtn() {
		return HordingInstallationDateBtn;
	}

	public WebElement getPropertyPetrolPumpBtn() {
		return PropertyPetrolPumpBtn;
	}

	public WebElement getPetrolPumpAreaBtn() {
		return PetrolPumpAreaBtn;
	}

	public WebElement getPetrolPumpCompletionDateBtn() {
		return PetrolPumpCompletionDateBtn;
	}

	public WebElement getRainWaterHarvestingBtn() {
		return RainWaterHarvestingBtn;
	}

	public WebElement getWaterHarvestingConstructionDateBtn() {
		return WaterHarvestingConstructionDateBtn;
	}

	public WebElement getSave6thNextBtn() {
		return Save6thNextBtn;
	}

	public WebElement getAddFloor() {
		return AddFloor;
	}

	public WebElement getSave5thNextBtn() {
		return Save5thNextBtn;
	}

	public WebElement getFloorNoBtn() {
		return FloorNoBtn;
	}

	public WebElement getUsesTypeBtn() {
		return UsesTypeBtn;
	}

	public WebElement getOccupancyTypeBtn() {
		return OccupancyTypeBtn;
	}

	public WebElement getConstructionTypeBtn() {
		return ConstructionTypeBtn;
	}

	public WebElement getBuildUpAreaBtn() {
		return BuildUpAreaBtn;
	}

	public WebElement getFromDateBtn() {
		return FromDateBtn;
	}

	public WebElement getAddFloorBtn() {
		return AddFloorBtn;
	}

	public WebElement getSaveNextOwnerBtn() {
		return SaveNextOwnerBtn;
	}

	public WebElement getGurdianNameBtn() {
		return GurdianNameBtn;
	}

	public WebElement getAddownerBtn() {
		return AddownerBtn;
	}

	public WebElement getOwnerNameBtn() {
		return OwnerNameBtn;
	}
	

	public WebElement getGenderBtn() {
		return GenderBtn;
	}

	public WebElement getDobBtn() {
		return DobBtn;
	}

	public WebElement getRelationBtn() {
		return RelationBtn;
	}

	public WebElement getMobileNoBtn() {
		return MobileNoBtn;
	}

	public WebElement getAadharNoBtn() {
		return AadharNoBtn;
	}

	public WebElement getPanNoBtn() {
		return PanNoBtn;
	}

	public WebElement getEmailidBtn() {
		return EmailidBtn;
	}

	public WebElement getArmedForceBtn() {
		return ArmedForceBtn;
	}

	public WebElement getSpeciallyAbled() {
		return SpeciallyAbled;
	}

	public WebElement getSubmit4thBtn() {
		return Submit4thBtn;
	}

	public Apply(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getApplybtn() {
		return Applybtn;
	}

	public WebElement getApplyNewAssismentbtn() {
		return ApplyNewAssismentbtn;
	}
	
	public WebElement getWardNobtn() {
		return WardNobtn;
	}

	
	public WebElement getOwnerShipbtn() {
		return OwnerShipbtn;
	}

	public WebElement getPropertyTypebtn() {
		return PropertyTypebtn;
	}

	public WebElement getSaveAndNextbtn() {
		return SaveAndNextbtn;
	}

	public WebElement getNewWardNobtn() {
		return NewWardNobtn;
	}

	public WebElement getKhataNoBtn() {
		return KhataNoBtn;
	}

	public WebElement getPlotNoBtn() {
		return PlotNoBtn;
	}

	public WebElement getVillageBtn() {
		return VillageBtn;
	}

	public WebElement getAreaofPlotBtn() {
		return AreaofPlotBtn;
	}

	public WebElement getRoadWidthBtn() {
		return RoadWidthBtn;
	}

	public WebElement getPinNoBtn() {
		return PinNoBtn;
	}

	public WebElement getBuildingNoBtn() {
		return BuildingNoBtn;
	}

	public WebElement getStreetNoBtn() {
		return StreetNoBtn;
	}

	public WebElement getLocationBtn() {
		return LocationBtn;
	}

	public WebElement getLandmarkBtn() {
		return LandmarkBtn;
	}

	public WebElement getPropertyAddressBtn() {
		return PropertyAddressBtn;
	}

	public WebElement getCheckboxBtn() {
		return CheckboxBtn;
	}

	public WebElement getSubmit2ndPageBtn() {
		return Submit2ndPageBtn;
	}

	public WebElement getElectricityNoBtn() {
		return ElectricityNoBtn;
	}

	public WebElement getAccNoBtn() {
		return AccNoBtn;
	}

	public WebElement getBookNoBtn() {
		return BookNoBtn;
	}

	public WebElement getElectricityConsumerNoBtn() {
		return ElectricityConsumerNoBtn;
	}

	public WebElement getBuildingApprovalNoBtn() {
		return BuildingApprovalNoBtn;
	}

	public WebElement getBuildingApprovalDateBtn() {
		return BuildingApprovalDateBtn;
	}
	
	public WebElement getSubmit3rdPageBtn() {
		return Submit3rdPageBtn;
	}

	public WebElement getWaterConsumerNoBtn() {
		return WaterConsumerNoBtn;
	}

	public WebElement getWaterConnectionDateBtn() {
		return WaterConnectionDateBtn;
	}
	
	
}
