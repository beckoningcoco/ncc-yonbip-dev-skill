---
title: "YNF 常见问题汇总"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g03-common-problem"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 39
---

# YNF 常见问题汇总

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g03-common-problem | 所属：YNF-开发指南

# [](#ynf-常见问题汇总)YNF 常见问题汇总

## [](#一页面跳转)一、页面跳转

### [](#1ynf跳转到ynf)1.YNF跳转到YNF

跳转页面的方法如下：

rootStore.pageStore.push({

  billNo: '页面编码',

  params: {

    参数1: '参数1'

    ...

  }

})

### [](#2ynf跳转到mdf)2.YNF跳转到MDF

`YNF`和`MDF`之间的跳转属于跨框架跳转，直接使用以下方式：

window.location.href = '目标页面url'

传参方面，简单参数可放在url上，复杂对象参数可以考虑使用localStorage或indexDB等方式，跳转之前先存在里面，跳转之后再从里面拿出来

### [](#3ynf返回ynf页面)3.YNF返回YNF页面

返回到上一页的方法如下：

rootStore.pageStore.goBack()

## [](#二主表字段设置默认值)二、主表字段设置默认值

### [](#1设置成常量)1.设置成常量

如下图，直接在右侧设置即可
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-2.1.a0dbbb38.png)

### [](#2设置成mobx表达式)2.设置成mobx表达式

#### [](#场景1字段1的默认值依赖字段3的在设计器配置的默认值)场景1（字段1的默认值依赖字段3的在设计器配置的默认值）

`字段3`设置了默认值`333`
`字段1`设置了默认值`mobx`表达式：`mobx://rootStore.formStore.getValue('new3')`
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-2.2.1.8a7f4bcb.png)

#### [](#场景2字段1的默认值依赖add接口返回的数据)场景2（字段1的默认值依赖add接口返回的数据）

`字段1`设置了默认值`mobx`表达式：`mobx://rootStore.formStore.getValue('createTime')`，`createTime`是`add`接口返回的数据
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-2.2.2.7c8acb8d.png)

#### [](#场景3字段1的默认值依赖异步接口返回的数据)场景3（字段1的默认值依赖异步接口返回的数据）

`这种情况不要给字段设置默认值表达式!!!`

因为主表字段读取默认值属性的时候，异步接口可能还没有返回数据，此时组件读取的默认值仍为空。这种情况需要写扩展脚本给页面挂钩子事件，在页面`init`事件之后再给组件赋值

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-2.2.3.1.7112174e.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-2.2.3.2.a6b8b592.png)
效果如下：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-2.2.3.3.3f8dcfdb.png)
示例代码如下：

function ExtendReaction(rootStore){

  return {

    init: {

      afterHook() {

        // setTimeout模拟异步

        setTimeout(() => {

          // 模拟异步返回的数据

          const res = { new1: '1111' }

          // 直接设置value

          rootStore.formStore.setValue(res)

        }, 2000)

      }

    }

  }

};

## [](#三子表字段设置默认值)三、子表字段设置默认值

### [](#1设置成常量-1)1.设置成常量

跟主表的设置方式一样，参考`二-1`

### [](#2设置成mobx表达式-1)2.设置成mobx表达式

#### [](#场景1字段1的默认值依赖字段3的在设计器配置的默认值-1)场景1（字段1的默认值依赖字段3的在设计器配置的默认值）

跟主表的设置方式一样，参考`二-2-1`

#### [](#场景2字段1的默认值依赖add接口返回的数据-1)场景2（字段1的默认值依赖add接口返回的数据）

跟主表的设置方式一样，参考`二-2-2`

#### [](#场景3字段1的默认值依赖异步接口返回的数据-1)场景3（字段1的默认值依赖异步接口返回的数据）

`异步请求接口同样也是要写扩展脚本，只不过拿到数据之后不能直接给子表赋默认值`

