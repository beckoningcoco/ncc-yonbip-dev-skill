---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.certification.CertificationApply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 认证任务 (`cpu-supplymgr.certification.CertificationApply`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_certification_apply` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.certification.CertificationApply` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 认证任务 |
| 物理表 | `cpu_certification_apply` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `8c627bdf-0a1f-4232-adb7-510d416871ab` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:33.5150` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `code` | `code` | String | 认证编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:45:59:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202603031546_metadata_cpu-supplymgr-certification_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `815a6dfc-4273-4f23-9fbf-a37fcaa2868a`

## 业务场景

- `workflow`
- `DataAuth`
- `transtype`
- `isCoreBill`
- `userdefine`
- `print`
- `UITemplate`
- `imextmp`
- `report`
- `billcode`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 8 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 2 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 6 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 7 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 8 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 77 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `schemeId` | schemeId | `scheme_id` | accc6ddd-cdf4-44c9-846d-cd9516160285 | `quote` |  | ✓ |
| 3 | `name` | 认证名称 | `name` | String | `multiLanguage` |  | ✓ |
| 4 | `code` | 认证编码 | `code` | String | `text` |  | ✓ |
| 5 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 6 | `approveStatus` | approveStatus | `approve_status` | String | `text` |  | ✓ |
| 7 | `reason` | reason | `reason` | String | `text` |  | ✓ |
| 8 | `abilityId` | 等级体系 | `ability_id` | 960ce6ff-03b4-4afc-ba32-2342d2e50e5b | `quote` |  | ✓ |
| 9 | `stopReason` | stopReason | `stop_reason` | String | `text` |  | ✓ |
| 10 | `purchaseClassId` | 采购品类ID | `purchase_class_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | ✓ |
| 11 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 12 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 13 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 14 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 15 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 16 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 17 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 18 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 19 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 20 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 21 | `subordinateOrg` | 是否下级组织 | `subordinate_org` | String | `text` |  | ✓ |
| 22 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 23 | `isAutomaticSyn` | 是否自动同步认证结果 | `is_automatic_syn` | String | `text` |  | ✓ |
| 24 | `certActualStep` | certActualStep | `cert_actual_step` | String | `text` |  | ✓ |
| 25 | `productTestId` | productTestId | `product_test_id` | Long | `long` |  | ✓ |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 27 | `supAgent` | 是否支持代填报,0不支持,1支持 | `sup_agent` | String | `text` |  | ✓ |
| 28 | `vendorStatus` | 供应商端状态 | `vendor_status` | String | `text` |  | ✓ |
| 29 | `applyDepartmentId` | 申请组织ID | `apply_department_id` | Long | `long` |  | ✓ |
| 30 | `applyDepartmentName` | 申请组织name | `apply_department_name` | String | `text` |  | ✓ |
| 31 | `certificateOrgName` | 认证组织 | `certificate_org_name` | String | `text` |  | ✓ |
| 32 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 33 | `vendorTenant` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 34 | `applyStatus` | 整体认证任务状态 | `status` | String | `text` |  | ✓ |
| 35 | `applyFieldId` | applyFieldId | `apply_field_id` | Long | `long` |  | ✓ |
| 36 | `isBizLeaderForMe` | 负责人为我 | `is_biz_leader_for_me` | String | `text` |  | ✓ |
| 37 | `certCurrentStep` | 当前认证步骤 | `cert_current_step` | String | `text` |  | ✓ |
| 38 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String | `text` |  | ✓ |
| 39 | `file` | 附件 | `file_id` | String | `text` |  | ✓ |
| 40 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 41 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 42 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 43 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 44 | `certificationSynSupply` | 认证报告同步给供应商:1协同,0不协同(默认不协同) | `certification_syn_supply` | String | `text` |  | ✓ |
| 45 | `syncVendor` | 协同供应商 | `sync_vendor` | String | `text` |  | ✓ |
| 46 | `certContent` | 认证内容 | `cert_content` | String | `text` |  | ✓ |
| 47 | `qualifyCheckId` | qualifyCheckId | `qualify_check_id` | Long | `long` |  | ✓ |
| 48 | `buyerName` | 采购商名称 | `buyer_name` | String | `text` |  | ✓ |
| 49 | `certDueStep` | certDueStep | `cert_due_step` | String | `text` |  | ✓ |
| 50 | `enterpriseId` | enterprise_id | `enterprise_id` | Long | `long` |  | ✓ |
| 51 | `isValidity` | isValidity | `is_validity` | String | `text` |  | ✓ |
| 52 | `certificaterName` | 发起人 | `certificater_name` | String | `text` |  | ✓ |
| 53 | `isOrgFirst` | 认证标准 | `is_org_first` | String | `text` |  | ✓ |
| 54 | `certificateOrg` | 认证组织 | `certificate_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 55 | `certificater` | 发起人 | `certificater` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 56 | `createTime` | 认证日期 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 57 | `supplierId` | 认证供应商 | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 58 | `authMode` | 认证模式 | `auth_mode` | String | `text` |  | ✓ |
| 59 | `certificationObject` | 认证对象 | `certification_object` | String | `text` |  | ✓ |
| 60 | `categoryId` | 认证物料分类 | `category_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 61 | `materialId` | 认证物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 62 | `planEndDate` | 预计完成日期 | `plan_end_date` | Date | `date` |  | ✓ |
| 63 | `validityDate` | 有效期 | `validity_date` | DateTime | `timestamp` |  | ✓ |
| 64 | `channel` | 受理渠道 | `enum_id` | String | `text` |  | ✓ |
| 65 | `authResult` | 认证结论 | `auth_result` | String | `text` |  | ✓ |
| 66 | `adjustAuthResult` | 校准后认证结论 | `adjust_auth_result` | String | `text` |  | ✓ |
| 67 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 68 | `verifystate` | 审批流状态 | `verifystate` | Short | `short` |  | ✓ |
| 69 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 70 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 71 | `auditor` | 审批人 | `auditor` | String | `text` |  | ✓ |
| 72 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 73 | `userDefineCharacter` | 认证任务特征 | `user_define_character` | 3f327294-e3a6-47ae-a3f8-ad66e74047ef | `UserDefine` |  | ✓ |
| 74 | `contentList` | 认证内容 | `` | f9a3f523-fa9a-45e7-9441-9c77b42e219f | `` |  |  |
| 75 | `objectList` | 认证对象 | `` | 8c919637-e6f3-408f-9bd7-6b8e406b2ade | `` |  |  |
| 76 | `orgList` | 认证任务适用组织 | `` | 622fcea2-eb34-4fe5-abc0-775b2de47ca7 | `` |  |  |
| 77 | `productList` | 认证任务适用物料分类范围 | `` | 650b6ae1-2b38-4862-bd22-8cf015790961 | `` |  |  |

---

## 关联属性（共 19 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purchaseClassId` | 采购品类ID | `pc.cls.PurchaseClass` | `purchase_class_id` |  →  |  |  | Service |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `supplierId` | 认证供应商 | `aa.vendor.Vendor` | `supplier_id` |  →  |  |  | Service |  |
| 4 | `userDefineCharacter` | 认证任务特征 | `cpu-supplymgr.certification.CertificationApplyDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 8 | `orgList` | 认证任务适用组织 | `cpu-supplymgr.certification.CertificationApplyOrg` | `` | orgList → applyId | 0..n | true | None |  |
| 9 | `schemeId` | schemeId | `cpu-supplymgr.certification.CertificationAllotScheme` | `scheme_id` |  →  |  |  | None |  |
| 10 | `materialId` | 认证物料 | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 11 | `objectList` | 认证对象 | `cpu-supplymgr.certification.CertificationApplyObject` | `` | objectList → applyId | 0..n | true | None |  |
| 12 | `certificater` | 发起人 | `bd.staff.Staff` | `certificater` |  →  |  |  | Service |  |
| 13 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 14 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type` |  →  |  |  | Service |  |
| 15 | `abilityId` | 等级体系 | `aa.supplyability.SupplyAbility` | `ability_id` |  →  |  |  | Service |  |
| 16 | `contentList` | 认证内容 | `cpu-supplymgr.certification.CertificationApplyContent` | `` | contentList → applyId | 0..n | true | None |  |
| 17 | `categoryId` | 认证物料分类 | `pc.cls.ManagementClass` | `category_id` |  →  |  |  | Service |  |
| 18 | `productList` | 认证任务适用物料分类范围 | `cpu-supplymgr.certification.CertificationApplyProduct` | `` | productList → applyId | 0..n | true | None |  |
| 19 | `certificateOrg` | 认证组织 | `org.func.BaseOrg` | `certificate_org` |  →  |  |  | Service |  |

### Composition（子表）

- **orgList**: `orgList` → `cpu-supplymgr.certification.CertificationApplyOrg` | 0..n
- **objectList**: `objectList` → `cpu-supplymgr.certification.CertificationApplyObject` | 0..n
- **contentList**: `contentList` → `cpu-supplymgr.certification.CertificationApplyContent` | 0..n
- **productList**: `productList` → `cpu-supplymgr.certification.CertificationApplyProduct` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purchaseClassId` (采购品类ID) | `pc.cls.PurchaseClass` | `purchase_class_id` |
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `supplierId` (认证供应商) | `aa.vendor.Vendor` | `supplier_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `materialId` (认证物料) | `pc.product.Product` | `material_id` |
| `certificater` (发起人) | `bd.staff.Staff` | `certificater` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type` |
| `abilityId` (等级体系) | `aa.supplyability.SupplyAbility` | `ability_id` |
| `categoryId` (认证物料分类) | `pc.cls.ManagementClass` | `category_id` |
| `certificateOrg` (认证组织) | `org.func.BaseOrg` | `certificate_org` |
