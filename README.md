# valtech.barrett
HackerRank exercise

I decided to complete solution in java, using eclipse and as a maven project type. Selenium 3 is used and all other dependencies were included in pom file.

I started writing failing tests (in TestCases package). Common webdriver setup and tear down code was then refactored into a WebDriver Base class, which test classes inherited. 

Package app.page.objects was then created to store page objects for use in tests. A base page class was created to store the driver forcing each page to include a driver in the constructor. This could then be used by elements on each page.

Package app.elements was created to house elements that may be used by the page objects. Sometimes we have to create custom elements that require logic. I included some simple examples of the pattern used to create all elements, whether the elements are standard templates (label, link etc) or container elements (tables, sections etc)

once done this pattern enables easy test creation by way of reading intuitive page objects. For a more complex solution (and more time) the potential to introduce a DSL, exposing business processes, could prove useful. This could make the tests highly maintainable and even more intuitive.

I used the above to get the tests completed, based on the requirements. The latest news test could be more detailed and in production test code, I would make it more robust by checking content.

The above tests are written as JUnit tests. They may be executed locally, once imported via git, within IDE using JUnit tets runner. This would produce pass/fail reporting.  

I decided to introduce a BDD framework and used maven dependencies to introduce cucumber. I only completed 1 feature as an example. It is very simple and could do with a lot more refactoring. In an agile setting the scenarios would be driven by team. It can be executed by right-clicking feature and selecting Run As -> Cucumber feature. 

For both JUnit and Cucumber tests it would be ideal to execute them as part of continous integration. An example might be Jenkins integration. I would add a post build execution step on an existing pipeline, or create a pipeline if one does not exist. Given that we've used maven its simple to use Jenkins Maven plugin to handle the execution. Reporting would then be available in Jenkins and project build status easily tracked. For more in-depth reporting something like Serenity could be used.

Not included,

Parallel test execution
Grid environment (Saucelabs, Browserstack, selenium grid)
configuration files (for execution in various test environments)
tagging implementation (for selective execution)
Data builders 
Page factory
Resource management


