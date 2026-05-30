云打印
最后更新时间：2024-02-20
基本概念
背景

用友云打印是用友 iuap 企业互联网开放平台中的PaaS公有云服务，提供与打印相关的平台、应用、工具和服务，包括打印模板的设计、打印模板的管理、以及预览和打印服务等。

• 提供打印模板管理功能，支持打印模板的创建、删除、保存、查询、启用和停用等；

• 提供打印模板设计器，支持对单据、套打、小票等企业级样式设计；

• 打印模板设计器提供多种控件、系统变量，支持页面设置、打印对象格式设置等；

• 支持打印数据源注册，也支持基于元数据设计打印模板；

• 支持系统预置模板类型和自定义模板类型；

• 支持按模板分类设置多个打印模板，支持设置默认模板； 提供预览和打印服务，无插件，无安装。

名词解释
打印模板

打印模版是针对工作台统一入口系统提供多个领域的模板管理，用户根据自己需求选择各自领域内的模板创建、删除、查询、编辑、导入导出。查询时需要根据领域对模板进行查询，领域内按照单据可以清晰查看各自领域的模板；可以在已经查询出的领域分类内完成新增和删除。导出可以将非系统级模板导出为文件，也可以在其租户下选择文件导入模板。

同时对模板进行分级管控，可以分别管理企业账号级和各组织级下的模板。模板分为系统级、租户级、组织级，对系统级模板用户仅有复制和预览的权限，租户级、组织级模板可以进行编辑等更多权限。

模板设计器

打印模版设计器是基于设计器平台提供的公共能力的基础上扩展出具有打印特性设计功能的编辑器，是方便用户在画布上通过拖拽组件，进行布局配置，建立用户所要打印设定结构的打印模版模型的编辑器

打印预览

打印预览是基于打印后端服务提供多模版查询及切换，提供excel/pdf输出能力，并且以pdf作为展示效果，同时作为输出载体发送到打印机。

原生打印

原生打印是指用户通过安装云打印助手客户端，通过Java服务向打印机直接发送打印指令。打印机通过接受到的指令文件，进行打印的过程。

PDF打印

pdf打印是指用户通过安装云打印助手客户端。在客户端通过业务数据组装生成pdf文件在云打印助手中可以以pdf文件的方式预览及打印的过程。

技术架构
总体架构设计

打印服务是对外提供模版设计及预览、模版管理等服务，通过在模版设计器的设计对应的模版，并通过业务数据渲染，在预览态生成pdf，通过浏览器端打印，执行打印命令，到打印机输出的能力。其他功能是打印基于业务需求扩展延伸的辅助功能，方便提供给用户快捷便捷的使用功能。

依赖服务说明：

多语：前后端多语资源
交易类型：模板管理页面左侧分类树查询，按照交易类型分组创建模板
权限：按钮权限
币种参照：设计器页面，可对货币类型字段关联币种参照，输出上拼接对应货币符号
工作台：登录拦截器，领域/应用关系（模板管理左侧分类树），应用/服务开通校验（越权等），租户语种列表
实体元数据：模板数据源查询
UI元数据：模板数据源查询
流程审批：审批历史数据查询
组织：组织级/商家模板，组织权限
接入模式

2.2.1接入打印应用层的领域，打印预览序列图：

2.2.2仅接入打印基础服务的领域，打印预览序列图：

图3

功能介绍
模板管理

模版管理具有创建、复制、默认、删除、停启用、重命名

选择领域呈现领域内模板，在领域内选择分类管理模板。

选择所属组织管理各级别下模板，分组织级、租户级、系统级。

所属组织为企业账号级时，模板展示所系统级、租户级模板；当所属组织为某个组织时，模板管理分当前组织模板区和共享模板区，当前组织模板区的模板为组织级模板，共享区模板展示为当前组织上级组织、租户级模板、系统级模板。当前组织模板区的模板能够进行编辑、预览、删除等权限，共享模板区的模板仅能够进行复制、预览权限。

各级模板使用优先级：组织级>租户级>系统级，若存在组织级模板，预览时则使用组织级模板，若不存在组织级模板则使用租户级模板，若不存在租户级模板，则使用系统级模板。

** 需要注意的是也可以在选择组织级场景下，拖拽共享模板区内的模板到当前组织模板区内实现复制。**

模板设计器
数据集

