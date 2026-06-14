---
tags: [BIP, 元数据, 数据字典, EAR.EAR.BadDebtProvRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 坏账计提规则 (`EAR.EAR.BadDebtProvRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_baddebt_rule` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`852b388a-5a78-40ff-870d-e75cc3a6f1af`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 坏账计提规则 |
| 物理表 | `arap_baddebt_rule` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `acc_age_id` | `fiepub.fiepub_accountageref` |
| `ytenant_id` | `` |
| `create_finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |

## 继承接口 (4个, 7字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_code` | `rule_code` | `code` | 编码 |
| `rule_name` | `rule_name` | `name` | 规则名称 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_finance_org_id` | `create_finance_org_id` | `createFinanceOrg` | 创建组织 |
| `acc_age_id` | `acc_age_id` | `accAge` | 账龄方案 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
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
| `bln_cycle_by_detail` | `bln_cycle_by_detail` | `blnCycleByDetail` | 是否按明细计提 |
| `bln_include_esti` | `bln_include_esti` | `blnIncludeEsti` | 是否包含暂估应收 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `analysis_date` | `analysis_date` | `analysisDate` | 分析日期 |
| `cycle_prov_type` | `cycle_prov_type` | `cycleProvType` | 周期计提方式 |
| `frequency` | `frequency` | `frequency` | 计提频率 |
| `specific_prov_type` | `specific_prov_type` | `specificProvType` | 个别计提方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dimension` | `dimension` | `dimension` | 计提维度 |
