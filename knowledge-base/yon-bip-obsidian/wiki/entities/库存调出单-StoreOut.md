---
tags: [BIP, 元数据, 数据字典, 库存调出单, ST, st.storeout.StoreOut]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调拨出库单主表 (`st.storeout.StoreOut`)

> ⚠️ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 库存（ST）模块库存调出单的完整元数据字典。
> 来源：元数据API返回的 `st.storeout.StoreOut` 实体完整定义。
> 物理表：`st_storeout` | 业务对象ID：`238956d2-4333-4f55-8abb-840d0c06b082`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 调拨出库单主表 |
| 描述 |  |
| 物理表 | `st_storeout` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 所属应用 | `ST` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 数据权限场景 | `bill_maintain` |
| 构建时间戳 | `1780449569003` |

## 部署信息

- **部署时间**: 2026-05-23 01:50:20:000
- **安装人**: mongoTools
- **安装排名**: `9ee9d952-d8bc-4021-94e8-0e2831142cc0`
- **安装来源**: `/app/newustock/src/yonbip-scm-scmf/scripts/db/patch/mongodb/V5_R0_2507/0002_stock/0010_iuap_common/DML/0270_iuap_metadata/202605/202604111251_metadata_st-storeout_delta.zip`

## 业务场景

- `econtract`
- `workflow`
- `DataAuth`
- `transtype`
- `isCoreBill`
- `cprk`
- `dataPrivacy`
- `userdefine`
- `classified`
- `prewarning`
- `FieldAuth`
- `print`
- `UITemplate`
- `report`
- `billcode`
- `ruleengine`
- `msgtemplate`
- `api`
- `bpm`

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 唯一标识 |

## 继承接口 (25个)

- **表头整单合计信息** (`st.voucher.IHeadTotalData`)
  - `fTotalQuantity` → `fTotalQuantity` (Real) 整单数量
- **事项交换** (`st.matterinfo.IMatterInfoAble`)
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date` (Date) 审批日期
  - `` → `` (String) 审批人名称
  - `` → `` (54800425-15da-4742-ae89-059d05e77c9b) 审批人
  - `audit_time` → `audit_time` (Timestamp) 审批时间
- **调拨信息** (`st.voucher.ITransfer`)
  - `breturn` → `breturn` (Boolean) 调拨退货
  - `iinaccount` → `iinaccount` (4ec9e266-1eae-4f78-b5e3-26c220a15d70) 调入会计主体
  - `iinbizperson` → `iinbizperson` (4effed83-35f5-4e3b-9be1-092b5ae602e8) 调入业务员
  - `iindepartmentid` → `iindepartmentid` (8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5) 调入部门
  - `iinorgid` → `iinorgid` (c1135e08-c4bf-4499-90bf-67030d1f2654) 调入组织
  - `iInWarehouseId` → `iInWarehouseId` (4256da1b-7d9f-49d6-b510-a05e771d17b0) 调入仓库
  - `imerchant` → `imerchant` (94b3280a-27a4-485a-b90b-b7bce57c6df2) 商家
  - `ioutaccount` → `ioutaccount` (4ec9e266-1eae-4f78-b5e3-26c220a15d70) 调出会计主体
  - `ioutbizperson` → `ioutbizperson` (4effed83-35f5-4e3b-9be1-092b5ae602e8) 调出业务员
  - `ioutdepartmentid` → `ioutdepartmentid` (8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5) 调出部门
  - `ioutorgid` → `ioutorgid` (c1135e08-c4bf-4499-90bf-67030d1f2654) 调出组织
  - `ioutwarehouseid` → `ioutwarehouseid` (4256da1b-7d9f-49d6-b510-a05e771d17b0) 调出仓库
- **表头整单件数合计信息** (`st.voucher.IHeadTotalPiece`)
  - `total_pieces` → `total_pieces` (Real) 整单件数
- **收货人信息** (`st.voucher.IReceiver`)
  - `cReceiveAddr` → `cReceiveAddr` (String) 收货人地址
  - `cReceiveMobile` → `cReceiveMobile` (String) 收货人电话
  - `cReceiver` → `cReceiver` (String) 收货人
  - `cReceiveZipCode` → `cReceiveZipCode` (String) 邮编
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID` (Long) 商家
- **门店相关** (`retail.voucher.IRetailStoreAll`)
- **库存接口_标识** (`st.internaltransaction.IInventorySign`)
  - `iInternalSign` → `iInternalSign` (Boolean) 是否走内部交易的标识
- **内部交易交换信息接口** (`st.inttradeinfo.IIntTradeinfo`)
- **业务流程信息接口** (`st.transferapply.IBizFlow`)
  - `` → `` (Short) 流程类型
