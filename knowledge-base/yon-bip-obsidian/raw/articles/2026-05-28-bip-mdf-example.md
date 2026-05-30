---
source_url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/QDKFUIZJ11
extracted: 2026-05-28
title: 前端典型示例开发（MDF）
version: BIP5
images: 30
---

概述
快速入门
操作指南
开发指南
开发介绍
新功能开发
新应用开发（YDS）
后端插件开发YDS
前端开发(MDF)
前端典型示例开发(MDF)
新应用开发YNF
本地前端开发环境搭建（YNF）
前端开发（YNF）
前端典型示例开发（YNF）
移动端开发
扩展开发
全球化
组织
权限
特征
基础数据
审批流
业务流
规则引擎
公式
UI模板
参照
导入导出
打印
对象建模
编码规则
调度任务
监控与预警
日志
消息平台
工作台
事件中心
文件服务
YonBuilder应用开发
前端开发
后端开发
移动开发
安全
数据库
DevOps技术
容器云技术
区块链云技术
YMS开发
智能应用开发
专项开发
成果迁移
技术方案
最佳实践
参考手册
常见问题
视频教程
专业开发/开发指南/新功能开发/前端典型示例开发(MDF)
前端典型示例开发(MDF)
最后更新时间：2026-01-23
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	是
私有云	客户化定制开发	是
专属云	客户化定制开发	是
本地部署	客户化定制开发	是
公有云	ISV生态开发	是
私有云	ISV生态开发	是
专属云	ISV生态开发	是
本地部署	ISV生态开发	是
业务场景

示例一通过单据列表查询区的api,实现查询区的显示/隐藏、给查询条件字段赋值、调整查询区显示行数、实现查询区的过滤等场景；

示例二通过前端样式扩展实现列表页、详情页中列表的行、列、单元格背景色的变化；

示例三通过前端扩展实现基础组件、自定义页面的开发场景；

关键词

查询区、MDF、样式扩展、组件扩展、自定义页面扩展

查询方案开发
单据列表查询区的配置说明

查询区的设计需要区分：自建应用和原厂扩展应用

原厂的应用如下图，在YonBuilder单据设计器中无法直接配置

自建应用可以直接在YonBuilder单据设计器中进行设计

单据列表查询区的模型
# 获取单据列表查询区的查询模型
viewModel.getCache('FilterViewModel');

# 获取单据列表查询区的控件的真实模型
viewModel.getCache('FilterViewModel').get('cItemName').getFromModel();
# 具体使用，一般是在单据列表的afterInitCommonViewModel生命周期函数获取查询区模型
  viewModel.on('afterInitCommonViewModel', function(data){
    //获取单据列表查询区最外层查询区容器模型
    let filterViewModel = viewModel.getCache('FilterViewModel');
    //通过单据列表查询区容器模型，查找特定的条件模型(这里是查询条件模型，还不是此组件的真实模型)
    let cItemNameFilterModel = filterViewModel.get('cItemName');
// 获取真实模型
// 比较符为between区间的，getFromModel拿到的事第一个值的模型，getToModel拿到的是第二个值的模型
// 其他的使用getFromModel
let realModel = cItemNameFilterModel.getFromModel();
  })


单据列表查询区详细方法汇总地址：过滤模型FilterModel

单据列表查询区的生命周期函数

本章节主要讲述单据列表查询区加载过程中常用的生命周期函数,参考文档如下：查询模型事件

beforeInit

beforeInit是一个在单据列表查询区脚本加载之前的钩子函数，在这个钩子函数里我们可以修改查询返回的数据。

viewModel.getCache('FilterViewModel').on('beforeInit', function(data){
// 查询区数据加载回来但是还没有进行渲染的时候（查询区初始化成功之前），此时可以修改查询区数据
})

afterInit

一般在afterInit里处理一些查询条件的挂载事件或者其他事件，afterInit的执行时机在查询脚本加载之后且组件渲染以后，第一次搜索之前可以在此钩子里实现的操作。

const filterViewModel = viewModel.getCache('FilterViewModel')
filterViewModel.on('afterInit', function(data){
// 设置查询条件的默认值赋值、设置默认、监听事件（区间开始）
filterViewModel .get('xxx').getFromModel().setValue('XXX');
// 区间类型的查询条件默认值赋值（区间结束）
filterViewModel.get('xxx').getToModel().setValue('XXX');
})

beforeSearch

