---
tags: [BIP, 元数据, 数据字典, eaai.mergerule.GLMergeRuleDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分录合并规则 (`eaai.mergerule.GLMergeRuleDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aai_gl_merge_rule` | domain：`yonbip-fi-eaai` | 应用：`AAI` | 业务对象ID：`f0b8252c-f1de-442a-bf28-f721575b312a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分录合并规则 |
| 物理表 | `aai_gl_merge_rule` |
| 数据库 schema | `yonbip-fi-eaai` |
| 所属应用 | `AAI` |
| 直连字段 | 28 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `eaai.mergerule.GLMergeRuleBodyDO` | composition |
| `GLMergeRuleEventVoucherDOList` | `eaai.mergerule.GLMergeRuleEventVoucherDO` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `system_regist_id` | `yonbip-fi-eaai.targetIntegratedSystem` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `accbook_type_id` | `fiepub.fiepub_accountbooktypelistref` |
| `ytenant_id` | `` |

## 继承接口 (4个, 9字段)

- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
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

> 共 28 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `summary` | `summary` | String | 固定摘要 |
| `code` | `code` | String | 分录合并规则编码 |
| `def_merge_option` | `def_merge_option` | String | 自定义维度 |
| `direction_sort` | `direction_sort` | String | 同方向排序 |
| `merge_mode` | `merge_mode` | String | 合并方式 |
| `merge_option` | `merge_option` | String | 合并选项 |
| `sort_num` | `sort_num` | String | 凭证分录显示顺序 |
| `system_regist_code` | `system_regist_code` | String | 适用集成系统编码 |
| `social_srcid` | `social_srcid` | String | 社会化来源id |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |
| `id` | `id` | String | 主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accbook_id` | `accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | 账簿 |
| `accbook_type_id` | `accbook_type_id` | 9e073034-63ae-4aba-a113-1b28396f35e6 | 账簿类型 |
| `accentity_id` | `accentity_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | 会计主体 |
| `system_regist_id` | `system_regist_id` | 1efd4012-d0e2-47d8-aa9a-bd8cff0290e0 | 适用集成系统 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bln_default` | `bln_default` | Boolean | 默认规则 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `summary_option` | `summary_option` | summaryOption | 指定摘要 |

### 整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 分录合并规则名称 |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 16829fc5-ed0f-4bb2-9087-1d0824dd8acd | 分录合并规则事项分录子表 |
| `` | `` | e78280e5-4233-40b7-b75f-be96b5544b56 | 分录合并规则子表 |