数据集：包括元数据、系统变量，其中分录页码、分录总页码，用于批量打印时按单据分页场景。

模板设计

可以直接拖数据集中的字段到画布中，此时自动使用文本控件显示，拖入画布后可以双击或者点击【数据设置】按钮进行再编辑，也可以对文本控件设置样式。

控件区

控件区包含文本、图片、条形码、卡片、列表、套打列表、多行列表、页眉、页脚、数据容器、分组、网格布局、辅助空间等。用于在画布上设计各种场景模板。

属性区

属性区域可以对当前整个模板的属性设置、也可以对页面和控件进行单独的属性设置。

工具栏

页面设置、画布缩放方式、格式刷、控件对齐按钮（包括左对齐、水平居中、右对齐、顶对齐、垂直居中、底对齐等）、控件层级设置（置顶、置底等）、收起左侧栏、收起右侧栏。

输出与打印
保存

可以通过设计器保存预览，也可以在未保存情况下直接预览，能够将画布内容实时显示到预览页面。同时支持输出为excel格式。

开发示例
接入模式
4.1.1数据说明

打印数据主要包含模板，数据源（主表，子表，主/子表属性），分类（分类，分类和模板的关系）这三方面。

数据源

数据源是某个单据可能使用到的相关业务字段集合。比如员工登记表，包含员工姓名，年龄等字段。

支持的数据源类型，有业务对象，实体元数据，UI元数据。实体元数据和UI元数据最终都会经过服务解析为业务对象的结构，展现在模板设计器里。

业务对象

业务对象基本结构如上图所示，其存放在打印服务的数据库内。对于一个业务对象，主表和关联的属性表必须存在数据，有且仅有一个属性为主键属性，字段isprimarykey为true。可将业务定义的单据属性结构转换成如上结构的SQL语句，导入打印数据库。

实体元数据

可通过元数据的管理页面，新建所需元数据，进行设计。或使用管理页面的导入组件功能，导入文件可以是：（1）用户以标准xml的方式做元数据设计的详细设计；（2）之前设计好的元数据详细设计导出的标准xml。导入后即可在元数据管理功能中查询到其详细设计信息，然后可以继续使用元数据设计工具进行设计。

UI元数据

UI元数据可通过Excel工具或UI模板设计器来生成。

分类

分类是不同单据的分组标签。

分类类型如下表所示：

分类等级	分类类型
0	领域
1	应用
2	分类（单据类型）

分类基本结构，如下所示：

若依托工作台进行开发，领域和应用这两层分类的分类编码,应与工作台注册的领域和应用编码分别对应。

分类（level=2），编码需要与业务对象编码/UI元数据URI/实体元数据ID保持一致。其中,业务对象类型对应metasource值为0，UI元数据类型对应metasource值为1，实体元数据类型对应metasource值为2。

另外，分类能够支持一对多数据源（业务对象类型）的场景，需要在表print_bo的字段sysext5标注对应分类编码。

开发接入方式

云打印服务，可通过以下途径接入：

（1） 借助工作台开发，接入YS模板管理页面。模板管理页面由打印服务提供，包含租户级模板新增，复制，设计等管理功能。业务方仅需在自己的节点接入前端组件，开通流程接入打印初始化接口，设计预置数据即可。

（2） 接入打印公有云服务，自主开发应用层。打印服务仅提供模板相关服务接口和设计/预览页面，至于租户级的管理功能或是其他相关页面，需要业务方自主开发。

数据预置

对于以上任意一种接入方式，分类数据按以下格式填写excel，交由开发人员置入数据库。数据源可通过小节4.1.1.1提到的方式注册。模板数据，可在分类和数据源注册

后，先在某测试租户下进行设计，再由开发人员预置成系统数据，或是抽取旧模板数据，执行SQL脚本生成。另外，若以方式（2）接入服务，分类数据可根据业务需要决定是否预置。

接入YS模板管理页面

YS模板管理页面，由云打印开发，提供租户级模板新增，复制，设计，删除等管理功能。开通相关业务节点时，可附带开通打印模板管理节点即可。预置导入或初始化完租户模板数据，可在对应领域和应用节点下查询。

剩余接入流程包含，（1）需要在业务节点可接入前端组件-打印设计/预览和快速打印，接入方式可参考文档：https://yundoc.yonyou.com/view/l/tqftmt6

