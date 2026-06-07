---
title: "参照协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g02-spec-refer"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 参照协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g02-spec-refer | 所属：YNF-协议

# [](#参照协议)参照协议

## [](#功能概述)功能概述

- 复杂数据选择控件, 用于数据引用, 如员工选择、部门选择等。
- controlType: ReferInput；libCode: ynf-fw-apcom-lib

## [](#单选参照)单选参照:

### [](#参照协议-1)参照协议

"store": "mobx://rootStore.formStore", // 主实体对应的store

 "storeField": "adminOrgVO", // 参照元数据字段编码

 "selectType": "single", // 单选/多选参照的标记, 多选为multiple

 "refCode": "ucf-org-center.bd_adminorgtreeref", // 参照编码

 "pageStore": "mobx://rootStore.pageStore", // rootStore.pageStore 组件内需要使用的页面信息存储对象

 "refEntityUri": "bd.adminOrg.AdminOrgVO", // 参照对应的实体uri

 "refReturn": [ // 参照显示字段。后续标准为数组

 "name"

 ],

 "refReturnArr": "{ \"name\": \"formStore,adminOrgVO_name\" , \"id\": \"formStore,adminOrgVO\" }", // {参照字段: 实体, 实体字段} 参照带入右侧信息，默认为主实体store，storeFiled为参照元数据字段拼上下划线和带入字段编码。id的话直接对应参照元数据字段

### [](#store协议)store协议

{

 "alias": "adminOrgVO", // 主键字段

 "bizType": "quote", // 数据格式

 "caption": "单选部门(系统)id", // 字段名称

 "field": "adminOrgVO", // 数据库查询字段

 "virtualField": false // 是否虚拟字段 和数据源中保持一致，store中实际不起作用。

},

{

 "alias": "adminOrgVO_name", // 显示字段, 对应的name字段上有参照配置信息。前端只需要alias和field，冗余信息是不用的

 "bizType": "quote",

 "cRefType": "ucf-org-center.bd_adminorgtreeref", // 参照编码

 "caption": "单选部门(系统)", 

 "field": "adminOrgVO.name", // 数据库查询字段

 "virtualField": false

}

### [](#数据源协议)数据源协议

{

 "alias": "adminOrgVO", // 参照主键字段 对应的name字段上有参照配置信息，后端导入时需要

 "bizType": "quote", // 数据格式

 "caption": "单选部门(系统)", // 字段名称

 "field": "adminOrgVO", // 数据库查询字段

 "virtualField": false, // 是否虚拟字段

 "refEntityUri": "bd.adminOrg.AdminOrgVO", // 参照对应的实体uri

 "required": false, // 是否必填字段

 "fieldCodeInMeta": "referinput60", // 对应元数据字段编号

 "refReturnArr": "{ \"name\": \"formStore,adminOrgVO_name\" , \"id\": \"formStore,adminOrgVO\" }", // {参照字段: 实体, 实体字段} 参照带入右侧信息，默认为主实体store，storeFiled为参照元数据字段拼上下划线和带入字段编码。id的话直接对应参照元数据字段

 "refReturn": [ // 参照显示字段

 "name"

 ]

},

{

 "alias": "adminOrgVO_name", // 参照显示字段 参照带入时需要添加对应的字段，规则为 元数据字段 + 带入字段

 "bizType": "quote",

 "caption": "单选部门(系统)",

 "field": "adminOrgVO.name",

 "refEntityUri": "bd.adminOrg.AdminOrgVO",

 "virtualField": false

}

## [](#多选参照)多选参照:

### [](#参照协议-2)参照协议

多选参照在数据库中是以子表的形式存储数据的, 将子表与参照的实体字段关联起来, 协议中与单选参照的主要区别在于`refReturnArr`和`dataSourceAlias`字段, 多选参照没有参照带入, 此时`refReturnArr`为子表的字段映射, `dataSourceAlias`为子表的表名。

