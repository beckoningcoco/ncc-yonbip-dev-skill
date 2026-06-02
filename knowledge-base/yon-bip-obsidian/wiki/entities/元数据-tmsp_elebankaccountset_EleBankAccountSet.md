---
tags: [BIP, 元数据, 数据字典, tmsp.elebankaccountset.EleBankAccountSet]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 账户业务范围设置 (`tmsp.elebankaccountset.EleBankAccountSet`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tmsp_elebankaccountset` | 应用: `TMSP`

## 属性（23 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accentity` | accentity | `accentity` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | `quote` |
| 2 | `bankInfo` | bankInfo | `bankInfo` | String | `text` |
| 3 | `contactName` | contact名称 | `contact_name` | String | `text` |
| 4 | `contactPhone` | contactPhone | `contact_phone` | String | `text` |
| 5 | `creditCode` | credit编码 | `credit_code` | String | `text` |
| 6 | `customNo` | customNo | `customNo` | String | `text` |
| 7 | `customNum` | customNum | `customNum` | String | `text` |
| 8 | `customerName` | customer名称 | `customer_name` | String | `text` |
| 9 | `enterpriseBankAccount` | enterpriseBankAccount | `enterprisebankaccount` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 10 | `logout` | logout | `logout` | Boolean | `switch` |
| 11 | `openBill` | openBill | `openBill` | Boolean | `switch` |
| 12 | `openFlag` | openFlag | `openflag` | Boolean | `switch` |
| 13 | `openTicketService` | openTicketService | `openTicketService` | Boolean | `switch` |
| 14 | `signStatus` | signStatus | `signStatus` | tmsp_signstatus | `singleOption` |
| 15 | `tenantId` | tenantID | `tenant_id` | Long | `long` |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 17 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 19 | `id` | ID | `id` | String | `text` |
| 20 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 23 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `creator` -> `base.user.BipUser` () 
- `enterpriseBankAccount` -> `bd.enterprise.OrgFinBankacctVO` () [废]
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `accentity` -> `org.func.FundsOrg` () [废]
