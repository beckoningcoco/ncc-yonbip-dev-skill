---
title: "常见问题整理"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-changjianwentizhengli"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# 常见问题整理

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-changjianwentizhengli | 所属：指南

# [](#常见问题整理)常见问题整理

## [](#1参照属于动态参照根据不同条件可弹出树形参照或者列表参照)1、参照属于动态参照，根据不同条件可弹出树形参照或者列表参照

referModel.prototype.setRefCode = function (code, cRefRetId) {

 this._set_data('cRefType', code, true);

 if (cRefRetId) {

 try {

 const obj = JSON.parse(cRefRetId); const bill2ReferKeyFieldMap = {};

 for (const billKey in obj) {

 const referKey = obj[billKey];

 bill2ReferKeyFieldMap[billKey] = referKey;

 }

 this._set_data('bill2ReferKeyFieldMap', bill2ReferKeyFieldMap);

 } catch (e) {

 console.error('Refer关联定义' + cRefRetId + '有错误');

 }

 }

 this.clearCache('vm');

};

需要配两个参照，通过setRefCode动态的更新参照的模型以达到修改参照类型的效果，实际上是一个UI组件对应多个参照refcode

## [](#2自定义组件引入到页面通过脚本引入需要配ctrltype)2、自定义组件引入到页面通过脚本引入需要配ctrltype

## [](#3图标库的地址)3、图标库的地址：

使用方式<Icon type="zuidahua" />

## [](#3toobar按钮状态显示不正确此处打断点查看状态)3、toobar按钮状态显示不正确，此处打断点查看状态

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentizhengli_image1.d28f29ba.png)

## [](#4mdf现在不兼容国产化-银河麒麟火狐浏览器)4、MDF现在不兼容国产化-银河麒麟火狐浏览器

## [](#5统一node前端依赖的稳定版本29)5、统一node前端依赖的稳定版本2.9

## [](#6单选参照回显是ok的但是切换成多选以后无法回显示)6、单选参照回显是OK的但是切换成多选以后无法回显示

大概率是因为pub_ref表中的centitykeyflt配的不对，需要修改成业务数据的主键

## [](#7配了一个tab-但是里面的内容没有渲染)7、配了一个tab 但是里面的内容没有渲染

当tab存在cstyle的时候里面只能又billno
如果没有billno并且存在cstyle的时候就会渲染失败

## [](#8自定义的action怎么拦截)8、自定义的action怎么拦截

和框架的一样，before/after + action 以小驼峰结构进行书写

## [](#9多子表行按钮点击报错-无反应)9、多子表，行按钮点击报错 无反应

大概率是action里的params中 childrenfield配的和元数据对不上

## [](#10选中表格行-导出-但是无数据)10、选中表格行 导出 但是无数据

大概率是因为表格的数据中没有pubts字段

## [](#11查询区重置按钮点击之后想要取消默认做的那次搜索可以监听查询模型的afterresetclick事件-return-false)11、查询区重置按钮点击之后想要取消默认做的那次搜索可以监听查询模型的afterResetClick事件 return false

## [](#12主组织-保存的时候一直校验失败但是其实是非空)12、主组织 保存的时候一直校验失败，但是其实是非空

这种情况先检查扩展脚本是否对beforeCheck做过业务处理并且return了 false
如果是这种情况，需要在return
false之前手动修改主组织模型的checking状态，model._set_data('checking',
false)

## [](#13卡片区判断如何隐藏)13、卡片区判断如何隐藏

用viewmodel.setVisible(false)

## [](#14左树右卡-左边树的搜索框-怎么去掉treemodelsetstateshowsearchinput-false)14、左树右卡 ，左边树的搜索框 怎么去掉treemodel.setState('showSearchInput', false)

## [](#15编辑弹出框选择-取消-或者-确认-是个什么事件)15、编辑弹出框，选择 取消 或者 确认 是个什么事件

默认是save 和abandon  如果你们自己配的toolbar就按自己配的走

