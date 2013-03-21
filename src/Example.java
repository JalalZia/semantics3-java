import java.io.IOException;

import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

import org.json.JSONObject;

import com.semantics3.api.Products;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		try {
			Products products = new Products(
					"SEM37E4BC6A8BDD4AF40DD0B7EE2F682DC2B",
					"ZGNlODUyZjI0NzY4YzNjMmNjZGEwNzFmNmY5NzMyNjQ"
				);
			products
			.field( "cat_id", 4992 )	
			.field( "brand", "Toshiba" );
			JSONObject results;	
			results = products.get();
			System.out.println(results.toString(4));
		} catch (OAuthMessageSignerException | OAuthExpectationFailedException
				| OAuthCommunicationException | IOException e) {
			e.printStackTrace();
		}

	}

}
