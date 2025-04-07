const base = {
    get() {
        return {
            url : "http://localhost:8080/gaoxiaojiaowu/",
            name: "gaoxiaojiaowu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gaoxiaojiaowu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校教务管理系统"
        } 
    }
}
export default base
