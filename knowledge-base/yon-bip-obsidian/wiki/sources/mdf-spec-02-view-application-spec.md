---
title: "UI模型viewApplication"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/02-view-application-spec"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# UI模型viewApplication

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/02-view-application-spec | 所属：协议

# [](#ui模型-viewapplication)UI模型 viewApplication

## [](#1-单据模型定义)1. 单据模型定义

- 单据 - bill，关键属性为cBillNo
- 模板 - view，关键属性iTplId
- 容器 - group，关键属性为cGroupCode
- 控件 - billItem，关键属性为cControlType

## [](#2-单据信息viewapplication)2. 单据信息（viewApplication）

"viewApplication":{

 "billid":1001282423,

 "cBillName":"项目模板列表",

 "cBillType":"ArchiveList",

 "cBillNo":"projectlist",

 "bAllowMultiTpl":false,

 "cSubId":"AA",

 "cCardKey":"project",

 "view":Object{...},

 "extscripturls":Array[0]

}

||**属性**||**类型**||**含义**||**说明**|
||billid||Integer||单据ID【Excel中无】||1001282423|
||cBillName||String||名称【Excel中无】||项目模板列表|
||cBillType||String||类型【Excel中无】||ArchiveList，[详细值请查看这里](#/spec/02-bill-type-spec)|
||cBillNo||String||单据编号||projectlist; 可以理解为name|
||bAllowMultiTpl||Boolean||是否允许多模版||false;如果为true，则有可选模板，数据会重新获取|
||cSubId||String||子产品ID（业务含义）||AA; AA_billno=xxx?extend  扩展|
||cCardKey||String||单据类型||跳转目标表单的单据编号(对于列表来说，此字段代表列表所对应的单据详情的cBillNo）其值为要跳转目标表单的cBillNo|
||batchoperate||Boolean||是否多选||通常用于参照，标记参照是否支持多选|
||view||JSONObject||视图根【Excel中无】||*JOSN*|
||extscripturls||JSONArray||扩展脚本地址【Excel中无】||*JSONArray*|

## [](#3-模板信息view)3. 模板信息（view）

"view":{

 "iTplId":1337972,

 "cTemplateName":"项目模板显示模板",

 "iTplMode":0,

 "iWidth":10000,

 "cTemplateTitle":"项目模板",

 "containers":Array[2]

}

||**属性**||**类型**||**含义**||**说明**|
||iTplId||Integer||单据模板ID||1337972|
||cTemplateName||String||模板名称【Excel中无】||项目模板显示模板|
||iTplMode||Integer||模板类型||0;终端类型对应的模板，0和2是pc，3是移动|
||iWidth||Integer||画布宽度||10000；auto100%的含义|
||cTemplateTitle||String||模板标题【Excel中无】||项目模板|
||containers||JSONArray||布局【Excel中无】||*Array*|

### [](#31-组件类型整体说明)3.1. 组件类型整体说明

在viewapplication描述页面UI的布局及样式的协议中，整体分类两大类：

||组件分类||协议中的类型||分类说明||区分说明|
||containers||JsonObject||容器型组件，布局类组件||1、容器中还能嵌套容器；而有的容器组件中直接套基础组件，为了区分，内部再做一次分类说明，如：分组容器和操作容器等|
||controls||JsonObject||基础组件，展示型组件||1、展示型组件是最末端的呈现组件，对应到组件库中的基础组件；为了内部分类说明，可区分为操作组件或是表单类组件|

### [](#32-mdf-支持的组件类型汇总)3.2. MDF 支持的组件类型汇总

[**点击这里查看完整的控件类型说明(移动端)**](#/components-mobile/00-components)
[**点击这里查看完整的控件类型说明(PC端)**](#/components-web/00-components)

## [](#4-容器类组件数组containers)4. 容器类组件数组（containers）

### [](#41-分组容器tablelistheaderconvenientquery-)4.1. 分组容器（Table、ListHeader、ConvenientQuery ...）

容器型组件的字段属性如下：   

{

 "groupId":5262030,

 "parentId":5261902,

 "cName":"序列号数据区",

 "iOrder":26,

 "bMain":false,

 "cCode":"st_storeout_sn",

 "cDataSourceName":"st.storeout.StoreOutDetailSN",

 "cControlType":"Table",

 "cGroupCode":"st_storeout_body_page_sn_data",

 "childrenField":"storeOutDetailSNs",

 "cAlign":"center",

 "iCols":0,

 "containers":Array[1],

 "controls":Array[1]

}

||**属性**||**类型**||**含义**||**说明**|
||groupId||Integer||模板分组ID||5262030，标记分组，表单项通过此字段关联分组表|
||parentId||Integer||父模板分组ID||5261902|
||cName||String||模板分组名称||序列号数据区，无实际意义|
||iOrder||Integer||排序||26|
||bMain||Boolean||是否主表||false; 主view的意思|
||cCode||String||实体编码【entity表的cCode】||st_storeout_sn|
||cDataSourceName||String||数据源名称||st.storeout.StoreOutDetailSN|
||cControlType||String||控件类型||Table，容器控件|
||cGroupCode||String||分组编码【group表的cCode】||st_storeout_body_page_sn_data，父容器模板分组编码; 可理解为cParentGroupCode，和parentId成对，理解为容器名字，用于找容器|
||childrenField||String||子表集合属性||storeOutDetailSNs; 作为key对应子表实体映射数据|
||cAlign||String||排列方式||center|
||iCols||Integer||显示列数||0；代表列数，最高取5|
||containers||JSONArray||布局数组【Excel中无】||*Array*|
||controls||JSONArray||控件数组【Excel中无】||*Array*|

### [](#42-操作容器toolbar)4.2. 操作容器（Toolbar）

操作容器通常是分组容器的子控件

{

 "groupId":2898498,

 "parentId":521927,

 "cName":"Browstoolbar",

 "iOrder":0,

 "cDataSourceName":"Toolbar",

 "cControlType":"Toolbar",

 "cGroupCode":"Browstoolbar",

 "cAlign":"right",

 "iCols":0,

 "controls":Array[7],

 "key":"ContainerToolbarBrowstoolbar",

 "parentKey":"Container521927"

}

||**属性**||**类型**||**含义**||**说明**|
||groupId||Integer||模板分组ID||2898498，标记分组，表单项通过此字段关联分组表|
||parentId||Integer||父模板分组ID||521927|
||cName||String||模板分组名称||Browstoolbar，无实际意义|
||iOrder||Integer||排序||0|
||cDataSourceName||String||数据源名称||Toolbar|
||cControlType||String||控件类型||Toolbar，操作控件|
||cGroupCode||String||模板分组编码||Browstoolbar，操作按钮项通过此字段关联分组表|
||cAlign||String||排列方式||right|
||iCols||Integer||显示列数||0|
||controls||JSONArray||控件【Excel中无】||*Array*|
||key||String||||ContainerToolbarBrowstoolbar|
||parentKey||String||||Container521927|

## [](#5-基础类组件数组controls)5. 基础类组件数组（controls）

### [](#51-操作组件button--primarybutton)5.1. 操作组件（Button | PrimaryButton）

{

 "icon":"bianji1",

 "cItemName":"btnEdit",

 "cCaption":"编辑",

 "cShowCaption":"编辑",

 "cControlType":"button",

 "iOrder":3,

 "iStyle":0,

 "enterDirection":0,

 "key":"67257082"

}

||**属性**||**类型**||**含义**||**说明**|
||icon||String||图标||bianji1|
||cItemName||String||名称||btnEdit|
||cCaption||String||标题||编辑|
||cShowCaption||String||显示标题||编辑|
||cControlType||String||控件类型||Button|
||iOrder||Integer||排序||3|
||iStyle||Integer||样式||0；0图标加文字，1纯文字，2纯图标|
||enterDirection||Integer||切入方向||0；光标走向，2向下，4向右|
||key||String||||67257082|

### [](#52-表单组件input-refer--select-)5.2. 表单组件（Input | Refer | Select ...）

{

 "cItemName":"enable",

 "cCaption":"状态",

 "cShowCaption":"状态",

 "iMaxLength":100,

 "iFieldType":1,

 "bEnum":true,

 "cEnumString":"{"0":"未启用","1":"启用","2":"停用"}",

 "bMustSelect":false,

 "bHidden":false,

 "bSplit":false,

 "bExtend":false,

 "bCanModify":true,

 "iMaxShowLen":255,

 "iColWidth":100,

 "iAlign":1,

 "bNeedSum":false,

 "bShowIt":true,

 "bFilter":true,

 "cDefaultValue":"0",

 "bIsNull":true,

 "bPrintCaption":true,

 "bJointQuery":false,

 "bPrintUpCase":false,

 "bSelfDefine":false,

 "cControlType":"select",

 "iOrder":7,

 "bMain":true,

 "id":71226254,

 "bVmExclude":0,

 "iBillTplGroupId":69416434,

 "iBillId":1001282423,

 "iBillEntityId":2163145,

 "iTplId":1337972,

 "cSubId":"AA",

 "iSystem":1,

 "cName":"enable",

 "cFieldName":"enable",

 "authLevel":3,

 "cDataSourceName":"bd.project.ProjectVO",

 "enterDirection":0,

 "cEnumType":"bd_enable_type",

 "enumArray":"[{"nameType":"text","value":"未启用","key":"0"},{"nameType":"text","value":"启用","key":"1"},{"nameType":"text","value":"停用","key":"2"}]"

}

||**属性**||**类型**||**含义**||**说明**|
||cItemName||String||名称||orgid_name；  和 cName一样容器是取cName，控件取cItemName|
||cCaption||String||标题||所属组织|
||cShowCaption||String||显示标题||所属组织（可设置）|
||iMaxLength||Integer||最大长度||100|
||iFieldType||Integer||字段类型||1；（废弃类型）已被controlType代替|
||bEnum||Boolean||是否枚举||false|
||cEnumString||String||枚举信息||{"0":"未启用","1":"启用","2":"停用"}|
||bMustSelect||Boolean||是否必选||false；必收集信息|
||bHidden||Boolean||是否隐藏||false； 系统字段，用于业务的隐藏管理|
||bSplit||Boolean||是否支持行拆分||false|
||bExtend||Boolean||是否扩展字段||false；计算字段，用户自己扩展 UI层面|
||bCanModify||Boolean||是否可修改||true；是否可编辑|
||iMaxShowLen||Integer||最大显示长度||255|
||iColWidth||Integer||列宽||150|
||iAlign||Integer||对齐方式||1；字段取值范围含义 （废弃类型）1 left，2 center，3right|
||bNeedSum||Boolean||是否支持合计||false|
||cSumType||String||汇总类型||avg，count，group，max，sum，自定义|
||bShowIt||Boolean||是否显示||true；用户字段，是否显示某个字段（true为勾选项）|
||bFilter||Boolean||是否过滤||true|
||cDefaultValue||String||默认值||0；只有枚举类型才有|
||bIsNull||Boolean||是否可以为空||true|
||bPrintCaption||Boolean||是否打印栏目标题||true|
||bJointQuery||Boolean||是否支持关联查询||false|
||bPrintUpCase||Boolean||是否打印金额大写||false|
||bSelfDefine||Boolean||是否自定义项目||false；实体字段，用户自定义|
||cControlType||String||控件类型||Input|
||iOrder||Integer||排序||1|
||bMain||Boolean||是否主表||true|
||id||Integer||ID||71226251|
||bVmExclude||Integer||||"bVmExclude":0：viewmodel和view中都有收集，1、viewmodel没有，view中有不收集，2、viewmodel有，view没有不收集（举例：regionCode）|
||iBillTplGroupId||Integer||模板分组ID||69416434|
||iBillId||Integer||单据ID||1001282423|
||iBillEntityId||Integer||单据实体ID||2163145|
||iTplId||Integer||单据模板ID||1337972|
||cSubId||String||子产品ID||AA|
||iSystem||Integer||是否系统定义||0：非系统，1：系统；系统预制，给二开预留|
||cName||String||字段别名||enable|
||cFieldName||String||字段类型||enable|
||authLevel||Integer||||3；（零售权限级别）0：租户管理员 1：租户操作员2：是客户管理员 3：客户操作员4：商家管理员 5：商家操作员|
||cDataSourceName||String||数据源名称||bd.project.ProjectVO|
||enterDirection||Integer||切入方向||0|
||cEnumType||String||枚举类型||bd_enable_type|
||enumArray||String||枚举数组||[{"nameType":"text","value":"未启用","key":"0"},{"nameType":"text","value":"启用","key":"1"},{"nameType":"text","value":"停用","key":"2"}]|
||cRefType||String||参照类型||aa_deliverycorp|
||cRefId||String||参照ID||无用|
||cRefRetID||String||参照返回信息||{"parent":"id"}，参照表和当前表的字段对应关系，把id赋值给parent，可以配置多对|
||refReturn||String||参照返回值||code，确定回显到参照控件上的值|
||multiple||Boolean||参照是否多选||标记参照是否多选|