组件渲染完成，点击查询按钮，查询数据之前的钩子函数事件

const filterViewModel = viewModel.getCache('FilterViewModel')
filterViewModel.on('beforeSearch', function(data){  
// 搜索前，会把data传递过去，可以做过滤操作
})

afterResetClick

重置按钮点击之后事件，会将当前方案重置为默认状态，并执行一次搜索

const filterViewModel = viewModel.getCache('FilterViewModel')
filterViewModel.on('afterResetClick', function(){  
// 查询区重置按钮点击后会重置当前方案为初始化状态，并做一次自动搜索  
// 在这个钩子里返回false的话可以阻止后续的搜索动作(默认为true)  
return false;
})

afterClearSaveCallBackCache

新增查询方案保存后执行的事件

const filterViewModel = viewModel.getCache('FilterViewModel')
filterViewModel.on('afterClearSaveCallBackCache', function(){  
// 当对方案进行设置操作，且被设置对方案与当前方案相同时，因为会对当前方案进行更新，考虑性能问题 ，减少模型的卸载挂载操作，所以此时不会调用afterInit钩子，如果有些业务逻辑需要处理，可以补充监听这个钩子，进行afterInit一样的处理逻辑即可
})

updateAdvanceModel

通常情况下，我们使用的查询区可设置多个条件，条件之间以and进行拼接sql查询，但是在某种特定的业务场景下无法满足or与and的混合场景，所以我们需要配置updateAdvanceModel高级查询模块.

const filterViewModel = viewModel.getCache('FilterViewModel')
filterViewModel.on('updateAdvanceModel', function(AdvanceModel){  
// 配置了高级查询特有的钩子，可以对高级查询模型的数据进行修改
})

afterInitCommonViewModel

查询区脚本加载之后且组件渲染以后事件，可以获取查询区模型

// viewModel为当前列表的页面模型
viewModel.on('afterInitCommonViewModel', function () {
	const filterViewModel = viewModel.getCache('FilterViewModel');
})

单据列表查询区扩展开发核心内容

本章节描述查询区的常见场景，通过本章节的学习，可以掌握查询区的显示与隐藏、查询区参照赋初始值，手动触发重置和搜索等。

单据列表查询区的显示与隐藏
单据列表中查询区的隐藏

（1）修改数据库：修改billtplgroup_base表中，对应类型为ConvenientQuery的容器，在cStyle中配置{"bHideFilterScheme": true}

列表扩展代码：
 //公共模型初始化完成
viewModel.on('afterInitCommonViewModel', function(){
    //查询区初始化之后
    viewModel.getCache('FilterViewModel').on('afterInit', function(){ 
   viewModel.getCache('FilterViewModel').setState('bHideFilterScheme', true);
})
});

参照中的查询区隐藏
修改数据库：修改pub_ref表中，对应参照的extendField，

配置{"bHideFilterScheme": true}

（2）扩展代码：

// referViewModel是参照模型，获取到对应的参照模型才可以

referViewModel.get('searchBox').setState('bHideFilterScheme',true);

给单据列表查询区面板的字段赋初始值
普通字段，如文本输入框，非参照类型

前端扩展代码实现

// 公共模型初始化完成
  viewModel.on('afterInitCommonViewModel', function(){
        // 获取查询区模型
        const filtervm = viewModel.getCache('FilterViewModel'); 
        // 查询区模型DOM初始化后
        filtervm.on('afterInit', function () {
          // 获取控件的真实模型
          const xxxModel = filtervm.get('xxx').getFromModel();
          // 赋予查询区字段初始值
          xxxModel.setValue('value');
        });
  });

给查询区参照模型赋初始值

以商品采购需求订单为例，查询区的采购组织参照字段为purorg；在商品采购需求订单列表写扩展代码：

viewModel.on('afterInitCommonViewModel', function(data){

      //  1、先获取查询区条件模型
      const filterViewModel =  viewModel.getCache('FilterViewModel');

      //查询区模型DOM初始化后
      filterViewModel.on('afterInit',function(){

        //  2、获取参照模型的真实模型
        const referModel = filterViewModel.get('purorg').getFromModel();

        //  第一个参数为真实模型的参照referModel，value1填写的是数据id
        cb.utils.triggerReferBrowse(referModel, [{ field:'id', op:'eq', value1: '2789652280905984' }]);
        })(参数补充全)
  })

