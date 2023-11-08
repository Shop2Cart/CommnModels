package org.common.models.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.common.models.types.Request;

@Builder
@Getter
@AllArgsConstructor
public final class RegistrationRequest extends Request {
    private final String userId;
    private final String userFirstName;
    private final String userLastName;
    private final transient String password;
}
