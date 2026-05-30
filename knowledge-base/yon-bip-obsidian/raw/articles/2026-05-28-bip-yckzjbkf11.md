原厂扩展脚本开发
最后更新时间：2025-11-13
版权

©2025用友集团版权所有。

未经用友集团的书面许可，本文档描述任何整体或部分的内容不得被复制、复印、翻译或缩减以用于任何目的。本文档描述的内容在未经通知的情形下可能会发生改变，敬请留意。请注意：本文档描述的内容并不代表用友集团所做的承诺。

文档修订摘要
日期	修订号	描述	著者	审阅者
2024-06-10	V2024061001	新建	韦振武
2024-11-15	V2024111501	更新	张译帆
2025-08-29	V2025082901	更新V5.0	张译帆
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	否
私有云	客户化定制开发	是
专属云	客户化定制开发	是
本地部署	客户化定制开发	是
公有云	ISV生态开发	否
私有云	ISV生态开发	是
专属云	ISV生态开发	是
本地部署	ISV生态开发	是
业务场景

本文档通过分析社区问题工单，提出项目客开过程中原厂单据扩展脚本管理和适配的解决方案，重点介绍原厂单据扩展脚本如何使用前端脚手架进行统一管理和打包，以便在制盘迁移后快速适配目标环境。

关键词

原厂单据，MDF脚手架，扩展脚本管理，制盘后原厂扩展脚本适配

MDF脚手架添加扩展脚本

当低代码满足不了原厂单据业务逻辑时，需要通过在脚手架中扩展该原厂单据的脚本来进行扩展开发，可以通过客开领域的前端脚手架统一管理和打包部署。

整个过程的原理，是通过前端脚手架，打包出标品的扩展代码，部署到环境上（存放在自建领域下）。然后通过数据库和node端的配置，让原厂单据能够加载到自建领域的资源。

扩展脚本文件目录说明

创建的自定义文件夹, 例如使用extStanPro 即可。

在前端脚手架 src/business 文件夹下面，创建文件夹extStanPro, 然后在

该文 件 夹 下 创 建 文 件 名 为 原 厂 引 擎 编 码 的 文 件 夹 ，最后在原厂引擎编码的文件夹下创建领域扩展脚本。整个目录格式为：

src/business/extStanPro/{标品引擎编码domainKey}/{标品应用编码_标品单据编码}_VM.Extend.js 如图：

扩展脚本文件内容说明

在js文件中增加固定内容，以下为示例：

cb.defineInner([],function() {
var MyExternal = {
doAction: function(name, viewModel) {
if (this[name]) {
this[name](viewModel);
}
},
init: function(viewModel) {
try{
cb.utils.alert('扩展脚本加载成功', 'success');
}catch(err){
cb.utils.alert(err, 'error');
}
if (viewModel.hasEvent("customInit")) {
viewModel.execute("customInit", viewModel);
return;
}
}
}
return MyExternal;
});


说明：扩展代码应写在示例的init方法中。

扩展脚本的打包配置说明

在业务代码书写完毕后，需要对脚手架的webpack配置进行修改，才能打包出对应的原厂扩展文件。

前端脚手架webpack入口文件配置

打开脚手架 webpack.config.js 文件，在 extStanProEntry 对象里添加需要打包的原厂扩展脚本，如图：

示例代码(黄色部分是需要添加的代码)

//独立编译（原厂扩展脚本，写在src/busniness/extStanPro下）
//格式：'标品应用编码_标品单据编码_VM.extend': '标品应用编码_标品单据编码_VM.extend 的脚本位置'
let extStanProEntry = {
'标品应用编码_标品单据编码_VM.Extend':
"./src/business/extStanPro/标品引擎编码domainKey/标品应用编码_标品单据编码_VM.Extend.js",
}
const domainDefine = parts.domainDefine({
domainKey: configEnv.DOMAIN_KEY, // 领域domainKey
extStanProEntry
})

前端脚手架打包

前端脚手架打包时就会把原厂的扩展脚本和领域客开的扩展脚本编译到统一的目录下，如图：

打包完毕后，将代码上传并部署，领域扩展代码就保存在环境上了。

接下来需要配置数据库，确保在加载原厂单据时，请求我们上传的扩展代码。

原厂单据加载自建脚本

通过在数据库中插入扩展脚本url的方式，使原厂单据能加载到自建领域的扩展脚本。此处需检查一下，平台前端框架是否支持解析拼接模板url。

数据库插入扩展脚本的模板url

在领域库的表 bill_customerdef，插入单据扩展脚本的模板url，SQL脚本示例如下：

