---
tags: [BIP, 元数据, 数据字典, fa.fasettleaccount.AtCheckItemConditionVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产结账检查条件 (`fa.fasettleaccount.AtCheckItemConditionVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_settle_account_check_set` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`e2096533-4310-413d-aedf-f5635d6eb454`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产结账检查条件 |
| 物理表 | `fa_settle_account_check_set` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `check_item_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `error_info` | `error_info` | `errorInfo` | 检查结果具体 |
| `error_info_res_id` | `error_info_res_id` | `errorInfoResId` | 检查结果具体多语 |
| `success_info` | `success_info` | `successInfo` | 检查成功具体 |
| `success_info_res_id` | `success_info_res_id` | `successInfoResId` | 检查成功具体多语 |
| `describe_info` | `describe_info` | `describeInfo` | 检查描述具体 |
| `describe_info_res_id` | `describe_info_res_id` | `describeInfoResId` | 检查描述具体多语 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体对应单据的字段值 |
| `period_code` | `period_code` | `period` | 会计期间对应单据的字段值 |
| `bill_name` | `bill_name` | `billName` | 检查单据名称 |
| `bill_name_res_id` | `bill_name_res_id` | `billNameResId` | 检查单据名称多语 |
| `entity_name` | `entity_name` | `entityName` | 实体对应的name |
| `bean_name` | `bean_name` | `beanName` | 检查对应的bean |
| `check_item_code` | `check_item_code` | `checkItemCode` | 检查项code |
| `service_code` | `service_code` | `serviceCode` | 对应单据卡片的code |
| `menu_code` | `menu_code` | `menuCode` | 对应单据卡片的菜单code |
| `check_sub_item_code` | `check_sub_item_code` | `code` | 检查项编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_item_id` | `check_item_id` | `checkItemId` | 检查项id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
