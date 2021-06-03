### Taking screenshots when a test method fails

### Needed to use an interface called DriverInterface to reach the same driver instance from BaseTest and TestResultLogger
    //Here implementing DriverInterface to reach driver instance
    public class BaseTest implements DriverInterface
    
    //Also here implementing DriverInterface to reach the same driver instance otherwise I faced some issues such as npe etc.
    public class TestResultLogger implements TestWatcher , DriverInterface
    
    //Using driver instance here to take the screenshot

        private void takeScreenShot(String fileName){
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File image = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(image , new File("screenshots/".concat(fileName).concat(".png")));
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
