package cn.entelechy;

import static org.junit.Assert.assertTrue;

import cn.entelechy.dao.FactoryMapper;
import cn.entelechy.dao.TodayDataMapper;
import cn.entelechy.entities.Factory;
import cn.entelechy.entities.Monitor_projectData_today;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("cn.entelechy")
public class AppTest {

    @Autowired
    private TodayDataMapper todayDataMapper;

    @Autowired
    private FactoryMapper factoryMapper;

    String[] names = {
            "耀协", "润美", "鑫广", "本洪", "泰润", "凯佳", "盈捷", "厚荣", "大福", "如德", "进源",
            "久泰", "昇顺", "鑫广", "如德", "满谦", "长公", "进正", "元康", "荣协", "进源", "满谦",
            "百耀", "欣茂", "凯源", "台盈", "祥昇", "满昌", "康泰", "同富", "高生", "元晶", "优谦",
            "义康", "进长", "复优", "华成", "耀发", "贵义", "茂乾", "宝高", "优泰", "益瑞", "高福",
            "欣鼎", "源耀", "贵昌", "禄协", "圣本", "庆兴", "鑫协", "正浩", "仁益", "高晶", "乾富",
            "如通", "公盈", "春谦", "皇贵", "伟荣", "旺利", "辉圣", "广安", "合亨", "吉如", "利恒",
            "公佳", "华飞", "元正", "瑞丰", "聚兴", "长福", "元优", "多乾", "巨久", "德祥", "洪仁",
            "凯进", "泰公", "多成", "通发", "同满", "乾昇", "禄宏", "伟裕", "光贵", "正飞", "聚全",
            "裕耀", "百亚", "乾福", "乾安", "伟捷", "春禄", "美厚", "富泰", "顺义", "益捷", "中益",
            "如隆", "隆安", "鑫德", "乾广", "伟复", "久多", "耀顺", "同福", "东昌", "洪亚", "盛欣",
            "优旺", "谦源", "长富", "润恒", "吉乾", "仁义", "益聚", "泰贵", "鑫协", "协多", "隆康",
            "春信", "贵丰", "东弘", "同富", "飞庆", "万康", "万鼎", "隆高", "久协", "德高", "正禄",
            "中辉", "辉浩", "裕顺", "伟汇", "发富", "茂宏", "盈信", "宝佳", "东恒", "中久", "多德",
            "富婷", "共雅", "飞虹", "乾坤", "七羽", "杀青", "福禄", "九阳", "力求", "酷风", "美协",
            "元优", "耀佳", "昌益", "欣丰", "乾美", "长隆", "如福", "圣耀", "洪昇", "合寿", "宏禄"};

    String[] ren = {
            "彭万里", "高大山", "谢大海", "马宏宇", "林莽尔", "黄强辉", "章汉夫", "范长江", "林君雄", "谭平山",
            "朱希亮", "李四光", "甘铁生", "伍绍祖", "马继祖", "程孝先", "宗敬先", "年广嗣", "汤绍箕", "吕显祖",
            "何光宗", "孙念祖", "马建国", "节振国", "冯兴国", "郝爱民", "于学忠", "马连良", "胡宝善", "李宗仁",
            "洪学智", "余克勤", "吴克俭", "杨惟义", "李文信", "王德茂", "李书诚", "杨勇芸", "高尚德", "刁富贵",
            "汤念祖", "吕奉先", "何光宗", "冷德友", "安怡孙", "贾德善", "蔡德霖", "关仁轩", "郑义贾", "孙天民",
            "赵大华", "赵进喜", "赵德荣", "赵德茂", "钱汉祥", "钱运高", "钱生禄", "孙寿康", "孙应吉", "孙顺达",
            "李秉贵", "李厚福", "李开富", "王子久", "刘永生", "刘宝瑞", "关玉和", "王仁兴", "李际泰", "罗元发",
            "刘造时", "刘乃超", "刘长胜", "张成基", "张国柱", "张志远", "张广才", "吕德榜", "吕文达", "吴家栋",
            "吴国梁", "吴立功", "李大江", "张石山", "王海怡", "孙旭诚", "孙荣廷", "孙宏坤", "孙邦原", "孙思达",
            "孙书贤", "孙卫东", "孙东辉", "孙子函", "朱慧玉", "孙光洪", "孙光永", "孙韬祖", "孙向明", "孙宇峰",
            "朱岑梁", "孙子涵", "孙玉轩", "孙婉宛", "孙菲芸", "孙正云", "孙正荣", "朱正容", "孙正芸", "罗宇发"
    };

