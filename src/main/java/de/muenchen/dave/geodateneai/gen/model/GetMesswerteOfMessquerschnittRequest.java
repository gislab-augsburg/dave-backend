/*
 * DAVE GEODATA EAI
 * DAVE GEODATA EAI - Service zum Abfragen von Geoinformationen
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: unbekannt@muenchen.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.muenchen.dave.geodateneai.gen.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetMesswerteOfMessquerschnittRequest
 */
@JsonPropertyOrder({
  GetMesswerteOfMessquerschnittRequest.JSON_PROPERTY_MESSQUERSCHNITT_IDS,
  GetMesswerteOfMessquerschnittRequest.JSON_PROPERTY_ZEITPUNKT_START,
  GetMesswerteOfMessquerschnittRequest.JSON_PROPERTY_ZEITPUNKT_ENDE,
  GetMesswerteOfMessquerschnittRequest.JSON_PROPERTY_TAGES_TYP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetMesswerteOfMessquerschnittRequest {
  public static final String JSON_PROPERTY_MESSQUERSCHNITT_IDS = "messquerschnittIds";
  private Set<String> messquerschnittIds = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ZEITPUNKT_START = "zeitpunktStart";
  private LocalDate zeitpunktStart;

  public static final String JSON_PROPERTY_ZEITPUNKT_ENDE = "zeitpunktEnde";
  private LocalDate zeitpunktEnde;

  /**
   * Gets or Sets tagesTyp
   */
  public enum TagesTypEnum {
    WERKTAG_DI_MI_DO("WERKTAG_DI_MI_DO"),
    
    WERKTAG_MO_FR("WERKTAG_MO_FR"),
    
    SAMSTAG("SAMSTAG"),
    
    SONNTAG_FEIERTAG("SONNTAG_FEIERTAG"),
    
    WERKTAG_FERIEN("WERKTAG_FERIEN");

    private String value;

    TagesTypEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TagesTypEnum fromValue(String value) {
      for (TagesTypEnum b : TagesTypEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TAGES_TYP = "tagesTyp";
  private TagesTypEnum tagesTyp;

  public GetMesswerteOfMessquerschnittRequest() {
  }

  public GetMesswerteOfMessquerschnittRequest messquerschnittIds(Set<String> messquerschnittIds) {
    
    this.messquerschnittIds = messquerschnittIds;
    return this;
  }

  public GetMesswerteOfMessquerschnittRequest addMessquerschnittIdsItem(String messquerschnittIdsItem) {
    if (this.messquerschnittIds == null) {
      this.messquerschnittIds = new LinkedHashSet<>();
    }
    this.messquerschnittIds.add(messquerschnittIdsItem);
    return this;
  }

   /**
   * Get messquerschnittIds
   * @return messquerschnittIds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSQUERSCHNITT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getMessquerschnittIds() {
    return messquerschnittIds;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_MESSQUERSCHNITT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessquerschnittIds(Set<String> messquerschnittIds) {
    this.messquerschnittIds = messquerschnittIds;
  }


  public GetMesswerteOfMessquerschnittRequest zeitpunktStart(LocalDate zeitpunktStart) {
    
    this.zeitpunktStart = zeitpunktStart;
    return this;
  }

   /**
   * Get zeitpunktStart
   * @return zeitpunktStart
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ZEITPUNKT_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getZeitpunktStart() {
    return zeitpunktStart;
  }


  @JsonProperty(JSON_PROPERTY_ZEITPUNKT_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZeitpunktStart(LocalDate zeitpunktStart) {
    this.zeitpunktStart = zeitpunktStart;
  }


  public GetMesswerteOfMessquerschnittRequest zeitpunktEnde(LocalDate zeitpunktEnde) {
    
    this.zeitpunktEnde = zeitpunktEnde;
    return this;
  }

   /**
   * Get zeitpunktEnde
   * @return zeitpunktEnde
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZEITPUNKT_ENDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getZeitpunktEnde() {
    return zeitpunktEnde;
  }


  @JsonProperty(JSON_PROPERTY_ZEITPUNKT_ENDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZeitpunktEnde(LocalDate zeitpunktEnde) {
    this.zeitpunktEnde = zeitpunktEnde;
  }


  public GetMesswerteOfMessquerschnittRequest tagesTyp(TagesTypEnum tagesTyp) {
    
    this.tagesTyp = tagesTyp;
    return this;
  }

   /**
   * Get tagesTyp
   * @return tagesTyp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGES_TYP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TagesTypEnum getTagesTyp() {
    return tagesTyp;
  }


  @JsonProperty(JSON_PROPERTY_TAGES_TYP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagesTyp(TagesTypEnum tagesTyp) {
    this.tagesTyp = tagesTyp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMesswerteOfMessquerschnittRequest getMesswerteOfMessquerschnittRequest = (GetMesswerteOfMessquerschnittRequest) o;
    return Objects.equals(this.messquerschnittIds, getMesswerteOfMessquerschnittRequest.messquerschnittIds) &&
        Objects.equals(this.zeitpunktStart, getMesswerteOfMessquerschnittRequest.zeitpunktStart) &&
        Objects.equals(this.zeitpunktEnde, getMesswerteOfMessquerschnittRequest.zeitpunktEnde) &&
        Objects.equals(this.tagesTyp, getMesswerteOfMessquerschnittRequest.tagesTyp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messquerschnittIds, zeitpunktStart, zeitpunktEnde, tagesTyp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMesswerteOfMessquerschnittRequest {\n");
    sb.append("    messquerschnittIds: ").append(toIndentedString(messquerschnittIds)).append("\n");
    sb.append("    zeitpunktStart: ").append(toIndentedString(zeitpunktStart)).append("\n");
    sb.append("    zeitpunktEnde: ").append(toIndentedString(zeitpunktEnde)).append("\n");
    sb.append("    tagesTyp: ").append(toIndentedString(tagesTyp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

