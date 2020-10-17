# GithubSearchApp
Practice of using RxJava + Retrofit2 Library.

RxJava : 비동기 작업을 위한 라이브러리. 입력받은 데이터를 비동기적으로 처리하는데 쓰임. <br>
Retrofit : 안드로이드에서의 Http 연결을 위해서 쓰인다. <br>
Gson : Json 데이터를 Java 객체로 만드는것을 도와주는 라이브러리. <br>


## 깃허브 정보를 가져오는 단계
> 1. Retrofit을 이용해서 정보를 가저옴. (GithubClient 에서 Retrofit를 빌드, GithubAPI 로 연결) <br>
> 2. 가져온 정보를 Gson 으로 따로 정의한 객체 (GithubRepo, GithubRepoList) 로 바꿔줌. <br>
> 3. RecyclerView에 출력하기 위해 가져온 객체를 RecyclerViewAdapter 로 처리함. <br>
> 4. MainActivity에서 RecyclerViewAdapter 를 가져와 출력. <br>
