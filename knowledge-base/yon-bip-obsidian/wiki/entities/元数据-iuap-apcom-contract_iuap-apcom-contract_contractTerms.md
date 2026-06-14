---
tags: [BIP, 元数据, 数据字典, iuap-apcom-contract.iuap-apcom-contract.contractTerms]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同条款 (`iuap-apcom-contract.iuap-apcom-contract.contractTerms`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`contract_terms` | domain：`iuap-apcom-contract` | 应用：`iuap-apcom-contract` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同条款 |
| 物理表 | `contract_terms` |
| domain/服务域 | `iuap-apcom-contract` |
| schema | `iuap_apcom_contract` |
| 所属应用 | `iuap-apcom-contract` |
| 直连字段 | 27 个 |
| 子表 | 5 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `billContractTermsRecordRollbackList` | `iuap-apcom-contract.iuap-apcom-contract.billContractTermsRecordRollback` | composition |
| `billContractTermsRecordList` | `iuap-apcom-contract.iuap-apcom-contract.billContractTermsRecord` | composition |
| `contractTermsVersionList` | `iuap-apcom-contract.iuap-apcom-contract.contractTermsVersion` | composition |
| `contractTermsVariableList` | `iuap-apcom-contract.iuap-apcom-contract.contractTermsVariable` | composition |
| `contractTermsAreaList` | `iuap-apcom-contract.iuap-apcom-contract.contractTermsArea` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `creater` | `bip-usercenter.bip_user_ref` |
| `tenant_id` | `` |
| `ytenant_id` | `` |
| `category_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `default_value` | `default_value` | `defaultValue` | 默认值 |
| `id` | `id` | `id` | 主键id |
| `key_word` | `key_word` | `keyWord` | 关键字 |
| `remark` | `remark` | `remark` | 备注 |
| `term_name` | `term_name` | `termName` | 条款名称 |
| `term_name2` | `term_name2` | `termName2` | 条款英文名 |
| `term_name3` | `term_name3` | `termName3` | 条款繁体名 |
| `term_name4` | `term_name4` | `termName4` | 保留名称1 |
| `term_name5` | `term_name5` | `termName5` | 保留名称2 |
| `term_name6` | `term_name6` | `termName6` | 保留名称3 |
| `term_num` | `term_num` | `termNum` | 条款编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `category_id` | `category_id` | `categoryId` | 分类ID |
| `creater` | `creater` | `creater` | 创建人 |
| `org_id` | `org_id` | `orgId` | 组织id |
| `tenant_id` | `tenant_id` | `tenantId` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `ts` | `ts` | `ts` | 时间戳 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除标记 |
| `term_status` | `term_status` | `termStatus` | 条款状态 |
| `type` | `type` | `type` | 类型 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `billContractTermsRecordList` | 表单条款绑定表 |
| `` | `` | `billContractTermsRecordRollbackList` | 合同条款单据关系记录备份表 |
| `` | `` | `contractTermsAreaList` | 条款动静态区表 |
| `` | `` | `contractTermsVariableList` | 条款变量 |
| `` | `` | `contractTermsVersionList` | 条款版本号标识表 |

### multiLineText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_content` | `term_content` | `termContent` | 条款内容 |