因为子表是点击增行才会增加一行数据，所以扩展脚本拿到的数据需要暂存在一个位置。下面的示例中是放在`rootStore.myres`中

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-3.2.3.1.37334fd4.png)
之后在子表字段的默认值上配置`mobx`表达式获取`rootStore.myres.new1`的数据即可
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-3.2.3.2.e0f107db.png)

## [](#四按钮显示与隐藏问题排查)四、按钮显示与隐藏问题排查

- 优先级最高的是按钮权限，从`tplAndMeta`接口里查看，`permissions`里对应动作的的`authFlag`如果为`true`，说明有权限；如果为`false`，说明该角色没权限，需要去工作台角色管理里配置功能权限
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-4.1.cccd2917.png)
- 页面`url`里如果有`designPreview=true`的参数，或者是设计器点击预览按钮打开的页面，那么当前页面就是预览状态，预览状态默认不处理权限，如需增加权限控制请去掉`designPreview=true`

- 权限之下，就按照按钮本身的`visible`配置来决定是否显示，如果配置了`true`，则为显示；如果配置了`mobx`表达式，则按照表达式的结果来决定是否显示
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-4.2.7a9b6b5c.png)

## [](#五meta缓存)五、meta缓存

`YNF`只在`PC端工作台`有`meta`缓存的处理，其他情况不做缓存处理，`meta`缓存在`indexDB`中

如果在设计器页面修改了页面的协议，工作台想要看到最新的页面效果可以用以下两个方案:

- 左上角大刷
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-5.1.b80a6f76.png)
- 手动清除`indexDB`缓存
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-5.2.605f082a.png)

## [](#六提示窗确认窗消息的调用)六、提示窗，确认窗，消息的调用

### [](#1提示窗的调用)1.提示窗的调用

调用方式如下：

rootStore.utils.message.danger('危险弹窗')

rootStore.utils.message.info('信息弹窗')

rootStore.utils.message.success('成功弹窗')

rootStore.utils.message.warning('警告弹窗')

### [](#2确认窗的调用)2.确认窗的调用

调用方式如下：

rootStore.utils.confirm({

  title: '标题',

  content: '确定要xxx吗？',

  onOk: () => { console.log('确认') },

  onCancel: () => { console.log('取消') }

})

### [](#3消息的调用)3.消息的调用

调用方式如下：

rootStore.utils.notice.danger('危险消息')

rootStore.utils.notice.info('信息消息')

rootStore.utils.notice.success('成功消息')

rootStore.utils.notice.warning('警告消息')

rootStore.utils.notice.error('错误消息')

## [](#七详情页覆盖默认action行为)七、详情页覆盖默认action行为

详情页在不同的页面状态下，会调用不同的`action`进行页面数据初始化

- 新增态会调用新增的`action`，新增的`action`会调用`add`接口拿到详情页的数据

- 浏览态/编辑态会调用详情的`action`，详情的`action`会调用`detail`接口拿到详情页的数据

- 复制态会调用复制的`action`，复制的`action`会调用`detail`和`copy`接口拿到详情页的数据

如果想要自定义获取详情页的数据，可以在`cardReaction`中进行配置，覆盖默认的`action`行为，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-7.45d2fda2.png)
自定义`action`，需要在自己的扩展脚本中定义，在扩展脚本中可以初始化详情页的数据

## [](#八列表页覆盖默认action行为)八、列表页覆盖默认action行为

列表页只有一种`action`来初始化数据，即列表的`action`

如果想要自定义获取列表页的数据，可以在`listReaction`中进行配置，覆盖默认的`action`行为，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-8.c64fa513.png)

## [](#九组件的visible和disabled控制)九、组件的visible和disabled控制

- 组件一旦设置了`visible`和`disabled`，则运行时组件的显示和只读只跟协议里设置的这两个属性有关，不再受扩展脚本或者字段权限一类的逻辑控制，如下图
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-9.1.82ae71ef.png)
- 如果一个组件的显示和只读想要实现为动态控制的效果，那需要给组件的`visible`和`disabled`绑定一个`mobx`变量，如下图，这个`mobx`变量的表达式可以绑定一个可观测的变量，这样组件就能动态响应
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-9.2.00db2f5a.png)

