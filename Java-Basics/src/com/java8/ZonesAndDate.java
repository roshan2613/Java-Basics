package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZonesAndDate {
    public static void main (String [] args){
//        for (String zones : ZoneId.getAvailableZoneIds()){
//            ZoneId zoneId1 = ZoneId.of(zones);
//            String zoneIdDisplayName = zoneId1.getDisplayName(TextStyle.FULL, Locale.US);
//
//            System.out.println(zones +" : "+zoneIdDisplayName);
//        }

        ZoneId zoneID = ZoneId.of("US/Pacific");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
    }
}
