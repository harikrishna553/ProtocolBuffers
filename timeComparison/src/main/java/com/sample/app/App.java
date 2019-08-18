package com.sample.app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.app.proto.generated.EmployeeDef.Employee;
import com.sample.app.proto.generated.EmployeeDef.Employee.Address;

public class App {

	private static Address addressProto = Address.newBuilder().setCity("Chirala").setState("Andhra Pradesh")
			.setCountry("India").build();

	private static Employee employeeProto = Employee.newBuilder().setFirstName("ram").setLastName("gurram").setId(1)
			.setAddress(addressProto).build();

	private static ObjectMapper mapper = new ObjectMapper();

	private static JAXBContext contextObj;

	private static Marshaller marshallerObj;

	private static com.sample.app.model.Employee emp;

	static {
		try {
			contextObj = JAXBContext.newInstance(com.sample.app.model.Employee.class);
			marshallerObj = contextObj.createMarshaller();
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			com.sample.app.model.Address addr = new com.sample.app.model.Address();
			addr.setCity("Chirala");
			addr.setState("Andhra Pradesh");
			addr.setCountry("India");

			emp = new com.sample.app.model.Employee();
			emp.setFirstName("ram");
			emp.setLastName("gurram");
			emp.setId(1);
			emp.setAddress(addr);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void marshalAndUnmarshallViaProtocolBuffer() throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		employeeProto.writeTo(bos);

		// System.out.println("Protocol Buffer serialized Length " + new
		// String(bos.toByteArray()).length());

		Employee parsedEmployee = Employee.parseFrom(bos.toByteArray());

	}

	private static void marshalAndUnmarshallViaJackson() throws IOException {
		byte[] bytes = mapper.writeValueAsBytes(emp);
		// System.out.println("JSON serialized Length " + new String(bytes).length());
		com.sample.app.model.Employee parsedEmployee = mapper.readValue(bytes, com.sample.app.model.Employee.class);
	}

	private static void marshalAndUnmarshallViaJaxb() throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		marshallerObj.marshal(emp, bos);

		byte[] byteArr = bos.toByteArray();

		// System.out.println("XML serialized Length " + new String(byteArr).length());

		InputStream in = new ByteArrayInputStream(byteArr);
		Unmarshaller unmarshaller = contextObj.createUnmarshaller();

		com.sample.app.model.Employee parsedEmployee = (com.sample.app.model.Employee) unmarshaller.unmarshal(in);
	}

	public static void main(String args[]) throws Exception {

		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			marshalAndUnmarshallViaProtocolBuffer();
		}
		long time2 = System.currentTimeMillis();

		System.out.println("Protocol Buffer time taken : " + (time2 - time1) + " milliseconds");

		time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			marshalAndUnmarshallViaJackson();
		}
		time2 = System.currentTimeMillis();
		System.out.println("Jackson time taken : " + (time2 - time1) + " milliseconds");

		time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			marshalAndUnmarshallViaJaxb();
		}
		time2 = System.currentTimeMillis();
		System.out.println("Jaxb time taken : " + (time2 - time1) + " milliseconds");
	}
}