## [](#16要用到其中一个bool类型的值动态控制另外一个组件的必输状态-但是某些特定情况下-被控制组件虽然已经是非必输了但是校验的时候还是会提示必输为空)16、要用到其中一个bool类型的值动态控制另外一个组件的必输状态 但是某些特定情况下 被控制组件虽然已经是非必输了但是校验的时候还是会提示必输为空

原因是切换必输的时候没有同步清理模型内的checkMsg字段

## [](#17新建的表格只显示屏幕的一半外层容器没有配置正确应该一列显示)17、新建的表格只显示屏幕的一半外层容器没有配置正确，应该一列显示

## [](#18设计器浏览态本地调试报错)18、设计器浏览态本地调试报错

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentizhengli_image2.97c11ef9.png)

## [](#19编辑页选择条件数据后如何刷新列表)19、编辑页选择条件数据后如何刷新列表

viewmodel.execute('refresh')

## [](#20参照配了新增的action但是没有展示按钮是怎么回事儿)20、参照配了新增的action但是没有展示按钮是怎么回事儿

参照弹出框上的新增按钮只配action是不可行的，还需要配置UI数据

## [](#21表格自定义列的方法)21、表格自定义列的方法

在项目中增加扩展的组件 加在extend formatter目录下
将组件注册到扩展组件中
在脚本的init方法中使用如下代码

gridModel.setColumnState('log', 'formatter', (rowInfo, rowData,

fullName = "bd.project.ProjectVO") => {

if (rowData.dr == 2) { //dr为2时设置行不可编辑

viewmodel.getGridModel().setRowState(rowInfo.rowIndex, "disabled",

true);

} else {

viewmodel.getGridModel().setRowState(rowInfo.rowIndex, "disabled",

false);

}

return { //预删除新交互

formatterKey: 'DeleteLabel',

props: {

rowInfo,

rowData,

fullName

}

}

})

## [](#22表头明细和表头切换到时候表格列展示不对)22、表头明细和表头切换到时候表格列展示不对

二者切换的时候是在参数上使用isSum是否存在且为true进行区分的，根据返回数据的内容进行列的展示,如果列展示的不对，则排查一下是否返回的数据中存在列的key

## [](#23审批流组件)23、审批流组件

审批流组件为引用其他部门的组件，框架只有beforeWorkflow和afterWorkflow两个钩子函数，如果想做操作可以在这两个钩子里进行，其他问题请咨询对应部门，现部门负责人为姜军

## [](#24图片上传组件pictureupload-怎么修改参数)24、图片上传组件pictureupload 怎么修改参数

监听对应模型的beforeUpload事件

## [](#25预发生产环境框架版本)25、预发、生产环境框架版本

统一node的都走3.4版本的

{

"dependencies": {

"@mdf/cube": "3.4-lang",

"@mdf/middlewares-auth": "~3.4.0",

"@mdf/middlewares-log4js": "~3.4.0",

"@mdf/plugin-meta": "3.4-lang"

}

}

## [](#26表格bjointquery字段的链接点击之前想做事情进入浏览态)26、表格bJointQuery字段的链接点击之前想做事情，进入浏览态

监听表格模型的beforeCellJointQuery事件

## [](#27隐藏toolbar)27、隐藏toolbar

viewmodel.execute('updateViewMeta',{code:cGroupCode,visible:false})

## [](#28卡片页面的列表怎么显示出来checkbox)28、卡片页面的列表怎么显示出来CheckBox？

gridModel.setShowCheckbox(true)

## [](#29表格不要分页传参的时候也不要传分页参数)29、表格不要分页，传参的时候也不要传分页参数？

gridModel.setPageInfo('')

## [](#30line列表table行上的一个按钮点击跳出一个modal这个按钮配置成mdd标准的action了edit列表上的ccardkey-如果被占用了还有什么方式可以跳出指定单据)30、line列表Table行上的一个按钮点击跳出一个modal这个按钮配置成mdd标准的action了edit列表上的cCardKey 如果被占用了，还有什么方式可以跳出指定单据

## [](#31如何让表格高度适配其直接父容器呢列表页跳到树卡页面没有发querytree请求)31、如何让表格高度适配其直接父容器呢列表页跳到树卡页面，没有发Querytree请求

