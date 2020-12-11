package api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GithubApiTest {

    private GitHub github;

    @BeforeEach
    void setUp() throws IOException {
        github = GitHubBuilder.fromPropertyFile().build();
    }

    @Test
    void github_api_connection() {
        assertThat(github).isNotNull();
    }

    @Test
    void get_repository_info() throws IOException {
        GHRepository repository = github.getRepository("whiteship/live-study");

        System.out.println(repository);

        assertThat(repository).isNotNull();
    }

    @Test
    void get_all_issues() throws IOException {
        GHRepository repository = github.getRepository("whiteship/live-study");
        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);

        for (GHIssue issue : issues) {
            System.out.println(issue);
        }
    }

    @Test
    void get_all_comments_in_issue() throws IOException {
        GHRepository repository = github.getRepository("whiteship/live-study");
        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);

        for (GHIssue issue : issues) {
            System.out.println(issue.getTitle() + "'s comment count = " + issue.getCommentsCount());
            List<GHIssueComment> comments = issue.getComments();
            List<GHUser> users = new ArrayList<>();
            for (GHIssueComment comment : comments) {
                users.add(comment.getUser());
            }
            System.out.println("Users: " + users);
        }
    }
}