{

 "store": "mobx://rootStore.formStore",

 "storeField": "org",

 "selectType": "multiple",

 "dataSourceAlias": "lyktest230621001_orgList", // 参照虚拟数据源的alias

 "tableStoreKey": "lyktest230621001_orgListStore", // 参照虚拟store的alias

 "pageStore": "mobx://rootStore.pageStore",

 "refCode": "developplatform.RefTable_153c7e9e85",

 "refEntityUri": "u9c.base.Org",

 "refReturn": [

 "name"

 ],

 "refReturnArr": "{\"id\":\"lyktest230621001_orgListStore,org\",\"name\":\"lyktest230621001_orgListStore,org_name\"}" // {参照字段: 参照虚拟子表store, 参照虚拟子表store字段}

}

### [](#store协议-1)store协议

多选参照在主实体store中只需要记录元数据编码对应的alias信息

{

 "alias": "org",

 "bizType": "quoteList",

 "caption": "多选组织(系统)id",

 "field": "org",

 "virtualField": true

}

### [](#数据源协议-1)数据源协议

{

 "alias": "org",

 "bizType": "quoteList",

 "caption": "多选组织(系统)",

 "field": "org",

 "virtualField": true, 

 "required": false,

 "fieldCodeInMeta": "referinput50",

 "refReturnArr": "{\"id\":\"lyktest230621001_orgListStore,org\",\"name\":\"lyktest230621001_orgListStore,org_name\"}",

 "refReturn": ["name"],

 "refEntityUri": "u9c.base.Org"

}

### [](#多选参照虚拟子表store协议)多选参照虚拟子表store协议

{

 "alias": "lyktest230621001_orgListStore", // 主实体alias + 下划线 + 元数据字段 + ListStore

 "caption": "lyktest230621001_orgStore",

 "controlType": "TableStore",

 "storeType": "TableStore",

 "libCode": "ynf-core-store",

 "type": "entity",

 "fieldsArr": [

 {

 "alias": "fkid_id",

 "bizType": "quote",

 "caption": "外键",

 "field": "fkid.id",

 "refEntityUri": "AT16A74ED605C80007.AT16A74ED605C80007.lyktest230621001", // 对应主实体的uri

 "virtualField": false

 },

 {

 "alias": "fkid",

 "bizType": "quote",

 "caption": "外键",

 "field": "fkid",

 "virtualField": false

 },

 {

 "alias": "createTime",

 "bizType": "dateTime",

 "caption": "创建时间",

 "field": "createTime",

 "virtualField": false

 },

 {

 "alias": "modifyTime",

 "bizType": "dateTime",

 "caption": "修改时间",

 "field": "modifyTime",

 "virtualField": false

 },

 {

 "alias": "creator_userName",

 "bizType": "quote",

 "caption": "创建人",

 "field": "creator.userName",

 "virtualField": false

 },

 {

 "alias": "modifier_userName",

 "bizType": "quote",

 "caption": "修改人",

 "field": "modifier.userName",

 "virtualField": false

 },

 {

 "alias": "id",

 "caption": "id",

 "field": "id",

 "virtualField": false

 },

 {

 "alias": "pubts",

 "bizType": "dateTime",

 "caption": "pubts",

 "field": "pubts",

 "virtualField": false

 },

 {

 "alias": "org",

 "bizType": "quote",

 "caption": "多选组织(系统)id",

 "field": "org",

 "virtualField": false

 },

 {

 "alias": "org_name",

 "field": "org.name",

 "caption": "多选组织(系统)__name临时",

 "bizType": "quote",

 "ideDesignType": "ysmdd",

 "virtualField": true

 }

 ]

}

### [](#多选参照虚拟子表数据源协议)多选参照虚拟子表数据源协议

