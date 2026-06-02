---
tags: [BIP, 元数据, 数据字典, aa, aa.merchant.Contacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 联系人信息 (`aa.merchant.Contacter`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `contacter` | 应用: `DPMCUS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 联系人信息 |
| 物理表 | `contacter` |
| 应用 | `DPMCUS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `mobile` | `cMobile` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:18:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0002_customer/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202602021528_metadata_aa-merchant.zip`

## 术语标记

`participantFlag`, `isAssigned`, `isExtend`, `MasterData`, `doc`, `DirectConnection`, `AllowBatchModify`, `reportHide`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（27 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `merchantId` | merchantId | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` | false | true |
| 3 | `fullName` | full名称 | `cFullName` | String | `multiLanguage` | false | true |
| 4 | `contacterDefine` | ontacterDefine | `` | 2f4cc5f3-8b04-4d65-a86d-78a59f001acb | `` |  |  |
| 5 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 6 | `gender` | 性别 | `iGender` | GenderType | `` | false | true |
| 7 | `contactDepartment` | ontactDepartment | `contact_department` | String | `text` | false | true |
| 8 | `positionName` | 岗位名称 | `cPositionName` | String | `text` | false | true |
| 9 | `areaCodeMobile` | areaCodeMobile | `area_code_mobile` | String | `text` | false | true |
| 10 | `mobile` | 手机号 | `cMobile` | String | `text` | false | true |
| 11 | `telePhone` | telePhone | `cTelePhone` | String | `text` | false | true |
| 12 | `email` | 邮箱 | `cEmail` | String | `text` | false | true |
| 13 | `qq` | qq | `cQQ` | String | `text` | false | true |
| 14 | `weChat` | weChat | `cWeChat` | String | `text` | false | true |
| 15 | `isDefault` | 是否Default | `bDefaultContact` | Boolean | `switch` | true | false |
| 16 | `stopStatus` | stopStatus(状态) | `stop_status` | String | `text` | false | true |
| 17 | `remarks` | remarks | `cRemarks` | String | `text` | false | true |
| 18 | `contacterCharacter` | ontacterCharacter | `contacter_character` | 79251a6c-9e71-4741-b120-ac38c6429b57 | `UserDefine` | false | true |
| 19 | `orderContact` | orderContact | `cOrderContact` | Boolean | `switch` | false | true |
| 20 | `mallContact` | mallContact | `cMallContact` | Boolean | `switch` | false | true |
| 21 | `custContact` | ustContact | `custContact` | Boolean | `switch` | false | true |
| 22 | `crmContact` | rmContact | `crm_contact` | String | `text` | false | true |
| 23 | `yhtUserId` | yhtUserId | `cyhtUserId` | String | `text` | false | true |
| 24 | `isCreatorYhtUserType` | isCreatorYhtUserType(类型) | `iCreatorYhtUserType` | CreatorYhtUserType | `` | false | true |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 26 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 27 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |

## 关联属性（5 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `merchantId` | merchantId | `aa.merchant.Merchant` | `imerchantId` | merchantContacterInfos → merchantId | 0..n | Y | None |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `contacterCharacter` | ontacterCharacter | `aa.merchant.ContacterCharacter` | `contacter_character` | 外键 |  |  | None |  |
| 4 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |
| 5 | `contacterDefine` | ontacterDefine | `aa.merchant.ContacterDefine` | `` | contacterDefine → id | 1 | Y | None |  |

---

## SQL 示例

```sql
SELECT id, imerchantId, cFullName, erpCode, iGender, contact_department, cPositionName, area_code_mobile
FROM contacter
```