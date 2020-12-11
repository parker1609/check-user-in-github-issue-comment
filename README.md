# 백기선님 라이브 스터디 참석자 정보 가져오기
- [백기선님 라이브 스터디](https://github.com/whiteship/live-study)
- [과제 정보(해당 링크 과제 1 참고)](https://github.com/whiteship/live-study/issues/4)

## 시작하기(MAC OS 기준)
### Github API For Java 인증 정보 설정하기
Github API를 사용하려면, 자신의 로그인 인증 정보를 증명해야 한다.
1. Github ->  Settings(내 정보) -> Developer settings -> Personal access tokens -> oauth 이름의 토큰 새로 만들기
2. 만들어진 토큰 값 복사 -> ~/.github 파일에 `oauth=4d98173f7c075527cb64878561d1fe70` 형식으로 붙여넣기 후 저장

자세한 정보는 해당 [링크](https://github-api.kohsuke.org/index.html) 참조.

### 빌드 및 실행하기

```
$ git clone https://github.com/CODEMCD/check-user-in-github-issue-comment.git
$ cd check-user-in-github-issue-comment
$ ./gradlew clean build
$ java -jar build/libs/check-user-in-github-issue-comment-0.0.1-SNAPSHOT.jar
``` 

## 실행 결과

콘솔 출력 결과는 다음과 같다.

```
- 스터디 총 참석자 참석률 현황 - 총 인원: 226
참석자: sojintjdals, 참석률: 22.22
참석자: jessi68, 참석률: 11.11
참석자: HyangKeunChoi, 참석률: 16.67
참석자: twowinsh87, 참석률: 22.22
참석자: ohhhmycode, 참석률: 16.67
참석자: ufonetcom, 참석률: 22.22
참석자: sigriswil, 참석률: 16.67
참석자: catsbi, 참석률: 22.22
참석자: jymaeng95, 참석률: 22.22
참석자: ggomjae, 참석률: 5.56
참석자: fpdjsns, 참석률: 16.67
참석자: binghe819, 참석률: 16.67
참석자: seovalue, 참석률: 16.67
참석자: kys4548, 참석률: 16.67
참석자: KyungJae-Jang, 참석률: 16.67
참석자: kongduboo, 참석률: 22.22
참석자: ahyz0569, 참석률: 22.22
참석자: hyngsk, 참석률: 5.56
참석자: glowing713, 참석률: 5.56
참석자: G-ONL, 참석률: 5.56
참석자: loop-study, 참석률: 16.67
참석자: yskkkkkk, 참석률: 22.22
참석자: dkyou7, 참석률: 5.56
참석자: jaxx2001, 참석률: 11.11
참석자: idiot2222, 참석률: 16.67
참석자: metorg, 참석률: 5.56
참석자: limyeonsoo, 참석률: 22.22
참석자: Youngerjesus, 참석률: 22.22
참석자: gcha-kim, 참석률: 22.22
참석자: numuduwer, 참석률: 16.67
참석자: cbw1030, 참석률: 5.56
참석자: pej4303, 참석률: 22.22
참석자: JuHyun419, 참석률: 5.56
참석자: SnowisTargaryen, 참석률: 5.56
참석자: zhaoSeo, 참석률: 11.11
참석자: jongnan, 참석률: 22.22
참석자: kyu9, 참석률: 22.22
참석자: thisisyoungbin, 참석률: 22.22
참석자: star1606, 참석률: 11.11
참석자: nimkoes, 참석률: 22.22
참석자: Ryureka, 참석률: 16.67
참석자: jaeyeon93, 참석률: 11.11
참석자: Lee-jaeyong, 참석률: 5.56
참석자: plzprayme, 참석률: 22.22
참석자: Rebwon, 참석률: 16.67
참석자: sky7th, 참석률: 22.22
참석자: ejxzhn22, 참석률: 16.67
참석자: YuSeungmo, 참석률: 16.67
참석자: sskim91, 참석률: 22.22
참석자: younwony, 참석률: 11.11
참석자: yhxkit, 참석률: 5.56
참석자: kgc0120, 참석률: 5.56
참석자: DDOEUN, 참석률: 22.22
참석자: whiteship, 참석률: 66.67
참석자: jjone36, 참석률: 22.22
참석자: CODEMCD, 참석률: 16.67
...
```