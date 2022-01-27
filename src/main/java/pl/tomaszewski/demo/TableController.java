package pl.tomaszewski.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TableController {

    TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @PostMapping("/")
    public String tables(Model model,
                         @RequestParam(required = false) String sort,
                         @RequestParam(required = false) String sort1) {
        List<Table> columns;
        if (sort != null) {
            columns = tableService.findAllSorted(sort, sort1);
        } else {
            columns = tableService.findAll();
        }

        model.addAttribute("table", columns);
        return "/home";
    }
}