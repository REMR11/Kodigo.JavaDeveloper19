package ejercicios_streams.Models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Products {
    public static final List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product() {{ setProductID(1); setProductName("Chai"); setCategory("Beverages"); setUnitPrice(new BigDecimal("18.00")); setUnitsInStock(39); }});
        productList.add(new Product() {{ setProductID(2); setProductName("Chang"); setCategory("Beverages"); setUnitPrice(new BigDecimal("19.00")); setUnitsInStock(17); }});
        productList.add(new Product() {{ setProductID(3); setProductName("Aniseed Syrup"); setCategory("Condiments"); setUnitPrice(new BigDecimal("10.00")); setUnitsInStock(13); }});
        productList.add(new Product() {{ setProductID(4); setProductName("Chef Anton's Cajun Seasoning"); setCategory("Condiments"); setUnitPrice(new BigDecimal("22.00")); setUnitsInStock(53); }});
        productList.add(new Product() {{ setProductID(5); setProductName("Chef Anton's Gumbo Mix"); setCategory("Condiments"); setUnitPrice(new BigDecimal("21.35")); setUnitsInStock(0); }});
        productList.add(new Product() {{ setProductID(6); setProductName("Grandma's Boysenberry Spread"); setCategory("Condiments"); setUnitPrice(new BigDecimal("25.00")); setUnitsInStock(120); }});
        productList.add(new Product() {{ setProductID(7); setProductName("Uncle Bob's Organic Dried Pears"); setCategory("Produce"); setUnitPrice(new BigDecimal("30.00")); setUnitsInStock(15); }});
        productList.add(new Product() {{ setProductID(8); setProductName("Northwoods Cranberry Sauce"); setCategory("Condiments"); setUnitPrice(new BigDecimal("40.00")); setUnitsInStock(6); }});
        productList.add(new Product() {{ setProductID(9); setProductName("Mishi Kobe Niku"); setCategory("Meat/Poultry"); setUnitPrice(new BigDecimal("97.00")); setUnitsInStock(29); }});
        productList.add(new Product() {{ setProductID(10); setProductName("Ikura"); setCategory("Seafood"); setUnitPrice(new BigDecimal("31.00")); setUnitsInStock(31); }});
        productList.add(new Product() {{ setProductID(11); setProductName("Queso Cabrales"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("21.00")); setUnitsInStock(22); }});
        productList.add(new Product() {{ setProductID(12); setProductName("Queso Manchego La Pastora"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("38.00")); setUnitsInStock(86); }});
        productList.add(new Product() {{ setProductID(13); setProductName("Konbu"); setCategory("Seafood"); setUnitPrice(new BigDecimal("6.00")); setUnitsInStock(24); }});
        productList.add(new Product() {{ setProductID(14); setProductName("Tofu"); setCategory("Produce"); setUnitPrice(new BigDecimal("23.25")); setUnitsInStock(35); }});
        productList.add(new Product() {{ setProductID(15); setProductName("Genen Shouyu"); setCategory("Condiments"); setUnitPrice(new BigDecimal("15.50")); setUnitsInStock(39); }});
        productList.add(new Product() {{ setProductID(16); setProductName("Pavlova"); setCategory("Confections"); setUnitPrice(new BigDecimal("17.45")); setUnitsInStock(29); }});
        productList.add(new Product() {{ setProductID(17); setProductName("Alice Mutton"); setCategory("Meat/Poultry"); setUnitPrice(new BigDecimal("39.00")); setUnitsInStock(0); }});
        productList.add(new Product() {{ setProductID(18); setProductName("Carnarvon Tigers"); setCategory("Seafood"); setUnitPrice(new BigDecimal("62.50")); setUnitsInStock(42); }});
        productList.add(new Product() {{ setProductID(19); setProductName("Teatime Chocolate Biscuits"); setCategory("Confections"); setUnitPrice(new BigDecimal("9.20")); setUnitsInStock(25); }});
        productList.add(new Product() {{ setProductID(20); setProductName("Sir Rodney's Marmalade"); setCategory("Confections"); setUnitPrice(new BigDecimal("81.00")); setUnitsInStock(40); }});
        productList.add(new Product() {{ setProductID(21); setProductName("Sir Rodney's Scones"); setCategory("Confections"); setUnitPrice(new BigDecimal("10.00")); setUnitsInStock(3); }});
        productList.add(new Product() {{ setProductID(22); setProductName("Gustaf's Knäckebröd"); setCategory("Grains/Cereals"); setUnitPrice(new BigDecimal("21.00")); setUnitsInStock(104); }});
        productList.add(new Product() {{ setProductID(23); setProductName("Tunnbröd"); setCategory("Grains/Cereals"); setUnitPrice(new BigDecimal("9.00")); setUnitsInStock(61); }});
        productList.add(new Product() {{ setProductID(24); setProductName("Guaraná Fantástica"); setCategory("Beverages"); setUnitPrice(new BigDecimal("4.50")); setUnitsInStock(20); }});
        productList.add(new Product() {{ setProductID(25); setProductName("NuNuCa Nuß-Nougat-Creme"); setCategory("Confections"); setUnitPrice(new BigDecimal("14.00")); setUnitsInStock(76); }});
        productList.add(new Product() {{ setProductID(26); setProductName("Gumbär Gummibärchen"); setCategory("Confections"); setUnitPrice(new BigDecimal("31.23")); setUnitsInStock(15); }});
        productList.add(new Product() {{ setProductID(27); setProductName("Schoggi Schokolade"); setCategory("Confections"); setUnitPrice(new BigDecimal("43.90")); setUnitsInStock(49); }});
        productList.add(new Product() {{ setProductID(28); setProductName("Rössle Sauerkraut"); setCategory("Produce"); setUnitPrice(new BigDecimal("45.60")); setUnitsInStock(26); }});
        productList.add(new Product() {{ setProductID(29); setProductName("Thüringer Rostbratwurst"); setCategory("Meat/Poultry"); setUnitPrice(new BigDecimal("123.79")); setUnitsInStock(0); }});
        productList.add(new Product() {{ setProductID(30); setProductName("Nord-Ost Matjeshering"); setCategory("Seafood"); setUnitPrice(new BigDecimal("25.89")); setUnitsInStock(10); }});
        productList.add(new Product() {{ setProductID(31); setProductName("Gorgonzola Telino"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("12.50")); setUnitsInStock(0); }});
        productList.add(new Product() {{ setProductID(32); setProductName("Mascarpone Fabioli"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("32.00")); setUnitsInStock(9); }});
        productList.add(new Product() {{ setProductID(33); setProductName("Geitost"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("2.50")); setUnitsInStock(112); }});
        productList.add(new Product() {{ setProductID(34); setProductName("Sasquatch Ale"); setCategory("Beverages"); setUnitPrice(new BigDecimal("14.00")); setUnitsInStock(111); }});
        productList.add(new Product() {{ setProductID(35); setProductName("Steeleye Stout"); setCategory("Beverages"); setUnitPrice(new BigDecimal("18.00")); setUnitsInStock(20); }});
        productList.add(new Product() {{ setProductID(36); setProductName("Inlagd Sill"); setCategory("Seafood"); setUnitPrice(new BigDecimal("19.00")); setUnitsInStock(112); }});
        productList.add(new Product() {{ setProductID(37); setProductName("Gravad lax"); setCategory("Seafood"); setUnitPrice(new BigDecimal("26.00")); setUnitsInStock(11); }});
        productList.add(new Product() {{ setProductID(38); setProductName("Côte de Blaye"); setCategory("Beverages"); setUnitPrice(new BigDecimal("263.50")); setUnitsInStock(17); }});
        productList.add(new Product() {{ setProductID(39); setProductName("Chartreuse verte"); setCategory("Beverages"); setUnitPrice(new BigDecimal("18.00")); setUnitsInStock(69); }});
        productList.add(new Product() {{ setProductID(40); setProductName("Boston Crab Meat"); setCategory("Seafood"); setUnitPrice(new BigDecimal("18.40")); setUnitsInStock(123); }});
        productList.add(new Product() {{ setProductID(41); setProductName("Jack's New England Clam Chowder"); setCategory("Seafood"); setUnitPrice(new BigDecimal("9.65")); setUnitsInStock(85); }});
        productList.add(new Product() {{ setProductID(42); setProductName("Singaporean Hokkien Fried Mee"); setCategory("Grains/Cereals"); setUnitPrice(new BigDecimal("14.00")); setUnitsInStock(26); }});
        productList.add(new Product() {{ setProductID(43); setProductName("Ipoh Coffee"); setCategory("Beverages"); setUnitPrice(new BigDecimal("46.00")); setUnitsInStock(17); }});
        productList.add(new Product() {{ setProductID(44); setProductName("Gula Malacca"); setCategory("Condiments"); setUnitPrice(new BigDecimal("19.45")); setUnitsInStock(27); }});
        productList.add(new Product() {{ setProductID(45); setProductName("Rogede sild"); setCategory("Seafood"); setUnitPrice(new BigDecimal("9.50")); setUnitsInStock(5); }});
        productList.add(new Product() {{ setProductID(46); setProductName("Spegesild"); setCategory("Seafood"); setUnitPrice(new BigDecimal("12.00")); setUnitsInStock(95); }});
        productList.add(new Product() {{ setProductID(47); setProductName("Zaanse koeken"); setCategory("Confections"); setUnitPrice(new BigDecimal("9.50")); setUnitsInStock(36); }});
        productList.add(new Product() {{ setProductID(48); setProductName("Chocolade"); setCategory("Confections"); setUnitPrice(new BigDecimal("12.75")); setUnitsInStock(15); }});
        productList.add(new Product() {{ setProductID(49); setProductName("Maxilaku"); setCategory("Confections"); setUnitPrice(new BigDecimal("20.00")); setUnitsInStock(10); }});
        productList.add(new Product() {{ setProductID(50); setProductName("Valkoinen suklaa"); setCategory("Confections"); setUnitPrice(new BigDecimal("16.25")); setUnitsInStock(65); }});
        productList.add(new Product() {{ setProductID(51); setProductName("Manjimup Dried Apples"); setCategory("Produce"); setUnitPrice(new BigDecimal("53.00")); setUnitsInStock(20); }});
        productList.add(new Product() {{ setProductID(52); setProductName("Filo Mix"); setCategory("Grains/Cereals"); setUnitPrice(new BigDecimal("7.00")); setUnitsInStock(38); }});
        productList.add(new Product() {{ setProductID(53); setProductName("Perth Pasties"); setCategory("Meat/Poultry"); setUnitPrice(new BigDecimal("32.80")); setUnitsInStock(0); }});
        productList.add(new Product() {{ setProductID(54); setProductName("Tourtière"); setCategory("Meat/Poultry"); setUnitPrice(new BigDecimal("7.45")); setUnitsInStock(21); }});
        productList.add(new Product() {{ setProductID(55); setProductName("Pâté chinois"); setCategory("Meat/Poultry"); setUnitPrice(new BigDecimal("24.00")); setUnitsInStock(115); }});
        productList.add(new Product() {{ setProductID(56); setProductName("Gnocchi di nonna Alice"); setCategory("Grains/Cereals"); setUnitPrice(new BigDecimal("38.00")); setUnitsInStock(21); }});
        productList.add(new Product() {{ setProductID(57); setProductName("Ravioli Angelo"); setCategory("Grains/Cereals"); setUnitPrice(new BigDecimal("19.50")); setUnitsInStock(36); }});
        productList.add(new Product() {{ setProductID(58); setProductName("Escargots de Bourgogne"); setCategory("Seafood"); setUnitPrice(new BigDecimal("13.25")); setUnitsInStock(62); }});
        productList.add(new Product() {{ setProductID(59); setProductName("Raclette Courdavault"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("55.00")); setUnitsInStock(79); }});
        productList.add(new Product() {{ setProductID(60); setProductName("Camembert Pierrot"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("34.00")); setUnitsInStock(19); }});
        productList.add(new Product() {{ setProductID(61); setProductName("Sirop d'érable"); setCategory("Condiments"); setUnitPrice(new BigDecimal("28.50")); setUnitsInStock(113); }});
        productList.add(new Product() {{ setProductID(62); setProductName("Tarte au sucre"); setCategory("Confections"); setUnitPrice(new BigDecimal("49.30")); setUnitsInStock(17); }});
        productList.add(new Product() {{ setProductID(63); setProductName("Vegie-spread"); setCategory("Condiments"); setUnitPrice(new BigDecimal("43.90")); setUnitsInStock(24); }});
        productList.add(new Product() {{ setProductID(64); setProductName("Wimmers gute Semmelknödel"); setCategory("Grains/Cereals"); setUnitPrice(new BigDecimal("33.25")); setUnitsInStock(22); }});
        productList.add(new Product() {{ setProductID(65); setProductName("Louisiana Fiery Hot Pepper Sauce"); setCategory("Condiments"); setUnitPrice(new BigDecimal("21.05")); setUnitsInStock(76); }});
        productList.add(new Product() {{ setProductID(66); setProductName("Louisiana Hot Spiced Okra"); setCategory("Condiments"); setUnitPrice(new BigDecimal("17.00")); setUnitsInStock(4); }});
        productList.add(new Product() {{ setProductID(67); setProductName("Laughing Lumberjack Lager"); setCategory("Beverages"); setUnitPrice(new BigDecimal("14.00")); setUnitsInStock(52); }});
        productList.add(new Product() {{ setProductID(68); setProductName("Scottish Longbreads"); setCategory("Confections"); setUnitPrice(new BigDecimal("12.50")); setUnitsInStock(6); }});
        productList.add(new Product() {{ setProductID(69); setProductName("Gudbrandsdalsost"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("36.00")); setUnitsInStock(26); }});
        productList.add(new Product() {{ setProductID(70); setProductName("Outback Lager"); setCategory("Beverages"); setUnitPrice(new BigDecimal("15.00")); setUnitsInStock(15); }});
        productList.add(new Product() {{ setProductID(71); setProductName("Flotemysost"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("21.50")); setUnitsInStock(26); }});
        productList.add(new Product() {{ setProductID(72); setProductName("Mozzarella di Giovanni"); setCategory("Dairy Products"); setUnitPrice(new BigDecimal("34.80")); setUnitsInStock(14); }});
        productList.add(new Product() {{ setProductID(73); setProductName("Röd Kaviar"); setCategory("Seafood"); setUnitPrice(new BigDecimal("15.00")); setUnitsInStock(101); }});
        productList.add(new Product() {{ setProductID(74); setProductName("Longlife Tofu"); setCategory("Produce"); setUnitPrice(new BigDecimal("10.00")); setUnitsInStock(4); }});
        productList.add(new Product() {{ setProductID(75); setProductName("Rhönbräu Klosterbier"); setCategory("Beverages"); setUnitPrice(new BigDecimal("7.75")); setUnitsInStock(125); }});
        productList.add(new Product() {{ setProductID(76); setProductName("Lakkalikööri"); setCategory("Beverages"); setUnitPrice(new BigDecimal("18.00")); setUnitsInStock(57); }});
        productList.add(new Product() {{ setProductID(77); setProductName("Original Frankfurter grüne Soße"); setCategory("Condiments"); setUnitPrice(new BigDecimal("13.00")); setUnitsInStock(32); }});
    }


}
