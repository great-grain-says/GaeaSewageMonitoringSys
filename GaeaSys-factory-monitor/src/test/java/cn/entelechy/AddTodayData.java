package cn.entelechy;

import cn.entelechy.dao.TodayDataMapper;
import cn.entelechy.entities.Monitor_projectData_today;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimerTask;

public class AddTodayData extends TimerTask {

    @Autowired
    private TodayDataMapper todayDataMapper;

    @Override
    public void run() {
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
                Date timestart = dateFormat2.parse("2019-07-1" + i + " 09:" + second + ":00");
                today.setMonitor_projectData_date_start(timestart);
                Date timeover = dateFormat2.parse("2019-07-1" + i + " 20:" + (second + i) + ":00");
                today.setMonitor_projectData_date_over(timeover);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            today.setMonitor_flag_code("N");
            todayDataMapper.addMonitor(today);
        }
    }
}
