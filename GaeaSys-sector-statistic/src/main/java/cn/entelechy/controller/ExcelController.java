package cn.entelechy.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
/*
* 导出Excel表格
* */
public class ExcelController {

      /*  @RequestMapping("/get/excel")
        public void getExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
            // 准备数据
            List<Student> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(new Student(111,"张三asdf","男"));
                list.add(new Student(111,"李四asd","男"));
                list.add(new Student(111,"王五","女"));
            }
            String[] columnNames = { "ID", "姓名", " 性别"};
            String fileName = "excel1";
            ExportExcelWrapper<Student> util = new ExportExcelWrapper<Student>();
            util.exportExcel(fileName, fileName, columnNames, list, response, ExportExcelUtil.EXCEL_FILE_2003);
        }*/


}
