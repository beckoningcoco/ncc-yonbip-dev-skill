---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.returnorder.OsmReturnOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外退货单表头 (`po.returnorder.OsmReturnOrder`)

> OSM | 物理表：`po_osm_arrive_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外退货单表头 |
| 物理表 | `po_osm_arrive_order` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:22.4560` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（120个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auditDate` | 审批日期 | `audit_date` | Date |
| 2 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 3 | `auditor` | 审批人名称 | `auditor` | String |
| 4 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 6 | `bizType` | 业务类型 | `biz_type` | Short |
| 7 | `carNumber` | 车牌号 | `car_number` | String |
| 8 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 9 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 10 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 11 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 12 | `closer` | 关闭人名称 | `closer` | String |
| 13 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `code` | 编码 | `code` | String |
| 15 | `collaborArrival` | 协同到货单 | `collabor_arrival` | Boolean |
| 16 | `collaborModel` | 协同方式 | `collabor_model` | Short |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 370a44e5-34fc-4932-ad4a-6d7be7b10f7a |
| 22 | `deliverAttachment` | 发货附件 | `deliver_attachment` | String |
| 23 | `deliverContactInfo` | 发货单联系方式 | `deliver_contact_info` | String |
| 24 | `deliverContactPerson` | 发货单联系人 | `deliver_contact_person` | String |
| 25 | `deliverDate` | 发货日期 | `deliver_date` | Date |
| 26 | `deliveryDate` | 计划到货日期 | `delivery_date` | Date |
| 27 | `departmentId` | 委外部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 28 | `fcId` | 本币币种 | `fc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 29 | `id` | ID | `id` | Long |
| 30 | `invoiceVendorAuth` | 开票供应商权限 | `invoice_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 31 | `invoiceVendorId` | 开票供应商 | `invoice_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 32 | `iomSource` | 接口表来源类型 | `iom_source` | String |
| 33 | `iomSourceautoid` | 接口表来源子表id | `iom_sourceautoid` | String |
| 34 | `iomSourceid` | 接口表来源id | `iom_sourceid` | String |
| 35 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 36 | `isOsmCoordination` | 需要与委外商协同 | `is_osm_coordination` | Boolean |
| 37 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 38 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 39 | `modifier` | 修改人名称 | `modifier` | String |
| 40 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 41 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 42 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 43 | `netMoneyFC` | 未税金额(本币) | `netmoney_fc` | Decimal |
| 44 | `netMoneyTC` | 未税金额(交易币种) | `netmoney_tc` | Decimal |
| 45 | `operatorId` | 业务员 | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 46 | `orgId` | 委外组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 47 | `originCode` | 来源单据号 | `origin_code` | String |
| 48 | `originId` | 来源单据ID | `origin_id` | Long |
| 49 | `paymentagrement` | 付款协议 | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime |
| 51 | `rcvDepartmentId` | 退货部门 | `rcv_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 52 | `rcvOrgId` | 退货组织 | `rcv_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 53 | `rcvStaffId` | 退货人 | `rcv_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 54 | `remark` | 备注 | `remark` | String |
| 55 | `returncount` | 退回次数 | `returncount` | Short |
| 56 | `rtnId` | 回厂单id | `rtn_id` | String |
| 57 | `sendStatus` | 发送状态 | `send_status` | Boolean |
| 58 | `sendTransWayId` | 发运方式 | `send_trans_way_id` | aa2f6845-347d-499f-a5b2-964b84747d99 |
| 59 | `signAttachment` | 签收附件 | `sign_attachment` | String |
| 60 | `signDate` | 签收时间 | `sign_date` | Date |
| 61 | `signPerson` | 签收人 | `sign_person` | String |
| 62 | `signRemark` | 签收备注 | `sign_remark` | String |
| 63 | `signState` | 签收状态 | `sign_state` | Short |
| 64 | `sourceType` | 来源上级单据类型 | `source_type` | String |
| 65 | `status` | 单据状态 | `status` | Short |
| 66 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 67 | `taxFC` | 税额(本币) | `tax_fc` | Decimal |
| 68 | `taxRateId` | 税率 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 69 | `taxTC` | 税额(交易币种) | `tax_tc` | Decimal |
| 70 | `tcFCExchRate` | 汇率 | `tcfc_exchrate` | Decimal |
| 71 | `tcFCExchRateDate` | 汇率日期 | `tcfc_exchrate_date` | Date |
| 72 | `tcFCExchRateType` | 汇率类型 | `tcfc_exchrate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 73 | `tcId` | 交易币种 | `tc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 74 | `tcOrgId` | 收票组织 | `tc_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 |
| 75 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 76 | `totalMoneyFC` | 总金额(本币) | `totalmoney_fc` | Decimal |
| 77 | `totalMoneyTC` | 总金额(交易币种) | `totalmoney_tc` | Decimal |
| 78 | `tplid` | 模板id | `tplid` | Long |
| 79 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 80 | `transportCode` | 物流单号 | `sign_attachment` | String |
| 81 | `transportCompanyCode` | 物流公司代码 | `transport_company_code` | String |
| 82 | `transportCompanyName` | 物流公司 | `transport_company_name` | String |
| 83 | `transportType` | 运输工具 | `transport_ype` | Short |
| 84 | `vendorAuth` | 委外供应商权限 | `subcontract_vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 85 | `vendorContactName` | 委外商联系人 | `vendor_contact_name` | String |
| 86 | `vendorTenant` | 委外商租户 | `vendor_tenant` | String |
| 87 | `verifystate` | 审批状态 | `verifystate` | Short |
| 88 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 89 | `barCode` | 单据条码 | `bar_code` | String |
| 90 | `costAccountingMethod` | 成本核算方式 | `cost_accounting_method` | Integer |
| 91 | `exchRateOps` | 汇率换算方式 | `exchRateOps` | Integer |
| 92 | `iomCode` | 外部源头编码 | `iom_code` | String |
| 93 | `mixConsultRole` | 混合云协同角色 | `mix_consult_role` | Integer |
| 94 | `orderAttrextItem` | 表头自由自定义项 | `` | fa0a2570-26c0-424f-8b20-3315b12bc7d1 |
| 95 | `orderUserdefItem` | 表头固定自定义项 | `` | cd464295-03cd-4363-b714-a501a2780884 |
| 96 | `osmBusiType` | 委外业务类型 | `osm_busi_type` | Integer |
| 97 | `osmReturnOrderProduct` | 委外退货单表体 | `` | 0d67012a-9649-4ece-9baa-17c7b5144dac |
| 98 | `osmVendorContactId` | 委外商联系人ID | `osm_vendor_contact_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 99 | `outStatus` | ERP协同状态 | `out_status` | Integer |
| 100 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 101 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 102 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 103 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 104 | `printCount` | 打印次数 | `printCount` | Integer |
| 105 | `rcvAddrType` | 收货地址类型 | `rcv_addr_type` | Integer |
| 106 | `rcvCustomer` | 收货客户 | `rcv_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 107 | `rcvVendor` | 收货委外商 | `rcv_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 108 | `requireSign` | 需要与签收方协同 | `require_sign` | Boolean |
| 109 | `sendRemark` | ERP处理结果 | `send_remark` | String |
| 110 | `signBill` | 是否生成签收单 | `sign_bill` | Boolean |
| 111 | `signType` | 签收方 | `sign_type` | Integer |
| 112 | `signerEnterpriseId` | 签收方企业 | `signer_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 113 | `signerTenant` | 签收方租户 | `signer_tenant` | String |
| 114 | `specialBizType` | 特殊业务类型 | `special_biz_type` | String |
| 115 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 116 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 117 | `tradePath` | 贸易路径 | `trade_path` | c69f1d6a-783c-4f79-b446-b4da14cb7fff |
| 118 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 119 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 120 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（37个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `rcvOrgId` | 退货组织 | `aa.baseorg.OrgMV` | Service |  |
| 3 | `departmentId` | 委外部门 | `aa.baseorg.DeptMV` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 8 | `osmVendorContactId` | 委外商联系人ID | `aa.vendor.VendorContacts` | Service |  |
| 9 | `orgId` | 委外组织 | `org.func.BaseOrg` | Service |  |
| 10 | `sendTransWayId` | 发运方式 | `aa.sendtrans.SendTransWay` | Service |  |
| 11 | `tcFCExchRateType` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 12 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 13 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 14 | `fcId` | 本币币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 15 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 16 | `taxRateId` | 税率 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 17 | `tcId` | 交易币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 18 | `operatorId` | 业务员 | `bd.staff.Staff` | Service |  |
| 19 | `osmReturnOrderProduct` | 委外退货单表体 | `po.returnorder.OsmReturnOrderProduct` | None | true |
| 20 | `paymentagrement` | 付款协议 | `bd.payments.PayAgreement` | Service |  |
| 21 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 22 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 23 | `invoiceVendorId` | 开票供应商 | `aa.vendor.Vendor` | Service |  |
| 24 | `signerEnterpriseId` | 签收方企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 25 | `invoiceVendorAuth` | 开票供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 26 | `tcOrgId` | 收票组织 | `org.func.FinanceOrg` | Service |  |
| 27 | `rcvStaffId` | 退货人 | `bd.staff.Staff` | Service |  |
| 28 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 29 | `rcvCustomer` | 收货客户 | `aa.merchant.Merchant` | Service |  |
| 30 | `rcvDepartmentId` | 退货部门 | `aa.baseorg.DeptMV` | Service |  |
| 31 | `subcontractVendorId` | 委外供应商 | `aa.vendor.Vendor` | Service |  |
| 32 | `orderAttrextItem` | 表头自由自定义项 | `po.returnorder.OsmReturnOrderAttrextItem` | None | true |
| 33 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 34 | `defineCharacteristics` | 自定义项特征组 | `po.returnorder.ReturnOrderDefineCharacteristics` | None |  |
| 35 | `tradePath` | 贸易路径 | `sccs.multitrade.TradeRoute` | Service |  |
| 36 | `rcvVendor` | 收货委外商 | `aa.vendor.Vendor` | Service |  |
| 37 | `orderUserdefItem` | 表头固定自定义项 | `po.returnorder.OsmReturnOrderUserdefItem` | None | true |
