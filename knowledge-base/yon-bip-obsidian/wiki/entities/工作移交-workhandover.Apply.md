---
tags: ["BIP", "元数据", "数据字典", "ycBase", "workhandover.workhandover.Apply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 工作移交 (`workhandover.workhandover.Apply`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_workhandover_apply` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `workhandover.workhandover.Apply` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作移交 |
| 物理表 | `cpu_workhandover_apply` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycBase` |
| 业务对象ID | `7df08e44-fb26-4cae-b984-668ab3c645a9` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:57.6000` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 单据号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:30:36:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202512181409_metadata_workhandover-workhandover_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `02b746c5-410a-4b9d-aebd-6ebeb2059385`

## 业务场景

- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `report`
- `billcode`
- `userdefine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 2 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 6 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 7 | 审批提交信息 (`ISubmitInfo`) | `ucfbase.ucfbaseItf.ISubmitInfo` | 85 | 4 |

---

## 直接属性（共 54 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 单据号 | `code` | String | `text` |  | ✓ |
| 2 | `org` | 申请组织 | `org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |  | ✓ |
| 3 | `ower` | 负责人 | `ower` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 4 | `dept` | 部门 | `dept` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |  | ✓ |
| 5 | `handoverDate` | 移交日期 | `handover_date` | DateTime | `timestamp` |  | ✓ |
| 6 | `oldOwner` | 移交人 | `old_owner` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 7 | `newOwner` | 接受人 | `new_owner` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 8 | `oldOwnerOrg` | 移交组织 | `old_owner_org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |  | ✓ |
| 9 | `newOwnerOrg` | 接受组织 | `new_owner_org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |  | ✓ |
| 10 | `oldOwnerDept` | 移交部门 | `old_owner_dept` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |  | ✓ |
| 11 | `newOwnerDept` | 接受部门 | `new_owner_dept` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |  | ✓ |
| 12 | `handoverReason` | 移交原因 | `handover_reason` | String | `text` |  | ✓ |
| 13 | `handOverMode` | 移交方式 | `handover_mode` | String | `text` |  | ✓ |
| 14 | `calcStatus` | 移交计算状态 | `calc_status` | String | `text` |  | ✓ |
| 15 | `createdDetail` | 是否已生成明细 | `created_detail` | String | `text` |  | ✓ |
| 16 | `ownerRange` | 移交人员数据范围 | `owner_range` | String | `text` |  | ✓ |
| 17 | `applyDefineCharacter` | 工作移交自定义项 | `define_character_id` | 04c4a5bb-5f52-4720-8e74-098f94366191 | `UserDefine` |  | ✓ |
| 18 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 19 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 20 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 21 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 22 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 23 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 24 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 28 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 31 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 32 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 33 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 34 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 35 | `submitTime` | 提交时间 | `submit_time` | DateTime | `dateTime` |  | ✓ |
| 36 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 37 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime | `dateTime` |  | ✓ |
| 38 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 39 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 41 | `auctionDetailList` | 竞拍项目明细 | `` | 20025d17-1938-4c1f-b13b-af88792cce44 | `` |  |  |
| 42 | `buyercnDetailList` | 变更协同明细 | `` | d5600feb-f29a-44a3-be14-f5c90c6970ed | `` |  |  |
| 43 | `buyofferDetailList` | 移交询价明细 | `` | f1d8b271-229f-4fc6-a650-f35672a99751 | `` |  |  |
| 44 | `checkpoolDetailList` | 对账事项明细 | `` | 1a5dffd5-3870-4d2a-829e-6c94c394f184 | `` |  |  |
| 45 | `claimDeductionDetailList` | 索赔扣款明细 | `` | 316d5502-dbd4-42d1-bf0a-a97dab609d15 | `` |  |  |
| 46 | `countList` | 移交数量 | `` | cb5d545c-07cf-4617-8468-12e4fca39b16 | `` |  |  |
| 47 | `evaluateSourceDetailList` | 评价表明细 | `` | 217214f1-5769-4668-afc9-3804f31f1af0 | `` |  |  |
| 48 | `evaluateTaskDetailList` | 评价任务明细 | `` | 8a35a1d7-6b95-4f22-9741-6d26d9be51a5 | `` |  |  |
| 49 | `lawbidDetailList` | 采购项目明细 | `` | 4bbaf3e7-bd4f-490e-ac69-69e01e097377 | `` |  |  |
| 50 | `pucheckMaterialDetailList` | 采购对账单物料明细 | `` | a010870c-16b0-4b59-9a4a-3be0393e2406 | `` |  |  |
| 51 | `pucheckbillDetailList` | 采购对账单明细 | `` | 0de3e3e5-539a-416d-a67f-84bb6c684d79 | `` |  |  |
| 52 | `rangeList` | 移交范围 | `` | 803cd2e7-f999-446a-980d-d4cac9505ccc | `` |  |  |
| 53 | `rectificationDetailList` | 问题整改明细 | `` | d5389de3-ab91-4bc0-aa50-f6e1abc98fcc | `` |  |  |
| 54 | `saleauctionDetailList` | 废旧拍卖明细 | `` | 75ec4e61-a113-4c52-9217-5ca43cd9a2a9 | `` |  |  |

---

## 关联属性（共 30 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | `submitter` |  →  |  |  | Service |  |
| 2 | `auctionDetailList` | 竞拍项目明细 | `workhandover.workhandover.ApplyAuctionDetail` | `` | auctionDetailList → workHandOverApplyId | 0..n | true | None |  |
| 3 | `countList` | 移交数量 | `workhandover.workhandover.ApplyCount` | `` | countList → workHandOverApplyId | 0..n | true | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `rectificationDetailList` | 问题整改明细 | `workhandover.workhandover.ApplyRectificationDetail` | `` | rectificationDetailList → workHandOverApplyId | 0..n | true | None |  |
| 7 | `newOwner` | 接受人 | `bd.staff.Staff` | `new_owner` |  →  |  |  | Service |  |
| 8 | `buyercnDetailList` | 变更协同明细 | `workhandover.workhandover.ApplyBuyercnDetail` | `` | buyercnDetailList → workHandOverApplyId | 0..n | true | None |  |
| 9 | `pucheckbillDetailList` | 采购对账单明细 | `workhandover.workhandover.ApplyPucheckbillDetail` | `` | pucheckbillDetailList → workHandOverApplyId | 0..n | true | None |  |
| 10 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | `withdrawpp` |  →  |  |  | Service |  |
| 11 | `rangeList` | 移交范围 | `workhandover.workhandover.ApplyRange` | `` | rangeList → apply | 1..n | true | None |  |
| 12 | `oldOwnerDept` | 移交部门 | `aa.baseorg.DeptMV` | `old_owner_dept` |  →  |  |  | Service |  |
| 13 | `buyofferDetailList` | 移交询价明细 | `workhandover.workhandover.ApplyBuyofferDetail` | `` | buyofferDetailList → workHandOverApplyId | 0..n | true | None |  |
| 14 | `lawbidDetailList` | 采购项目明细 | `workhandover.workhandover.ApplyLawbidDetail` | `` | lawbidDetailList → workHandOverApplyId | 0..n | true | None |  |
| 15 | `saleauctionDetailList` | 废旧拍卖明细 | `workhandover.workhandover.ApplySaleauctionDetail` | `` | saleauctionDetailList → workHandOverApplyId | 0..n | true | None |  |
| 16 | `ower` | 负责人 | `bd.staff.Staff` | `ower` |  →  |  |  | Service |  |
| 17 | `claimDeductionDetailList` | 索赔扣款明细 | `workhandover.workhandover.ApplyClaimDeductionDetail` | `` | claimDeductionDetailList → workHandOverApplyId | 0..n | true | None |  |
| 18 | `oldOwnerOrg` | 移交组织 | `aa.baseorg.OrgMV` | `old_owner_org` |  →  |  |  | Service |  |
| 19 | `pucheckMaterialDetailList` | 采购对账单物料明细 | `workhandover.workhandover.ApplyPucheckMaterialDetail` | `` | pucheckMaterialDetailList → workHandOverApplyId | 0..n | true | None |  |
| 20 | `org` | 申请组织 | `aa.baseorg.OrgMV` | `org` |  →  |  |  | Service |  |
| 21 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 22 | `dept` | 部门 | `aa.baseorg.DeptMV` | `dept` |  →  |  |  | Service |  |
| 23 | `evaluateSourceDetailList` | 评价表明细 | `workhandover.workhandover.ApplyEvaluateSourceDetail` | `` | evaluateSourceDetailList → workHandOverApplyId | 0..n | true | None |  |
| 24 | `evaluateTaskDetailList` | 评价任务明细 | `workhandover.workhandover.ApplyEvaluateTaskDetail` | `` | evaluateTaskDetailList → workHandOverApplyId | 0..n | true | None |  |
| 25 | `applyDefineCharacter` | 工作移交自定义项 | `workhandover.workhandover.ApplyDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 26 | `newOwnerDept` | 接受部门 | `aa.baseorg.DeptMV` | `new_owner_dept` |  →  |  |  | Service |  |
| 27 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 28 | `oldOwner` | 移交人 | `bd.staff.Staff` | `old_owner` |  →  |  |  | Service |  |
| 29 | `newOwnerOrg` | 接受组织 | `aa.baseorg.OrgMV` | `new_owner_org` |  →  |  |  | Service |  |
| 30 | `checkpoolDetailList` | 对账事项明细 | `workhandover.workhandover.ApplyCheckpoolDetail` | `` | checkpoolDetailList → workHandOverApplyId | 0..n | true | None |  |

### Composition（子表）

- **auctionDetailList**: `auctionDetailList` → `workhandover.workhandover.ApplyAuctionDetail` | 0..n
- **countList**: `countList` → `workhandover.workhandover.ApplyCount` | 0..n
- **rectificationDetailList**: `rectificationDetailList` → `workhandover.workhandover.ApplyRectificationDetail` | 0..n
- **buyercnDetailList**: `buyercnDetailList` → `workhandover.workhandover.ApplyBuyercnDetail` | 0..n
- **pucheckbillDetailList**: `pucheckbillDetailList` → `workhandover.workhandover.ApplyPucheckbillDetail` | 0..n
- **rangeList**: `rangeList` → `workhandover.workhandover.ApplyRange` | 1..n
- **buyofferDetailList**: `buyofferDetailList` → `workhandover.workhandover.ApplyBuyofferDetail` | 0..n
- **lawbidDetailList**: `lawbidDetailList` → `workhandover.workhandover.ApplyLawbidDetail` | 0..n
- **saleauctionDetailList**: `saleauctionDetailList` → `workhandover.workhandover.ApplySaleauctionDetail` | 0..n
- **claimDeductionDetailList**: `claimDeductionDetailList` → `workhandover.workhandover.ApplyClaimDeductionDetail` | 0..n
- **pucheckMaterialDetailList**: `pucheckMaterialDetailList` → `workhandover.workhandover.ApplyPucheckMaterialDetail` | 0..n
- **evaluateSourceDetailList**: `evaluateSourceDetailList` → `workhandover.workhandover.ApplyEvaluateSourceDetail` | 0..n
- **evaluateTaskDetailList**: `evaluateTaskDetailList` → `workhandover.workhandover.ApplyEvaluateTaskDetail` | 0..n
- **checkpoolDetailList**: `checkpoolDetailList` → `workhandover.workhandover.ApplyCheckpoolDetail` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `submitter` (提交人) | `base.user.BipUser` | `submitter` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `newOwner` (接受人) | `bd.staff.Staff` | `new_owner` |
| `withdrawpp` (撤回提交的人) | `base.user.BipUser` | `withdrawpp` |
| `oldOwnerDept` (移交部门) | `aa.baseorg.DeptMV` | `old_owner_dept` |
| `ower` (负责人) | `bd.staff.Staff` | `ower` |
| `oldOwnerOrg` (移交组织) | `aa.baseorg.OrgMV` | `old_owner_org` |
| `org` (申请组织) | `aa.baseorg.OrgMV` | `org` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `dept` (部门) | `aa.baseorg.DeptMV` | `dept` |
| `newOwnerDept` (接受部门) | `aa.baseorg.DeptMV` | `new_owner_dept` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `oldOwner` (移交人) | `bd.staff.Staff` | `old_owner` |
| `newOwnerOrg` (接受组织) | `aa.baseorg.OrgMV` | `new_owner_org` |
