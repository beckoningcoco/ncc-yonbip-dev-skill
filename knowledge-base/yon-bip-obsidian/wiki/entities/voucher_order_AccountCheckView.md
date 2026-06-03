---
tags: [BIP, metadata, voucher, AccountCheckView]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户往来对账表表体 (voucher.order.AccountCheckView)

> Platform: BIP V5 | Module: voucher | Table:  | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 客户往来对账表表体 |
| uri | voucher.order.AccountCheckView |
| tableName |  |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | ? |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (2)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bodyCharacter | 表体自定义项特征属性组 | bodyCharacter | UserDefine | voucher.order.AccountCheckDefineCharacter |  |  | nullable |
| 2 | id | id | id | quote | voucher.order.AccountCheckListView |  |  | nullable |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | id | id | id | voucher.order.AccountCheckListView |
