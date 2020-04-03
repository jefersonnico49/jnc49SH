package maritimeconfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Maritimeobjectrepo {

	public void testConfig() throws Exception {

		File src = new File("./ConfigurationMaritime/Config.property");

		FileInputStream fis = new FileInputStream(src);

		Properties pro = new Properties();

		pro.load(fis);

		// =================Driver Object Repository======================//

		String chromepath = pro.getProperty("ChromeDriver");

		System.out.println("Hey Chrome Path is ===" + chromepath);

		String IEpath = pro.getProperty("IEDriver");

		System.out.println("Hey IE Path is ===" + IEpath);

		String FireFoxpath = pro.getProperty("FireFoxDriver");

		System.out.println("Hey Firefox Path is ===" + FireFoxpath);

		String Edgepath = pro.getProperty("EdgeDriver");

		System.out.println("Hey Edge Path is ===" + Edgepath);

		// =================Maritime General Object Repository===================//

		// =================Boarding Card=======================//

		pro.getProperty("STGURLVM");
		pro.getProperty("STGURLVM");

		pro.getProperty("STGVMUNAdmin");
		pro.getProperty("STGVMPWAdmin");
		pro.getProperty("STGFMUNAdmin");
		pro.getProperty("STGFMPWAdmin");

		pro.getProperty("STGVMUNSUPERAdmin");
		pro.getProperty("STGVMPWSUPERAdmin");
		pro.getProperty("STGFMUNSUPERAdmin");
		pro.getProperty("STGFMPWSUPERAdmin");

		pro.getProperty("STGVMUNINPUTFIELDID");
		pro.getProperty("STGVMPWINPUTFIELDID");
		pro.getProperty("STGVMLOGINBTN");

		pro.getProperty("STGVMPERSONNELMENU");
		pro.getProperty("STGVMBOARDINGCARDSUBMENU");
		pro.getProperty("STGVMBOARDINGCARDSUBMENUURL");
		pro.getProperty("STGVMBoardingCardtextlocator");
		pro.getProperty("STGVMFindpersonbycriteriatext");
		pro.getProperty("STGVMFindpersonbycriterialocator");
		pro.getProperty("STGVMFindPersonNametext");
		pro.getProperty("STGVMFindPersonNamelocator");
		pro.getProperty("STGVMFindPersonCardIDtext");
		pro.getProperty("STGVMFindPersonCardIDlocator");
		pro.getProperty("STGVMFindPersonNameInputfieldlocator");
		pro.getProperty("STGVMFindPersonCardIDInputfieldlocator");
		pro.getProperty("STGVMFindPersonSearchNamelocator");
		pro.getProperty("STGVMFindPersonSearchCardIDlocator");
		pro.getProperty("STGVMSelectedpersontext");
		pro.getProperty("STGVMSelectedpersonlocator");
		pro.getProperty("STGVMSelectedpersonNametext");
		pro.getProperty("STGVMSelectedpersonNamelocator");

		pro.getProperty("STGVMSelectedpersonCompanytext");
		pro.getProperty("STGVMSelectedpersonCompanylocator");
		pro.getProperty("STGVMSelectedpersonPositiontext");
		pro.getProperty("STGVMSelectedpersonPositionlocator");
		pro.getProperty("STGVMSelectedpersonCategorytext");
		pro.getProperty("STGVMSelectedpersonCategorylocator");
		pro.getProperty("STGVMSelectedpersonCardIDtext");
		pro.getProperty("STGVMSelectedpersonCardIDlocator");
		pro.getProperty("STGVMSelectedpersonPINtext");
		pro.getProperty("STGVMSelectedpersonPINlocator");
		pro.getProperty("STGVMSelectedpersonCardIDInputFieldlocator");
		pro.getProperty("STGVMTakePictureLocator");
		pro.getProperty("STGVMPrintLocator");
		pro.getProperty("STGVMSaveLocator");
		pro.getProperty("STGVMEmptyFieldsLocator");
		pro.getProperty("STGVMPreviewCardText");
		pro.getProperty("STGVMPreviewCardLocator");
		pro.getProperty("STGVMPreviewCardObject");

		// =================Meals and Accommodation=======================//

		pro.getProperty("STGVMM&ASUBMENU");
		pro.getProperty("STGVMMEALSANDACCOMMODATIONSUBMENUURL");
		pro.getProperty("STGVMSettingIconlocator");
		pro.getProperty("STGVMSetupofmealsandchargestext");
		pro.getProperty("STGVMSetupofmealsandchargesIDlocator");
		pro.getProperty("STGVMSetupofmealsandchargestext2");
		pro.getProperty("STGVMSetupofmealsandchargesIDlocator2");
		pro.getProperty("STGVMNumberofMealsperdaytext");
		pro.getProperty("STGVMNumberofMealsperdayIDlocator");
		pro.getProperty("STGVMNumberofMealsperdaydropdownlocator");
		pro.getProperty("STGVMCurrencytext");
		pro.getProperty("STGVMCurrencyLocator");
		pro.getProperty("STGVMCurrencydropdownlocator");

		pro.getProperty("STGVMStarttext");
		pro.getProperty("STGVMStartLocator");
		pro.getProperty("STGVMEndtext");
		pro.getProperty("STGVMEndLocator");
		pro.getProperty("STGVMStayingOnboardtext");
		pro.getProperty("STGVMStayingOnboardLocator");
		pro.getProperty("STGVMifservedasextramealtext");
		pro.getProperty("STGVMifservedasextramealLocator");

		pro.getProperty("STGVMHowtochargetext");
		pro.getProperty("STGVMHowtochargeLocator");
		pro.getProperty("STGVMOnechargeincludingbedandmealstext");
		pro.getProperty("STGVMOnechargeincludingbedandmealsLocator");
		pro.getProperty("STGVMBedandmealschargedseparatelytext");
		pro.getProperty("STGVMBedandmealschargedseparatelyLocator");
		pro.getProperty("STGVMBedandeachmealchargedseparatelytext");
		pro.getProperty("STGVMBedandeachmealchargedseparatelyLocator");
		pro.getProperty("STGVMOndayofarrivaltext");
		pro.getProperty("STGVMOndayofarrivalLocator");
		pro.getProperty("STGVMFullchargeindependentofarrivaltimetext");
		pro.getProperty("STGVMFullchargeindependentofarrivaltimeLocator");
		pro.getProperty("STGVMChargeinpercentagetext");
		pro.getProperty("STGVMChargeinpercentageLocator");
		pro.getProperty("STGVMNoChargetext=");
		pro.getProperty("STGVMNoChargeLocator");
		pro.getProperty("STGVMChargedifarrivingbeforetext");
		pro.getProperty("STGVMChargedifarrivingbeforeLocator");
		pro.getProperty("STGVMChargedifarrivingbeforeTimeLocator");
		pro.getProperty("STGVMMealsonarrivaldaytext");
		pro.getProperty("STGVMMealsonarrivaldayLocator");
		pro.getProperty("STGVMOnlymealsservedwhenthepersonwasonboardwillbechargedtext");
		pro.getProperty("STGVMOnlymealsservedwhenthepersonwasonboardwillbechargedLocator");
		pro.getProperty("STGVMMealsondeparturedaytext");
		pro.getProperty("STGVMMealsondeparturedayLocator");
		pro.getProperty("STGVMFullchargeindependentofarrivaltimetext2");
		pro.getProperty("STGVMFullchargeindependentofarrivaltimeLocator2");
		pro.getProperty("STGVMChargeinpercentagetext2");
		pro.getProperty("STGVMChargeinpercentageLocator2");
		pro.getProperty("STGVMNoChargetext2");
		pro.getProperty("STGVMNoChargeLocator2");
		pro.getProperty("STGVMChargedifarrivingbeforetext2");
		pro.getProperty("STGVMChargedifarrivingbeforeLocator2");
		pro.getProperty("STGVMmayalsobeadjustedmanuallyinsoftwaretext");
		pro.getProperty("STGVMmayalsobeadjustedmanuallyinsoftwarelocator");

		pro.getProperty("STGVMchargablemealsdropdowntext3");
		pro.getProperty("STGVMchargablemealsdropdownlocator3");
		pro.getProperty("STGVMchargablemealsdropdowntext4");
		pro.getProperty("STGVMchargablemealsdropdownlocator4");
		pro.getProperty("STGVMchargablemealsdropdowntext5");
		pro.getProperty("STGVMchargablemealsdropdownlocator5");
		pro.getProperty("STGVMchargablemealsdropdowntext6");
		pro.getProperty("STGVMchargablemealsdropdownlocator6");
		pro.getProperty("STGVMchargablemealsdropdowntext7");
		pro.getProperty("STGVMchargablemealsdropdownlocator7");
		pro.getProperty("STGVMchargablemealsdropdowntext8");
		pro.getProperty("STGVMchargablemealsdropdownlocator8");
		pro.getProperty("STGVMchargablemealsdropdownlocator");

		pro.getProperty("STGVMMeal1starthourlocator");
		pro.getProperty("STGVMMeal1starthour00");
		pro.getProperty("STGVMMeal1startminutelocator");
		pro.getProperty("STGVMMeal1startminute00");
		pro.getProperty("STGVMMeal2starthourlocator");
		pro.getProperty("STGVMMeal2starthour00");
		pro.getProperty("STGVMMeal2startminutelocator");
		pro.getProperty("STGVMMeal2startminute00");
		pro.getProperty("STGVMMeal3starthourlocator");
		pro.getProperty("STGVMMeal3starthour00");
		pro.getProperty("STGVMMeal3startminutelocator");
		pro.getProperty("STGVMMeal3startminute00");

		pro.getProperty("STGVMserve1firstfieldlocator");
		pro.getProperty("STGVMserve1secondfieldlocator");
		pro.getProperty("STGVMserve2firstfieldlocator");
		pro.getProperty("STGVMserve2secondfieldlocator");
		pro.getProperty("STGVMserve3firstfieldlocator");
		pro.getProperty("STGVMserve3secondfieldlocator");
		pro.getProperty("STGVMserve4firstfieldlocator");
		pro.getProperty("STGVMserve4secondfieldlocator");
		pro.getProperty("STGVMserve5firstfieldlocator");
		pro.getProperty("STGVMserve5secondfieldlocator");
		pro.getProperty("STGVMserve6firstfieldlocator");
		pro.getProperty("STGVMserve6secondfieldlocator");
		pro.getProperty("STGVMserve7firstfieldlocator");
		pro.getProperty("STGVMserve7secondfieldlocator");
		pro.getProperty("STGVMserve8firstfieldlocator");
		pro.getProperty("STGVMserve8secondfieldlocator");

		pro.getProperty("STGVMserve1firstfieldlocator");
		pro.getProperty("STGVMserve1secondfieldlocator");
		pro.getProperty("STGVMserve2firstfieldlocator");
		pro.getProperty("STGVMserve2secondfieldlocator");
		pro.getProperty("STGVMserve3firstfieldlocator");
		pro.getProperty("STGVMserve3secondfieldlocator");
		pro.getProperty("STGVMserve4firstfieldlocator");
		pro.getProperty("STGVMserve4firstfieldlocator");
		pro.getProperty("STGVMserve5firstfieldlocator");
		pro.getProperty("STGVMserve5firstfieldlocator");
		pro.getProperty("STGVMserve6firstfieldlocator");
		pro.getProperty("STGVMserve6firstfieldlocator");
		pro.getProperty("STGVMserve7firstfieldlocator");
		pro.getProperty("STGVMserve7firstfieldlocator");
		pro.getProperty("STGVMserve8firstfieldlocator");
		pro.getProperty("STGVMserve8firstfieldlocator");

		pro.getProperty("STGVMAccombedchargesfirstfieldlocator");
		pro.getProperty("STGVMAccombedchargessecondfieldlocator");

		pro.getProperty("STGVMMealsandchargessettingssavenotificationlocator");
		pro.getProperty("STGVMMealsandchargessettingssavenotificationtext");

		pro.getProperty("STGVMMealsandchargessettingsoverlapnotificationlocator");
		pro.getProperty("STGVMMealsandchargessettingsoverlapnotificationtext");

		pro.getProperty("STGVMMeal4Deletebuttonlocator");
		pro.getProperty("STGVMMeal5Deletebuttonlocator");
		pro.getProperty("STGVMMeal6Deletebuttonlocator");
		pro.getProperty("STGVMMeal7Deletebuttonlocator");
		pro.getProperty("STGVMMeal8Deletebuttonlocator");

		pro.getProperty("STGVMCurrencyEURlocator");
		pro.getProperty("STGVMCurrencyUSDlocator");
		pro.getProperty("STGVMCurrencyNOKlocator");

		pro.getProperty("STGVMReportsmodule");

		//// New for 18.10 release

		pro.getProperty("STGVMEXTRAMealtabID");

		pro.getProperty("STGVMEXTRAMealIconSept18ID");

		pro.getProperty("STGVMEXTRAMeal1Sept18");

		pro.getProperty("STGVMReportsurl");

		pro.getProperty("STGVMNorwegianReportid");

		pro.getProperty("STGVMNorwegianURL");

		pro.getProperty("STGVMNorwegianShipstoreid");

		pro.getProperty("STGVMNorwegianaddashipstoretab");

		pro.getProperty("STGVMNorwegianSaveChangesbutton");

		pro.getProperty("STGVMNorwegianWasteandResiduesid");

		pro.getProperty("STGVMNorwegianDiscardChangesxpath");

		pro.getProperty("STGVMNorwegianPaxtabid");

		pro.getProperty("STGVMTransitPassengerorNot");

		pro.getProperty("STGVMWorkandRestHoursmenuid");

		pro.getProperty("STGVMWorkandRestHoursNamefieldID");

		pro.getProperty("STGVMWorkandRestHoursNamefield2");

		pro.getProperty("STGVMWorkandRestHoursDateofBirthid");

		pro.getProperty("STGVMWorkandRestHoursSignInButtonID");

		pro.getProperty("STGVMWorkandRestHoursFormShiftNameid");

		pro.getProperty("STGVMWorkandRestHoursNameCrew");

		pro.getProperty("STGVMWorkandRestHoursPositionCrew");

		pro.getProperty("STGVMNorwegianCrewtabid");

		pro.getProperty("STGVMNorwegianCrewtabSavebuttonid");

		pro.getProperty("STGVMNorwegianCrewtabSaveNotification");

		pro.getProperty("STGVMNorwegianCrewtabSaveNotificationText");

		pro.getProperty("STGVMHSEQMenuid");

		pro.getProperty("STGVMEventReportSubMenuid");

		pro.getProperty("STGFMHSEQMenuid");

		pro.getProperty("STGFMEventReportSubMenuid");

		pro.getProperty("STGVMEventReportURL");

		pro.getProperty("STGFMEventReportURL");

		pro.getProperty("STGVMEventReportRootCauseAnalysischeckbox");

		pro.getProperty("STGFMEventReportYear");

		pro.getProperty("STGFMEventReportMonth");

		pro.getProperty("STGFMEventReportVessel");

		pro.getProperty("STGFMEventReportListbutton");

		pro.getProperty("STGFMEventReportRootCauseAnalysischeckbox");

		pro.getProperty("STGVMHSEQChemicalLogsubmenu");

		pro.getProperty("STGVMHSEQChemicalLogRegisterTab");

		pro.getProperty("STGVMHSEQChemicalLogRegisternewchemicalbutton");

		pro.getProperty("STGVMHSEQChemicalLogRegisternewchemicalCategory");

		pro.getProperty("STGVMHSEQChemicalLogRegisterBrandNameInputfeild");

		pro.getProperty("STGVMHSEQChemicalLogRegisterIMDGInputfeild");

		pro.getProperty("STGVMHSEQChemicalLogRegisterUNInputfeild");

		pro.getProperty("STGVMHSEQChemicalLogRegisterSavebutton");

		pro.getProperty("STGVMHSEQChemicalLogNewlyRegister");

		pro.getProperty("STGVMHSEQChemicalLogUploadButton");

		pro.getProperty("STGVMEventReportCaseNumber");

		pro.getProperty("STGVMHSEQEventReportWindInfoinputfield");

		pro.getProperty("STGVMHSEQEventReportWaveInfoinputfield");

		pro.getProperty("STGVMEventReportSavebutton");

		pro.getProperty("STGFMPERSONNELMENU");

		pro.getProperty("STGFMWorkandRestHoursmenuid");

		pro.getProperty("STGFMHOWARVesselSearch");

		pro.getProperty("STGFMHOWARVesselSearchInputfield");

		pro.getProperty("STGFMHOWARFORM");

		pro.getProperty("STGFMHoursofWorkin24h");

		pro.getProperty("STGFMHoursofRestin24h");

		pro.getProperty("STGVMNorwegianDiscardChangestext");

		pro.getProperty("STGVMNewEventReportbutton");
		pro.getProperty("STGVMEventReportBriefDescription");
		pro.getProperty("STGVMEventReportChoosefilebutton");
		pro.getProperty("STGVMEventReportUploadedfileDescription");
		pro.getProperty("STGVMEventReportUploadbutton");
		pro.getProperty("STGVMEventReportNewEventReportbutton");
		pro.getProperty("STGVMEventReportUploadedfilenametext");
		pro.getProperty("STGVMEventReportUploadedfilenamexpath");

		pro.getProperty("STGFMNewEventReportbutton");
		pro.getProperty("STGFMEventReportBriefDescription");
		pro.getProperty("STGFMEventReportChoosefilebutton");
		pro.getProperty("STGFMEventReportUploadedfileDescription");
		pro.getProperty("STGFMEventReportUploadbutton");
		pro.getProperty("STGFMEventReportNewEventReportbutton");
		pro.getProperty("STGFMEventReportUploadedfilenametext");
		pro.getProperty("STGFMEventReportUploadedfilenamexpath");
		pro.getProperty("STGFMEventReportSavebutton");

		pro.getProperty("STGFMNewEventTimeofEvent");
		pro.getProperty("STGFMNewEventDescriptionofevent");
		pro.getProperty("STGFMNewEventImmediateCause");
		pro.getProperty("STGFMNewEventImmediateactionstaken");
		pro.getProperty("STGFMNewEventRootcausefactors");
		pro.getProperty("STGFMNewEventSystemdeficiencypreventive");
		pro.getProperty("STGFMNewEventClosingComments");

		pro.getProperty("STGVMNewEventTimeofEvent");
		pro.getProperty("STGVMNewEventDescriptionofevent");
		pro.getProperty("STGVMNewEventImmediateCause");
		pro.getProperty("STGVMNewEventImmediateactionstaken");
		pro.getProperty("STGVMNewEventRootcausefactors");
		pro.getProperty("STGVMNewEventSystemdeficiencypreventive");
		pro.getProperty("STGVMNewEventClosingComments");

		// ------Demo Site------//

		pro.getProperty("STGURLDEMOVM");
		pro.getProperty("STGURLDEMOFM");
		pro.getProperty("STGURLDEMOVMUN");
		pro.getProperty("STGURLDEMOVMPW");
		pro.getProperty("STGURLDEMOFMUN");
		pro.getProperty("STGURLDEMOFMPW");
		pro.getProperty("STGURLDEMOVMUNinputfield");
		pro.getProperty("STGURLDEMOVMPWinputfield");
		pro.getProperty("STGVMLOGINBTN");
		pro.getProperty("STGURLDEMOFMUNinputfield");
		pro.getProperty("STGURLDEMOFMPWinputfield");
		pro.getProperty("STGFMLOGINBTN");

		pro.getProperty("STGActivitiesMenuID");
		pro.getProperty("STGDailyFiguresID");
		pro.getProperty("STGRunningHourstabID");
		pro.getProperty("STGDailyFiguresSAveButton");

		pro.getProperty("STGREceivedDeliveredtabID");
		pro.getProperty("STGMGORadioButtonID");
		pro.getProperty("STGLNGRadioButtonID");
		pro.getProperty("STGUreaRadioButtonID");
		pro.getProperty("STGFreshRadioButtonID");
		pro.getProperty("STGOilRadioButtonID");
		pro.getProperty("STGGreaseRadioButtonID");

		pro.getProperty("STGSelectActionID");
		pro.getProperty("STGReceivedDeliveredChooseFile");
		pro.getProperty("STGReceivedDeliveredUploadbutton");

		pro.getProperty("STGReceivedDeliveredQuantityfield");
		pro.getProperty("STGReceivedDeliveredQuantityLocation");
		pro.getProperty("STGReceivedDeliveredTime");
		pro.getProperty("STGReceivedDeliveredPaidBy");
		pro.getProperty("STGReceivedDeliveredSaveButton");

		pro.getProperty("STGSaveButtonMGO");
		pro.getProperty("STGSaveButtonLNG");
		pro.getProperty("STGSaveButtonUrea");
		pro.getProperty("STGSaveButtonFreshWater");
		pro.getProperty("STGSaveButtonOil");
		pro.getProperty("STGSaveButtonGrease");

		pro.getProperty("STGTabMGO");
		pro.getProperty("STGTabLNG");
		pro.getProperty("STGTabUrea");
		pro.getProperty("STGTabFreshWater");
		pro.getProperty("STGTabOil");
		pro.getProperty("STGTabGrease");

		pro.getProperty("STGROBTodayInputMGO");
		pro.getProperty("STGROBTodayInputLNG");
		pro.getProperty("STGROBTodayInputUrea");
		pro.getProperty("STGROBTodayInputFreshWater");
		pro.getProperty("STGROBYesterdayInputOil");
		pro.getProperty("STGROBYesterdayInputGrease");

		pro.getProperty("STGVMHSEQChemicalLogDeckEnginetab");
		pro.getProperty("STGVMHSEQChemicalLogDeckEngineEditIcon");
		pro.getProperty("STGVMHSEQChemicalLogQuantityInputfield");
		pro.getProperty("STGVMHSEQChemicalLogUpdatebutton");

		pro.getProperty("STGVMEventReportTypeofEventFilter");

		pro.getProperty("STGDrillsMenu");
		pro.getProperty("STGNewDrillButton");

		pro.getProperty("STGDrillNameInputField");
		pro.getProperty("STGDrillPositiondropdown");
		pro.getProperty("STGDrillDescriptionInputField");
		pro.getProperty("STGDrillAddDate");
		pro.getProperty("STGDrillSaveandClosebutton");
		pro.getProperty("STGVMGarbageLogsubmenuLocator");
		pro.getProperty("STGVMGarbageLogNormalDropdown");
		pro.getProperty("STGVMGarbageLogDateCalendar1");
		pro.getProperty("STGVMGarbageLogDateCalendar2");
		pro.getProperty("STGVMGarbageLogTime1");
		pro.getProperty("STGVMGarbageLogInitialInput");
		pro.getProperty("STGVMGarbageLogRemarks");
		pro.getProperty("STGVMTransfertoGarbageLogButton");
		pro.getProperty("STGSettings");
		pro.getProperty("STGSettingsConfig");
		pro.getProperty("STGSettingsConfigDateandTime");
		pro.getProperty("STGDropdownlistradiobutton");
		pro.getProperty("STGMealsLogo");
		pro.getProperty("STGVMMASUBMENUxpath");
		pro.getProperty("STGHelpmenu");
		pro.getProperty("STGAboutshipadmiMenu");

	}

}