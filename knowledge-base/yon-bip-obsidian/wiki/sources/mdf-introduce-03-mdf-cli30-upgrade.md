---
title: "MDF 3.0脚手架升级指南"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mdf-cli30-upgrade"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# MDF 3.0脚手架升级指南

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mdf-cli30-upgrade | 所属：介绍

# [](#mdf-30脚手架升级指南)MDF 3.0脚手架升级指南

## [](#1-写在前面)1. 写在前面

- MDF服务升级到1130或1230基线的最新版本

安装补丁：YonBIP202111_patch_QP_20211228-1-902_sPaaS--iuap-mdf-node

## [](#2-升级脚手架)2. 升级脚手架

### [](#21-替换envjson文件)2.1. 替换env.json文件

main_origin为当前环境的业务中台域名，domainKey为当前服务的domainKey（引擎名称），示例如下：

{

 "default": {

 "base_url": "http://127.0.0.1:8080",

 "main_origin": "https://xxx.xxx.com"

 },

 "daily": {

 "base_url": "http://127.0.0.1:8080",

 "main_origin": "https://xxx.xxx.com"

 },

 "test": {

 "base_url": "http://127.0.0.1:8080",

 "main_origin": "https://xxx.xxx.com"

 },

 "pre": {

 "base_url": "http://127.0.0.1:8080",

 "main_origin": "https://xxx.xxx.com"

 },

 "prod": {

 "base_url": "http://127.0.0.1:8080",

 "main_origin": "https://xxx.xxx.com"

 },

 "domainKey": "xxx"

}

### [](#22-替换configenvjs文件)2.2. 替换config.env.js文件

/**

 * 1. 全局配置的环境变量

 * 2. 根据不同的环境，配置地址

 * 3. 统一Node时server、static信息来自于每次请求时，中间件分析得到的后台地址和前端静态资源地址

 */

const envConfigInfo = require('../../env.json');

export default ({ config, server } = {}) => {

 let baseUrl = ''; // 后端服务地址-统一Node时不需要、独立Node时必输

 let mainOrigin = '' // 主站域名-默认为当前域名

 let workflowUrl = ''; // 审批url

 let mobileWorkflowUrl = ''; // 移动端审批url

 let contractUrl = ''; // 合同条款url

 let contractServerUrl = ''; // 合同条款后端url

 let printUrl = ''; // 领域打印服务url

 let printUrlStd = ''; // 标准打印服务url

 let fileUrl = ''; // 附件url

 let ecSuiteUrl = ''; // 协同套件地址

 let langServiceUrl = ''; // 多语服务url

 let reportUrl = ''; // 报表服务url

 let tplServerUrl = '';// UI模板服务url

 let nodeServerUrl = '' // 统一Node服务url

 let mscollectUrl = 'https://mscollect.yonyoucloud.com'; // 哈勃Hubble前端埋点上报url

 let defaultSentryDSN = 'https://af682580b95f4c378db677fc383cac80@sentry.yonyoucloud.com/2' // sentry监控

 const configEnv = process.env.SERVER_ENV;

 switch (configEnv) { // 根据当前环境类型定义不同变量值

 case 'test':

 baseUrl = envConfigInfo.default['base_url']; // NOSONAR

 mainOrigin = envConfigInfo.default['main_origin']; // NOSONAR

 break;

 case 'daily':

 baseUrl = envConfigInfo.default['base_url']; // NOSONAR

 mainOrigin = envConfigInfo.default['main_origin']; // NOSONAR

 break;

 case 'pre':

 baseUrl = envConfigInfo.default['base_url'];

 mainOrigin = envConfigInfo.default['main_origin']; // NOSONAR

 break;

 case 'prod':

 baseUrl = envConfigInfo.default['base_url'];

 mainOrigin = envConfigInfo.default['main_origin']; // NOSONAR

 break;

 case 'premises':

 baseUrl = '${pom.workbench.domain_out}'

 defaultSentryDSN = ''

 mscollectUrl = process.env.hubble_collect_url;

 break;

 }

 

 return {

 EXTEND_OSS_ADDR: `${mainOrigin}/static/mdf`, // NOSONAR

 MDF_OSS_ADDR: `${mainOrigin}/mdf-node`, // NOSONAR

 CACHE_META: process.env.CACHE_META === 'true',

 HTTP_MAIN_ORIGIN: mainOrigin,

 HTTP_SERVICE_BASEURL: server ? server : baseUrl,

 HTTP_PRINT_DATA_SERVERURL: '/bill/getPrintData', // 服务器请求业务数据接口

 HTTP_PRINT_SERVER: printUrl,

 HTTP_PRINT_SERVER_STD: printUrlStd,

 HTTP_WORKFLOW_SERVER: workflowUrl,

 HTTP_MOBILE_WORKFLOW_SERVER: mobileWorkflowUrl,

 HTTP_FILE_SERVER: fileUrl,

 HTTP_COOPERATION_SERVER: ecSuiteUrl,

 HTTP_TPL_SERVER_URL: tplServerUrl,

 HTTP_CONTRACT_SERVER: contractUrl,

 HTTP_ContractWrapper: contractServerUrl,

 HTTP_MSCOLLECT_URL: mscollectUrl,

 domainCode: 'AM', // 工作台领域编码

 HTTP_USER_LOGIN: '/user/authorize',

 USER_LOGIN_PARAMS: {

 username: 'u8c_vip@163.com',

 password: ''

 },

 LANG_SERVERS_CENTRE: langServiceUrl,

 BUSINESS_LOG_SERVER: langServiceUrl,

 HTTP_CONTENT_TYPE: {

 // JSON: 'application/json',

 },

 IS_REDIRECT_LOGIN: true,

 HTTP_REPORT_SERVER_URL: reportUrl,

 NODE_SERVER_URL: nodeServerUrl,

 MDF_RESOURCE_VERSION: process.env.MDF_RESOURCE_VERSION,

 MDF_MOBILE_RESOURCE_VERSION: process.env.MDF_MOBILE_RESOURCE_VERSION,

 SENTRY_DSN: process.env.SENTRY_DSN || defaultSentryDSN,

 GLOBAL_VARS: config?.globalVars || {}, // GET /mdf/resource 接口中会额外设置的全局变量

 SERVER_ENV: configEnv,

 MDF_FONTJS_VERSION: {

 web: 'effc45af7611a55cd699607143b99b67',

 mobile: '4fcfbb28484730c417a6cf4e4c34f60a'

 },

 customRoutes: ['/demo']

 }

}

### [](#23-修改packagejson)2.3. 修改package.json

此处更改需要执行 ynpm install 重新拉取依赖

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDF3jiaoshoujiashengjizhinan_image1.0da37740.png)

### [](#24-修改envjs)2.4. 修改env.js

路径：src/server/middlewarse/env.js

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDF3jiaoshoujiashengjizhinan_image2.fc027a74.png)

### [](#25-修改indexjs)2.5. 修改index.js

路径：src/server/middlewares/viewhook/index.js

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDF3jiaoshoujiashengjizhinan_image3.e793cd43.png)