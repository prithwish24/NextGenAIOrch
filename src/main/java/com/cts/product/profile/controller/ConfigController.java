package com.cts.product.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${msg:Default Hallo World}")
    private String msg;

    @RequestMapping("/msg")
    public String getMsg() {
	return "{\n  \"fulfillmentText\": \"This is a text response\",\n  \"payload\": {\n    \"google\": {\n      \"conversationToken\": \"{\\\"state\\\":null,\\\"data\\\":{}}\",\n      \"expectUserResponse\": true,\n      \"expectedInputs\": [\n        {\n          \"inputPrompt\": {\n            \"richInitialPrompt\": {\n              \"items\": [\n                {\n                  \"simpleResponse\": {\n                    \"textToSpeech\": \"Here are a list of car classes you can choose from\"\n                  }\n                }\n              ]\n            }\n          },\n          \"possibleIntents\": [\n            {\n              \"intent\": \"actions.intent.OPTION\",\n              \"inputValueData\": {\n                \"@type\": \"type.googleapis.com/google.actions.v2.OptionValueSpec\",\n                \"listSelect\": {\n                  \"title\": \"List of car classes\",\n                  \"items\": [\n                    {\n                      \"optionInfo\": {\n                        \"key\": \"ECAR\"\n                      },\n                      \"title\": \"Economy Car\",\n                      \"description\": \"Economy Car Description\"\n                    },\n                    {\n                      \"optionInfo\": {\n                        \"key\": \"CCAR\"\n                      },\n                      \"title\": \"Compact Car\",\n                      \"description\": \"Compact Car Description\"\n                    },\n                    {\n                      \"optionInfo\": {\n                        \"key\": \"FCAR\"\n                      },\n                      \"title\": \"Full Size Car\",\n                      \"description\": \"Full Size Car Description\"\n                    }\n                  ]\n                }\n              }\n            }\n          ]\n        }\n      ]\n    }\n  },\n  \"outputContexts\": [\n    {\n      \"name\": \"projects/${PROJECT_ID}/agent/sessions/${SESSION_ID}/contexts/context name\",\n      \"lifespanCount\": 5,\n      \"parameters\": {\n        \"param\": \"param value\"\n      }\n    }\n  ]\n}";
    }

}
