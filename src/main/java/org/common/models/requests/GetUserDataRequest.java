package org.common.models.requests;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.common.models.types.Request;

@EqualsAndHashCode(callSuper = true)
@Data
public final class GetUserDataRequest extends Request {
    private final String userId;
}
