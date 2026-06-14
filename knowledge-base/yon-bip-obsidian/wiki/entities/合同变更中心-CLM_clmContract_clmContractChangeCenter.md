---
tags: ["BIP", "元数据", "数据字典", "CLM", "CLM.clmContract.clmContractChangeCenter"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同变更中心 (`CLM.clmContract.clmContractChangeCenter`)

> CLM | 物理表：`clm_contract_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更中心 |
| 物理表 | `clm_contract_change` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 构建时间 | `2026-06-04 23:44:07.9990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |
| 编码 | `serial_number` | String | 编码 |

---

## 直接属性（70个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bContractlib` | 是否变更中心数据 | `b_contractlib` | Boolean |
| 2 | `changeCenterFeature` | 自定义特征 | `change_center_feature` | 5047e8dd-a222-4baf-b404-c97a893a1e77 |
| 3 | `changeType` | 变更单据方式 | `change_type` | String |
| 4 | `sourceBillCode` | 源单据编码 | `source_bill_code` | String |
| 5 | `finishFile` | 定稿文件/送签文件 | `finish_file` | String |
| 6 | `code` | 编码 | `serial_number` | String |
| 7 | `bWatermark` | 是否有水印 | `b_watermark` | bWatermark |
| 8 | `beginningFlag` | 期初标识 | `beginning_flag` | isOnOrYes |
| 9 | `billtypeCode` | 单据类型编码 | `billtype_code` | String |
| 10 | `billtypeId` | 单据类型ID | `billtype_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 |
| 11 | `bustype` | 交易类型 | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 12 | `cause` | 变更事由 | `cause` | String |
| 13 | `changeCreateDate` | 变更申请日期 | `change_create_date` | String |
| 14 | `changeCreator` | 变更申请人 | `change_creator` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a |
| 15 | `changeVersion` | 版本 | `change_version` | Integer |
| 16 | `clmContractFileId` | 合同文本对象Id | `clm_contract_file_id` | String |
| 17 | `contractFileStatus` | 合同归档状态 | `contract_file_status` | placeFileState |
| 18 | `ctClass` | 合同性质 | `ct_class` | ctClass |
| 19 | `currencyId` | 本币 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 20 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 21 | `deptId` | 承办部门 | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 22 | `efileMode` |  合同文件模式 | `efile_mode` | contractFileMode_C |
| 23 | `exchangeRate` | 汇率 | `exchange_rate` | Decimal |
| 24 | `finalizeStatus` | 定稿状态 | `finalize_status` | finalizeStatus |
| 25 | `invaliDate` | 合同终止日期 | `invali_date` | String |
| 26 | `mny` |  合同金额 | `mny` | Decimal |
| 27 | `oriCurrencyId` | 原币 | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 28 | `oriHaveTaxMny` | 原币含税金额 | `ori_have_tax_mny` | Decimal |
| 29 | `personId` | 承办人 | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 30 | `planInvallidate` | 计划失效日期 | `plan_invallidate` | String |
| 31 | `planValidate` | 计划生效日期 | `plan_validate` | String |
| 32 | `signDate` | 合同签订日期 | `sign_date` | String |
| 33 | `signProcessId` | 签署流程 ID | `sign_process_id` | String |
| 34 | `signSubjectId` | 承办组织 | `sign_subject_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 35 | `signType` | 签署方式 | `sign_type` | signType |
| 36 | `sourceContractId` | 源合同id | `source_contract_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 |
| 37 | `sourceSys` | 合同来源 | `source_sys` | sourceSys |
| 38 | `state` | 变更状态 | `state` | changeState |
| 39 | `status` | 合同状态 | `status` | contractStatus |
| 40 | `subStatus` | 业务子状态 | `sub_status` | String |
| 41 | `supplierId` | 供应商 | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 42 | `sysEffectiveDate` | 系统生效日期 | `sys_effective_date` | String |
| 43 | `targetSys` | 推送系统 | `target_sys` | targetSys |
| 44 | `title` | 合同名称 | `title` | String |
| 45 | `type` | 合同类型 | `type` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb |
| 46 | `valiDate` | 合同生效日期 | `vali_date` | String |
| 47 | `version` | 版本号 | `version` | String |
| 48 | `way` | 变更方式 | `way` | changeWay |
| 49 | `id` | 主键 | `id` | String |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime |
| 51 | `bizFlowInstanceId` | 业务流实例id | `bizflowinstance_id` | String |
| 52 | `bizFlowMakeBillCode` | 单据转换规则编码 | `bizflow_makebillcode` | String |
| 53 | `bizflowId` | 业务流id | `bizflow_id` | String |
| 54 | `bizflowName` | 流程名称 | `bizflowname` | String |
| 55 | `sourceBusiObj` | 上游业务对象 | `sourcebusiobj` | String |
| 56 | `sourceChildId` | 上游单据子表id | `sourcechild_id` | String |
| 57 | `sourceCode` | 上游单据号 | `sourcecode` | String |
| 58 | `sourceId` | 上游单据主表id | `source_id` | String |
| 59 | `firstBusiObj` | 来源业务对象 | `firstbusiobj` | String |
| 60 | `firstChildId` | 来源单据子表id | `firstchild_id` | String |
| 61 | `firstCode` | 来源单据号 | `firstcode` | String |
| 62 | `firstId` | 来源单据主表id | `first_id` | String |
| 63 | `sourceGrandId` | 来源孙表id | `sourcegrand_id` | String |
| 64 | `createTime` | 创建时间 | `create_time` | DateTime |
| 65 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 66 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 67 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 68 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 69 | `dr` | 逻辑删除 | `dr` | Short |
| 70 | `orgId` | 主组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billtypeId` | 单据类型ID | `bd.bill.BillTypeVO` | Service |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `supplierId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 5 | `deptId` | 承办部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 6 | `oriCurrencyId` | 原币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 7 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `type` | 合同类型 | `DZHTFW.econtract.contractType` | Service |  |
| 9 | `signSubjectId` | 承办组织 | `aa.baseorg.OrgMV` | Service |  |
| 10 | `orgId` | 主组织 | `org.func.BaseOrg` | Service |  |
| 11 | `bustype` | 交易类型 | `bd.bill.TransType` | Service |  |
| 12 | `changeCreator` | 变更申请人 | `bd.staff.StaffNew` | Service |  |
| 13 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 14 | `changeCenterFeature` | 自定义特征 | `CLM.clmContract.ClmContractChangeCenterFeature` | None |  |
| 15 | `personId` | 承办人 | `bd.staff.Staff` | Service |  |
| 16 | `currencyId` | 本币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 17 | `sourceContractId` | 源合同id | `CLM.clmContract.contractLib` | None |  |
