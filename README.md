# Sending emails using Gmail API
Example how to send message using Google Gmail API.

## Setting up Gmail authentication params
1. Go to https://console.developers.google.com/ .
2. Create project.
3. Go to credentials > create OAuth consent screen.
4. Go to credentials > create credentials > OAuth client id. Choose application type Desktop app.
5. Enable Gmail service in projects in Google console.
6. Download JSON file with provided clientId and clientSecret and put it into resources folder.
7. Set ${email.from} application property to be used as correct address.

## How to run
1) Run application. Use http://localhost:9091/send test endpoint to test message sending.
2) For first sent message there will be a link in logs for gaining authentication access using this clientId and clientSecret. 
