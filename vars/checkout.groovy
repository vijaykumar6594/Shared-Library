def call() {
sh 'checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/jadugarmjadugar/addressbook.git']])'
}
