# sng-services-ai-azure-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>semantica.sng</groupId>
    <artifactId>sng-services-ai-azure-api-client</artifactId>
    <version>0.5-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "semantica.sng:sng-services-ai-azure-api-client:0.5-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/sng-services-ai-azure-api-client-0.5-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import semantica.sng.services.ai.azure.videoindexer.client.invoker.*;
import semantica.sng.services.ai.azure.videoindexer.client.invoker.auth.*;
import semantica.sng.services.ai.azure.videoindexer.client.model.*;
import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: apiKeyHeader
        ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
        apiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyHeader.setApiKeyPrefix("Token");
        
        // Configure API key authorization: apiKeyQuery
        ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
        apiKeyQuery.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyQuery.setApiKeyPrefix("Token");
        
        

        DefaultApi apiInstance = new DefaultApi();
        
        String accountId = Arrays.asList("accountId_example"); // String | Account's Id
        
        try {
            apiInstance.apiCustomizationBrandsGet(accountId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#apiCustomizationBrandsGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://videobreakdown.azure-api.net/Breakdowns*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**apiCustomizationBrandsGet**](docs/DefaultApi.md#apiCustomizationBrandsGet) | **GET** /api/Customization/Brands | Get Brands
*DefaultApi* | [**apiCustomizationBrandsIdDelete**](docs/DefaultApi.md#apiCustomizationBrandsIdDelete) | **DELETE** /api/Customization/Brands/{id} | Delete Brand
*DefaultApi* | [**apiCustomizationBrandsIdGet**](docs/DefaultApi.md#apiCustomizationBrandsIdGet) | **GET** /api/Customization/Brands/{id} | Get Brand
*DefaultApi* | [**apiCustomizationBrandsIdPut**](docs/DefaultApi.md#apiCustomizationBrandsIdPut) | **PUT** /api/Customization/Brands/{id} | Update Brand
*DefaultApi* | [**apiCustomizationBrandsPost**](docs/DefaultApi.md#apiCustomizationBrandsPost) | **POST** /api/Customization/Brands | Create Brand
*DefaultApi* | [**apiCustomizationBrandsToggleModelActivationStatePut**](docs/DefaultApi.md#apiCustomizationBrandsToggleModelActivationStatePut) | **PUT** /api/Customization/Brands/ToggleModelActivationState | Update Bing brands activation state
*DefaultApi* | [**apiCustomizationLanguageModelModelIdDelete**](docs/DefaultApi.md#apiCustomizationLanguageModelModelIdDelete) | **DELETE** /Api/Customization/Language/Model/{modelId} | Delete Linguistic Model
*DefaultApi* | [**apiCustomizationLanguageModelModelIdGet**](docs/DefaultApi.md#apiCustomizationLanguageModelModelIdGet) | **GET** /Api/Customization/Language/Model/{modelId} | Get linguistic model
*DefaultApi* | [**apiCustomizationLanguageModelPost**](docs/DefaultApi.md#apiCustomizationLanguageModelPost) | **POST** /Api/Customization/Language/Model | Create linguistic model
*DefaultApi* | [**apiCustomizationLanguageTrainingDataGroupIdDelete**](docs/DefaultApi.md#apiCustomizationLanguageTrainingDataGroupIdDelete) | **DELETE** /Api/Customization/Language/TrainingDataGroup/{id} | Delete linguistic training data group
*DefaultApi* | [**apiCustomizationLanguageTrainingDataGroupIdGet**](docs/DefaultApi.md#apiCustomizationLanguageTrainingDataGroupIdGet) | **GET** /Api/Customization/Language/TrainingDataGroup/{id} | Get linguistic training data group
*DefaultApi* | [**apiCustomizationLanguageTrainingDataGroupIdPut**](docs/DefaultApi.md#apiCustomizationLanguageTrainingDataGroupIdPut) | **PUT** /Api/Customization/Language/TrainingDataGroup/{id} | Update linguistic training data group
*DefaultApi* | [**apiCustomizationLanguageTrainingDataGroupPost**](docs/DefaultApi.md#apiCustomizationLanguageTrainingDataGroupPost) | **POST** /Api/Customization/Language/TrainingDataGroup | Create linguistic training data group
*DefaultApi* | [**apiCustomizationLanguageTrainingDataIdDelete**](docs/DefaultApi.md#apiCustomizationLanguageTrainingDataIdDelete) | **DELETE** /Api/Customization/Language/TrainingData/{id} | Delete linguistic training data
*DefaultApi* | [**apiCustomizationLanguageTrainingDataIdPut**](docs/DefaultApi.md#apiCustomizationLanguageTrainingDataIdPut) | **PUT** /Api/Customization/Language/TrainingData/{id} | Update linguistic training data
*DefaultApi* | [**apiCustomizationLanguageTrainingDataPost**](docs/DefaultApi.md#apiCustomizationLanguageTrainingDataPost) | **POST** /Api/Customization/Language/TrainingData | Add linguistic training data
*DefaultApi* | [**apiCustomizationLanguageTrainingDataTrainingFileIdGet**](docs/DefaultApi.md#apiCustomizationLanguageTrainingDataTrainingFileIdGet) | **GET** /Api/Customization/Language/TrainingData/{trainingFileId} | Get linguistic training data
*DefaultApi* | [**apiPartnerAccountsGet**](docs/DefaultApi.md#apiPartnerAccountsGet) | **GET** /Api/Partner/Accounts | Get Accounts
*DefaultApi* | [**apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet**](docs/DefaultApi.md#apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet) | **GET** /Api/Partner/Breakdowns/GetInsightsWidgetUrlByExternalId | Get Insights Widget Url By External Id
*DefaultApi* | [**apiPartnerBreakdownsIdDelete**](docs/DefaultApi.md#apiPartnerBreakdownsIdDelete) | **DELETE** /Api/Partner/Breakdowns/{id} | Delete Breakdown
*DefaultApi* | [**apiPartnerBreakdownsIdGet**](docs/DefaultApi.md#apiPartnerBreakdownsIdGet) | **GET** /Api/Partner/Breakdowns/{id} | Get Breakdown
*DefaultApi* | [**apiPartnerBreakdownsIdGetAccessTokenGet**](docs/DefaultApi.md#apiPartnerBreakdownsIdGetAccessTokenGet) | **GET** /Api/Partner/Breakdowns/{id}/GetAccessToken | Get Access Token
*DefaultApi* | [**apiPartnerBreakdownsIdInsightsWidgetUrlGet**](docs/DefaultApi.md#apiPartnerBreakdownsIdInsightsWidgetUrlGet) | **GET** /Api/Partner/Breakdowns/{id}/InsightsWidgetUrl | Get Insights Widget Url
*DefaultApi* | [**apiPartnerBreakdownsIdPlayerWidgetUrlGet**](docs/DefaultApi.md#apiPartnerBreakdownsIdPlayerWidgetUrlGet) | **GET** /Api/Partner/Breakdowns/{id}/PlayerWidgetUrl | Get Player Widget Url
*DefaultApi* | [**apiPartnerBreakdownsIdStateGet**](docs/DefaultApi.md#apiPartnerBreakdownsIdStateGet) | **GET** /Api/Partner/Breakdowns/{id}/State | Get Processing State
*DefaultApi* | [**apiPartnerBreakdownsIdVttUrlGet**](docs/DefaultApi.md#apiPartnerBreakdownsIdVttUrlGet) | **GET** /Api/Partner/Breakdowns/{id}/VttUrl | Get Vtt Url
*DefaultApi* | [**apiPartnerBreakdownsPost**](docs/DefaultApi.md#apiPartnerBreakdownsPost) | **POST** /Api/Partner/Breakdowns | Upload
*DefaultApi* | [**apiPartnerBreakdownsReindexIdPut**](docs/DefaultApi.md#apiPartnerBreakdownsReindexIdPut) | **PUT** /Api/Partner/Breakdowns/reindex/{id} | Re-Index Breakdown
*DefaultApi* | [**apiPartnerBreakdownsReindexbyexternalidExternalIdPut**](docs/DefaultApi.md#apiPartnerBreakdownsReindexbyexternalidExternalIdPut) | **PUT** /Api/Partner/Breakdowns/reindexbyexternalid/{externalId} | Re-Index Breakdown By External Id
*DefaultApi* | [**apiPartnerBreakdownsSearchGet**](docs/DefaultApi.md#apiPartnerBreakdownsSearchGet) | **GET** /Api/Partner/Breakdowns/Search | Search
*DefaultApi* | [**apiPartnerBreakdownsUpdateFaceNameIdPut**](docs/DefaultApi.md#apiPartnerBreakdownsUpdateFaceNameIdPut) | **PUT** /Api/Partner/Breakdowns/UpdateFaceName/{id} | Update Face Name
*DefaultApi* | [**apiPartnerBreakdownsUpdateTranscriptIdPut**](docs/DefaultApi.md#apiPartnerBreakdownsUpdateTranscriptIdPut) | **PUT** /Api/Partner/Breakdowns/UpdateTranscript/{id} | Update Transcript


## Documentation for Models

 - [Body](docs/Body.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKeyHeader

- **Type**: API key
- **API key parameter name**: Ocp-Apim-Subscription-Key
- **Location**: HTTP header




### apiKeyQuery

- **Type**: API key
- **API key parameter name**: subscription-key
- **Location**: URL query string






## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



