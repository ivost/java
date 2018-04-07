# DefaultApi

All URIs are relative to *https://videobreakdown.azure-api.net/Breakdowns*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCustomizationBrandsGet**](DefaultApi.md#apiCustomizationBrandsGet) | **GET** /api/Customization/Brands | Get Brands
[**apiCustomizationBrandsIdDelete**](DefaultApi.md#apiCustomizationBrandsIdDelete) | **DELETE** /api/Customization/Brands/{id} | Delete Brand
[**apiCustomizationBrandsIdGet**](DefaultApi.md#apiCustomizationBrandsIdGet) | **GET** /api/Customization/Brands/{id} | Get Brand
[**apiCustomizationBrandsIdPut**](DefaultApi.md#apiCustomizationBrandsIdPut) | **PUT** /api/Customization/Brands/{id} | Update Brand
[**apiCustomizationBrandsPost**](DefaultApi.md#apiCustomizationBrandsPost) | **POST** /api/Customization/Brands | Create Brand
[**apiCustomizationBrandsToggleModelActivationStatePut**](DefaultApi.md#apiCustomizationBrandsToggleModelActivationStatePut) | **PUT** /api/Customization/Brands/ToggleModelActivationState | Update Bing brands activation state
[**apiCustomizationLanguageModelModelIdDelete**](DefaultApi.md#apiCustomizationLanguageModelModelIdDelete) | **DELETE** /Api/Customization/Language/Model/{modelId} | Delete Linguistic Model
[**apiCustomizationLanguageModelModelIdGet**](DefaultApi.md#apiCustomizationLanguageModelModelIdGet) | **GET** /Api/Customization/Language/Model/{modelId} | Get linguistic model
[**apiCustomizationLanguageModelPost**](DefaultApi.md#apiCustomizationLanguageModelPost) | **POST** /Api/Customization/Language/Model | Create linguistic model
[**apiCustomizationLanguageTrainingDataGroupIdDelete**](DefaultApi.md#apiCustomizationLanguageTrainingDataGroupIdDelete) | **DELETE** /Api/Customization/Language/TrainingDataGroup/{id} | Delete linguistic training data group
[**apiCustomizationLanguageTrainingDataGroupIdGet**](DefaultApi.md#apiCustomizationLanguageTrainingDataGroupIdGet) | **GET** /Api/Customization/Language/TrainingDataGroup/{id} | Get linguistic training data group
[**apiCustomizationLanguageTrainingDataGroupIdPut**](DefaultApi.md#apiCustomizationLanguageTrainingDataGroupIdPut) | **PUT** /Api/Customization/Language/TrainingDataGroup/{id} | Update linguistic training data group
[**apiCustomizationLanguageTrainingDataGroupPost**](DefaultApi.md#apiCustomizationLanguageTrainingDataGroupPost) | **POST** /Api/Customization/Language/TrainingDataGroup | Create linguistic training data group
[**apiCustomizationLanguageTrainingDataIdDelete**](DefaultApi.md#apiCustomizationLanguageTrainingDataIdDelete) | **DELETE** /Api/Customization/Language/TrainingData/{id} | Delete linguistic training data
[**apiCustomizationLanguageTrainingDataIdPut**](DefaultApi.md#apiCustomizationLanguageTrainingDataIdPut) | **PUT** /Api/Customization/Language/TrainingData/{id} | Update linguistic training data
[**apiCustomizationLanguageTrainingDataPost**](DefaultApi.md#apiCustomizationLanguageTrainingDataPost) | **POST** /Api/Customization/Language/TrainingData | Add linguistic training data
[**apiCustomizationLanguageTrainingDataTrainingFileIdGet**](DefaultApi.md#apiCustomizationLanguageTrainingDataTrainingFileIdGet) | **GET** /Api/Customization/Language/TrainingData/{trainingFileId} | Get linguistic training data
[**apiPartnerAccountsGet**](DefaultApi.md#apiPartnerAccountsGet) | **GET** /Api/Partner/Accounts | Get Accounts
[**apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet**](DefaultApi.md#apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet) | **GET** /Api/Partner/Breakdowns/GetInsightsWidgetUrlByExternalId | Get Insights Widget Url By External Id
[**apiPartnerBreakdownsIdDelete**](DefaultApi.md#apiPartnerBreakdownsIdDelete) | **DELETE** /Api/Partner/Breakdowns/{id} | Delete Breakdown
[**apiPartnerBreakdownsIdGet**](DefaultApi.md#apiPartnerBreakdownsIdGet) | **GET** /Api/Partner/Breakdowns/{id} | Get Breakdown
[**apiPartnerBreakdownsIdGetAccessTokenGet**](DefaultApi.md#apiPartnerBreakdownsIdGetAccessTokenGet) | **GET** /Api/Partner/Breakdowns/{id}/GetAccessToken | Get Access Token
[**apiPartnerBreakdownsIdInsightsWidgetUrlGet**](DefaultApi.md#apiPartnerBreakdownsIdInsightsWidgetUrlGet) | **GET** /Api/Partner/Breakdowns/{id}/InsightsWidgetUrl | Get Insights Widget Url
[**apiPartnerBreakdownsIdPlayerWidgetUrlGet**](DefaultApi.md#apiPartnerBreakdownsIdPlayerWidgetUrlGet) | **GET** /Api/Partner/Breakdowns/{id}/PlayerWidgetUrl | Get Player Widget Url
[**apiPartnerBreakdownsIdStateGet**](DefaultApi.md#apiPartnerBreakdownsIdStateGet) | **GET** /Api/Partner/Breakdowns/{id}/State | Get Processing State
[**apiPartnerBreakdownsIdVttUrlGet**](DefaultApi.md#apiPartnerBreakdownsIdVttUrlGet) | **GET** /Api/Partner/Breakdowns/{id}/VttUrl | Get Vtt Url
[**apiPartnerBreakdownsPost**](DefaultApi.md#apiPartnerBreakdownsPost) | **POST** /Api/Partner/Breakdowns | Upload
[**apiPartnerBreakdownsReindexIdPut**](DefaultApi.md#apiPartnerBreakdownsReindexIdPut) | **PUT** /Api/Partner/Breakdowns/reindex/{id} | Re-Index Breakdown
[**apiPartnerBreakdownsReindexbyexternalidExternalIdPut**](DefaultApi.md#apiPartnerBreakdownsReindexbyexternalidExternalIdPut) | **PUT** /Api/Partner/Breakdowns/reindexbyexternalid/{externalId} | Re-Index Breakdown By External Id
[**apiPartnerBreakdownsSearchGet**](DefaultApi.md#apiPartnerBreakdownsSearchGet) | **GET** /Api/Partner/Breakdowns/Search | Search
[**apiPartnerBreakdownsUpdateFaceNameIdPut**](DefaultApi.md#apiPartnerBreakdownsUpdateFaceNameIdPut) | **PUT** /Api/Partner/Breakdowns/UpdateFaceName/{id} | Update Face Name
[**apiPartnerBreakdownsUpdateTranscriptIdPut**](DefaultApi.md#apiPartnerBreakdownsUpdateTranscriptIdPut) | **PUT** /Api/Partner/Breakdowns/UpdateTranscript/{id} | Update Transcript




<a name="apiCustomizationBrandsGet"></a>
# **apiCustomizationBrandsGet**
> apiCustomizationBrandsGet(accountId)

Get Brands

Gets all custom brands per the account and Bing brands activation state (whether Bing brands should be used when applying the model)

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String accountId = Arrays.asList("accountId_example"); // String | Account's Id

try {
    apiInstance.apiCustomizationBrandsGet(accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationBrandsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| Account&#x27;s Id |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="apiCustomizationBrandsIdDelete"></a>
# **apiCustomizationBrandsIdDelete**
> apiCustomizationBrandsIdDelete(id, accountId)

Delete Brand

Removes brand for the specified account

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | 

String accountId = Arrays.asList("accountId_example"); // String | Account's Id

try {
    apiInstance.apiCustomizationBrandsIdDelete(id, accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationBrandsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **accountId** | [**String**](.md)| Account&#x27;s Id |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationBrandsIdGet"></a>
# **apiCustomizationBrandsIdGet**
> apiCustomizationBrandsIdGet(id, accountId)

Get Brand

Get specific custom brand

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

Integer id = Arrays.asList(56); // Integer | Brand's Id

String accountId = Arrays.asList("accountId_example"); // String | Account's Id

try {
    apiInstance.apiCustomizationBrandsIdGet(id, accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationBrandsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Brand&#x27;s Id |
 **accountId** | [**String**](.md)| Account&#x27;s Id |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="apiCustomizationBrandsIdPut"></a>
# **apiCustomizationBrandsIdPut**
> apiCustomizationBrandsIdPut(id, accountId, body)

Update Brand

Updates specific brand&#x27;s metadata

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

Integer id = Arrays.asList(56); // Integer | Brand's Id

String accountId = Arrays.asList("accountId_example"); // String | Account's Id

Object body = ; // Object | 

try {
    apiInstance.apiCustomizationBrandsIdPut(id, accountId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationBrandsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Brand&#x27;s Id |
 **accountId** | [**String**](.md)| Account&#x27;s Id |
 **body** | [**Object**](Object.md)|  | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="apiCustomizationBrandsPost"></a>
# **apiCustomizationBrandsPost**
> apiCustomizationBrandsPost(accountId, body)

Create Brand

Creates new custom brand for the specified account

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String accountId = Arrays.asList("accountId_example"); // String | Account's Id

Object body = ; // Object | 

try {
    apiInstance.apiCustomizationBrandsPost(accountId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationBrandsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| Account&#x27;s Id |
 **body** | [**Object**](Object.md)|  | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="apiCustomizationBrandsToggleModelActivationStatePut"></a>
# **apiCustomizationBrandsToggleModelActivationStatePut**
> apiCustomizationBrandsToggleModelActivationStatePut(accountId, body)

Update Bing brands activation state

Enable / disable the usage of Bing brands in model

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String accountId = Arrays.asList("accountId_example"); // String | Acocunt's Id

Object body = ; // Object | 

try {
    apiInstance.apiCustomizationBrandsToggleModelActivationStatePut(accountId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationBrandsToggleModelActivationStatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| Acocunt&#x27;s Id |
 **body** | [**Object**](Object.md)|  | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a name="apiCustomizationLanguageModelModelIdDelete"></a>
# **apiCustomizationLanguageModelModelIdDelete**
> apiCustomizationLanguageModelModelIdDelete(modelId)

Delete Linguistic Model

Deletes the uploaded video and if deleteInsights&#x3D;true, then deletes the generated insights as well.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String modelId = Arrays.asList("modelId_example"); // String | Model id

try {
    apiInstance.apiCustomizationLanguageModelModelIdDelete(modelId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageModelModelIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**String**](.md)| Model id |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageModelModelIdGet"></a>
# **apiCustomizationLanguageModelModelIdGet**
> apiCustomizationLanguageModelModelIdGet(modelId)

Get linguistic model

Returns the model meta data

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String modelId = Arrays.asList("modelId_example"); // String | The model id

try {
    apiInstance.apiCustomizationLanguageModelModelIdGet(modelId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageModelModelIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**String**](.md)| The model id |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageModelPost"></a>
# **apiCustomizationLanguageModelPost**
> apiCustomizationLanguageModelPost(trainingDataIds, waitUntilReady)

Create linguistic model

Creates a linguistic model by getting a training data id. The returned linguistic model id must be verified as ready before used for indexing.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String trainingDataIds = Arrays.asList("trainingDataIds_example"); // String | Array of training data id's. Example: [\"7bb2f6bb-8396-4afb-93e7-96c359b75796\"]

String waitUntilReady = Arrays.asList("waitUntilReady_example"); // String | Should wait until the training is complet

try {
    apiInstance.apiCustomizationLanguageModelPost(trainingDataIds, waitUntilReady);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageModelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainingDataIds** | [**String**](.md)| Array of training data id&#x27;s. Example: [\&quot;7bb2f6bb-8396-4afb-93e7-96c359b75796\&quot;] |
 **waitUntilReady** | [**String**](.md)| Should wait until the training is complet | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageTrainingDataGroupIdDelete"></a>
# **apiCustomizationLanguageTrainingDataGroupIdDelete**
> apiCustomizationLanguageTrainingDataGroupIdDelete(id)

Delete linguistic training data group

Deletes the training data group and all training data files under that group.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

Integer id = Arrays.asList(56); // Integer | Group id

try {
    apiInstance.apiCustomizationLanguageTrainingDataGroupIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageTrainingDataGroupIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| Group id |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageTrainingDataGroupIdGet"></a>
# **apiCustomizationLanguageTrainingDataGroupIdGet**
> apiCustomizationLanguageTrainingDataGroupIdGet(id)

Get linguistic training data group

Get information about a training data group.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | 

try {
    apiInstance.apiCustomizationLanguageTrainingDataGroupIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageTrainingDataGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageTrainingDataGroupIdPut"></a>
# **apiCustomizationLanguageTrainingDataGroupIdPut**
> apiCustomizationLanguageTrainingDataGroupIdPut(id, name, language)

Update linguistic training data group

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

Integer id = Arrays.asList(56); // Integer | The group id

String name = Arrays.asList("name_example"); // String | Name of the training data

String language = Arrays.asList("language_example"); // String | Training data language.

try {
    apiInstance.apiCustomizationLanguageTrainingDataGroupIdPut(id, name, language);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageTrainingDataGroupIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Integer**](.md)| The group id |
 **name** | [**String**](.md)| Name of the training data | [optional]
 **language** | [**String**](.md)| Training data language. | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageTrainingDataGroupPost"></a>
# **apiCustomizationLanguageTrainingDataGroupPost**
> apiCustomizationLanguageTrainingDataGroupPost(name, language)

Create linguistic training data group

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String name = Arrays.asList("name_example"); // String | Name of the training data

String language = Arrays.asList("language_example"); // String | Training data language.

try {
    apiInstance.apiCustomizationLanguageTrainingDataGroupPost(name, language);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageTrainingDataGroupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)| Name of the training data |
 **language** | [**String**](.md)| Training data language. |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageTrainingDataIdDelete"></a>
# **apiCustomizationLanguageTrainingDataIdDelete**
> apiCustomizationLanguageTrainingDataIdDelete(id)

Delete linguistic training data

Deletes the training data by Id

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The training data ID

try {
    apiInstance.apiCustomizationLanguageTrainingDataIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageTrainingDataIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The training data ID |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageTrainingDataIdPut"></a>
# **apiCustomizationLanguageTrainingDataIdPut**
> apiCustomizationLanguageTrainingDataIdPut(id, name, description, language, groupName)

Update linguistic training data

Update the linguistic training data.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | Training data id.

String name = Arrays.asList("name_example"); // String | Name of the training data

String description = Arrays.asList("description_example"); // String | Description of training data

String language = Arrays.asList("language_example"); // String | Training data language.

String groupName = Arrays.asList("groupName_example"); // String | Training data group. Example: 'Medical, Sport etc.'

try {
    apiInstance.apiCustomizationLanguageTrainingDataIdPut(id, name, description, language, groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageTrainingDataIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| Training data id. |
 **name** | [**String**](.md)| Name of the training data | [optional]
 **description** | [**String**](.md)| Description of training data | [optional]
 **language** | [**String**](.md)| Training data language. | [optional]
 **groupName** | [**String**](.md)| Training data group. Example: &#x27;Medical, Sport etc.&#x27; | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageTrainingDataPost"></a>
# **apiCustomizationLanguageTrainingDataPost**
> apiCustomizationLanguageTrainingDataPost(name, language, description, groupName)

Add linguistic training data

Uploads the linguistic training data to be used to create a linguistic model.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String name = Arrays.asList("name_example"); // String | Name of the training data

String language = Arrays.asList("language_example"); // String | Training data language.

String description = Arrays.asList("description_example"); // String | Description of training data

String groupName = Arrays.asList("groupName_example"); // String | Training data group. Example: 'Medical, Sport etc.'

try {
    apiInstance.apiCustomizationLanguageTrainingDataPost(name, language, description, groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageTrainingDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)| Name of the training data |
 **language** | [**String**](.md)| Training data language. |
 **description** | [**String**](.md)| Description of training data | [optional]
 **groupName** | [**String**](.md)| Training data group. Example: &#x27;Medical, Sport etc.&#x27; | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiCustomizationLanguageTrainingDataTrainingFileIdGet"></a>
# **apiCustomizationLanguageTrainingDataTrainingFileIdGet**
> apiCustomizationLanguageTrainingDataTrainingFileIdGet(trainingFileId, includeFileContent)

Get linguistic training data

Get linguistic training data

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String trainingFileId = Arrays.asList("trainingFileId_example"); // String | Training data file id. If not specified we return the status of all the files.

String includeFileContent = Arrays.asList("includeFileContent_example"); // String | If true we include the content of the file in the response. This argument is only valid for a specific file. If no training data id is provided we will ignore it.

try {
    apiInstance.apiCustomizationLanguageTrainingDataTrainingFileIdGet(trainingFileId, includeFileContent);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiCustomizationLanguageTrainingDataTrainingFileIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trainingFileId** | [**String**](.md)| Training data file id. If not specified we return the status of all the files. |
 **includeFileContent** | [**String**](.md)| If true we include the content of the file in the response. This argument is only valid for a specific file. If no training data id is provided we will ignore it. | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerAccountsGet"></a>
# **apiPartnerAccountsGet**
> apiPartnerAccountsGet()

Get Accounts

Returns the details of the user&#x27;s accounts.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

try {
    apiInstance.apiPartnerAccountsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerAccountsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet"></a>
# **apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet**
> apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet(externalId, widgetType, allowEdit)

Get Insights Widget Url By External Id

Gets a url to the cognitive insights widget url, including an access token, based on a given external id. This API will only work for breakdowns which are owned by this subscription.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String externalId = Arrays.asList("externalId_example"); // String | An external id to search for (which was associated with a video of this subscription at upload). 

String widgetType = Arrays.asList("widgetType_example"); // String | A type of a sub-widget to include (People, Sentiments, Keywords, Search)

Boolean allowEdit = Arrays.asList(true); // Boolean | Whether to allow the user to edit the insights (faces names, transcript, etc).

try {
    apiInstance.apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet(externalId, widgetType, allowEdit);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | [**String**](.md)| An external id to search for (which was associated with a video of this subscription at upload).  |
 **widgetType** | [**String**](.md)| A type of a sub-widget to include (People, Sentiments, Keywords, Search) | [optional]
 **allowEdit** | [**Boolean**](.md)| Whether to allow the user to edit the insights (faces names, transcript, etc). | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsIdDelete"></a>
# **apiPartnerBreakdownsIdDelete**
> apiPartnerBreakdownsIdDelete(id, deleteInsights)

Delete Breakdown

Deletes the uploaded video and if deleteInsights&#x3D;true, then deletes the generated insights as well.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id (video id), returned by the Upload or Search APIs.

Boolean deleteInsights = Arrays.asList(true); // Boolean | Whether to delete the generated insights as well.

try {
    apiInstance.apiPartnerBreakdownsIdDelete(id, deleteInsights);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id (video id), returned by the Upload or Search APIs. |
 **deleteInsights** | [**Boolean**](.md)| Whether to delete the generated insights as well. | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsIdGet"></a>
# **apiPartnerBreakdownsIdGet**
> apiPartnerBreakdownsIdGet(id, language)

Get Breakdown

Returns the full details of the the given breakdown including all the insights (transcript, OCR, people, etc). The full details include the topics, the faces, the blocks, etc. Each block includes time ranges, transcript lines, OCR lines, sentiments, faces and their block thumbnails.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id (video id), returned by the Upload or Search APIs.

String language = Arrays.asList("language_example"); // String | The requested language of the text. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN.

try {
    apiInstance.apiPartnerBreakdownsIdGet(id, language);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id (video id), returned by the Upload or Search APIs. |
 **language** | [**String**](.md)| The requested language of the text. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN. | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsIdGetAccessTokenGet"></a>
# **apiPartnerBreakdownsIdGetAccessTokenGet**
> apiPartnerBreakdownsIdGetAccessTokenGet(id, allowEdit)

Get Access Token

Gets an access token to a video, which can be used for other operations, like getting a thumbnail.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The video id.

Boolean allowEdit = Arrays.asList(true); // Boolean | A boolean that if set to true will return accessToken with editing permissions.  (remove face, edit text etc...)

try {
    apiInstance.apiPartnerBreakdownsIdGetAccessTokenGet(id, allowEdit);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsIdGetAccessTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The video id. |
 **allowEdit** | [**Boolean**](.md)| A boolean that if set to true will return accessToken with editing permissions.  (remove face, edit text etc...) | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsIdInsightsWidgetUrlGet"></a>
# **apiPartnerBreakdownsIdInsightsWidgetUrlGet**
> apiPartnerBreakdownsIdInsightsWidgetUrlGet(id, widgetType, allowEdit)

Get Insights Widget Url

Gets a url to the cognitive insights widget url, including an access token.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id.

String widgetType = Arrays.asList("widgetType_example"); // String | A type of a sub-widget to include (People, Sentiments, Keywords, Search)

Boolean allowEdit = Arrays.asList(true); // Boolean | Whether to allow the user to edit the insights (faces names, transcript, etc).

try {
    apiInstance.apiPartnerBreakdownsIdInsightsWidgetUrlGet(id, widgetType, allowEdit);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsIdInsightsWidgetUrlGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id. |
 **widgetType** | [**String**](.md)| A type of a sub-widget to include (People, Sentiments, Keywords, Search) | [optional]
 **allowEdit** | [**Boolean**](.md)| Whether to allow the user to edit the insights (faces names, transcript, etc). | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsIdPlayerWidgetUrlGet"></a>
# **apiPartnerBreakdownsIdPlayerWidgetUrlGet**
> apiPartnerBreakdownsIdPlayerWidgetUrlGet(id)

Get Player Widget Url

Gets a url to the player widget url, including an access token.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id.

try {
    apiInstance.apiPartnerBreakdownsIdPlayerWidgetUrlGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsIdPlayerWidgetUrlGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id. |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsIdStateGet"></a>
# **apiPartnerBreakdownsIdStateGet**
> apiPartnerBreakdownsIdStateGet(id)

Get Processing State

Gets the processing state of the given breakdown id (Uploaded, Processing, Processed, Failed) and if Processing it returns the progress (e.g. 30%).

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id.

try {
    apiInstance.apiPartnerBreakdownsIdStateGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsIdStateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id. |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsIdVttUrlGet"></a>
# **apiPartnerBreakdownsIdVttUrlGet**
> apiPartnerBreakdownsIdVttUrlGet(id, language)

Get Vtt Url

Gets a url to a VTT file with the given breakdown&#x27;s captions.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id (video id), returned by the Upload or Search APIs.

String language = Arrays.asList("language_example"); // String | The requested language of the VTT. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN.

try {
    apiInstance.apiPartnerBreakdownsIdVttUrlGet(id, language);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsIdVttUrlGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id (video id), returned by the Upload or Search APIs. |
 **language** | [**String**](.md)| The requested language of the VTT. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN. | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsPost"></a>
# **apiPartnerBreakdownsPost**
> apiPartnerBreakdownsPost(name, privacy, body, videoUrl, language, externalId, metadata, description, partition, callbackUrl, indexingPreset, streamingPreset, linguisticModelId)

Upload

Uploads the given video, starts indexing it and returns a new breakdown id. The supported formats are listed here: https://docs.microsoft.com/en-us/azure/media-services/media-services-media-encoder-standard-formats)

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String name = Arrays.asList("name_example"); // String | The video name.

String privacy = Arrays.asList("privacy_example"); // String | The video privacy (Private or Public).

Object body = ; // Object | 

String videoUrl = Arrays.asList("videoUrl_example"); // String | A public url of the video/audio file (url encoded). If not specified, the file should be passed as a multipart/form body content.

String language = Arrays.asList("language_example"); // String | The language of the video, to be used when generating the transcript. Arabic: ar-EG, Chinese (Simplified): zh-Hans, English: en-US, French: fr-FR, German: de-DE, Italian: it-IT, Japanese: ja-JP, Portuguese: pt-BR, Russian: ru-RU, Spanish: es-ES.

String externalId = Arrays.asList("externalId_example"); // String | An external id to associate with the video (can be searched for later).

String metadata = Arrays.asList("metadata_example"); // String | Metadata to associate with the video (will be returned in queries).

String description = Arrays.asList("description_example"); // String | The video description.

String partition = Arrays.asList("partition_example"); // String | A partition to partition videos by (used for searching a specific partition)

String callbackUrl = Arrays.asList("callbackUrl_example"); // String | A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is 'https://test.com/notifyme?projectName=MyProject', the notification will be sent with additional parameters to 'https://test.com/notifyme?projectName=MyProject&id=1234abcd&state=Processed'.

String indexingPreset = Arrays.asList("indexingPreset_example"); // String | The indexing preset to use (Default/AudioOnly/DefaultWithNoiseReduction).

String streamingPreset = Arrays.asList("streamingPreset_example"); // String | The streaming preset to use (Default/AdaptiveBitrate).

String linguisticModelId = Arrays.asList("linguisticModelId_example"); // String | Linguistic model id as received by 'create linguistic model' call

try {
    apiInstance.apiPartnerBreakdownsPost(name, privacy, body, videoUrl, language, externalId, metadata, description, partition, callbackUrl, indexingPreset, streamingPreset, linguisticModelId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)| The video name. |
 **privacy** | [**String**](.md)| The video privacy (Private or Public). |
 **body** | [**Object**](Object.md)|  | [optional]
 **videoUrl** | [**String**](.md)| A public url of the video/audio file (url encoded). If not specified, the file should be passed as a multipart/form body content. | [optional]
 **language** | [**String**](.md)| The language of the video, to be used when generating the transcript. Arabic: ar-EG, Chinese (Simplified): zh-Hans, English: en-US, French: fr-FR, German: de-DE, Italian: it-IT, Japanese: ja-JP, Portuguese: pt-BR, Russian: ru-RU, Spanish: es-ES. | [optional]
 **externalId** | [**String**](.md)| An external id to associate with the video (can be searched for later). | [optional]
 **metadata** | [**String**](.md)| Metadata to associate with the video (will be returned in queries). | [optional]
 **description** | [**String**](.md)| The video description. | [optional]
 **partition** | [**String**](.md)| A partition to partition videos by (used for searching a specific partition) | [optional]
 **callbackUrl** | [**String**](.md)| A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&#x27;, the notification will be sent with additional parameters to &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&amp;id&#x3D;1234abcd&amp;state&#x3D;Processed&#x27;. | [optional]
 **indexingPreset** | [**String**](.md)| The indexing preset to use (Default/AudioOnly/DefaultWithNoiseReduction). | [optional]
 **streamingPreset** | [**String**](.md)| The streaming preset to use (Default/AdaptiveBitrate). | [optional]
 **linguisticModelId** | [**String**](.md)| Linguistic model id as received by &#x27;create linguistic model&#x27; call | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsReindexIdPut"></a>
# **apiPartnerBreakdownsReindexIdPut**
> apiPartnerBreakdownsReindexIdPut(id, callbackUrl, indexingPreset, streamingPreset, sourceLanguage)

Re-Index Breakdown

Re-indexes the given breakdown.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id.

String callbackUrl = Arrays.asList("callbackUrl_example"); // String | A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is 'https://test.com/notifyme?projectName=MyProject', the notification will be sent with additional parameters to 'https://test.com/notifyme?projectName=MyProject&id=1234abcd&state=Processed'.

String indexingPreset = Arrays.asList("indexingPreset_example"); // String | The indexing preset to use (Default/AudioOnly) 

String streamingPreset = Arrays.asList("streamingPreset_example"); // String | The streaming preset to use (Default/AdaptiveBitrate)

String sourceLanguage = Arrays.asList("sourceLanguage_example"); // String | The media's source language. If not provided, source language will remain unchanged

try {
    apiInstance.apiPartnerBreakdownsReindexIdPut(id, callbackUrl, indexingPreset, streamingPreset, sourceLanguage);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsReindexIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id. |
 **callbackUrl** | [**String**](.md)| A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&#x27;, the notification will be sent with additional parameters to &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&amp;id&#x3D;1234abcd&amp;state&#x3D;Processed&#x27;. | [optional]
 **indexingPreset** | [**String**](.md)| The indexing preset to use (Default/AudioOnly)  | [optional]
 **streamingPreset** | [**String**](.md)| The streaming preset to use (Default/AdaptiveBitrate) | [optional]
 **sourceLanguage** | [**String**](.md)| The media&#x27;s source language. If not provided, source language will remain unchanged | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsReindexbyexternalidExternalIdPut"></a>
# **apiPartnerBreakdownsReindexbyexternalidExternalIdPut**
> apiPartnerBreakdownsReindexbyexternalidExternalIdPut(externalId, callbackUrl, indexingPreset, streamingPreset, sourceLanguage)

Re-Index Breakdown By External Id

Re-indexes the video of the given external id.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String externalId = Arrays.asList("externalId_example"); // String | An external id (which was associated with a video of this subscription at upload).

String callbackUrl = Arrays.asList("callbackUrl_example"); // String | A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is 'https://test.com/notifyme?projectName=MyProject', the notification will be sent with additional parameters to 'https://test.com/notifyme?projectName=MyProject&id=1234abcd&state=Processed'.

String indexingPreset = Arrays.asList("indexingPreset_example"); // String | The indexing preset to use (Default/AudioOnly)

String streamingPreset = Arrays.asList("streamingPreset_example"); // String | The streaming preset to use (Default/AdaptiveBitrate)

String sourceLanguage = Arrays.asList("sourceLanguage_example"); // String | The media's source language. If not provided, source language will remain unchanged

try {
    apiInstance.apiPartnerBreakdownsReindexbyexternalidExternalIdPut(externalId, callbackUrl, indexingPreset, streamingPreset, sourceLanguage);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsReindexbyexternalidExternalIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | [**String**](.md)| An external id (which was associated with a video of this subscription at upload). |
 **callbackUrl** | [**String**](.md)| A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&#x27;, the notification will be sent with additional parameters to &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&amp;id&#x3D;1234abcd&amp;state&#x3D;Processed&#x27;. | [optional]
 **indexingPreset** | [**String**](.md)| The indexing preset to use (Default/AudioOnly) | [optional]
 **streamingPreset** | [**String**](.md)| The streaming preset to use (Default/AdaptiveBitrate) | [optional]
 **sourceLanguage** | [**String**](.md)| The media&#x27;s source language. If not provided, source language will remain unchanged | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsSearchGet"></a>
# **apiPartnerBreakdownsSearchGet**
> apiPartnerBreakdownsSearchGet(privacy, id, partition, owner, face, query, textScope, pageSize, skip, externalId, language, searchInPublicAccount)

Search

Performs search and returns the search results. If available, returns the matches of the search filters in the results.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String privacy = Arrays.asList("privacy_example"); // String | A privacy level (Private, Organization, Public).

String id = Arrays.asList("id_example"); // String | A breakdown id to search for.

String partition = Arrays.asList("partition_example"); // String | A partition to search for.

String owner = Arrays.asList("owner_example"); // String | An owner to search for.

String face = Arrays.asList("face_example"); // String | A face to search for.

String query = Arrays.asList("query_example"); // String | Free text to search for.

String textScope = Arrays.asList("textScope_example"); // String | The text scope to search in.

BigDecimal pageSize = Arrays.asList(new BigDecimal()); // BigDecimal | The number of results to return.

BigDecimal skip = Arrays.asList(new BigDecimal()); // BigDecimal | The number of results to skip (used for paging).

String externalId = Arrays.asList("externalId_example"); // String | An external id to search for (which was associated with the video at upload).

String language = Arrays.asList("language_example"); // String | The language to search in. You can specify multiple language parameters (e.g. $language=English&language=French) to search multiple languages. Having no language parameter will search all languages. Supported languages: Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN.

Boolean searchInPublicAccount = Arrays.asList(true); // Boolean | Whether to look in the Public account (otherwise, in the user's account).

try {
    apiInstance.apiPartnerBreakdownsSearchGet(privacy, id, partition, owner, face, query, textScope, pageSize, skip, externalId, language, searchInPublicAccount);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privacy** | [**String**](.md)| A privacy level (Private, Organization, Public). | [optional]
 **id** | [**String**](.md)| A breakdown id to search for. | [optional]
 **partition** | [**String**](.md)| A partition to search for. | [optional]
 **owner** | [**String**](.md)| An owner to search for. | [optional]
 **face** | [**String**](.md)| A face to search for. | [optional]
 **query** | [**String**](.md)| Free text to search for. | [optional]
 **textScope** | [**String**](.md)| The text scope to search in. | [optional]
 **pageSize** | [**BigDecimal**](.md)| The number of results to return. | [optional]
 **skip** | [**BigDecimal**](.md)| The number of results to skip (used for paging). | [optional]
 **externalId** | [**String**](.md)| An external id to search for (which was associated with the video at upload). | [optional]
 **language** | [**String**](.md)| The language to search in. You can specify multiple language parameters (e.g. $language&#x3D;English&amp;language&#x3D;French) to search multiple languages. Having no language parameter will search all languages. Supported languages: Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN. | [optional]
 **searchInPublicAccount** | [**Boolean**](.md)| Whether to look in the Public account (otherwise, in the user&#x27;s account). | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsUpdateFaceNameIdPut"></a>
# **apiPartnerBreakdownsUpdateFaceNameIdPut**
> apiPartnerBreakdownsUpdateFaceNameIdPut(id, faceId, newName)

Update Face Name

Updates the name of the given face and trains the face model to recognize that face in future videos.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id.

BigDecimal faceId = Arrays.asList(new BigDecimal()); // BigDecimal | The face id (from the video's json)

String newName = Arrays.asList("newName_example"); // String | The new name for the face (use 'Unknown #1/2/3...' to make it anonymous again)

try {
    apiInstance.apiPartnerBreakdownsUpdateFaceNameIdPut(id, faceId, newName);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsUpdateFaceNameIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id. |
 **faceId** | [**BigDecimal**](.md)| The face id (from the video&#x27;s json) |
 **newName** | [**String**](.md)| The new name for the face (use &#x27;Unknown #1/2/3...&#x27; to make it anonymous again) |


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="apiPartnerBreakdownsUpdateTranscriptIdPut"></a>
# **apiPartnerBreakdownsUpdateTranscriptIdPut**
> apiPartnerBreakdownsUpdateTranscriptIdPut(id, language, body, callbackUrl, setAsSourceLanguage)

Update Transcript

Updates the video with the given transcript. If the specified language is the source language of the video, then the video will be re-indexed with the given transcript, and the transcript of all the other languages will be re-generated. If the specified language is not the source language, the transcript of that language will be updated and the new text will be written into the existing lines and blocks of that language.

### Example
```java
// Import classes:
//import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiException;
//import semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi;



DefaultApi apiInstance = new DefaultApi();

String id = Arrays.asList("id_example"); // String | The breakdown id.

String language = Arrays.asList("language_example"); // String | The language to update. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN.

Object body = ; // Object | 

String callbackUrl = Arrays.asList("callbackUrl_example"); // String | For example, if the callback url is 'https://test.com/notifyme?projectName=MyProject', the notification will be sent with additional parameters to 'https://test.com/notifyme?projectName=MyProject&id=1234abcd&state=Processed'.

String setAsSourceLanguage = Arrays.asList("setAsSourceLanguage_example"); // String | If true the language parameter will be set as source language.

try {
    apiInstance.apiPartnerBreakdownsUpdateTranscriptIdPut(id, language, body, callbackUrl, setAsSourceLanguage);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#apiPartnerBreakdownsUpdateTranscriptIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| The breakdown id. |
 **language** | [**String**](.md)| The language to update. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN. |
 **body** | [**Object**](Object.md)|  | [optional]
 **callbackUrl** | [**String**](.md)| For example, if the callback url is &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&#x27;, the notification will be sent with additional parameters to &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&amp;id&#x3D;1234abcd&amp;state&#x3D;Processed&#x27;. | [optional]
 **setAsSourceLanguage** | [**String**](.md)| If true the language parameter will be set as source language. | [optional]


### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined



