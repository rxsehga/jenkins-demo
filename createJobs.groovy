pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rxsehga/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}