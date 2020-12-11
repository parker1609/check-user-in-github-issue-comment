import domain.Participant;
import service.StudyService;

import java.util.List;

public class ConsoleApp {

    public static void main(String[] args) {
        StudyService studyService = new StudyService();
        List<Participant> participants = studyService.getParticipantInfo();

        System.out.println("- 스터디 총 참석자 참석률 현황 - 총 인원: " + participants.size());
        for (Participant participant : participants) {
            System.out.printf("참석자: %s, 참석률: %.2f\n", participant.getUserLoginId(), participant.getAttendanceRate() * 100);
        }
    }
}
