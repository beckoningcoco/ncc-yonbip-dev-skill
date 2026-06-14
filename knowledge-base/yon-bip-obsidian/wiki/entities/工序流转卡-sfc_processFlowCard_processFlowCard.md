---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.processFlowCard"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡 (`sfc.processFlowCard.processFlowCard`)

> IMPSFC | 物理表：`imp_sfc_procflowcard`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡 |
| 物理表 | `imp_sfc_procflowcard` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:22:32.0540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（117个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `barCode` | 条形码 | `bar_code` | String |
| 2 | `batch` | 生产批次 | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 3 | `batchNo` | 生产批次号 | `batch_no` | String |
| 4 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 5 | `cardType` | 卡类型 | `card_type` | Short |
| 6 | `define1` | 自定义项1 | `define1` | String |
| 7 | `define10` | 自定义项10 | `define10` | String |
| 8 | `define11` | 自定义项11 | `define11` | String |
| 9 | `define12` | 自定义项12 | `define12` | String |
| 10 | `define13` | 自定义项13 | `define13` | String |
| 11 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 12 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 13 | `verifystate` | 审批状态 | `verifystate` | Short |
| 14 | `returncount` | 退回次数 | `returncount` | Short |
| 15 | `printCount` | 打印次数 | `printCount` | Integer |
| 16 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 17 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 18 | `define14` | 自定义项14 | `define14` | String |
| 19 | `define15` | 自定义项15 | `define15` | String |
| 20 | `define16` | 自定义项16 | `define16` | String |
| 21 | `define17` | 自定义项17 | `define17` | String |
| 22 | `define18` | 自定义项18 | `define18` | String |
| 23 | `define19` | 自定义项19 | `define19` | String |
| 24 | `define2` | 自定义项2 | `define2` | String |
| 25 | `define20` | 自定义项20 | `define20` | String |
| 26 | `define21` | 自定义项21 | `define21` | String |
| 27 | `define22` | 自定义项22 | `define22` | String |
| 28 | `define23` | 自定义项23 | `define23` | String |
| 29 | `define24` | 自定义项24 | `define24` | String |
| 30 | `define25` | 自定义项25 | `define25` | String |
| 31 | `define26` | 自定义项26 | `define26` | String |
| 32 | `define27` | 自定义项27 | `define27` | String |
| 33 | `define28` | 自定义项28 | `define28` | String |
| 34 | `define29` | 自定义项29 | `define29` | String |
| 35 | `define3` | 自定义项3 | `define3` | String |
| 36 | `define30` | 自定义项30 | `define30` | String |
| 37 | `define4` | 自定义项4 | `define4` | String |
| 38 | `define5` | 自定义项5 | `define5` | String |
| 39 | `define6` | 自定义项6 | `define6` | String |
| 40 | `define7` | 自定义项7 | `define7` | String |
| 41 | `define8` | 自定义项8 | `define8` | String |
| 42 | `define9` | 自定义项9 | `define9` | String |
| 43 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 44 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 45 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 46 | `orderCode` | 生产订单编号 | `order_code` | String |
| 47 | `orderLineNo` | 生产订单产品行号 | `order_line_no` | Decimal |
| 48 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 49 | `source` | 上游单据类型 | `source` | String |
| 50 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 51 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 52 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 53 | `unitExchangeType` | 生产-主计量换算方式 | `unit_exchange_type` | Short |
| 54 | `upcode` | 上游单据号 | `upcode` | String |
| 55 | `auditDate` | 审批日期 | `audit_date` | Date |
| 56 | `status` | 状态 | `status` | Short |
| 57 | `auditor` | 审批人名称 | `auditor` | String |
| 58 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 59 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 60 | `createDate` | 创建日期 | `create_date` | Date |
| 61 | `creator` | 创建人名称 | `creator` | String |
| 62 | `dr` | 逻辑删除标识 | `dr` | Short |
| 63 | `materialId` | 制造物料 | `material_id` | Long |
| 64 | `modifier` | 修改人名称 | `modifier` | String |
| 65 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 66 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 67 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 68 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 9847a0bf-6899-4126-b8b9-a8daa439acff |
| 69 | `selfDefineCharacter` | 工序流转卡自定义项 | `self_define_character` | cb82032b-a1f9-4971-9ef8-350e3b9b58f1 |
| 70 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 71 | `tplid` | 模板id | `tplid` | Long |
| 72 | `unauditDate` | 弃审日期 | `unaudit_date` | Date |
| 73 | `unauditTime` | 弃审时间 | `unaudit_time` | DateTime |
| 74 | `unauditorId` | 弃审人 | `unauditor_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 75 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 76 | `id` | ID | `id` | Long |
| 77 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 78 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 79 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 80 | `code` | 编码 | `code` | String |
| 81 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 82 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 83 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 84 | `orderProductId` | 生产订单产品 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 85 | `processNum` | 加工数量 | `process_num` | Decimal |
| 86 | `prodUnitId` | 生产单位 | `prod_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 87 | `processType` | 加工类型 | `process_type` | Short |
| 88 | `pubts` | 时间戳 | `pubts` | DateTime |
| 89 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 90 | `planStartTime` | 计划开工时间 | `plan_start_time` | DateTime |
| 91 | `planEndTime` | 计划完工时间 | `plan_end_time` | DateTime |
| 92 | `remarks` | 备注 | `remarks` | String |
| 93 | `isHold` | 是否挂起 | `is_hold` | Short |
| 94 | `isClose` | 是否关闭 | `is_close` | Short |
| 95 | `holdUserId` | 挂起人 | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 96 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 97 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 98 | `holdReasonId` | 挂起原因 | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 99 | `closer` | 关闭人名称 | `closer` | String |
| 100 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 101 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 102 | `dataSource` | 数据来源 | `data_source` | Short |
| 103 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 104 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 105 | `createTime` | 创建时间 | `create_time` | DateTime |
| 106 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 107 | `ProcessFlowCardExt` | 工序流转卡扩展 | `` | c1fa56cd-69d3-4e4a-88ae-61ff42b0925a |
| 108 | `auxiliaryQty` | 加工件数 | `auxiliary_qty` | Decimal |
| 109 | `changeRate` | 生产换算率 | `change_rate` | Decimal |
| 110 | `changeRateDen` | 生产换算率分母 | `change_rateden` | Decimal |
| 111 | `changeRateNum` | 生产换算率分子 | `change_ratenum` | Decimal |
| 112 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 113 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 114 | `procFlowCardSuspend` | 工序流转卡挂起解除信息 | `` | 405c8e31-5113-40b9-b957-67284ac60de0 |
| 115 | `processFlowCardDefine` | 工序流转卡自由自定义项 | `` | 97842142-86e9-434f-915a-55bd5368268d |
| 116 | `processFlowCardPlan` | 工序流转卡工序 | `` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 117 | `processFlowCardUserDefine` | 工序流转卡固定自定义项 | `` | 3645ed70-eaa5-4fc3-8ba2-1c9a021c6232 |

