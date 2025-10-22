# qa-final-project-java

○	
○	Să aibă un job test care simulează rularea testelor Maven (run: mvn test).
○	Să aibă un job build-and-push care construiește imaginea Docker și o publică pe Docker Hub. Acest job trebuie să ruleze doar dacă job-ul test a trecut (folosind needs: test).


●	Proiectul rularea un test automat care verifica raspunsul de GET 200 la API url: https://jsonplaceholder.typicode.com/todos/1 .
●	proiectul porneste la push pe branch-ul main cu comanda mvn test.
●	Se rulează imaginea Docker (docker build ... și docker run ...).
●	Un badge de status care arată live dacă pipeline-ul de CI/CD este "passing" sau "failing".
