package service;

import domain.AttendanceStatus;
import domain.Participant;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudyService {
    private Map<String, Participant> uniqueParticipants = new HashMap<>();

    public StudyService() {
    }

    public List<Participant> getParticipantInfo() {
        try {
            GitHub github = GitHubBuilder.fromPropertyFile().build();
            GHRepository repository = github.getRepository("whiteship/live-study");
            List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);

            for (GHIssue issue : issues) {
                if (!isValidIssue(issue)) {
                    continue;
                }

                int numOfStudy = issue.getNumber();
                List<GHIssueComment> comments = issue.getComments();

                setStudyAttendanceInfo(numOfStudy, comments);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>(uniqueParticipants.values());
    }

    private boolean isValidIssue(GHIssue issue) {
        if (issue.getNumber() < 1 || issue.getNumber() > AttendanceStatus.TOTAL_NUMBER_OF_STUDY) {
            return false;
        }

        return true;
    }

    private void setStudyAttendanceInfo(int numOfStudy, List<GHIssueComment> comments) throws IOException {
        for (GHIssueComment comment : comments) {
            String commentUserLoginId = comment.getUser().getLogin();

            if (uniqueParticipants.containsKey(commentUserLoginId)) {
                uniqueParticipants.get(commentUserLoginId).attendStudy(numOfStudy);
            } else {
                Participant currentParticipant = new Participant(commentUserLoginId);
                currentParticipant.attendStudy(numOfStudy);

                uniqueParticipants.put(commentUserLoginId, currentParticipant);
            }
        }
    }
}