（2）在业务节点的开通代码中，需要回调云打印初始化接口。

外部领域接入打印

使用此接入方式，打印服务将提供模板相关服务接口，由业务方根据需要来开发应用层，比如模板管理页面。

服务接口调用配置如下：

由开发组颁发授权文件；
项目工程属性文件配置：

print.server.name=http://172.20.8.30:8891

print.client.credential.path=C:/Users/Administrator/Desktop/authfile_print.txt

UAP.AUTH.ALG=HMAC

UAP.KDF.PRF=HmacSHA1

print_token=Y0hKcGJuUmZkRzlyWlc0PQ==

其中，属性UAP.AUTH.ALG，UAP.KDF.PRF，print_token为固定值。属性print.client.credential.path为授权文件存放地址。属性print.server.name，为打印公有云服务地址，各环境地址参考以下表格：

云打印公有云服务地址
环境
测试环境
日常环境
灰度环境
预发环境
生产环境
项目工程pom依赖引入：

<dependency>

<groupId>com.yonyou.iuap</groupId>

<artifactId>iuap.print.client</artifactId>

<version> 2.0.0-RELEASE</version>

<exclusions>

<exclusion>

<groupId>org.slf4j</groupId>

<artifactId>slf4j-log4j12</artifactId>

</exclusion>

</exclusions>

</dependency>

sdk调用示例：

使用PrintServer.execGet或者PrintServer.execPost调用接口。

方法参数说明如下： |:---|:---|:---|:---|:---| |参数名称|参数类型|参数说明|是否必填|示例值||uri|String|接口相对路径|true|||params|Map<String, String>|接口参数对|true|||tenantId|String|租户id|true|||userId|String|用户id|true||

在业务节点，调用业务后端服务，由业务后端服务发送请求，获取打印设计或预览页面。

页面设计/预览按钮调用接口格式：

http://领域地址：领域端口/接口路径?参数，如http://127.0.0.1:8080/print/ preview?sendType=type&tenantId=ptenantId&printcode=printcode&serverUrl= serverUrl1&params=params1&lang=lang

获取打印设计/预览页面，可参考以下代码：

设计页面接入代码

@RequestMapping(value = "/getDesign", method = RequestMethod.GET)

public @ResponseBody **void **getDesiner(HttpServletRequest request, HttpServletResponse response){

String lang = request.getParameter("lang");

**try **{

String url = PrintUrlUtil.getdesignUrl();

if(StringUtils.isNotBlank(lang)){

url = PrintUrlUtil.getdesignUrl(lang);

}

String tenantid = InvocationInfoProxy.getTenantid();

url = url + "?tenantId="+tenantid;

String html = HttpTookit.doGet(url, null);

response.setContentType("text/html; charset=utf-8");

response.getWriter().print(html);

response.flushBuffer();

} catch ( Exception e) {

response.getWriter().append(e.getMessage());

}

}

预览页面接入代码

