打印扩展开发
最后更新时间：2025-09-22
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	是
私有云	客户化定制开发	是
专属云	客户化定制开发	是
本地部署	客户化定制开发	是
公有云	ISV生态开发	否
私有云	ISV生态开发	否
专属云	ISV生态开发	否
本地部署	ISV生态开发	否
业务场景

打印场景是项目中必不可少的功能，IUAP平台提供打印能力，领域和低代码的客开单据默认都是对接了打印平台。

对于打印功能的绝大部分交付场景是：对于客开单据，客开人员通过YonBuilder开发了单据（场景里需要勾选：打印），单据已经默认接入了平台的云打印，实施人员直接配置打印模板即可。对于标品单据，绝大部分已经接入了平台的云打印，实施人员直接配置打印模板即可

关键词

打印模板：以解决客户在业务应用中能够按照模版样式打印各类单据为目标，常见使用场景如普通单据打印、凭证套打、合同打印、小票打印，标签打印等。

组件：分基础控件，容器辅助控件，每个控件都可以拖控件到画布中进行设置，提供搜索框可根据名称控件进行搜索过滤显示。

层级：对画布中的所有控件的层级按树级展示，可快速查看控件间是平级或上下级（嵌入）关系，与画布联动，选中层级页签中的某控件同时画布中相应控件也会处于被选中状态。

数据集：包括元数据、系统变量，树级显示，一级主表、二级子表、三级孙表。每个字段显示格式为编码（名称）

属性：对模板、页面、控件的属性设置，不同层级的属性页签中显示的内容不同。

低代码单据使用打印服务流程
接入打印

入口：应用构建-业务对象-场景：启用

配置打印模板

入口：应用构建-页面建模-打印模板（也可以通过工作台-模板-打印模板进入）

设计打印模板：

效果

低代码客开单据已经默认在前端配置了打印按钮和打印模板下拉框，当配置好对应单据的打印模板后，直接可用。

云打印扩展开发
自定义对象打印开发

通过自定义对象的数据，根据打印模板展示打印样式，并实现打印功能

实体上添加子实体用于构造打印对象

添加子实体用于构造模板打印数据

业务场景勾选打印

配置打印模板

入口：应用构建-页面建模-打印模板，如果是新建打印模板点击添加，如果是修改找到需要修改的模板点击编辑

将列表控件拖到打印设计区域

这里即可看到上面添加的实体，然后把所需的属性项拖入列表并且点击确定

即可看到如图所示模板样式

这样模板设计部分就完成了

打印模板取数代码实现

解决页面个性化取数逻辑

脚本编码页面入口

编写脚本逻辑

打印脚本中调用API脚本，查询需要的业务数据，然后按照示例代码把业务数据拼装到diffBillVO对象里即可

post(context, diffBillVO, newBillVO, oldBillVO, returnVOs, extData) {
let param1 = {key:"value"};
let param2 = {key:"value"};
//调用后端函数获取需要打印的数据
let func = extrequire("AT2083EE780E700005.backapi.printfun");
let res = func.execute(param1,param2);

diffBillVO[0].set('new3',res.res[0].new1);
//b2这个数据可以与上面一样从后端函数中写YonQL获取
let b2 ={'new1':'a','new2':'b','new3':'c','new4':'d'}
diffBillVO[0].set("a_billa_b2List",JSON.stringify(b2));

// let printsonList = diffBillVO[0].printsonList;
// let serialNumber =  printsonList[0].serialNumber;
// let quantity = 0;
// for(var i = 0 ; i < printsonList.length ; i++){
//   if(printsonList[i].serialNumber === serialNumber){
//     quantity = quantity + printsonList[i].quantity;
//   }else{
//     let printson = {'id': i,'printzhu_id':'2323328147570294786','serialNumber':'合计','quantity':quantity}
//     quantity = printsonList[i].quantity;
//     serialNumber = printsonList[i].serialNumber;
//     printsonList.splice(i,0,printson);
//     i++;
//   }
//   printsonList[i].id = i;
// }
// printsonList.splice(printsonList.length,0,{'id':printsonList.length,'printzhu_id':'2323328147570294786','serialNumber':'合计','quantity':quantity});
// diffBillVO[0].set("printsonList",JSON.stringify(printsonList));

}

效果

添加自定义客开打印按钮实现web打印
需求

