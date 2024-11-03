### Application flow
- Elastic search, Logstash & Kibana is set using docker-compose in ELK setup. 
- Logstash is configured to listen on port 5000
- Kibana is configured to listen on port 5601, elastic search on 9200
- Spring application 1 and application 2 runs on port `8081` & `8082`, each one with same 
`spring-logstash.xml` configurations - sends any log that is written to port `5000`.
- Logstash input-output config written in ELK Setup/logs/pipeline/logstash.conf reads from those app and feeds to elastic search
- Kibana then shows centralized views.

### Execution
- Run the docker-compose file in ELK setup
```
    docker-compose up -d
```
- Run both spring application 1 and 2
- Hit http://localhost:8081 and http://localhost:8082
- Go to http://localhost:5601/app/discover, register the two spring apps, and view the logs.