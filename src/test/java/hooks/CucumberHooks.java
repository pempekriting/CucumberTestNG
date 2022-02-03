package hooks;

import driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CucumberHooks {

    @Before
    public static void before() {
        WebDriverInstance.initialize();
    }

    @After
    public static void after() {
        WebDriverInstance.quitDriver();
    }

    /*@AfterAll
    public static void afterAll() {
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");

        String buildNumber = "1";
        String projectName = "cucumberProject";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
        configuration.setBuildNumber(buildNumber);
        configuration.addClassifications("Platform", "Linux");
        configuration.addClassifications("Browser", "Chrome");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
    }*/
}