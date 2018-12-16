package core;

import java.text.DecimalFormat;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/*@Path("/temp/xml/c=>f")
   public class CtoF {
	
	
	XML: celsius to fahrenheit
	
	@GET
	@Path("{input}")
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("input") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double celsius = input;
		Double fahrenheit = ((celsius * 9) / 5) + 32;
		String f = df.format(fahrenheit).toString();
String c = df.format(celsius).toString();
return "<calc>" + "<celsius>" + c + "</celsius>" + "<fahrenheit>" + f + "</fahrenheit>" + "</calc>";
}
	
    XML: fahrenheit to celsius
    
	@GET
	@Path("{input}")
	@Produces("application/xml")
	public String convertFtoCfromInput(@PathParam("input") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double fahrenheit = input;
		Double celsius = ((fahrenheit - 32) * 5 / 9);
		String c = df.format(celsius).toString();
String f = df.format(fahrenheit).toString();
return "<calc>" + "<fahrenheit>" + f + "</fahrenheit>" + "<celsius>" + c + "</celsius>" + "</calc>";
}
}

	//JSON : celsius to fahrenheit

	@Path("/temp/json/c=>f")
	public class CtoF {
		@GET
		@Path("{input}")
		@Produces("application/json")
	
	public String convertCtoFfromInput(@PathParam("input") Double input) {
	
		DecimalFormat df = new DecimalFormat("####0.00");
		Double celsius = input;
		Double fahrenheit = ((celsius * 9) / 5) + 32;
		String f = df.format(fahrenheit).toString();
		String c = df.format(celsius).toString();
	return "{\"calc\": {\"fahrenheit\": " + f + ", " + "\"celsius\": " + c + "}}";
	}
	}
	
	*/

	//JSON : fahrenheit to celsius

		@Path("/temp/json/f=>c")
		public class CtoF {
			@GET
			@Path("{input}")
			@Produces("application/json")
		
		public String convertFtoCfromInput(@PathParam("input") Double input) {
		
				DecimalFormat df = new DecimalFormat("####0.00");
				Double fahrenheit = input;
				Double celsius = ((fahrenheit - 32) * 5 / 9);
				String c = df.format(celsius).toString();
				String f = df.format(fahrenheit).toString();
		return "{\"calc\": {\"celsius\": " + c + ", " + "\"fahrenheit\": " + f + "}}";
		}
		}
