---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.certification.CertificationApplyDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 认证步骤单据 (`cpu-supplymgr.certification.CertificationApplyDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_certification_apply_detail` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.certification.CertificationApplyDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 认证步骤单据 |
| 物理表 | `cpu_certification_apply_detail` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `8823c441-46ec-4f81-9ee2-175655a4ad2e` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:35.1870` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:43:52:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202512161600_metadata_cpu-supplymgr-certification_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `ff7af01f-827c-408d-9706-1a96304c2b94`

## 业务场景

- `print`
- `workflow`
- `UITemplate`
- `transtype`
- `isCoreBill`
- `userdefine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 2 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 6 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 7 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 70 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyId` | 认证任务ID | `apply_id` | 91f13b22-60f1-48bd-ad2d-34ced143fa91 | `quote` |  | ✓ |
| 2 | `contentId` | 认证内容ID | `content_id` | f9a3f523-fa9a-45e7-9441-9c77b42e219f | `quote` |  | ✓ |
| 3 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 4 | `transTypeName` | 交易类型名称 | `trans_type_name` | String | `text` |  | ✓ |
| 5 | `stepId` | 认证环节ID | `step_id` | 96687e0a-6f12-467d-8211-c39b5c93ccf9 | `quote` |  | ✓ |
| 6 | `templateId` | 认证模板 | `template_id` | 0f1b9f8e-a486-4e1c-a5ee-b4aa7534106f | `quote` |  | ✓ |
| 7 | `templateSource` | 模板来源 | `template_source` | String | `text` |  | ✓ |
| 8 | `director` | 负责人 | `director` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 9 | `startDate` | 预计开始时间 | `start_date` | Date | `date` |  | ✓ |
| 10 | `endDate` | 预计结束时间 | `end_date` | Date | `date` |  | ✓ |
| 11 | `authOrder` | 认证顺序 | `auth_order` | String | `text` |  | ✓ |
| 12 | `authRecord` | 是否有认证记录 | `auth_record` | String | `text` |  | ✓ |
| 13 | `quoteApplyId` | 引用单据 | `quote_apply_id` | 91f13b22-60f1-48bd-ad2d-34ced143fa91 | `quote` |  | ✓ |
| 14 | `quoteContentId` | 引用认证内容 | `quote_content_id` | f9a3f523-fa9a-45e7-9441-9c77b42e219f | `quote` |  | ✓ |
| 15 | `authResult` | 认证结论 | `auth_result` | String | `text` |  | ✓ |
| 16 | `canStop` | 不合格是否可以结束认证 | `can_stop` | String | `text` |  | ✓ |
| 17 | `canReissue` | 是否可以重复发起 | `can_reissue` | String | `text` |  | ✓ |
| 18 | `stepStatus` | 单据状态 | `step_status` | String | `text` |  | ✓ |
| 19 | `syncVendor` | 协同供应商 | `sync_vendor` | String | `text` |  | ✓ |
| 20 | `detailStatus` | 认证步骤状态 | `detail_status` | String | `text` |  | ✓ |
| 21 | `vendorStatus` | 供应商端状态 | `vendor_status` | String | `text` |  | ✓ |
| 22 | `score` | 得分 | `score` | Decimal | `number` |  | ✓ |
| 23 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 24 | `fileId` | 附件 | `file_id` | String | `text` |  | ✓ |
| 25 | `quanTestType` | 量试类型 | `quan_test_type` | String | `text` |  | ✓ |
| 26 | `authStatus` | 认证状态 | `auth_status` | String | `text` |  | ✓ |
| 27 | `version` | 版本号 | `version` | Integer | `int` |  | ✓ |
| 28 | `preStep` | 前置步骤 | `pre_step` | String | `text` |  | ✓ |
| 29 | `userDefineCharacter` | 认证任务明细特征属性 | `user_define_character` | 91e41886-7e39-47bb-8962-4e629c4451f8 | `UserDefine` |  | ✓ |
| 30 | `abilityDetailId` | 判定级别(认证等级) | `ability_detail_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 31 | `receiverName` | 接样人 | `receiver_name` | String | `text` |  | ✓ |
| 32 | `receiverTel` | 接样人电话 | `receiver_tel` | String | `text` |  | ✓ |
| 33 | `sendAddress` | 送样地址 | `send_address` | String | `text` |  | ✓ |
| 34 | `supportingFileId` | 说明文件 | `supporting_fileId` | String | `text` |  | ✓ |
| 35 | `certificationResult` | 认证结果 | `certification_result` | String | `text` |  | ✓ |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 37 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 38 | `rejectReason` | 退回原因 | `reject_reason` | String | `text` |  | ✓ |
| 39 | `objectId` | 认证对象ID | `object_id` | 8c919637-e6f3-408f-9bd7-6b8e406b2ade | `quote` |  | ✓ |
| 40 | `certifyStepStatus` | 评价内容状态 | `certify_step_status` | String | `text` |  | ✓ |
| 41 | `skipReason` | 跳过原因 | `skip_reason` | String | `text` |  | ✓ |
| 42 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 43 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 44 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 45 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 47 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 48 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 49 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 50 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 51 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 52 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 53 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 54 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 55 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 56 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 57 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 58 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 59 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 60 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 61 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 62 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 63 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 64 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 65 | `agreementList` | 认证任务框架协议 | `` | 7064771f-107c-42a4-9759-568359603945 | `` |  |  |
| 66 | `indicatorList` | 认证任务认证信息要求 | `` | 6c81afd5-5f3e-49bb-bbcb-e24794cf54b2 | `` |  |  |
| 67 | `qualifyList` | 认证任务资质证照要求 | `` | 33733d4d-d656-4ef3-9c4d-6650bab302d0 | `` |  |  |
| 68 | `quantityTestList` | 认证任务产品量试 | `` | d4356c03-4851-4cff-a136-825f27754441 | `` |  |  |
| 69 | `sampleList` | 认证信息样品试验 | `` | c6d93947-4108-4355-885b-1d6e6f501007 | `` |  |  |
| 70 | `staffList` | 认证任务参与人员 | `` | 50658510-97a0-4b89-8dcd-53450fb42df3 | `` |  |  |

---

## 关联属性（共 23 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `userDefineCharacter` | 认证任务明细特征属性 | `cpu-supplymgr.certification.CertificationApplyDetailDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `director` | 负责人 | `bd.staff.Staff` | `director` |  →  |  |  | Service |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 6 | `contentId` | 认证内容ID | `cpu-supplymgr.certification.CertificationApplyContent` | `content_id` |  →  |  |  | None |  |
| 7 | `stepId` | 认证环节ID | `cpu-supplymgr.certification.StepProfile` | `step_id` |  →  |  |  | None |  |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 9 | `agreementList` | 认证任务框架协议 | `cpu-supplymgr.certification.CertificationApplyDetailAgreement` | `` | agreementList → applyDetailId | 0..n | true | None |  |
| 10 | `templateId` | 认证模板 | `suppliermgr.template.Template` | `template_id` |  →  |  |  | None |  |
| 11 | `sampleList` | 认证信息样品试验 | `cpu-supplymgr.certification.CertificationApplyDetailSample` | `` | sampleList → applyDetailId | 0..n | true | None |  |
| 12 | `staffList` | 认证任务参与人员 | `cpu-supplymgr.certification.CertificationApplyDetailStaff` | `` | staffList → applyDetailId | 0..n | true | None |  |
| 13 | `orgId` | 组织id | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |
| 14 | `quoteContentId` | 引用认证内容 | `cpu-supplymgr.certification.CertificationApplyContent` | `quote_content_id` |  →  |  |  | None |  |
| 15 | `abilityDetailId` | 判定级别(认证等级) | `aa.supplyability.SupplyAbilityDetail` | `ability_detail_id` |  →  |  |  | Service |  |
| 16 | `applyId` | 认证任务ID | `cpu-supplymgr.certification.CertificationApply` | `apply_id` |  →  |  |  | None |  |
| 17 | `qualifyList` | 认证任务资质证照要求 | `cpu-supplymgr.certification.CertificationApplyDetailQualify` | `` | qualifyList → applyDetailId | 0..n | true | None |  |
| 18 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 19 | `quantityTestList` | 认证任务产品量试 | `cpu-supplymgr.certification.CertificationApplyDetailQuantityTest` | `` | quantityTestList → applyDetailId | 0..n | true | None |  |
| 20 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type` |  →  |  |  | Service |  |
| 21 | `indicatorList` | 认证任务认证信息要求 | `cpu-supplymgr.certification.CertificationApplyDetailIndicator` | `` | indicatorList → applyDetailId | 0..n | true | None |  |
| 22 | `quoteApplyId` | 引用单据 | `cpu-supplymgr.certification.CertificationApply` | `quote_apply_id` |  →  |  |  | None |  |
| 23 | `objectId` | 认证对象ID | `cpu-supplymgr.certification.CertificationApplyObject` | `object_id` |  →  |  |  | None |  |

### Composition（子表）

- **agreementList**: `agreementList` → `cpu-supplymgr.certification.CertificationApplyDetailAgreement` | 0..n
- **sampleList**: `sampleList` → `cpu-supplymgr.certification.CertificationApplyDetailSample` | 0..n
- **staffList**: `staffList` → `cpu-supplymgr.certification.CertificationApplyDetailStaff` | 0..n
- **qualifyList**: `qualifyList` → `cpu-supplymgr.certification.CertificationApplyDetailQualify` | 0..n
- **quantityTestList**: `quantityTestList` → `cpu-supplymgr.certification.CertificationApplyDetailQuantityTest` | 0..n
- **indicatorList**: `indicatorList` → `cpu-supplymgr.certification.CertificationApplyDetailIndicator` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `director` (负责人) | `bd.staff.Staff` | `director` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `orgId` (组织id) | `org.func.BaseOrg` | `org_id` |
| `abilityDetailId` (判定级别(认证等级)) | `aa.supplyability.SupplyAbilityDetail` | `ability_detail_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type` |
