import com.pandawork.common.entity.News;
import com.pandawork.common.entity.Section;
import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.NewsService;
import com.pandawork.service.SectionService;
import com.pandawork.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 学生管理系统
 * 测试service页面
 * studentService
 * Created by fujia on 2016/3/26.
 */
public class StudentServiceTest extends AbstractTestCase {

    @Autowired
    SectionService sectionService;

    //测试新增学生信息
    @Test
    public void testInsertNews() throws SSException {
        Section section =new Section();
        section.setSectionName("体育");
        sectionService.insertSection(section);
        System.out.println("添加成功");
    }

//    //测试查询学生信息列表
//    @Test
//    public void testListAll() throws SSException{
//        System.out.print(studentService.listAll());
//    }
//
//    //测试计算全部学生信息条数
//    @Test
//    public void testCountAll() throws SSException{
//        studentService.countAll();
//        System.out.println("11");
//    }
//
//    //测试删除学生信息
//    @Test
//    public void testDelById() throws SSException{
//        Student student = new Student();
//        student.setId(5);
//        studentService.delById(student.getId());
//        System.out.println("16");
//    }
//
//    //测试更新学生信息
//    @Test
//    public void testUpdate() throws SSException{
//        Student student = new Student();
//        student.setId(1);
//        student.setStudentNum(222222222);
//        student.setStudentName("邱兰");
//        student.setSex("女");
//        student.setGrade(3);
//        student.setClassNum(33);
//        student.setCollege("艺术");
//        student.setBirthday(new Date(1995 - 10 - 05));
//        student.setGoodStudent(1);
//        studentService.update(student);
//        System.out.println("12");
//    }
//
//    //测试根据ID查询学生信息
//    @Test
//    public void testQueryById() throws SSException {
//        Student student = new Student();
//        student.setId(1);
//       // studentService.queryById(1);
//        System.out.println(studentService.queryById(1));
//    }
//
//    //测试根据姓名查询学生信息
//    @Test
//    public void testQueryByName() throws SSException{
//        Student student = new Student();
//        student.setStudentName("fu");
//        Student s = studentService.queryByName(student.getStudentName());
//        System.out.println(s);
//    }


}
