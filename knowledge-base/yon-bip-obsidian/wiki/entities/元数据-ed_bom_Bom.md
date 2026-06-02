---
tags: [BIP, 元数据, 数据字典, ed.bom.Bom]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成品信息 (`ed.bom.Bom`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ed_bom` | 应用: `ED` | 类型: `Class`

## 属性（106 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 2 | `engineeringDrawNumber` | engineeringDrawNumber | `engineering_draw_number` | String | `text` |
| 3 | `fromQuantity` | fromQuantity | `from_quantity` | Decimal | `number` |
| 4 | `productId` | productID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `quantityControl` | quantityControl | `quantity_control` | Short | `singleOption` |
| 6 | `sourceCode` | source编码 | `source_code` | String | `text` |
| 7 | `sourceLineNo` | sourceLineNo | `source_line_no` | String | `text` |
| 8 | `sourceSrcDocId` | sourceSrcDocID | `source_src_doc_id` | String | `text` |
| 9 | `variantconfigctsId` | variantconfigctsID | `variantconfigcts_id` | c28a3b13-02ed-4cba-85f3-bd29e5b5dc40 | `quote` |
| 10 | `fromSrcDocId` | fromSrcDocID | `from_src_doc_id` | String | `text` |
| 11 | `fromCode` | from编码 | `from_code` | String | `text` |
| 12 | `fromLineNo` | fromLineNo | `from_line_no` | String | `text` |
| 13 | `transTypeId` | transTypeID | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 14 | `configNo` | configNo | `config_no` | String | `text` |
| 15 | `variantconfigctsVersion` | variantconfigctsVersion | `variantconfigcts_version` | String | `text` |
| 16 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 17 | `agentId` | agentID | `agent_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 18 | `allocationSourceId` | allocationSourceID | `allocation_source_id` | Long | `long` |
| 19 | `isProcess` | 是否Process | `is_process` | Short | `short` |
| 20 | `adminOrgId` | adminOrgID | `admin_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 21 | `vendorAuth` | vendorAuth | `subcontract_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 | `quote` |
| 22 | `isRevising` | 是否Revising | `is_revising` | Short | `short` |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 24 | `subcontractVendorId` | subcontractVendorID | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 25 | `originalId` | originalID | `original_id` | Long | `long` |
| 26 | `isChange` | 是否Change | `is_change` | Short | `short` |
| 27 | `sourceSrcDocType` | sourceSrcDocType | `source_src_doc_type` | Integer | `int` |
| 28 | `toQuantity` | toQuantity | `to_quantity` | Decimal | `number` |
| 29 | `bomClassify` | bomClassify | `bom_classify` | Short | `singleOption` |
| 30 | `code` | 编码 | `code` | String | `text` |
| 31 | `bomDefineCharacter` | bomDefineCharacter | `bom_define_character` | 6beb46c9-1483-4cf4-b674-72d7f1c1c326 | `UserDefine` |
| 32 | `bomFreeCts` | bomFreeCts | `bom_free_cts` | 4340f2dd-0ae5-4599-a78a-25374110a095 | `FreeCT` |
| 33 | `bomSensitive` | bomSensitive | `bom_sensitive` | b965523d-0044-4a47-9d03-9e275b330807 | `FreeCT` |
| 34 | `orgId` | 组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 35 | `changeRate` | changeRate | `change_rate` | Decimal | `number` |
| 36 | `changeType` | changeType | `change_type` | Short | `short` |
| 37 | `erpCode` | erp编码 | `erpcode` | String | `text` |
| 38 | `newestVer` | newestVer | `newest_ver` | Short | `short` |
| 39 | `produceBatch` | produceBatch | `produce_batch` | Decimal | `number` |
| 40 | `produceUnit` | produceUnit | `produce_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 41 | `sensitiveUID` | sensitiveUID | `sensitive_uid` | String | `text` |
| 42 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 43 | `id` | ID | `id` | Long | `long` |
| 44 | `bomType` | bomType | `bom_type` | Integer | `int` |
| 45 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 46 | `materialId` | materialID | `material_id` | Long | `long` |
| 47 | `skuId` | skuID | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 48 | `bomUnit` | bomUnit | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 49 | `scrap` | scrap | `scrap` | Decimal | `number` |
| 50 | `substituteFlag` | substituteFlag | `substitute_flag` | String | `text` |
| 51 | `substituteDescription` | substituteDescription | `substitute_description` | String | `text` |
| 52 | `remark` | remark | `remark` | String | `text` |
| 53 | `status` | 状态 | `status` | Short | `short` |
| 54 | `creator` | 创建人 | `creator` | String | `text` |
| 55 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 56 | `modifier` | 修改人 | `modifier` | String | `text` |
| 57 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 58 | `auditor` | auditor | `auditor` | String | `text` |
| 59 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 60 | `versionCode` | version编码 | `version_code` | String | `text` |
| 61 | `effectiveDate` | effectiveDate | `effective_date` | DateTime | `timestamp` |
| 62 | `expiryDate` | expiryDate | `expiry_date` | DateTime | `timestamp` |
| 63 | `isWholeSend` | 是否WholeSend | `is_whole_send` | Short | `singleOption` |
| 64 | `isWholeReport` | 是否WholeReport | `is_whole_report` | Short | `short` |
| 65 | `batch` | batch | `batch` | Decimal | `number` |
| 66 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 67 | `useTypeId` | useTypeID | `use_type` | b4c8abe8-998a-421e-b12a-bf6b14121b4d | `quote` |
| 68 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 69 | `returncount` | returncount | `returncount` | Short | `short` |
| 70 | `sourceType` | sourceType | `source_type` | Short | `short` |
| 71 | `sourceId` | sourceID | `source_id` | String | `text` |
| 72 | `rollup` | rollup | `rollup` | Short | `singleOption` |
| 73 | `tplid` | tplid | `tplid` | Long | `long` |
| 74 | `receiveStatu` | receiveStatu | `receive_statu` | String | `text` |
| 75 | `version` | 版本号 | `version` | String | `text` |
| 76 | `ecnOrderId` | ecnOrderID | `ecn_order_id` | Long | `long` |
| 77 | `productAuth` | productAuth | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |
| 78 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 79 | `printCount` | printCount | `printCount` | Integer | `int` |
| 80 | `isRevised` | 是否Revised | `is_revised` | Short | `short` |
| 81 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 82 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 83 | `ecnLineNo` | ecnLineNo | `ecn_line_no` | Decimal | `number` |
| 84 | `ecnOrderDetailId` | ecnOrderDetailID | `ecn_order_detail_id` | Long | `long` |
| 85 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 86 | `versionMemo` | versionMemo | `version_memo` | String | `text` |
| 87 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 88 | `parentId` | 上级ID | `parent_id` | Long | `long` |
| 89 | `ecnOrderCode` | ecnOrder编码 | `ecn_order_code` | String | `text` |
| 90 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 91 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 92 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 93 | `activity` | activity | `activity` | Long | `long` |
| 94 | `bomApplyrange` | bomApplyrange | `` | f92eebac-847d-4533-8888-8e30ca4cc6f1 | `` |
| 95 | `bomAttrextItem` | bomAttrextItem | `` | 7574bb5e-343c-413f-8875-c417cf7675b2 | `` |
| 96 | `bomByproduct` | bomByproduct | `` | 0445cbea-e503-4d98-83bb-4761d390762b | `` |
| 97 | `bomComponent` | bomComponent | `` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 | `` |
| 98 | `bomComponentRuleDetail` | bomComponentRuleDetail | `` | afd6cbb2-89cb-4a49-95d2-03cf9a4849f1 | `` |
| 99 | `bomUserdefItem` | bomUserdefItem | `` | 86723d82-3639-484b-967b-a4d5ffae56c3 | `` |
| 100 | `changeRateDen` | changeRateDen | `change_rate_den` | Decimal | `number` |
| 101 | `changeRateNum` | changeRateNum | `change_rate_num` | Decimal | `number` |
| 102 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 103 | `submitTime` | submitTime | `submit_time` | DateTime | `dateTime` |
| 104 | `submitter` | submitter | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 105 | `withdrawTime` | withdrawTime | `withdraw_time` | DateTime | `dateTime` |
| 106 | `withdrawpp` | withdrawpp | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |

## 关联（30 个）

- `produceUnit` -> `pc.unit.Unit` ()
- `submitter` -> `base.user.BipUser` ()
- `agentId` -> `aa.merchant.Merchant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `bomByproduct` -> `ed.bom.BomByproduct` (0..n)
- `wbs` -> `BGDM.wbs.wbs_doc` ()
- `vendorAuth` -> `pb.dataauth.VendorDataAuth` ()
- `orgId` -> `aa.baseorg.OrgMV` ()
- `bomUnit` -> `pc.unit.Unit` ()
- `variantconfigctsId` -> `vc.variantconfigcts.VariantConfigCts` ()
- `bomFreeCts` -> `ed.bom.EdBomCt` ()
- `withdrawpp` -> `base.user.BipUser` ()
- `bomApplyrange` -> `ed.bom.BomApplyrange` (0..n)
- `transTypeId` -> `bd.bill.TransType` ()
- `bomComponentRuleDetail` -> `ed.bom.BomComponentRuleDetail` (0..n)
- `skuId` -> `pc.product.ProductSKU` ()
- `tenant` -> `base.tenant.Tenant` ()
- `productId` -> `pc.product.Product` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `bomSensitive` -> `ed.bom.EdBomBomaffec` ()
- `useTypeId` -> `ed.usetype.UseType` ()
- `bomComponent` -> `ed.bom.BomComponent` (0..n)
- `bomDefineCharacter` -> `ed.bom.BomDefineCharacter` ()
- `subcontractVendorId` -> `aa.vendor.Vendor` ()
- `adminOrgId` -> `aa.baseorg.OrgMV` ()
- `auditorId` -> `base.user.User` ()
- `productAuth` -> `pb.dataauth.ProductDataAuth` ()
- `bomAttrextItem` -> `ed.bom.BomAttrextItem` (1)
- `bomUserdefItem` -> `ed.bom.BomUserdefItem` (1)
