var projectName = '校园综合服务系统';
/**
 * 轮播图配置
 */
var swiper = {
    // 设定轮播容器宽度，支持像素和百分比
    width: '100%',
    height: '400px',
    // hover（悬停显示）
    // always（始终显示）
    // none（始终不显示）
    arrow: 'none',
    // default（左右切换）
    // updown（上下切换）
    // fade（渐隐渐显切换）
    anim: 'default',
    // 自动切换的时间间隔
    // 默认3000
    interval: 2000,
    // 指示器位置
    // inside（容器内部）
    // outside（容器外部）
    // none（不显示）
    indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
    name: '个人中心',
    url: '../' + localStorage.getItem('userTable') + '/center.html'
},
    {
        name: '我的发布',
        url: '../forum/list-my.html'
    },

    {
        name: '我的收藏',
        url: '../storeup/list.html'
    }
]


var indexNav = [

    {
        name: '表白墙',
        url: './pages/biaobaiqiang/list.html'
    },
    {
        name: '分享墙',
        url: './pages/fenxiangqiang/list.html'
    },
    {
        name: '互助墙',
        url: './pages/huzhuqiang/list.html'
    },
    {
        name: '失物招领',
        url: './pages/shiwuzhaoling/list.html'
    },
    {
        name: '跳蚤市场',
        url: './pages/tiaozaoshichang/list.html'
    },
    {
        name: '校园兼职',
        url: './pages/xiaoyuanjianzhi/list.html'
    },

    {
        name: '论坛交流',
        url: './pages/forum/list.html'
    },
    {
        name: '公告信息',
        url: './pages/news/list.html'
    },
]

var adminurl = "http://localhost:8080/smartCampusPlatform/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


