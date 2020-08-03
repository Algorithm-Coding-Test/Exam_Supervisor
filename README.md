# Exam_Supervisor
## 시험 감독
BAEKJOON ONLINE JUDGE
13458번 문제


#### 문제
[https://www.acmicpc.net/problem/13458](https://www.acmicpc.net/problem/13458)
#### 풀이

`entireSupervisor`는 총감독관이 관리할 수 있는 학생의 수, `subSupervisor`는 부감독관이 관리할 수 있는 학생의 수다.

`numOfEntireSupervisor`는 총감독관의 수, `numOfSubSupervisor`는 부감독관의 수다.

각 시험장에 배정된 학생들의 수는 `ArrayList<Integer> numOfPeople`에 담았으며, 각 시험장마다 아래를 수행한다.

각 시험장마다 총감독관의 수를 1명씩 배정하며, 총감독관이 관리할 수 있는 학생의 수를 제외한 나머지 학생의 수에 따라 부감독관을 배정한다.

