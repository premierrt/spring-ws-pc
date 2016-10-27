package client;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import rafal.kod.jaxb.GetOfferDetailsRequest2;
import rafal.kod.jaxb.GetOfferDetailsResponse2;

@Service
public class GetOD2Service {

	@Autowired
	private WebServiceTemplate wst;
	
	public GetOfferDetailsResponse2 getOD2(GetOfferDetailsRequest2 request){
		
		GetOfferDetailsResponse2 response = (GetOfferDetailsResponse2) wst.marshalSendAndReceive(request);
		return response;
	}
	
public JAXBElement<GetOfferDetailsResponse2> getOD2( JAXBElement<GetOfferDetailsRequest2> request){
		
		JAXBElement<GetOfferDetailsResponse2> response = (JAXBElement< GetOfferDetailsResponse2>) wst.marshalSendAndReceive(request);
		return response;
	}
}