    String[] addresstr = {
            "西溪路525号",
            "振中路203号",
            "黄姑山路48号",
            "西湖区万塘路30号",
            "西湖区古翠路108号",
            "西湖区玉古路",
            "西湖区文二路391号",
            "西湖区西园三路8号",
            "西湖区西园三路10号",
            "西湖区西园路",
            "城区东湖路17号",
            "滨江区南环路4028号",
            "余杭区余杭区和睦路",
            "滨江区滨康路",
            "滨江区新生路",
            "科技园滨江区南环路",
            "滨江区南环路2930号",
            "东滨江区长河路",
            "高新滨江路",
            "金滨江区东冠路611号",
            "滨文工江区园区中路",
            "凯尔达科技园区红泰五路",
            "沙井镇沙一村第一工业区",
            "沙井镇沙一村西部工业区",
            "沙井镇上南洪田工业区",
            "沙井大王山第一工业区",
            "沙井大王山第二工业区",
            "沙井共和第八工业区",
            "沙井新桥第二工业区",
            "沙井新桥第三工业区",
            "沙井镇第三工业区",
            "深圳沙井同富裕工业区",
            "沙井镇沙四村东宝工业区",
            "沙井镇步涌第三工业区",
            "沙井步冲工业区",
            "沙井街道万丰大钟岗工业区",
            "沙井镇和二鸿彬工业区",
            "沙井南环路康达尔工业区",
            "松岗镇蚌岗工业区",
            "松岗罗田第三工业区",
            "松岗镇燕川第三工业区",
            "松岗镇东方第2工业区",
            "松岗镇碧头村第二工业区",
            "松岗街道大田洋工业区",
            "松岗镇燕川北部工业区",
            "松岗镇塘下涌第二工业区",
            "松岗镇塘下涌工业区",
            "松岗蚝涌第二工业区",
            "松岗宏达工业区",
            "松岗镇浪下工业区",
            "松岗街道红星港联工业区",
            "松岗镇红星大朗工业区",
            "松岗镇红星工业区",
            "松岗街道江边工业区",
            "松岗松白工业区",
            "松岗镇恒兆工业区",
            "松岗镇楼岗村百宝工业区",
            "松岗镇楼岗工业区",
            "松岗镇潭头第二工业区",
            "石岩镇工业区",
            "石岩镇第一工业区",
            "石岩镇第二工业区",
            "石岩镇第三工业区",
            "石岩镇第四工业区",
            "石岩镇第五工业区",
            "石岩镇宏发工业区",
            "石岩镇山城工业区",
            "石岩镇梨园工业区",
            "石岩镇横坑工业区",
            "石岩镇水田工业区",
            "石岩镇三联工业区",
            "石岩镇头工业区",
            "石岩镇塘坑工业区",
            "石岩镇阳光工业区",
            "石岩镇龙马工业区",
            "石岩镇官田工业区",
            "石岩镇台湾工业区",
            "石岩镇长城工业区",
            "石岩镇上排工业区",
            "石岩镇园岭T业区",
            "龙华镇工业区",
            "龙华镇第一工业区",
            "龙华镇第二工业区",
            "龙华镇第三工业区",
            "龙华镇第四工业区",
            "龙华镇第五工业区",
            "龙华镇第六工业区",
            "龙华镇第七工业区",
            "龙华镇第八工业区",
            "龙华镇第九工业区",
            "龙华镇第十工业区",
            "龙华油松第一工业区",
            "龙华油松第二工业区",
            "龙华油松第三工业区",
            "龙华油松第四工业区",
            "龙华油松第五工业区",
            "龙华镇民治第二工业区",
            "龙华镇民治第三工业区",
            "龙华镇治村宝山工业区",
            "龙华镇针民治东泉工业区",
            "龙华镇民治横岭工业区",
            "龙华镇民治白石龙工业区",
            "龙华镇民兴工业区",
            "龙华镇水斗河边工业区",
            "龙华镇水尾工业区",
            "龙华镇英泰 工业区",
            "龙华镇龙华村石观工业区",
            "龙华镇同富裕工业区",
            "龙华镇上塘工业区",
            "龙华镇上塘西头工业区",
            "龙华镇上早工业区",
            "龙华镇潭罗工业区",
            "龙华镇谭罗工业区",
            "龙华镇油松水斗河边工业区",
            "龙华镇赖屋山村三和工业区",
            "龙华镇新围第三I业区",
            "龙华镇大浪上岭排工业区"
    };

    String [] namess = {
      "","纺织","印染","化工","能源","果汁生产","糖类加工制造","医药安全制造","纸制造业","汽车加工"
    };

    @Test
    public void addFactory() {
        Random rand = new Random();
        for (int i = 11; i < 1000; i++) {
            String codestr = RandomStringUtils.randomAlphanumeric(2);
            int fanumber = rand.nextInt(9999999 - 1000000 + 1) + 1000000;
            int fannumber = rand.nextInt(164 - 1) + 1;
            int gennumber = rand.nextInt(30 - 1) + 1;
            int panumber = rand.nextInt(15 - 3) + 3;
            int address = rand.nextInt(115 - 1) + 1;
            int fdnumber = rand.nextInt(109 - 1) + 1;
            int dhnumber = rand.nextInt(9999999 - 1111111) - 1111111;
            int exnumber = rand.nextInt(99999999 - 11111111) - 11111111;
            int jnumber = rand.nextInt(169 - 1) + 1;
            int wnumber = rand.nextInt(78 - 1) + 1;
            int facnumber = rand.nextInt(9 - 1) + 1;
            Factory factory = new Factory();
            factory.setFactory_id(i);
            factory.setFactory_code(codestr + fanumber);
            factory.setFactory_name(names[fannumber] + namess[facnumber]+"企业生产有限公司");
            factory.setFactory_Genre_id(gennumber);
            factory.setProvince_id(1);
            factory.setCity_id(6);
            factory.setCounty_id(9);
            factory.setIndustrial_park_id(panumber);
            factory.setFactory_address(addresstr[address]);
            factory.setFactory_legal_representative(ren[fdnumber]);
            factory.setFactory_phone("0762-" + dhnumber);
            factory.setFactory_exequatur(exnumber + "2" + i);
            factory.setFactory_jinweidu("113.3" + jnumber + "," + "22.8" + wnumber);

            factoryMapper.addFactory(factory);
        }
    }

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