YonBuilder低代码开发的单据的列表页面默认是“快速打印”，会触发打印云助手实现打印，有的客户想在列表中实现网页打印预览。

开发步骤
在列表的工具栏中添加客开的打印按钮

在应用构建-页面建模中对客开单据列表的工具栏里加一个客开的按钮作为打印按钮。

前端代码编写打印按钮点击事件

前端代码编写打印按钮点击事件示例

viewModel.get('button21dj') && viewModel.get('button21dj').on('click', function (data) {
//按钮--onClick
{
//1、先调cachePrintUrl接口，取返回的key
let cachePrintUrl = 'https://bip-pre.yonyoucloud.com/mdf-node/cachePrint?serviceCode=J92403_a_billaList&terminalType=1&busiObj=J92403_a_billa&locale=zh_CN&&sbillno=J92403_a_billaList';
let nCachePrintUrl = encodeURI(cachePrintUrl);
console.log('nCachePrintUrl====================================>', nCachePrintUrl);
let proxy = viewModel.setProxy({
ensure: {
url: nCachePrintUrl,
method: 'POST',
},
});
/*cachePrint请求必须的参数：
根据该参数打印服务会存到redis缓存，返回key，再把key通过getPreview请求传给打印服务，打印服务再根据key查到ids，放到调领域返回数据的request里的params作为参数。 */
let gridModel = viewModel.getGridModel();
let selectedRows = gridModel.getSelectedRows();
let ids = [];
if (selectedRows.length < 1) {
cb.utils.alert('请选择单据！', 'warning');
return;
} else if (selectedRows.length > 30) {
cb.utils.alert('最多可支持30条数据进行批量操作，请重新选择！', 'warning');
return;
}
for (let i = 0; i < selectedRows.length; i++) {
ids.push(selectedRows[i].id);
}
let param = {
ids: ids,
billno: 'J92403_a_billa',
};
let paramString = JSON.stringify(param);
let params = {param: paramString};
proxy.ensure(params, function (err, result) {
if (err) {
cb.utils.alert(err.message, 'error');
return;
}
if (result) {
//2、再调getPreview接口，将第一步cachePrintUrl返回的key作为参数
let url = 'https://bip-pre.yonyoucloud.com/iuap-apcom-print/u8cprint/design/getPreview?appSource=developplatform&domainDataBaseByCode=PF&tenantId=0000LCIH6OXRGT2EPT0000&meta=5&sendType=6&lang=zh_CN&sysLocale=zh_CN&printcode=u8c1755962284234&domainKey=developplatform&serverUrl=https://bip-pre.yonyoucloud.com/mdf-node/uniform/print/getTemplateContent?domainKey=developplatform&serviceCode=J92403_a_billaList&newArch=true&locale=zh_CN';
//列表 值取自cachePrint请求的返回结果
let fUrl = url + '&params=' + paramString + '&sortKey=' + result.key;
let nUrl = encodeURI(fUrl);
console.log('url=====================>', nUrl);
window.open(nUrl);
}
});
}
});


前端代码相关参数说明：

开发效果

常见问题
打印预览模板英文模式下是空白的

解决方法：英文模式下也需要预制打印模板，英文模式和中文模式不共用。

英文模式下打印预览没有执行脚本

解决方法：英文模式下没有关联脚本文件，需要在英文模板设计装态下关联下脚本文件。

英文模式下打印模板多语问题

解决方法：打到对应的元数据实体属性需要维护下多语资源，然后在打印模板那里重新添加数据集即可。

打印预览页面空白

预览界面空白，F12后报错如下显示跨域

解决方法：修改YMS配置

1）进入YMS控制台查到文件存储连接池名称

2）进入文件存储连接池管理节点。找到对应数据点修改

3）将访问域名http改为https，提交。

4）进入配置管理节点，找到“打印服务”——“文件存储客户端”，点击【配置文件预览并发布】。

5）进入技术中台，重启打印服务。重启成功后，预览即可正常。

在客开单据配置打印模板，但是在卡片页面选不到打印模板

解决方法：

参考文档：在客开单据配置打印模板，但是在卡片页面选不到打印模板 - YonBIP开发者社区

客开单据对应的 UI模板协议缺少printOrgAppCode属性，补上：

列表如何使用打印预览功能

列表添加按钮，同时指定打印预览的动作即可。