---

## 关联属性（28个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `processFlowCardDefine` | 工序流转卡自由自定义项 | `sfc.processFlowCard.processFlowCardDefine` | None | true |
| 2 | `ProcessFlowCardExt` | 工序流转卡扩展 | `sfc.processFlowCard.ProcessFlowCardExt` | None | true |
| 3 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 4 | `processFlowCardPlan` | 工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 8 | `holdReasonId` | 挂起原因 | `aa.reason.Reason` | Service |  |
| 9 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 10 | `prodUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 11 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 12 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `unauditorId` | 弃审人 | `base.user.User` | Service |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 16 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 17 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 18 | `selfDefineCharacter` | 工序流转卡自定义项 | `sfc.processFlowCard.ProcessFlowCardSelfDefineCharacter` | None |  |
| 19 | `holdUserId` | 挂起人 | `base.user.User` | Service |  |
| 20 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 21 | `processFlowCardUserDefine` | 工序流转卡固定自定义项 | `sfc.processFlowCard.processFlowCardUserDefine` | None | true |
| 22 | `batch` | 生产批次 | `st.batchno.Batchno` | Service |  |
| 23 | `orderProductId` | 生产订单产品 | `po.order.OrderProduct` | Service |  |
| 24 | `procFlowCardSuspend` | 工序流转卡挂起解除信息 | `sfc.processFlowCard.procFlowCardSuspend` | None | true |
| 25 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 26 | `freeCharacteristics` | 自由项特征组 | `sfc.processFlowCard.ProcessFlowCardFreeCharacter` | None |  |
| 27 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 28 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
