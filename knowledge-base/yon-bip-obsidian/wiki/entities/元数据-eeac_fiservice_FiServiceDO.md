---
tags: [BIP, 元数据, 数据字典, eeac.fiservice.FiServiceDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 财务服务 (`eeac.fiservice.FiServiceDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`eac_fi_service` | domain：`yonbip-fi-eeac` | 应用：`EVNT` | 业务对象ID：`9e42fe9f-1dbb-4484-ab97-e3fd2cd4c349`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 财务服务 |
| 物理表 | `eac_fi_service` |
| 数据库 schema | `yonbip-fi-eeac` |
| 所属应用 | `EVNT` |
| 直连字段 | 34 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `app_id` | `fiepub.fiepub_sourceapplicationref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
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

> 共 34 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `app_code` | `app_code` | `appCode` | 模块编码 |
| `cancel_class` | `cancel_class` | `cancelClass` | 注册取消类 |
| `cancel_persistence_class` | `cancel_persistence_class` | `cancelPersistenceClass` | 注册取消持久化类 |
| `cancel_persistence_uri` | `cancel_persistence_uri` | `cancelPersistenceUri` | 注册取消持久化uri |
| `cancel_sdk_class` | `cancel_sdk_class` | `cancelSdkClass` | 注册sdk取消类 |
| `cancel_sdk_persistence_class` | `cancel_sdk_persistence_class` | `cancelSdkPersistenceClass` | 注册sdk取消持久化类 |
| `cancel_uri` | `cancel_uri` | `cancelUri` | 注册取消uri |
| `code` | `code` | `code` | 编码 |
| `domain_code` | `domain_code` | `domainCode` | 领域 |
| `domain_key` | `domain_key` | `domainKey` | 领域微服务编码 |
| `exec_class` | `exec_class` | `execClass` | 注册执行类 |
| `exec_sdk_class` | `exec_sdk_class` | `execSdkClass` | 注册sdk执行类 |
| `exec_uri` | `exec_uri` | `execUri` | 注册执行uri |
| `interface_type` | `interface_type` | `interfaceType` | 本地调用、rpc调用、 restful |
| `persistence_class` | `persistence_class` | `persistenceClass` | 注册持久化类 |
| `persistence_sdk_class` | `persistence_sdk_class` | `persistenceSdkClass` | 注册sdk持久化类 |
| `persistence_uri` | `persistence_uri` | `persistenceUri` | 注册持久化uri |
| `query_period_status_uri` | `query_period_status_uri` | `queryPeriodStatusUri` | 会计期间是否关账状态查询类 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `app_id` | `app_id` | `appId` | 来源应用id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_std_product` | `bln_std_product` | `blnStdProduct` | 是否为标准产品 |
| `bln_user_def` | `bln_user_def` | `blnUserDef` | 是否自定义 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order_no` | `order_no` | `orderNo` | 序号 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
