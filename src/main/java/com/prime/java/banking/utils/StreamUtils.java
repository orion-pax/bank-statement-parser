package com.prime.java.banking.utils;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamUtils {


    public static String readLineByLine(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        if(contentBuilder.length() <=0){
            throw new IllegalArgumentException("Incorrect file content format.");
        }
        contentBuilder.setLength(contentBuilder.length()-1);
        return contentBuilder.toString();
    }

    public static List<String> readFileLines(String filePath)
    {
        List<String> lines = new ArrayList<>();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> lines.add(s+"\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        if(lines.isEmpty()){
            throw new IllegalArgumentException("Incorrect file content format.");
        }
        lines.remove(lines.size()-1);
        return lines;
    }
}