## [](#十运行时模板问题排查)十、运行时模板问题排查

### [](#1未配置过ui模板)1.未配置过UI模板

每个页面都有一个`tplIId`，代表当前页面模板的编号，如下图
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-10.1.f01a0c91.png)
在设计器右上角点击预览打开的运行时页面，打开的就是当前`tplId`对应的模板

### [](#2配置过ui模板)2.配置过UI模板

当你发现运行时的模板不是你想要的模板时，可以在控制台输入`rootStore.pageStore.params.tplId`查看当前页面的`tplId`是哪个，与你的设计器协议里的`tplId`字段进行比对

- 若两个`tplId`不一样，说明你设计器打开的模板不对，从`UI模板`列表里找到正确的模板，打开设计器进行修改
- 也可能是你`UI模板`里的优先级配置出错，运行时打开了错误的模板，需要手动修正，让运行时打开你想要的模板

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-10.2.313f8d19.png)

## [](#十一自定义事件和自定义事件的权限控制)十一、自定义事件和自定义事件的权限控制

### [](#1-写自定义事件)1. 写自定义事件

如果你的页面按钮需要执行自定义事件，首先要在自己的二方包或者设计器的脚本编辑页面自定义一个`action`，定义的方式如下：

- 自己的二方包的方式：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-11.1.1.923b3a4e.png)
- 设计器的脚本编辑页面的方式：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-11.1.2.1b499c1e.png)
示例代码如下：

rootStore.actions.myevent = {

 doAction: () => {

 console.log('myevent')

 }

}

### [](#2绑定自定义事件)2.绑定自定义事件

按钮绑定自定义事件，按钮的`onclick`事件绑定自定义`action`表达式
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-11.2.ae46021c.png)

### [](#3自定义事件的权限)3.自定义事件的权限

如果自定义事件需要配置权限，需要在设计器的命令管理里新增一条命令，之后在工作台角色管理里进行配置，这样按钮就会受权限控制
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-11.3.e9fc330e.png)

## [](#十二弹窗的调用)十二、弹窗的调用

### [](#1打开一个ynf单据的弹窗)1.打开一个YNF单据的弹窗

当前页面弹窗栈存在`rootStore.pageStore.dialogStack`属性中

- 旧的`api`

rootStore.pageStore.openModal({

  billNo: 'xxx',

  bodyStyle: {

    height: '500px',

    ...

  },

  zIndex: 888,

  containerType: 'drawer', // 此处传drawer会以右侧抽屉的方式弹出弹窗，不传此属性则默认是正常弹窗

  query: {}, // 下个页面url参数

  params: {}, // 页面之间传参

  onOk: () => {}, // 弹窗里确定按钮的回调

  onCancel: () => {} // 弹窗里取消按钮的回调

})

- 新的`api`(`2024年4月份`版本新增，新`api`比较旧`api`更加灵活，头部内容底部都可自由扩展)

// 创建一个dialog对象

const dialog = rootStore.pageStore.DialogBuilder.create()

// 创建title对象

const titleView = rootStore.pageStore.DialogBuilder.createTitle()

// 创建内容区对象

const contentView = rootStore.pageStore.DialogBuilder.createBillContent(billNo, query, params)

// 创建底部工具栏对象

const footerView = rootStore.pageStore.DialogBuilder.createOkCancelFooter(onOk, onCancel)

// 将3个对象分别绑定在dialog上

dialog.setTitleView(titleView).setContentView(contentView).setFooterView(footerView)

rootStore.pageStore.openDialog(dialog)

### [](#2打开一个自定义弹窗)2.打开一个自定义弹窗

- 旧的`api`

rootStore.pageStore.openModal({

  uiType: 'component', // uiType需要是component

  component: '你要展示的自定义dom',

  bodyStyle: {

    height: '500px',

    ...

  },

  zIndex: 888,

  containerType: 'drawer', // 此处传drawer会以右侧抽屉的方式弹出弹窗，不传此属性则默认是正常弹窗

  onOk: () => {}, // 弹窗里确定按钮的回调

  onCancel: () => {} // 弹窗里取消按钮的回调

})

