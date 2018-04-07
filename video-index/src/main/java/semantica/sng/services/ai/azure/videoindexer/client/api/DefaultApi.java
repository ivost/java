package semantica.sng.services.ai.azure.videoindexer.client.api;

import semantica.sng.services.ai.azure.videoindexer.client.invoker.ApiClient;

import java.math.BigDecimal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-04-07T09:02:34.863-07:00")
@Component("semantica.sng.services.ai.azure.videoindexer.client.api.DefaultApi")

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Brands
     * Gets all custom brands per the account and Bing brands activation state (whether Bing brands should be used when applying the model)
     * <p><b>200</b> - Array of brands and state (true / false) of Bing brands in model
     * <p><b>400</b> - May occur on invalid input
     * <p><b>500</b> - Failed to get brands due to an unexpected error
     * @param accountId Account&#x27;s Id
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationBrandsGet(String accountId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling apiCustomizationBrandsGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Customization/Brands").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountId", accountId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Delete Brand
     * Removes brand for the specified account
     * <p><b>204</b> - Brand was successfully deleted
     * <p><b>400</b> - May occur on invalid input
     * <p><b>500</b> - Failed to delete brand due to an unexpected error
     * @param id The id parameter
     * @param accountId Account&#x27;s Id
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationBrandsIdDelete(String id, String accountId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCustomizationBrandsIdDelete");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling apiCustomizationBrandsIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Customization/Brands/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountId", accountId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Brand
     * Get specific custom brand
     * <p><b>200</b> - The requested custom brand
     * <p><b>400</b> - May occur on invalid input
     * <p><b>404</b> - Brand with the given id was not found in the specified account
     * <p><b>500</b> - Failed to get brand due to an unexpected error
     * @param id Brand&#x27;s Id
     * @param accountId Account&#x27;s Id
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationBrandsIdGet(Integer id, String accountId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCustomizationBrandsIdGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling apiCustomizationBrandsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Customization/Brands/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountId", accountId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Update Brand
     * Updates specific brand&#x27;s metadata
     * <p><b>200</b> - The updated brand
     * <p><b>400</b> - May occur when account id is invalid, brand already exists or on invalid input
     * <p><b>500</b> - Failed to update brand due to an unexpected error
     * @param id Brand&#x27;s Id
     * @param accountId Account&#x27;s Id
     * @param body The body parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationBrandsIdPut(Integer id, String accountId, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCustomizationBrandsIdPut");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling apiCustomizationBrandsIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Customization/Brands/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountId", accountId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Create Brand
     * Creates new custom brand for the specified account
     * <p><b>201</b> - The newly created brand
     * <p><b>400</b> - May occur when brand already exists or on invalid input
     * <p><b>500</b> - Failed to create brand due to an unexpected error
     * @param accountId Account&#x27;s Id
     * @param body The body parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationBrandsPost(String accountId, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling apiCustomizationBrandsPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Customization/Brands").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountId", accountId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Update Bing brands activation state
     * Enable / disable the usage of Bing brands in model
     * <p><b>200</b> - Current state
     * <p><b>400</b> - May occur on invalid input
     * <p><b>500</b> - Failed to update state due to an unexpected error
     * @param accountId Acocunt&#x27;s Id
     * @param body The body parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationBrandsToggleModelActivationStatePut(String accountId, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling apiCustomizationBrandsToggleModelActivationStatePut");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Customization/Brands/ToggleModelActivationState").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountId", accountId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Delete Linguistic Model
     * Deletes the uploaded video and if deleteInsights&#x3D;true, then deletes the generated insights as well.
     * <p><b>204</b> - Delete successful
     * <p><b>400</b> - Model not found
     * <p><b>500</b> - Server error
     * @param modelId Model id
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageModelModelIdDelete(String modelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling apiCustomizationLanguageModelModelIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("modelId", modelId);
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/Model/{modelId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get linguistic model
     * Returns the model meta data
     * <p><b>200</b> - Model status
     * <p><b>500</b> - Server error
     * @param modelId The model id
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageModelModelIdGet(String modelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling apiCustomizationLanguageModelModelIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("modelId", modelId);
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/Model/{modelId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Create linguistic model
     * Creates a linguistic model by getting a training data id. The returned linguistic model id must be verified as ready before used for indexing.
     * <p><b>200</b> - Linguistic model id
     * <p><b>400</b> - Indicate that one of the following occurred: - TrainingData not found.
     * <p><b>500</b> - Failed to create model due to unexpected error
     * @param trainingDataIds Array of training data id&#x27;s. Example: [\&quot;7bb2f6bb-8396-4afb-93e7-96c359b75796\&quot;]
     * @param waitUntilReady Should wait until the training is complet
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageModelPost(String trainingDataIds, String waitUntilReady) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'trainingDataIds' is set
        if (trainingDataIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'trainingDataIds' when calling apiCustomizationLanguageModelPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/Model").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "trainingDataIds", trainingDataIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "waitUntilReady", waitUntilReady));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Delete linguistic training data group
     * Deletes the training data group and all training data files under that group.
     * <p><b>204</b>
     * <p><b>400</b> - Group not found
     * <p><b>500</b> - Server error
     * @param id Group id
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageTrainingDataGroupIdDelete(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCustomizationLanguageTrainingDataGroupIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/TrainingDataGroup/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get linguistic training data group
     * Get information about a training data group.
     * <p><b>200</b> - Get the training data group
     * <p><b>400</b> - Indicate that one of the following occurred: - Invalid language
     * <p><b>500</b> - Failed to create model due to unexpected error
     * @param id The id parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageTrainingDataGroupIdGet(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCustomizationLanguageTrainingDataGroupIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/TrainingDataGroup/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Update linguistic training data group
     * 
     * <p><b>204</b>
     * <p><b>400</b> - Indicate that one of the following occurred: - Invalid language
     * <p><b>500</b> - Failed to create model due to unexpected error
     * @param id The group id
     * @param name Name of the training data
     * @param language Training data language.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageTrainingDataGroupIdPut(Integer id, String name, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCustomizationLanguageTrainingDataGroupIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/TrainingDataGroup/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Create linguistic training data group
     * 
     * <p><b>200</b> - Training group id
     * <p><b>400</b> - Indicate that one of the following occurred: - Invalid language
     * <p><b>500</b> - Failed to create model due to unexpected error
     * @param name Name of the training data
     * @param language Training data language.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageTrainingDataGroupPost(String name, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling apiCustomizationLanguageTrainingDataGroupPost");
        }
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'language' when calling apiCustomizationLanguageTrainingDataGroupPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/TrainingDataGroup").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Delete linguistic training data
     * Deletes the training data by Id
     * <p><b>200</b> - True if deletion was successful else false.
     * <p><b>400</b> - Training data not found
     * <p><b>500</b> - Internal server error
     * @param id The training data ID
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageTrainingDataIdDelete(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCustomizationLanguageTrainingDataIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/TrainingData/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Update linguistic training data
     * Update the linguistic training data.
     * <p><b>200</b> - Training data metadata.
     * <p><b>400</b> - Indicate that one of the following occurred: - Another model with the same name and language already exists. - Model data is invalid or missing.
     * <p><b>500</b> - Failed to create model due to unexpected error
     * @param id Training data id.
     * @param name Name of the training data
     * @param description Description of training data
     * @param language Training data language.
     * @param groupName Training data group. Example: &#x27;Medical, Sport etc.&#x27;
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageTrainingDataIdPut(String id, String name, String description, String language, String groupName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCustomizationLanguageTrainingDataIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/TrainingData/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "description", description));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupName", groupName));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Add linguistic training data
     * Uploads the linguistic training data to be used to create a linguistic model.
     * <p><b>200</b> - Training data metadata.
     * <p><b>400</b> - Indicate that one of the following occurred: - Another model with the same name and language already exists. - Model data is invalid or missing.
     * <p><b>500</b> - Failed to create model due to unexpected error
     * @param name Name of the training data
     * @param language Training data language.
     * @param description Description of training data
     * @param groupName Training data group. Example: &#x27;Medical, Sport etc.&#x27;
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageTrainingDataPost(String name, String language, String description, String groupName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling apiCustomizationLanguageTrainingDataPost");
        }
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'language' when calling apiCustomizationLanguageTrainingDataPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/TrainingData").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "description", description));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupName", groupName));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get linguistic training data
     * Get linguistic training data
     * <p><b>200</b> - Lists of training data metadata that
     * <p><b>400</b> - File not found
     * <p><b>500</b>
     * @param trainingFileId Training data file id. If not specified we return the status of all the files.
     * @param includeFileContent If true we include the content of the file in the response. This argument is only valid for a specific file. If no training data id is provided we will ignore it.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiCustomizationLanguageTrainingDataTrainingFileIdGet(String trainingFileId, String includeFileContent) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'trainingFileId' is set
        if (trainingFileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'trainingFileId' when calling apiCustomizationLanguageTrainingDataTrainingFileIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("trainingFileId", trainingFileId);
        String path = UriComponentsBuilder.fromPath("/Api/Customization/Language/TrainingData/{trainingFileId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeFileContent", includeFileContent));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Accounts
     * Returns the details of the user&#x27;s accounts.
     * <p><b>200</b> - User accounts
     * <p><b>500</b> - Server error
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerAccountsGet() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Accounts").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Insights Widget Url By External Id
     * Gets a url to the cognitive insights widget url, including an access token, based on a given external id. This API will only work for breakdowns which are owned by this subscription.
     * <p><b>200</b> - Widget URL
     * <p><b>400</b> - Widget type is not valid
     * <p><b>500</b> - Server error
     * @param externalId An external id to search for (which was associated with a video of this subscription at upload). 
     * @param widgetType A type of a sub-widget to include (People, Sentiments, Keywords, Search)
     * @param allowEdit Whether to allow the user to edit the insights (faces names, transcript, etc).
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet(String externalId, String widgetType, Boolean allowEdit) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling apiPartnerBreakdownsGetInsightsWidgetUrlByExternalIdGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/GetInsightsWidgetUrlByExternalId").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalId", externalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "widgetType", widgetType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allowEdit", allowEdit));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Delete Breakdown
     * Deletes the uploaded video and if deleteInsights&#x3D;true, then deletes the generated insights as well.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Invalid breakdown id
     * <p><b>500</b> - Server error
     * @param id The breakdown id (video id), returned by the Upload or Search APIs.
     * @param deleteInsights Whether to delete the generated insights as well.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsIdDelete(String id, Boolean deleteInsights) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "deleteInsights", deleteInsights));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Breakdown
     * Returns the full details of the the given breakdown including all the insights (transcript, OCR, people, etc). The full details include the topics, the faces, the blocks, etc. Each block includes time ranges, transcript lines, OCR lines, sentiments, faces and their block thumbnails.
     * <p><b>200</b> - Success
     * <p><b>500</b> - Server error
     * @param id The breakdown id (video id), returned by the Upload or Search APIs.
     * @param language The requested language of the text. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public String apiPartnerBreakdownsIdGet(String id, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        //String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        String[] authNames = new String[] { "apiKeyHeader" };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Access Token
     * Gets an access token to a video, which can be used for other operations, like getting a thumbnail.
     * <p><b>200</b> - Success
     * <p><b>500</b> - Server error
     * @param id The video id.
     * @param allowEdit A boolean that if set to true will return accessToken with editing permissions.  (remove face, edit text etc...)
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsIdGetAccessTokenGet(String id, Boolean allowEdit) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsIdGetAccessTokenGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/{id}/GetAccessToken").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allowEdit", allowEdit));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Insights Widget Url
     * Gets a url to the cognitive insights widget url, including an access token.
     * <p><b>200</b> - Widget url
     * <p><b>400</b> - Widget type is not valid
     * <p><b>500</b> - Server error
     * @param id The breakdown id.
     * @param widgetType A type of a sub-widget to include (People, Sentiments, Keywords, Search)
     * @param allowEdit Whether to allow the user to edit the insights (faces names, transcript, etc).
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsIdInsightsWidgetUrlGet(String id, String widgetType, Boolean allowEdit) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsIdInsightsWidgetUrlGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/{id}/InsightsWidgetUrl").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "widgetType", widgetType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allowEdit", allowEdit));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Player Widget Url
     * Gets a url to the player widget url, including an access token.
     * <p><b>200</b> - Widget URL
     * <p><b>500</b> - Server error
     * @param id The breakdown id.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsIdPlayerWidgetUrlGet(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsIdPlayerWidgetUrlGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/{id}/PlayerWidgetUrl").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Processing State
     * Gets the processing state of the given breakdown id (Uploaded, Processing, Processed, Failed) and if Processing it returns the progress (e.g. 30%).
     * <p><b>200</b> - Breakdown state
     * <p><b>404</b> - Breakdown not found
     * <p><b>500</b> - Server error
     * @param id The breakdown id.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsIdStateGet(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsIdStateGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/{id}/State").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Get Vtt Url
     * Gets a url to a VTT file with the given breakdown&#x27;s captions.
     * <p><b>200</b> - Url to VTT file
     * <p><b>500</b> - Server error
     * @param id The breakdown id (video id), returned by the Upload or Search APIs.
     * @param language The requested language of the VTT. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsIdVttUrlGet(String id, String language) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsIdVttUrlGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/{id}/VttUrl").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Upload
     * Uploads the given video, starts indexing it and returns a new breakdown id. The supported formats are listed here: https://docs.microsoft.com/en-us/azure/media-services/media-services-media-encoder-standard-formats)
     * <p><b>200</b> - Success - breakdown id
     * <p><b>400</b> - Invalid parameter
     * <p><b>500</b> - Server error
     * @param name The video name.
     * @param privacy The video privacy (Private or Public).
     * @param body The body parameter
     * @param videoUrl A public url of the video/audio file (url encoded). If not specified, the file should be passed as a multipart/form body content.
     * @param language The language of the video, to be used when generating the transcript. Arabic: ar-EG, Chinese (Simplified): zh-Hans, English: en-US, French: fr-FR, German: de-DE, Italian: it-IT, Japanese: ja-JP, Portuguese: pt-BR, Russian: ru-RU, Spanish: es-ES.
     * @param externalId An external id to associate with the video (can be searched for later).
     * @param metadata Metadata to associate with the video (will be returned in queries).
     * @param description The video description.
     * @param partition A partition to partition videos by (used for searching a specific partition)
     * @param callbackUrl A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&#x27;, the notification will be sent with additional parameters to &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&amp;id&#x3D;1234abcd&amp;state&#x3D;Processed&#x27;.
     * @param indexingPreset The indexing preset to use (Default/AudioOnly/DefaultWithNoiseReduction).
     * @param streamingPreset The streaming preset to use (Default/AdaptiveBitrate).
     * @param linguisticModelId Linguistic model id as received by &#x27;create linguistic model&#x27; call
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsPost(String name, String privacy, Object body, String videoUrl, String language, String externalId, String metadata, String description, String partition, String callbackUrl, String indexingPreset, String streamingPreset, String linguisticModelId) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling apiPartnerBreakdownsPost");
        }
        
        // verify the required parameter 'privacy' is set
        if (privacy == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'privacy' when calling apiPartnerBreakdownsPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "privacy", privacy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "videoUrl", videoUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalId", externalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadata", metadata));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "description", description));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partition", partition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "callbackUrl", callbackUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "indexingPreset", indexingPreset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "streamingPreset", streamingPreset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "linguisticModelId", linguisticModelId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Re-Index Breakdown
     * Re-indexes the given breakdown.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Breakdown is still under processing
     * <p><b>500</b> - Reindex failed
     * @param id The breakdown id.
     * @param callbackUrl A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&#x27;, the notification will be sent with additional parameters to &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&amp;id&#x3D;1234abcd&amp;state&#x3D;Processed&#x27;.
     * @param indexingPreset The indexing preset to use (Default/AudioOnly) 
     * @param streamingPreset The streaming preset to use (Default/AdaptiveBitrate)
     * @param sourceLanguage The media&#x27;s source language. If not provided, source language will remain unchanged
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsReindexIdPut(String id, String callbackUrl, String indexingPreset, String streamingPreset, String sourceLanguage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsReindexIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/reindex/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "callbackUrl", callbackUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "indexingPreset", indexingPreset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "streamingPreset", streamingPreset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sourceLanguage", sourceLanguage));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Re-Index Breakdown By External Id
     * Re-indexes the video of the given external id.
     * <p><b>200</b> - Success
     * <p><b>500</b> - Operation failed
     * @param externalId An external id (which was associated with a video of this subscription at upload).
     * @param callbackUrl A url to notify when indexing is completed. It should be a POST url and VideoIndexer will add 2 additional query string parameters to it: id and state.  For example, if the callback url is &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&#x27;, the notification will be sent with additional parameters to &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&amp;id&#x3D;1234abcd&amp;state&#x3D;Processed&#x27;.
     * @param indexingPreset The indexing preset to use (Default/AudioOnly)
     * @param streamingPreset The streaming preset to use (Default/AdaptiveBitrate)
     * @param sourceLanguage The media&#x27;s source language. If not provided, source language will remain unchanged
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsReindexbyexternalidExternalIdPut(String externalId, String callbackUrl, String indexingPreset, String streamingPreset, String sourceLanguage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling apiPartnerBreakdownsReindexbyexternalidExternalIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("externalId", externalId);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/reindexbyexternalid/{externalId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "callbackUrl", callbackUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "indexingPreset", indexingPreset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "streamingPreset", streamingPreset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sourceLanguage", sourceLanguage));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Search
     * Performs search and returns the search results. If available, returns the matches of the search filters in the results.
     * <p><b>200</b> - Search results
     * <p><b>500</b> - Server error
     * @param privacy A privacy level (Private, Organization, Public).
     * @param id A breakdown id to search for.
     * @param partition A partition to search for.
     * @param owner An owner to search for.
     * @param face A face to search for.
     * @param query Free text to search for.
     * @param textScope The text scope to search in.
     * @param pageSize The number of results to return.
     * @param skip The number of results to skip (used for paging).
     * @param externalId An external id to search for (which was associated with the video at upload).
     * @param language The language to search in. You can specify multiple language parameters (e.g. $language&#x3D;English&amp;language&#x3D;French) to search multiple languages. Having no language parameter will search all languages. Supported languages: Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN.
     * @param searchInPublicAccount Whether to look in the Public account (otherwise, in the user&#x27;s account).
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsSearchGet(String privacy, String id, String partition, String owner, String face, String query, String textScope, BigDecimal pageSize, BigDecimal skip, String externalId, String language, Boolean searchInPublicAccount) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/Search").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "privacy", privacy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partition", partition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "owner", owner));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "face", face));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "textScope", textScope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalId", externalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "searchInPublicAccount", searchInPublicAccount));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Update Face Name
     * Updates the name of the given face and trains the face model to recognize that face in future videos.
     * <p><b>200</b> - Success
     * <p><b>400</b> - new face name is not valid or breakdown is still in process
     * <p><b>500</b> - Server error
     * @param id The breakdown id.
     * @param faceId The face id (from the video&#x27;s json)
     * @param newName The new name for the face (use &#x27;Unknown #1/2/3...&#x27; to make it anonymous again)
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsUpdateFaceNameIdPut(String id, BigDecimal faceId, String newName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsUpdateFaceNameIdPut");
        }
        
        // verify the required parameter 'faceId' is set
        if (faceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'faceId' when calling apiPartnerBreakdownsUpdateFaceNameIdPut");
        }
        
        // verify the required parameter 'newName' is set
        if (newName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newName' when calling apiPartnerBreakdownsUpdateFaceNameIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/UpdateFaceName/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "faceId", faceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "newName", newName));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Update Transcript
     * Updates the video with the given transcript. If the specified language is the source language of the video, then the video will be re-indexed with the given transcript, and the transcript of all the other languages will be re-generated. If the specified language is not the source language, the transcript of that language will be updated and the new text will be written into the existing lines and blocks of that language.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Breakdown is still in process or VTT is not valid
     * <p><b>500</b> - Server error
     * @param id The breakdown id.
     * @param language The language to update. Afrikaans: Af-ZA, Arabic: ar-EG, Bangla: Bn-BD, Bosnian: Bs-Latn, Bulgarian: Bg-BG, Catalan: Ca-ES, Chinese (Simplified): zh-Hans, Chinese (Traditional): Zh-Hant, Croatian: Hr-HR, Czech: Cs-CZ, Danish: Da-DK, Dutch: Nl-NL, English: en-US, Estonian: Et-EE, Fijian: En-FJ, Filipino: fil-PH, Finnish: Fi-FI, French: fr-FR, German: de-DE, Greek: El-GR, Haitian: Fr-HT, Hebrew: He-IL, Hindi: Hi-IN, Hungarian: Hu-HU, Indonesian: Id-ID, Italian: it-IT, Japanese: ja-JP, Kiswahili: Sw-KE, Korean: Ko-KR, Latvian: Lv-LV, Lithuanian: Lt-LT, Malagasy: Mg-MG, Malay: Ms-MY, Maltese: Mt-MT, Norwegian: Nb-NO, Persian: Fa-IR, Polish: Pl-PL, Portuguese: pt-BR, Romanian: Ro-RO, Russian: ru-RU, Samoan: En-WS, Serbian (Cyrillic): Sr-Cyrl-RS, Serbian (Latin): Sr-Latn-RS, Slovak: Sk-SK, Slovenian: Sl-SI, Spanish: es-ES, Swedish: Sv-SE, Tamil: Ta-IN, Thai: Th-TH, Tongan: To-TO, Turkish: Tr-TR, Ukrainian: Uk-UA, Urdu: Ur-PK, Vietnamese: Vi-VN.
     * @param body The body parameter
     * @param callbackUrl For example, if the callback url is &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&#x27;, the notification will be sent with additional parameters to &#x27;https://test.com/notifyme?projectName&#x3D;MyProject&amp;id&#x3D;1234abcd&amp;state&#x3D;Processed&#x27;.
     * @param setAsSourceLanguage If true the language parameter will be set as source language.
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void apiPartnerBreakdownsUpdateTranscriptIdPut(String id, String language, Object body, String callbackUrl, String setAsSourceLanguage) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPartnerBreakdownsUpdateTranscriptIdPut");
        }
        
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'language' when calling apiPartnerBreakdownsUpdateTranscriptIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/Api/Partner/Breakdowns/UpdateTranscript/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "callbackUrl", callbackUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "setAsSourceLanguage", setAsSourceLanguage));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKeyHeader", "apiKeyQuery" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
}

