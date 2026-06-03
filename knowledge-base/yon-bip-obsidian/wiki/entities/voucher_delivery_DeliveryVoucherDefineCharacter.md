---
tags: [BIP, metadata, voucher, DeliveryVoucherDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发货单自定义项特征实体 (voucher.delivery.DeliveryVoucherDefineCharacter)

> Platform: BIP V5 | Module: voucher | Table: deliveryVoucher_character_define | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发货单自定义项特征实体 |
| uri | voucher.delivery.DeliveryVoucherDefineCharacter |
| tableName | deliveryVoucher_character_define |
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

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | BM07 | 车牌号 | vcol5 | text | String |  |  |  |
| 2 | BM08 | 司机 | vcol4 | text | String |  |  |  |
| 3 | BM09 | 司机电话 | vcol1 | text | String |  |  |  |
| 4 | Debitkh | Debit客户 | lcol1 | quote | aa.merchant.Merchant |  |  |  |
| 5 | XL01 | 部门简码 | vcol2 | text | String |  |  |  |
| 6 | XL02 | 当前年份 | vcol3 | text | String |  |  |  |
| 7 | ZC001 | 船号 | vcol6 | text | String |  |  |  |
| 8 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 9 | ld001_ys | 运输方式 | vcol10 | quote | bd.customerdoc_ld003.ld003 |  |  |  |
| 10 | ld004_ys | 到货地点 | vcol9 | text | String |  |  |  |
| 11 | ld030 | 发运厂 | vcol8 | text | String |  |  |  |
| 12 | lzxqfl001 | 绿洲需求分类 | vcol7 | quote | bd.customerdoc_XQFL.XQFL |  |  |  |
| 13 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 15 | zzyh | 最终用户 | zzyh | referenceList | aa.merchant.Merchant |  |  |  |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | Debitkh | Debit客户 | lcol1 | aa.merchant.Merchant |
| 2 | ld001_ys | 运输方式 | vcol10 | bd.customerdoc_ld003.ld003 |
| 3 | lzxqfl001 | 绿洲需求分类 | vcol7 | bd.customerdoc_XQFL.XQFL |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
