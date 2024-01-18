/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avecias.mx.chartduino.controller;

import avecias.mx.chartduino.model.dto.Result;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author avecias date: Dec 28, 2023 6:19:04 PM
 *
 */
@RestController
@RequestMapping(value = "/chart")
public class ChartController {

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Result getOneById(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {
        Result result = new Result(200, "Variable recibida " + id);
        return result;
    }
}
