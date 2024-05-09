package org.springtest.controller.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springtest.data.entity.User;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateNoteRequest {

    @NotNull(message = "id cannot be empty")
    private UUID id;

    @NotBlank
    @Size(min = 2, max = 200)
    private String title;

    @NotBlank
    @Size(min = 2, max = 2000)
    private String content;

    @NotNull
    private Long userId;
}
