package by.kirikovich.strings.regularExpressoins.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public void parseLine(String str) {
        Pattern patternOpenTag = Pattern.compile("<[\\w =\"]+>");
        Pattern patternCloseTag = Pattern.compile("</\\w+>");
        Matcher matcherOpenTag = patternOpenTag.matcher(str);
        String openTag = null;
        String closeTag = null;
        String body = str;

        if (matcherOpenTag.find()) {
            openTag = matcherOpenTag.group(0);
            body = matcherOpenTag.replaceAll("");
        }

        Matcher matcherCloseTag = patternCloseTag.matcher(body);
        if (matcherCloseTag.find()) {
            closeTag = matcherCloseTag.group(0);
            body = matcherCloseTag.replaceAll("");
        }

        if (openTag != null) {
            System.out.println(openTag + " - open tag");
        }
        if (openTag != null && closeTag != null) {
            body = body.trim();
            if (body == "") {
                System.out.println("body is empty");
            } else {
                System.out.println(body + " - body");
            }
        }
        if (closeTag != null) {
            System.out.println(closeTag + " - close tag");
        }
    }

    public void doYourJob() throws IOException {
        String direction = "src/by/kirikovich/strings/regularExpressoins/task2/";
        String fileName = "input.txt";
        File file = new File(direction, fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            parseLine(bufferedReader.readLine());
        }
    }
}
