---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.deliveryorder.DeliveryOrderVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发货单 (`cpu-order.deliveryorder.DeliveryOrderVO`)

> ycSaleCoor | 物理表：`cpu_deliveryorder`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发货单 |
| 物理表 | `cpu_deliveryorder` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:36.8010` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 发货单id |
| 编码 | `deliveryorder_code` | String | 发货单号 |

---

## 直接属性（90个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `deliveryOrderDefineCharacter` | 自定义项特征属性组 | `define_header` | 1e468876-06d1-477c-ae6c-16ddf047c925 |
| 2 | `dr` | 删除标识 | `dr` | Integer |
| 3 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `code` | 发货单号 | `deliveryorder_code` | String |
| 6 | `deliveryDate` | 发货日期 | `delivery_date` | Date |
| 7 | `signTime` | 签收时间 | `sign_time` | DateTime |
| 8 | `transtypeName` | 交易类型名称 | `transtype_name` | String |
| 9 | `ts` | 时间戳 | `ts` | DateTime |
| 10 | `barCode` | 发货单单据条码 | `bar_code` | String |
| 11 | `cooperationProcessArrival` | 到货协同流程 | `cooperation_process_arrival_enum` | String |
| 12 | `transtypeId` | 交易类型ID | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 13 | `signUser` | 签收人 | `sign_user` | String |
| 14 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 15 | `signUserId` | 签收人ID | `sign_userId` | Long |
| 16 | `arriveOrderCode` | 到货单号 | `arriveorder_code` | String |
| 17 | `printCount` | 打印次数 | `printCount` | Integer |
| 18 | `pubts` | 时间戳 | `ts` | DateTime |
| 19 | `otherLogisticalCode` | 其他物流公司编码 | `other_logistical_code` | String |
| 20 | `invoicedStatus` | 开票状态 | `invoiced_status` | Integer |
| 21 | `supEnterpriseName` | 发货企业 | `sup_enterprise_name` | String |
| 22 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 23 | `purchaseOrgName` | 采购组织 | `pur_org_name` | String |
| 24 | `purEnterpriseName` | 收货企业 | `pur_enterprise_name` | String |
| 25 | `receiveOrgName` | 收货组织 | `receive_org_name` | String |
| 26 | `transportType` | 运输工具 | `transport_type` | String |
| 27 | `logisticalComp` | 物流公司 | `logistical_comp` | String |
| 28 | `logisticalCode` | 物流单号 | `logistical_code` | String |
| 29 | `trainCode` | 车皮号 | `train_code` | String |
| 30 | `transportCode` | 车牌号 | `transport_code` | String |
| 31 | `linkpsn` | 联系人 | `linkpsn` | String |
| 32 | `linktype` | 联系方式 | `linktype` | String |
| 33 | `memo` | 备注 | `memo` | String |
| 34 | `industryTag` | 行业标签 | `industry_tag` | Integer |
| 35 | `businessType` | 业务类型 | `business_type` | Integer |
| 36 | `orderArea` | 区域 | `order_area` | String |
| 37 | `projectDocName` | 项目名称 | `project_doc_name` | String |
| 38 | `invoiceInfo` | 发票信息 | `invoice_info` | String |
| 39 | `erpSupplyId` | ERP供应商主键 | `erp_supply_id` | String |
| 40 | `projectDocCode` | 项目编码 | `project_doc_code` | String |
| 41 | `isApproving` | 到货单是否审批中 | `is_approving` | String |
| 42 | `isDeliveryBrand` | 是否允许反馈发货品牌 | `is_delivery_brand` | String |
| 43 | `status` | 状态 | `status` | String |
| 44 | `invoiceBizTypeCode` | 发票方式 | `invoice_biz_type_code` | Integer |
| 45 | `arriveDate` | 预计到货时间 | `arrive_date` | DateTime |
| 46 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 47 | `logisticalCompCode` | 物流公司代码 | `logistical_comp_code` | String |
| 48 | `logisticalInfo` | 物流信息 | `logistical_info` | String |
| 49 | `outerId` | 电商子表id | `outer_id` | String |
| 50 | `isDeliveryProxy` | 是否代发货 | `is_delivery_proxy` | String |
| 51 | `orderId` | 采购订单id | `order_id` | Long |
| 52 | `amount` | 金额 | `amount` | Decimal |
| 53 | `logisticalStatus` | 物流状态 | `logistical_status` | String |
| 54 | `errorMsg` | 记录由发货单生成到货单得错误信息 | `error_msg` | String |
| 55 | `saleOrderCode` | 销售订单单据号 | `sale_order_code` | String |
| 56 | `deliveryOrderType` | 发货单类型 | `deliveryorder_type` | String |
| 57 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 58 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 59 | `outerOrderId` | 来源电商的单据ID | `outer_order_id` | String |
| 60 | `accountStatus` | 对账状态 | `account_status` | String |
| 61 | `id` | 发货单id | `id` | Long |
| 62 | `projectDocIdStr` | 平台项目档案id | `project_doc_idstr` | String |
| 63 | `purEnterpriseId` | 采购商租户id | `pur_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 64 | `supplierName` | 供应商档案名称 | `supplier_name` | String |
| 65 | `jkErpdelorder` | 是否nc取回 | `jk_erpdelorder` | Boolean |
| 66 | `outerTypeId` | 来源渠道主键 | `outertype_id` | String |
| 67 | `supplierShortName` | 供应商档案简称 | `supplier_short_name` | String |
| 68 | `receivePersonTel` | 收货人电话 | `receive_person_tel` | String |
| 69 | `outerTypeName` | 来源渠道名称 | `outertype_name` | String |
| 70 | `orderCode` | 采购订单单据号 | `order_code` | String |
| 71 | `saleOrderId` | 销售订单id | `sale_order_id` | Long |
| 72 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 73 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 74 | `supplierid` | 供应商档案Id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 75 | `isPushERP` | 发货单发布后是否自动传NC到货单 | `is_push_erp` | String |
| 76 | `priceType` | 价格类型 | `price_type` | String |
| 77 | `invoiceBizTypeName` | 发票方式名称 | `invoice_biz_type_name` | String |
| 78 | `isYcReceive` | 到货单是否在云采签收 | `is_yc_receive` | String |
| 79 | `arrFileId` | 到货附件 | `arr_file_id` | String |
| 80 | `fileId` | 附件id | `file_id` | String |
| 81 | `purchaseOrgId` | 采购组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 82 | `projectDocId` | 项目档案id | `project_doc_id` | Long |
| 83 | `totalNum` | 总数量 | `total_num` | Decimal |
| 84 | `receivePersonName` | 收货人姓名 | `receive_person_name` | String |
| 85 | `supplierCode` | 供应商档案编码 | `supplier_code` | String |
| 86 | `createTime` | 创建时间 | `create_time` | DateTime |
| 87 | `tplid` | tplid | `tplid` | Long |
| 88 | `boxCodes` | 发货单关联箱码信息表 | `` | 9397b1fc-09b6-4642-8455-c1b43c282ab9 |
| 89 | `defines` | 表头自定义项 | `` | 2d685952-4f91-404f-95ef-808b94c8adf3 |
| 90 | `details` | 发货单详情 | `` | 8343f3b7-50ab-4dde-b761-a599b9bc6309 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 2 | `supplierid` | 供应商档案Id | `aa.vendor.Vendor` | Service |  |
| 3 | `deliveryOrderDefineCharacter` | 自定义项特征属性组 | `cpu-order.deliveryorder.DeliveryOrderHeaderDefine` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `purchaseOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 6 | `boxCodes` | 发货单关联箱码信息表 | `cpu-order.deliveryorder.DeliveryOrderBoxCodeVO` | None | true |
| 7 | `purEnterpriseId` | 采购商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 8 | `defines` | 表头自定义项 | `cpu-order.deliveryorder.DeliveryOrderVODefine` | None | true |
| 9 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 10 | `supEnterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 11 | `details` | 发货单详情 | `cpu-order.deliveryorder.DeliveryOrderDetailVO` | None | true |
| 12 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 13 | `transtypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
