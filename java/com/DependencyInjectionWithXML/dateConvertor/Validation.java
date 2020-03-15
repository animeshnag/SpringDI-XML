package com.animesh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validation {
    String data;
    public Date parse(String data) throws ParseException
    {
        String[] value=data.split(" ");

        String date=value[0];
        String format=value[1];
        System.out.println(date + " " + format);
        Date date1=new SimpleDateFormat(format).parse(date);
        return date1;
    }

}