{

 "alias": "lyktest230621001_orgList", // 主实体alias + 下划线 + 元数据字段 + List

 "caption": "lyktest230621001_org",

 "controlType": "datasource",

 "dataPattern": "TAG", // 类型为TAG

 "type": "entity",

 "uri": "AT16A74ED605C80007.AT16A74ED605C80007.lyktest230621001_org",

 "fieldsArr": [

 {

 "alias": "org_id",

 "bizType": "quote",

 "caption": "多选组织(系统)",

 "field": "org.id",

 "refEntityUri": "u9c.base.Org",

 "virtualField": false,

 },

 {

 "alias": "org",

 "bizType": "quote",

 "caption": "多选组织(系统)",

 "field": "org",

 "virtualField": false

 },

 {

 "alias": "fkid_id",

 "bizType": "quote",

 "caption": "外键",

 "field": "fkid.id",

 "refEntityUri": "AT16A74ED605C80007.AT16A74ED605C80007.lyktest230621001", // 对应主实体的uri

 "virtualField": false

 },

 {

 "alias": "fkid",

 "bizType": "quote",

 "caption": "外键",

 "field": "fkid",

 "virtualField": false

 },

 {

 "alias": "sourceGrandId",

 "bizType": "text",

 "caption": "来源孙表id",

 "field": "sourceGrandId",

 "virtualField": false

 },

 {

 "alias": "firstId",

 "bizType": "text",

 "caption": "来源单据主表id",

 "field": "firstId",

 "virtualField": false

 },

 {

 "alias": "firstChildId",

 "bizType": "text",

 "caption": "来源单据子表id",

 "field": "firstChildId",

 "virtualField": false

 },

 {

 "alias": "firstBusiObj",

 "bizType": "text",

 "caption": "来源业务对象",

 "field": "firstBusiObj",

 "virtualField": false

 },

 {

 "alias": "firstCode",

 "bizType": "text",

 "caption": "来源单据号",

 "field": "firstCode",

 "virtualField": false

 },

 {

 "alias": "bizflowId",

 "bizType": "text",

 "caption": "业务流id",

 "field": "bizflowId",

 "virtualField": false

 },

 {

 "alias": "bizflowName",

 "bizType": "text",

 "caption": "流程名称",

 "field": "bizflowName",

 "virtualField": false

 },

 {

 "alias": "sourceId",

 "bizType": "text",

 "caption": "上游单据主表id",

 "field": "sourceId",

 "virtualField": false

 },

 {

 "alias": "sourceChildId",

 "bizType": "text",

 "caption": "上游单据子表id",

 "field": "sourceChildId",

 "virtualField": false

 },

 {

 "alias": "bizFlowInstanceId",

 "bizType": "text",

 "caption": "业务流实例id",

 "field": "bizFlowInstanceId",

 "virtualField": false

 },

 {

 "alias": "sourceBusiObj",

 "bizType": "text",

 "caption": "上游业务对象",

 "field": "sourceBusiObj",

 "virtualField": false

 },

 {

 "alias": "sourceCode",

 "bizType": "text",

 "caption": "上游单据号",

 "field": "sourceCode",

 "virtualField": false

 },

 {

 "alias": "bizFlowMakeBillCode",

 "bizType": "text",

 "caption": "单据转换规则编码",

 "field": "bizFlowMakeBillCode",

 "virtualField": false

 },

 {

 "alias": "createTime",

 "bizType": "dateTime",

 "caption": "创建时间",

 "field": "createTime",

 "virtualField": false

 },

 {

 "alias": "modifyTime",

 "bizType": "dateTime",

 "caption": "修改时间",

 "field": "modifyTime",

 "virtualField": false

 },

 {

 "alias": "creator_userName",

 "bizType": "quote",

 "caption": "创建人",

 "field": "creator.userName",

 "virtualField": false

 },

 {

 "alias": "modifier_userName",

 "bizType": "quote",

 "caption": "修改人",

 "field": "modifier.userName",

 "virtualField": false

 },

 {

 "alias": "id",

 "caption": "id",

 "field": "id",

 "virtualField": false

 },

 {

 "alias": "pubts",

 "bizType": "dateTime",

 "caption": "pubts",

 "field": "pubts",

 "orderBy": "desc",

 "virtualField": false

 },

 {

 "alias": "org_name",

 "field": "org.name",

 "caption": "多选组织(系统)__name临时",

 "bizType": "quote",

 "virtualField": false

 }

 ]

}