@RequestMapping(value = "preview", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")

public void getPrintPreview(HttpServletRequest request, HttpServletResponse response) {

String lang = request.getParameter("lang");// 语种编码，可忽略

String url = PrintUrlUtil.getpreviewUrl();// 获取设计页面，替换为PrintUrlUtil.getdesignUrl();

if(StringUtils.isNotBlank(lang)){

url = PrintUrlUtil.getpreviewUrl(lang);// 获取设计页面，替换为PrintUrlUtil.getdesignUrl(lang);

}

String html = HttpTookit.doGet(url + "?tenantId=" + request.getParameter(TENANTID), null);

response.setContentType(TEXT_CHARSET);

**try **{

response.getWriter().print(html);

response.flushBuffer();

} **catch **(IOException e) {

logger.error(e.getMessage());

}

}

获取页面时,前端需要在请求路径上拼接参数，说明如下：

||

|---| |设计参数说明| |参数|参数类型|描述|是否必填| |alias|string|模板名称|是| |bocode|string|数据源编码|是| |tenanId|string|租户ID|是| |reportName|string|模板编码|是| |type|string|模板类型，为固定值，值为48a8206f-6759-431e-bf84-e973935e2fcc|是| |lang|string|语种编码|否|

||

|---| |预览参数说明| |参数|参数类型|描述|是否必填| |printcode|string|模板编码|是| |serverUrl|string|业务数据来源地址|是| |params|string|业务数据请求参数|是| |sendType|string|发送类型，固定值，值为2|是| |tenantId|string|租户ID|是| |lang|string|语种编码|否|

基于mdf前端框架使用打印

(a)打印准备工作

在u8c-daily.uuap.com环境下配置功能节点,进入数字化建模-系统管理-应用管理-我的应用,在对应的领域(此处我们选择的是采购供应)下新建自建应用.此处我们新建一个询报价的应用.

新建完成后,可以看到该应用对应的application信息.记下此处的applicationCode信息,后面会用到.

填写如下的excel表信息.此处复用的领域数据信息,所以领域数据格式不需要调整.应用数据格式下的code和分类数据格式的parentcode和code的前缀都是使用的上一步指定的applicationcode信息.分类数据格式code的后半部分是指的excelUI模板的模板名称.将该excel填写完毕后发送给云打印开发进行开通.

填写如下excel表信息,如果不需要流程,则交易类型所在行信息可以为空,在单据类型名称所在的行信息中的是否支持流程选择为0即可.如果需要支持流程,则可以参考下一篇的流程专题.

配置完成后,可以通过访问一个url地址来判断配置是否完成.通过这个请求将ExcelUI中的数据源信息注册到打印模板中.[http://u8c-baseservice-api.daily.app.yyuap.com/domain/getbillMetaByBillCode?billCode=d1b8c249-99b0-44ad-bc48-96d3a7f83ddd.ucf_cus_quotation_card](http://u8c-baseservice-api.daily.app.yyuap.com/domain/getbillMetaByBillCode?billCoded1b8c249-99b0-44ad-bc48-96d3a7f83ddd.ucf_cus_quotation_card" \t "/Users/wbsir/Documentsx/_blank). billCode就是applicationcode.ucf_cus_quotation_card就是excelUI模板的卡片模板名称.正确的返回值应该是如下格式:

2.打印模板配置

通过上述的准备工作后,就可以在数字化建模-模板管理-打印模板下看到对应的打印模板的标签信息.点击 + 号可以配置多个打印模板.

配置完打印模板后,可以点击F12看到打印模板的相关信息.在调试信息中可以看到此处配置的两个打印模板的code信息.记下此处的code信息.

打开 excel UI模板的列表卡片信息,在bill_command下的cmdPrintReview 和cmdPrintDesign所在行的参数(parameter)列增加如下内容

{"printcode":"SCM_all1565243016000","params":{"metaurl":"ucf.customer.CusQuotationCard"}}

其中printcode 就是上一步提到的templates对应的code,metaurl为ExcelUI模板的卡片页面的数据源信息.

在excel中重新执行宏,将生成的sql文件导入到数据库中.

修改前端工程代码.在src/client/business目录下,根据xml指定的moduleName新建一个文件夹,此处使用的ucf.在该目录下新增一段扩展代码.用于打印的前端支持.注意文件名为ExcelUI模板的模板名称+

"_VM.Extend.js"的格式,比如此处使用的是ucf_ucf_cus_quotationlist_VM.Extend.js.同时文件内部也需要根据实际情况替换ucf_ucf_cus_quotationlist 和url的信息.

cb.define(['common/common_VM.Extend.js'], function (common) { var ucf_ucf_cus_quotationlist_VM_Extend = { doAction: function (name, viewmodel) { if (this[name]) thisname; }, init: function (viewmodel) { viewmodel.on('beforePrintpreview',(params)=>{ let cmdParameter = JSON.parse( params.cmdParameter); //动态的修改cmdParameter内容 const _getSelectRowIds = (gridModel, para, distinct = true) => { //默认去重 if (!gridModel) return let selectDatas = para && para.params && para.params.index != null ? [gridModel.getRow(para.params.index)] : gridModel.getSelectedRows(); let ids = [] if (selectDatas && selectDatas.length > 0) { selectDatas.forEach(function (row) { if (row.id) { ids.push(row.id) } }) } return distinct ? [...new Set(ids)] : ids } const ids = _getSelectRowIds(viewmodel.getGridModel()); if (ids && ids.length > 0) { let url = 'http://common-mdf-fe.dev.app.yyuap.com/uniform/bill/print'; let billNo = viewmodel.getParams().cardKey; url = url + '?billnum='+billNo+'&ids='+ids.join(','); cmdParameter.serverUrl = encodeURIComponent(url); } else { cb.utils.alert("请先选择数据"); return false; // const condition = viewmodel.getCache('lastSearchCondition') ? JSON.stringify(viewmodel.getCache('lastSearchCondition').condition) : null; // params = Object.assign(params, { // condition // }) } console.log(JSON.stringify(cmdParameter)); //最后将修改后的内容赋值给params； params.cmdParameter = JSON.stringify(cmdParameter); }) } } try { module.exports = ucf_ucf_cus_quotationlist_VM_Extend; } catch (error) { } return ucf_ucf_cus_quotationlist_VM_Extend;});

效果展示

通过如上配置,打印就可以正常使用了,打开[http://common-mdf-fe.dev.app.yyuap.com/meta/archivelist/ucf_cus_quotationlist](http://common-mdf-fe.dev.app.yyuap.com/meta/archivelist/ucf_cus_quotationlist" \t "/Users/wbsir/Documentsx/_blank).点击打印按钮下的打印设计.可以看到如下界面

选中一条记录,点击 预览打印按钮,可以看到预览打印的效果.

注意事项

因为打印需要走回调,所以打印的预览需要注意服务器要和本地的环境能够互联,或者直接使用线上环境.

(b)扩展开发-打印

1 功能概述

目前打印组件实现了打印预览、打印设计、直接打印功能。用户可以在excel中自定义打印按钮的布局。下面是以dropdown形式你实现的。那如何实现打印功能呢，需要用户增加环境变量、excel配置。

2 环境变量配置

在src/common/config.env.js 下定义打印相关参数配置如下：

print_url: 连接打印的后台地址，不同环境地址会不同。具体地址值在备注中有说明。

domainCode：域code值，不同业务code值不同。具体值可以咨询云打印人员。

HTTP_PRINT_SERVER:打印请求具体数据连接的后端的服务器地址

具体示例如下：

export default { HTTP_SERVICE_BASEURL:base_url, HTTP_PRINT_SERVER:print_url, HTTP_PRINT_DATA_SERVERURL:base_url+'/bill/print', //打印的回调的数据地址 domainCode:'SCM',//打印需要的域code值}

3 UI元数据配置

首先需要增加打印按钮，配置方式跟普通按钮一样，在Excel中配置[bill_command]表时需要增加paramter、action参数配置。下面为具体的paramter配置说明，其中打印模板printcode、类别编码classifyCode值可向云打印人员咨询。

打印模板printcode：打印模板是先找云打印人员开通一个数据库，每个领域都有一个，然后总共多少应用下多少个服务需要打印。当我们打开打印模板节点，就能看到模板类别了。

类别编码classifyCode：可以支持切换同类别下不同模板打印。预置模板的时候，可以打印的字段，是根据类别编码来查的，比如我给的EMM.emm_pcplan_card，他就会查emm_pcplan_card这个页面的所有字段，都可以配置出来，我这边查询也按照emm_pcplan_card来查询，确保他配置的字段我都能查询出来，这样打印才不会出现打印不出来字段情况

3.1 打印预览

paramter对象字段说明

||||

|---|---|---| |属性名称|含义|备注| |printcode|打印模板|eg:"voucher_system_default_20190515"| |classifyCode|类别编码|| |serverUrl|数据源请求的url，打印时会通过serverUrl请求业务数据|可以通过扩展脚本实现，参考下面的扩展API| |params|请求业务数据时，会根据此参数进行筛选，具体由业务来定|可以通过扩展脚本实现| ||||

整体配置如下：

{"printcode":"emm_pcplan_card_print"，"classifyCode":"EMM.emm_pcplan_card"}

action字段说明

打印预览的action字段为printpreview

3.2 打印设计

paramter对象字段说明

||||

|---|---|---| |属性名称|含义|备注| |printcode|打印模板|eg:"voucher_system_default_20190515_20190515"|

整体配置如下：

{"printcode":"voucher_system_default_20190515"}

action字段说明

打印预览的action字段为printdesign

3.3 直接打印

paramter对象字段说明

||||

|---|---|---| |属性名称|含义|备注| |printcode|打印模板|eg:"voucher_system_default_20190515"| |serverUrl|数据源请求的url|| |params|请求数据的参数|eg:{"metaurl":"bd.currencytenant.CurrencyTenantVO"}|

整体配置如下：

{"templateCode": "voucher_system_default_20190515","tenantId": "lfvukx6f", "params": { "metaurl": "bd.currencytenant.CurrencyTenantVO" },"serverUrl":"http://ucfbasedoc.test.app.yyuap.com/meta/attribute" }

action字段说明

打印预览的action字段为printnow

4 扩展API

beforePrintpreview 打印预览之前的回调，用户可以动态的修改params参数，beforePrintdesign 打印设计之前的回调，用户可以动态的修改params参数，如下：

ViewModel.on('beforePrintpreview',(params)=>{ let cmdParameter = JSON.parse( params.cmdParameter); //动态的修改cmdParameter内容 cmdParameter.serverUrl = '请求数据的url'; cmdParameter.params = '请求数据所需要的参数'; //例如下面代码： //cmdParameter.serverUrl = window.SERVER_URL.SRV_URL + "/bill/getPrintData"; //let billNo = viewmodel.getParams().billNo; //const ids = [viewmodel.get("id").getValue()]; //cmdParameter.params = { // ids: ids, billno: billNo, //} //最后将修改后的内容赋值给params； data.params.cmdParameter = JSON.stringify(cmdParameter);})

典型业务场景介绍
开发场景之调接口初始化租户数据（示例）

可参考以下方式调用初始化接口：

@RequestMapping(value = "/initData", method = RequestMethod.POST)

**public **@ResponseBody String initData(HttpServletRequest request, HttpServletResponse response){

logger.info("------初始化租户数据-------");

// 初始化租户数据

String tenantId = InvocationInfoProxy.getTenantid();

Map<String, String> params = new HashMap<>();

params.put("presetClassify","1");

// 查询接口/rest/print/initTenantBizz

String returnVal = PrintServer.execPost(Constants.URI_INITTENANT, params, tenantId, "");

logger.info("租户初始化结果为："+returnVal);

**return **returnVal;

}

业务场景之模式化应用
5.2.1单一表的打印模板设计

设计器中使用卡片或网格即可生成一个比较规范的布局格式，设计效果：

预览效果

5.2.2主子表和单据的打印设计

主子表也是比较简单的表格设计，使用表格控件和文本控件并设置对应的数据源就可以完成模板的设计。一般主表呈现当前表单的统一信息，表格内显示具体的数据。

设计时，可以使用卡片或者网格来设置主表中的字段，列表控件来设置子表中的字段。

最终预览效果如下，

分组表格的打印模板设计

使用分组控件并设置分组依据，然后在分组控件中拖入列表或其他控件等，分组控件内的控件均会按分组依据进行分组。如采购订单按物料编码对明细进行分组，

预览效果如下，

套表打印模板的设计

上传图片后按位置放置相应控件，如凭证套打场景：

带底图预览效果，点击画布上的页面区域，【样式】-开启【打印时显示套打底图】，开关开启功能通常用于调试状态时查看预览效果

不带底图打印预览效果，关闭【打印时显示套打底图】后效果见下图，真实打印时因打印纸上已带图所以开关需要关闭。

开放接口说明
根据租户Id和分类编码获取模板列表

接口类型： rest

请求方式： post

Content-Type：application/x-www-form-urlencoded

请求路径：/rest/printTemplate/getTemplatesByTenantIdAndClassifyCode

请求参数： |:---|:---|:---|:---|:---| |参数名称|参数类型|参数说明|是否必填|示例值| |tenantId|String|租户id|true|| |classifyCode|String|系统id|true||

响应参数： |:---|:---|:---|:---| |参数名称|参数类型|参数说明|示例值| |templates|String|符合条件的模板列表||

响应示例：

{

"status":1,

"templates":[

{

"isDefault":true,

"id":"17e5a892-53bf-43f2-bb2c-d7b3f9f56a9e",

"code":"HR10075151560411488000",

"name":"员工登记表"

},

{

"id":"7301adba-d8da-4189-955f-7e10f56191aa",

"code":"u8c1572416637000",

"name":"员工登记表-bjy用友实业"

}

]

}

异常示例：

{

"status":0,

" message ":"tenantId or classify code is empty"

}

打印应用层缓存业务数据查询参数

接口类型： rest

请求方式： post

Content-Type：application/x-www-form-urlencoded

请求路径：/bizz/cacheParameter

请求参数： |:---|:---|:---|:---|:---| |参数名称|参数类型|参数说明|是否必填|示例值| |param|String|业务数据查询参数|true||

响应参数： |:---|:---|:---|:---| |参数名称|参数类型|参数说明|示例值| |key|String|符合条件的模板列表|| |status|Int|成功标志||

响应示例：

{

"status":1,

"key":"9dd0fcad-2ef3-4a8f-8f54-3c15dbebf273"

}

异常示例：

{

"status":0,

" msg":" parameters is empty"

}

拼接预览地址参数说明

卡片调打印地址和参数：https://bip-daily.yyuap.com/iuap-apcom-print/u8cprint/design/getPreview?appSource=PU&domainDataBaseByCode=SCM&tenantId=ckf457z1&meta=0&sendType=6&lang=zh_CN&orgId=2360359582568704&printcode=u8c1649831256000&serverUrl=https://bip-daily.yyuap.com/mdf-node/formdata/report/getPrintData?domainKey=upu&params=%7B%22billno%22:%22st_purchaseorder%22,%22printcountswitch%22:true,%22printrefreshinterval%22:1000,%22context_path%22:%22/mdf-node/uniform%22,%22ids%22:%5B2707677542027520%5D%7D#/

1.https://bip-daily.yyuap.com 是当前域名

2./iuap-apcom-print/u8cprint/design/getPreview？ 打印的地址

3.domainDataBaseByCode=SCM 领域编码

4.tenantId=ckf457z1 租户id

5.meta=0 自定义元数据

6.sendType=6 卡片是6

7.lang=zh_CN 语种

8.orgId=2360359582568704 组织id

9.printcode=u8c1649831256000 模板编码

10.serverUrl=https://bip-daily.yyuap.com/mdf-node/formdata/report/getPrintData?domainKey=upu 业务数据地址

11.params={"billno":"st_purchaseorder","printcountswitch":true,"printrefreshinterval":1000,"context_path":"/mdf-node/uniform","ids":[2707677542027520]} param是查询业务数据要用到的参数，和serverUrl是一起用的

12.params中billno是单据编码 ids是这条数据的主键2707677542027520

列表调打印地址和参数：先调https://bip-daily.yyuap.com/mdf-node/cachePrint?terminalType=1 缓存接口

1.https://bip-daily.yyuap.com 当前域名

2./mdf-node/cachePrint?terminalType=1 接口地址

3.参数param json格式： {"param":"{"billno":"znbzbx_expensebill","meta":1,"printcountswitch":true,"printrefreshinterval":1000,"context_path":"/mdf-node/uniform","ids":[2728711698534912]}"} billno是单据编码 ids是这条数据的主键2707677542027520

4.headers里domain-key参数

5返回参数：{"key":"65b7ab2b-16f8-4036-97c3-0bebe8c48bdb","status":1} 取出key值，下个接口用

https://bip-daily.yyuap.com/iuap-apcom-print/u8cprint/design/getPreview?selected=true&domainDataBaseByCode=SCM&targetTenantId=&targetOrgId=&currentMainClassCode=undefined&lang=zh_CN&tenantId=ckf457z1&meta=0&sendType=7&printcode=u8c1649819189000&isCache=1&serverUrl=https://bip-daily.yyuap.com/mdf-node/formdata/report/getPrintData?domainKey=upu&orgId=&subClassifyCode=&classifyCode=PU.st_purchaseorder&jump=fromSelectBtn&params=0072df0a-571a-4930-9345-5d350d9608bd

1.https://bip-daily.yyuap.com 是当前域名

2./iuap-apcom-print/u8cprint/design/getPreview？ 打印的地址

3.domainDataBaseByCode=SCM 领域编码

4.tenantId=ckf457z1 租户id

5.meta=0 自定义元数据

6.sendType=7 isCache=1 列表是7

7.lang=zh_CN 语种

8.orgId=2360359582568704 组织id

9.printcode=u8c1649819189000 模板编码

10.serverUrl=https://bip-daily.yyuap.com/mdf-node/formdata/report/getPrintData?domainKey=upu 业务数据地址

11.params=65b7ab2b-16f8-4036-97c3-0bebe8c48bdb（上面接口返回的key） ，和serverUrl是一起用的

直接打印：1.先调本地插件

2.拼接参数和自定义协议（咨询下前端框架部）