- 新的`api`(`2024年4月份`版本新增，新`api`比较旧`api`更加灵活，头部内容底部都可自由扩展)

// 创建一个dialog对象

const dialog = rootStore.pageStore.DialogBuilder.create()

// 创建title对象

const titleView = rootStore.pageStore.DialogBuilder.createTitle()

// 创建内容区对象

const contentView = rootStore.pageStore.DialogBuilder.createCustomContent(component)

// 创建底部工具栏对象

const footerView = rootStore.pageStore.DialogBuilder.createOkCancelFooter(onOk, onCancel)

// 将3个对象分别绑定在dialog上

dialog.setTitleView(titleView).setContentView(contentView).setFooterView(footerView)

rootStore.pageStore.openDialog(dialog)

### [](#3关闭弹窗)3.关闭弹窗

- 旧的`api`

rootStore.pageStore.closeModal()

- 新`api`(`2024年4月份`版本新增)

// 传index可以控制关闭第几个，不传则关闭最上层的那个

rootStore.pageStore.closeDialog(index)

## [](#十三请求后台的requestapi)十三、请求后台的request（api）

### [](#1领域的二方包中)1.领域的二方包中

import request from 'ynf-core-engine/request';

const res = await request({

  url, // 请求的url

  method, // get or set

  headers,

  params, // url上的参数

  data // body

})

### [](#2设计器的脚本编辑中)2.设计器的脚本编辑中

const res = await rootStore.utils.request({

  url, // 请求的url

  method, // get or set

  headers,

  params, // url上的参数

  data // body

})

`request`返回一个promise对象，可以`await`或者`request().then()`

## [](#十四多语相关问题)十四、多语相关问题

`YNF`里分为两种多语，静态资源多语和元数据多语，这两种多语的使用方式是不同的，遇到问题的时候需要进行区分

### [](#1静态资源多语)1.静态资源多语

- `YNF`里的静态资源多语绝大部分指的是系统里的固定提示的多语，比如`保存成功`这种提示，通常用户不能进行控制
- 此种情况的多语是由前端框架内部的人维护多语词条，并进行对应环境的同步

### [](#2静态资源多语问题排查方式)2.静态资源多语问题排查方式

遇到多语没有正确翻译可以翻阅下面文档
[https://gfwiki.yyrd.com/pages/viewpage.action?pageId=56665721](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=56665721)
[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365)

### [](#3元数据多语)3.元数据多语

- `YNF`里表单的组件标题，操作日志里`action`的名字这种用户自定义的文案数据，都属于元数据多语
- 这种情况要实现多语，需要定义对应的`xxxx_resid`属性，这个属性里面是多语词条。例如组件的标题用的是`catpion`属性，想要实现多语，需要在协议里定义`caption_resid`属性，这个属性对应的是多语此条，如下图
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-14.3.5f2f7e85.png)

### [](#4元数据多语问题排查方式)4.元数据多语问题排查方式

- 遇到多语没有正确翻译，首先查看本租户是否开启了多语
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-14.4.1.ba5ca498.png)
- 开启了多语的情况下，再查看此接口`ypd/bill/multiTrans`的返回，根据你`xxxx_resid`对应的多语词条`id`，在这上面进行查找。若能查找到，找下`YNF`部门的人员进一步定位问题；若查找不到，说明多语抽取的有问题，找本领域负责抽取多语的同事看一下是否需要重新抽取多语
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-14.4.2.3060d472.png)

## [](#十五弹窗组件调用并控制显隐)十五、弹窗组件调用并控制显隐

- 在设计器扩展脚本里定义一个响应式变量，默认是`false`![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-15.1.1.f851f891.png)
- 页面拖拽一个弹窗组件，弹窗组件的显示属性绑定表达式`mobx://rootStore.aaa`![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-15.1.2.50a9bd1c.png)
- 之后通过代码`rootStore.aaa=true/false`就可以控制弹窗组件的显隐

