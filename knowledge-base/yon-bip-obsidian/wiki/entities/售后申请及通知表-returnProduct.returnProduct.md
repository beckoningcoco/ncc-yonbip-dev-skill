---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "ycYuncaiMall.returnProduct.returnProduct"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 售后申请及通知表 (`ycYuncaiMall.returnProduct.returnProduct`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`return_product` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `ycYuncaiMall.returnProduct.returnProduct` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 售后申请及通知表 |
| 物理表 | `return_product` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `224aef88-b911-4730-8ddf-12790775a324` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:53.8390` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` |  |  |

## 部署信息

- **部署时间**: 2025-10-24 23:19:32:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202508071022_metadata_ycYuncaiMall-returnProduct.zip`
- **安装人**: mongoTools
- **安装排名**: `41e86e97-70f8-47b0-8518-f1e389b34304`

## 术语标记

`BusinessData`, `newFKRule`

## 约束

- **bizUniqueIndex_transformKey** (transformKey): 主键 — 唯一字段: `['id']`
- **bizUniqueIndex** (Unique): 主键 — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `iuap.busiObj.IYTenant` | 214 | 1 |

---

## 直接属性（共 56 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `afterSaleInfo` | afterSaleInfo | `AFTER_SALE_INFO` | String | `text` |  | ✓ |
| 2 | `applySign` | applySign | `APPLY_SIGN` | String | `text` |  | ✓ |
| 3 | `applyType` | applyType | `APPLY_TYPE` | String | `text` | ✓ |  |
| 4 | `arrvCode` | arrvCode | `ARRV_CODE` | String | `text` |  | ✓ |
| 5 | `arrvId` | 到货单ID | `ARRV_ID` | Long | `long` |  | ✓ |
| 6 | `arrvStatus` | arrvStatus | `ARRV_STATUS` | String | `text` |  | ✓ |
| 7 | `assignPurorgId` | 采购组织id | `assign_purorg_id` | String | `text` |  | ✓ |
| 8 | `assignPurorgName` | 采购组织名称 | `assign_purorg_name` | String | `text` |  | ✓ |
| 9 | `buyerTenantId` | 采购商租户id | `buyer_tenant_id` | String | `text` |  | ✓ |
| 10 | `canCancel` | canCancel | `CAN_CANCEL` | Integer | `int` |  | ✓ |
| 11 | `createtime` | createtime | `CREATETIME` | Date | `dateTime` | ✓ |  |
| 12 | `customerInfo` | customerInfo | `CUSTOMER_INFO` | String | `text` |  | ✓ |
| 13 | `deliveryCode` | deliveryCode | `DELIVERY_CODE` | String | `text` |  | ✓ |
| 14 | `deliveryId` | 发货单id | `DELIVERY_ID` | Long | `long` |  | ✓ |
| 15 | `dr` | dr | `DR` | Integer | `int` | ✓ |  |
| 16 | `ecDeliverId` | ecDeliverId | `EC_DELIVER_ID` | String | `text` |  | ✓ |
| 17 | `enterpriseId` | 采购商企业ID | `ENTERPRISE_ID` | Long | `long` |  | ✓ |
| 18 | `enterpriseName` | enterpriseName | `ENTERPRISE_NAME` | String | `text` |  | ✓ |
| 19 | `gwType` | gwType | `GW_TYPE` | String | `text` |  | ✓ |
| 20 | `hasPackage` | hasPackage | `HAS_PACKAGE` | Integer | `int` |  | ✓ |
| 21 | `id` | id | `ID` | Long | `long` | ✓ |  |
| 22 | `isReturnCarriage` | 是否退运费 | `is_return_carriage` | Integer | `int` |  | ✓ |
| 23 | `memo` | memo | `MEMO` | String | `text` |  | ✓ |
| 24 | `needDetectReport` | needDetectReport | `NEED_DETECT_REPORT` | Integer | `int` |  | ✓ |
| 25 | `needRetinfo` | needRetinfo | `NEED_RETINFO` | Integer | `int` |  | ✓ |
| 26 | `operatingOrderType` | 订单运营类型 | `operating_order_type` | String | `text` |  | ✓ |
| 27 | `operatingOrgId` | 运营组织 | `operating_org_id` | String | `text` |  | ✓ |
| 28 | `operatingOrgName` | 运营组织名称 | `operating_org_name` | String | `text` |  | ✓ |
| 29 | `orderCode` | orderCode | `ORDER_CODE` | String | `text` |  | ✓ |
| 30 | `orderId` | 超市订单ID | `ORDER_ID` | Long | `long` |  | ✓ |
| 31 | `originTotalPrice` | 原始售后金额 | `origin_total_price` | Decimal | `number` |  | ✓ |
| 32 | `outerId` | outerId | `OUTER_ID` | String | `text` |  | ✓ |
| 33 | `packageDesc` | packageDesc | `PACKAGE_DESC` | String | `text` |  | ✓ |
| 34 | `pickProdInfo` | pickProdInfo | `PICK_PROD_INFO` | String | `text` |  | ✓ |
| 35 | `processInfo` | processInfo | `PROCESS_INFO` | String | `text` |  | ✓ |
| 36 | `questionPic` | questionPic | `QUESTION_PIC` | String | `text` |  | ✓ |
| 37 | `refundInfo` | refundInfo | `REFUND_INFO` | String | `text` |  | ✓ |
| 38 | `returnCarriage` | 运费金额 | `return_carriage` | Decimal | `number` |  | ✓ |
| 39 | `returnLogisticalInfo` | returnLogisticalInfo | `RETURN_LOGISTICAL_INFO` | String | `text` |  | ✓ |
| 40 | `returnProdInfo` | returnProdInfo | `RETURN_PROD_INFO` | String | `text` |  | ✓ |
| 41 | `rpCode` | rpCode | `RP_CODE` | String | `text` | ✓ |  |
| 42 | `saleOrderCode` | saleOrderCode | `SALE_ORDER_CODE` | String | `text` |  | ✓ |
| 43 | `saleOrderId` | 销售订单id | `SALE_ORDER_ID` | Long | `long` |  | ✓ |
| 44 | `showOperateOrg` | 是否显示供应商 | `show_operate_org` | Integer | `int` |  | ✓ |
| 45 | `status` | status | `STATUS` | String | `text` |  | ✓ |
| 46 | `supplierId` | 供应商企业ID | `SUPPLIER_ID` | Long | `long` | ✓ |  |
| 47 | `supplierName` | supplierName | `SUPPLIER_NAME` | String | `text` |  | ✓ |
| 48 | `supplierPhone` | supplierPhone | `SUPPLIER_PHONE` | String | `text` |  | ✓ |
| 49 | `timeRec` | timeRec | `TIME_REC` | String | `text` |  | ✓ |
| 50 | `totalPrice` | 总金额 | `total_price` | Decimal | `number` |  | ✓ |
| 51 | `trackInfo` | trackInfo | `TRACK_INFO` | String | `text` |  | ✓ |
| 52 | `ts` | ts | `TS` | Date | `dateTime` | ✓ |  |
| 53 | `userId` | 采购用户ID | `USER_ID` | Long | `long` |  | ✓ |
| 54 | `vendorTenantId` | vendorTenantId | `vendor_tenant_id` | String | `text` |  | ✓ |
| 55 | `workInfo` | workInfo | `WORK_INFO` | String | `text` |  | ✓ |
| 56 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | ✓ |

---

## 关联属性（共 1 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenantId` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
