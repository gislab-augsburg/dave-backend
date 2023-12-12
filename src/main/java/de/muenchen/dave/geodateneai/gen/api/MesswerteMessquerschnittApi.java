package de.muenchen.dave.geodateneai.gen.api;

import de.muenchen.dave.geodateneai.gen.geodaten.ApiClient;

import de.muenchen.dave.geodateneai.gen.model.GetMesswerteIntervallMessquerschnittResponse;
import de.muenchen.dave.geodateneai.gen.model.GetMesswerteOfMessquerschnittRequest;
import de.muenchen.dave.geodateneai.gen.model.GetMesswerteTagesaggregatMessquerschnittResponse;
import de.muenchen.dave.geodateneai.gen.model.InformationResponseDto;
import de.muenchen.dave.geodateneai.gen.model.LoadDataResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MesswerteMessquerschnittApi {
    private ApiClient apiClient;

    public MesswerteMessquerschnittApi() {
        this(new ApiClient());
    }

    @Autowired
    public MesswerteMessquerschnittApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Holt die MesswerteIntervalle zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - MesswerteIntervalle erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @param getMesswerteOfMessquerschnittRequest The getMesswerteOfMessquerschnittRequest parameter
     * @return GetMesswerteIntervallMessquerschnittResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMesswerteIntervallRequestCreation(GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest) throws WebClientResponseException {
        Object postBody = getMesswerteOfMessquerschnittRequest;
        // verify the required parameter 'getMesswerteOfMessquerschnittRequest' is set
        if (getMesswerteOfMessquerschnittRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'getMesswerteOfMessquerschnittRequest' when calling getMesswerteIntervall", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetMesswerteIntervallMessquerschnittResponse> localVarReturnType = new ParameterizedTypeReference<GetMesswerteIntervallMessquerschnittResponse>() {};
        return apiClient.invokeAPI("/messwerte/messquerschnitt/intervall", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Holt die MesswerteIntervalle zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - MesswerteIntervalle erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @param getMesswerteOfMessquerschnittRequest The getMesswerteOfMessquerschnittRequest parameter
     * @return GetMesswerteIntervallMessquerschnittResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetMesswerteIntervallMessquerschnittResponse> getMesswerteIntervall(GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetMesswerteIntervallMessquerschnittResponse> localVarReturnType = new ParameterizedTypeReference<GetMesswerteIntervallMessquerschnittResponse>() {};
        return getMesswerteIntervallRequestCreation(getMesswerteOfMessquerschnittRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Holt die MesswerteIntervalle zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - MesswerteIntervalle erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @param getMesswerteOfMessquerschnittRequest The getMesswerteOfMessquerschnittRequest parameter
     * @return ResponseEntity&lt;GetMesswerteIntervallMessquerschnittResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetMesswerteIntervallMessquerschnittResponse>> getMesswerteIntervallWithHttpInfo(GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetMesswerteIntervallMessquerschnittResponse> localVarReturnType = new ParameterizedTypeReference<GetMesswerteIntervallMessquerschnittResponse>() {};
        return getMesswerteIntervallRequestCreation(getMesswerteOfMessquerschnittRequest).toEntity(localVarReturnType);
    }

    /**
     * Holt die MesswerteIntervalle zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - MesswerteIntervalle erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @param getMesswerteOfMessquerschnittRequest The getMesswerteOfMessquerschnittRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMesswerteIntervallWithResponseSpec(GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest) throws WebClientResponseException {
        return getMesswerteIntervallRequestCreation(getMesswerteOfMessquerschnittRequest);
    }
    /**
     * Holt das Tagesaggregat der Messwerte zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - Tagesaggregat der Messwerte erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @param getMesswerteOfMessquerschnittRequest The getMesswerteOfMessquerschnittRequest parameter
     * @return GetMesswerteTagesaggregatMessquerschnittResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMesswerteTagesaggregatRequestCreation(GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest) throws WebClientResponseException {
        Object postBody = getMesswerteOfMessquerschnittRequest;
        // verify the required parameter 'getMesswerteOfMessquerschnittRequest' is set
        if (getMesswerteOfMessquerschnittRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'getMesswerteOfMessquerschnittRequest' when calling getMesswerteTagesaggregat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetMesswerteTagesaggregatMessquerschnittResponse> localVarReturnType = new ParameterizedTypeReference<GetMesswerteTagesaggregatMessquerschnittResponse>() {};
        return apiClient.invokeAPI("/messwerte/messquerschnitt/tagesaggregat", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Holt das Tagesaggregat der Messwerte zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - Tagesaggregat der Messwerte erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @param getMesswerteOfMessquerschnittRequest The getMesswerteOfMessquerschnittRequest parameter
     * @return GetMesswerteTagesaggregatMessquerschnittResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetMesswerteTagesaggregatMessquerschnittResponse> getMesswerteTagesaggregat(GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetMesswerteTagesaggregatMessquerschnittResponse> localVarReturnType = new ParameterizedTypeReference<GetMesswerteTagesaggregatMessquerschnittResponse>() {};
        return getMesswerteTagesaggregatRequestCreation(getMesswerteOfMessquerschnittRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Holt das Tagesaggregat der Messwerte zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - Tagesaggregat der Messwerte erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @param getMesswerteOfMessquerschnittRequest The getMesswerteOfMessquerschnittRequest parameter
     * @return ResponseEntity&lt;GetMesswerteTagesaggregatMessquerschnittResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetMesswerteTagesaggregatMessquerschnittResponse>> getMesswerteTagesaggregatWithHttpInfo(GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetMesswerteTagesaggregatMessquerschnittResponse> localVarReturnType = new ParameterizedTypeReference<GetMesswerteTagesaggregatMessquerschnittResponse>() {};
        return getMesswerteTagesaggregatRequestCreation(getMesswerteOfMessquerschnittRequest).toEntity(localVarReturnType);
    }

    /**
     * Holt das Tagesaggregat der Messwerte zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - Tagesaggregat der Messwerte erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @param getMesswerteOfMessquerschnittRequest The getMesswerteOfMessquerschnittRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMesswerteTagesaggregatWithResponseSpec(GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest) throws WebClientResponseException {
        return getMesswerteTagesaggregatRequestCreation(getMesswerteOfMessquerschnittRequest);
    }
    /**
     * Holt die MesswerteIntervalle zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - MesswerteIntervalle erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @return LoadDataResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec loadDataRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<LoadDataResponse> localVarReturnType = new ParameterizedTypeReference<LoadDataResponse>() {};
        return apiClient.invokeAPI("/messwerte/messquerschnitt/loaddata", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Holt die MesswerteIntervalle zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - MesswerteIntervalle erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @return LoadDataResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LoadDataResponse> loadData() throws WebClientResponseException {
        ParameterizedTypeReference<LoadDataResponse> localVarReturnType = new ParameterizedTypeReference<LoadDataResponse>() {};
        return loadDataRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Holt die MesswerteIntervalle zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - MesswerteIntervalle erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @return ResponseEntity&lt;LoadDataResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<LoadDataResponse>> loadDataWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<LoadDataResponse> localVarReturnType = new ParameterizedTypeReference<LoadDataResponse>() {};
        return loadDataRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Holt die MesswerteIntervalle zu einem Messquerschnitt in einem bestimmten Zeitraum.
     * 
     * <p><b>200</b> - MesswerteIntervalle erfolgreich abgefragt.
     * <p><b>500</b> - Bei der Erstellung oder Durchführung des Requests ist ein Fehler aufgetreten.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec loadDataWithResponseSpec() throws WebClientResponseException {
        return loadDataRequestCreation();
    }
}