var menu = [{
    "backMenu": [{
        "child": [{
            "appFrontIcon": "cuIcon-circle",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "用户",
            "menuJump": "列表",
            "tableName": "yonghu"
        }], "menu": "用户管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-brand",
            "buttons": ["查看", "修改", "删除"],
            "menu": "表白墙",
            "menuJump": "列表",
            "tableName": "biaobaiqiang"
        }], "menu": "表白墙管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-attentionfavor",
            "buttons": ["查看", "修改", "删除"],
            "menu": "分享墙",
            "menuJump": "列表",
            "tableName": "fenxiangqiang"
        }], "menu": "分享墙管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-medal",
            "buttons": ["查看", "修改", "删除"],
            "menu": "互助墙",
            "menuJump": "列表",
            "tableName": "huzhuqiang"
        }], "menu": "互助墙管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-news",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "物品类型",
            "menuJump": "列表",
            "tableName": "wupinleixing"
        }], "menu": "物品类型管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-link",
            "buttons": ["查看", "修改", "删除"],
            "menu": "失物招领",
            "menuJump": "列表",
            "tableName": "shiwuzhaoling"
        }], "menu": "失物招领管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-newshot",
            "buttons": ["查看", "修改", "删除"],
            "menu": "跳蚤市场",
            "menuJump": "列表",
            "tableName": "tiaozaoshichang"
        }], "menu": "跳蚤市场管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-copy",
            "buttons": ["查看", "修改", "删除", "查看评论"],
            "menu": "校园兼职",
            "menuJump": "列表",
            "tableName": "xiaoyuanjianzhi"
        }], "menu": "校园兼职管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-time",
            "buttons": ["查看", "修改", "删除", "审核"],
            "menu": "举报信息",
            "menuJump": "列表",
            "tableName": "jubaoxinxi"
        }], "menu": "举报信息管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-group",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "论坛交流",
            "tableName": "forum"
        }], "menu": "论坛交流"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-camera",
            "buttons": ["查看", "修改", "删除"],
            "menu": "轮播图管理",
            "tableName": "config"
        }, {"appFrontIcon": "cuIcon-news", "buttons": ["新增", "查看", "修改", "删除"], "menu": "公告信息", "tableName": "news"}],
        "menu": "系统管理"
    }],
    "frontMenu": [{
        "child": [{
            "appFrontIcon": "cuIcon-present",
            "buttons": ["查看"],
            "menu": "表白墙列表",
            "menuJump": "列表",
            "tableName": "biaobaiqiang"
        }], "menu": "表白墙模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-attentionfavor",
            "buttons": ["查看"],
            "menu": "分享墙列表",
            "menuJump": "列表",
            "tableName": "fenxiangqiang"
        }], "menu": "分享墙模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-link",
            "buttons": ["查看"],
            "menu": "互助墙列表",
            "menuJump": "列表",
            "tableName": "huzhuqiang"
        }], "menu": "互助墙模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-skin",
            "buttons": ["查看"],
            "menu": "失物招领列表",
            "menuJump": "列表",
            "tableName": "shiwuzhaoling"
        }], "menu": "失物招领模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-wenzi",
            "buttons": ["查看"],
            "menu": "跳蚤市场列表",
            "menuJump": "列表",
            "tableName": "tiaozaoshichang"
        }], "menu": "跳蚤市场模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-circle",
            "buttons": ["查看", "举报"],
            "menu": "校园兼职列表",
            "menuJump": "列表",
            "tableName": "xiaoyuanjianzhi"
        }], "menu": "校园兼职模块"
    }],
    "hasBackLogin": "是",
    "hasBackRegister": "否",
    "hasFrontLogin": "否",
    "hasFrontRegister": "否",
    "roleName": "管理员",
    "tableName": "users"
}, {
    "backMenu": [{
        "child": [{
            "appFrontIcon": "cuIcon-brand",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "表白墙",
            "menuJump": "列表",
            "tableName": "biaobaiqiang"
        }], "menu": "表白墙管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-attentionfavor",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "分享墙",
            "menuJump": "列表",
            "tableName": "fenxiangqiang"
        }], "menu": "分享墙管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-medal",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "互助墙",
            "menuJump": "列表",
            "tableName": "huzhuqiang"
        }], "menu": "互助墙管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-link",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "失物招领",
            "menuJump": "列表",
            "tableName": "shiwuzhaoling"
        }], "menu": "失物招领管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-newshot",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "跳蚤市场",
            "menuJump": "列表",
            "tableName": "tiaozaoshichang"
        }], "menu": "跳蚤市场管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-copy",
            "buttons": ["新增", "查看", "修改", "删除"],
            "menu": "校园兼职",
            "menuJump": "列表",
            "tableName": "xiaoyuanjianzhi"
        }], "menu": "校园兼职管理"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-time",
            "buttons": ["查看"],
            "menu": "举报信息",
            "menuJump": "列表",
            "tableName": "jubaoxinxi"
        }], "menu": "举报信息管理"
    }],
    "frontMenu": [{
        "child": [{
            "appFrontIcon": "cuIcon-present",
            "buttons": ["查看"],
            "menu": "表白墙列表",
            "menuJump": "列表",
            "tableName": "biaobaiqiang"
        }], "menu": "表白墙模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-attentionfavor",
            "buttons": ["查看"],
            "menu": "分享墙列表",
            "menuJump": "列表",
            "tableName": "fenxiangqiang"
        }], "menu": "分享墙模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-link",
            "buttons": ["查看"],
            "menu": "互助墙列表",
            "menuJump": "列表",
            "tableName": "huzhuqiang"
        }], "menu": "互助墙模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-skin",
            "buttons": ["查看"],
            "menu": "失物招领列表",
            "menuJump": "列表",
            "tableName": "shiwuzhaoling"
        }], "menu": "失物招领模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-wenzi",
            "buttons": ["查看"],
            "menu": "跳蚤市场列表",
            "menuJump": "列表",
            "tableName": "tiaozaoshichang"
        }], "menu": "跳蚤市场模块"
    }, {
        "child": [{
            "appFrontIcon": "cuIcon-circle",
            "buttons": ["查看", "举报"],
            "menu": "校园兼职列表",
            "menuJump": "列表",
            "tableName": "xiaoyuanjianzhi"
        }], "menu": "校园兼职模块"
    }],
    "hasBackLogin": "是",
    "hasBackRegister": "否",
    "hasFrontLogin": "是",
    "hasFrontRegister": "是",
    "roleName": "用户",
    "tableName": "yonghu"
}]


var isAuth = function (tableName, key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for (let i = 0; i < menus.length; i++) {
        if (menus[i].tableName == role) {
            for (let j = 0; j < menus[i].backMenu.length; j++) {
                for (let k = 0; k < menus[i].backMenu[j].child.length; k++) {
                    if (tableName == menus[i].backMenu[j].child[k].tableName) {
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName, key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for (let i = 0; i < menus.length; i++) {
        if (menus[i].tableName == role) {
            for (let j = 0; j < menus[i].frontMenu.length; j++) {
                for (let k = 0; k < menus[i].frontMenu[j].child.length; k++) {
                    if (tableName == menus[i].frontMenu[j].child[k].tableName) {
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
