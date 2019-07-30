package cn.entelechy;

import static org.junit.Assert.assertTrue;

import cn.entelechy.dao.Monitor_projectdata_todayMapper;
import cn.entelechy.entities.Monitor_projectData_today;
import cn.entelechy.service.Monitor_projectdata_todayService;
import cn.entelechy.service.impl.Monitor_projectdata_todayServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Autowired
    private Monitor_projectdata_todayMapper mapper;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int mdnumber = rand.nextInt(99999 - 10000 + 1) + 10000;
            int emnumber = rand.nextInt(16 - 12 + 1) + 12;
            int ggnumber = rand.nextInt(200 - 150 + 1) + 150;
            int gpnumber = rand.nextInt(140 - 90 + 1) + 90;
            int gphnumber = rand.nextInt(9 - 3 + 1) + 3;
            int ghnumber = rand.nextInt(9 - 3 + 1) + 3;
            int gzlnumber = rand.nextInt(4 - 2 + 1) + 2;
            int gbnumber = rand.nextInt(3580 - 1000 + 1) + 1000;
            int gcnumber = rand.nextInt(300 - 100 + 1) + 100;
            int gsnumber = rand.nextInt(300 - 100 + 1) + 100;
            int gdnumber = rand.nextInt(4830 - 2000 + 1) + 2000;
            int gzdnumber = rand.nextInt(90 - 70 + 1) + 70;
            int faid = rand.nextInt(88 - 4 + 1) + 4;
            int second = rand.nextInt(60 - 1 + 1) + 1;
            Monitor_projectData_today today = new Monitor_projectData_today();
            today.setMonitor_projectData_code("MD" + faid + mdnumber);
            today.setFactory_id(faid);
            today.setEmission_sources_code("EM1-" + faid + emnumber);
            today.setG010(ggnumber);
            today.setG011(gpnumber);
            today.setG012(gphnumber);
            today.setG013(ghnumber);
            today.setG015(gzlnumber);
            today.setG016(gbnumber);
            today.setG025(gcnumber);
            today.setG007(gsnumber);
            today.setT015(gdnumber);
            today.setZ002(gzdnumber);
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date timestart = dateFormat2.parse("2019-07-1" + i + " 09:"+second+":00");
                today.setMonitor_projectData_date_start(timestart);
                Date timeover = dateFormat2.parse("2019-07-1" + i + " 20:"+(second+i)+":00");
                today.setMonitor_projectData_date_over(timeover);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            today.setMonitor_flag_code("N");
            mapper.addMonitor(today);
        }
    }
}
