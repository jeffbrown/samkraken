package samkraken

class App {
    static void main(String[] args) {
        def bundle = ResourceBundle.getBundle('versions')

        def version = [:]
        version.major = bundle.getString('version.major')
        version.minor = bundle.getString('version.minor')
        version.maintenance = bundle.getString('version.maintenance')
        version.build = bundle.getString('version.build')

        def SVN_TAG="ccsmp_v_${version.major}.${version.minor}.${version.maintenance}.${version.build}"
        println SVN_TAG
    }
}
