package soap.test;

import com.holidaywebservice.holidayservice_v2.Country;
import com.holidaywebservice.holidayservice_v2.Holiday;
import com.holidaywebservice.holidayservice_v2.HolidayService2Soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AppStarter {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.holidaywebservice.com//HolidayService_v2/HolidayService2.asmx?wsdl");
        QName qName = new QName("http://www.holidaywebservice.com/HolidayService_v2/", "HolidayService2");
        Service service = Service.create(url, qName);
        HolidayService2Soap holidayService2Soap = service.getPort(HolidayService2Soap.class);
        List<Holiday> holidayList = holidayService2Soap.getHolidaysForMonth(Country.GREAT_BRITAIN, 2018, 10)
                .getHoliday();
        for (Holiday h : holidayList) System.out.println(
                "Country: " + h.getCountry() + "\n"
                + "Date: " + h.getDate().getDay() + "." + h.getDate().getMonth() + "." + h.getDate().getYear() + "\n"
                + "Name: " + h.getHolidayCode() + "\n"
                + "Description: " + h.getDescriptor() + ";\n");

    }


}
