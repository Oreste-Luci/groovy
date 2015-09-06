import groovy.lang.Binding;
import groovy.lang.GroovyShell;

/**
 * @author Oreste Luci
 */
public class RunningGroovyScript {

    public static void main(String[] args) {

        String groovyScript = "number1 + number3";

        Binding binding = new Binding();
        binding.setVariable("number1", new Integer(1));
        binding.setVariable("number3", new Integer(3));

        GroovyShell shell = new GroovyShell(binding);
        Object value = shell.evaluate(groovyScript);

        System.out.println(value);
    }
}