---
tags: ["BIP", "元数据", "数据字典", "ycPurchaseSynergy", "check.pucheckbill.PuCheckBillVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购对账单主表 (`check.pucheckbill.PuCheckBillVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPurchaseSynergy 模块实体元数据字典。
> 物理表：`pu_checkbill` | 所属应用：`ycPurchaseSynergy`
> 来源：元数据API `queryByUri` 返回的 `check.pucheckbill.PuCheckBillVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购对账单主表 |
| 物理表 | `pu_checkbill` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycPurchaseSynergy` |
| 业务对象ID | `7065e83e-7f60-4b06-b534-534e283699be` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:56.3490` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `checkbill_id` | `checkbill_id` | String | ID |
| 编码 | `billcode` | `billcode` | String | 单据号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-23 00:06:06:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202601/202601191027_metadata_check-pucheckbill_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `702d2107-7d4e-44c1-bc5f-d8c2c9fa686e`

## 业务场景

- `FieldAuth`
- `print`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `transtype`
- `report`
- `billcode`
- `ruleengine`
- `userdefine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 9 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 打印次数 (`IPrintCount`) | `base.itf.IPrintCount` | 66 | 1 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 4 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 6 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 7 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 8 | 审批提交信息 (`ISubmitInfo`) | `ucfbase.ucfbaseItf.ISubmitInfo` | 85 | 4 |
| 9 | 过账信息 (`IPostAccountInfo`) | `gscm.itf.IPostAccountInfo` | 4 | 2 |

---

## 直接属性（共 128 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `PuCheckBillVODefineCharacter` | 表头自定义项特征属性 | `pu_check_bill_define_character` | 67060b72-5cc6-4488-8e8e-1faa63e2afea | `UserDefine` |  | ✓ |
| 2 | `tenantId` | 采购商商租户id{cpu_auth.cpu_enterprise} | `tenant_id` | String | `text` |  | ✓ |
| 3 | `checkBillStatus` | 单据状态 | `status` | String | `text` |  | ✓ |
| 4 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 5 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 6 | `tenant` | 采购商商租户id{cpu_auth.cpu_enterprise} | `vouch_tenant_id` | String | `text` |  | ✓ |
| 7 | `verifystate` | 审批状态 | `verifystate` | Integer | `int` |  | ✓ |
| 8 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` | ✓ |  |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 10 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 11 | `supplyPersonId` | 供方联系人id | `supply_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |  | ✓ |
| 12 | `saleCheckBillCode` | 销售周期对账单号 | `sale_check_bill_code` | String | `text` |  | ✓ |
| 13 | `isNotInvoiced` | 按实收数量对账,1-未开销售发票 | `is_not_invoiced` | String | `text` |  | ✓ |
| 14 | `invoiceAddress` | 收票地址 | `invoice_address` | String | `text` |  | ✓ |
| 15 | `invoiceReceiverName` | 收票人 | `invoice_receiver_name` | String | `text` |  | ✓ |
| 16 | `postAccountStatus` | 过账状态 | `postAccountStatus` | Short | `short` |  | ✓ |
| 17 | `invoiceReceiverMobile` | 收票人联系方式 | `invoice_receiver_phone` | String | `text` |  | ✓ |
| 18 | `invoiceReceiverId` | 收票人主键 | `invoice_receiver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 19 | `postAccountFailMsg` | 过账失败原因 | `post_account_fail_msg` | String | `text` |  | ✓ |
| 20 | `apportionAmount` | 分摊金额 | `apportion_amount` | Decimal | `number` |  | ✓ |
| 21 | `claimTotalAmount` | 索赔扣款金额 | `claim_total_amount` | Decimal | `number` |  | ✓ |
| 22 | `needApportionAmount` | 需分摊索赔扣款金额 | `need_apportion_amount` | Decimal | `number` |  | ✓ |
| 23 | `checkCreatorId` | 创建人 | `check_creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 24 | `checkPresonId` | 对账发起人 | `check_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 25 | `isInvoiceContract` | 是否发票协同 | `is_invoice_contract` | Integer | `int` |  | ✓ |
| 26 | `claimInvoicedAmount` | 索赔扣款已开票金额 | `claim_invoiced_amount` | Decimal | `number` |  | ✓ |
| 27 | `isSupplyContract` | 是否供应商协同 | `is_supply_contract` | Boolean | `switch` |  | ✓ |
| 28 | `paymentProcess` | 付款流程 | `payment_process` | String | `text` |  | ✓ |
| 29 | `checkSource` | 对账发起方 | `check_source` | String | `text` |  | ✓ |
| 30 | `printCount` | 打印次数 | `printCount` | Integer | `int` |  | ✓ |
| 31 | `transtypeId` | 交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 32 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 33 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 34 | `currencyName` | 币种名称 | `currency_name` | String | `text` |  | ✓ |
| 35 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | ✓ |
| 36 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 37 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 38 | `id` | ID | `checkbill_id` | String | `text` |  | ✓ |
| 39 | `title` | 对账标题 | `title` | String | `text` |  | ✓ |
| 40 | `puNum` | 计价数量 | `pu_num` | Decimal | `number` |  | ✓ |
| 41 | `accInvoiceNum` | 已开票数量 | `acc_invoice_num` | Decimal | `number` |  | ✓ |
| 42 | `pkOrg` | 采购组织id{org_orgs} | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 43 | `code` | 单据号 | `billcode` | String | `text` |  | ✓ |
| 44 | `puPurNum` | 应对采购数量 | `pu_pur_num` | Decimal | `number` |  | ✓ |
| 45 | `accInvoiceMny` | 已开票无税金额 | `acc_invoice_mny` | Decimal | `number` |  | ✓ |
| 46 | `orgCode` | orgCode | `org_code` | String | `text` |  | ✓ |
| 47 | `status` | 审批状态 | `vouch_status` | Short | `short` |  | ✓ |
| 48 | `leaveNum` | 遗留数量 | `leave_num` | Decimal | `number` |  | ✓ |
| 49 | `puMainNum` | 应对主数量 | `pu_main_num` | Decimal | `number` |  | ✓ |
| 50 | `accInvoiceTaxmny` | 已开票含税金额 | `acc_invoice_taxmny` | Decimal | `number` |  | ✓ |
| 51 | `orgName` | 采购组织名称 | `org_name` | String | `text` |  | ✓ |
| 52 | `billStatus` | 审批状态 | `bill_status` | String | `text` |  | ✓ |
| 53 | `takerOrgid` | 收票组织 | `taker_orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 54 | `leavePurNum` | 遗留采购数量 | `leave_pur_num` | Decimal | `number` |  | ✓ |
| 55 | `billdate` | 单据日期 | `billdate` | Date | `date` |  | ✓ |
| 56 | `leaveMainNum` | 遗留主数量 | `leave_main_num` | Decimal | `number` |  | ✓ |
| 57 | `actualNum` | 实对数量 | `actual_num` | Decimal | `number` |  | ✓ |
| 58 | `actualPurNum` | 实对采购数量 | `actual_pur_num` | Decimal | `number` |  | ✓ |
| 59 | `actualMainNum` | 实对主数量 | `actual_main_num` | Decimal | `number` |  | ✓ |
| 60 | `ajustTax` | 调整税额 | `ajust_tax` | Decimal | `number` |  | ✓ |
| 61 | `puTaxmny` | 采购含税金额 | `pu_taxmny` | Decimal | `number` |  | ✓ |
| 62 | `begindate` | 对账开始日期 | `begindate` | Date | `date` |  | ✓ |
| 63 | `puMny` | 采购无税金额 | `pu_mny` | Decimal | `number` |  | ✓ |
| 64 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 65 | `enddate` | 对账截至日期 | `enddate` | Date | `date` |  | ✓ |
| 66 | `leaveTaxmny` | 遗留含税金额 | `leave_taxmny` | Decimal | `number` |  | ✓ |
| 67 | `relateId` | 关联销售对账单id{yuncai_check.sale_checkbill} | `relate_id` | String | `text` |  | ✓ |
| 68 | `leaveMny` | 遗留无税金额 | `leave_mny` | Decimal | `number` |  | ✓ |
| 69 | `ajustTaxmny` | 调整含税金额 | `ajust_taxmny` | Decimal | `number` |  | ✓ |
| 70 | `biztype` | 对账来源 | `biztype` | String | `text` |  | ✓ |
| 71 | `ajustMny` | 调整无税金额 | `ajust_mny` | Decimal | `number` |  | ✓ |
| 72 | `actualTaxmny` | 实对含税金额 | `actual_taxmny` | Decimal | `number` |  | ✓ |
| 73 | `ownerId` | 创建用户id{pub_tenant_user} | `owner_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 74 | `actualMny` | 实对无税金额 | `actual_mny` | Decimal | `number` |  | ✓ |
| 75 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 76 | `currencyId` | 币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 77 | `ownerCode` | 创建用户编码 | `owner_code` | String | `text` |  | ✓ |
| 78 | `ownerName` | 创建用户名称 | `owner_name` | String | `text` |  | ✓ |
| 79 | `puTax` | 采购税额 | `pu_tax` | Decimal | `number` |  | ✓ |
| 80 | `supplierFile` | 供应商附件 | `supplier_file` | String | `text` |  | ✓ |
| 81 | `puFile` | 采购商附件 | `pu_file` | String | `text` |  | ✓ |
| 82 | `saleTaxmny` | 销售含税金额 | `sale_taxmny` | Decimal | `number` |  | ✓ |
| 83 | `saleTax` | 销售税额 | `sale_tax` | Decimal | `number` |  | ✓ |
| 84 | `saleMny` | 销售无税金额 | `sale_mny` | Decimal | `number` |  | ✓ |
| 85 | `saleNum` | 销售数量 | `sale_num` | Decimal | `number` |  | ✓ |
| 86 | `ajustNum` | 调整数量 | `ajust_num` | Decimal | `number` |  | ✓ |
| 87 | `supplierCode` | supplierCode | `supplier_code` | String | `text` |  | ✓ |
| 88 | `pkSupplier` | 供应商档案id{cpu_basedoc.cpu_supplydoc} | `pk_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 89 | `supplierName` | 供应商 | `supplier_name` | String | `text` |  | ✓ |
| 90 | `publishtime` | 发布时间 | `publishtime` | DateTime | `timestamp` |  | ✓ |
| 91 | `supplierTenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `supplier_tenant_id` | String | `text` |  | ✓ |
| 92 | `pkInvoicevendor` | 开票供应商pk{cpu_basedoc.cpu_supplydoc} | `pk_invoicevendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 93 | `invoicevendorCode` | 开票供应商编码 | `invoicevendor_code` | String | `text` |  | ✓ |
| 94 | `invoicevendorName` | 开票供应商名称 | `invoicevendor_name` | String | `text` |  | ✓ |
| 95 | `answertime` | 回复时间 | `answertime` | DateTime | `timestamp` |  | ✓ |
| 96 | `isVirtual` | 是否虚拟对账单 | `is_virtual` | String | `text` |  | ✓ |
| 97 | `tenantName` | 采购企业名称 | `tenant_name` | String | `text` |  | ✓ |
| 98 | `currencyCode` | 币种编码 | `currency_code` | String | `text` |  | ✓ |
| 99 | `currencySymbol` | 币种符号 | `currency_symbol` | String | `text` |  | ✓ |
| 100 | `sourceCheckbillId` | erp对账单id | `source_checkbill_id` | String | `text` |  | ✓ |
| 101 | `sourceCheckbillCode` | erp对账单编码 | `source_checkbill_code` | String | `text` |  | ✓ |
| 102 | `source` | 对账单来源,0:云采自建;1:erp上传 | `source` | Integer | `int` |  | ✓ |
| 103 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 104 | `dealType` | 交易类型 | `deal_type` | String | `text` |  | ✓ |
| 105 | `takerOrgcode` | 收票组织code | `taker_orgcode` | String | `text` |  | ✓ |
| 106 | `takerOrgname` | 收票组织name | `taker_orgname` | String | `text` |  | ✓ |
| 107 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 108 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 109 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 110 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 111 | `applyInvoiceFailReason` | 开票申请失败原因 | `apply_invoice_fail_reason` | String | `text` |  | ✓ |
| 112 | `applyInvoiceProcessStatus` | 开票申请处理状态 | `apply_invoice_process_status` | Integer | `int` |  | ✓ |
| 113 | `applyInvoiceRejectReason` | 开票申请拒绝原因 | `apply_invoice_reject_reason` | String | `text` |  | ✓ |
| 114 | `applyInvoiceStatus` | 开票申请推送状态 | `apply_invoice_status` | Integer | `int` |  | ✓ |
| 115 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 116 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 117 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 118 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 119 | `claimDedutionList` | 采购对账索赔扣款表 | `` | d97f94e0-038a-471e-ae1c-ad426e0101ed | `` |  |  |
| 120 | `collaborativeProcess` | 协同流程 | `collaborative_process` | String | `text` |  | ✓ |
| 121 | `freeDefine` | 采购对账单主表自由自定义项表 | `` | dbc91b6f-cf5c-483f-b3fa-0189b94246b0 | `` |  |  |
| 122 | `integrationType` | 集成类型 | `integration_type` | String | `text` |  | ✓ |
| 123 | `materiaList` | 采购对账单孙表 | `` | 542bed5a-b315-4d74-a415-9174370aed6c | `` |  |  |
| 124 | `postAccountVersion` | 过账版本 | `postAccountVersion` | Long | `long` |  | ✓ |
| 125 | `submitTime` | 提交时间 | `submit_time` | DateTime | `dateTime` |  | ✓ |
| 126 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 127 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime | `dateTime` |  | ✓ |
| 128 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |

---

## 关联属性（共 21 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | `submitter` |  →  |  |  | Service |  |
| 2 | `checkCreatorId` | 创建人 | `base.user.User` | `check_creator_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | ytenantId | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `checkPresonId` | 对账发起人 | `bd.staff.Staff` | `check_person_id` |  →  |  |  | Service |  |
| 7 | `invoiceReceiverId` | 收票人主键 | `bd.staff.Staff` | `invoice_receiver_id` |  →  |  |  | Service |  |
| 8 | `takerOrgid` | 收票组织 | `org.func.BaseOrg` | `taker_orgid` |  →  |  |  | Service |  |
| 9 | `ownerId` | 创建用户id{pub_tenant_user} | `base.user.User` | `owner_id` |  →  |  |  | Service |  |
| 10 | `PuCheckBillVODefineCharacter` | 表头自定义项特征属性 | `check.pucheckbill.UserDefineCharacteristics` | `pu_check_bill_define_character` |  →  |  |  | None |  |
| 11 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 12 | `claimDedutionList` | 采购对账索赔扣款表 | `check.pucheckbill.PuCheckbillClaimDeduction` | `` | claimDedutionList → checkbillId | 0..n | true | None |  |
| 13 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | `withdrawpp` |  →  |  |  | Service |  |
| 14 | `pkOrg` | 采购组织id{org_orgs} | `org.func.BaseOrg` | `pk_org` |  →  |  |  | Service |  |
| 15 | `pkSupplier` | 供应商档案id{cpu_basedoc.cpu_supplydoc} | `aa.vendor.Vendor` | `pk_supplier` |  →  |  |  | Service |  |
| 16 | `freeDefine` | 采购对账单主表自由自定义项表 | `check.pucheckbill.PuCheckBillFreeDefine` | `` | freeDefine → id | 1 | true | None | ⚠️ |
| 17 | `materiaList` | 采购对账单孙表 | `check.pucheckbill.PuCheckMaterialVO` | `` | materiaList → checkbillId | 1..n | true | None |  |
| 18 | `pkInvoicevendor` | 开票供应商pk{cpu_basedoc.cpu_supplydoc} | `aa.vendor.Vendor` | `pk_invoicevendor` |  →  |  |  | Service |  |
| 19 | `currencyId` | 币种ID | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 20 | `transtypeId` | 交易类型id | `bd.bill.TransType` | `transtype_id` |  →  |  |  | Service |  |
| 21 | `supplyPersonId` | 供方联系人id | `aa.vendor.VendorContacts` | `supply_person_id` |  →  |  |  | Service |  |

### Composition（子表）

- **claimDedutionList**: `claimDedutionList` → `check.pucheckbill.PuCheckbillClaimDeduction` | 0..n
- **freeDefine**: `freeDefine` → `check.pucheckbill.PuCheckBillFreeDefine` | 1 ⚠️ 已废弃
- **materiaList**: `materiaList` → `check.pucheckbill.PuCheckMaterialVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `submitter` (提交人) | `base.user.BipUser` | `submitter` |
| `checkCreatorId` (创建人) | `base.user.User` | `check_creator_id` |
| `ytenant` (ytenantId) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `checkPresonId` (对账发起人) | `bd.staff.Staff` | `check_person_id` |
| `invoiceReceiverId` (收票人主键) | `bd.staff.Staff` | `invoice_receiver_id` |
| `takerOrgid` (收票组织) | `org.func.BaseOrg` | `taker_orgid` |
| `ownerId` (创建用户id{pub_tenant_user}) | `base.user.User` | `owner_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `withdrawpp` (撤回提交的人) | `base.user.BipUser` | `withdrawpp` |
| `pkOrg` (采购组织id{org_orgs}) | `org.func.BaseOrg` | `pk_org` |
| `pkSupplier` (供应商档案id{cpu_basedoc.cpu_supplydoc}) | `aa.vendor.Vendor` | `pk_supplier` |
| `pkInvoicevendor` (开票供应商pk{cpu_basedoc.cpu_supplydoc}) | `aa.vendor.Vendor` | `pk_invoicevendor` |
| `currencyId` (币种ID) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `transtypeId` (交易类型id) | `bd.bill.TransType` | `transtype_id` |
| `supplyPersonId` (供方联系人id) | `aa.vendor.VendorContacts` | `supply_person_id` |
