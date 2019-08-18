package com.sample.app;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.sample.app.proto.generated.PersonDef;
import com.sample.app.proto.generated.PersonDef.Person;

public class App {
	
	private static void printByteArray(byte[] byteArr) {
		for(byte b: byteArr) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) throws IOException {
		Person person = PersonDef.Person.newBuilder().setFirstName("Ram").setLastName("Gurram").setEmail("ram@abc.com")
				.setId(123).build();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		person.writeTo(bos);

		System.out.println("Serialized Data :");
		printByteArray(bos.toByteArray());

		Person parsedPerson = Person.parseFrom(bos.toByteArray());

		System.out.println("\nDeserialzed Data :");
		System.out.println(parsedPerson);
	}
}
