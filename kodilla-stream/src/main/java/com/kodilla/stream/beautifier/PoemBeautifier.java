package com.kodilla.stream.beautifier;


public class PoemBeautifier {

    public String beautify (String d, PoemDecorator pd) {
        return pd.decorate(d);

    }

}
