package academy.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePutRequestBody {
    private Long id;
    @NotEmpty(message = "Anime's name cannot be null or empty")
    private String name;
}
