package com.teleport.stng;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class TrackingNumberService {

     public String generateUniqueTrackingNumber(String originCountryId, String destinationCountryId, Double weight, LocalDateTime createdAt, String customerSlug) {
  
    	 // Build tracking number parts
         String originCode = originCountryId.toUpperCase();
         String destinationCode = destinationCountryId.toUpperCase();
         String dayOfYear =String.format("%03d", createdAt.getDayOfYear());
         String customerCode = customerSlug.replaceAll("[^A-Za-z]", "").toUpperCase().substring(0, Math.min(customerSlug.length(), 3));
         String randomSuffix = String.format("%04d", (int) (Math.random() * 10000));

         // Concatenate and trim to meet the length requirement
         String trackingNumber = (originCode + destinationCode + dayOfYear + customerCode + randomSuffix)
                 .toUpperCase()
                 .substring(0, Math.min(16, originCode.length() + destinationCode.length() + dayOfYear.length() + customerCode.length() + randomSuffix.length()));

         return trackingNumber;
     }
}
