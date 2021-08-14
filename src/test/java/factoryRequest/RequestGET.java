package factoryRequest;

import javax.ws.rs.core.Response;

public class RequestGET extends  Request{
    @Override
    public ResponseInformation send(RequestInformation requestInformation) {

        ResponseInformation responseInformation= new ResponseInformation();
        System.out.println("INFO > GET "+requestInformation.getUrl());
        Response response =this.client.target(requestInformation.getUrl()).request().get();
        responseInformation.setBody(response.readEntity(String.class));
        responseInformation.setCode(response.getStatus());
        System.out.println("INFO > GET "+responseInformation.getBody());
        System.out.println("INFO > GET "+responseInformation.getCode());
        response.close();

        return responseInformation;
    }
}