## [](#十六常用的钩子事件和绑定方法)十六、常用的钩子事件和绑定方法

### [](#1详情页的初始化事件钩子)1.详情页的初始化事件钩子

在二方包或者设计器扩展脚本里写如下代码

function ExtendReaction(rootStore){

 return {

 init: {

 beforeHook(){

 // 初始化前的钩子，这个时候，页面的Store都挂了，但是页面数据还没请求，可以写一些不依赖页面数据的业务逻辑

 rootStore.xxxx.xxx

 },

 afterHook(){

 // 初始化后的钩子，这个时候，页面数据已经请求，依赖页面数据的逻辑要写在这

 rootStore.xxxx.xxx

 }

 }

 };

};

### [](#2列表页的初始化搜索事件钩子)2.列表页的初始化搜索事件钩子

写这个钩子事件之前，要确保列表页`listReaction`上这个开关处于打开状态（默认是打开的）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-16.2.1.0acc9d94.png)
之后在二方包或者设计器扩展脚本里写如下代码

function ExtendReaction(rootStore){

 return {

 init: {

 beforeHook(){

 // 初始化前的钩子，这个时候，页面的Store都挂了，但是页面数据还没请求，可以写一些不依赖页面数据的业务逻辑

 rootStore.xxxx.xxx

 },

 afterHook(){

 // 初始化后的钩子，这个时候，页面数据已经请求，依赖页面数据的逻辑要写在这

 rootStore.xxxx.xxx

 }

 }

 };

};

### [](#3某个action的前后事件)3.某个action的前后事件

首先找到你要挂的`action`的`alias`

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-16.3.1.0eb3a947.png)
之后在二方包或者设计器扩展脚本里写如下代码

function ExtendAction(rootStore){

 return {

 // openBill就是action的alias

 openBill: {

 beforeHook(args){

 // beforeHook里可以修改args

 console.log('跳转前', args)

 return args

 },

 afterHook(){

 console.log('跳转后')

 }

 }

 }

};

所有的设计器里的`action`，都可以用`beforeHook`和`afterHook`，除此之外，某些`action`里有一些`action`专用的钩子，比如`save`的`action`里还有`beforeSaveHook`和`afterSaveHook`，目前可以联系开发确认，后续会统计在此文档里

### [](#4某个组件事件的前后事件)4.某个组件事件的前后事件

- 首先要明确一个概念，`ynf`里组件事件和`action`是多对一的关系，`action`相当于是定义好的`function`，组件事件去绑定`action`，多个组件事件可以绑定同一个action
- 在绑定前后事件之前，要明确你是要绑在`action`上还是单独绑在这个组件事件上，比如`A`、`B`两个按钮都绑定了`openBill`这个`action`，但是`A`按钮点击前后需要有其他业务逻辑，`B`按钮不需要，那就要绑定在`A`组件上，如果`A`、`B`两个按钮都需要绑定前后事件，则可以考虑绑在`openBill`这个`action`上

第一步先确定你要在啥事件前后绑定事件，比如是某个`table`组件的行双击事件`onRowDoubleClick`

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-16.4.1.b18784aa.png)

之后在协议里定义对应的`before`和`after`事件，分别是`onBeforeRowDoubleClick`和`onAfterRowDoubleClick`（注意驼峰式命名，`B`和`A`要大写）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-16.4.2.7412c592.png)

## [](#十七如何使用其他二方包导出的模块)十七、如何使用其他二方包导出的模块

如果我想用`ynf-core-engine`库里导出的`./actions/navigate`模块怎么办呢？

### [](#1领域的二方包中-1)1.领域的二方包中

import { openBill } from 'ynf-core-engine/actions/navigate'

openBill.doAction()

### [](#2设计器的脚本编辑中-1)2.设计器的脚本编辑中

window.YnfCoreEngine?.get('./actions/navigate').then(res => {

 const obj = res()

 if (obj.default) {

 obj = obj.default

 }

 const openBill = obj.openBill

 openBill.doAction()

})