- **奇门相关字段** (`voucher.st.QiMen`)
  - `wmsbillno` → `wmsbillno` (String) WMS单号
  - `wmscancelstatus` → `wmscancelstatus` (Short) WMS取消状态
  - `wmsinstatus` → `wmsinstatus` (Short) WMS转入状态
- **条形码** (`ucfbase.ucfbaseItf.IBarCode`)
  - `bar_code` → `bar_code` (String) 条形码
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId` (58dd3dad-7eb7-47ea-a5b1-1f89d1709528) 流程ID
  - `isFlowCoreBill` → `isFlowCoreBill` (Boolean) 是否流程核心单据
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → `` (Boolean) 是否审批流控制
  - `` → `` (Short) 退回次数
  - `` → `` (Short) 审批状态
- **过账信息** (`gscm.itf.IPostAccountInfo`)
  - `postAccountStatus` → `postAccountStatus` (Short) 过账状态
  - `postAccountVersion` → `postAccountVersion` (Long) 过账版本
- **外部系统** (`st.externalsystem.ExternalSystem`)
  - `externalSystem` → `externalSystem` (String) 外系统来源标识
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount` (Integer) 打印次数
- **会计事务过账信息-存货** (`gscm.interf.FiEventAccInfo`)
  - `fiEventAccountingDate` → `fiEventAccountingDate` (String) 会计事务记账日期
  - `fiEventCode` → `fiEventCode` (String) 会计事务类型编码
  - `fiEventDataId` → `fiEventDataId` (String) 会计事务数据ID
  - `fiEventId` → `fiEventId` (String) 会计事务类型ID
- **库存移动记录版本** (`st.billstate.ICertificateVersion`)
  - `certificate_version` → `certificate_version` (Long) 库存移动记录版本
- **出入库类型** (`st.billstate.IStockInOutType`)
  - `stock_in_out_type` → `stock_in_out_type` (Integer) 出入库类型
- **财务过账相关信息记录** (`gscm.interf.FiInfoRecord`)
  - `noPostReasonMsg` → `noPostReasonMsg` (String) 不过账原因信息
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id` (e4933a03-9dea-472b-a644-cdd654222f45) 租户id
- **库存是否更新存量标识接口** (`st.stockupdate.IStockUpdate`)
  - `isUpdateStock` → `isUpdateStock` (Boolean) 是否更新存量
- **奇门多次回传** (`voucher.st.QiMenMultiplePostback`)
  - `wmsUnique` → `wmsUnique` (String) wms回传唯一标识

## 子表 (6个)

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headParallel` | `st.storeout.StoreOutParallel` | composition (id) |
| `barcodeRecord` | `st.storeout.BarcodeRecord` | composition (vouchId) |
| `details` | `st.storeout.StoreOutDetail` | composition (mainid) |
| `headItem` | `st.storeout.StoreOutCustomItem` | composition (id) |
| `OutStoreLogistics` | `st.storeout.OutStoreLogistic` | composition (grandpaid) |
| `defines` | `st.storeout.StoreOutAttrextItem` | composition (id) |

## 服务引用（关联引用，34个）

| 字段名 | 引用类型 |
|--------|---------|
| `consignment_customer` | `` |
| `storeOutDefineCharacter` | `` |
| `ioutorgid` | `aa_orgstock` |
| `` | `bip-usercenter.aa_user` |
| `bizFlowId` | `u8c-baseservice.bf_businessFlow_ref` |
| `ioperatorid` | `ucf-staff-center.bd_staff_outer_ref` |
| `iinaccount` | `aa_orgtree` |
| `ioutdepartmentid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `write_off_reason` | `productcenter.aa_reasonref` |
| `iinstoreid` | `yxybase.aa_store` |
| `iindepartmentid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `tenant_id` | `` |
| `iinorgid` | `aa_orgstock` |
| `voucherType` | `` |
| `ioutaccount` | `aa_orgtree` |
| `ytenant_id` | `` |
| `ioutstoreid` | `yxybase.aa_store` |
| `iinbizperson` | `ucf-staff-center.bd_staff_outer_ref` |
| `ioutbizperson` | `ucf-staff-center.bd_staff_outer_ref` |
| `imerchant` | `` |
| `iStoreID` | `` |
| `ibustypeid` | `transtype.bd_billtyperef` |
| `outstorekeeperid` | `ucf-staff-center.bd_staff_outer_ref` |
| `iInWarehouseId` | `aa_warehouse` |
| `ioutwarehouseid` | `aa_warehouse` |
| `subcontractor` | `yssupplier.aa_vendor` |

## 完整字段列表

> 共 106 个直连字段 + 48 个继承字段

