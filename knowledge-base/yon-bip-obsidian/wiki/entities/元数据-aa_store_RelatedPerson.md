---
tags: [BIP, 元数据, 数据字典, aa.store.RelatedPerson]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 相关人员 (`aa.store.RelatedPerson`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_relatedperson` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `store` | store | `iStoreId` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 4 | `saleOrg` | saleOrg | `saleorg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 5 | `person` | person | `person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 6 | `ower` | ower | `ower` | Boolean | `switch` |
| 7 | `cust` | cust | `cust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 8 | `partnerPerson` | partnerPerson | `partner_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 9 | `dept` | dept | `dept` | String | `text` |
| 10 | `partnerDept` | partnerDept | `partner_dept` | b54fc393-1d66-4f6e-806b-c8a50b5e788b | `quote` |
| 11 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `partnerPerson` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `person` -> `bd.staff.Staff` ()
- `store` -> `aa.store.Store` (0..n)
- `partnerDept` -> `cust.custoperateinfo.CustTechnologyDepartment` ()
- `cust` -> `aa.merchant.Merchant` ()
- `saleOrg` -> `org.func.BaseOrg` ()
- `tenant` -> `base.tenant.Tenant` ()