## [](#十八如何在列表页或自定义页面中拖拽一个表单组件使用)十八、如何在列表页或自定义页面中拖拽一个表单组件使用

比如：想在列表页加一个下拉框，然后在设计器中配置下拉框的默认值，运行时可以通过模型能取到下拉框的值

- 表单组件是需要绑定数据源的，且数据源需要是formStore，所以第一步，如果页面没有formStore的话需要去设计器页面的数据页签下手动创建一个formStore，如果有的话，此步骤忽略
- 在formStore上增加一个新的字段Field，用于运行时创建字段模型，可以让组件去绑定这个数据源
- 页面上拖拽一个Form组件，Form组件绑定第一步里的store，之后在里面拖拽下拉框组件
- 下拉框组件右侧设计器属性里，绑定第二步创建的字段作为数据源
- 下拉框组件右侧设计器属性里，配置默认值
- 扩展脚本里rootStore.你的formStore.setUiState('add')，将表单状态设置为新增态，因为只有新增态的form才会读取默认值
- 运行时通过rootStore.你的formStore.get('第二步里字段storeField').getValue()获取下拉框的值

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-17.1.1.58bad637.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-17.1.2.e2a583e5.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-17.1.3.2a15d8db.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-17.1.4.431cdfcb.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-17.1.5.88fae858.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-17.1.6.f9b78e17.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-17.1.7.997d8f87.png)

## [](#十九主组织和交易类型切换后的变化ui模板切换后如何带值到切换后的模板)十九、主组织和交易类型切换后的变化&UI模板切换后如何带值到切换后的模板

### [](#1了解一下标准产品的相关概念)1.了解一下标准产品的相关概念

- 首先需要了解一下影响UI模板的因素，目前能主动影响运行时UI模板切换的字段有主组织和交易类型
- 当运行时主组织切换后，会请求getTplId接口，判断切换后的主组织是否关联了其他UI模板：如果关联了，页面模板就会切换，此时除主组织和交易类型之外，其他数据都会被清空；如果没关联，页面除了主组织之外的数据都会被清空，包括交易类型
- 当运行时交易类型切换后，也会请求getTplId接口，判断切换后的交易类型是否关联了其他UI模板：如果关联了，页面模板就会切换，此时除主组织和交易类型之外，其他数据都会被清空；如果没关联，页面不会发生任何变化

### [](#2当页面模板发生切换想带主组织和交易类型之外的其他字段的值到新的模板中)2.当页面模板发生切换，想带主组织和交易类型之外的其他字段的值到新的模板中

- 打开设计器左侧数据页签，里面的reaction下有cardReaction，右键打开编辑器，按自己的实际需要增加reloadUITemplateByOrgData和reloadUITemplateByBusiData的配置(需要放在params里)
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-common-problem-18.1.1.a17f3091.png)
- 在编辑器里定义rootStore.xxxx.xxxx1方法，方法返回一个对象，对象里是要带的数据，示例在下面

// 示例

rootStore.xxxx.xxxx1 = () => {

 const new1value = rootStore.formStore.get('new1').getValue()

 const new2value = rootStore.formStore.get('new2').getValue()

 return {

 new1: new1value,

 new2: new2value

 }

}

## [](#二十window__ext_bill_scripts_ynf__扩展脚本的写法)二十、window.__EXT_BILL_SCRIPTS_YNF__扩展脚本的写法

`window.__EXT_BILL_SCRIPTS_YNF__`是特殊场景下才需要使用的扩展脚本加载方式，非特殊情况不要主动使用，写法如下

(function () {

 var $define = window.$define

 if (typeof $define === 'function') {

 $define([], function () {

 return function (sysData) {

 const { tools, rootStore } = sysData;

 const { mobx, loadYNF } = tools;

 const { makeObservable, computed, reaction, extendObservable } = mobx;

 // 下面就是你要写的扩展逻辑了

 // ----------------------脚本开始----------------------

 rootStore.balabala

 ......

 // ----------------------脚本结束----------------------

 }

 })

 }

})()