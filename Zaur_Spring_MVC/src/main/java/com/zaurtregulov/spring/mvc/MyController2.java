package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Если вы добавите аннотацию @RequestMapping("/employee") к классу MyController2, то все URL-адреса в этом контроллере
 * будут начинаться с "/employee". Например, URL-адрес, указанный в аннотации @RequestMapping("/askDetails"), будет теперь
 * "/employee/askDetails". Если в вашем приложении используется только один контроллер, то добавление аннотации
 *
 * @RequestMapping к классу не имеет большого смысла, но если вы имеете несколько контроллеров, то это может помочь
 * организовать их логически.
 */
@Controller
@RequestMapping("/")
public class MyController2 {

//    @RequestMapping("/")
    @RequestMapping("")
    public String showFirstView() {
        return "first-view";
    }

    //Таким образом, при обращении к / будет сначала выполнен метод showFirstView(),
// который перенаправит запрос на /employee/first-view, где уже будет возвращаться нужное представление.
    @RequestMapping("/employee/first-view")
    public String showFirstView2() {
        return "first-view";
    }

    @RequestMapping("/askDetails") //URL
//    @RequestMapping(path="/askDetails", method = RequestMethod.GET) //URL
//    @GetMapping("/askDetails") //URL
    public String askEmplyeeDetails(Model model) {

//        Employee employee = new Employee();
//        employee.setName("Oleg");
//        employee.setSurname("Chumin");
//        employee.setSalary(3500);

        model.addAttribute("employee", new Employee()); // смотри ниже комментарий
        return "ask-emp-details-view";
    }
//    Эта строка кода добавляет объект Employee в модель Model, который будет доступен в представлении JSP.
//
//    Метод addAttribute() принимает два параметра: имя атрибута и значение атрибута. В данном случае, имя атрибута
//    задано как "employee", а значение - как новый объект Employee.
//
//    Теперь, когда этот атрибут был добавлен в модель, он будет доступен в JSP-странице через выражение JSP ${employee}.
//    Например, в коде JSP можно получить доступ к полям объекта Employee, используя такие выражения,
//    как ${employee.name}, ${employee.surname}, ${employee.salary} и т.д.

    @RequestMapping("/showDetails")
//    @PostMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, //@Valid проверка атрибута employee
                                 BindingResult bindingResult) { //результат проверки employee
//        System.out.println("surname length = " + emp.getSurname().length());

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view"; // если валидация с ошибкой возвращаем ту же страницу и она отображает
            // message = "name must be 2..256 symbols!"
        } else { // действует привычная логика
            String name = emp.getName();
            emp.setName("Mr./Mrs. " + name);

            String surname = emp.getSurname();
            emp.setSurname(surname + "!");

            int salary = emp.getSalary();
            emp.setSalary(salary * 3);

            return "show-emp-details-view";
        }
    }
}