## [](#32扩展脚本中如何获取过滤区的数据)32、扩展脚本中如何获取过滤区的数据？

参考查询方案场景问题解答

## [](#33viewmodel中有获取过滤区元素的方法吗)33、viewmodel中有获取过滤区元素的方法吗

参考查询方案场景问题解答

## [](#34使用jdwork跳转页面列表后)34、使用jdwork跳转页面列表后

列表并不会获取列表数据 这个是大概什么问题呢？

查看mode是否为browser

## [](#35拓展脚本可以控制model使其在页面为浏览态的时候也可以编辑吗)35、拓展脚本可以控制model使其在页面为浏览态的时候也可以编辑吗？

setReadOnly(false)

## [](#36cbloaderruncommandline的弹窗能设置个最大化按钮吗)36、cb.loader.runCommandLine的弹窗，能设置个最大化按钮吗

## [](#37左树右表结构-左树节点双击会进入新增这个应该怎么取消掉呢)37、左树右表结构 左树节点双击会进入新增，这个应该怎么取消掉呢？

## [](#38自定义组件没有加载成功)38、自定义组件没有加载成功

如果是在controls里边对应到项目里basic文件夹下

## [](#39有知道如何根据条件筛选参照中的数据吗例如我先选择了会计主体然后要在账簿中显示只有属于选中的会计主体的账簿信息)39、有知道如何根据条件筛选参照中的数据吗，例如我先选择了会计主体，然后要在账簿中显示只有属于选中的会计主体的账簿信息

在beforeBrowse的时候把参数传递过去

## [](#40点击保存的时候表格没有录入数据提示必须要录入一条数据但是真实场景是不想录入数据)40、点击保存的时候表格没有录入数据提示必须要录入一条数据,但是真实场景是不想录入数据

## [](#41js扩展脚本里面如何在列表类型的页面获取点击搜索按钮时的事件)41、js扩展脚本里面如何在列表类型的页面获取点击搜索按钮时的事件？

## [](#42basic中的input组件焦点事件和enter回车事件是不是没有开放出来)42、basic中的Input组件，焦点事件和enter回车事件是不是没有开放出来？

## [](#43可以给表格的某一个单元格单独设置样式吗)43、可以给表格的某一个单元格，单独设置样式吗

