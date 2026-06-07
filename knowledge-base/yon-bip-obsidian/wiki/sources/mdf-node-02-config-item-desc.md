---
title: "MDF服务配置项说明"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/02-config-item-desc"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# MDF服务配置项说明

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/02-config-item-desc | 所属：MDF服务

# [](#mdf服务配置项说明)MDF服务配置项说明

**说明：**

- 中划线为废弃的配置
- 红色为重要的配置
- 查看谁有公有云配置权限[《统一Node配置领域权限》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20771722)
- 只有基于预发环境出补丁会同步最新的预发配置到补丁中，基于私有化环境、专属迭代等其它环境出的补丁不会同步最新配置

**环境、权限及更新策略：**

||环境||环境标识||权限||更新策略|
||环境||环境标识||权限||更新策略|
||测试环境||test||读写||领域维护，实时生效|
||日常环境||daily||读写||领域维护，实时生效|
||预发环境||pre||读写||领域维护，实时生效|
||核心1环境||stage||只读||每次上线从预发同步|
||核心2环境||prod||只读||每次上线从核心1同步|
||核心3环境||online-dc-core3||只读||每次上线从核心1同步|
||核心4环境||online-dc-core4||只读||每次上线从核心1同步|
||商用开发环境||sandbox||只读||每次上线从核心1同步|
||海外环境||online-sg||不可见||每次上线从核心1同步|
||专属化环境||--||不可见||每次出盘从预发同步|

## [](#1-领域配置)1. 领域配置

