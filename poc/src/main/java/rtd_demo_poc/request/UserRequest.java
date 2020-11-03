package rtd_demo_poc.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "User request")
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotEmpty
    @Size(min = 3)
    @JsonProperty("first_name")
    @ApiModelProperty(name = "William", notes = "This is first name", example = "William", required = true)
    private String firstName;

    @Size(min = 3)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("last_name")
    @ApiModelProperty(name = "sergy", notes = "This is last name", example = "Sergy", required = true)
    private String lastName;

    @NotEmpty
    @Size(min = 10, max = 13)
    @ApiModelProperty(name = "9898989898", notes = "This is mobile number", example = "9898989898", required = true)
    private String phone;
}
