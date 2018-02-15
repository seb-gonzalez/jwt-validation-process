package com.sebastian.jwt;

public class Main {

	

	public static void main(String[] args) {
		

		String jwtToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtleWlkIjoiUkVRME1VUTVOME5DUlRKRU16azNNMFUxUmtORFEwVTBRME0xUkVGQlJqaERNamRFTlVGQlFnIn0.eyJpc3MiOiJodHRwczovL2ZpZG0uZ2lneWEuY29tL2p3dC8zX1ZGb2dwUC1YR0JLbl9FaDJfckNibXdSUkRuek1MXzRCVnpvUkhEMXROU1ZocEx3Y1FJV3dVRzhCTEtXOWd6LXkvIiwiYXBpS2V5IjoiM19WRm9ncFAtWEdCS25fRWgyX3JDYm13UlJEbnpNTF80QlZ6b1JIRDF0TlNWaHBMd2NRSVd3VUc4QkxLVzlnei15IiwiaWF0IjoxNTE2OTAwNzE2LCJleHAiOjE1MTY5MDEwMTYsInN1YiI6ImVmMmIzMTM0MmY1MzQ1M2JiOGM1MzUzNjEyMjhkODAxIiwiZmlyc3ROYW1lIjoiQWJyYW1vdiIsImxhc3ROYW1lIjoiRG1pdHJpeSIsImFnZSI6MzYsImJpcnRoWWVhciI6MTk4MX0.Zunlit1CF_Y4GN4wYYp9hu-560xWtamAHkNR27nEYWM53TjNkadi-CUg4MnzBOSBdvKi6ngcfhD58w9Fjn8loRgumPW4qMBd1GdbfzjfPpjXEhaPPLvYQU-FCDPqcKynSZkdtApEuJaVFNZy8w_9WCCs647cqCa2VOLOPgQ1yJ8pF4eXMppqpOo5SdhaCTZ8UL71PlMocw6mJDVR_0H13LXzmSlY2AjAMaUbImORhd1MR_63t5n4nuMV4inTOLRjn0n6QZweURhtmUfu9YkN-h19dpceT_xmHnAl8VnhuCwT1JwdS-7-JS4ZiTjlzLV0uIrPtiLgawLdzu77HlOCwA";
		


		JWTProcessor processor = new JWTProcessor();

		if (processor.isValid(jwtToken)) {
			System.out.println("Token is Valid!!");
		} else {
			System.err.println("Signature verification failed.");
		}

	
	}

}
