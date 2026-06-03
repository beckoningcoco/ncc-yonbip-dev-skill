---
tags: [BIP, 元数据, 数据字典, eeac.fievent.FiEventDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计事务 (`eeac.fievent.FiEventDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`eac_fi_event` | domain：`yonbip-fi-eeac` | 应用：`EVNT` | 业务对象ID：`a5ab97f9-622b-4324-b08d-cff08fa99aea`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计事务 |
| 物理表 | `eac_fi_event` |
| 数据库 schema | `yonbip-fi-eeac` |
| 所属应用 | `EVNT` |
| 直连字段 | 50 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `eeac.fievent.FiEventSubjectCatDO` | composition |
| `vouchparams` | `eeac.fievent.FiEventVouchParamsDO` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `fi_service_id` | `yonbip-fi-eeac.eeac_fi_service_ref` |
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `fi_event_cat_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 50 个直连字段

### 文本字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_num` | `bill_num` | `billNum` | 供穿透查询时调用UI模板时使用 |
| `busi_obj_meta_uri` | `busi_obj_meta_uri` | `busiObjMetaUri` | 关联业务对象元数据的uri |
| `cancel_class` | `cancel_class` | `cancelClass` | 注册取消类 |
| `cancel_persistence_class` | `cancel_persistence_class` | `cancelPersistenceClass` | 注册取消持久化类 |
| `cancel_persistence_uri` | `cancel_persistence_uri` | `cancelPersistenceUri` | 注册取消持久化uri |
| `cancel_sdk_class` | `cancel_sdk_class` | `cancelSdkClass` | 注册sdk取消类 |
| `cancel_sdk_persistence_class` | `cancel_sdk_persistence_class` | `cancelSdkPersistenceClass` | 注册sdk取消持久化类 |
| `cancel_uri` | `cancel_uri` | `cancelUri` | 注册取消uri |
| `code` | `code` | `code` | 编码 |
| `domain_key` | `domain_key` | `domainKey` | 领域微服务编码 |
| `exec_class` | `exec_class` | `execClass` | 注册执行类 |
| `exec_sdk_class` | `exec_sdk_class` | `execSdkClass` | 注册sdk执行类 |
| `exec_uri` | `exec_uri` | `execUri` | 注册执行uri |
| `gen_voucher_status` | `gen_voucher_status` | `genVoucherStatus` | 生成凭证的状态 |
| `industry_id` | `industry_id` | `industryId` | 所属行业 |
| `interface_type` | `interface_type` | `interfaceType` | 本地调用、rpc调用、 restful |
| `org_type_id` | `org_type_id` | `orgTypeId` | 组织类型 |
| `page_type` | `page_type` | `pageType` | 页面类型 |
| `persistence_class` | `persistence_class` | `persistenceClass` | 注册持久化类 |
| `persistence_sdk_class` | `persistence_sdk_class` | `persistenceSdkClass` | 注册sdk持久化类 |
| `persistence_uri` | `persistence_uri` | `persistenceUri` | 注册持久化uri |
| `posting_date_field` | `posting_date_field` | `postingDateField` | 记账日期字段 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `service_code` | `service_code` | `serviceCode` | 供穿透查询界面展示时使用 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sys_id` | `sys_id` | `sysId` | 关联id |
| `using_status` | `using_status` | `usingStatus` | 使用控制 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fi_event_cat_id` | `fi_event_cat_id` | `fiEventCatId` | 会计事务类别 |
| `fi_service_id` | `fi_service_id` | `fiServiceId` | 财务服务 |
| `parent_id` | `parent_id` | `parent` | 上级 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_copy` | `bln_copy` | `blnCopy` | 允许复制 |
| `bln_invoke_fi_service` | `bln_invoke_fi_service` | `blnInvokeFiService` | 是否调用核算服务 |
| `bln_period_begin` | `bln_period_begin` | `blnPeriodBegin` | 是否为期初类型的会计事务  0:不是  1:是 |
| `bln_preview` | `bln_preview` | `blnPreview` | 允许预览事项分录 |
| `bln_user_def` | `bln_user_def` | `blnUserDef` | 是否自定义 |
| `bln_src_voucher` | `bln_src_voucher` | `blnsrcVoucher` | 会计事务来源是否为凭证 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `sort_num` | `sort_num` | `sortNum` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `vouchparams` | 凭证生成参数 |
| `` | `` | `bodies` | 会计事务科目分类 |
