package com.medulahekim.medula.controller;

//import com.ImageTypers.ImageTypersAPI;
//import org.apache.commons.io.FileUtils;

import com.gargoylesoftware.htmlunit.javascript.host.event.GamepadEvent;
import com.medulahekim.medula.common.IlacBilgileri;
import com.medulahekim.medula.repo.IlacBilgileriRepo;
import com.medulahekim.medula.service.IlacBilgileriService;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import javax.imageio.ImageIO;
////import java.awt.image.BufferedImage;
////import java.io.File;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class BrowseMedula implements InitializingBean{
    private  FirefoxDriver driver = null;
    private  String url[] = {"https://www.betium.it/Holder.aspx?page=bet"};
    private  String codes[] = {"CALCIO"};
    private  HashMap<String, String> handlers = new HashMap<>();

    @Autowired
    private  IlacBilgileriService ilacBilgileriService;


    @PostConstruct
    public void initialise() throws Exception {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);

        driver = new FirefoxDriver();

        for (int i = 0; i < url.length - 1; i++) {
            driver.executeScript("window.open()");
        }

        ArrayList<String> windowsHandles = new ArrayList<>(driver.getWindowHandles());

        for (int i = 0; i < url.length; i++) {
            handlers.put(codes[i], windowsHandles.get(i));
        }

        scrape("https://medeczane.sgk.gov.tr/hekim/login.faces");
    }

    public  void scrape(String link) throws Exception {
        driver.get(link);
        resolveCaptcha();
        WebElement medicineInfo = driver.findElementByXPath("/html/body/form/div/div/table/tbody/tr[2]/td[1]/div/div/div/ul/li[8]/a/span");
        medicineInfo.click();
        String[] searchId = {"8699786952003", "8699536090160", "8699717010109", "8699504690019", "8699832090611", "8699525775900", "8680678450127", "8699717010093"};
        IlacBilgileri ilacBilgileri = null;
        for (String code : searchId) {
            Thread.sleep(5000);
            WebElement searchInput = driver.findElementByXPath("//*[@id=\"form1:j_id895581858_1_7eaab106\"]");
            WebElement searchButton = driver.findElementByXPath("//*[@id=\"form1:j_id895581858_1_7eaab2ef\"]");
            searchInput.clear();
            searchInput.sendKeys(code);
            searchButton.click();
            try {
                Thread.sleep(2000);
                WebElement tableTr = driver.findElementByXPath("/html/body/form/div/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td/div[2]/div/div[2]/table/tbody/tr");
                WebElement element = tableTr.findElements(By.xpath("./*")).get(2).findElement(By.tagName("button"));
                element.click();
            } catch (IndexOutOfBoundsException e) {
                continue;
            }

//        table data start

            WebElement allDetailsTables = driver.findElementByXPath("/html/body/form/div/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td");
            List<WebElement> mainTables = allDetailsTables.findElements(By.xpath("./*"));

            WebElement tableOne = mainTables.get(0);
            WebElement tableTwo = mainTables.get(1);
            WebElement tableThree = mainTables.get(2);
            WebElement tableFour = mainTables.get(3);

            WebElement oneTableHeader = tableOne.findElement(By.xpath("/html/body/form/div/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td/div[1]/table/thead/tr/td"));
            String headerNameOne = oneTableHeader.getAttribute("innerText");
            System.out.println("========================================================================================================================");
            System.out.println("One Table Header Name :" + headerNameOne);
            System.out.println("========================================================================================================================");

            WebElement tableData = tableOne.findElement(By.xpath("/html/body/form/div/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td/div[1]/table/tbody"));
            List<WebElement> rows = tableData.findElements(By.xpath("./*"));

            WebElement d1 = rows.get(0).findElements(By.xpath("./*")).get(2);
            WebElement d2 = rows.get(1).findElements(By.xpath("./*")).get(2);
            WebElement d3 = rows.get(1).findElements(By.xpath("./*")).get(6);
            WebElement d4 = rows.get(2).findElements(By.xpath("./*")).get(2);
            WebElement d5 = rows.get(2).findElements(By.xpath("./*")).get(6);
            WebElement d6 = rows.get(3).findElements(By.xpath("./*")).get(2);
            WebElement d7 = rows.get(3).findElements(By.xpath("./*")).get(6);
            WebElement d8 = rows.get(4).findElements(By.xpath("./*")).get(2);
            WebElement d9 = rows.get(4).findElements(By.xpath("./*")).get(6);
            WebElement d10 = rows.get(5).findElements(By.xpath("./*")).get(2);
            WebElement d11 = rows.get(5).findElements(By.xpath("./*")).get(6);
            WebElement d12 = rows.get(6).findElements(By.xpath("./*")).get(2);
            WebElement d13 = rows.get(6).findElements(By.xpath("./*")).get(6);
            WebElement d14 = rows.get(7).findElements(By.xpath("./*")).get(2);
            WebElement d15 = rows.get(7).findElements(By.xpath("./*")).get(6);
            WebElement d16 = rows.get(8).findElements(By.xpath("./*")).get(2);
            WebElement d17 = rows.get(8).findElements(By.xpath("./*")).get(6);
            WebElement d18 = rows.get(9).findElements(By.xpath("./*")).get(2);
            WebElement d19 = rows.get(9).findElements(By.xpath("./*")).get(6);
            WebElement d20 = rows.get(10).findElements(By.xpath("./*")).get(2);

            String ilaçAdı = d1.getAttribute("innerText");
            String AmbalajMiktarı = d2.getAttribute("innerText");
            String farmasotikFormu = d3.getAttribute("innerText");
            String tekDozMiktarı = d4.getAttribute("innerText");
            String kullanımSuresi = d5.getAttribute("innerText");
            String cinsiyet = d6.getAttribute("innerText");
            String yaşAralıgı = d7.getAttribute("innerText");
            String perakendeOdenenFiyat = d8.getAttribute("innerText");
            String kamuIndirimOranı = d9.getAttribute("innerText");
            String reçeteTuru = d10.getAttribute("innerText");
            String kamukodNo = d11.getAttribute("innerText");
            String tedaviŞemasıGerekli = d12.getAttribute("innerText");
            String ayAralıgı = d13.getAttribute("innerText");
            String ayaktanReçetesi = d14.getAttribute("innerText");
            String yatanReçetesi = d15.getAttribute("innerText");
            String ayaktanMaksKulDoz = d16.getAttribute("innerText");
            String yatanMaksKulDoz = d17.getAttribute("innerText");
            String raporluMaksKulDoz = d18.getAttribute("innerText");
            String takipliIlaçSayısı = d19.getAttribute("innerText");
            String etkinMadde = d20.getAttribute("innerText");

            ilacBilgileri = new IlacBilgileri();
            ilacBilgileri.setIlacAdı(ilaçAdı);
            ilacBilgileri.setAmbalajMiktari(AmbalajMiktarı);
            ilacBilgileri.setFarmasotikFormu(farmasotikFormu);
            ilacBilgileri.setTekDozMiktari(tekDozMiktarı);
            ilacBilgileri.setKullanimSuresi(kullanımSuresi);
            ilacBilgileri.setIlacCinsiyet(cinsiyet);
            ilacBilgileri.setYasAraligi(yaşAralıgı);
            ilacBilgileri.setPerakendeOdenenFiyat(perakendeOdenenFiyat);
            ilacBilgileri.setKamuIndirimOrani(kamuIndirimOranı);
            ilacBilgileri.setReceteTuru(reçeteTuru);
            ilacBilgileri.setKamukodNo(kamukodNo);
            ilacBilgileri.setTedaviSemasiGerekli(tedaviŞemasıGerekli);
            ilacBilgileri.setAyAraligi(ayAralıgı);
            ilacBilgileri.setAyaktanRecetesi(ayaktanReçetesi);
            ilacBilgileri.setYatanRecetesi(yatanReçetesi);
            ilacBilgileri.setAyaktanMaksKulDoz(ayaktanMaksKulDoz);
            ilacBilgileri.setYatanMaksKulDoz(yatanMaksKulDoz);
            ilacBilgileri.setRaporluMaksKulDoz(raporluMaksKulDoz);
            ilacBilgileri.setTakipliIlacSayisi(takipliIlaçSayısı);
            ilacBilgileri.setEtkinMadde(etkinMadde);

            System.out.println(ilaçAdı);
            System.out.println(AmbalajMiktarı);
            System.out.println(farmasotikFormu);
            System.out.println(tekDozMiktarı);
            System.out.println(kullanımSuresi);
            System.out.println(cinsiyet);
            System.out.println(yaşAralıgı);
            System.out.println(perakendeOdenenFiyat);
            System.out.println(kamuIndirimOranı);
            System.out.println(reçeteTuru);
            System.out.println(kamukodNo);
            System.out.println(tedaviŞemasıGerekli);
            System.out.println(ayAralıgı);
            System.out.println(ayaktanReçetesi);
            System.out.println(yatanReçetesi);
            System.out.println(ayaktanMaksKulDoz);
            System.out.println(yatanMaksKulDoz);
            System.out.println(raporluMaksKulDoz);
            System.out.println(takipliIlaçSayısı);
            System.out.println(etkinMadde);

            ilacBilgileriService.saveIlacBilgileri(ilacBilgileri);

            WebElement tableHeader = tableTwo.findElement(By.xpath("/html/body/form/div/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td/div[2]/div/div[1]"));
            String headerNameTow = tableHeader.getAttribute("innerText");
            System.out.println("========================================================================================================================");
            System.out.println("Tow Table Header Name :" + headerNameTow);
            System.out.println("========================================================================================================================");
            WebElement tableData2 = tableTwo.findElement(By.xpath("//*[@id=\"form1:j_id960053402_2_5b2a5acb_data\"]"));
            for (WebElement element2 : tableData2.findElements(By.xpath("./*"))) {
                WebElement header2 = element2.findElement(By.tagName("tr")).findElement(By.tagName("td")).findElement(By.tagName("label"));
                String towTablesHeader = header2.getAttribute("innerText");
                System.out.println("========================================================================================================================");
                System.out.println("Two Tables Header :" + towTablesHeader);
                System.out.println("========================================================================================================================");
                WebElement tbody2 = element2.findElement(By.xpath("/html/body/form/div/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td/div[2]/div/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody"));
                List<WebElement> tbody2Div = tbody2.findElements(By.xpath("./*"));
                WebElement td1 = tbody2Div.get(0).findElements(By.xpath("./*")).get(2);
                WebElement td2 = tbody2Div.get(0).findElements(By.xpath("./*")).get(6);
                WebElement td3 = tbody2Div.get(1).findElements(By.xpath("./*")).get(2);
                WebElement td4 = tbody2Div.get(1).findElements(By.xpath("./*")).get(6);
                WebElement td5 = tbody2Div.get(2).findElements(By.xpath("./*")).get(2);
                WebElement td6 = tbody2Div.get(2).findElements(By.xpath("./*")).get(6);
                WebElement td7 = tbody2Div.get(3).findElements(By.xpath("./*")).get(2);
                WebElement td8 = tbody2Div.get(4).findElements(By.xpath("./*")).get(2);
                WebElement td9 = tbody2Div.get(5).findElements(By.xpath("./*")).get(2);
                WebElement td10 = tbody2Div.get(6).findElements(By.xpath("./*")).get(2);
                WebElement td11 = tbody2Div.get(7).findElements(By.xpath("./*")).get(2);
                WebElement td12 = tbody2Div.get(8).findElements(By.xpath("./*")).get(2);
                WebElement td13 = tbody2Div.get(9).findElements(By.xpath("./*")).get(2);
                WebElement td14 = tbody2Div.get(10).findElements(By.xpath("./*")).get(2);
                WebElement td15 = tbody2Div.get(11).findElements(By.xpath("./*")).get(2);
                System.out.println(td1.getAttribute("innerText"));
                System.out.println(td2.getAttribute("innerText"));
                System.out.println(td3.getAttribute("innerText"));
                System.out.println(td4.getAttribute("innerText"));
                System.out.println(td5.getAttribute("innerText"));
                System.out.println(td6.getAttribute("innerText"));
                System.out.println(td7.getAttribute("innerText"));
                System.out.println(td8.getAttribute("innerText"));
                System.out.println(td9.getAttribute("innerText"));
                System.out.println(td10.getAttribute("innerText"));
                System.out.println(td11.getAttribute("innerText"));
                System.out.println(td12.getAttribute("innerText"));
                System.out.println(td13.getAttribute("innerText"));
                System.out.println(td14.getAttribute("innerText"));
                System.out.println(td15.getAttribute("innerText"));

//                continue;
            }
            WebElement tableThreeElement = tableThree.findElement(By.xpath("/html/body/form/div/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td/div[3]/div/div[1]"));
            String header3 = tableThreeElement.getAttribute("innerText");
            System.out.println("========================================================================================================================");
            System.out.println("Three Table Header Name :" + header3);
            System.out.println("========================================================================================================================");
            WebElement tableData3 = tableThreeElement.findElement(By.xpath("//*[@id=\"form1:j_id960053402_2_5b2a5a0a_data\"]"));
            for (WebElement element3 : tableData3.findElements(By.xpath("./*"))) {
                String innerText = element3.getAttribute("innerText");
                System.out.println(innerText);
            }
            System.out.println("---------------------------");
            WebElement tableFourElement = tableFour.findElement(By.xpath("/html/body/form/div/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td/div[4]/div/div[1]"));
            String header4 = tableFourElement.getAttribute("innerText");
            System.out.println("========================================================================================================================");
            System.out.println("Four Table Header Name :" + header4);
            System.out.println("========================================================================================================================");
            WebElement tableData4 = tableFour.findElement(By.xpath("//*[@id=\"form1:j_id960053402_2_5b2a5b93_data\"]"));
            for (WebElement element4 : tableData4.findElements(By.xpath("./*"))) {
                WebElement rowDataName = element4.findElements(By.xpath("./*")).get(0);
                String innerText = rowDataName.getAttribute("innerText");
                System.out.println("##########################" + innerText);
                try {
                    WebElement iconButton = element4.findElements(By.xpath("./*")).get(1).findElement(By.tagName("div"));
                    iconButton.click();
                    Thread.sleep(2000);
                    for (WebElement element5 : tableData4.findElements(By.xpath("./*"))) {
                        WebElement element1 = element5.findElements(By.xpath("./*")).get(0);
                        String innerText1 = element1.getAttribute("innerText");
                        System.out.println(innerText1);
                    }
                } catch (IndexOutOfBoundsException e) {
                    continue;
                }
            }
            System.out.println("----------------------------");
            WebElement nextClick = driver.findElementByXPath("/html/body/form/div/div/table/tbody/tr[2]/td[1]/div/div/div/ul/li[8]/a");
            nextClick.click();
            System.out.println("Waiting for new number............................");
        }
    }

    private void resolveCaptcha() throws Exception {
        String currentUrl = driver.getCurrentUrl();
//        String access_token = "6FCD4FA636F442C7A33A4963BDBA9122";
//        ImageTypersAPI c = new ImageTypersAPI(access_token);
//        String balance = c.account_balance();
//        String cptchaID = "";
//        System.out.println(String.format("Balance: %s", balance));
//        String user = "";
//        String pass = "";
//        boolean isCaptchaWrong = true;
//        while (isCaptchaWrong) {
//            WebElement ele = driver.findElementByXPath("//*[@id=\"j_id2030916047_790d52d6\"]");
//
//            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            BufferedImage fullImg = null;
//
//            fullImg = ImageIO.read(screenshot);
//
//            Point point = ele.getLocation();
//
//            int eleWidth = ele.getSize().getWidth();
//            int eleHeight = ele.getSize().getHeight();
//
//            BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
//            ImageIO.write(eleScreenshot, "png", screenshot);
//
//            File screenshotLocation = new File("C:/Users/Chandimal/Documents/Screensot/abc.png");
//            FileUtils.copyFile(screenshot, screenshotLocation);
//
//            System.out.println("Waiting for captcha to be solved ...");
//            String resp = c.solve_captcha("C:/Users/Chandimal/Documents/Screensot/abc.png", true);
//            cptchaID = c.captcha_id();
//            System.out.println(String.format("Captcha text: %s", resp));
//
//            WebElement captcha = driver.findElementByXPath("//*[@id=\"guvenlikNumarasi\"]");
        WebElement u = driver.findElementByXPath("//*[@id=\"j_username\"]");
        WebElement p = driver.findElementByXPath("//*[@id=\"j_password\"]");
        WebElement button = driver.findElementByXPath("//*[@id=\"j_id2030916047_790d5295\"]");
        u.clear();
        p.clear();
//            captcha.clear();
//            captcha.sendKeys(new String[]{resp});
        u.sendKeys("46462227654");
        p.sendKeys("Doktor61");
        Thread.sleep(8000);
        button.click();

//            if (!currentUrl.equalsIgnoreCase(driver.getCurrentUrl())) {
//                isCaptchaWrong = false;
//            }
//        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initialise();
    }
}
