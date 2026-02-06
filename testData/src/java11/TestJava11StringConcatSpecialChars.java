package java11;

public class TestJava11StringConcatecialChars {

    public String testOrdinaryInfix(String first, String second, String last) {
        return "BEGIN " + first + " (first infix) " + second + " (second infix) " + last + " END";
    }

    public String testecialCharsInfix(String first, String second, String last) {
        return "BEGIN " + first + " (first\u0001infix) " + second + " (second\u0002infix) " + last + " END";
    }

}