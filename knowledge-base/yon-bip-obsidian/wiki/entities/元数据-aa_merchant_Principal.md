---
tags: [BIP, 元数据, 数据字典, aa.merchant.Principal]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 负责人 (`aa.merchant.Principal`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `principal` | 应用: `DPMCUS` | 类型: `Class`

## 属性（10 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `merchantId` | merchantID | `imerchantid` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `merchantApplyRangeId` | merchantApplyRangeID | `merchantapplyrangeid` | b023ebd3-0f7f-4a9a-a28b-32183b1b8022 | `quote` |
| 4 | `professSalesman` | professSalesman | `cprofesssalesman` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 5 | `specialManagementDep` | specialManagementDep | `cspecialmanagementdep` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 6 | `isDefault` | 是否Default | `bdefaultprincipal` | Boolean | `switch` |
| 7 | `principalCharacter` | principalCharacter | `principal_character` | 05ca30c5-63f0-41d0-bdd5-bdd0038dd4d6 | `UserDefine` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 10 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（7 个）

- `principalCharacter` -> `aa.merchant.PrincipalCharacter` ()
- `professSalesman` -> `bd.staff.Staff` ()
- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `merchantApplyRangeId` -> `aa.merchant.MerchantApplyRangeExt` (0..n)
- `specialManagementDep` -> `bd.adminOrg.AdminOrgVO` ()
- `tenant` -> `base.tenant.Tenant` ()
