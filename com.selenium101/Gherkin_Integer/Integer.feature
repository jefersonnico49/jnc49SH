	Feature: Meals and Accommodation Icon logo

		Scenario: Verify the width and height of the Meals and Accommodation Icon logo

		 Given Access Vessel Manager A
		 Then Go to Personnel Meals and Accommodation A
		 Then Verify the width and height of the Meals and Accommodation Icon logo A
		 Then Close Browser A
		 
		 
		Scenario: Verify if the shipadmin hyperlink text is clickable  and will redirect the user to shipadmin website
		
		 Given Access Vessel Manager B
		 Then Go to Help About Vessel Manager B
		 Then click on the shipadmin url hyperlink B
		 Then verify if the user will redirect to shipadmin page B
		 Then Close Browser B
		 
		 