/**
 * 
 */
package main.java.org.activity14;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * @author student
 * 
 */
public class XMLCar {

	public final static String RELATIVE_PATH_TO_GENERATED_XML = "src/main/java/org/activity14/car_sale.xml";
	public final static String RELATIVE_PATH_TO_XSD = "src/main/java/org/activity14/car.xsd";

	/**
	 * Creates an XMLCar object without parameters.
	 */
	public XMLCar() {
	}

	public static void main(String[] args){
		XMLCar car = new XMLCar();
		car.createXML();
		car.validateXMLSchema(RELATIVE_PATH_TO_XSD, RELATIVE_PATH_TO_GENERATED_XML);
	}
	/**
	 * Creates an XML file.
	 * 
	 * @return type boolean
	 * 
	 * @throws Exception
	 */
	public boolean createXML() {
		// TODO No. 1: Write a code that will create XML file car_sale.xml
		// that matches car.xsd requirements.
		// IMPORTANT! Use RELATIVE_PATH_TO_GENERATED_XML as a path to save file!
		boolean status = true;
		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("car");
			doc.appendChild(rootElement);

			// staff elements
//			Element staff = doc.createElement("Staff");
//			rootElement.appendChild(staff);

			// set attribute to staff element
//			Attr attr = doc.createAttribute("id");
//			attr.setValue("1");
//			rootElement.setAttributeNode(attr);

			// shorten way
			// staff.setAttribute("id", "1");

			// firstname elements
			Element firstname = doc.createElement("model");
			firstname.appendChild(doc.createTextNode("Alfa Romeo"));
			rootElement.appendChild(firstname);

			// lastname elements
			Element lastname = doc.createElement("color");
			lastname.appendChild(doc.createTextNode("grey"));
			rootElement.appendChild(lastname);

			// nickname elements
			Element nickname = doc.createElement("year");
			nickname.appendChild(doc.createTextNode("2016"));
			rootElement.appendChild(nickname);

			// salary elements
			Element salary = doc.createElement("price");
			salary.appendChild(doc.createTextNode("15000"));
			rootElement.appendChild(salary);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(RELATIVE_PATH_TO_GENERATED_XML));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");

		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
			status = false;
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
			status = false;
		  }
		return status;
	}

	/**
	 * Validates XML file
	 * 
	 * @param xsdPath
	 *            path to .xsd file
	 * @param xmlPath
	 *            path to .xml file
	 * 
	 * @return type boolean
	 * @throws Exception
	 */
	public boolean validateXMLSchema(String xsdPath, String xmlPath) {
		// TODO No. 2: Write a code that will validate created before XML file
		// according to .xsd file
		try {
			SchemaFactory factory = SchemaFactory
					.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlPath)));
		} catch (IOException | SAXException e) {

			System.out.println("xml file is INVALID" + "\n"
					+ "error description here: " + e.getMessage() + "\n");

			return false;
		}

		System.out.println("xml file is VALID");
		return true;
	}

}
