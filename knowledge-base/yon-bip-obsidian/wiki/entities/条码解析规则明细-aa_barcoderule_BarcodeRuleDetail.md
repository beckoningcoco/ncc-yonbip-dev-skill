---
tags: ["BIP", "元数据", "数据字典", "BCD", "aa.barcoderule.BarcodeRuleDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 条码解析规则明细 (`aa.barcoderule.BarcodeRuleDetail`)

> BCD | 物理表：`aa_barcoderuledetail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条码解析规则明细 |
| 物理表 | `aa_barcoderuledetail` |
| 数据库 schema | `uscmpub` |
| 所属应用 | `BCD` |
| 构建时间 | `2026-06-04 23:34:29.7130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `iRuleID` | iRuleID | `iRuleID` | da284ef8-bbf6-4ba0-bb45-53214bad75a4 |
| 2 | `lineno` | 行号 | `lineno` | Decimal |
| 3 | `cRuleType` | 解析类型id | `cRuleType` | 3cc8ac53-8ed0-44f3-b00f-e33b1fc73703 |
| 4 | `cprefixseedFormat` | 流水依据格式 | `cprefixseed_format` | String |
| 5 | `isconstituent` | 是否构成项 | `isconstituent` | Short |
| 6 | `generateRule` | 生码规则 | `generate_rule` | String |
| 7 | `parseRule` | 解析规则 | `parse_rule` | String |
| 8 | `extractionMethod` | 截取方式 | `extractionmethod` | String |
| 9 | `extractStart` | 截取起始位 | `extractstart` | String |
| 10 | `extractLength` | 截取长度 | `extractlength` | String |
| 11 | `overlengthMethod` | 超长截断方式 | `overlengthmethod` | String |
| 12 | `padMethod` | 补位方式 | `padmethod` | String |
| 13 | `paddingChar` | 补位符号 | `paddingchar` | String |
| 14 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `iPosition` | 起始位置 | `iPosition` | Short |
| 17 | `iLength` | 长度 | `iLength` | Short |
| 18 | `relevant` | 相关值 | `relevant` | String |
| 19 | `format` | 格式 | `format` | Short |
| 20 | `character` | 特征 | `character` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `id` | ID | `id` | Long |
| 23 | `iDigit` | 小数位 | `iDigit` | Short |
| 24 | `cprefixseed` | 流水依据 | `cprefixseed` | Boolean |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `character` | 特征 | `base.character.Character` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `cRuleType` | 解析类型id | `aa.barcoderule.BarcodeRuleAnalysis` | None |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 5 | `iRuleID` | iRuleID | `aa.barcoderule.BarcodeRule` | None | true |