### 文本字段 (text) (26个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `externalSystem` | `externalSystem` | String | 外系统来源标识 | true | 50 |
| `write_off_upcode` | `write_off_upcode` | String | 冲销单据号 | true |  |
| `sign_for_billtype` | `sign_for_billtype` | String | 录入签收量单据 | true | 100 |
| `noPostReasonMsg` | `noPostReasonMsg` | String | 不过账原因信息 | true |  |
| `fiEventDataId` | `fiEventDataId` | String | 会计事务数据ID | true |  |
| `fiEventId` | `fiEventId` | String | 会计事务类型ID | true |  |
| `fiEventCode` | `fiEventCode` | String | 会计事务类型编码 | true |  |
| `fiEventAccountingDate` | `fiEventAccountingDate` | String | 会计事务记账日期 | true |  |
| `wmsUnique` | `wmsUnique` | String | wms回传唯一标识 | true | 255 |
| `` | `code` | String | 单据编号 | true | 50 |
| `bar_code` | `bar_code` | String | 单据条码 | true | 1024 |
| `cmemo` | `cmemo` | String | 备注 | true | 255 |
| `isrcbillid` | `isrcbillid` | String | 来源单据id | true | 50 |
| `csrcbillno` | `csrcbillno` | String | 来源单据 | true | 50 |
| `csrcbilltype` | `csrcbilltype` | String | 来源上级单据类型 | true | 30 |
| `` | `creator` | String | 创建人 | true | 255 |
| `` | `modifier` | String | 修改人 | true | 255 |
| `` | `auditor` | String | 提交人 | true | 255 |
| `cReceiveZipCode` | `cReceiveZipCode` | String | 邮编 | true | 20 |
| `cReceiveAddr` | `cReceiveAddr` | String | 收货人地址 | true | 255 |
| `cReceiveMobile` | `cReceiveMobile` | String | 收货人电话 | true | 60 |
| `cReceiver` | `cReceiver` | String | 收货人 | true | 60 |
| `wmsbillno` | `wmsbillno` | String | WMS单号 | true | 255 |
| `inTransit` | `inTransit` | String | 在途归属 | true | 255 |
| `contractStatus` | `contractStatus` | String | 与委外商协同状态 | true | 255 |
| `doc_busi_type` | `doc_busi_type` | String | 单据业务类型 | true |  |

### 引用字段 (quote) (27个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `` | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | 审批人 | true |  |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 | true |  |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 | true |  |
| `write_off_reason` | `write_off_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 | 冲销原因 | true |  |
| `consignment_customer` | `consignment_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 寄售客户 | true |  |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id | true | 36 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 | true |  |
| `ioutorgid` | `ioutorgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 | 调出组织 | true |  |
| `ioutaccount` | `ioutaccount` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | 调出会计主体id | true |  |
| `ibustypeid` | `ibustypeid` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 交易类型 | true |  |
| `imerchant` | `imerchant` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 商家 | true |  |
| `iStoreID` | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | 所属门店 | true |  |
| `ioutstoreid` | `ioutstoreid` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | 调出门店id | true |  |
| `ioutwarehouseid` | `ioutwarehouseid` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 调出仓库 | true |  |
| `iinstoreid` | `iinstoreid` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | 调入门店id | true |  |
| `iInWarehouseId` | `iInWarehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 调入仓库 | true |  |
| `voucherType` | `voucherType` | 4a227650-b866-4f4c-a6ca-2433297a1713 | 单据类型 | true |  |
| `iinorgid` | `iinorgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 | 调入组织 | true |  |
| `iinaccount` | `iinaccount` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | 调入会计主体id | true |  |
| `ioutdepartmentid` | `ioutdepartmentid` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | 调出部门 | true |  |
| `ioutbizperson` | `ioutbizperson` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 调出业务员 | true |  |
| `outstorekeeperid` | `outstorekeeperid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 调出库管员id | true |  |
| `iindepartmentid` | `iindepartmentid` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | 调入部门 | true |  |
| `iinbizperson` | `iinbizperson` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 调入业务员 | true |  |
| `ioperatorid` | `ioperatorid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 经办人id | true |  |
| `bizFlowId` | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | 流程ID | true |  |
| `subcontractor` | `subcontractor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | 委外商id | true |  |

### 日期字段 (date) (4个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `modify_date` | `modify_date` | Date | 修改日期 | true |  |
| `` | `vouchdate` | Date | 单据日期 | true |  |
| `create_date` | `create_date` | Date | 创建日期 | true |  |
| `audit_date` | `audit_date` | Date | 审批日期 | true |  |

