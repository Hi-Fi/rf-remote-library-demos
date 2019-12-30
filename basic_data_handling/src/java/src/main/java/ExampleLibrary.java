import org.robotframework.javalib.library.AnnotationLibrary;

public class ExampleLibrary extends AnnotationLibrary {
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	public ExampleLibrary() {
		super("com/github/hi_fi/examplelibrary/keywords/**");
    }
}