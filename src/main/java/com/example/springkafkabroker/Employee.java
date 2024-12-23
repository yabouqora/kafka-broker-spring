package com.example.springkafkabroker;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Employee {
    private String name;
    private String department;
    private double salary;
}
