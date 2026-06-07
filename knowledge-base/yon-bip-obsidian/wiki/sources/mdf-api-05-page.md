---
title: "页面管理 Page"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-page"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 页面管理 Page

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-page | 所属：API

# [](#页面管理-page)页面管理 Page

## [](#1-打开单据页面)1. 打开单据页面

### [](#11-通过url打开)1.1. 通过URL打开

// 打开列表页

https://<业务中台>/mdf-node/meta/voucherlist/pu_applyorderlist?domainKey=upu&serviceCode=xxx // 打开卡片页

 

// 新增态

https://<业务中台>/mdf-node/meta/voucher/sfa_cluecard/add?domainKey=yycrm&serviceCode=xxx

// 浏览态

https://<业务中台>/mdf-node/meta/voucher/sfa_cluecard/2254652986888448?domainKey=yycrm&serviceCode=xxx

// 编辑态

不支持，替代方案

- 方案1：使用下一章节API

- 方案2：打开浏览态后在扩展脚本中执行viewmodel.biz.do('edit', viewmodel)切换成编辑态

- 2254652986888448为行数据id
- 单据类型：voucherlist列表、voucher卡片
- pu_applyorderlist、sfa_cluecard为本单据billno
- serviceCode和domainKey必传
- 移动端需要在手机上访问或在浏览器开启手机模拟器访问

![页面管理](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yemianguanliPage.0b368811.png)

### [](#12-通过api打开)1.2. 通过API打开

**示例**

cb.loader.runCommandLine('bill', {

 billtype: 'voucher',

 params: {

 id: '2214931147379968',

 templateType: 'modal', // 弹窗方式打开单据，不需要可以去掉

 mode: 'edit',

 domainKey: ''，

 query: { busiObj: 'xxx', serviceCode: 'xxx' }, // 跳转后的单据请求参数（所有接口带上）

 carryParams:{} // 额外传参 

 },

 billno: 'bankdot',

}, viewModel);

**参数说明**

||**属性**||**含义**||**必输**||**类型**||**默认值**|
||billtype||单据类型||是||''||无|
||billno||单据编码||是||''||无|
||newOpenTabs||是否新开页签||否||boolean||false，此参数需要在工作台 企业风格 中设置新开页签才会生效|
||params||参数||否||{}|||
||--id||详情页，数据ID||||||browse、edit时需要|
||--mode||页面状态||||||edit-编辑；add-新增；browse-浏览|
||--action||页面动作状态||否||||add-新增；copy-复制；push-推单|
||--readOnly||是否只读|||||||
||--domainKey||领域Key||是||||使用统一Node时必输|
||--query||跳转后的单据请求参数（所有接口带上）||否||{}||query中添加的任意参数都会带到所有请求的url上|
||----busiObj||业务对象编码||否||''||示例：params: { query: { busiObj: 'xxx' } }|
||----serviceCode||服务编码||否||''|||
||----transtype||交易类型||否||''||query上传transtype会导致交易类型字段不可编辑，如果需要交易类型可编辑需使用|
||----isNoQuery||跳转下游单据时不传递url上的参数||否||boolean||默认会传递url上的参数到下游单据query上，这样下游单据所有接口上都会拼上对应参数，可能产生权限问题，如果不想要可以添加此参数|
||--carryData||覆盖业务add数据||否||{}||示例 {carryData: {transtype: '111111111111111'}}|
||--ignoreViewModelQuery||跳转下游单据时不传递上游单据query上的参数||否||boolean||默认会传递上游单据query的参数到下游单据query上，这样下游单据所有接口上都会拼上对应参数，可能产生权限问题，如果不想要可以添加此参数|

- mode=browse是浏览态，会调用enter接口（废弃，不推荐使用）
- mode=edit + readOnly=false 是编辑态，会调用detail接口，如果无id则不会调用detail接口
- mode=edit + readOnly=true 是浏览态，会调用detail接口，如果无id则不会调用detail接口
- args0='bill'，打开单据，bill-单据；menu-菜单（不推荐使用）
- args3=viewModel，当前页面模型

### [](#13-通过工作台打开)1.3. 通过工作台打开

工作台去iframe的情况通过cb.render()打开

### [](#14-移动端打开)1.4. 移动端打开

使用mtl.openNewWebview打开非MDF的页面，非MDF页面打开MDF页面也是一样的

## [](#2-打开自定义页面)2. 打开自定义页面

### [](#21-通过url打开)2.1. 通过URL打开

打开自定义页面有2种方式，公共路由和自定义路由：

- 其中公共路由不需要在route.jsx中注册url，只需要在portal/index.jsx中导出组件即可，访问路径上需要加 /platform
- 自定义路由需要在route.jsx中注册url，访问路径上不需要加 /platform
- 如需要跳过鉴权必需使用自定义路由

