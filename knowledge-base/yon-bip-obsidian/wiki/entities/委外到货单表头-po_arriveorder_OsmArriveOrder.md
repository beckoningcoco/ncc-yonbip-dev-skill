---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.arriveorder.OsmArriveOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外到货单表头 (`po.arriveorder.OsmArriveOrder`)

> OSM | 物理表：`po_osm_arrive_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外到货单表头 |
| 物理表 | `po_osm_arrive_order` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:27.2250` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `code` | String | 到货单号 |

---

## 直接属性（120个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bizType` | 业务类型 | `biz_type` | Short |
| 2 | `carNumber` | 车牌号 | `car_number` | String |
| 3 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 4 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 5 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 6 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 7 | `closer` | 关闭人名称 | `closer` | String |
| 8 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `collaborArrival` | 协同到货单 | `collabor_arrival` | Boolean |
| 10 | `collaborModel` | 协同方式 | `collabor_model` | Short |
| 11 | `costAccountingMethod` | 成本核算方式 | `cost_accounting_method` | Integer |
| 12 | `tradePath` | 贸易路径 | `trade_path` | c69f1d6a-783c-4f79-b446-b4da14cb7fff |
| 13 | `specialBizType` | 特殊业务类型 | `special_biz_type` | String |
| 14 | `osmVendorContactId` | 委外商联系人ID | `osm_vendor_contact_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 15 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 16 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 17 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 18 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 19 | `signType` | 签收方 | `sign_type` | Integer |
| 20 | `rcvVendor` | 收货委外商 | `rcv_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 21 | `mixConsultRole` | 混合云协同角色 | `mix_consult_role` | Integer |
| 22 | `osmBusiType` | 委外业务类型 | `osm_busi_type` | Integer |
| 23 | `requireSign` | 需要与签收方协同 | `require_sign` | Boolean |
| 24 | `signerEnterpriseId` | 签收方企业 | `signer_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 25 | `iomCode` | 外部源头编码 | `iom_code` | String |
| 26 | `signerTenant` | 签收方租户 | `signer_tenant` | String |
| 27 | `sendRemark` | ERP处理结果 | `send_remark` | String |
| 28 | `rcvCustomer` | 收货客户 | `rcv_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 29 | `rcvAddrType` | 收货地址类型 | `rcv_addr_type` | Integer |
| 30 | `signBill` | 是否生成签收单 | `sign_bill` | Boolean |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 32 | `outStatus` | ERP协同状态 | `out_status` | Integer |
| 33 | `deliverAttachment` | 发货附件 | `deliver_attachment` | String |
| 34 | `deliverContactInfo` | 发货单联系方式 | `deliver_contact_info` | String |
| 35 | `deliverContactPerson` | 发货单联系人 | `deliver_contact_person` | String |
| 36 | `deliverDate` | 发货日期 | `deliver_date` | Date |
| 37 | `isOsmCoordination` | 需要与委外商协同 | `is_osm_coordination` | Boolean |
| 38 | `originCode` | 来源单据号 | `origin_code` | String |
| 39 | `originId` | 来源单据ID | `origin_id` | Long |
| 40 | `paymentagrement` | 付款协议 | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 41 | `rtnId` | 回厂单id | `rtn_id` | String |
| 42 | `sendStatus` | 发送状态 | `send_status` | Boolean |
| 43 | `signAttachment` | 签收附件 | `sign_attachment` | String |
| 44 | `signDate` | 签收时间 | `sign_date` | Date |
| 45 | `signPerson` | 签收人 | `sign_person` | String |
| 46 | `signRemark` | 签收备注 | `sign_remark` | String |
| 47 | `signState` | 签收状态 | `sign_state` | Short |
| 48 | `transportCode` | 物流单号 | `sign_attachment` | String |
| 49 | `transportCompanyCode` | 物流公司代码 | `transport_company_code` | String |
| 50 | `transportCompanyName` | 物流公司 | `transport_company_name` | String |
| 51 | `transportType` | 运输工具 | `transport_ype` | Short |
| 52 | `vendorTenant` | 委外商租户 | `vendor_tenant` | String |
| 53 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | cfc19202-4154-4789-9f9f-5651114a13aa |
| 54 | `invoiceVendorAuth` | 开票供应商权限 | `invoice_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 55 | `iomSource` | 接口表来源类型 | `iom_source` | String |
| 56 | `iomSourceautoid` | 接口表来源子表id | `iom_sourceautoid` | String |
| 57 | `iomSourceid` | 接口表来源id | `iom_sourceid` | String |
| 58 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 59 | `tcFCExchRateDate` | 汇率日期 | `tcfc_exchrate_date` | Date |
| 60 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 61 | `tplid` | 模板id | `tplid` | Long |
| 62 | `vendorAuth` | 委外供应商权限 | `subcontract_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 63 | `id` | id | `id` | Long |
| 64 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 65 | `creator` | 创建人 | `creator` | String |
| 66 | `createDate` | 创建日期 | `create_date` | Date |
| 67 | `createTime` | 创建时间 | `create_time` | DateTime |
| 68 | `modifierId` | 最后修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 69 | `modifier` | 最后修改人 | `modifier` | String |
| 70 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 71 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 72 | `auditorId` | 审核人id | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 73 | `rcvOrgId` | 收货组织id | `rcv_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 74 | `auditor` | 审核人 | `auditor` | String |
| 75 | `deliveryDate` | 计划到货日期 | `delivery_date` | Date |
| 76 | `auditDate` | 审核日期 | `audit_date` | Date |
| 77 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 78 | `orgId` | 委外组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 79 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 80 | `vouchdate` | 到货日期 | `vouchdate` | Date |
| 81 | `code` | 到货单号 | `code` | String |
| 82 | `subcontractVendorId` | 委外商id | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 83 | `departmentId` | 委外部门id | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 84 | `operatorId` | 委外业务员id | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 85 | `rcvDepartmentId` | 收货部门id | `rcv_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 86 | `rcvStaffId` | 收货人id | `rcv_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 87 | `sendTransWayId` | 发运方式id | `send_trans_way_id` | aa2f6845-347d-499f-a5b2-964b84747d99 |
| 88 | `tcId` | 币种id | `tc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 89 | `fcId` | 本币id | `fc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 90 | `invoiceVendorId` | 开票委外商id | `invoice_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 91 | `tcOrgId` | 收票组织id | `tc_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 |
| 92 | `vendorContactName` | 委外商联系人 | `vendor_contact_name` | String |
| 93 | `tcFCExchRateType` | 汇率类型id | `tcfc_exchrate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 94 | `tcFCExchRate` | 汇率 | `tcfc_exchrate` | Decimal |
| 95 | `taxRateId` | 税率id | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 96 | `totalMoneyTC` | 总金额 | `totalmoney_tc` | Decimal |
| 97 | `taxTC` | 税额 | `tax_tc` | Decimal |
| 98 | `netMoneyTC` | 未税金额 | `netmoney_tc` | Decimal |
| 99 | `totalMoneyFC` | 总金额(本币) | `totalmoney_fc` | Decimal |
| 100 | `taxFC` | 税额(本币) | `tax_fc` | Decimal |
| 101 | `netMoneyFC` | 未税金额(本币) | `netmoney_fc` | Decimal |
| 102 | `status` | 状态 | `status` | Short |
| 103 | `remark` | 备注 | `remark` | String |
| 104 | `pubts` | 时间戳 | `pubts` | DateTime |
| 105 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 106 | `verifystate` | 审批状态 | `verifystate` | Short |
| 107 | `returncount` | 退回次数 | `returncount` | Short |
| 108 | `bizFlow` | 流程id | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 109 | `isFlowCoreBill` | 是否核心单据 | `isFlowCoreBill` | Boolean |
| 110 | `sourceType` | 来源单据类型 | `source_type` | String |
| 111 | `barCode` | 单据条码 | `bar_code` | String |
| 112 | `exchRateOps` | 汇率换算方式 | `exchRateOps` | Integer |
| 113 | `orderAttrextItem` | 表头自由自定义项 | `` | 8e35882a-a27f-41a0-948b-97c6ef594ec3 |
| 114 | `orderUserdefItem` | 表头固定自定义项 | `` | 41c10e09-b7a4-4dc3-8e69-9ba705d89f28 |
| 115 | `osmArriveOrderProduct` | 委外到货单表体 | `` | 858b44be-73af-4087-a285-219c34d67b83 |
| 116 | `printCount` | 打印次数 | `printCount` | Integer |
| 117 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 118 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 119 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 120 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（37个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `rcvOrgId` | 收货组织id | `aa.baseorg.OrgMV` | Service |  |
| 3 | `departmentId` | 委外部门id | `aa.baseorg.DeptMV` | Service |  |
| 4 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 5 | `modifierId` | 最后修改人id | `base.user.User` | Service |  |
| 6 | `bizFlow` | 流程id | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 8 | `osmVendorContactId` | 委外商联系人ID | `aa.vendor.VendorContacts` | Service |  |
| 9 | `orgId` | 委外组织id | `org.func.BaseOrg` | Service |  |
| 10 | `sendTransWayId` | 发运方式id | `aa.sendtrans.SendTransWay` | Service |  |
| 11 | `tcFCExchRateType` | 汇率类型id | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 12 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 13 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 14 | `fcId` | 本币id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 15 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 16 | `taxRateId` | 税率id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 17 | `tcId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 18 | `operatorId` | 委外业务员id | `bd.staff.Staff` | Service |  |
| 19 | `paymentagrement` | 付款协议 | `bd.payments.PayAgreement` | Service |  |
| 20 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 21 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 22 | `invoiceVendorId` | 开票委外商id | `aa.vendor.Vendor` | Service |  |
| 23 | `signerEnterpriseId` | 签收方企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 24 | `invoiceVendorAuth` | 开票供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 25 | `tcOrgId` | 收票组织id | `org.func.FinanceOrg` | Service |  |
| 26 | `rcvStaffId` | 收货人id | `bd.staff.Staff` | Service |  |
| 27 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 28 | `rcvCustomer` | 收货客户 | `aa.merchant.Merchant` | Service |  |
| 29 | `rcvDepartmentId` | 收货部门id | `aa.baseorg.DeptMV` | Service |  |
| 30 | `osmArriveOrderProduct` | 委外到货单表体 | `po.arriveorder.OsmArriveOrderProduct` | None | true |
| 31 | `subcontractVendorId` | 委外商id | `aa.vendor.Vendor` | Service |  |
| 32 | `orderAttrextItem` | 表头自由自定义项 | `po.arriveorder.OsmArriveOrderAttrextItem` | None | true |
| 33 | `auditorId` | 审核人id | `base.user.User` | Service |  |
| 34 | `defineCharacteristics` | 自定义项特征组 | `po.arriveorder.ArriveOrderDefineCharacteristics` | None |  |
| 35 | `tradePath` | 贸易路径 | `sccs.multitrade.TradeRoute` | Service |  |
| 36 | `rcvVendor` | 收货委外商 | `aa.vendor.Vendor` | Service |  |
| 37 | `orderUserdefItem` | 表头固定自定义项 | `po.arriveorder.OsmArriveOrderUserdefItem` | None | true |