gridModel.setCellState(0,'demandOrg_name','style',{border:'1px

solid red'})

## [](#44弹窗点确定后就是保存动作-不刷新上级页面怎么解决)44、弹窗点确定后（就是保存动作） 不刷新上级页面，怎么解决。

框架bug已处理

## [](#45列表中某一行的所有字段都不能修改-该怎么控制)45、列表中某一行的所有字段都不能修改 该怎么控制?

gridModel.setRowState(0,'disabled',true)

## [](#46在扩展脚本里设置一个字段为必填项或者非必填项呢)46、在扩展脚本里设置一个字段为必填项或者非必填项呢

viewModel.get('xxx').setState('bIsNull',true);

## [](#47下拉参照怎么配置出-显示停用-的过滤条件)47、下拉参照怎么配置出 "显示停用" 的过滤条件？

在cStyle里配置 isShowDisabledData:true

## [](#48参照如何支持多选呢)48、参照如何支持多选呢

multiple:true

## [](#49发送http请求能指定其他域名的接口吗)49、发送http请求，能指定其他域名的接口吗?

修改params里的cSvrUrl或者getbillcommand接口返回

## [](#50点击按钮如何向弹窗或者新页面的请求中携带请求参数在新页面或者弹窗中如何获取请求参数)50、点击按钮如何向弹窗或者新页面的请求中携带请求参数，在新页面或者弹窗中如何获取请求参数？

新增或者详情时，在params里面增加carryParams参数

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentizhengli_image3.b6765955.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentizhengli_image4.e4950102.png)

在打开的页面中通过viewModel.getParams().carryParams获取

## [](#51前端有没有批量删行的方法)51、前端有没有批量删行的方法

## [](#52表格中支持checkbox-这种控件类型吗)52、表格中，支持checkBox 这种控件类型吗

支持,scheckbox

## [](#53怎么获取表格复选框的选中状态)53、怎么获取表格复选框的选中状态?

gridModel.getSelectedRows()获取选中行

getSelectedRowIndexes()获取索引

## [](#54打开弹窗)54、打开弹窗

viewmodel.communication({

type: 'modal',

payload: {

key: 'BatchMsg',

data: {

type: 2,

res: result,

}

}

});

## [](#55树卡页面进入怎么获取树的数据进行操作)55、树卡页面进入怎么获取树的数据进行操作

treemodel.on('beforeSetDataSource',function(){})

## [](#56check接口乱码无法调试)56、check接口乱码无法调试

控制台输出cb.debug = true即可

## [](#57扩展脚本报错如何排查)57、扩展脚本报错如何排查？

1、首先确认启动命令是否正确，需要启动envName=production。2、查看启动的extend脚本能否浏览器正常打开。3、确认端口是否正确，resource
override插件是否配置正确。4、自己编写的扩展脚本是否有预发错误问题。5、带电脑来工位找值班同学当面查看
此处为语雀内容卡片。

## [](#58子表增行删行复制行时报错)58、子表增行、删行、复制行时报错。

如果配置了childrenField 看下 childrenField
的值对不对，可能viewmodel里没有对应的模型

## [](#59页面报错-initvm时ui元数据meta协议错误)59、页面报错 "initVM()时UI元数据meta协议错误"

可能是缓存问题，清浏览器缓存

## [](#60有的节点表格不显示数据行数据都上移到最上边了鼠标滚轮向上滚一下才会出来)60、有的节点表格不显示数据，行数据都上移到最上边了，鼠标滚轮向上滚一下才会出来

## [](#61表格里设置枚举类型显示的值不对)61、表格里设置枚举类型显示的值不对

（1）看 meta 里配的 cControlType 是不是 select, optionwidget, radio
其中之一

（2）组件 cControlType 对的话，看下 ui 模板 里的配置，模型生成的
listModel 的 cControlType 是不是 select, optionwidget, radio 其中之一

## [](#62直接通过给参照的输入框赋值的方式来反显参照的其他信息不通过选择的方式自动反显)62、直接通过给参照的输入框赋值的方式来反显参照的其他信息，不通过选择的方式自动反显

referModel.setValue([{id:**,name:**}]) 值为数组对象

## [](#63inputnumber配置成区间输入)63、inputNumber配置成区间输入

compareLogic配置为between

## [](#64列表进入详情页-想替换成我们自己的接口现在是调用billdetail-想调用别的路径)64、列表进入详情页 想替换成我们自己的接口（现在是调用/bill/detail 想调用别的路径）

billcommand表配cmddetail这个command覆盖框架的

## [](#65ui模板的单据列表分页功能怎么开启)65、ui模板的单据列表分页功能怎么开启

返回的分页信息里total大于pagesize

## [](#66如果是一主多子的结构我只上传主表信息子表不上传上传有个校验提示-子表没有数据-如何设置子表无数据可以提交)66、如果是一主多子的结构，我只上传主表信息，子表不上传，上传有个校验，提示 子表没有数据， 如何设置子表无数据可以提交

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentizhengli_image5.f2eb9806.png)

## [](#67单据列表底部分页左侧已选没有显示出来)67、单据列表底部分页左侧已选没有显示出来

gridModel._set_data('rowKeyField','id');

## [](#68自定义加载billno页面)68、自定义加载billNo页面

是否弹窗显示是billNo的templateType=modal

cb.loader.runCommandLine('bill', {

    billtype: 'voucher',

    params: {

        id: '2214931147379968',

        'mode': 'edit',

        'rowData': { xxx }

    },

    billno: 'bankdot',

}, viewModel);

## [](#69异步改同步)69、异步改同步

cb.rest.DynamicProxy.create({ key: { url: 'xxxxx', method: 'POST',

options: { async: false } } });

## [](#70隐藏表格右上角三个点)70、隐藏表格右上角三个点

gridModel.setState('showColumnSetting',false);

## [](#71表格右上角三个点点击后事件监听)71、表格右上角三个点点击后，事件监听

