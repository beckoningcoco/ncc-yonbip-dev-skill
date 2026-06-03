---
tags: [BIP, metadata, voucher, SaleReturnDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退货单自定义项特征实体 (voucher.salereturn.SaleReturnDefineCharacter)

> Platform: BIP V5 | Module: voucher | Table: saleReturn_character_define | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退货单自定义项特征实体 |
| uri | voucher.salereturn.SaleReturnDefineCharacter |
| tableName | saleReturn_character_define |
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

## All Fields (6)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | BM07 | 车牌号 | vcol3 | text | String |  |  |  |
| 2 | BM08 | 司机 | vcol2 | text | String |  |  |  |
| 3 | BM09 | 司机电话 | vcol1 | text | String |  |  |  |
| 4 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 5 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 6 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
