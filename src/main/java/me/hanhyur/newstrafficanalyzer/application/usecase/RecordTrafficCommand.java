package me.hanhyur.newstrafficanalyzer.application.usecase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.hanhyur.newstrafficanalyzer.domain.traffic.model.TrafficEvent;

@Getter
@AllArgsConstructor
public class RecordTrafficCommand {

    private final String articleId;
    private final TrafficEvent.EventType eventType;

    public static RecordTrafficCommand from(String articleId, TrafficEvent.EventType eventType) {
        return new RecordTrafficCommand(articleId, eventType);
    }

}
