package maritimeutility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ConfigReader {

	Properties pro;

	public ConfigReader()

	{

		try {
			File src = new File("./ConfigurationMaritime/Config.property");

			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);
		}

		catch (Exception e) {

			System.out.println("Exception is ==" + e.getMessage());

		}

	}

	// =================Driver Configuration Reader===================//

	public String getChromePath() {
		String path = pro.getProperty("ChromeDriver");

		return path;
	}

	public String getIEPath() {
		String path = pro.getProperty("IEDriver");

		return path;
	}

	public String getFireFoxPath() {
		String path = pro.getProperty("FireFoxDriver");

		return path;

	}

	public String getEdgePath() {
		String path = pro.getProperty("EdgeDriver");

		return path;

	}

//=================Maritime General Configuration Reader===================//	

//=================Boarding Card=======================//

	public String getSTGURLVM()

	{

		return pro.getProperty("STGURLVM");

	}

	public String getSTGURLFM()

	{

		return pro.getProperty("STGURLFM");
	}

	public String getSTGVMUNAdmin()

	{

		return pro.getProperty("STGVMUNAdmin");

	}

	public String getSTGVMPWAdmin()

	{

		return pro.getProperty("STGVMPWAdmin");

	}

	public String getSTGFMUNAdmin()

	{

		return pro.getProperty("STGFMUNAdmin");

	}

	public String getSTGFMPWAdmin()

	{

		return pro.getProperty("STGFMPWAdmin");

	}

	public String getSTGVMUNSUPERAdmin()

	{

		return pro.getProperty("STGVMUNSUPERAdmin");

	}

	public String getSTGVMPWSUPERAdmin()

	{

		return pro.getProperty("STGVMPWSUPERAdmin");

	}

	public String getSTGFMUNSUPERAdmin()

	{

		return pro.getProperty("STGFMUNSUPERAdmin");

	}

	public String getSTGFMPWSUPERAdmin()

	{

		return pro.getProperty("STGFMPWSUPERAdmin");

	}

	public String getSTGVMUNINPUTFIELDID()

	{

		return pro.getProperty("STGVMUNINPUTFIELDID");

	}

	public String getSTGVMPWINPUTFIELDID()

	{

		return pro.getProperty("STGVMPWINPUTFIELDID");

	}

	public String getSTGVMLOGINBTN()

	{

		return pro.getProperty("STGVMLOGINBTN");

	}

	public String getSTGVMPERSONNELMENU()

	{

		return pro.getProperty("STGVMPERSONNELMENU");

	}

	public String getSTGVMBOARDINGCARDSUBMENU()

	{

		return pro.getProperty("STGVMBOARDINGCARDSUBMENU");

	}

	public String getSTGVMBOARDINGCARDSUBMENUURL()

	{

		return pro.getProperty("STGVMBOARDINGCARDSUBMENUURL");

	}

	public String getSTGVMBoardingCardtext()

	{

		return pro.getProperty("STGVMBoardingCardtext");

	}

	public String getSTGVMSTGVMBoardingCardtextlocator()

	{

		return pro.getProperty("STGVMBoardingCardtextlocator");

	}

	public String getSTGVMFindpersonbycriteriatext()

	{

		return pro.getProperty("STGVMFindpersonbycriteriatext");

	}

	public String getSTGVMFindpersonbycriterialocator()

	{

		return pro.getProperty("STGVMFindpersonbycriterialocator");

	}

	public String getSTGVMFindPersonNametext()

	{

		return pro.getProperty("STGVMFindPersonNametext");

	}

	public String getSTGVMFindPersonNamelocator()

	{

		return pro.getProperty("STGVMFindPersonNamelocator");

	}

	public String getSTGSTGVMFindPersonCardIDtext()

	{

		return pro.getProperty("STGVMFindPersonCardIDtext");

	}

	public String getSTGVMFindPersonCardIDlocator()

	{

		return pro.getProperty("STGVMFindPersonCardIDlocator");

	}

	public String getSTGVMFindPersonNameInputfieldlocator()

	{

		return pro.getProperty("STGVMFindPersonNameInputfieldlocator");

	}

	public String getSTGVMFindPersonCardIDInputfieldlocator()

	{

		return pro.getProperty("STGVMFindPersonCardIDInputfieldlocator");

	}

	public String getSTGVMFindPersonSearchNamelocator()

	{

		return pro.getProperty("STGVMFindPersonSearchNamelocator");

	}

	public String getSTGVMFindPersonSearchCardIDlocator()

	{

		return pro.getProperty("STGVMFindPersonSearchCardIDlocator");

	}

	public String getSTGVMSelectedpersontext()

	{

		return pro.getProperty("STGVMSelectedpersontext");

	}

	public String getSTGVMSelectedpersonlocator()

	{

		return pro.getProperty("STGVMSelectedpersonlocator");

	}

	public String getSTGVMSelectedpersonNametext()

	{

		return pro.getProperty("STGVMSelectedpersonNametext");

	}

	public String getSTGVMSelectedpersonNamelocator()

	{

		return pro.getProperty("STGVMSelectedpersonNamelocator");

	}

	public String getSTGVMSelectedpersonCompanytext()

	{

		return pro.getProperty("STGVMSelectedpersonCompanytext");

	}

	public String getSTGVMSelectedpersonCompanylocator()

	{

		return pro.getProperty("STGVMSelectedpersonCompanylocator");

	}

	public String getSTGVMSelectedpersonPositiontext()

	{

		return pro.getProperty("STGVMSelectedpersonPositiontext");

	}

	public String getSTGVMSelectedpersonPositionlocator()

	{

		return pro.getProperty("STGVMSelectedpersonPositionlocator");

	}

	public String getSTGVMSelectedpersonCategorytext()

	{

		return pro.getProperty("STGVMSelectedpersonCategorytext");

	}

	public String getSTGVMSelectedpersonCategorylocator()

	{

		return pro.getProperty("STGVMSelectedpersonCategorylocator");

	}

	public String getSTGVMSelectedpersonCardIDtext()

	{

		return pro.getProperty("STGVMSelectedpersonCardIDtext");

	}

	public String getSTGVMSelectedpersonCardIDlocator()

	{

		return pro.getProperty("STGVMSelectedpersonCardIDlocator");

	}

	public String getSTGVMSelectedpersonPINtext()

	{

		return pro.getProperty("STGVMSelectedpersonPINtext");

	}

	public String getSTGVMSelectedpersonPINlocator()

	{

		return pro.getProperty("STGVMSelectedpersonPINlocator");

	}

	public String getSTGVMSelectedpersonCardIDInputFieldlocator()

	{

		return pro.getProperty("STGVMSelectedpersonCardIDInputFieldlocator");

	}

	public String getSTGVMTakePictureLocator()

	{

		return pro.getProperty("STGVMTakePictureLocator");

	}

	public String getSTGVMPrintLocator()

	{

		return pro.getProperty("STGVMPrintLocator");

	}

	public String getSTGVMSaveLocator()

	{

		return pro.getProperty("STGVMSaveLocator");

	}

	public String getSTGVMEmptyFieldsLocator()

	{

		return pro.getProperty("STGVMEmptyFieldsLocator");

	}

	public String getSTGVMPreviewCardText()

	{

		return pro.getProperty("STGVMPreviewCardText");

	}

	public String getSTGVMPreviewCardLocator()

	{

		return pro.getProperty("STGVMPreviewCardLocator");

	}

	public String getSTGVMPreviewCardObject()

	{

		return pro.getProperty("STGVMPreviewCardObject");

	}

	// =================Meals and Accommodation=======================//

	public String getSTGVMMASUBMENU()

	{

		return pro.getProperty("STGVMM&ASUBMENU");

	}

	public String getSTGVMMEALSANDACCOMMODATIONSUBMENUURL()

	{

		return pro.getProperty("STGVMMEALSANDACCOMMODATIONSUBMENUURL");

	}

	public String getSTGVMHOMEPAGEREDIRECTION()

	{

		return pro.getProperty("STGVMHOMEPAGEREDIRECTION");

	}

	public String getSTGVMSettingIconlocator()

	{

		return pro.getProperty("STGVMSettingIconlocator");

	}

	public String getSTGVMSetupofmealsandchargestext()

	{

		return pro.getProperty("STGVMSetupofmealsandchargestext");

	}

	public String getSTGVMSetupofmealsandchargesIDlocator()

	{

		return pro.getProperty("STGVMSetupofmealsandchargesIDlocator");

	}

	public String getSTGVMSetupofmealsandchargestext2()

	{

		return pro.getProperty("STGVMSetupofmealsandchargestext2");

	}

	public String getSTGVMSetupofmealsandchargesIDlocator2()

	{

		return pro.getProperty("STGVMSetupofmealsandchargesIDlocator2");

	}

	public String getSTGVMNumberofMealsperdaytext()

	{

		return pro.getProperty("STGVMNumberofMealsperdaytext");

	}

	public String getSTGVMNumberofMealsperdayIDlocator()

	{

		return pro.getProperty("STGVMNumberofMealsperdayIDlocator");

	}

	public String getSTGVMNumberofMealsperdaydropdownlocator()

	{

		return pro.getProperty("STGVMNumberofMealsperdaydropdownlocator");

	}

	public String getSTGVMCurrencytext()

	{

		return pro.getProperty("STGVMCurrencytext");

	}

	public String getSTGVMCurrencyLocator()

	{

		return pro.getProperty("STGVMCurrencyLocator");

	}

	public String getSTGVMCurrencydropdownlocator()

	{

		return pro.getProperty("STGVMCurrencydropdownlocator");

	}

	public String getSTGVMStarttext()

	{

		return pro.getProperty("STGVMStarttext");

	}

	public String getSTGVMStartLocator()

	{

		return pro.getProperty("STGVMStartLocator");

	}

	public String getSTGVMEndtext()

	{

		return pro.getProperty("STGVMEndtext");

	}

	public String getSTGVMEndLocator()

	{

		return pro.getProperty("STGVMEndLocator");

	}

	public String getSTGVMStayingOnboardtext()

	{

		return pro.getProperty("STGVMStayingOnboardtext");

	}

	public String getSTGVMStayingOnboardLocator()

	{

		return pro.getProperty("STGVMStayingOnboardLocator");

	}

	public String getSTGVMifservedasextramealtext()

	{

		return pro.getProperty("STGVMifservedasextramealtext");

	}

	public String getSTGVMifservedasextramealLocator()

	{

		return pro.getProperty("STGVMifservedasextramealLocator");

	}

	public String getSTGVMHowtochargetext()

	{

		return pro.getProperty("STGVMHowtochargetext");

	}

	public String getSTGVMHowtochargeLocator()

	{

		return pro.getProperty("STGVMHowtochargeLocator");

	}

	public String getSTGVMOnechargeincludingbedandmealstext()

	{

		return pro.getProperty("STGVMOnechargeincludingbedandmealstext");

	}

	public String getSTGVMOnechargeincludingbedandmealsLocator()

	{

		return pro.getProperty("STGVMOnechargeincludingbedandmealsLocator");

	}

	public String getSTGVMBedandmealschargedseparatelytext()

	{

		return pro.getProperty("STGVMBedandmealschargedseparatelytext");

	}

	public String getSTGVMBedandmealschargedseparatelyLocator()

	{

		return pro.getProperty("STGVMBedandmealschargedseparatelyLocator");

	}

	public String getSTGVMBedandeachmealchargedseparatelytext()

	{

		return pro.getProperty("STGVMBedandeachmealchargedseparatelytext");

	}

	public String getSTGVMBedandeachmealchargedseparatelyLocator()

	{

		return pro.getProperty("STGVMBedandeachmealchargedseparatelyLocator");

	}

	public String getSTGVMOndayofarrivaltext()

	{

		return pro.getProperty("STGVMOndayofarrivaltext");

	}

	public String getSTGVMOndayofarrivalLocator()

	{

		return pro.getProperty("STGVMOndayofarrivalLocator");

	}

	public String getSTGVMFullchargeindependentofarrivaltimetext()

	{

		return pro.getProperty("STGVMFullchargeindependentofarrivaltimetext");

	}

	public String getSTGVMFullchargeindependentofarrivaltimeLocator()

	{

		return pro.getProperty("STGVMFullchargeindependentofarrivaltimeLocator");

	}

	public String getSTGVMChargeinpercentagetext()

	{

		return pro.getProperty("STGVMChargeinpercentagetext");

	}

	public String getSTGVMChargeinpercentageLocator()

	{

		return pro.getProperty("STGVMChargeinpercentageLocator");

	}

	public String getSTGVMNoChargetext()

	{

		return pro.getProperty("STGVMNoChargetext");

	}

	public String getSTGVMNoChargeLocator()

	{

		return pro.getProperty("STGVMNoChargeLocator");

	}

	public String getSTGVMChargedifarrivingbeforetext()

	{

		return pro.getProperty("STGVMChargedifarrivingbeforetext");

	}

	public String getSTGVMChargedifarrivingbeforeLocator()

	{

		return pro.getProperty("STGVMChargedifarrivingbeforeLocator");

	}

	public String getSTGVMChargedifarrivingbeforeTimeLocator()

	{

		return pro.getProperty("STGVMChargedifarrivingbeforeTimeLocator");

	}

	public String getSTGVMChargedifarrivingbeforeTimeLocator2()

	{

		return pro.getProperty("STGVMChargedifarrivingbeforeTimeLocator2");

	}

	public String getSTGVMMealsonarrivaldaytext()

	{

		return pro.getProperty("STGVMMealsonarrivaldaytext");

	}

	public String getSTGVMMealsonarrivaldayLocator()

	{

		return pro.getProperty("STGVMMealsonarrivaldayLocator");

	}

	public String getSTGVMOnlymealsservedwhenthepersonwasonboardwillbechargedtext()

	{

		return pro.getProperty("STGVMOnlymealsservedwhenthepersonwasonboardwillbechargedtext");

	}

	public String getSTGVMOnlymealsservedwhenthepersonwasonboardwillbechargedLocator()

	{

		return pro.getProperty("STGVMOnlymealsservedwhenthepersonwasonboardwillbechargedLocator");

	}

	public String getSTGVMSTGVMOndayofdeparturetext()

	{

		return pro.getProperty("STGVMOndayofdeparturetext");

	}

	public String getSTGVMOndayofdepartureLocator()

	{

		return pro.getProperty("STGVMOndayofdepartureLocator");

	}

	public String getSTGVMFullchargeindependentofarrivaltimetext2()

	{

		return pro.getProperty("STGVMFullchargeindependentofarrivaltimetext2");

	}

	public String getSTGVMFullchargeindependentofarrivaltimeLocator2()

	{

		return pro.getProperty("STGVMFullchargeindependentofarrivaltimeLocator2");

	}

	public String getSTGVMChargeinpercentagetext2()

	{

		return pro.getProperty("STGVMChargeinpercentagetext2");

	}

	public String getSTGVMChargeinpercentageLocator2()

	{

		return pro.getProperty("STGVMChargeinpercentageLocator2");

	}

	public String getSTGVMNoChargetext2()

	{

		return pro.getProperty("STGVMNoChargetext2");

	}

	public String getSTGVMNoChargeLocator2()

	{

		return pro.getProperty("STGVMNoChargeLocator2");

	}

	public String getSTGVMChargedifarrivingbeforetext2()

	{

		return pro.getProperty("STGVMChargedifarrivingbeforetext2");

	}

	public String getSTGVMChargedifarrivingbeforeLocator2()

	{

		return pro.getProperty("STGVMChargedifarrivingbeforeLocator2");

	}

	public String getSTGVMmayalsobeadjustedmanuallyinsoftwaretext()

	{

		return pro.getProperty("STGVMmayalsobeadjustedmanuallyinsoftwaretext");

	}

	public String getSTGVMmayalsobeadjustedmanuallyinsoftwarelocator()

	{

		return pro.getProperty("STGVMmayalsobeadjustedmanuallyinsoftwarelocator");

	}

	public String getSTGVMMealsonarrivaldeparturedaytext()

	{

		return pro.getProperty("STGVMMealsonarrivaldeparturedaytext");

	}

	public String getSTGVMMealsonarrivaldeparturedayLocator()

	{

		return pro.getProperty("STGVMMealsonarrivaldeparturedayLocator");

	}

	public String getSTGVMSaveMASettingstext()

	{

		return pro.getProperty("STGVMSaveMASettingstext");

	}

	public String getSTGVMSaveMASettingsLocator()

	{

		return pro.getProperty("STGVMSaveMASettingsLocator");

	}

	public String STGVMCancelMASettingstext()

	{

		return pro.getProperty("STGVMCancelMASettingstext");

	}

	public String getSTGVMCancelMASettingsLocator()

	{

		return pro.getProperty("STGVMCancelMASettingsLocator");

	}

	public String getSTGVMCloseiconMASettingsLocator()

	{

		return pro.getProperty("STGVMCloseiconMASettingsLocator");

	}

	public String getSTGVMchargablemealsdropdownlocator()

	{

		return pro.getProperty("STGVMchargablemealsdropdownlocator");

	}

	public String getSTGVMchargablemealsdropdowntext3()

	{

		return pro.getProperty("STGVMchargablemealsdropdowntext3");

	}

	public String getSTGVMchargablemealsdropdownlocator3()

	{

		return pro.getProperty("STGVMchargablemealsdropdownlocator3");

	}

	public String getSTGVMchargablemealsdropdowntext4()

	{

		return pro.getProperty("STGVMchargablemealsdropdowntext4");

	}

	public String getSTGVMchargablemealsdropdownlocator4()

	{

		return pro.getProperty("STGVMchargablemealsdropdownlocator4");

	}

	public String getSTGVMchargablemealsdropdowntext5()

	{

		return pro.getProperty("STGVMchargablemealsdropdowntext5");

	}

	public String getSTGVMchargablemealsdropdownlocator5()

	{

		return pro.getProperty("STGVMchargablemealsdropdownlocator5");

	}

	public String getSTGVMchargablemealsdropdowntext6()

	{

		return pro.getProperty("STGVMchargablemealsdropdowntext6");

	}

	public String getSTGVMchargablemealsdropdownlocator6()

	{

		return pro.getProperty("STGVMchargablemealsdropdownlocator6");

	}

	public String getSTGVMchargablemealsdropdowntext7()

	{

		return pro.getProperty("STGVMchargablemealsdropdowntext7");

	}

	public String getSTGVMchargablemealsdropdownlocator7()

	{

		return pro.getProperty("STGVMchargablemealsdropdownlocator7");

	}

	public String getSTGVMchargablemealsdropdowntext8()

	{

		return pro.getProperty("STGVMchargablemealsdropdowntext8");

	}

	public String getSTGVMchargablemealsdropdownlocator8()

	{

		return pro.getProperty("STGVMchargablemealsdropdownlocator8");

	}

	public String getSTGVMMeal1starthourlocator()

	{

		return pro.getProperty("STGVMMeal1starthourlocator");

	}

	public String getSTGVMMeal1starthour00()

	{

		return pro.getProperty("STGVMMeal1starthour00");

	}

	public String getSTGVMMeal1endhourlocator()

	{

		return pro.getProperty("STGVMMeal1endhourlocator");

	}

	public String getSTGVMMeal2starthourlocator()

	{

		return pro.getProperty("STGVMMeal2starthourlocator");

	}

	public String getSTGVMMeal2starthour00()

	{

		return pro.getProperty("STGVMMeal2starthour00");

	}

	public String getSTGVMMeal2endhourlocator()

	{

		return pro.getProperty("STGVMMeal2endhourlocator");

	}

	public String getSTGVMMeal3starthourlocator()

	{

		return pro.getProperty("STGVMMeal3starthourlocator");

	}

	public String getSTGVMMeal3starthour00()

	{

		return pro.getProperty("STGVMMeal3starthour00");

	}

	public String getSTGVMMeal3endhourlocator()

	{

		return pro.getProperty("STGVMMeal3endhourlocator");

	}

	public String getSTGVMMeal4starthourlocator()

	{

		return pro.getProperty("STGVMMeal4starthourlocator");

	}

	public String getSTGVMMeal4starthour00()

	{

		return pro.getProperty("STGVMMeal4starthour00");

	}

	public String getSTGVMMeal4endhourlocator()

	{

		return pro.getProperty("STGVMMeal4endhourlocator");

	}

	public String getSTGVMMeal5starthourlocator()

	{

		return pro.getProperty("STGVMMeal5starthourlocator");

	}

	public String getSTGVMMeal5starthour00()

	{

		return pro.getProperty("STGVMMeal5starthour00");

	}

	public String getSTGVMMeal5endhourlocator()

	{

		return pro.getProperty("STGVMMeal5endhourlocator");

	}

	public String getSTGVMMeal6starthourlocator()

	{

		return pro.getProperty("STGVMMeal6starthourlocator");

	}

	public String getSTGVMMeal6starthour00()

	{

		return pro.getProperty("STGVMMeal6starthour00");

	}

	public String getSTGVMMeal6endhourlocator()

	{

		return pro.getProperty("STGVMMeal6endhourlocator");

	}

	public String getSTGVMMeal7starthourlocator()

	{

		return pro.getProperty("STGVMMeal7starthourlocator");

	}

	public String getSTGVMMeal7starthour00()

	{

		return pro.getProperty("STGVMMeal7starthour00");

	}

	public String getSTGVMMeal7endhourlocator()

	{

		return pro.getProperty("STGVMMeal7endhourlocator");

	}

	public String getSTGVMMeal8starthourlocator()

	{

		return pro.getProperty("STGVMMeal8starthourlocator");

	}

	public String getSTGVMMeal8starthour00()

	{

		return pro.getProperty("STGVMMeal8starthour00");

	}

	public String getSTGVMMeal8endhourlocator()

	{

		return pro.getProperty("STGVMMeal8endhourlocator");

	}

	public String getSTGVMMeal1startminutelocator()

	{

		return pro.getProperty("STGVMMeal1startminutelocator");

	}

	public String getSTGVMMeal1startminute00()

	{

		return pro.getProperty("STGVMMeal1startminute00");

	}

	public String getSTGVMMeal1endminutelocator()

	{

		return pro.getProperty("STGVMMeal1endminutelocator");

	}

	public String getSTGVMMeal2startminutelocator()

	{

		return pro.getProperty("STGVMMeal2startminutelocator");

	}

	public String getSTGVMMeal2startminute00()

	{

		return pro.getProperty("STGVMMeal2startminute00");

	}

	public String getSTGVMMeal2endminutelocator()

	{

		return pro.getProperty("STGVMMeal2endminutelocator");

	}

	public String getSTGVMMeal3startminutelocator()

	{

		return pro.getProperty("STGVMMeal3startminutelocator");

	}

	public String getSTGVMMeal3startminute00()

	{

		return pro.getProperty("STGVMMeal3startminute00");

	}

	public String getSTGVMMeal3endminutelocator()

	{

		return pro.getProperty("STGVMMeal3endminutelocator");

	}

	public String getSTGVMMeal4startminutelocator()

	{

		return pro.getProperty("STGVMMeal4startminutelocator");

	}

	public String getSTGVMMeal4startminute00()

	{

		return pro.getProperty("STGVMMeal4startminute00");

	}

	public String getSTGVMMeal4endminutelocator()

	{

		return pro.getProperty("STGVMMeal4endminutelocator");

	}

	public String getSTGVMMeal5startminutelocator()

	{

		return pro.getProperty("STGVMMeal5startminutelocator");

	}

	public String getSTGVMMeal5startminute00()

	{

		return pro.getProperty("STGVMMeal5startminute00");

	}

	public String getSTGVMMeal5endminutelocator()

	{

		return pro.getProperty("STGVMMeal5endminutelocator");

	}

	public String getSTGVMMeal6startminutelocator()

	{

		return pro.getProperty("STGVMMeal6startminutelocator");

	}

	public String getSTGVMMeal6startminute00()

	{

		return pro.getProperty("STGVMMeal6startminute00");

	}

	public String getSTGVMMeal6endminutelocator()

	{

		return pro.getProperty("STGVMMeal6endminutelocator");

	}

	public String getSTGVMMeal7startminutelocator()

	{

		return pro.getProperty("STGVMMeal7startminutelocator");

	}

	public String getSTGVMMeal7startminute00()

	{

		return pro.getProperty("STGVMMeal7startminute00");

	}

	public String getSTGVMMeal7endminutelocator()

	{

		return pro.getProperty("STGVMMeal7endminutelocator");

	}

	public String getSTGVMMeal8startminutelocator()

	{

		return pro.getProperty("STGVMMeal8startminutelocator");

	}

	public String getSTGVMMeal8startminute00()

	{

		return pro.getProperty("STGVMMeal8startminute00");

	}

	public String getSTGVMMeal8endminutelocator()

	{

		return pro.getProperty("STGVMMeal8endminutelocator");

	}

	public String getSTGVMstaying1firstfieldlocator()

	{

		return pro.getProperty("STGVMstaying1firstfieldlocator");

	}

	public String getSTGVMstaying1secondfieldlocator()

	{

		return pro.getProperty("STGVMstaying1secondfieldlocator");

	}

	public String getSTGVMstaying2firstfieldlocator()

	{

		return pro.getProperty("STGVMstaying2firstfieldlocator");

	}

	public String getSTGVMstaying2secondfieldlocator()

	{

		return pro.getProperty("STGVMstaying2secondfieldlocator");

	}

	public String getSTGVMstaying3firstfieldlocator()

	{

		return pro.getProperty("STGVMstaying3firstfieldlocator");

	}

	public String getSTGVMstaying3secondfieldlocator()

	{

		return pro.getProperty("STGVMstaying3secondfieldlocator");

	}

	public String getSTGVMstaying4firstfieldlocator()

	{

		return pro.getProperty("STGVMstaying4firstfieldlocator");

	}

	public String getSTGVMstaying4secondfieldlocator()

	{

		return pro.getProperty("STGVMstaying4secondfieldlocator");

	}

	public String getSTGVMstaying5firstfieldlocator()

	{

		return pro.getProperty("STGVMstaying5firstfieldlocator");

	}

	public String getSTGVMstaying5secondfieldlocator()

	{

		return pro.getProperty("STGVMstaying5secondfieldlocator");

	}

	public String getSTGVMstaying6firstfieldlocator()

	{

		return pro.getProperty("STGVMstaying6firstfieldlocator");

	}

	public String getSTGVMstaying6secondfieldlocator()

	{

		return pro.getProperty("STGVMstaying6secondfieldlocator");

	}

	public String getSTGVMstaying7firstfieldlocator()

	{

		return pro.getProperty("STGVMstaying7firstfieldlocator");

	}

	public String getSTGVMstaying7secondfieldlocator()

	{

		return pro.getProperty("STGVMstaying7secondfieldlocator");

	}

	public String getSTGVMstaying8firstfieldlocator()

	{

		return pro.getProperty("STGVMstaying8firstfieldlocator");

	}

	public String getSTGVMstaying8secondfieldlocator()

	{

		return pro.getProperty("STGVMstaying8secondfieldlocator");

	}

	public String getSTGVMserve1firstfieldlocator()

	{

		return pro.getProperty("STGVMserve1firstfieldlocator");

	}

	public String getSTGVMserve1secondfieldlocator()

	{

		return pro.getProperty("STGVMserve1secondfieldlocator");

	}

	public String getSTGVMserve2firstfieldlocator()

	{

		return pro.getProperty("STGVMserve2firstfieldlocator");

	}

	public String getSTGVMserve2secondfieldlocator()

	{

		return pro.getProperty("STGVMserve2secondfieldlocator");

	}

	public String getSTGVMserve3firstfieldlocator()

	{

		return pro.getProperty("STGVMserve3firstfieldlocator");

	}

	public String getSTGVMserve3secondfieldlocator()

	{

		return pro.getProperty("STGVMserve3secondfieldlocator");

	}

	public String getSTGVMserve4firstfieldlocator()

	{

		return pro.getProperty("STGVMserve4firstfieldlocator");

	}

	public String getSTGVMserve4secondfieldlocator()

	{

		return pro.getProperty("STGVMserve4secondfieldlocator");

	}

	public String getSTGVMserve5firstfieldlocator()

	{

		return pro.getProperty("STGVMserve5firstfieldlocator");

	}

	public String getSTGVMserve5secondfieldlocator()

	{

		return pro.getProperty("STGVMserve5secondfieldlocator");

	}

	public String getSTGVMserve6firstfieldlocator()

	{

		return pro.getProperty("STGVMserve6firstfieldlocator");

	}

	public String getSTGVMserve6secondfieldlocator()

	{

		return pro.getProperty("STGVMserve6secondfieldlocator");

	}

	public String getSTGVMserve7firstfieldlocator()

	{

		return pro.getProperty("STGVMserve7firstfieldlocator");

	}

	public String getSTGVMserve7secondfieldlocator()

	{

		return pro.getProperty("STGVMserve7secondfieldlocator");

	}

	public String getSTGVMserve8firstfieldlocator()

	{

		return pro.getProperty("STGVMserve8firstfieldlocator");

	}

	public String getSTGVMserve8secondfieldlocator()

	{

		return pro.getProperty("STGVMserve8secondfieldlocator");

	}

	public String getSTGVMAccombedchargesfirstfieldlocator()

	{

		return pro.getProperty("STGVMAccombedchargesfirstfieldlocator");

	}

	public String getSTGVMAccombedchargessecondfieldlocator()

	{

		return pro.getProperty("STGVMAccombedchargessecondfieldlocator");

	}

	public String getSTGVMMealsandchargessettingssavenotificationlocator()

	{

		return pro.getProperty("STGVMMealsandchargessettingssavenotificationlocator");

	}

	public String getSTGVMMealsandchargessettingssavenotificationtext()

	{

		return pro.getProperty("STGVMMealsandchargessettingssavenotificationtext");

	}

	public String getSTGVMMealsandchargessettingsoverlapnotificationlocator()

	{

		return pro.getProperty("STGVMMealsandchargessettingsoverlapnotificationlocator");

	}

	public String getSTGVMMealsandchargessettingsoverlapnotificationtext()

	{

		return pro.getProperty("STGVMMealsandchargessettingsoverlapnotificationtext");

	}

	public String getSTGVMMeal4Deletebuttonlocator()

	{

		return pro.getProperty("STGVMMeal4Deletebuttonlocator");

	}

	public String getSTGVMMeal5Deletebuttonlocator()

	{

		return pro.getProperty("STGVMMeal5Deletebuttonlocator");

	}

	public String getSTGVMMeal6Deletebuttonlocator()

	{

		return pro.getProperty("STGVMMeal6Deletebuttonlocator");

	}

	public String getSTGVMMeal7Deletebuttonlocator()

	{

		return pro.getProperty("STGVMMeal7Deletebuttonlocator");

	}

	public String getSTGVMMeal8Deletebuttonlocator()

	{

		return pro.getProperty("STGVMMeal8Deletebuttonlocator");

	}

	public String getSTGVMCurrencyEURlocator()

	{

		return pro.getProperty("STGVMCurrencyEURlocator");

	}

	public String getSTGVMCurrencyUSDlocator()

	{

		return pro.getProperty("STGVMCurrencyUSDlocator");

	}

	public String getSTGVMCurrencyNOKlocator()

	{

		return pro.getProperty("STGVMCurrencyNOKlocator");

	}

	public String getSTGVMCurrencyiconEURMeal1locator()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal1locator");

	}

	public String getSTGVMCurrencyiconEURMeal2locator()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal2locator");

	}

	public String getSTGVMCurrencyiconEURMeal3locator()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal3locator");

	}

	public String getSTGVMCurrencyiconEURMeal4locator()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal4locator");

	}

	public String getSTGVMCurrencyiconEURMeal5locator()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal5locator");

	}

	public String getSTGVMCurrencyiconEURMeal6locator()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal6locator");

	}

	public String getSTGVMCurrencyiconEURMeal7locator()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal7locator");

	}

	public String getSTGVMCurrencyiconEURMeal8locator()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal8locator");

	}

	public String getSTGVMCurrencyiconEURMeal1locator2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal1locator2");

	}

	public String getSTGVMCurrencyiconEURMeal2locator2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal2locator2");

	}

	public String getSTGVMCurrencyiconEURMeal3locator2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal3locator2");

	}

	public String getSTGVMCurrencyiconEURMeal4locator2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal4locator2");

	}

	public String getSTGVMCurrencyiconEURMeal5locator2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal5locator2");

	}

	public String getSTGVMCurrencyiconEURMeal6locator2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal6locator2");

	}

	public String getSTGVMCurrencyiconEURMeal7locator2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal7locator2");

	}

	public String getSTGVMCurrencyiconEURMeal8locator2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal8locator2");

	}

	public String getSTGVMCurrencyiconUSDMeal1locator()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal1locator");

	}

	public String getSTGVMCurrencyiconUSDMeal2locator()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal2locator");

	}

	public String getSTGVMCurrencyiconUSDMeal3locator()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal3locator");

	}

	public String getSTGVMCurrencyiconUSDMeal4locator()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal4locator");

	}

	public String getSTGVMCurrencyiconUSDMeal5locator()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal5locator");

	}

	public String getSTGVMCurrencyiconUSDMeal6locator()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal6locator");

	}

	public String getSTGVMCurrencyiconUSDMeal7locator()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal7locator");

	}

	public String getSTGVMCurrencyiconUSDMeal8locator()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal8locator");

	}

	public String getSTGVMCurrencyiconUSDMeal1locator2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal1locator2");

	}

	public String getSTGVMCurrencyiconUSDMeal2locator2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal2locator2");

	}

	public String getSTGVMCurrencyiconUSDMeal3locator2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal3locator2");

	}

	public String getSTGVMCurrencyiconUSDMeal4locator2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal4locator2");

	}

	public String getSTGVMCurrencyiconUSDMeal5locator2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal5locator2");

	}

	public String getSTGVMCurrencyiconUSDMeal6locator2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal6locator2");

	}

	public String getSTGVMCurrencyiconUSDMeal7locator2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal7locator2");

	}

	public String getSTGVMCurrencyiconUSDMeal8locator2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal8locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal1locator()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal1locator");

	}

	public String getSTGVMCurrencyiconNOKMeal2locator()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal2locator");

	}

	public String getSTGVMCurrencyiconNOKMeal3locator()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal3locator");

	}

	public String getSTGVMCurrencyiconNOKMeal4locator()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal4locator");

	}

	public String getSTGVMCurrencyiconNOKMeal5locator()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal5locator");

	}

	public String getSTGVMCurrencyiconNOKMeal6locator()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal6locator");

	}

	public String getSTGVMCurrencyiconNOKMeal7locator()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal7locator");

	}

	public String getSTGVMCurrencyiconNOKMeal8locator()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal8locator");

	}

	public String getSTGVMCurrencyiconNOKMeal1text()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal1text");

	}

	public String getSTGVMCurrencyiconNOKMeal2text()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal2text");

	}

	public String getSTGVMCurrencyiconNOKMeal3text()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal3text");

	}

	public String getSTGVMCurrencyiconNOKMeal4text()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal4text");

	}

	public String getSTGVMCurrencyiconNOKMeal5text()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal5text");

	}

	public String getSTGVMCurrencyiconNOKMeal6text()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal6text");

	}

	public String getSTGVMCurrencyiconNOKMeal7text()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal7text");

	}

	public String getSTGVMCurrencyiconNOKMeal8text()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal8text");

	}

	public String getSTGVMCurrencyiconNOKMeal1locator2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal1locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal2locator2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal2locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal3locator2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal3locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal4locator2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal4locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal5locator2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal5locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal6locator2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal6locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal7locator2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal7locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal8locator2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal8locator2");

	}

	public String getSTGVMCurrencyiconNOKMeal1text2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal1text2");

	}

	public String getSTGVMCurrencyiconNOKMeal2text2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal2text2");

	}

	public String getSTGVMCurrencyiconNOKMeal3text2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal3text2");

	}

	public String getSTGVMCurrencyiconNOKMeal4text2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal4text2");

	}

	public String getSTGVMCurrencyiconNOKMeal5text2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal5text2");

	}

	public String getSTGVMCurrencyiconNOKMeal6text2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal6text2");

	}

	public String getSTGVMCurrencyiconNOKMeal7text2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal7text2");

	}

	public String getSTGVMCurrencyiconNOKMeal8text2()

	{

		return pro.getProperty("STGVMCurrencyiconNOKMeal8text2");

	}

	public String getSTGVMCurrencyiconEURMeal1text()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal1text");

	}

	public String getSTGVMCurrencyiconEURMeal2text()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal2text");

	}

	public String getSTGVMCurrencyiconEURMeal3text()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal3text");

	}

	public String getSTGVMCurrencyiconEURMeal4text()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal4text");

	}

	public String getSTGVMCurrencyiconEURMeal5text()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal5text");

	}

	public String getSTGVMCurrencyiconEURMeal6text()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal6text");

	}

	public String getSTGVMCurrencyiconEURMeal7text()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal7text");

	}

	public String getSTGVMCurrencyiconEURMeal8text()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal8text");

	}

	public String getSTGVMCurrencyiconEURMeal1text2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal1text2");

	}

	public String getSTGVMCurrencyiconEURMeal2text2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal2text2");

	}

	public String getSTGVMCurrencyiconEURMeal3text2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal3text2");

	}

	public String getSTGVMCurrencyiconEURMeal4text2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal4text2");

	}

	public String getSTGVMCurrencyiconEURMeal5text2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal5text2");

	}

	public String getSTGVMCurrencyiconEURMeal6text2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal6text2");

	}

	public String getSTGVMCurrencyiconEURMeal7text2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal7text2");

	}

	public String getSTGVMCurrencyiconEURMeal8text2()

	{

		return pro.getProperty("STGVMCurrencyiconEURMeal8text2");

	}

	public String getSTGVMCurrencyiconUSDMeal1text()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal1text");

	}

	public String getSTGVMCurrencyiconUSDMeal2text()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal2text");

	}

	public String getSTGVMCurrencyiconUSDMeal3text()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal3text");

	}

	public String getSTGVMCurrencyiconUSDMeal4text()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal4text");

	}

	public String getSTGVMCurrencyiconUSDMeal5text()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal5text");

	}

	public String getSTGVMCurrencyiconUSDMeal6text()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal6text");

	}

	public String getSTGVMCurrencyiconUSDMeal7text()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal7text");

	}

	public String getSTGVMCurrencyiconUSDMeal8text()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal8text");

	}

	public String getSTGVMCurrencyiconUSDMeal1text2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal1text2");

	}

	public String getSTGVMCurrencyiconUSDMeal2text2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal2text2");

	}

	public String getSTGVMCurrencyiconUSDMeal3text2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal3text2");

	}

	public String getSTGVMCurrencyiconUSDMeal4text2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal4text2");

	}

	public String getSTGVMCurrencyiconUSDMeal5text2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal5text2");

	}

	public String getSTGVMCurrencyiconUSDMeal6text2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal6text2");

	}

	public String getSTGVMCurrencyiconUSDMeal7text2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal7text2");

	}

	public String getSTGVMCurrencyiconUSDMeal8text2()

	{

		return pro.getProperty("STGVMCurrencyiconUSDMeal8text2");

	}

	public String getSTGSTGVMMeal1endhour00()

	{

		return pro.getProperty("STGVMMeal1endhour00");

	}

	public String getSTGSTGVMMeal1endminute00()

	{

		return pro.getProperty("STGVMMeal1endminute00");

	}

	public String getSTGSTGVMMeal2endhour00()

	{

		return pro.getProperty("STGVMMeal2endhour00");

	}

	public String getSTGSTGVMMeal2endminute00()

	{

		return pro.getProperty("STGVMMeal2endminute00");

	}

	public String getSTGSTGVMMeal3endhour00()

	{

		return pro.getProperty("STGVMMeal3endhour00");

	}

	public String getSTGSTGVMMeal3endminute00()

	{

		return pro.getProperty("STGVMMeal3endminute00");

	}

	public String getSTGVMMeal1startinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal1startinputfieldlocator");

	}

	public String getSTGVMMeal1endinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal1endinputfieldlocator");

	}

	public String getSTGVMMeal2startinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal2startinputfieldlocator");
	}

	public String getSTGVMMeal2endinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal2endinputfieldlocator");
	}

	public String getSTGVMMeal3startinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal3startinputfieldlocator");
	}

	public String getSTGVMMeal3endinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal3endinputfieldlocator");
	}

	public String getSTGVMMeal4startinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal4startinputfieldlocator");
	}

	public String getSTGVMMeal4endinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal4endinputfieldlocator");
	}

	public String getSTGVMMeal5startinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal5startinputfieldlocator");
	}

	public String getSTGVMMeal5endinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal5endinputfieldlocator");
	}

	public String getSTGVMMeal6startinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal6startinputfieldlocator");
	}

	public String getSTGVMMeal6endinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal6endinputfieldlocator");
	}

	public String getSTGVMMeal7startinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal7startinputfieldlocator");
	}

	public String getSTGVMMeal7endinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal7endinputfieldlocator");
	}

	public String getSTGVMMeal8startinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal8startinputfieldlocator");
	}

	public String getSTGVMMeal8endinputfieldlocator()

	{

		return pro.getProperty("STGVMMeal8endinputfieldlocator");
	}

	public String getSTGVMOneChargeincludingbedandmealsradio()

	{

		return pro.getProperty("STGVMOneChargeincludingbedandmealsradio");
	}

	public String getSTGVMBedandmealschargedseparatelyradio()

	{

		return pro.getProperty("STGVMBedandmealschargedseparatelyradio");
	}

	public String getSTGVMBedandeachmealchargedseparatelyradio()

	{

		return pro.getProperty("STGVMBedandeachmealchargedseparatelyradio");
	}

	public String getSTGVMFullchargeindependentofarrivaltimeradio()

	{

		return pro.getProperty("STGVMFullchargeindependentofarrivaltimeradio");
	}

	public String getSTGVMChargeinpercentageradio()

	{

		return pro.getProperty("STGVMChargeinpercentageradio");
	}

	public String getSTGVMNoChargeradio()

	{

		return pro.getProperty("STGVMNoChargeradio");
	}

	public String getSTGVMChargedifarrivingbeforeradio()

	{

		return pro.getProperty("STGVMChargedifarrivingbeforeradio");
	}

	public String getSTGVMOnlymealsservedwhenthepersonwasonboardwillbechargedcheck()

	{

		return pro.getProperty("STGVMOnlymealsservedwhenthepersonwasonboardwillbechargedcheck");
	}

	public String getSTGVMFullchargeindependentofdeparturetime2radio()

	{

		return pro.getProperty("STGVMFullchargeindependentofdeparturetime2radio");
	}

	public String getSTGVMChargepercentage2radio()

	{

		return pro.getProperty("STGVMChargepercentage2radio");
	}

	public String getSTGVMNoCharge2radio()

	{

		return pro.getProperty("STGVMNoCharge2radio");
	}

	public String getSTGVMChargedifarrivingbefore2radio()

	{

		return pro.getProperty("STGVMChargedifarrivingbefore2radio");
	}

	public String getSTGVMPeriodInputfield()

	{

		return pro.getProperty("STGVMPeriodInputfield");
	}

	public String getSTGVMSubmitbuttonreportdisplay()

	{

		return pro.getProperty("STGVMSubmitbuttonreportdisplay");
	}

	public String getSTGVMPeriodApplybuttonlocator()

	{

		return pro.getProperty("STGVMPeriodApplybuttonlocator");
	}

	public String getSTGVMDoyouwantoproceeddeletinglocator()

	{

		return pro.getProperty("STGVMDoyouwantoproceeddeletinglocator");
	}

	public String getSTGVMDoyouwantoproceeddeletingtext()

	{

		return pro.getProperty("STGVMDoyouwantoproceeddeletingtext");
	}

	public String getSTGVMwillbedeletedYes()

	{

		return pro.getProperty("STGVMwillbedeletedYes");
	}

	public String getSTGVMPersonnelInfodropdown()

	{

		return pro.getProperty("STGVMPersonnelInfodropdown");
	}

	public String getSTGVMPersonnelInfodropdown2()

	{

		return pro.getProperty("STGVMPersonnelInfodropdown2");
	}

	public String getSTGVMAddExtrachargeicon()

	{

		return pro.getProperty("STGVMAddExtrachargeicon");

	}

	public String getSTGVMAddExtrachargeicon2()

	{

		return pro.getProperty("STGVMAddExtrachargeicon2");
	}

	public String getSTGVMNoCharge1()

	{

		return pro.getProperty("STGVMNoCharge1");
	}

	public String getSTGVMNoCharge2()

	{

		return pro.getProperty("STGVMNoCharge2");
	}

	public String getSTGVMChargepercentage3radio()

	{

		return pro.getProperty("STGVMChargepercentage3radio");

	}

	public String getSTGVMChargedifdepartingafter()

	{

		return pro.getProperty("STGVMChargedifdepartingafter");

	}

	public String getSTGVMCompanyinputfield()

	{

		return pro.getProperty("STGVMCompanyinputfield");

	}

	public String getSTGVMChargeinpercentageradio2()

	{

		return pro.getProperty("STGVMChargeinpercentageradio2");
	}

	public String getSTGVMChargeinpercentageradio3()

	{

		return pro.getProperty("STGVMChargeinpercentageradio3");
	}

	public String getSTGVMAddExtrachargeDescriptioninputfield2()

	{

		return pro.getProperty("STGVMAddExtrachargeDescriptioninputfield2");
	}

	public String getSTGVMAddExtrachargeDescriptioninputfield1()

	{

		return pro.getProperty("STGVMAddExtrachargeDescriptioninputfield1");
	}

	public String getSTGVMAddExtrachargeDescriptioninputfield3()

	{

		return pro.getProperty("STGVMAddExtrachargeDescriptioninputfield3");
	}

	public String getSTGVMAddExtrachargeDescriptioninputfield4()

	{

		return pro.getProperty("STGVMAddExtrachargeDescriptioninputfield4");
	}

	public String getSTGVMAddExtrachargeDescriptioninputfield5()

	{

		return pro.getProperty("STGVMAddExtrachargeDescriptioninputfield5");
	}

	public String getSTGVMAddExtrachargeDescriptioninputfield6()

	{

		return pro.getProperty("STGVMAddExtrachargeDescriptioninputfield6");
	}

	public String getSTGVMAddExtrachargeDescriptioninputfield7()

	{

		return pro.getProperty("STGVMAddExtrachargeDescriptioninputfield7");
	}

	public String getSTGVMAddExtrachargeDescriptioninputfield8()

	{

		return pro.getProperty("STGVMAddExtrachargeDescriptioninputfield8");
	}

	public String getSTGVMAddExtrachargePriceinputfield1()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield1");
	}

	public String getSTGVMAddExtrachargePriceinputfield2()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield2");
	}

	public String getSTGVMAddExtrachargePriceinputfield3()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield3");
	}

	public String getSTGVMAddExtrachargePriceinputfield4()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield4");
	}

	public String getSTGVMAddExtrachargePriceinputfield5()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield5");
	}

	public String getSTGVMAddExtrachargePriceinputfield6()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield6");
	}

	public String getSTGVMAddExtrachargePriceinputfield7()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield7");
	}

	public String getSTGVMAddExtrachargePriceinputfield8()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield8");
	}

	public String getSTGVMAddExtrachargePriceinputfield9()

	{

		return pro.getProperty("STGVMAddExtrachargePriceinputfield9");
	}

	public String getSTGVMbtnAddExtra()

	{

		return pro.getProperty("STGVMbtnAddExtra");
	}

	public String getSTGVMAddExtrachargeclosebutton1()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton1");
	}

	public String getSTGVMAddExtrachargeclosebutton2()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton2");
	}

	public String getSTGVMAddExtrachargeclosebutton3()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton3");
	}

	public String getSTGVMAddExtrachargeclosebutton4()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton4");
	}

	public String getSTGVMAddExtrachargeclosebutton5()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton5");
	}

	public String getSTGVMAddExtrachargeclosebutton6()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton6");
	}

	public String getSTGVMAddExtrachargeclosebutton7()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton7");
	}

	public String getSTGVMAddExtrachargeclosebutton8()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton8");
	}

	public String getSTGVMAddExtrachargeclosebutton9()

	{

		return pro.getProperty("STGVMAddExtrachargeclosebutton9");
	}

	public String getSTGVMAddExtrachargeSavechangesbtn()

	{

		return pro.getProperty("STGVMAddExtrachargeSavechangesbtn");
	}

	public String getSTGVMAddExtrachargeClosebtn()

	{

		return pro.getProperty("STGVMAddExtrachargeClosebtn");
	}

	public String getSTGVMAddExtrachargeCloseicon()

	{

		return pro.getProperty("STGVMAddExtrachargeCloseicon");
	}

	public String getSTGVMHOMEredirect()

	{

		return pro.getProperty("STGVMHOMEredirect");
	}

	public String getSTGVMSymbitCompany()

	{

		return pro.getProperty("STGVMSymbitCompany");
	}

	public String getSTGVMSymbittext()

	{

		return pro.getProperty("STGVMSymbittext");
	}

	public String getSTGVMAB12Company()

	{

		return pro.getProperty("STGVMAB12Company");
	}

	public String getSTGVMAB12Companytext()

	{

		return pro.getProperty("STGVMAB12Companytext");
	}

	public String getSTGVMShipadminCompany()

	{

		return pro.getProperty("STGVMShipadminCompany");
	}

	public String getSTGVMShipadminCompanytext()

	{

		return pro.getProperty("STGVMShipadminCompanytext");
	}

	public String getSTGVMShipadminCompany2()

	{

		return pro.getProperty("STGVMShipadminCompany2");
	}

	public String getSTGVMAB12Company2()

	{

		return pro.getProperty("STGVMAB12Company2");
	}

	public String getSTGVMSymbitCompany2()

	{

		return pro.getProperty("STGVMSymbitCompany2");
	}

	public String getSTGVMCompanyHeadertextC()

	{

		return pro.getProperty("STGVMCompanyHeadertextC");
	}

	public String getSTGVMCompanyHeaderC()

	{

		return pro.getProperty("STGVMCompanyHeaderC");
	}

	public String getSTGVMMealsHeaderC()

	{

		return pro.getProperty("STGVMMealsHeaderC");
	}

	public String getSTGVMMealsHeadertextC()

	{

		return pro.getProperty("STGVMMealsHeadertextC");
	}

	public String getSTGVMChargeHeaderC()

	{

		return pro.getProperty("STGVMChargeHeaderC");
	}

	public String getSTGVMMealsChargetextC()

	{

		return pro.getProperty("STGVMMealsChargetextC");

	}

	public String getSTGVMExtraChargesC()

	{

		return pro.getProperty("STGVMExtraChargesC");
	}

	public String getSTGVMMealsExtraChargestextC()

	{

		return pro.getProperty("STGVMMealsExtraChargestextC");

	}

	public String getSTGVMTotalC()

	{

		return pro.getProperty("STGVMTotalC");
	}

	public String getSTGVMMealsTotaltextC()

	{

		return pro.getProperty("STGVMMealsTotaltextC");

	}

	public String getSTGVMIncludePersonsontheReportcheckbox()

	{

		return pro.getProperty("STGVMIncludePersonsontheReportcheckbox");

	}

	public String getSTGVMDisplayonlypersonswithmealsandaccommodation()

	{

		return pro.getProperty("STGVMDisplayonlypersonswithmealsandaccommodation");

	}

	public String getSTGVMNameP()

	{

		return pro.getProperty("STGVMNameP");

	}

	public String getSTGVMNametextP()

	{

		return pro.getProperty("STGVMNametextP");

	}

	public String getSTGVMDaysP()

	{

		return pro.getProperty("STGVMDaysP");

	}

	public String getSTGVMDaystextP()

	{

		return pro.getProperty("STGVMDaystextP");

	}

	public String getSTGVMPositionP()

	{

		return pro.getProperty("STGVMPositionP");

	}

	public String getSTGVMPositiontextP()

	{

		return pro.getProperty("STGVMPositiontextP");

	}

	public String getSTGVMNicoleGNametext()

	{

		return pro.getProperty("STGVMNicoleGNametext");

	}

	public String getSTGVMNicoleGName()

	{

		return pro.getProperty("STGVMNicoleGName");

	}

	public String getSTGVMNicoleGMealsIcon()

	{

		return pro.getProperty("STGVMNicoleGMealsIcon");

	}

	public String getSTGVMNicoleGPosition()

	{

		return pro.getProperty("STGVMNicoleGPosition");

	}

	public String getSTGVMNicoleGPositiontext()

	{

		return pro.getProperty("STGVMNicoleGPositiontext");

	}

	public String getSTGVMNicoleGCompany()

	{

		return pro.getProperty("STGVMNicoleGCompany");

	}

	public String getSTGVMNicoleGCompanytext()

	{

		return pro.getProperty("STGVMNicoleGCompanytext");

	}

	public String getSTGVMNicoleGDays()

	{

		return pro.getProperty("STGVMNicoleGDays");

	}

	public String getSTGVMNicoleGDaystext()

	{

		return pro.getProperty("STGVMNicoleGDaystext");

	}

	public String getSTGVMHeavenGNametext()

	{

		return pro.getProperty("STGVMHeavenGNametext");

	}

	public String getSTGVMHeavenGName()

	{

		return pro.getProperty("STGVMHeavenGName");

	}

	public String getSTGVMHeavenGMealsIcon()

	{

		return pro.getProperty("STGVMHeavenGMealsIcon");

	}

	public String getSTGVMHeavenGPosition()

	{

		return pro.getProperty("STGVMHeavenGPosition");

	}

	public String getSTGVMHeavenGPositiontext()

	{

		return pro.getProperty("STGVMHeavenGPositiontext");

	}

	public String getSTGVMHeavenGCompany()

	{

		return pro.getProperty("STGVMHeavenGCompany");

	}

	public String getSTGVMHeavenGCompanytext()

	{

		return pro.getProperty("STGVMHeavenGCompanytext");

	}

	public String getSTGVMHeavenGDays()

	{

		return pro.getProperty("STGVMHeavenGDays");

	}

	public String getSTGVMHeavenGDaystext()

	{

		return pro.getProperty("STGVMHeavenGDaystext");

	}

	public String getSTGVMLianGNametext()

	{

		return pro.getProperty("STGVMLianGNametext");

	}

	public String getSTGVMLianGName()

	{

		return pro.getProperty("STGVMLianGName");

	}

	public String getSTGVMLianGMealsIcon()

	{

		return pro.getProperty("STGVMLianGMealsIcon");

	}

	public String getSTGVMLianGPosition()

	{

		return pro.getProperty("STGVMLianGPosition");

	}

	public String getSTGVMLianGPositiontext()

	{

		return pro.getProperty("STGVMLianGPositiontext");

	}

	public String getSTGVMLianGCompany()

	{

		return pro.getProperty("STGVMLianGCompany");

	}

	public String getSTGVMLianGCompanytext()

	{

		return pro.getProperty("STGVMLianGCompanytext");

	}

	public String getSTGVMLianGDays()

	{

		return pro.getProperty("STGVMLianGDays");

	}

	public String getSTGVMLianGDaystext()

	{

		return pro.getProperty("STGVMLianGDaystext");

	}