INSERT INTO 领域库下的表.bill_customerdef(`id`, `cbillno`, `extscripturl`, `tenant_id`,`pubts`,`ytenant_id`)， 如图：

其中的cbillno、tenant_id、ytenant_id分别为当前领域的单据编码、当前租户id、当前租户编码id；id填入与当前表中数据不重复的值即可；pubts是一个时间字符串； extscripturl是扩展资源的模板url路径，具体格式为：

${domainKey(自建领域)}/javascripts/原厂应用编码_原厂单据编码_VM.Extend.min.js

配置好后，在领域单据加载时，平台会根据当前配置的${domainKey},去寻找自建领域资源的baseUrl，拼接之后去请求这个线上资源。

清理原厂领域redis缓存

在数据库插入原厂扩展脚本后，原厂扩展的单据还加载不到扩展脚本时，可以在yms找到原厂领域的redis 库，清理缓存，再重新加载。

领域配置项中增加自建领域依赖

数据库里配置的extscripturl是一个模板，平台在前端拿到模板后，还需要获取自建领域的baseUrl，把模板组装成可访问的路径。为此，需要在领域配置dependencies中增加自建领域domainKey作为依赖。

打开领域配置地址：主域名/mdf-node/nodeConfig，原厂的配置查看，点击右上角的查看原厂配置，选择对应的原厂引擎编码查看,如图：

点击【复制内容】按钮，将领域配置拷贝出来

在领域配置页签，点击新增，微服务编码填对应领域domainKey,然后将上一步复制出来的领域配置，拷到【领域配置内容】区域。

在复制出来的领域配置中，找到dependencies字段，在其中增加自建领域的domainKey,如图中第66行所示。

做完以上配置，平台就可以获取到自建领域中领域扩展脚本的完整地址了。

查看线上请求结果

打开控制台，刷新单据页，在网络页签下找上文中配置的扩展文件名

如图，若该请求的响应正确返回了打包后脚本，则表示扩展资源加载成功。

扩展脚本的调试

和脚手架其他扩展脚本一致，在调试模式下，可以通过resourceOverride，将线上扩展脚本代理到本地。具体步骤如下：

获取扩展脚本完整路径

回到章节3.3中打开的控制台，将页签切换到标头，拷贝出当前线上资源的完整请求地址，如图：

ResourceOverride中配置代理

在ResourceOverride中将4.1中的线上地址代理到本地，具体如下图所示：

其中右边即为当前本地资源的完整地址。其格式为：

http://127.0.0.1:3004/static/javascripts/标品应用编码_标品单据编码_VM.Extend.js

刷新页面，即可在控制台看到本地调试代码。

脚手架无法打包出原厂扩展脚本
首先检查webpack.config.js中的配置项是否书写正确，其中domainDefine方法的参数extStanProEntry单词不能拼错。
检查webpack.config.js中extStanProEntry配置的源文件路径是否正确。
若配置没有问题，去package.json中检查依赖项@mdf/create-app这个包的版本，确保版本在3.12及以上，若不符要求，更改版本号，删除node_modules 依赖包文件夹和package-lock.json 文件，使用命令ynpm install 重新拉取的前端脚手架依赖打包即可。
环境上领域单据扩展脚本路径错误
错误路径一：

如图，控制台网络页签发出的请求这种格式(${domainKey}/javascripts/原厂应用编码_原厂单据编码_VM.Extend.min.js),说明数据库配置的模板url没有经过框架转换和拼接baseUrl，原封不动请求了。

排查方式：

nodeConfig下检查领域配置项的dependencies是否包含客开领域domainKey,没有则需要补充
若补充后仍然没好使，说明目前环境不支持模板url匹配，需通过打补丁的方式解决。
错误路径二：

如图，模板url已经过框架识别转换，但转换后的路径主域名缺失。此时一般是环境中缺少当前自建领域的baseUrl,可通过当前单据的loadExtend接口返回值确认：

环境上领域单据扩展脚本报404

若脚本地址请求无误，但仍然返回404:

排查本地的扩展脚本是否打包成功。
执行前端流水线部署是否成功。
去技术中台的容器控制台检查一下nginx路径。
原厂单据没有发起扩展脚本的请求

原厂单据加载完成，但meta 接口的字段 extscripturls 未返回扩展脚本的地址，检查数据库插入的扩展脚本地址是否为当前的领域表bill_customerdef。

原厂单据页面加载扩展脚本后报错

如图，若扩展资源已加载，但是刷新页面时报语法错误。

检查扩展业务代码是否有语法错误
检查脚手架扩展脚本是否调用cb.defineInner方法加载。

一般脚手架内扩展脚本使用的加载方法，需和设计器扩展脚本一致。