const base = {
    get() {
        return {
            url : "http://localhost:8080/smartCampusPlatform/",
            name: "smartCampusPlatform",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/smartCampusPlatform/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园综合服务系统"
        } 
    }
}
export default base
