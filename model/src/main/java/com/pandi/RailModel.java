package com.pandi;

import java.time.LocalTime;

public record RailModel(String name, LocalTime startTime,LocalTime endTime) {
}