函数内通过代码触发操作
触发重置操作
重置操作触发后，默认会将当前方案内的所有数据还原到方案初始状态，并且会做一次搜索操作；
如果重置的时候不想做搜索操作，可以通过执行重置click的时候，传递参数{disabledSearch:true};
如果不是函数内代码触发的重置，在物理点击重置的时候，阻止搜索动作，可以通过监听FilterViewModel的afterResetClick事件，并且return false 即可；
//公共模型初始化完成
  viewModel.on('afterMount', function(){
        // 获取查询区模型
        const filtervm = viewModel.getCache('FilterViewModel'); 
        //获取搜索模型后，使用fireEvent方法触发重置模型上的点击事件，并自动搜索
        filtervm.get('reset').fireEvent('click');
     //获取搜索模型后，使用fireEvent方法触发重置模型上的点击事件,取消默默查询动作
        filtervm.get('reset').fireEvent('click', {disabledSearch: true});
  });
  

通过代码触发搜索操作
  //公共模型初始化完成
  viewModel.on('afterInitCommonViewModel', function(){
        // 获取查询区模型
        const filtervm = viewModel.getCache('FilterViewModel'); 
        //获取搜索模型后，使用fireEvent方法触发搜索模型上的点击事件
        filtervm.get('search').fireEvent('click');
  });

调整查询区显示的行数
查询区默认只显示一行

通过扩展代码，设置显示两行
//公共模型初始化完成
  viewModel.on('afterInitCommonViewModel', function() {
      // 通过filterRows字段控制查询区显示行数
      viewModel.getCache('FilterViewModel').getParams().filterRows = 2;
  })

单据列表查询区条件过滤

本章节主要讲述查询区的条件过滤查询。

op参数说明
op参数	备注说明
eq	等于
neq	不等于
gt	大于
lt	小于
like	介于
between	代表区间，value1、value2分别是区间最值
in	包含
nin	不包含
rightlike	右介于
leftlike	左介于
egt	大于等于
elt	小于等于
is_null	代表为空
is_not_null	代表非空
通过前端函数设置过滤

查询默认会触发一次beforeSearch事件

//公共模型初始化完成
  viewModel.on('afterInitCommonViewModel', function() {
      // 通过filterRows字段控制查询区显示行数
      viewModel.getCache('FilterViewModel').getParams().filterRows = 2;
  })

注意事项

查询区的其他场景

1、如何修改查询区的条件为必填？

