---
tags: ["BIP", "元数据", "数据字典", "ycQualityCollaboration", "puchangeCollab.buyerCn.CpuBuyerCnVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购方产品变更信息 (`puchangeCollab.buyerCn.CpuBuyerCnVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycQualityCollaboration 模块实体元数据字典。
> 物理表：`cpu_buyercn` | 所属应用：`ycQualityCollaboration`
> 来源：元数据API `queryByUri` 返回的 `puchangeCollab.buyerCn.CpuBuyerCnVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购方产品变更信息 |
| 物理表 | `cpu_buyercn` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycQualityCollaboration` |
| 业务对象ID | `101c29e6-3811-4e42-9c85-79596b1d410c` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:27.7510` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:38:30:000
- **安装来源**: `/app/data_scripts/src/cpu-synergy-server/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-synergy/0010_iuap_common/DML/0270_iuap_metadata/202604/202604201718_metadata_puchangeCollab-buyerCn_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `b3b96b79-6509-458a-b6bb-72c6b0a877e9`

## 业务场景

- `dataMultilanguage`
- `print`
- `workflow`
- `UITemplate`
- `imextmp`
- `transtype`
- `billcode`
- `ruleengine`
- `userdefine`
- `msgtemplate`
- `bpm`
- `prewarning`

## 术语标记

`BusinessData`, `data_auth`, `doc`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 9 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 3 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 4 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 5 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 6 | 审批提交信息 (`ISubmitInfo`) | `ucfbase.ucfbaseItf.ISubmitInfo` | 85 | 4 |
| 7 | 打印次数 (`IPrintCount`) | `base.itf.IPrintCount` | 66 | 1 |
| 8 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 9 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 60 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `CpuBuyerCnBodyVO` | 变更协同表体信息 | `` | bcfacaf6-11fd-4e58-893c-14aae3666c8c | `` |  |  |
| 2 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 3 | `tittle` | 变更标题 | `tittle` | String | `text` |  | ✓ |
| 4 | `orgId` | 采购组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 5 | `transtypeId` | 交易类型ID | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 6 | `collaborativeProcesse` | 协同流程 | `collaborative_processe` | Short | `short` |  | ✓ |
| 7 | `initiatorType` | 发起方 | `initiator_type` | Short | `short` |  | ✓ |
| 8 | `changeMode` | 变更模式 | `change_mode` | Short | `short` |  | ✓ |
| 9 | `isNeedCollab` | 是否与供应商协同 | `isneed_collab` | Short | `short` |  | ✓ |
| 10 | `billStatus` | 单据状态 | `bill_status` | Short | `short` |  | ✓ |
| 11 | `collabStatus` | 协同状态 | `collab_status` | Short | `short` |  | ✓ |
| 12 | `buyerRemark` | 采购商备注 | `buyer_remark` | String | `text` |  | ✓ |
| 13 | `supplierRemark` | 供应商备注 | `supplier_remark` | String | `text` |  | ✓ |
| 14 | `buyerAttachmentId` | 采购商附件 | `buyer_attachment_id` | String | `attachment` |  | ✓ |
| 15 | `supplierAttachmentId` | 供应商附件 | `supplier_attachment_id` | String | `attachment` |  | ✓ |
| 16 | `confirmReuslt` | 确认结果 | `confirm_result` | String | `text` |  | ✓ |
| 17 | `refusalReason` | 拒绝理由 | `refusal_reason` | String | `text` |  | ✓ |
| 18 | `expectedChangeDate` | 生效日期 | `expected_change_date` | DateTime | `timestamp` |  | ✓ |
| 19 | `finalChangeDate` | 失效日期 | `final_change_date` | DateTime | `timestamp` |  | ✓ |
| 20 | `changePurpose` | 变更目的 | `change_purpose` | String | `text` |  | ✓ |
| 21 | `changeReason` | 变更原因 | `change_reason` | String | `text` |  | ✓ |
| 22 | `changeDescription` | 变更内容 | `change_description` | String | `text` |  | ✓ |
| 23 | `changeImpact` | 变更影响 | `change_impact` | Short | `short` |  | ✓ |
| 24 | `changeType` | 变更类型 | `change_type` | Short | `short` |  | ✓ |
| 25 | `beforeChange` | 变更前情况 | `before_change` | String | `text` |  | ✓ |
| 26 | `afterChange` | 变更后情况 | `after_change` | String | `text` |  | ✓ |
| 27 | `dealPsnId` | 处理人ID | `deal_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 28 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` |  | ✓ |
| 29 | `applicantId` | 申请人ID | `applicant_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 30 | `cpuBuyerCnDefineCtId` | 变更协同自定义项特征组ID | `cpu_buyer_cn_define_ct_id` | 3371e007-03e9-4083-83b9-2c7e7bea0896 | `UserDefine` |  | ✓ |
| 31 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 32 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 33 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 34 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 35 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 36 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 37 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 38 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 39 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 40 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 41 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 42 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 43 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 44 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 45 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 46 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 47 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 48 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 49 | `submitTime` | 提交时间 | `submit_time` | DateTime | `dateTime` |  | ✓ |
| 50 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 51 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime | `dateTime` |  | ✓ |
| 52 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 53 | `printCount` | 打印次数 | `printCount` | Integer | `int` |  | ✓ |
| 54 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 55 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 56 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 57 | `closePrevBillStatus` | 关闭前单据状态 | `close_prev_billStatus` | Short | `short` |  | ✓ |
| 58 | `feedbackdate` | 要求反馈时间 | `feedbackdate` | DateTime | `timestamp` |  | ✓ |
| 59 | `supApplicantName` | 供方申请人 | `sup_applicant_name` | String | `text` |  | ✓ |
| 60 | `supCode` | 供方单据编码 | `sup_code` | String | `text` |  | ✓ |

---

## 关联属性（共 13 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | `submitter` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `CpuBuyerCnBodyVO` | 变更协同表体信息 | `puchangeCollab.buyerCn.CpuBuyerCnBodyVO` | `` | CpuBuyerCnBodyVO → cnId | 1..n | true | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 7 | `dealPsnId` | 处理人ID | `bd.staff.Staff` | `deal_psn_id` |  →  |  |  | Service |  |
| 8 | `orgId` | 采购组织ID | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |
| 9 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 10 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | `withdrawpp` |  →  |  |  | Service |  |
| 11 | `applicantId` | 申请人ID | `bd.staff.Staff` | `applicant_id` |  →  |  |  | Service |  |
| 12 | `transtypeId` | 交易类型ID | `bd.bill.TransType` | `transtype_id` |  →  |  |  | Service |  |
| 13 | `cpuBuyerCnDefineCtId` | 变更协同自定义项特征组ID | `puchangeCollab.buyerCn.CpuBuyerCnDefineCt` | `cpu_buyer_cn_define_ct_id` |  →  |  |  | None |  |

### Composition（子表）

- **CpuBuyerCnBodyVO**: `CpuBuyerCnBodyVO` → `puchangeCollab.buyerCn.CpuBuyerCnBodyVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `submitter` (提交人) | `base.user.BipUser` | `submitter` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `dealPsnId` (处理人ID) | `bd.staff.Staff` | `deal_psn_id` |
| `orgId` (采购组织ID) | `org.func.BaseOrg` | `org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `withdrawpp` (撤回提交的人) | `base.user.BipUser` | `withdrawpp` |
| `applicantId` (申请人ID) | `bd.staff.Staff` | `applicant_id` |
| `transtypeId` (交易类型ID) | `bd.bill.TransType` | `transtype_id` |