专属化配置方法[《项目级配置文件-项目级领域配置》](#/node/03-config-file)

### [](#11-特性开关配置-features)1.1. 特性开关配置 features

||属性名称（编码）||描述||备注|
||metaClientCache||是否开启meta接口缓存||推荐开启|
||supportConfigCheckFlds||参照搜索框是否支持配置模糊搜索项|||
||voucherNoReturn||单据保存后是否返回列表页|||
||UImobans||是否使用组织级模板|||
||asyncBatchOutput||批量导出是否异步|||
||batchExportWithCondition||列表是否支持条件导出|||
||reactBatchUpdate||是否批量更新状态|||
||autoAddRowAndDeleteRow||表格自动增行及删除空白行|||
||checkMask||check服务是否加loading|||
||printOrgTemplate||组织级打印模板|||
||printTransType||subClassifyCode|||
||printTransTypeCode||打印需要的交易类型参数transTypeCode|||
||printCarryChildTablesId||子表选中行打印|||
||supportTimelineByDefault||单据是否支持时间轴功能|||
||supportBillAssistant||单据是否支持单据助手|||
||asyncSave||是否异步保存|||
||idempotencySave||是否幂等保存|||
||loadDataAdvance||数据及状态设置提前到组件挂载前||性能优化|
||autoGenerateLineNo||是否自动生成行号|||
||offTableDisplayHoverOutline||表格鼠标悬浮是否显示控件|||
||formLayout||是否开启弹性布局|||
||toolbarTopFixed|||||
||mutiBillCode|||||
||queryLoginUser||是否调用getLoginUser接口更新上下文信息||获取领域扩展的上下文|
||newMovePrevOrNext||是否启用新的上下翻页||解决翻页与列表数据不一致问题|
||cacheFilterFeature||表格筛选后进入详情返回是否保留筛选状态||默认清空（2024年7月20日后默认开启，即不清空）|
||isvAuthByCode||isv租户写入鉴权Code到Cookie||只有isv用户需要配置|
||importWorkbench||导入工作台||导入和模板下载新功能|
||importReferenceTranslation||导入工作台-参照对照||元数据和ui元数据字段的对应关系|
||encryptionExport||导出工作台-加密导出||下载后的文件，需要密码解压才能看到文件|
||enableAttachmentExport||导出工作台-附件导出||下载后的文件是zip包，包含附件信息|
||templateInit||开启导入导出新架构|||
||templateInitOff||关闭导入导出新架构|||
||masterOrgNoCheck||主组织不触发Check|||
||masterOrgCopyCheck||复制时 主组织触发check||默认不触发|
||lazyLoadPage||详情子表延迟加载数据（懒加载）||无感知增加接口调用次数，UI层无单独处理，并非支持了分页功能 后端适配文档：《MDD》 《YPD》|
||lazyLoadByPage||详情子表延迟加载数据（分页）||子表懒加载，支持分页功能，需要和lazyLoadPage开关一起使用，只能用作数据展示场景使用，有批量操作场景时不能使用|
||hasProcessHandler||审批时是否开启选择人功能||配置后开启批量指派提交功能|
||banSaveRefresh||禁止保存后刷新的领域||保存后默认是刷新的，输入某domainKey后该领域就不刷新|
||dataTempShare||是否开启数据模板分享功能||在数据模板列表上显示分享按钮|
||newUImobans||新版UI模板|||
||mergeBillDataTranstype||是否将业务数据中transtype传到下游单据||打开开关直接取details服务中的transtype。一般交易类型发布菜单打开才往下传。|
||triggerReferBrowseForPush||没默认值时，push操作是否主动触发参照带入||默认不触发|
||autoGetAdvanceTitles||高级查询页签是否通过框架加载数据条数||默认为领域自己查数据条数|
||referRecentList||参照查看最近10条历史（不支持组织隔离）||默认不开启（开启的同时需要领域后端适配《RankService》）|
||referCollect||新的收藏历史||默认不开启（[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=166267826）](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=166267826%EF%BC%89)|
||realTimeDraft||实时草稿，新增时每10秒本地保存一下当前编辑数据||在单据未完成时下次新增会提示是否使用|
||masterOrgChangeNoClear||切换主组织不触发当前数据清空动作||默认触发|
||formula2||批量公式，批量请求/bill/executeFormulaCalculate||不开启公式独立联动计算，会请求很多次接口，开启后不管多少个公式都只请求一次接口|
||disableFormula2||禁用批量公式||新租户默认开启批量公式，如果想禁用打开这个开关|
||formulaBatchCheck||批量check情况下，公式计算出值是否触发check||默认触发|
||formulaHttpHideMask||公式接口调用是否有loading||默认有|
||formulaUseBusiness||公式组件 支持业务对象||默认不支持|
||getTplIdFirst||卡片页打开速度优化，不再等detail结束再调meta||需要后端框架升级到 3.0.9|
||newBillMeta||后端meta调用getfebill，不再是getbill，使用同时要用getTplIdFirst||需要后端框架升级到 3.0.9.2|
||showSearchConditions||是否展示查询区已选条件||需要后端框架升级到 3.0.9|
||bCanModifyFilterItemsTitle||是否支持修改查询条件名称||需要后端框架升级到 3.1.0|
||filteringCrossPage||表格跨页筛选||需要后端框架升级到 3.1.14及以上|
||filtingQueryBy||表格跨页排序||需要后端框架升级到 3.1.14及以上|
||saveDirtyData||编辑保存没有修改数据无需请求接口|||
||ignoreChecking||保存无视check校验||用于弱网或异常后无法保存|
||pullVoucherNotCarryDetail||卡片推拉单剔除子表明细||废弃|
||realTimeDraft||新增单据实时草稿||10s保存一次，存入indexDB里，|
||clearRealTimeDraftCacheOnBack||正常返回清空草稿||点击返回，或者点工作台的刷新 （废弃）|
||getCheckingStatusBeforeAction||check未完成点击按钮弹窗提示|||
||editChangeHistory||编辑态卡片页及保存后浏览态的变更历史||需要扩展脚本添加参数阻止因扩展脚本业务导致的初始化变更历史 (参数为：viewmodel.getParams().firstLoadData = true)|
||hasPersonal||数据模板支持用户级隔离，同时支持设置租户级公共模板|||
||saveDraftOnServer||草稿保存到后端服务器|||
||supportTableEditRowDrawer||卡片页支持表格侧滑编辑||日常环境默认开启，其他环境需配置|
||disableTableEditRowDrawer||卡片页禁用表格侧滑编辑||默认不禁用|
||voucherShowSelectedRows||卡片页表格显示已选||默认不显示|
||disabledExportUpperLimit||关闭导出50000条数据上限|||
||referCollect||参照收藏功能||默认禁用|
||columnUserSetting||栏目设置上是否显示租户级或用户级的图标||默认不显示 版本MDD528|
||showMoreLine||是否显示groupcontainer容器底部折叠组件||默认不显示|
||lazyLoadToolbar||懒加载toolbar提升打开体验||日常默认开启，其他环境需配置|
||pullDelTranstype||拉单list接口不要simpleVOs里的transtype||默认不开启，simpleVOs里会有transtype|
||mergeAllConditionStates||states按钮控制，满足条件的state个数超过1个需要进行合并||默认不合并|
||disableSubTableFullHeight||关闭子表高度自适应|||
||toolbarButtonMore||toolbar按钮是否显示更多下拉||默认不显示|
||cancelModal||是否开启弹窗关闭与取消按钮功能同步||默认不开启|
||workbenchMasterOrgTigger||生单工作台触发主组织值改变事件||默认不开启|
||noReferExtendResource||移动端参照不加载扩展脚本||默认不开启|
||yiguanBuriedPoint||开启前端易观埋点||默认不开启|
||openSortRule||表格列表设置的排序规则， ||默认不开启|
||businessStepCode||使用完整的业务阶段功能支持匹配业务阶段模版和业务阶段控制||默认不开启|
||noClearSelectDataAfterSearch||搜索不清空已选数据||默认不开启|
||saveFileRelativeAddress||图片上传时是否传相对地址||默认不开启（双域名专属化场景需要开启）|
||needSyncCellState||单独配置元数据时，侧滑内字段显示是否需要同步表格单元格状态，理论上单独配置元数据不会与表格状态保持一致则不会同步，如需同步请开启此特性（不配置侧滑元数据的不需要关心这个特性）||默认不开启|
||itemRuleScript||是否开启itemRule，开启后会调用/itemrule/script||默认不开启|
||disableitemRuleScript||是否禁用itemRule，就算开启了itemRuleScript也会禁用||默认不开启|
||forbidCallingCmdList||是否调用getbillcommands接口||默认调用|
||masterOrgCopyNoCheck||复制单据的时候不去触发主组织的后续check||默认不开启|
||modalResizable||templateType 为 modal 类型的单据，meta弹窗支持调整大小||默认不开启如只有部分单据需要，不能通过特性配置开启，也可以配置meta数据配置extraConfig: {modalResizable: true }|
||enableTableEditRowSetting||支持子表侧滑容器独立的字段设置||仅配置了独立侧滑元数据后， 开启该特性才生效，顾侧滑容器内的字段支持顺序设置时再开启（有的单据内tableeditrow内还嵌套多层容器和布局的应该不支持）|
||newValidTips||开启页面错误自动定位||测试和日常环境默认开启，预发和生产领域验证完手动开启|
||disableBizFlowRefresh||禁用审核有业务流配置就刷新||默认不开启|
||disabledButtonMore||关闭更多按钮功能||默认开启|
||hasDesignLoadExtend||开启低代码扩展组件||默认关闭|
||destroyVMTime||配置模型销毁时间，默认是30000ms，代表页面在关闭(返回)30s后销毁上一次打开页面的vm模型，对相关内存进行回收，如确保领域扩展业务在返回、关闭页签相关动作后无同步、异步扩展代码可设置为0,如确保无异步操作，不确定有没有同步执行操作，可设置300-1000，如配为true，则代表立即销毁||默认不开启，值可为布尔值true,也可为数字类型，布尔true等同于0，数字为毫秒值，如不配置，默认为30000（即30s后开始销毁模型）|
||dragRowAutoSave||浏览器表格行拖拽后自动保存||默认关闭|

**注意：**

- 以上特性都可以进行单据级控制[《MDF特性单据级配置》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=22513974)
- 以上注册的特性开关可以通过vm.hasFeature()判断是否存在

### [](#12-变量配置-env)1.2. 变量配置 env

||属性名称（编码）||值||描述||备注|
||appCode||TBS||文件服务存储编码|||
||domainCode||SCM||工作台领域编码||打印使用领域编码分库|
||applicationCode||PU||工作台应用编码|||
||wpsAppId||''||在线文档预览Key||用于移动端打印PDF预览|
||serviceDomain||''||微服务域（Rest，仅服务域与domainKey不一致需要配置）||用于云机一体调试appCode、UI模板映射|
||needContextPath||boolean||云机一体转发是否带context-path||默认false|
||asyncSaveSubTabNum||200000||启动异步保存阀值||表格超过200000条启动异步保存|
||batchCheckChunkNum||50||批量check的页大小||单次check的数据条数|
||batchCheckSupport||[]||哪些单据billNo指定开启批量check|||
||**PRINT_META**||{}||打印配置|||
||subPath||''||打印数据接口相对地址||report/getPrintData|
||    printDataServer||--||打印数据请求地址||不推荐使用，建议用subPath|
||**WORKFLOW_META**||{}||审批流配置|||
||    appSource||PU||审批流应用编码|||
||asyncSaveErrStopInterval||180||异步保存默认的超时等待秒数||异步保存默认等待时间|
||banFormLayout||[]||不启用formLayout布局的billNo|||
||pullVoucherCarryDetail||["targetBillNo"]||配置后推单带子表明细行或不带明细行，默认不配置保持不变||支持多数组配置，值为["targetBillNo","targetBillNo2",]，["~"]表示全部单据带明细；[]表示全部不带明细|
||auditCarryDetail||["billNo"]||审核、弃审剔除子表明细行||支持多数组配置，值为当前卡片的billNo ["voucher_order1","voucher_order2"]，["~"]表示全部单据带明细；[]表示全部不带明细|
||submitCarryDetail||["billNo"]||提交剔除子表明细行||同上|
||unsubmitCarryDetail||["billNo"]||撤回剔除子表明细行||同上|
||createCodeCarryDetail||["billNo"]||自动编码剔除明细子表||同上|
||openCloseCarryDetail||||打开、关闭剔除明细子表||同上|
||maxContentLength||number||请求数据字节最大数，单位MB||设置大数据量分流模式|

**注意：**

- 以上注册的变量可以通过vm.getEnv(key)获取
- 领域代码中通过registerEnv注册的优先级大于此处的配置
- 目前框架重要的几个编码：

appCode-文件服务应用编码
- domainCode-工作台领域编码
- applicationCode-工作台应用编码
- appSource-审批流应用编码

### [](#13-其它配置)1.3. 其它配置

||属性||值||描述||备注|
||appServer||--||领域后台服务地址||《配置说明》|
||staticHost||--||领域前端服务地址||useOSS为true时此属性无用|
||useOSS||true||false||扩展资源是否使用OSS+CDN加速|
||dependencies||[]||依赖的其它领域前端扩展资源||["productcenter", "ustock"]|
||mapping||''||强转到其它domainKey的资源|||
||customRoutes||[]||扩展路由||用于路过Node端拦截|
||proxyRoutes||{}||代理转发，用于转发请求||不常用|
||AUTH_WHITELIST||[]||跳登录鉴权的白名单||如：['/demo']，免授权白名单，脚手架中配置仅本地生效，部署到环境上需要在配置中心配置|
||features||[]||特性开关配置||详见：1.1|
||env||{}||变量配置||详见：1.2|

dependencies为数组，值为字符串有2种形式：

- 1-值为领域domainKey时加载依赖领域全部资源，如：['productcenter']
- 2-值为领域domainKey.external时，只加载依赖领域对外提供的部分资源，如：['productcenter.external']【推荐】

#### [](#131-proxyroutes-配置-红色是必输-参照物料档案导入)1.3.1 proxyRoutes 配置 红色是必输 （参照物料档案导入）

||参数||值||描述||备注|
||第一个参数||string||匹配规则|||
||第二个参数||{}||target:url *||转发目标地址|
||||||json:boolean||是否JSON格式|
||||不必须||contentType:"detault"||default使用前端传的contentType 默认是 json|
||||||trim:true 或 trim:"/path"||为true切掉第个参数的串，为string切掉string对应的串|
||||||dataType:"file"||转发的地址包含文件，pipe透传|

### [](#14-示例)1.4. 示例

{

 "features": ["autoAddRowAndDeleteRow", "supportConfigCheckFlds", "toolbarTopFixed", "batchExportWithCondition", "metaClientCache", "autoGenerateLineNo", "voucherNoReturn", "formLayout", "UImobans", "asyncSave", "printOrgTemplate", "mutiBillCode", "asyncBatchOutput", "idempotencySave", "loadDataAdvance", "supportBillAssistant"],

 "appServer": "https://xxx.com",

 "useOSS": true,

 "staticHost": "//xxx.com",

 "env": {

 "domainCode": "SCM",

 "asyncSaveSubTabNum": 200000,

 "batchCheckChunkNum": 50,

 "applicationCode": "PU",

 "batchCheckSupport": ["st_purinvoice", "st_purchaseorder"]

 },

 "customRoutes": ["/check", "/checkFileEvidence"],

 "proxyRoutes": [

 ["/hpapaas-passport-be", {

 "json": false,

 "target": "xxx.com"

 }]

 ]

}

## [](#2-全局配置)2. 全局配置

专属化配置方法《项目级配置文件-项目级全局配置》

### [](#21-公共配置项)2.1. 公共配置项

||属性||值||描述||备注|
||scrollBarStyle||width||滚动条宽度|||
||loadMetaAdvance||true/false/['xxx']||先请求meta再请求数据|||
||alertDurationTime||1||提示信息时长||单位(s)|
||leftPanelWorkflow||true/false||审批流支持全局配置侧滑|||
||emptyTableHeight||180||表格空数据高度||单位(px)|
||formLayout||true/false||响应式布局||原有feature属性formLayout|
||referAutoInputFocus||true/false||参照打开自动聚焦查询区||boolean|
||asyncSaveSubTabNum||number||异步保存大于N条开启，配合asyncSave|||
||mergeBillDataTranstype||true/false||是否把billData中的transtype传到下游单据中||boolean|
||anchorFixedOpen||true/false||锚点交互 false为浮动效果||boolean|
||withOutExtTranstype||true/false||meta接口传transtype不传extTranstype||boolean|
||banCreateCode||[]||按照领域domainKey来禁止自动编码的执行||array:["upu","stock"]|
||afterSortOrFilterClearSelected|||||||
||focusTipsFirstElement|||||||
||bSmartSearch|||||||
||columnSetBtnType|||||||
||actionTipled||true/false||表格行按钮平铺展示||废弃|
||showSearchConditions||true/false||查询区显示已选条件|||
||hideFastSaveBtn|||||||
||anchorFixedOpen|||||||
||showBrowseCardBorder||true/false||浏览态卡片显示边框|||
||performance||true/false||是否进行相关相率优化，比如接口请求参数优化||boolean|
||actionTipledInitial||true/false||设置表格行按钮初始时是平铺还是收起，默认是true(平铺)，设置false则是收起显示|||
||addRowAutoScroll||true/false||增行是否滚动到对应的行|||
||enableDeflate||true/false||数据请求是否压缩传输||boolean|

### [](#22-项目级配置)2.2. 项目级配置

配置在globalVars的__DEFINE_STYLE__中，或配置在流水线属性中

||属性||值||描述||备注|
||scrollBarStyle||width||滚动条宽度|||
||loadMetaAdvance||true/false/['xxx']||先请求meta再请求数据|||
||alertDurationTime||1||提示信息时长||单位(s)|
||leftPanelWorkflow||true/false||审批流支持全局配置侧滑|||
||emptyTableHeight||180||表格空数据高度||单位(px)|
||formLayout||true/false||响应式布局||原有feature属性formLayout|
||referAutoInputFocus||true/false||参照打开自动聚焦查询区||boolean|
||asyncSaveSubTabNum||number||异步保存大于N条开启，配合asyncSave|||
||mergeBillDataTranstype||true/false||是否把billData中的transtype传到下游单据中||boolean|
||anchorFixedOpen||true/false||锚点交互 false为浮动效果||boolean|
||withOutExtTranstype||true/false||meta接口传transtype不传extTranstype||boolean|
||banCreateCode||[]||按照领域domainKey来禁止自动编码的执行||array:["upu","stock"]|
||afterSortOrFilterClearSelected|||||||
||focusTipsFirstElement|||||||
||bSmartSearch|||||||
||columnSetBtnType|||||||
||actionTipled||true/false||表格行按钮平铺展示||废弃|
||showSearchConditions||true/false||查询区显示已选条件|||
||hideFastSaveBtn|||||||
||anchorFixedOpen|||||||
||showBrowseCardBorder||true/false||浏览态卡片显示边框|||
||performance||true/false||是否进行相关相率优化，比如接口请求参数优化||boolean|
||actionTipledInitial||true/false||设置表格行按钮初始时是平铺还是收起，默认是true(平铺)，设置false则是收起显示|||
||addRowAutoScroll||true/false||增行是否滚动到对应的行|||
||enableDeflate||true/false||数据请求是否压缩传输||boolean|
||enableXSSFilter||true/false||是否开启xss防护过滤||R6和公有云默认是false，表示全部输入不进行xss过滤，开启开关后将进行xss过滤|

### [](#23-全局特性配置)2.3. 全局特性配置

配置在globalVars的__MDF_FEATURE_CONFIG__

||属性||值||描述||备注|
||checkMergeBatchCheck||true||check合并批量check|||
||checkMergeBatchCheckInterval||2500||check合并触发时间单位：毫秒，默认值2.5秒||1000ms = 1秒|
||workflowSync||[]||审批流开启同步||数组，填入页面billNo，比如['singlestaffchangecar']或'~'|
||workflowFieldCanModify||[]||审批流开启同步，让字段可设置不可编辑||数组，填入页面billNo，比如['singlestaffchangecar']或'~'|
||reAsTplNoCarryData||[]||切换交易类型切换模板后是否携带老数据||数组，填入页面billNo，比如['singlestaffchangecar']或'~'|

"__MDF_FEATURE_CONFIG__": {

 "banFormLayout-": ["st_purchaseorder"],

 "banCreateCode": [""],

 "simplePagination": ["productcenter.pc_nomalproductref"],

 "checkMergeBatchCheckInterval": 2500,

 "checkMergeBatchCheck": ["voucher_order", "voucher_salereturn"]

 }

### [](#24-示例)2.4. 示例

{

 "globalVars": {

 "__DEFINE_STYLE__": {

 "loadMetaAdvance": true

 },

 "__MDF_DOMAIN_CONFIG__": {

 "fiarap_productcenter": "productcenter",

 "fiarap_ucfbasedoc": "basedoccenter",

 "ficm_productcenter": "productcenter",

 "ficm_ucfbasedoc": "basedoccenter",

 "fifa_productcenter": "productcenter",

 "fifa_ucfbasedoc": "basedoccenter",

 "fiia_productcenter": "productcenter",

 "fiia_ucfbasedoc": "basedoccenter",

 "finbd_productcenter": "productcenter",

 "finbd_ucfbasedoc": "basedoccenter",

 "finpub_productcenter": "productcenter",

 "finpub_ucfbasedoc": "basedoccenter",

 "productcenter_ucfbasedoc": "basedoccenter",

 "udinghuo_fidomain": "fiarap",

 "udinghuo_udinghuodomain": "udinghuo",

 "udinghuo_ustockdomain": "ustock",

 "upu_ucfbasedoc": "basedoccenter",

 "upu_yonyoufi": "",

 "ustock_ucfbasedoc": "basedoccenter",

 "ustock_udinghuodomain": "udinghuo",

 "staffcenter_":"basedoccenter",

 "ucf-amc-ambd_yonyoufi": "fifa"

 }

 },

 "DOMAIN_GROUP_CONFIG": {

 "AMC": ["ucf-amc-aum"],

 "GYL": ["upu", "ustock", "udinghuo", "fiarap"]

 },

 "YONUI_YS_CSS_ADDR": "",

 "MDF_RESOURCE_VERSION": "",

 "MDF_MOBILE_RESOURCE_VERSION": "snapshot",

 "tenantConfig": {

 "fa2mozze": {

 	"MDF_RESOURCE_VERSION": "release-2.24",

 	"MDF_MOBILE_RESOURCE_VERSION": "release-2.24"

 }

 },

 "uploadExcludeFileType": [".js", ".jsp", ".jsx", ".ts", ".exe", ".sh"],

 "fontJsVersion": {

 "web": "d1d8622fa983a56ce46b2343fe0de8c6",

 "mobile": "64c3de2a46ca7bb51cb243d9125f1701"

 },

 "domainKey2ApplicationCode": {

 "sact": "SACT",

 "basedoccenter": "GZTBDM",

 "engineeringdata": "ED",

 "eventcenter": "GZTSYS",

 "fiarap": "AP",

 "ficc": "CC",

 "ficm": "CM",

 "fifa": "FA",

 "fiia": "IA",

 "fiit": "IT",

 "fima": "MA",

 "finbd": "FP",

 "fipcm": "PCM",

 "fisc": "SC",

 "hrcloud-contract": "HRCM",

 "hrcloud-staffing": "HRSM",

 "hrrecruit": "HRZP",

 "mddhr": "HRORG",

 "oms": "SDOC",

 "orgcenter": "GZTORG",

 "pricecenter": "GZTBDM",

 "productionorder": "PO",

 "requirementsplanning": "MR",

 "retail": "RM",

 "sact": "SACT",

 "staffcenter": "GZTORG",

 "u8c-authority": "GZTACT",

 "ucf-amc": "EMM",

 "ucf-amc-aim": "AIM",

 "ucf-amc-ambd": "AMBD",

 "ucf-amc-aum": "AUM",

 "udinghuo": "SCMSA",

 "udm": "SDMB",

 "uhy": "SDDC",

 "uit": "UIT",

 "umall": "SDMA",

 "upromotion": "PMC",

 "upu": "PU",

 "userdefine": "GZTBDM",

 "ustock": "ST",

 "yssupplier": "GZTBDM",

 "yycrm": "CRMC"

 }

}

关于cb.extend.features的配置属于全局访问的对象cb.extend.features相关配置文件是consul里的common文件下的features

## [](#3-yms配置)3. YMS配置

MDF服务支持在YMS控制台配置的属性有以下几个

### [](#31-基础全局公共配置项)3.1. 基础全局公共配置项

- BMAP_KEY 百度地图AK

### [](#32-mdf服务配置项)3.2. MDF服务配置项

- **VALID_ORIGIN:** 允许访问的域名，多个用「,」逗号分割，如：xxx.xxx.com,yyy.yyy.com:9001
- **PREFIX:** 请求上下文，如：mdf-node（不推荐修改）
- **LOG_LEVEL:** 日志级别，默认ERROR（ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL < MARK < OFF）
- **CLOSE_REDIS:** 关闭Redis
- **TIMEOUT:** 超时时间，单位ms，默认60000ms，影响所有领域所有请求
- **LOG_UPPER_SIZE:** 上行流量大于多少M数据传输打日志，值为整数，默认3，代表大于3M打ERROR日志
- **LOG_LOWER_SIZE:** 下行流量大于多少M数据传输打日志，值为整数，默认8，代表大于8M打ERROR日志

### [](#33-单据级配置)3.3. 单据级配置

- 《MDF特性单据级控制》

## [](#4-推荐文档)4. 推荐文档

- 《MDF谷歌调试插件》
- 《MDF框架实施手册》