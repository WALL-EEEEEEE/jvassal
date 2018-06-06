package com.jvassal.test;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OkHttpTest
    extends TestCase
{
   public OkHttpTest( String testName )
    {
        super( testName );
    }

   public static Test suite()
    {
        return new TestSuite( OkHttpTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testGet()
    {
	    String url = "http://raw.github.com/square/okhttp/master/README.md";
	    OkHttpClient client = new OkHttpClient();
	    Request request = new Request.Builder()
		    .url(url)
		    .build();
	    try {
		    Response response = client.newCall(request).execute();
		    System.out.println(response.body().string());
	    } catch(IOException ex) {
	    }
    }
}