gridModel.on('beforeSetTitle',function(titleList){console.log(titleList)})

## [](#72多页签切换)72、多页签切换

gridModel.on('beforeTabActiveKeyChange',function(args){console.log(arg)})

gridModel.on('afterTabActiveKeyChange',function(args){console.log(arg)})

## [](#73返回上一个页面或关闭弹窗)73、返回上一个页面或关闭弹窗

viewmodel.communication({ type: 'return' })

## [](#74如何取消主组织切换带来的清空效果)74、如何取消主组织切换带来的清空效果

// 扩展脚本 init只后就可以

viewModel.getParams().masterOrgField = null;

## [](#75打印预览里面的serverurl回调地址不对)75、打印预览里面的serverUrl回调地址不对

前端脚手架里设置的，文件是src/web/common/config.env.js
，HTTP_PRINT_DATA_SERVERURL:base_url+'report/getPrintData',
//打印的回调的数据地址

看下base_url这个变量在不同环境下需要设置不同

## [](#76树节点实现分页和懒加载)76、树节点实现分页和懒加载

treeModel.setCache('lazyLoadTreeByPagination',true)

treeModel.setCache('lazyLoadTree',true)

## [](#76设置tips显示浮动提示)76、设置tips显示浮动提示

cStyle配置: "{"tips": "我是提示语"}"

## [](#77即时分析设置查询条件)77、即时分析设置查询条件

修改 viewmodel.getCache('lastSearchCondition')

## [](#78如何判断单组织和多组织)78、如何判断单组织和多组织？

可以根据cb.rest.getAppContext().user信息中有没有orgId判断是单组织还是多组织，如果是单组织能取到orgId，多组织取不到

## [](#79批改界面里如何监听参照事件)79、批改界面里如何监听参照事件

监听beforeBrowse

## [](#80表格设置列隐藏的点点点columnsetting的后续事件)80、表格设置列隐藏的点点点(columnSetting)的后续事件

afterSetTitle

## [](#81修改提示信息内容)81、修改提示信息内容

是否确认删除此'这几个字是框架默认的，如果只是修改后面的部分的话，改一下excel中对应的billtemplate_base中的cTitle就行，或者修改viewmodel.getParams().caption
= 'xxx'

如果需要完全自定义，可能需要修改对应的dom了

或者是jDiwork.updateService('serviceCode',{title:'自定义标题'})

// 也可以使用cb.utils.comfirm

viewmodel.on('beforeBatchdelete', function (args) { //

监听action的before事件, action需结合按钮配置

  cb.utils.confirm('自定义提示文字', function () {

    ...

    确定回调 需要自己写删除逻辑

  }, function () {

      ...

    取消回调

    ...

  })

  return false; // 不会显示框架默认弹窗

})

## [](#82切换页面模式)82、切换页面模式

