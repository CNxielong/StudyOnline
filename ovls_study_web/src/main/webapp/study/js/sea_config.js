seajs.config({
	// 别名配置
	alias: {
		'seajs-text' : '/study/static/sea-modules/seajs/seajs-text/1.0.3/seajs-text',
		'seajs-combo': '/study/static/sea-modules/seajs/seajs-combo/1.0.0/seajs-combo',
		//'jquery'     : '/study/static/sea-modules/jquery/jquery/1.9.1/jquery',
		'store'      : '/study/static/sea-modules/gallery/store/1.3.14/store',
		'underscore' : '/study/static/sea-modules/gallery/underscore/1.3.14/underscore',
		'moment'     : '/study/static/sea-modules/gallery/moment/2.3.1/moment',

		'jquery'     : '/study/static/lib/jquery/1.9.1/jquery',
		'util'       : '/study/static/lib/util/0.1.0/util',
		'jwplayer'   : '/study/static/lib/jwplayer/1.0.0/jwplayer',
		'doT'        : '/study/static/lib/dot/1.0.0/doT',
		'socket.io'  : '/study/static/lib/socket.io/1.3.5/socket.io.min',
		'ace'        : '/study/static/lib/ace/1.2.6/ace',

		'drag'       : '/study/static/component/base/drag/drag',
		'tab'        : '/study/static/component/base/tab/tab',
		'scroll_load': '/study/static/component/base/scroll_load/scroll_load',

		'common'     : '/study/static/component/logic/common/common',
		'login'      : '/study/static/component/logic/login/login',
		'login_sns'  : '/study/static/component/logic/login/login-regist',
		'chat'       : '/study/static/component/logic/chat/im',
		'player'     : '/study/static/component/logic/player/player',
		'ceditor'    : '/study/static/component/logic/ceditor/ceditor', //主提交编辑器
		'publish'    : '/study/static/component/logic/publish/publish',

		'show_data'  : '/study/static/page/course/common/show_data',
		'codeEditor' : '/study/static/page/course/common/code_editor',  //基本查看代码
	    'Module-layer' : '/study/static/lib/layer/1.6.0/layer.min.js',
        'placeholder': '/study/static/component/base/placeholder/placeholder.js'
	},
	map: [

		[ /^(.*\.(?:css|js|tpl))(.*)$/i, '$1?'+seajsTimestamp ]
	],

	// 路径配置
	paths: {
		'lib': '/study/static/lib',
		'util': '/study/static/component/base/util'
	},

	// 变量配置
	//vars: {
	//	'locale': 'zh-cn'
	//},

	// 映射配置
	//map: [
	//	['http://example.com/js/app/', 'http://localhost/js/app/']
	//],

	// 预加载项

	preload: ['jquery', 'seajs-text','common'],
	//preload: ['jquery', 'seajs-text', 'seajs-combo'],

	// 调试模式
	debug: true,

	// Sea.js 的基础路径
	//base: 'http://example.com/path/to/base/',

	// 文件编码
	charset: 'utf-8'
});
