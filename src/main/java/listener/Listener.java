package listener;

import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listener implements IInvokedMethodListener, ITestListener, ISuiteListener {

	@Override
	public synchronized void onStart(ISuite suite) {
		System.out.println("Suite started! " + suite.getName());
	}

	@Override
	public synchronized void onStart(ITestContext context) {
		System.out.println("Test started! " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test ended! " + context.getName());
	}

	@Override
	public synchronized void onFinish(ISuite suite) {
		System.out.println("Suite ended! " + suite.getName());
	}
}
