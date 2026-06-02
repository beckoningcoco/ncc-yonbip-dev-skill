---
tags: [BIP, 元数据, 数据字典, pu.applyorder.ApplyOrder]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 请购单主表 (`pu.applyorder.ApplyOrder`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pu_applyorder` | 应用: `PU`

## 属性（68 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `submitter` | submitter | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 2 | `withdrawTime` | withdrawTime | `withdraw_time` | DateTime | `dateTime` |
| 3 | `withdrawpp` | withdrawpp | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `applyOrderDefineCharacter` | applyOrderDefineCharacter | `applyOrderDefineCharacter` | 5a0e55b2-b7d4-42c7-9843-8e43ed3e9c05 | `UserDefine` |
| 5 | `printCount` | printCount | `printCount` | Integer | `int` |
| 6 | `submitTime` | submitTime | `submitTime` | DateTime | `timestamp` |
| 7 | `beyondBudget` | beyondBudget | `beyondBudget` | Integer | `int` |
| 8 | `closeReason` | closeReason | `close_reason` | String | `text` |
| 9 | `out_sys_code` | out_sys_code | `out_sys_code` | String | `text` |
| 10 | `out_sys_type` | out_sys_type | `out_sys_type` | String | `text` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 12 | `out_sys_id` | out_sys_id | `out_sys_id` | String | `text` |
| 13 | `out_sys_version` | out_sys_version | `out_sys_version` | String | `text` |
| 14 | `submitor` | submitor | `iSubmitor` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 15 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 16 | `customerId` | customerID | `customerId` | 265e9b66-8898-43a6-9a65-0a156c84f0c1 | `quote` |
| 17 | `org` | org | `iOrgId` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 18 | `receiveOrg` | receiveOrg | `iReceiveOrgId` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |
| 19 | `id` | ID | `id` | Long | `long` |
| 20 | `code` | 编码 | `code` | String | `text` |
| 21 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 22 | `bustype` | bustype | `iBusType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 23 | `operator` | operator | `iOperatorId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 24 | `currency` | currency | `iCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 25 | `applyDept` | applyDept | `applyDeptId` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 26 | `warehouseId` | warehouseID | `warehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 27 | `bizstatus` | bizstatus | `bizStatus` | String | `text` |
| 28 | `storeDocumentStatus` | storeDocumentStatus | `storeDocumentStatus` | Integer | `int` |
| 29 | `status` | 状态 | `status` | Short | `short` |
| 30 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 31 | `modifyStatus` | modifyStatus | `modifyStatus` | ApplyModifyStatus | `` |
| 32 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 33 | `returncount` | returncount | `returncount` | Short | `short` |
| 34 | `memo` | 备注 | `cMemo` | String | `text` |
| 35 | `isUretailVoucher` | 是否UretailVoucher | `isUretailVoucher` | Boolean | `switch` |
| 36 | `source` | source | `cSource` | String | `text` |
| 37 | `srcBillNO` | srcBillNO | `cSrcBillNO` | String | `text` |
| 38 | `srcBill` | srcBill | `iSrcBillID` | Long | `long` |
| 39 | `custom` | custom | `iCustomId` | Long | `long` |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 41 | `tplid` | tplid | `tplid` | Long | `long` |
| 42 | `store` | store | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 43 | `totalQuantity` | totalQuantity | `fTotalQuantity` | Decimal | `number` |
| 44 | `bizFlow` | bizFlow | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |
| 45 | `isFlowCoreBill` | 是否FlowCoreBill | `isFlowCoreBill` | Boolean | `switch` |
| 46 | `creator` | 创建人 | `creator` | String | `text` |
| 47 | `locker` | locker | `locker` | String | `text` |
| 48 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 49 | `lockTime` | lockTime | `lock_time` | DateTime | `timestamp` |
| 50 | `createDate` | create日期 | `create_date` | Date | `date` |
| 51 | `lockDate` | lock日期 | `lock_Date` | Date | `date` |
| 52 | `modifier` | 修改人 | `modifier` | String | `text` |
| 53 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 54 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 55 | `closer` | closer | `closer` | String | `text` |
| 56 | `closeTime` | closeTime | `close_time` | DateTime | `timestamp` |
| 57 | `closeDate` | close日期 | `close_Date` | Date | `date` |
| 58 | `auditor` | auditor | `auditor` | String | `text` |
| 59 | `auditTime` | auditTime | `auditTime` | DateTime | `timestamp` |
| 60 | `auditDate` | audit日期 | `audit_date` | Date | `date` |
| 61 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 62 | `lockerId` | lockerID | `lockerId` | String | `text` |
| 63 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 64 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 65 | `closerId` | closerID | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 66 | `applyOrders` | applyOrders | `` | ee3a538b-b943-4914-a16c-2e6b6937f835 | `` |
| 67 | `headFreeItem` | headFreeItem | `` | d3aad78e-3baa-4482-897e-e4d7ffe88f03 | `` |
| 68 | `headItem` | headItem | `` | 534421ad-1c55-4a27-a18d-999a8fa75bfc | `` |

## 关联（23 个）

- `submitter` -> `base.user.BipUser` () 
- `org` -> `aa.baseorg.OrgMV` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `headFreeItem` -> `pu.applyorder.ApplyOrderFreeItem` (1) [废]
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `bizFlow` -> `bf.bizflow.BusinessFlow` () 
- `headItem` -> `pu.applyorder.ApplyOrderCustomItem` (1) [废]
- `store` -> `aa.store.Store` () 
- `bustype` -> `bd.bill.TransType` () 
- `operator` -> `bd.staff.Staff` () 
- `applyDept` -> `bd.adminOrg.AdminOrgVO` () 
- `auditorId` -> `base.user.User` () 
- `withdrawpp` -> `base.user.BipUser` () 
- `warehouseId` -> `aa.warehouse.Warehouse` () 
- `closerId` -> `base.user.User` () 
- `submitor` -> `bd.staff.Staff` () 
- `customerId` -> `aa.agent.Agent` () 
- `receiveOrg` -> `aa.baseorg.InventoryOrgMV` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `applyOrderDefineCharacter` -> `pu.applyorder.NApplyOrderDefineCharacter` () 
- `applyOrders` -> `pu.applyorder.ApplyOrders` (1..n) 
- `tenant` -> `base.tenant.Tenant` () 
