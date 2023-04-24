import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import xiaoyuanjianzhi from '@/views/modules/xiaoyuanjianzhi/list'
    import wupinleixing from '@/views/modules/wupinleixing/list'
    import tiaozaoshichang from '@/views/modules/tiaozaoshichang/list'
    import huzhuqiang from '@/views/modules/huzhuqiang/list'
    import shiwuzhaoling from '@/views/modules/shiwuzhaoling/list'
    import forum from '@/views/modules/forum/list'
    import fenxiangqiang from '@/views/modules/fenxiangqiang/list'
    import discussxiaoyuanjianzhi from '@/views/modules/discussxiaoyuanjianzhi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import biaobaiqiang from '@/views/modules/biaobaiqiang/list'
    import jubaoxinxi from '@/views/modules/jubaoxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/xiaoyuanjianzhi',
        name: '校园兼职',
        component: xiaoyuanjianzhi
      }
      ,{
	path: '/wupinleixing',
        name: '物品类型',
        component: wupinleixing
      }
      ,{
	path: '/tiaozaoshichang',
        name: '跳蚤市场',
        component: tiaozaoshichang
      }
      ,{
	path: '/huzhuqiang',
        name: '互助墙',
        component: huzhuqiang
      }
      ,{
	path: '/shiwuzhaoling',
        name: '失物招领',
        component: shiwuzhaoling
      }
      ,{
	path: '/forum',
        name: '论坛交流',
        component: forum
      }
      ,{
	path: '/fenxiangqiang',
        name: '分享墙',
        component: fenxiangqiang
      }
      ,{
	path: '/discussxiaoyuanjianzhi',
        name: '校园兼职评论',
        component: discussxiaoyuanjianzhi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/biaobaiqiang',
        name: '表白墙',
        component: biaobaiqiang
      }
      ,{
	path: '/jubaoxinxi',
        name: '举报信息',
        component: jubaoxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
