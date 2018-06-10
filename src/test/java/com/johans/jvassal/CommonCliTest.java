package com.jvassal.test;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CommonCliTest 
    extends TestCase
{
   public CommonCliTest( String testName )
    {
        super( testName );
    }

   public static Test suite()
    {
        return new TestSuite( CommonCliTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCreateOptions()
    {
	//Create Options object
	Options options = new Options();
	//add t option
	options.addOption("t",false,"display current time");
	CommandLineParser parser = new DefaultParser();
	String[] args  = {"jvassal","-d"};
	CommandLine cmd = null;
	try {
		cmd = parser.parse(options,args);
	} catch (ParseException pe) {
		System.out.println("Invalid command line supplied!");
	}
	if (cmd.hasOption("t")) {
		//print the date and time
		System.out.println("print the date and time");
	} else {
		//print the date
		System.out.println("print the date");
	}
    }
}
