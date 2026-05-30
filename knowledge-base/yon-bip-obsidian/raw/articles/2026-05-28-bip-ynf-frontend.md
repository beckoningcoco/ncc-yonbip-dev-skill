前端开发（YNF）
最后更新时间：2025-11-10
版权

©2025用友集团版权所有。

未经用友集团的书面许可，本文档描述任何整体或部分的内容不得被复制、复印、翻译或缩减以用于任何目的。本文档描述的内容在未经通知的情形下可能会发生改变，敬请留意。请注意：本文档描述的内容并不代表用友集团所做的承诺。

文档修订摘要
日期	修订号	描述	著者	审阅者
2023-12-28	V1.0	创建	张译帆
2024-08-22	V2.0	修订V3 R6	张译帆
2025-02-23	V2.1	更新	张译帆
2025-08-25	V3.0	V5环境Beta版	张译帆
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	否
私有云	客户化定制开发	是
专属云	客户化定制开发	是
本地部署	客户化定制开发	否
公有云	ISV生态开发	否
私有云	ISV生态开发	是
专属云	ISV生态开发	是
本地部署	ISV生态开发	否
业务场景

在本文档中，将重点讲解如何通过YNF脚手架前端工程代码编写，完成业务功能的扩展以及样式扩展开发

在“商品采购需求单”功能中添加业务处理，具体业务场景为：

场景一：新增数据时，录入方式不可编辑并赋值为“手工录入”；

场景二：录入子表数据时，物料不允许重复；

关键词

YNF、Mobx、hooks钩子、副作用

扩展开发核心内容
前端扩展开发说明

线上某些页面的业务逻辑非常复杂时，可以通过在自建引擎中的前端脚手架中，在创建单据页面对应的脚本文件里继续写业务逻辑。引擎生成的脚手架中，以ynf开头的工程为YNF前端工程。

增加单据扩展脚本

单据扩展文件保存在src/pages目录下，以当前单据的billNo为子目录名称，子目录下再需再放置一个index.extend.js作为入口文件。

index.extend.js中需导出四个扩展store的函数，内容如下：

/**
* 基于YNF Store，扩展开发领域、行业的业务stores
* 定义：Domain Store
*/
export function ExtendStore (rootStore) {

}
/**
* 针对YNF common actions 的扩展
* 定义：明确的、静态的 action 动作
*/
export function ExtendAction (rootStore) {

}
/**
* 针对 YNF Reaction 的扩展
* 定义：reactions track 具体的状态值，接收指定的 store 并按明确的逻辑更新 domain store 中的数据，
*/
export function ExtendReaction (rootStore) {

}
/**
* ExtendRootStore
* 针对全局通用的 api、utils、pagestore等扩展
* 也可以直接定义具体的业务扩展逻辑
*/
export function ExtendRootStore (rootStore) {

}


添加完扩展脚本，还需在工程的配置文件yds.config.js中增加扩展脚本的配置项，具体方式如下：

到工程根目录下的yds.config.js,在tnsConfig.providerEntry对象下，增加扩展脚本配置：属性名为’./{单据编码}’，属性值为pages下的单据文件的绝对路径，可通过path.resolve(__dirname,‘./src/pages/{单据编码}/index.extend’)获得。

前端开发本地调试
启动前端工程

终端执行npm run start命令，当控制台显示如下图所示日志信息，说明前端服务已成功启动，服务端口一般为9090：

代理插件调试

可通过谷歌浏览器插件resource override,将线上扩展脚本统一代理到本地来调试。需在插件中配置代理规则：

如图所示，代理源路径格式为：***/ynf-{domainKey}/*/**,代理的目标路径，为

本地前端服务地址：https://localhost:9090/**

代理配置完毕后，会将线上压缩后的js资源替换为本地源码，方便开发进行断点调试。浏览器端js资源的调试方法，请参考：

开发者社区-低代码开发-前端脚本

业务场景开发

场景一：新增态时，录入方式不可编辑并赋值为“手工录入”

//给init这个内置reaction增加一个执行后钩子afterHook
export function ExtendReaction (rootStore) {
return {
init: {
afterHook(rootStore, res) {
if (rootStore.cardStore.isAdd) {
const enteredMethod = rootStore.formStore.get('inputType')
enteredMethod.setDisabled(true)
enteredMethod.setValue('1')
}
},
},
}
};


场景二：录入子表数据时，物料不允许重复；

export function ExtendRootStore (rootStore) {
//rootStore下的子表名称，需在设计器确认
const tableStore = rootStore.fnProductPurchaseReqDetailYnfListStore
tableStore.onMeterialChange = function (newVal, row) {
let flag = false;
const tableData = rootStore.fnProductPurchaseReqDetailYnfListStore.getValue();
const filteredData = tableData.filter(item => item.rowKey !== row.rowStore.rowKey);
filteredData.forEach(rowStore => {
const meterialCode = rowStore.getValue('materialCode')
if (meterialCode === newVal.code) {
flag = true;
}
})
if (flag) {
rootStore.utils.message.danger('物料重复，请重新录入')
return false;
}
}
}


上述的onMeterialChange方法，需和【物料】字段的UI协议绑定：

应用效果
新增时，录入状态不可编辑并赋默认值为手工录入。

编辑子表物料字段时，要求物料数据不能重复。

常见问题
YNF单据如何跳转到另一个YNF单据

跳转页面的方法如下：

rootStore.pageStore.push({
billNo: '页面编码',
params: {
参数1: '参数1'
...
}
})

详情页覆盖默认action行为

详情页在不同的页面状态下，会调用不同的action进行页面数据初始化

新增态会调用新增的action，新增的action会调用add接口拿到详情页的数据
浏览态/编辑态会调用详情的action，详情的action会调用detail接口拿到详情页的数据
复制态会调用复制的action，复制的action会调用detail和copy接口拿到详情页的数据

如果想要自定义获取详情页的数据，可以在cardReaction中进行配置，覆盖默认的action行为

如何打开一个自定义弹框
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