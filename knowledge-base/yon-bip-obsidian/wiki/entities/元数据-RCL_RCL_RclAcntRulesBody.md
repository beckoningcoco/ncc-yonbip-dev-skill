---
tags: [BIP, 元数据, 数据字典, RCL.RCL.RclAcntRulesBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收入规则明细信息 (`RCL.RCL.RclAcntRulesBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_acntrules_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`dc2e82e5-19c3-46cf-b569-a7b4515b32fc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收入规则明细信息 |
| 物理表 | `rcl_acntrules_b` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 48 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `RclAcntRulesBody_revenueRulesTagList` | `RCL.RCL.RclAcntRulesBody_revenueRulesTag` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `rclacntrulesheader_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `defer_revenue_rule` | `fiepub.fiepub_income_confirm_ref` |
| `` | `` |
| `prepaid_income_rule` | `fiepub.fiepub_income_confirm_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `receiveable_rule` | `fiepub.fiepub_receivable_confirm_ref` |
| `revenue_rules_tag` | `fiepub.fiepub_income_confirm_ref` |

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

> 共 48 个直连字段

### 文本字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `class_type_name1` | `class_type_name1` | `classTypeName1` | 影响因素名称1 |
| `class_type_name10` | `class_type_name10` | `classTypeName10` | 影响因素类型10 |
| `class_type_name2` | `class_type_name2` | `classTypeName2` | 影响因素类型2 |
| `class_type_name3` | `class_type_name3` | `classTypeName3` | 影响因素类型3 |
| `class_type_name4` | `class_type_name4` | `classTypeName4` | 影响因素类型4 |
| `class_type_name5` | `class_type_name5` | `classTypeName5` | 影响因素类型5 |
| `class_type_name6` | `class_type_name6` | `classTypeName6` | 影响因素类型6 |
| `class_type_name7` | `class_type_name7` | `classTypeName7` | 影响因素类型7 |
| `class_type_name8` | `class_type_name8` | `classTypeName8` | 影响因素类型8 |
| `class_type_name9` | `class_type_name9` | `classTypeName9` | 影响因素类型9 |
| `class_type_refer1` | `class_type_refer1` | `classTypeRefer1` | 影响因素参照1 |
| `class_type_refer10` | `class_type_refer10` | `classTypeRefer10` | 影响因素参照10 |
| `class_type_refer2` | `class_type_refer2` | `classTypeRefer2` | 影响因素参照2 |
| `class_type_refer3` | `class_type_refer3` | `classTypeRefer3` | 影响因素参照3 |
| `class_type_refer4` | `class_type_refer4` | `classTypeRefer4` | 影响因素参照4 |
| `class_type_refer5` | `class_type_refer5` | `classTypeRefer5` | 影响因素参照5 |
| `class_type_refer6` | `class_type_refer6` | `classTypeRefer6` | 影响因素参照6 |
| `class_type_refer7` | `class_type_refer7` | `classTypeRefer7` | 影响因素参照7 |
| `class_type_refer8` | `class_type_refer8` | `classTypeRefer8` | 影响因素参照8 |
| `class_type_refer9` | `class_type_refer9` | `classTypeRefer9` | 影响因素参照9 |
| `id` | `id` | `id` | 主键 |
| `influence_factor1` | `influence_factor1` | `influenceFactor1` | 影响因素1 |
| `influence_factor10` | `influence_factor10` | `influenceFactor10` | 影响因素10 |
| `influence_factor2` | `influence_factor2` | `influenceFactor2` | 影响因素2 |
| `influence_factor3` | `influence_factor3` | `influenceFactor3` | 影响因素3 |
| `influence_factor4` | `influence_factor4` | `influenceFactor4` | 影响因素4 |
| `influence_factor5` | `influence_factor5` | `influenceFactor5` | 影响因素5 |
| `influence_factor6` | `influence_factor6` | `influenceFactor6` | 影响因素6 |
| `influence_factor7` | `influence_factor7` | `influenceFactor7` | 影响因素7 |
| `influence_factor8` | `influence_factor8` | `influenceFactor8` | 影响因素8 |
| `influence_factor9` | `influence_factor9` | `influenceFactor9` | 影响因素9 |
| `receiveable_rules_tag` | `receiveable_rules_tag` | `receiveableRulesTag` | 应收确认规则组 |
| `rule_serial_num` | `rule_serial_num` | `ruleSerialNum` | 规则序号 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `defer_revenue_rule` | `defer_revenue_rule` | `deferRevenueRule` | 递延收入确认规则 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `prepaid_income_rule` | `prepaid_income_rule` | `prepaidIncomeRule` | 预提收入规则 |
| `rclacntrulesheader_id` | `rclacntrulesheader_id` | `rclAcntRulesHeaderid` | 收入规则基本信息 |
| `receiveable_rule` | `receiveable_rule` | `receiveableRule` | 应收确认规则 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_system` | `bln_system` | `blnSystem` | 系统预置 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `RclAcntRulesBody_revenueRulesTagList` | 收入确认规则 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `revenue_rules_tag` | `revenue_rules_tag` | `revenueRulesTag` | 收入确认规则组 |
