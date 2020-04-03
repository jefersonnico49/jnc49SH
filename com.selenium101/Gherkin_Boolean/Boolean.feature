
	Feature: Drop Down List Radio button 

		Scenario: Verify if the radio button Drop Down List is present in Settings Config Date and Numbers Tab

		 Given Access Vessel Manager A
		 Then Go to Settings A
		 Then Access Config Date and Numbers Tab A
		 And Verify if the radio button Drop Down List is present A
		 Then Close Browser A

		 Scenario: Verify if the radio button Drop Down List is been tick in Settings Config Date and Numbers Tab

		 Given Access Vessel Manager B
		 Then Go to Settings B
		 Then Access Config Date and Numbers Tab B
		 And Verify if the radio button Drop Down List is tick B
		 Then Close Browser B