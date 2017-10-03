package Discount;

public class DiscountRate {
   private static double serviceDiscountPremium = 0.2;
   private static double serviceDiscountGold = 0.15;
   private static double serviceDiscountSilver = 0.1;
   private static double serviceDiscountDefault = 0.0;
   private static double productDiscountPremium = 0.1;
   private static double productDiscountGold = 0.1;
   private static double productDiscountSilver = 0.1;
   private static double productDiscountDefault = 0.1;

   public static double getServiceDiscountRate(String type){
       switch (type){
           case "Premium" :
               return serviceDiscountPremium;
           case "Gold" :
               return serviceDiscountGold;
           case "Silver" :
               return serviceDiscountSilver;
           case "default" :
               return serviceDiscountDefault;
           default:
               throw new IllegalArgumentException("the wrong customer type.");
       }

   }

   public static double getProductDiscountRate(String type){
       switch (type){
           case "Premium" :
               return productDiscountPremium;
           case "Gold" :
               return productDiscountGold;
           case "Silver" :
               return productDiscountSilver;
           case "default" :
               return productDiscountDefault;
           default:
               throw new IllegalArgumentException("the wrong customer type.");
       }

   }
}