#### [](#211-公共路由)2.1.1. 公共路由

https://<业务中台>/mdf-node/platform/definepage?domainKey=upu&serviceCode=xxx

- platform为公共路由前缀
- definepage为portal/index.jsx目录导出的组件名称
- 移动端需要在手机上访问或在浏览器开启手机模拟器访问

#### [](#212-自定义路由)2.1.2. 自定义路由

https://<业务中台>/mdf-node/definepage?domainKey=upu&serviceCode=xxx

- 可通过cb.extend.registerRoutes注册路由，详见《[领域React Router扩展](#/guides/03-linyureactrouterkuozhan)》章节
- 也可以在统一Node配置中以配置的方式注册前端扩展路由、和Node端扩展路由，详见**《[MDF服务配置项说明](#/node/02-config-item-desc)》**章节
- 如需要跳过鉴权需要按上面的链接文档配置白名单 AUTH_WHITELIST 属性

### [](#22-通过api打开)2.2. 通过API打开

viewmodel.communication({

 payload: {

 type: 'platform',

 url: 'user/login',

 data: { ... }

 };

});

- type：固定为platform
- url：自定义路由

## [](#3-返回上一页)3. 返回上一页

**示例1**

viewmodel.communication({ type: 'return' });

**示例2**

viewModel.execute('back')

## [](#4-刷新页面)4. 刷新页面

说明：手动触发刷新动作，会降低页面性能，不建议使用

viewModel.execute('refresh')

## [](#5-页面参数)5. 页面参数

页面URL上支持的参数清单

||**参数**||**类型**||**备注**|
||domainKey||string||前端服务编码|
||serviceCode||string||原子服务编码|
||busiObj||string||业务对象编码|
||yht_access_token||string||登录Token|
||isMobile||boolean||是否移动端 true-移动端；false-Web端，默认空，按终端类型自动识别|
||zoomStyle||number||页面放大倍数，2-放大2倍；2.5-放大2.5倍，默认1，不放大|
||skipUserAgent||boolean||是否逃过往Cookie种token逻辑|
||debugNode||boolean||调试Node服务|
||debugLogs||boolean||调试日志|
||noCache||boolean||无缓存访问，Cache-Control: no-cache|
||debug||boolean||开启调试，加载高质量sourcemap|
||noFlowCom||boolean||禁用审批组件、文件服务组件|
||noShowLeft||boolean||隐藏导航栏返回按钮，仅移动端生效|

## [](#6-列表页打开侧滑抽屉)6. 列表页打开侧滑抽屉

列表进详情或者编辑，扩展脚本在打开页面前把参数配置注入

// 原理是调用runCommandLine添加了templateType和extraConfig，非框架默认action可以直接使用runCommandLine打开侧滑。

cb.loader.runCommandLine('bill', {

 billtype: 'voucher',

 params: {

 templateType: 'modal',

 id: '2214931147379968',

 mode: 'edit',

 domainKey: ''

 },

 billno: 'bankdot',

 extraConfig: {

 _innerType: 'fadeRightToLeft'

 }

}, viewModel);

 

 

框架默认的action，需要通过before事件修改参数。比如下面示例：

 

 

 // 列表进行详情需要加

viewModel.getGridModel().on('beforeDblClick', function(args){

 // 必须配置

 args.templateType = 'modal';

 if (!args.extraConfig) args.extraConfig = {};

 args.extraConfig._innerType = 'fadeRightToLeft';

 

 // 其他配置

 args.extraConfig.title = '自定义标题';

 //去掉底部footer

 args.extraConfig.footer=null // 其他所有Modal组件 支持的配置都可以扩展

 args.extraConfig = {...}

})

 

// 列表复制需要加

viewModel.on('beforeCopy', function(args){

 // 必须配置

 args.params.templateType = 'modal';

 if (!args.params.extraConfig) args.params.extraConfig = {};

 args.params.extraConfig._innerType = 'fadeRightToLeft';

})

 

// 列表编辑需要加

viewModel.on('beforeEdit', function(args){

 // 必须配置

 args.carry.templateType = 'modal';

 if (!args.carry.extraConfig) args.carry.extraConfig = {};

 args.carry.extraConfig._innerType = 'fadeRightToLeft';

})

 

// 列表新增需要加

viewModel.on('beforeAdd', function(args){

 // 必须配置

 args.params.templateType = 'modal';

 if (!args.params.extraConfig) args.params.extraConfig = {};

 args.params.extraConfig._innerType = 'fadeRightToLeft';

})

 

// 其他配置比如修改弹窗宽度

args.params.extraConfig.width='300px';