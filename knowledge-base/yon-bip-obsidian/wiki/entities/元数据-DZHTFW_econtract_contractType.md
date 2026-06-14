---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.contractType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同类型 (`DZHTFW.econtract.contractType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_type` | domain：`iuap-apcom-contract` | 应用：`DZHTFW` | 业务对象ID：`f82bdbf7-cf87-4c16-b8dd-192d992a2949`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同类型 |
| 物理表 | `clm_contract_type` |
| domain/服务域 | `iuap-apcom-contract` |
| schema | `iuap_apcom_contract` |
| 所属应用 | `DZHTFW` |
| 直连字段 | 24 个 |
| 子表 | 2 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `contracttypescopeList` | `DZHTFW.econtract.contracttypescope` | composition |
| `contractType_transTypeIdList` | `DZHTFW.econtract.contractType_transTypeId` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `feature` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `contract_group_id` | `iuap-apcom-contract.contractTypeGroupRef` |
| `trans_type_id` | `transtype.bd_billtyperef` |
| `` | `` |
| `ytenant_id` | `` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |

## 继承接口 (4个, 9字段)

- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
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

> 共 24 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `icon` | `icon` | `icon` | 图标 |
| `outer_sys_id` | `outer_sys_id` | `outerSysId` | 外部系统来源ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `contract_group_id` | `contract_group_id` | `contractGroupId` | 合同分组 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adaptallorgs` | `adaptallorgs` | `adaptallorgs` | 适配所有组织 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `i_order` | `i_order` | `iOrder` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `remark` | `remark` | `remark` | 说明 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `trans_type_id` | `trans_type_id` | `transTypeId` | 交易类型 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feature` | `feature` | `feature` | 自定义特征 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `contracttypescopeList` | 合同类型适用组织 |
| `` | `` | `contractType_transTypeIdList` | 适用交易类型多选引用子实体 |
