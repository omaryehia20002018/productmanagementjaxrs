package org.eclipse.jakarta.hello.exeception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

public class GlobalException implements ExceptionMapper<Throwable> {
    @Override
    public Response toResponse(Throwable throwable) {

        ApiException errorResponse =new ApiException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), throwable.getMessage());

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorResponse).build();
    }
}