[viewmodel.biz](http://viewmodel.biz).action().common.browse(viewmodel);

const beforeAct = (beforeActData, callback) => {
callback && callback();
};

[viewmodel.biz](http://viewmodel.biz).action().common.edit("les_pound_card",
viewmodel, {}, beforeAct, () => {})

## [](#83如何在工作台不加载领域扩展脚本extendjs)83、如何在工作台不加载领域扩展脚本extend.js

域名后加?extend=false

## [](#84工作台刷新)84、工作台刷新

## [](#85设置弹窗的一些属性width-classname等)85、设置弹窗的一些属性width classname等

打开弹窗会发个meta，打开
里面的view下的container下的第一行的容器里设置cStye

cStyle.title // 设置标题
cStyle.toolbar // 是否显示底部Toolbar 适合隐藏默认按钮组 取消保存

// 给弹窗加样式
cStyle.classname
cStyle.modelclassname
cStyle.wrapclassname

## [](#86beforesave自己来控制保存使用cbpromise)86、beforeSave自己来控制保存使用cb.promise()

viewmodel.on('beforeSave', function (args) {

    var returnPromise = new cb.promise();

   

cb.utils.confirm('客户商品编码+客户商品sku编码重复对照，是否继续？',

function() {

      return returnPromise.resolve();

    }, function() {

      returnPromise.reject();

    });

  return returnPromise;

});

## [](#87保存为草稿前后的事件)87、保存为草稿前后的事件

// 草稿保存前
beforeSaveDraftReturn

// 草稿保存后
afterDraftBoxClose

## [](#88批改界面里的字段如何隐藏)88、批改界面里的字段如何隐藏

在初始化批改界面之前，监听 batchModifySetFields ，回调2个参数
字段模型和字段UI元数据

viewModel.on('batchModifySetFields',(fields)=>{

// fields 是批改的所有字段里面包含模型和模板

  fields.forEach(ele=>{

    // 修改指定字段不显示，修改数据源

      if(ele.fieldName == 'CShipMode'){

        ele.model.setDataSource({value: "ECDeliver", text: "电商发货

", nameType: "text"})

    }

  });

})

大致的回调参数,ColumnsEle 就是UI模板的字段，model是批改自行的模型

## [](#89外部如何访问store的reducer的portal函数)89、外部如何访问Store的reducer的portal函数

MDF内部对外暴露了如下操作

// customAction 是portal reducer的方法，customParams对应的参数

cb?.updatePanelStore({ isCustomMode: true, customAction: 'delItem',
customParams: [viewmodel.getServiceCode(), { data: {} }] });

## [](#90树表如何展开)90、树表如何展开

实现：

/* 设置展开行 */

  setExpandRow = (data) => {

    if (!data) return;

    const { rowKey, isExpand } = data;

    if (this.keyMap[rowKey]) {

      this.selectRowIndex = rowKey;

      const parentRowKey = this.keyMap[rowKey].parent;

      if (parentRowKey && this.keyMap[parentRowKey]) {

        this.keyMap[parentRowKey].isExpand = isExpand;

      }

    }

    this.setState({ rowKey: this.state.rowKey });

  }

使用：

treeTableModel.setExpandRow({rowKey:'xxx',isExpand:true})

## [](#91如何自己扩展脚本创建编码生成)91、如何自己扩展脚本创建编码生成

// 1、先设置编码参数
viewModel.getParams().isCoded= true;

// 2、调用编码action
[viewModel.biz.do](http://viewModel.biz.do)('createcode',viewModel);

## [](#92列表跳转卡片传数据)92、列表跳转卡片传数据

在跳转前的时间里给 params 里的 carryParams
传数据，然后在卡片里params里取

## [](#93workbench-工作台全部保存后统计信息不正确)93、WorkBench 工作台全部保存后统计信息不正确

默认取code字段的值作为统计关联，找不到的话就会不正确，设置自定义字段：

viewModel.getParams().pushCodeField = 'id'

## [](#94最新resource-override插件配置)94、最新Resource Override插件配置

谷歌插件 自行下载即可

## [](#95如何去除左侧树的全部节点及修改全部文字)95、如何去除左侧树的全部节点及修改"全部"文字

1.如果是树表单据：

方法1:可以在searchTree的cStyle配置showAllNode为false即可，配置allNodeText为**替换"全部"两个文字。

方法2:在单据的扩展脚本中，执行viewModel.getTreeModel().setState('showAllNode',
false) 将"全部"隐藏

执行viewModel.getTreeModel().setState('allNodeText', '**')
修改"全部"文字

## [](#96表格左下角默认的已选如何关闭)96、表格左下角默认的已选如何关闭

// 禁用已选,扩展脚本init之后

viewModel.getParams().disableGridSelectedRows=true或false

// 默认修改已选、不选

viewModel.getGridModel().setState('showSelRows',false)

## [](#97批改batchmodify组件如何拿到所有模型)97、批改(BatchModify)组件如何拿到所有模型

典型案例：批改里的参照如何设置主组织过滤条件

// 获得批改内所有表格字段模型

viewModel.on('batchModifyReferProcess', containerModel => {

    // containerModel

是批改拿到表格所有的模型，可以通过get到每个模型来控制

  containerModel.get('product_Code').on('beforeBrowse', function

(data) {

    // 设置过滤条件，这里可以替换为你的组织过滤

   var condition = {

      "isExtend": true,

      simpleVOs: []

    }; 

    condition.simpleVOs.push({

      field: 'productOfflineRetail.businessAttribute', // 字段

      op: 'eq', // in like...

      value1: 3

    });

    this.setFilter(condition); // conditon是你需要拼接的参数

  });

});

## [](#98表格如何动态隐藏显示某一列)98、表格如何动态隐藏显示某一列

gridModel.setColumnState('cItemName','visible',true或false)

## [](#99cardtabs切换显示和隐藏)99、CardTabs切换显示和隐藏

viewModel.execute('updateViewMeta',{code:'cGroupCode',active:'cGroupCode',visible:true});

## [](#100富文本浏览态)100、富文本浏览态

浏览态给富文本添加style相关，设置cStyle.lineBrowseStyle = {border:"1px
solid red"}类似这种，直接写入到style标签上

## [](#101批改想获得条件对象)101、批改想获得条件对象

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentizhengli_image6.a3814bc2.png)

viewModel.getCache("batchModifyCondition")

// 得到对象

{

    "filterRange": 0,

    "filterObjs": [

        {

            "fieldName": "lineno",

            "operator": "dengyu",

            "value1": "10",

            "value2": ""

        },

        {

            "fieldName": "demandOrg_name",

            "operator": "budengyu",

            "value1": "三只松鼠",

            "value2": ""

        }

    ]

}

## [](#102树节点searchtree左侧加图标)102、树节点（searchTree）左侧加图标

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentizhengli_image7.eae636a8.png)

1、tree数据里面增加一个icon属性，值为图标的名字，比如使用图标`<Icon type="zuidahua" />`

数据增加一个icon: 'zuidahua'即可

2、执行treeModel.setState('showIcon', true);

## [](#103树节点searchtree-右侧加图标)103、树节点(searchTree) 右侧加图标

备注：在searchTree下的container里面增加一个toolbar即可，里面可以放任何图标库有的按钮

## [](#104刷新工作台页签后带来的问题)104、刷新工作台页签后带来的问题

一般来说我们的卡片刷新是读取的store里的portal来拿参数发起刷新的，但是如果外部干预了detail的id的话，那么store得不到最新的更新，所以需要加个参数，来告诉框架复写id，典型示例如下：

overrideId 是否覆盖原有id

// 交易详情展示

      viewmodel.on('tradeDetail',  (args)=> {

        var row =

viewmodel.getGridModel().getRowsByIndexes(args.params.index);

        var data = {

          billtype: 'Archive',

          billno: 'mm_trademain',

          overrideId: true,

          params: {

            mode: 'edit',

            readOnly: true,

            // id: row[0].id,

            id: row[0].iMemberID + "," + row[0].cTradeCode,

            carryParams: {

              fid: row[0].iMemberID,

              ccode: row[0].cTradeCode

            }

          }

        };

        cb.loader.runCommandLine('bill', data, viewmodel, (vm) => {

          // 详情展示取消

          return true;

        })

      });

## [](#105工作台workbench禁止请求自动编号)105、工作台Workbench禁止请求自动编号

viewModel.getParams().banWorkbenchCode = true

## [](#106领域自行扩展了987988错误回调置灰)106、领域自行扩展了987,988错误回调置灰

不要复制演示代码，都是开发聪明一点

// 这里调用即可表示取消，记得检测函数是否存在

// 自己在987,988的取消回调里启用按钮的回调即可

options.afterAct && options.afterAct()

// ==============完整代码演示===============

if (ajaxResult.code == 987) {

  cb.utils.confirm(ajaxResult.message, function () {

    if (options.params && options.params.data) {

      options.params.data = JSON.parse(options.params.data);

      options.params.data.isVerify = false;

      options.params.data = JSON.stringify(options.params.data);

    }

    cb.rest.AjaxRequestManager.doRequest(options);

  }, function() {

      // 这里是确定逻辑

     

  }, function() {

      //这里是取消逻辑，写在这里

    options.afterAct && options.afterAct()

  });

  return false;

}

## [](#107批改组件想自定义塞入过滤条件)107、批改组件想自定义塞入过滤条件

监听batchModifySetFields然后修改item的bCanFilter

// 批改按钮前端逻辑

viewmodel.on('batchModifySetFields', function (arrays) {

  Array.isArray(arrays) && arrays.map(function (item) {

    item.bCanModify = true

    item.bCanFilter = true

  });

});

## [](#108应该构建的低代码设计器看不到任何错误信息)108、应该构建的低代码设计器看不到任何错误信息

开启错误模式即可

在localStorage 设置 yonbuilder_debug_flag_log: 1

## [](#109关闭页面的时候回调-viewmodelonreturnfunctiondata)109、关闭页面的时候回调 viewmodel.on('return',function(data))

// data.data参数 activeKey就是serviceCode

action: "isCloseAction"

activeKey: "st_purchaseorderlist"

data: true

## [](#110生单工作台全部保存提示信息空白)110、生单工作台全部保存提示信息空白

是由于没有设置统计信息默认key：code，可以给push的cmdParameter设置pushCodeField

// 源码

const pushCodeField =

cb.utils.parseCStyle(params.cmdParameter).pushCodeField; //

这里传递参数是用于生单工作台设置显示信息框数据

============================================================
// push动作按钮设置 cmdParameter

## [](#111batchpush-批量推单后不会刷新列表)111、batchpush 批量推单后不会刷新列表

出现这种问题是推单返回数据是一个字符串，框架内处理的逻辑到卡片部分，这里是没有模型，所以无法自行刷新了，给出一个全局事件需要自己去刷新

cb.events.on('pullVoucherStrResult',

(pushData)=>{console.log('这里自行刷新')});

## [](#112打印动作如何修改serverurl里的domainkey)112、打印动作如何修改serverUrl里的domainKey

找到按钮的cParameter或者cmdParameter，添加"printParamsServerUrlDomainKey":"newDomainKey"，这样的话就会按照配置的读取，默认是当前环境的domainKey

'{"classifyCode":"ST.st_purinrecord","printParamsServerUrlDomainKey":"newDomainKey",
"params":{"billno":"st_purinrecord"}}'

## [](#113弹出窗右上角关闭不想刷新)113、弹出窗右上角关闭不想刷新

扩展脚本监听当前弹窗的模型阻止刷新

viewModel.on('beforeClose',function(){return false})

取消按钮不想刷新如下，给按钮设置cParameter或cmdParameter refresh:false

params.cParameter = '{"refresh":false}'

## [](#114推单卡片明细按照选择的数据)114、推单卡片明细按照选择的数据

针对这种子表带复选框的推单明细需要开启Env

// Env

pullVoucherDetailSelectRow : [billNo,billNo2,billNo3,...]

## [](#115如何在mdf里打开一个iframe页面)115、如何在MDF里打开一个Iframe页面

viewModel.communication({

payload: {

key: 'mdf2ynf',

title: 'YNF推单页',

type: 'iframe',

url: 'https://www.yonyou.com'

}

})

## [](#116刷新页面状态异常)116、刷新页面状态异常

常见于界面是浏览态，然后刷新后变为编辑态，是由于存储在redux里的状态没有同步导致，通过代码自行同步：

cb.updatePanelStore?.({ key: viewmodel.getDiworkCode(), id: res.id,
mode: 'edit', readOnly: true });

## [](#117推拉单传递servicecodebusiobjtranstype给下游单据)117、推拉单传递serviceCode、busiObj、transtype给下游单据

在按钮对应的bill_command表的paramter属性中配置，示例：{"query":
{"serviceCode":"xxx", "busiObj":"xxx", "transtype":"xxx"}}

此方法可以下游传递任意参数，所有query中参数都会带到下游单据的所有接口请求中

## [](#118卡片字段标题显示字数配置)118、卡片字段标题显示字数配置

在bill_template_base表的cExtProps中添加iLabelNum=8，iLabelNum值为3-8的数字，超过8个字无法单行显示

## [](#119扩展batchdo的头部提示信息)119、扩展batchDo的头部提示信息

目前提供的配置方法有两种：

1.监听beforeValidateRule事件，修改params中的confirmMsg

2.修改bill_command表中的confirmMsg属性