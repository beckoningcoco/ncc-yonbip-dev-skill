---
tags: [BIP, metadata, voucher, SettlementDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售结算自定义项特征实体 (voucher.settlement.SettlementDefineCharacter)

> Platform: BIP V5 | Module: voucher | Table: settlement_character_define | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 销售结算自定义项特征实体 |
| uri | voucher.settlement.SettlementDefineCharacter |
| tableName | settlement_character_define |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 特征基础接口 (ICharacteristcs) | ucfbase.character.ICharacteristcs |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (3)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 2 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 3 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