//公共模型初始化完成
  viewModel.on(' afterInitCommonViewModel ', function() {
  const filterViewModel = viewModel.getCache('FilterViewModel')
  filterViewModel.on(‘beforeSearch’, function (args) {
      filterViewModel.get('xxx').setState('mustInput', 1);  //  true也可以
  });


2、如何设置查询区自动搜索？

  //公共模型初始化完成
  viewModel.on(' afterInitCommonViewModel ', function() {
     const filterViewModel = viewModel.getCache('FilterViewModel');
     filterViewModel.on(‘beforeInit’, function (args) {
        filterViewModel.getParams().autoLoad = true;
      });
});


3、如何隐藏查询区的某个查询条件？

//公共模型初始化完成
viewModel.on('afterInitCommonViewModel', function(){
    viewModel.getCache('FilterViewModel').on('afterInit', function(){ 
//查询区的字段隐藏是通过触发upadateViewMeta事件来隐藏，而不是通过setVisible隐藏，跟卡片页面字段隐藏有差异
   viewModel.getCache('FilterViewModel').execute('updateViewMeta', { code: 字段编码, visible: false })
})
});

前端样式开发
样式扩展前言

在YonBIP专业版项目上经常会用到样式扩展，在列表和卡片中都可以自定义组件的样式，以满足客户的个性化需求。

本文主要针对常见组件、页面进行样式的扩展开发。

样式扩展方式
mdf前端工程脚手架

在src/client/web/styles/default/extend.less写入即可，要用domainKey作为隔离层，避免样式影响全局；

YonBuilder设计器

在YonBuilder设计器的动作面板的前端扩展函数写扩展代码，动态创建样式表；

技术中台MDF服务配置

在技术中台的MDF服务中配置三方样式资源，该方式可对所有mdf单据页面生效，具体实现方式可以参考：

第一种方式：

单据页面主题样式修改

第二种方式（2024 年 7 月 20 日以后的MDF补丁支持）：

项目全局样式覆盖

CSS基础知识准备工作

前端CSS编码规范

CSS选择器优先级的前置知识
CSS选择器类型

id选择器、class选择器、属性选择器、*、伪类选择器、伪元素、后代选择器、子类选择器、兄弟选择器

权重计算规则

第一优先级：!important会覆盖页面内任何位置的元素样式

1.内联样式，如style="color: green"，权值为1,0,0,0

2.ID选择器，如#app，权值为0,1,0,0

3.类、伪类、属性选择器，如.foo, :first-child, div[class="foo"]，权值为0,0,1,0

4.标签、伪元素选择器，如div::first-line，权值为0,0,0,1

5.通配符、子类选择器、兄弟选择器，如*, >, +，权值为0,0,0,0

6.继承的样式没有权值

脚手架样式扩展

目前单据添加样式的方式，一是通过脚本操作DOM的方式添加样式，二是通过脚手架工程样式文件添加样式。

通过第一种方式添加样式，频繁的操作DOM会带来一系列的页面性能问题，导致页面卡顿，体验不流畅等问题，不利于后面项目维护和优化，所以我们这里强烈建议应该减少或者杜绝通过操作DOM添加样式的方式，推荐使用第二种添加样式方式，以下所有的事例默认都是通过脚手架添加样式的方式实现，不在重述。

项目如果没有脚手架权限或者脚手架的情况下，建议在技术中台配置样式文件，参考1.1.3说明

在前端脚手架工程添加样式

在src/client/web/styles/default/extend.less写入即可

扩展属性添加CSS样式

组件添加样式还可以通过UI设计器里面添加扩展属性类名className，脚手架添加对应样式的方式实现

列表页样式扩展

本章节主要讲述列表页的表格样式扩展，在对应引擎下（domainKey）的mdf工程或者YonBulder单据设计器中都可以书写前端扩展代码，实现样式的扩展。

列表页表格的样式扩展
列表某一行样式扩展

需求描述：让表格某一行的背景颜色变成红色。

列表某行样式扩展实现
// 在列表页中写下代码
// 类名前缀
  const gridModel = viewModel.getGridModel();
  viewModel.getGridModel().on('afterSetDataSource',function(){
    // 设置行状态：rowIndex行数，name属性名，value属性值  
    //  设置第一行外层的className为"public_fixedDataTableRow_cssbg-red"
    gridModel.setRowState(1, 'className', 'cssbg-red');
  })


在脚手架样式文件中添加样式，如图：

预览效果如下：

简单描述一下其原理

执行gridModel.setRowState(1, 'className', 'cssbg-red'); 会给该行某DOM元素上添加

public_fixedDataTableRow_cssbg-red这个类名，通过脚手架样式扩展添加到页面中，样式选择器是：

.public_fixedDataTableRow_cssbg-red [role="gridcell"]

根据确认状态显示不同的背景色

以下单据表格数据根据不同的审核状态显示不同的背景色：开立态为粉色，审核中为红色。

// 样式列表
  const constant = [
    .public_fixedDataTableRow_row-red [role="row"] { background-color: red !important; }'
.public_fixedDataTableRow_row-pink [role="row"] { background-color: pink !important;}
//同时去掉单元格上的样式
.public_fixedDataTableCell_main {background-color: transparent !important}
  ]
const gridModel = viewModel.getGridModel();
  gridModel.on('afterSetDataSource', function (data) {
    // 遍历列表所有数据
    data.map((item, index) => {
      // 单据状态
      if (item.verifyState === 2) {
        // 添加类名
        gridModel.setRowState(index, 'className', 'row-pink');
      } else if (item.verifyState === 1) { 
        gridModel.setRowState(index, 'className', 'row-red');
      }
    })
  })


在脚手架样式文件中添加样式，如图：

列表某一列样式扩展
自定义样式具体实现

将某一列的颜色置为蓝色，例如将purorg_name（采购组织）列全部设置为蓝色方式二

// 在列表页扩展脚本中写下代码
  let gridModel = viewModel.getGridModel();
  gridModel.on('afterSetDataSource',function(){
    // 设置列状态：cItemName字段名，name属性名，value属性值   
    gridModel.setColumnState('purOrg_name', 'style', {backgroundColor:'blue'});
  })


预览效果如下：

使用Tinper-Next的内置样式文件实现

tinper-next中内置了许多的背景颜色，例举几个背景：

# tinper-next.css内置的背景色
.bg-red {
    background-color: #f44336!important
}
.bg-pink {
    background-color: #e91e63!important
}
.bg-purple {
    background-color: #9c27b0!important
}
.bg-indigo {
    background-color: #3f51b5!important
}
.bg-blue {
    background-color: #2196f3!important
}
.bg-light-blue {
    background-color: #03a9f4!important
}
.bg-cyan {
    background-color: #00bcd4!important
}
.bg-green {
    background-color: #00ba7d!important
}
.bg-yellow {
    background-color: #ffeb3b!important
}

将某一列设置为紫色（purple）

不需要手动加载样式，直接使用tinper-next内置的背景紫色

  let gridModel = viewModel.getGridModel();
  gridModel.on('afterSetDataSource',function(){
    // 设置列状态：cItemName字段名，name属性名，value属性值   
    gridModel.setColumnState('purOrg_name', 'className', `bg-purple`);
  })


列表某个单元格样式扩展
自定义样式实现

将某一个单元格的颜色设为粉色，例如将paytype（付款方式）列设置为粉色方法

// 在列表页扩展脚本中写下代码
  let gridModel = viewModel.getGridModel();
  gridModel.on('afterSetDataSource',function(){
    // 设置单元格状态：rowIndex行数，cItemName字段名，name属性名，value属性值   
    gridModel.setCellState(1, 'payType', 'style',{ 'backgroundColor': 'pink'});
  })


使用Tinper-Next的内置样式文件实现
  let gridModel = viewModel.getGridModel();
  gridModel.on('afterSetDataSource',function(){
    // 设置列状态：cItemName字段名，name属性名，value属性值   
    gridModel.setColumnState('money', 'className', `bg-pink`);
  })

卡片样式扩展

本章节主要描述卡片页的样式扩展。

修改卡片的背景色

以下列单据为例，在浏览态时，根据确认状态显示不同的背景色：已审核为红色，开立态为黄色。

以下是确认状态的枚举值：

viewModel.on('modeChange', function(mode){(性能有问题，推荐通过脚手架样式覆盖)
const baseDom = 
document.querySelector(`.group-container .first-group`);
    if(mode === 'browse'){
      let affirmstatusValue = viewModel.get('affirmStatus').getValue();
      if(affirmstatusValue === "1"){
        baseDom.classList.add('affirmstatus-bg-yellow');
      }else if(affirmstatusValue === "4"){
        baseDom.classList.add('affirmstatus-bg-red');
      }
    }else{
      baseDom.classList.contains('affirmstatus-bg-red')&& baseDom.classList.remove('affirmstatus-bg-red')
      baseDom.classList.contains('affirmstatus-bg-yellow')&& baseDom.classList.remove('affirmstatus-bg-yellow')
    }

  })


在脚手架样式文件中添加样式，如图：

已审核状态：

开立状态：

在卡片页头部添加提示语

页面添加提示语或者标题，建议通过组件扩展(组件扩展可以参考UI组件扩展文档)或maintitle 标题组件实现

效果如下

在卡片头部添加提示标语：本表单禁止录入泄密信息

具体实现

在设计器中添加maintitle标题组件,如图：

在脚手架样式文件中添加样式，覆盖标题组件的样式，如图：

通过ui设计器里面添加扩展属性类名className
脚手架覆盖加样式
前端组件开发
组件扩展方式
mdf前端工程扩展组件

可以在MDF前端工程里自定义扩展组件，具体扩展步骤见第三章节。

自定义扩展页面

自定义扩展页面可以在mdf前端工程里写页面代码；也可以使用React、Vue框架相关生态的脚手架进行页面的开发。

mdf前端工程扩展

在mdf开发中，通用组件会封装到mdf框架，当满足不了业务需求时，可以自定义扩展组件开发。对于isv开发同学，可以向对应领域申请mdf前端脚手架权限，或者使用自建引擎的前端工程脚手架，进行扩展组件的开发。

前端工程扩展自定义组件参考文档: MDF前端基础组件扩展

自定义基础组件（basic）
组件的开发

这里，我使用的是框架内置的扩展示例来介绍如何使用mdf前端工程自定义扩展组件。

当然，你也可以自己创建组件的目录，实现扩展组件的开发。

内置的扩展示例demo如下：demo文件夹名字即为扩展组件的cControlType

组件的使用

在单据设计器中拖入一个文本框，并打开当前控件的协议，将协议的cControlType修改demo，并保存。

组件的预览

表格自定义列组件扩展（formatter）

表格格式化列扩展实例参考文档：

格式化表格列formatter

自定义表格的单元格渲染内容

(出处：YonBuilder开发者社区)

自定义页面
在mdf前端工程中自定义页面
页面的开发

在src/web/components/portal目录下写入自定义页面的代码，如下图，自定义页面的目录event-type。

本地调试

本地调试地址：http://local.yonyouCloud.com:3003/platform/eventType

线上调试

线上环境地址：业务中台域名/mdf-node/platform/eventType?domainKey=kkfnypd

注：eventType是export default导出的属性

通过React和Vue等框架生态工具进行页面开发

将开发完成的项目进行构建打包，将构建的资源上传至服务器，通过地址能访问

将自定义页面配置到应用平台

将自定义页面配置到应用平台参考文档：

前端扩展整个页面

1、给查询区内字段设置默认值时或者操作查询区内字段模型获取字段值的时候，赋不上值或取不到值？

首先我们排查问题从以下几点来排查问题根源：

（1）检查上述的动作是否在查询区初始化完成(afterInit钩子函数里面)后，进行的赋值操作

（2）在查询区加载完成后进行赋值操作，如果没有生效，这里要注意，获取的赋值模型，是否是字段的真实模型(filterViewModel.get(xxx).getFromModel())；

（3）当上述条件都满足的情况下，扩展操作还是没有起作用的话，在根据获取的模型看下是否是ListModel,假如是，根据列表模型的方法赋值即可。

2、查询区重置按钮点击之后，怎么取消默认做的那次查询？

可以监听查询模型的afterResetClick事件，事件返回return false;即可阻止默认查询操作。

3、如何触发查询区的搜索？

获取查询区的按钮后，通过fireEvent触发按钮的click事件

const schemeId = viewModel.getCache('schemeId')

viewModel.get('search').fireEvent('click', { solutionid: schemeId})

4、如何隐藏整个查询区？

FilterViewModel.setState('bHideFilterScheme', true)

5、查询区如何获取搜索条件值？

FilterViewModel.getSearchData()

这个api能拿到当前面板上填写的查询条件，并且会转换对应的枚举值等需要特殊处理的数据，这个api拿到的结果就是传给后端的查询条件。

6、MDF服务中配置三方样式不生效怎么办？

loadProjectExtendCSS: true的配置项只在2024 年 7 月 20 日以后的补丁支持，若为环境版本老旧，请用文档中第一种方式配置扩展样式文件

7、前端样式文件的加载顺序是什么样的？

工作台 tinpernext -> MDF样式文件 -> 领域扩展样式

按照优先级从低到高的顺序，扩展样式优先级最高

8、请描述下前端扩展样式文件的规范？

（1）所有选择器的样式都应写在CSS文件中，尽量少用或不用行内样式和style标签样式。

（2）禁止在css中使用*选择器，*选择器因为需要遍历页面的所有元素，所以编译的时候会非常消耗时间。

（3）选择器要尽可能短，并且尽量限制组成选择器的元素个数，建议不要超过 3

（4）表现与结构分离：尽量不用id选择器做css样式编写，因为id选择器一般用做js选择，有时可能会因为js的原因改动，那么对应的css就会失效。

（5）避免使用important，使用大量!important样式会使维护变得更难，因为您打破了样式表中的自然级联。

（6）兼容性问题，参考网址 https://caniuse.com/

9、扩展样式在本地调试时不生效？

若本地调试使用了Resource Override，需要在该插件中增加线上css文件到本地css文件的代理配置

10、本地脚手架的样式文件写在哪？

扩展样式在【src/client/web | mobile/styles】中扩展

11、脚手架方式扩展的基础组件，如何拿到单据模型？

在传入组件的Props对象里保存有单据模型pageModel

12、如何给自定义组件传入扩展属性？

可以通过在cStyle属性增加新的属性来实现UI组件属性级扩展。框架自身的组件也可以扩展属性，此种扩展有一定限制，扩展的前提是基础组件支持此属性。

13、如何检查组件是否注册成功？

启动本地项目

方式一：cb.extend.Components[domainKey][type][cControlType]
方式二：cb.extend.getComponent(domainKey,type,cControlType)

其中type为组件类型，基础组件type固定为basic；cControlType为组件名称

如果注册成功，会显示改组件的名字如下图：