### 布尔字段 (switch) (10个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `iInternalSign` | `iInternalSign` | Boolean | 是否走内部交易的标识 | false |  |
| `iscs` | `iscs` | Boolean | 是否寄售库存 | true |  |
| `is_finish` | `is_finish` | Boolean | 调入完成 | true |  |
| `isUpdateStock` | `isUpdateStock` | Boolean | 是否更新存量 | true |  |
| `` | `isWfControlled` | Boolean | 是否审批流控制 | true |  |
| `breturn` | `breturn` | Boolean | 调拨退货 | true |  |
| `isUpdateCost` | `isUpdateCost` | Boolean | 更新存货成本 | true |  |
| `isFlowCoreBill` | `isFlowCoreBill` | Boolean | 是否流程核心单据 | true |  |
| `isNeedSign` | `isNeedSign` | Boolean | 需要签收 | true |  |
| `isContract` | `isContract` | Boolean | 是否与委外商协同 | true |  |

### 整数字段 (int) (7个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `impact_stock_timing` | `impact_stock_timing` | Integer | 更新存量时机 | true |  |
| `already_update_stock` | `already_update_stock` | Integer | 已更新存量 | true |  |
| `impact_financial_timing` | `impact_financial_timing` | Integer | 传财务时机 | true |  |
| `already_update_financial` | `already_update_financial` | Integer | 已传财务 | true |  |
| `printCount` | `printCount` | Integer | 打印次数 | true |  |
| `stock_in_out_type` | `stock_in_out_type` | Integer | 出入库类型 | true | 6 |
| `manageintransit` | `manageintransit` | Integer | 管理在途 | true |  |

### 短整数字段 (short) (9个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `postAccountStatus` | `postAccountStatus` | Short | 过账状态 | true |  |
| `write_off_enable` | `write_off_enable` | Short | 启用冲销 | true |  |
| `write_off_status` | `write_off_status` | Short | 冲销状态 | true |  |
| `` | `verifystate` | Short | 审批状态 | true |  |
| `` | `returncount` | Short | 退回次数 | true |  |
| `` | `bizType` | Short | 自动调拨 | true |  |
| `` | `status` | Short | 单据状态 | true |  |
| `wmsinstatus` | `wmsinstatus` | Short | WMS转入状态 | true |  |
| `wmscancelstatus` | `wmscancelstatus` | Short | WMS取消状态 | true |  |

### 长整数字段 (long) (6个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `postAccountVersion` | `postAccountVersion` | Long | 过账版本 | true |  |
| `write_off_sourceid` | `write_off_sourceid` | Long | 冲销线索主表id | true |  |
| `certificate_version` | `certificate_version` | Long | 库存移动记录版本 | true |  |
| `iShopID` | `iShopID` | Long | 商家id | true |  |
| `id` | `id` | Long | ID | true |  |
| `` | `tplid` | Long | 模板id | true |  |

### 数值字段 (number) (6个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `expense_nat_sum` | `expense_nat_sum` | Decimal | 费用本币含税金额 | true | 38 |
| `expense_nat_money` | `expense_nat_money` | Decimal | 费用本币无税金额 | true | 38 |
| `expense_ori_sum` | `expense_ori_sum` | Decimal | 费用含税金额 | true | 38 |
| `expense_ori_money` | `expense_ori_money` | Decimal | 费用无税金额 | true | 38 |
| `total_pieces` | `total_pieces` | Decimal | 整单件数 | true | 19 |
| `fTotalQuantity` | `fTotalQuantity` | Decimal | 整单数量 | true | 19 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `storeOutDefineCharacter` | `storeOutDefineCharacter` | d8d80cf7-5c30-457f-991a-5674d6b291cf | 自定义项特征组 | true |  |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `create_time` | `create_time` | DateTime | 创建时间 | true |  |
| `modify_time` | `modify_time` | DateTime | 修改时间 | true |  |
| `audit_time` | `audit_time` | DateTime | 提交时间 | true |  |
| `pubts` | `pubts` | DateTime | 时间戳 | true |  |

### other (6个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `` | `` | cf2dd90e-39fe-4ee4-8c69-c142888d4e7f | 调拨出库物流信息 |  |  |
| `` | `` | f9845efe-abfc-4feb-9b46-a0ae0169c2c5 | 调出单扫描 |  |  |
| `` | `` | a8c8edb3-39a3-4d65-b141-186602569f13 | 调拨出库主表自由自定义项 |  |  |
| `` | `` | 115a7d25-c0a5-4953-975c-b3e50dbeb868 | 调拨出库单子表 |  |  |
| `` | `` | a27b3080-7caa-4f4f-a1f4-b5d5aaaeb27b | 调拨出库单主表自定义项 |  |  |
| `` | `` | 7512c4ac-967a-46e7-8f97-1f2ab8c68e4b | 调拨出库单主表平行表 |  |  |
