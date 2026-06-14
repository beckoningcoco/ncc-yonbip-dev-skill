---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.qualitycertificate.qualitycertificate"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质证书 (`QMSQIT.qualitycertificate.qualitycertificate`)

> QMSQIT | 物理表：`qms_qit_qualitycertificate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质证书 |
| 物理表 | `qms_qit_qualitycertificate` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:03.0280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 单据主键 |
| 编码 | `code` | String | 质证书号 |

---

## 直接属性（59个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | 单据主键 | `id` | Long |
| 4 | `pk_org` | 质检组织 | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 质证书号 | `code` | String |
| 6 | `vtranstypeid` | 交易类型 | `vtranstypeid` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `certificatedate` | 开证日期 | `certificatedate` | DateTime |
| 8 | `pk_material` | 物料 | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 9 | `pk_customer` | 客户 | `pk_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 10 | `countnum` | 数量 | `countnum` | Decimal |
| 11 | `note` | 备注 | `note` | String |
| 12 | `pk_dfmcheck` | 检验记录id | `pk_dfmcheck` | 631cb01f-3080-4010-9744-e5b5bea34d6a |
| 13 | `pk_certificatestaff` | 开证人 | `pk_certificatestaff` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 14 | `pk_qualitycertificateprint` | 质证书编制方案id | `pk_qualitycertificateprint` | 4b9a6bc4-87cd-4697-8e38-0c73ada8e8df |
| 15 | `freect_h` | 自由项特征组 | `freect_h` | b74041fd-73c2-4693-bb68-e38ecdd1a018 |
| 16 | `definect_h` | 质证书自定义项 | `definect_h` | 4022a0a4-eda9-49de-8c5d-d24562590c32 |
| 17 | `unitid` | 计量单位 | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `pk_salesout` | 销售出库id | `pk_salesout` | Long |
| 19 | `source` | 来源 | `source` | String |
| 20 | `printCount` | 打印次数 | `printCount` | Integer |
| 21 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 22 | `verifystate` | 审批状态 | `verifystate` | Short |
| 23 | `returncount` | 退回次数 | `returncount` | Short |
| 24 | `dr` | 逻辑删除标记 | `dr` | Short |
| 25 | `auditor` | 审批人名称 | `auditor` | String |
| 26 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 28 | `auditDate` | 审批日期 | `audit_date` | Date |
| 29 | `free1` | 规格1 | `free1` | String |
| 30 | `free2` | 规格2 | `free2` | String |
| 31 | `free3` | 规格3 | `free3` | String |
| 32 | `free4` | 规格4 | `free4` | String |
| 33 | `free5` | 规格5 | `free5` | String |
| 34 | `free6` | 规格6 | `free6` | String |
| 35 | `free7` | 规格7 | `free7` | String |
| 36 | `free8` | 规格8 | `free8` | String |
| 37 | `free9` | 规格9 | `free9` | String |
| 38 | `free10` | 规格10 | `free10` | String |
| 39 | `ctTplId` | 合同模板id | `ct_tpl_id` | String |
| 40 | `ctTplCode` | 合同模板编码 | `ct_tpl_code` | String |
| 41 | `ctTplVersion` | 合同模板版本 | `ct_tpl_version` | String |
| 42 | `ctTplName` | 合同模板名称 | `ct_tpl_name` | String |
| 43 | `ctTermsData` | 合同条款数据 | `ctTermsData` | String |
| 44 | `signStatus` | 电子签署状态 | `sign_status` | Short |
| 45 | `ctSignId` | 签署流程ID | `ct_sign_id` | String |
| 46 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 47 | `tplid` | 模板id | `tplid` | Long |
| 48 | `status` | 单据状态 | `status` | Short |
| 49 | `createTime` | 创建时间 | `create_time` | DateTime |
| 50 | `createDate` | 创建日期 | `create_date` | Date |
| 51 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 52 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 53 | `creator` | 创建人名称 | `creator` | String |
| 54 | `modifier` | 修改人名称 | `modifier` | String |
| 55 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 56 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 57 | `pubts` | 时间戳 | `pubts` | DateTime |
| 58 | `qualitycertificatebspecList` | 质证书检验信息 | `` | 17987ef5-c503-49c9-a01a-f1d881ef8347 |
| 59 | `qualitycertinspectitemList2` | 整单检验项目 | `` | 7b0884c4-4a66-4ec0-9b28-4adc67ea5ff1 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `vtranstypeid` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `pk_customer` | 客户 | `aa.merchant.Merchant` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `pk_certificatestaff` | 开证人 | `bd.staff.Staff` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `qualitycertinspectitemList2` | 整单检验项目 | `QMSQIT.qualitycertificate.qualitycertinspectitemAll` | None | true |
| 8 | `pk_org` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 9 | `pk_material` | 物料 | `pc.product.Product` | Service |  |
| 10 | `freect_h` | 自由项特征组 | `QMSQIT.qualitycertificate.QualitycertificateFree` | None |  |
| 11 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 12 | `unitid` | 计量单位 | `pc.unit.Unit` | Service |  |
| 13 | `pk_dfmcheck` | 检验记录id | `QMSDFM.dfmCheck.QmsDfmCheckRecord` | Service |  |
| 14 | `pk_qualitycertificateprint` | 质证书编制方案id | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeDetail` | None |  |
| 15 | `definect_h` | 质证书自定义项 | `QMSQIT.qualitycertificate.QtycertDefineCharacter` | None |  |
| 16 | `qualitycertificatebspecList` | 质证书检验信息 | `QMSQIT.qualitycertificate.qualitycertbspec` | None | true |
