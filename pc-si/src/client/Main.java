package client;

import javax.xml.bind.JAXBElement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rafal.kod.jaxb.GetOfferDetailsRequest2;
import rafal.kod.jaxb.GetOfferDetailsResponse2;
import rafal.kod.jaxb.ObjectFactory;
import rafal.kod.jaxb.ProcessType;
import rafal.kod.jaxb.Roles;
import rafal.kod.jaxb.SalesChannel;

public class Main {

	public static void main (String[] s){
       
		//http://blog.bdoughan.com/2012/07/jaxb-and-root-elements.html
		//http://stackoverflow.com/questions/24519449/unable-to-marshal-type-as-an-element-because-it-is-missing-an-xmlrootelement-an
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       GetOD2Service got2Service = (GetOD2Service)context.getBean(GetOD2Service.class);
       
       /// dodac jeszcze jedna warstwe ustawiaj¹ca pola ? populator
       
       GetOfferDetailsRequest2 god2Request = new ObjectFactory().createGetOfferDetailsRequest2();
       JAXBElement<GetOfferDetailsRequest2> god2JAXB =new ObjectFactory().createGetOfferDetails2(god2Request);
      // god2Request.setClientLegalType(new Long(1));
       
       
       god2Request.setSalesChannel(SalesChannel.ESHOP);
       god2Request.setProcessType(ProcessType.STANDARD);
       Roles roles = new Roles();
       roles.getRole().add(("PC_O_ESHOP"));
       god2Request.setRoles(roles);
       god2Request.setOfferId(new Long("4000706239"));
      JAXBElement< GetOfferDetailsResponse2> response= got2Service.getOD2(god2JAXB);
     //  System.out.println( response.getOffer().getBrand() );
      GetOfferDetailsResponse2 res =response.getValue();
      System.out.println( res.getOffer().getBrand() );       
       
       
	}
}
