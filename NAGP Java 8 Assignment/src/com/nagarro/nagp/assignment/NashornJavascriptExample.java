/**
 * NashornJavascriptExample.java
 *
 * @author harleenchadha
 *
 * 31-Oct-2015
 */
package com.nagarro.nagp.assignment;

import java.util.logging.Logger;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * The Class NashornJavascriptExample calls JavaScript function defined in
 * another file.
 */
public class NashornJavascriptExample {

	/** The Constant LOG. */
	private static final Logger LOG = Logger
			.getLogger(NashornJavascriptExample.class.getName());

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String args[]) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		try {
			// evaluate the JavaScript file
			nashorn.eval("load('src/com/nagarro/nagp/assignment/JavascriptExample.js')");

			// get handle of JavaScript file’s context
			Invocable invocable = (Invocable) nashorn;

			// invoke function defined in the file’s context and pass the
			// argument.
			Object result = invocable.invokeFunction("fun1", "Harleen Chadha");

			// print the result and its type.
			System.out.println(result);
			System.out.println(result.getClass());
		} catch (ScriptException e) {
			LOG.info("Exception occurred: " + e.getMessage());
		} catch (NoSuchMethodException e) {
			LOG.info("Exception occurred: " + e.getMessage());
		}
	}
}