//// New for 18.10 release		

	public String getSTGVMEXTRAMealtabID()

	{

		return pro.getProperty("STGVMEXTRAMealtabID");

	}

	public String getSTGVMEXTRAMealIconSept18ID()

	{

		return pro.getProperty("STGVMEXTRAMealIconSept18ID");

	}

	public String getSTGVMEXTRAMeal1Sept18()

	{

		return pro.getProperty("STGVMEXTRAMeal1Sept18");

	}

	public String getSTGVMReportsmodule()

	{

		return pro.getProperty("STGVMReportsmodule");

	}

	public String getSTGVMReportsurl()

	{

		return pro.getProperty("STGVMReportsurl");

	}

	public String getSTGVMNorwegianReportid()

	{

		return pro.getProperty("STGVMNorwegianReportid");

	}

	public String getSTGVMNorwegianURL()

	{

		return pro.getProperty("STGVMNorwegianURL");

	}

	public String getSTGVMNorwegianShipstoreid()

	{

		return pro.getProperty("STGVMNorwegianShipstoreid");

	}

	public String getSTGVMNorwegianaddashipstoretab()

	{

		return pro.getProperty("STGVMNorwegianaddashipstoretab");

	}

	public String getSTGVMNorwegianSaveChangesbutton()

	{

		return pro.getProperty("STGVMNorwegianSaveChangesbutton");

	}

	public String getSTGVMNorwegianWasteandResiduesid()

	{

		return pro.getProperty("STGVMNorwegianWasteandResiduesid");

	}

	public String getSTGVMNorwegianDiscardChangesxpath()

	{

		return pro.getProperty("STGVMNorwegianDiscardChangesxpath");

	}

	public String getSTGVMNorwegianPaxtabid()

	{

		return pro.getProperty("STGVMNorwegianPaxtabid");

	}

	public String getSTGVMTransitPassengerorNot()

	{

		return pro.getProperty("STGVMTransitPassengerorNot");

	}

	public String getSTGVMWorkandRestHoursmenuid()

	{

		return pro.getProperty("STGVMWorkandRestHoursmenuid");

	}

	public String getSTGVMWorkandRestHoursNamefieldID()

	{

		return pro.getProperty("STGVMWorkandRestHoursNamefieldID");

	}

	public String getSTGVMWorkandRestHoursNamefield2()

	{

		return pro.getProperty("STGVMWorkandRestHoursNamefield2");

	}

	public String getSTGVMWorkandRestHoursDateofBirthid()

	{

		return pro.getProperty("STGVMWorkandRestHoursDateofBirthid");

	}

	public String getSTGVMWorkandRestHoursSignInButtonID()

	{

		return pro.getProperty("STGVMWorkandRestHoursSignInButtonID");

	}

	public String getSTGVMWorkandRestHoursFormShiftNameid()

	{

		return pro.getProperty("STGVMWorkandRestHoursFormShiftNameid");

	}

	public String getSTGVMWorkandRestHoursNameCrew()

	{

		return pro.getProperty("STGVMWorkandRestHoursNameCrew");

	}

	public String getSTGVMWorkandRestHoursPositionCrew()

	{

		return pro.getProperty("STGVMWorkandRestHoursPositionCrew");

	}

	public String getSTGVMNorwegianCrewtabid()

	{

		return pro.getProperty("STGVMNorwegianCrewtabid");

	}

	public String getSTGVMNorwegianCrewtabSavebuttonid()

	{

		return pro.getProperty("STGVMNorwegianCrewtabSavebuttonid");

	}

	public String getSTGVMNorwegianCrewtabSaveNotification()

	{

		return pro.getProperty("STGVMNorwegianCrewtabSaveNotification");

	}

	public String getSTGVMNorwegianCrewtabSaveNotificationText()

	{

		return pro.getProperty("STGVMNorwegianCrewtabSaveNotificationText");

	}

	public String getSTGVMHSEQMenuid()

	{

		return pro.getProperty("STGVMHSEQMenuid");

	}

	public String getSTGVMEventReportSubMenuid()

	{

		return pro.getProperty("STGVMEventReportSubMenuid");

	}

	public String getSTGFMHSEQMenuid()

	{

		return pro.getProperty("STGFMHSEQMenuid");

	}

	public String getSTGFMEventReportSubMenuid()

	{

		return pro.getProperty("STGFMEventReportSubMenuid");

	}

	public String getSTGVMEventReportURL()

	{

		return pro.getProperty("STGVMEventReportURL");

	}

	public String getSTGFMEventReportURL()

	{

		return pro.getProperty("STGFMEventReportURL");

	}

	public String getSTGVMEventReportRootCauseAnalysischeckbox()

	{

		return pro.getProperty("STGVMEventReportRootCauseAnalysischeckbox");

	}

	public String getSTGFMEventReportYear()

	{

		return pro.getProperty("STGFMEventReportYear");

	}

	public String getSTGFMEventReportMonth()

	{

		return pro.getProperty("STGFMEventReportMonth");

	}

	public String getSTGFMEventReportVessel()

	{

		return pro.getProperty("STGFMEventReportVessel");

	}

	public String getSTGFMEventReportListbutton()

	{

		return pro.getProperty("STGFMEventReportListbutton");

	}

	public String getSTGFMEventReportRootCauseAnalysischeckbox()

	{

		return pro.getProperty("STGFMEventReportRootCauseAnalysischeckbox");

	}

	public String getSTGVMHSEQChemicalLogsubmenu()

	{

		return pro.getProperty("STGVMHSEQChemicalLogsubmenu");

	}

	public String getSTGVMHSEQChemicalLogRegisterTab()

	{

		return pro.getProperty("STGVMHSEQChemicalLogRegisterTab");

	}

	public String getSTGVMHSEQChemicalLogRegisternewchemicalbutton()

	{

		return pro.getProperty("STGVMHSEQChemicalLogRegisternewchemicalbutton");

	}

	public String getSTGVMHSEQChemicalLogRegisternewchemicalCategory()

	{

		return pro.getProperty("STGVMHSEQChemicalLogRegisternewchemicalCategory");

	}

	public String getSTGVMHSEQChemicalLogRegisterBrandNameInputfeild()

	{

		return pro.getProperty("STGVMHSEQChemicalLogRegisterBrandNameInputfeild");

	}

	public String getSTGVMHSEQChemicalLogRegisterIMDGInputfeild()

	{

		return pro.getProperty("STGVMHSEQChemicalLogRegisterIMDGInputfeild");

	}

	public String getSTGVMHSEQChemicalLogRegisterUNInputfeild()

	{

		return pro.getProperty("STGVMHSEQChemicalLogRegisterUNInputfeild");

	}

	public String getSTGVMHSEQChemicalLogRegisterSavebutton()

	{

		return pro.getProperty("STGVMHSEQChemicalLogRegisterSavebutton");

	}

	public String getSTGVMHSEQChemicalLogNewlyRegister()

	{

		return pro.getProperty("STGVMHSEQChemicalLogNewlyRegister");

	}

	public String getSTGVMHSEQChemicalLogUploadButton()

	{

		return pro.getProperty("STGVMHSEQChemicalLogUploadButton");

	}

	public String getSTGVMEventReportCaseNumber()

	{

		return pro.getProperty("STGVMEventReportCaseNumber");

	}

	public String getSTGVMHSEQEventReportWindInfoinputfield()

	{

		return pro.getProperty("STGVMHSEQEventReportWindInfoinputfield");

	}

	public String getSTGVMHSEQEventReportWaveInfoinputfield()

	{

		return pro.getProperty("STGVMHSEQEventReportWaveInfoinputfield");

	}

	public String getSTGVMEventReportSavebutton()

	{

		return pro.getProperty("STGVMEventReportSavebutton");

	}

	public String getSTGFMPERSONNELMENU()

	{

		return pro.getProperty("STGFMPERSONNELMENU");

	}

	public String getSTGFMWorkandRestHoursmenuid()

	{

		return pro.getProperty("STGFMWorkandRestHoursmenuid");

	}

	public String getSTGFMHOWARVesselSearch()

	{

		return pro.getProperty("STGFMHOWARVesselSearch");

	}

	public String getSTGFMHOWARVesselSearchInputfield()

	{

		return pro.getProperty("STGFMHOWARVesselSearchInputfield");

	}

	public String getSTGFMHOWARFORM()

	{

		return pro.getProperty("STGFMHOWARFORM");

	}

	public String getSTGFMHoursofWorkin24h()

	{

		return pro.getProperty("STGFMHoursofWorkin24h");

	}

	public String getSTGFMHoursofRestin24h()

	{

		return pro.getProperty("STGFMHoursofRestin24h");

	}

	public String getSTGVMNorwegianDiscardChangestext()

	{

		return pro.getProperty("STGVMNorwegianDiscardChangestext");

	}

	public String getSTGVMNewEventReportbutton()

	{

		return pro.getProperty("STGVMNewEventReportbutton");

	}

	public String getSTGVMEventReportBriefDescription()

	{

		return pro.getProperty("STGVMEventReportBriefDescription");

	}

	public String getSTGVMEventReportUploadedfileDescription()

	{

		return pro.getProperty("STGVMEventReportUploadedfileDescription");

	}

	public String getSTGVMEventReportUploadbutton()

	{

		return pro.getProperty("STGVMEventReportUploadbutton");

	}

	public String getSTGVMEventReportNewEventReportbutton()

	{

		return pro.getProperty("STGVMEventReportNewEventReportbutton");

	}

	public String getSTGVMEventReportUploadedfilenametext()

	{

		return pro.getProperty("STGVMEventReportUploadedfilenametext");

	}

	public String getSTGVMEventReportUploadedfilenamexpath()

	{

		return pro.getProperty("STGVMEventReportUploadedfilenamexpath");

	}

	public String getSTGVMEventReportChoosefilebutton()

	{

		return pro.getProperty("STGVMEventReportChoosefilebutton");

	}

	public String getSTGFMNewEventReportbutton()

	{

		return pro.getProperty("STGFMNewEventReportbutton");

	}

	public String getSTGFMEventReportBriefDescription()

	{

		return pro.getProperty("STGFMEventReportBriefDescription");

	}

	public String getSTGFMEventReportUploadedfileDescription()

	{

		return pro.getProperty("STGFMEventReportUploadedfileDescription");

	}

	public String getSTGFMEventReportUploadbutton()

	{

		return pro.getProperty("STGFMEventReportUploadbutton");

	}

	public String getSTGFMEventReportNewEventReportbutton()

	{

		return pro.getProperty("STGFMEventReportNewEventReportbutton");

	}

	public String getSTGFMEventReportUploadedfilenametext()

	{

		return pro.getProperty("STGFMEventReportUploadedfilenametext");

	}

	public String getSTGFMEventReportUploadedfilenamexpath()

	{

		return pro.getProperty("STGFMEventReportUploadedfilenamexpath");

	}

	public String getSTGFMEventReportChoosefilebutton()

	{

		return pro.getProperty("STGFMEventReportChoosefilebutton");

	}

	public String getSTGFMEventReportSavebutton()

	{

		return pro.getProperty("STGFMEventReportSavebutton");

	}

	public String getSTGFMNewEventTimeofEvent()

	{

		return pro.getProperty("STGFMNewEventTimeofEvent");

	}

	public String getSTGFMNewEventDescriptionofevent()

	{

		return pro.getProperty("STGFMNewEventDescriptionofevent");

	}

	public String getSTGFMNewEventImmediateCause()

	{

		return pro.getProperty("STGFMNewEventImmediateCause");

	}

	public String getSTGFMNewEventImmediateactionstaken()

	{

		return pro.getProperty("STGFMNewEventImmediateactionstaken");

	}

	public String getSTGFMNewEventRootcausefactors()

	{

		return pro.getProperty("STGFMNewEventRootcausefactors");

	}

	public String getSTGFMNewEventSystemdeficiencypreventive()

	{

		return pro.getProperty("STGFMNewEventSystemdeficiencypreventive");

	}

	public String getSTGFMNewEventClosingComments()

	{

		return pro.getProperty("STGFMNewEventClosingComments");

	}

	public String getSTGVMNewEventTimeofEvent()

	{

		return pro.getProperty("STGVMNewEventTimeofEvent");

	}

	public String getSTGVMNewEventDescriptionofevent()

	{

		return pro.getProperty("STGVMNewEventDescriptionofevent");

	}

	public String getSTGVMNewEventImmediateCause()

	{

		return pro.getProperty("STGVMNewEventImmediateCause");

	}

	public String getSTGVMNewEventImmediateactionstaken()

	{

		return pro.getProperty("STGVMNewEventImmediateactionstaken");

	}

	public String getSTGVMNewEventRootcausefactors()

	{

		return pro.getProperty("STGVMNewEventRootcausefactors");

	}

	public String getSTGVMNewEventSystemdeficiencypreventive()

	{

		return pro.getProperty("STGVFMNewEventSystemdeficiencypreventive");

	}

	public String getSTGVMNewEventClosingComments()

	{

		return pro.getProperty("STGVMNewEventClosingComments");

	}

//------Demo Site------//

	public String getSTGURLDEMOVM()

	{

		return pro.getProperty("STGURLDEMOVM");

	}

	public String getSTGURLDEMOFM()

	{

		return pro.getProperty("STGURLDEMOFM");

	}

	public String getSTGURLDEMOVMUN()

	{

		return pro.getProperty("STGURLDEMOVMUN");

	}

	public String getSTGURLDEMOVMPW()

	{

		return pro.getProperty("STGURLDEMOVMPW");

	}

	public String getSTGURLDEMOFMUN()

	{

		return pro.getProperty("STGURLDEMOFMUN");

	}

	public String getSTGURLDEMOFMPW()

	{

		return pro.getProperty("STGURLDEMOFMPW");

	}

	public String getSTGURLDEMOVMUNinputfield()

	{

		return pro.getProperty("STGURLDEMOVMUNinputfield");

	}

	public String getSTGURLDEMOVMPWinputfield()

	{

		return pro.getProperty("STGURLDEMOVMPWinputfield");

	}

	public String getSTGSTGVMLOGINBTN()

	{

		return pro.getProperty("STGVMLOGINBTN");

	}

	public String getSTGURLDEMOFMUNinputfield()

	{

		return pro.getProperty("STGURLDEMOFMUNinputfield");

	}

	public String getSTGURLDEMOFMPWinputfield()

	{

		return pro.getProperty("STGURLDEMOFMPWinputfield");

	}

	public String getSTGFMLOGINBTN()

	{

		return pro.getProperty("STGFMLOGINBTN");

	}

	public String getSTGActivitiesMenuID()

	{

		return pro.getProperty("STGActivitiesMenuID");

	}

	public String getSTGDailyFiguresID()

	{

		return pro.getProperty("STGDailyFiguresID");

	}

	public String getSTGRunningHourstabID()

	{

		return pro.getProperty("STGRunningHourstabID");

	}

	public String getSTGDailyFiguresSAveButton()

	{

		return pro.getProperty("STGDailyFiguresSAveButton");

	}

	public String getSTGREceivedDeliveredtabID()

	{

		return pro.getProperty("STGREceivedDeliveredtabID");

	}

	public String getSTGMGORadioButtonID()

	{

		return pro.getProperty("STGMGORadioButtonID");

	}

	public String getSTGLNGRadioButtonID()

	{

		return pro.getProperty("STGLNGRadioButtonID");

	}

	public String getSTGUreaRadioButtonID()

	{

		return pro.getProperty("STGUreaRadioButtonID");

	}

	public String getSTGFreshRadioButtonID()

	{

		return pro.getProperty("STGFreshRadioButtonID");

	}

	public String getSTGOilRadioButtonID()

	{

		return pro.getProperty("STGOilRadioButtonID");

	}

	public String getSTGGreaseRadioButtonID()

	{

		return pro.getProperty("STGGreaseRadioButtonID");

	}

	public String getSTGSelectActionID()

	{

		return pro.getProperty("STGSelectActionID");

	}

	public String getSTGReceivedDeliveredChooseFile()

	{

		return pro.getProperty("STGReceivedDeliveredChooseFile");

	}

	public String getSTGReceivedDeliveredUploadbutton()

	{

		return pro.getProperty("STGReceivedDeliveredUploadbutton");

	}

	public String getSTGReceivedDeliveredQuantityfield()

	{

		return pro.getProperty("STGReceivedDeliveredQuantityfield");

	}

	public String getSTGReceivedDeliveredQuantityLocation()

	{

		return pro.getProperty("STGReceivedDeliveredQuantityLocation");

	}

	public String getSTGReceivedDeliveredTime()

	{

		return pro.getProperty("STGReceivedDeliveredTime");

	}

	public String getSTGReceivedDeliveredPaidBy()

	{

		return pro.getProperty("STGReceivedDeliveredPaidBy");

	}

	public String getSTGReceivedDeliveredSaveButton()

	{

		return pro.getProperty("STGReceivedDeliveredSaveButton");

	}

	public String getSTGSaveButtonMGO()

	{

		return pro.getProperty("STGSaveButtonMGO");

	}

	public String getSTGSaveButtonLNG()

	{

		return pro.getProperty("STGSaveButtonLNG");

	}

	public String getSTGSaveButtonUrea()

	{

		return pro.getProperty("STGSaveButtonUrea");

	}

	public String getSTGSaveButtonFreshWater()

	{

		return pro.getProperty("STGSaveButtonFreshWater");

	}

	public String getSTGSaveButtonOil()

	{

		return pro.getProperty("STGSaveButtonOil");

	}

	public String getSTGSaveButtonGrease()

	{

		return pro.getProperty("STGSaveButtonGrease");

	}

	public String getSTGTabMGO()

	{

		return pro.getProperty("STGTabMGO");

	}

	public String getSTGTabLNG()

	{

		return pro.getProperty("STGTabLNG");

	}

	public String getSTGTabUrea()

	{

		return pro.getProperty("STGTabUrea");

	}

	public String getSTGTabFreshWater()

	{

		return pro.getProperty("STGTabFreshWater");

	}

	public String getSTGTabOil()

	{

		return pro.getProperty("STGTabOil");

	}

	public String getSTGTabGrease()

	{

		return pro.getProperty("STGTabGrease");

	}

	public String getSTGROBTodayInputMGO()

	{

		return pro.getProperty("STGROBTodayInputMGO");

	}

	public String getSTGROBTodayInputLNG()

	{

		return pro.getProperty("STGROBTodayInputLNG");

	}

	public String getSTGROBTodayInputUrea()

	{

		return pro.getProperty("STGROBTodayInputUrea");

	}

	public String getSTGROBTodayInputFreshWater()

	{

		return pro.getProperty("STGROBTodayInputFreshWater");

	}

	public String getSTGROBYesterdayInputOil()

	{

		return pro.getProperty("STGROBYesterdayInputOil");

	}

	public String getSTGROBYesterdayInputGrease()

	{

		return pro.getProperty("STGROBYesterdayInputGrease");

	}

	public String getSTGVMHSEQChemicalLogDeckEnginetab()

	{

		return pro.getProperty("STGVMHSEQChemicalLogDeckEnginetab");

	}

	public String getSTGVMHSEQChemicalLogDeckEngineEditIcon()

	{

		return pro.getProperty("STGVMHSEQChemicalLogDeckEngineEditIcon");

	}

	public String getSTGVMHSEQChemicalLogQuantityInputfield()

	{

		return pro.getProperty("STGVMHSEQChemicalLogQuantityInputfield");

	}

	public String getSTGVMHSEQChemicalLogUpdatebutton()

	{

		return pro.getProperty("STGVMHSEQChemicalLogUpdatebutton");

	}

	public String getSTGVMEventReportTypeofEventFilter()

	{

		return pro.getProperty("STGVMEventReportTypeofEventFilter");

	}

	public String getSTGDrillsMenu()

	{

		return pro.getProperty("STGDrillsMenu");

	}

	public String getSTGNewDrillButton()

	{

		return pro.getProperty("STGNewDrillButton");

	}

	public String getSTGDrillNameInputField()

	{

		return pro.getProperty("STGDrillNameInputField");

	}

	public String getSTGDrillPositiondropdown()

	{

		return pro.getProperty("STGDrillPositiondropdown");

	}

	public String getSTGDrillDescriptionInputField()

	{

		return pro.getProperty("STGDrillDescriptionInputField");

	}

	public String getSTGDrillAddDate()

	{

		return pro.getProperty("STGDrillAddDate");

	}

	public String getSTGDrillSaveandClosebutton()

	{

		return pro.getProperty("STGDrillSaveandClosebutton");

	}

	public String getSTGVMGarbageLogsubmenuLocator()

	{

		return pro.getProperty("STGVMGarbageLogsubmenuLocator");

	}

	public String getSTGVMGarbageLogNormalDropdown()

	{

		return pro.getProperty("STGVMGarbageLogNormalDropdown");

	}

	public String getSTGVMGarbageLogDateCalendar1()

	{

		return pro.getProperty("STGVMGarbageLogDateCalendar1");

	}

	public String getSTGVMGarbageLogDateCalendar2()

	{

		return pro.getProperty("STGVMGarbageLogDateCalendar2");

	}

	public String getSTGVMGarbageLogDateCalendar3()

	{

		return pro.getProperty("STGVMGarbageLogDateCalendar3");

	}

	public String getSTGVMGarbageLogDateCalendar4()

	{

		return pro.getProperty("STGVMGarbageLogDateCalendar4");

	}

	public String getSTGVMGarbageLogDateCalendar5()

	{

		return pro.getProperty("STGVMGarbageLogDateCalendar5");

	}

	public String getSTGVMGarbageLogDateCalendar6()

	{

		return pro.getProperty("STGVMGarbageLogDateCalendar6");

	}

	public String getSTGVMGarbageLogDateCalendar7()

	{

		return pro.getProperty("STGVMGarbageLogDateCalendar7");

	}

	public String getSTGVMGarbageLogDateCalendar8()

	{

		return pro.getProperty("STGVMGarbageLogDateCalendar8");

	}

	public String getSTGVMGarbageLogTime1()

	{

		return pro.getProperty("STGVMGarbageLogTime1");

	}

	public String getSTGVMGarbageLogTime2()

	{

		return pro.getProperty("STGVMGarbageLogTime2");

	}

	public String getSTGVMGarbageLogTime3()

	{

		return pro.getProperty("STGVMGarbageLogTime3");

	}

	public String getSTGVMGarbageLogTime4()

	{

		return pro.getProperty("STGVMGarbageLogTime4");

	}

	public String getSTGVMGarbageLogInitialInput()

	{

		return pro.getProperty("STGVMGarbageLogInitialInput");

	}

	public String getSTGVMGarbageLogInitialInput2()

	{

		return pro.getProperty("STGVMGarbageLogInitialInput2");

	}

	public String getSTGVMGarbageLogInitialInput3()

	{

		return pro.getProperty("STGVMGarbageLogInitialInput3");

	}

	public String getSTGVMGarbageLogRemarks()

	{

		return pro.getProperty("STGVMGarbageLogRemarks");

	}

	public String getSTGVMGarbageLogRemarks2()

	{

		return pro.getProperty("STGVMGarbageLogRemarks2");
	}

	public String getSTGVMGarbageLogRemarks3()

	{

		return pro.getProperty("STGVMGarbageLogRemarks3");

	}

	public String getSTGVMTransfertoGarbageLogButton()

	{

		return pro.getProperty("STGVMTransfertoGarbageLogButton");

	}

	public String getSTGVMGarbagelogAccidentalLossRadioBtn()

	{

		return pro.getProperty("STGVMGarbagelogAccidentalLossRadioBtn");

	}

	public String getSTGVMGarbagelogAccidentalLossDate1()

	{

		return pro.getProperty("STGVMGarbagelogAccidentalLossDate1");

	}

	public String getSTGVMGarbagelogAccidentalLossDate2()

	{

		return pro.getProperty("STGVMGarbagelogAccidentalLossDate2");

	}

	public String getSTGVMGarbagelogAccidentalLossTime()

	{

		return pro.getProperty("STGVMGarbagelogAccidentalLossTime");

	}

	public String getSTGVMGarbagelogAccidentalLossRemarks()

	{

		return pro.getProperty("STGVMGarbagelogAccidentalLossRemarks");

	}

	public String getSTGVMGarbagelogAccidentalLossInitials()

	{

		return pro.getProperty("STGVMGarbagelogAccidentalLossInitials");

	}

	public String getSTGSettings()

	{

		return pro.getProperty("STGSettings");

	}

	public String getSTGSettingsConfig()

	{

		return pro.getProperty("STGSettingsConfig");

	}

	public String getSTGSettingsConfigDateandTime()

	{

		return pro.getProperty("STGSettingsConfigDateandTime");

	}

	public String getSTGDropdownlistradiobutton()

	{

		return pro.getProperty("STGDropdownlistradiobutton");

	}

	public String getSTGMealsLogo() {

		return pro.getProperty("STGMealsLogo");

	}

	public String getSTGVMMASUBMENUxpath()

	{

		return pro.getProperty("STGVMMASUBMENUxpath");

	}

	public String getSTGHelpmenu()

	{

		return pro.getProperty("STGHelpmenu");

	}

	public String getSTGAboutshipadmiMenu()

	{

		return pro.getProperty("STGAboutshipadmiMenu");

	}

//=================Screenshots Configuration Reader===================//		

	public static void captureScreesnhot(WebDriver driver, String screenshotName) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("./Screesnhots/" + screenshotName + ".png"));

			System.out.println("Screenshot Taken Shipadmin Test Instance");

		}

		catch (Exception e) {

			System.out.println("Exception while taking Screenshot" + e.getMessage());

		}

	}
}
