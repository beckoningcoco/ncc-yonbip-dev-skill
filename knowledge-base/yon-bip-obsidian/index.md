# 知识库索引

> 最后更新：2026-06-03 | 素材：848 篇 | 摘要：311 | 实体：934 | 主题：6
> 主要平台版本：BIP V5（旗舰版）、NCC 2111 / 2312
> 
> 所有页面已按 `platform_version` 字段标注适用版本。查阅时注意版本差异——不同版本的同名 API 行为可能不同。

---

## 实体页

### 平台概念
- [[低代码开发]] — 可视化构建+可视化扩展，仅公有云
- [[可视化应用构建]] — 低代码新建应用（应用建模）
- [[可视化应用扩展]] — 打开原厂应用进行个性化扩展
- [[原厂单据扩展开发]] — 字段/动作/脚本/流程多维度扩展

### 前端开发
- [[保存事件]] — beforeSave/afterSave 事件处理
- [[按钮点击事件]] — 按钮交互事件模式
- [[字段值改变]] — afterValueChange/beforeValueChange 事件
- [[API调用]] — DynamicProxy、invokeFunction、AbstractAPIHandler
- [[搜索查询]] — FilterViewModel + YonQL 查询
- [[状态控制]] — 字段/按钮/表格行级动态控制
- [[页面生命周期]] — customInit → afterMount → modeChange
- [[参照弹窗]] — setFilter/setTreeFilter、拦截、回填
- [[页面跳转]] — runCommandLine、模态框通信

### 后端开发
- [[专业开发]] — YonBuilder 专业开发产品概述、技术栈、项目结构
- [[YDS工具]] — YDS IDE：引擎创建、调试方式、关键端口
- [[YonbipUtil]] — BIP OpenAPI 调用中心，doPost/doGet 封装
- [[IBillQueryRepository]] — QuerySchema 查询模式
- [[SuperDO]] — 实体基类 + @YMSEntity + ILogicDelete
- [[BillPlugin扩展]] — beforeSave/afterSave/afterAudit 钩子
- [[IYpdCommonRul规则]] — 审核后自动触发规则
- [[BusinessConvertService]] — 推单/生单转换服务
- [[对照表模式]] — 外部编码→BIP ID 映射翻译

### 基础设施
- [[日志记录]] — BIP 客开代码中的日志记录与查看
- [[yht_access_token]] — 友互通访问令牌及其获取方式
- [[环境搭建]] — BIP IDEA/YDS 环境搭建方案
- [[客开赋能工作台]] — 客开知识文档+视频快捷通道

### 数据字典 ⚡ BIP 旗舰版 V5

> 以下所有实体元数据均来源于 BIP 旗舰版（YonBIP）API，**不适用于 NCC / NC Cloud**。

#### 销售订单主表
- [[销售订单元数据]] — `voucher.order.Order` 主表 `orders`：212 字段 + 52 关联 + 16 接口

#### 订单明细
- [[销售订单-OrderDetail]] — `voucher.order.OrderDetail` 明细表 `orderdetail`：324 字段 + 50 关联（最大子表）
- [[销售订单-OrderDetailGroup]] — `voucher.order.OrderDetailGroup` 明细组 `orderdetailgroup`：34 字段 + 2 关联

#### 订单价格
- [[销售订单-OrderPrice]] — `voucher.order.OrderPrice` 多价格表 `orders_price`：86 字段 + 10 关联

#### 状态与审批
- [[销售订单-OrderStatus]] — `voucher.order.OrderStatus` 状态历史 `orderstatus`：17 字段 + 2 关联
- [[销售订单-OrderPaymentStatus]] — `voucher.order.OrderPaymentStatus` 支付状态 `orderpaymentstatus`：15 字段 + 2 关联
- [[销售订单-OrderIBpmStep]] — `voucher.order.OrderIBpmStep` 业务阶段 `order_ibpmstep`：12 字段 + 3 关联
- [[销售订单-IBpmCurrentAuditorOrder]] — `voucher.order.IBpmCurrentAuditorOrder` 当前审批人 `order_ibpmcurauditor`：17 字段 + 3 关联

#### 收款与核销
- [[销售订单-PaymentSchedules]] — `voucher.order.PaymentSchedules` 收款计划 `paymentschedules`：45 字段 + 6 关联
- [[销售订单-PaymentExeDetail]] — `voucher.order.PaymentExeDetail` 收款执行明细 `paymentexedetail`：72 字段 + 7 关联
- [[销售订单-PaymentVerification]] — `voucher.order.PaymentVerification` 支付核验 `paymentverification`：37 字段 + 8 关联

#### 返利
- [[销售订单-RebateSum]] — `voucher.order.RebateSum` 返利汇总 `orderrebatesum`：8 字段 + 2 关联
- [[销售订单-RebateDetail]] — `voucher.order.RebateDetail` 返利明细 `orderrebatedetail`：20 字段 + 4 关联
- [[销售订单-RebateRecord]] — `voucher.order.RebateRecord` 返利记录 `orderrebaterecord`：10 字段 + 4 关联
- [[销售订单-ProductRebateRecord]] — `voucher.order.ProductRebateRecord` 产品返利记录 `orderproductrebaterecord`：20 字段 + 11 关联

#### 合同与签署
- [[销售订单-SignSubject]] — `voucher.order.SignSubject` 签署主体 `order_signsubject`：18 字段 + 5 关联

#### 合同管理 (CLM) 🆕
- [[合同登记元数据]] — `CLM.clmContract.clm_contract` 主表 `clm_contract`：143 字段 + 11 子表
  - [[contract-clm_contract_item]] — 合同标的物 `clm_contract_item`：46 字段
  - [[contract-clm_contract_counterpart]] — 合同相对方 `clm_contract_counterpart`：32 字段
  - [[contract-clm_contract_payterm]] — 付款协议 `clm_contract_payterm`：41 字段
  - [[contract-clm_contract_recterm]] — 收款协议 `clm_contract_recterm`：42 字段
  - [[contract-clm_appointment]] — 履约事项 `clm_appointment`：29 字段
  - [[contract-clm_contract_status_flow]] — 合同状态流水 `clm_contract_status_flow`：16 字段
  - [[contract-clmContractRiskRecord]] — 合同风险记录 `clm_contract_riskrecord`：14 字段
  - [[contract-clmEventRecord]] — 大事记信息 `clm_event_record`：26 字段
  - [[contract-clmContractBpmStep]] — 合同审批业务阶段 `clm_contract_bpmstep`：15 字段
  - [[contract-clmContractWorkflow]] — 合同审批任务 `clm_contract_workflow`：25 字段
  - [[contract-foodList]] — 食物清单 `clm_foodlist`：10 字段
  - [[contract-clmContractIntegrateConfig]] — 合同集成配置 `clm_contract_integrate_config`：16 字段
    - [[contract-clmContractIntegrateOption]] — 集成选项 `clm_contract_integrate_option`：11 字段
  - [[contract-clmAuditSchemaResult]] — 审批结果 `clm_audit_schema_result`：20 字段
    - [[contract-clmAuditSchemaResultDetail]] — 审批结果明细 `clm_audit_schema_result_detail`：19 字段
  - [[contract-clmContractConfiguration]] — 合同项配置 `clm_contract_configuration`：20 字段
    - [[contract-clmContractConfiguration_transTypeId]] — 配置交易类型 `clm_contract_configuration_transtype`：10 字段

#### 库存管理 (ST) 🆕
- [[st_stockConfigMsg_StockConfigMsg]] — 库存配置消息 `st_stockconfigmsg`：6 字段
- [[st_availablerule_AvailableCalcRule]] — 可用量计算规则 `st_availablecalcrules`：50 字段
- [[st_morphologyConversion_MorphologyConversion]] — 形态转换 `st_morphology_conversion`：57 字段
- [[stock_currentstock_CurrentStock]] — 现存量 `stock_currentstock`：110 字段
- [[st_standingbookdetail_StandingBookDetailReport]] — 台账明细报表 `st_standingbookdetail`：7 字段
- [[sn_serialnumber_SNstateReport]] — 序列号状态报表 `sn_serialnumber`：65 字段
- [[st_wareandinv_WareLook]] — 仓库查询 `st_ware_look`：22 字段
- [[st_wareandinv_WareGroupLook]] — 仓库组查询 `st_ware_group_look`：13 字段
- [[st_storein_StoreIn]] — 入库单 `st_storein`：95 字段
- [[st_storeout_StoreOut]] — 出库单 `st_storeout`：**已有**
- [[st_materialout_MaterialOut]] — 材料出库 `st_materialout`：92 字段
- [[st_salesout_SalesOut]] — 销售出库 `st_salesout`：**已有**
- [[st_osminrecord_OsmInRecord]] — 其他入库 `st_osm_in_record`：117 字段
- [[st_othoutrecord_OthOutRecord]] — 其他出库 `st_oth_out_record`：92 字段
- [[st_storetrans_StoreTrans]] — 库存调拨 `st_store_trans`：54 字段
- [[st_transferapply_TransferApply]] — 调拨申请 `st_transfer_apply`：93 字段
- [[st_demandapply_DemandApply]] — 需求申请 `st_demand_apply`：75 字段
- [[st_pickingrequisition_PickingRequisition]] — 领料申请 `st_picking_requisition`：57 字段
- [[st_returnapply_ReturnApply]] — 退货申请 `st_return_apply`：35 字段
- [[st_storenotice_StoreNotice]] — 库存通知 `st_storenotice`：62 字段
- [[st_storeprorecord_StoreProRecord]] — 库存加工记录 `st_store_pro_record`：83 字段
- [[st_stockstatuschange_StockStatusChange]] — 库存状态变更 `st_stock_status_change`：45 字段
- [[st_goodchange_GoodChange]] — 货物变更 `st_good_change`：41 字段
- [[st_storescrapped_StoreScrapped]] — 库存报废 `st_store_scrapped`：43 字段
- [[st_storecheck_StoreCheck]] — 库存盘点 `st_storecheck`：4 字段
- [[st_storecheckplan_StoreCheckPlan]] — 盘点计划 `st_storecheckplan`：54 字段
- [[st_storecheckprepare_StoreCheckPrepare]] — 盘点准备 `st_storecheckprepare`：3 字段
- [[st_storecheckreality_StoreCheckReality]] — 盘点实盘 `st_storecheckreality`：55 字段
- [[st_storecheckdifference_StoreCheckDifference]] — 盘点差异 `st_storecheckdifference`：49 字段
- [[st_inventoryclosing_InventoryClosing]] — 库存关账 `st_inventoryclosing`：15 字段
- [[uscmf_lendrecord_LendRecord]] — 借出记录 `uscmf_lend_record`：56 字段

#### 附件与线索
- [[销售订单-OrderAttachment]] — `voucher.order.OrderAttachment` 附件 `orderattachment`：20 字段 + 2 关联
- [[销售订单-ClueParticipant]] — `voucher.order.ClueParticipant` 线索参与人 `cust_relateperson`：14 字段 + 6 关联

#### 自定义项（已废弃）
- [[销售订单-OrderDefine]] — `voucher.order.OrderDefine` 头自定义 ⚠️ 已废弃：66 字段 + 2 关联
- [[销售订单-OrderFreeDefine]] — `voucher.order.OrderFreeDefine` 头自由定义 ⚠️ 已废弃：64 字段 + 2 关联

### 基础数据字典 ⚡ BIP 旗舰版 V5

> 从销售订单元数据外部引用追踪到的关联实体，共 64 个，分布于 18 个模块。**仅适用于旗舰版，不适用于 NCC。**

#### 客户/门店/结算/发运 (aa)
- [[元数据-aa_merchant_Merchant]] — `aa.merchant.Merchant` | 客户 `merchant` | 132 字段 + 52 关联
- [[元数据-aa_merchant_Contacter]] — `aa.merchant.Contacter` | 联系人 `contacter` | 27 字段 + 5 关联
- [[元数据-aa_merchant_AddressInfo]] — `aa.merchant.AddressInfo` | 地址 `addressinfo` | 34 字段 + 8 关联
- [[元数据-aa_merchant_MerchantApplyRange]] — `aa.merchant.MerchantApplyRange` | 适用范围 `merchantapplyrange` | 28 字段 + 12 关联
- [[元数据-aa_store_Store]] — `aa.store.Store` | 门店 `mp_store` | 102 字段 + 31 关联
- [[元数据-aa_warehouse_Warehouse]] — `aa.warehouse.Warehouse` | 仓库 `aa_warehouse` | 52 字段 + 16 关联
- [[元数据-aa_salearea_SaleArea]] — `aa.salearea.SaleArea` | 销售区域 `aa_salearea` | 32 字段 + 9 关联
- [[元数据-aa_settlemethod_SettleMethod]] — `aa.settlemethod.SettleMethod` | 结算方式 `settle_method` | 30 字段 + 7 关联
- [[元数据-aa_sendtrans_SendTransWay]] — `aa.sendtrans.SendTransWay` | 发运方式 `aa_sendtransway` | 22 字段 + 5 关联

#### 产品/品牌/单位/分类 (pc)
- [[元数据-pc_product_Product]] — `pc.product.Product` | 产品 `product` | 116 字段 + 55 关联
- [[元数据-pc_product_ProductSKU]] — `pc.product.ProductSKU` | SKU `productsku` | 70 字段 + 25 关联
- [[元数据-pc_unit_Unit]] — `pc.unit.Unit` | 计量单位 `unit` | 31 字段 + 6 关联
- [[元数据-pc_brand_Brand]] — `pc.brand.Brand` | 品牌 `brand` | 40 字段 + 9 关联
- [[元数据-pc_productline_ProductLine]] — `pc.productline.ProductLine` | 产品线 `productline` | 13 字段 + 4 关联
- [[元数据-pc_cls_PresentationClass]] — `pc.cls.PresentationClass` | 产品分类 `product_presentation_class` | 51 字段 + 12 关联

#### 组织架构 (org.func)
- [[元数据-org_func_BaseOrg]] — `org.func.BaseOrg` | 基础组织 `org_orgs` | 125 字段 + 50 关联
- [[元数据-org_func_SalesOrg]] — `org.func.SalesOrg` | 销售组织 `org_sales` | 78 字段 + 14 关联
- [[元数据-org_func_FinanceOrg]] — `org.func.FinanceOrg` | 财务组织 `org_fin` | 86 字段 + 15 关联
- [[元数据-org_func_PurchaseOrg]] — `org.func.PurchaseOrg` | 采购组织 `org_purchase` | 80 字段 + 15 关联
- [[元数据-org_func_InventoryOrg]] — `org.func.InventoryOrg` | 库存组织 `org_inventory` | 78 字段 + 15 关联
- [[元数据-org_func_LogisticsOrg]] — `org.func.LogisticsOrg` | 物流组织 `org_logistics` | 78 字段 + 14 关联

#### 基础数据 (bd)
- [[元数据-bd_staff_Staff]] — `bd.staff.Staff` | 员工 `bd_staff` | 80 字段 + 31 关联
- [[元数据-bd_project_ProjectVO]] — `bd.project.ProjectVO` | 项目 `bd_project` | 44 字段 + 14 关联
- [[元数据-bd_bill_TransType]] — `bd.bill.TransType` | 交易类型 `bd_transtype` | 38 字段 + 4 关联
- [[元数据-bd_adminOrg_DeptOrgVO]] — `bd.adminOrg.DeptOrgVO` | 部门 `org_admin` | 83 字段 + 18 关联
- [[元数据-bd_invoice_InvoiceTypeVO]] — `bd.invoice.InvoiceTypeVO` | 发票类型 `bd_invoice_type` | 19 字段 + 4 关联
- [[元数据-bd_receivables_ReceiveAgreement]] — `bd.receivables.ReceiveAgreement` | 收款协议 `bd_receiveagreement` | 31 字段 + 8 关联
- [[元数据-bd_receivables_ReceiveStartBase]] — `bd.receivables.ReceiveStartBase` | 收款起始基准 `bd_receivestartbase` | 19 字段 + 3 关联
- [[元数据-bd_receivables_AccountType]] — `bd.receivables.AccountType` | 账户类型 无物理表 | 0 字段
- [[元数据-bd_receivables_DateUnit]] — `bd.receivables.DateUnit` | 日期单位 无物理表 | 0 字段
- [[元数据-bd_receivables_PreReceiveType]] — `bd.receivables.PreReceiveType` | 预收款类型 无物理表 | 0 字段
- [[元数据-bd_currencytenant_CurrencyTenantVO]] — `bd.currencytenant.CurrencyTenantVO` | 币种 `bd_currency_tenant` | 28 字段 + 3 关联
- [[元数据-bd_exchangeRate_ExchangeRateTypeVO]] — `bd.exchangeRate.ExchangeRateTypeVO` | 汇率类型 `bd_exchangerate_type` | 28 字段 + 4 关联
- [[元数据-bd_costcenter_CostCenter]] — `bd.costcenter.CostCenter` | 成本中心 `bd_costcenter` | 47 字段 + 20 关联
- [[元数据-bd_businessstep_BusinessStep]] — `bd.businessstep.BusinessStep` | 业务步骤 `bd_business_step` | 26 字段 + 6 关联
- [[元数据-bd_virtualaccbody_VirtualAccbody]] — `bd.virtualaccbody.VirtualAccbody` | 虚拟核算主体 `bd_virtualaccbody` | 49 字段 + 18 关联

#### 平台基础 (base)
- [[元数据-base_user_User]] — `base.user.User` | 用户 `user` | 64 字段 + 10 关联
- [[元数据-base_user_BipUser]] — `base.user.BipUser` | BIP用户 `ba_user` | 17 字段 + 5 关联
- [[元数据-base_tenant_Tenant]] — `base.tenant.Tenant` | 租户 `tenant` | 36 字段 + 1 关联
- [[元数据-base_shipregion_ShipRegion]] — `base.shipregion.ShipRegion` | 发货区域 `base_shipregion` | 20 字段 + 6 关联
- [[元数据-base_loadway_LoadWay]] — `base.loadway.LoadWay` | 装载方式 `base_loadway` | 19 字段 + 5 关联

#### 返利/付款 (voucher)
- [[元数据-voucher_rebate_Rebate]] — `voucher.rebate.Rebate` | 返利 `rebate` | 93 字段 + 18 关联
- [[元数据-voucher_rebate_RebateReturnProduct]] — `voucher.rebate.RebateReturnProduct` | 返利退货 `rebateReturnProduct` | 43 字段 + 15 关联
- [[元数据-voucher_rebate_RebateShareSetting]] — `voucher.rebate.RebateShareSetting` | 返利分摊 `udh_rebatesharesetting` | 30 字段 + 9 关联
- [[元数据-voucher_upaymentvoucher_PaymentVoucher]] — `voucher.upaymentvoucher.PaymentVoucher` | 付款单 `paymentvoucher` | 78 字段 + 3 关联
- [[元数据-voucher_upaymentvoucher_PaymentVoucherDetail]] — `voucher.upaymentvoucher.PaymentVoucherDetail` | 付款明细 `paymentvoucherdetail` | 33 字段 + 3 关联

#### 物流/库存/其他 (usp/st/sccs/...)
- [[元数据-usp_deliverymethod_Deliverymethod]] — `usp.deliverymethod.Deliverymethod` | 交货方式 `usp_deliverymethod` | 19 字段 + 5 关联
- [[元数据-usp_plantransportroute_PlanTransportRoute]] — `usp.plantransportroute.PlanTransportRoute` | 运输路线 `usp_plantransportroute` | 28 字段 + 7 关联
- [[元数据-usp_sendAndReceiveSite_SendAndReceiveSite]] — `usp.sendAndReceiveSite.SendAndReceiveSite` | 收发站点 `usp_sendandreceivesite` | 23 字段 + 5 关联
- [[元数据-st_batchno_Batchno]] — `st.batchno.Batchno` | 批次 `batchno` | 72 字段 + 17 关联
- [[元数据-st_reservation_Reservation]] — `st.reservation.Reservation` | 预约 `st_reservation` | 34 字段 + 14 关联
- [[元数据-sccs_multitrade_TradeRoute]] — `sccs.multitrade.TradeRoute` | 贸易路线 `scmmp_traderoute` | 33 字段 + 5 关联
- [[元数据-archive_taxArchives_TaxRateArchive]] — `archive.taxArchives.TaxRateArchive` | 税率档案 `bd_taxrate` | 44 字段 + 10 关联
- [[元数据-ec_suiteGoodsInfo_EcSuiteGoods]] — `ec.suiteGoodsInfo.EcSuiteGoods` | 套件商品 `ec_suite_goods` | 20 字段 + 9 关联
- [[元数据-sa_agent_AgentProductRelation]] — `sa.agent.AgentProductRelation` | 客户产品关系 `agentproductrelation` | 46 字段 + 20 关联
- [[元数据-vc_variantConfiguration_VariantConfiguration]] — `vc.variantConfiguration.VariantConfiguration` | 变体配置 `vc_variant_configuration` | 39 字段 + 12 关联
- [[元数据-bf_bizflow_BusinessFlow]] — `bf.bizflow.BusinessFlow` | 业务流程 `business_flow` | 5 字段 + 1 关联
- [[元数据-pgrm_projecttask_ProjectScheduleTask]] — `pgrm.projecttask.ProjectScheduleTask` | 项目任务 `pgrm_activity` | 81 字段 + 22 关联
- [[元数据-yht_tenant_YhtTenant]] — `yht.tenant.YhtTenant` | 友互通租户 `pub_tenant` | 1 字段
- [[元数据-BGDM_wbs_doc]] — `BGDM.wbs.wbs.doc` | WBS文档 `bgdm_wbs_doc` | 62 字段 + 15 关联
- [[元数据-BGDM_milestones_milepost]] — `BGDM.milestones.project.milepost` | 里程碑 `bgdm_project_milepost` | 29 字段 + 9 关联
- [[元数据-BGDM_wbs_projectStructureProperties]] — `BGDM.wbs.projectStructureProperties` | 项目结构属性 | 2 字段
- [[元数据-pb_dataauth_MerchantAuthDataAuth]] — `pb.dataauth.MerchantAuthDataAuth` | 客户数据权限 | 1 字段
- [[元数据-pb_dataauth_ProductDataAuth]] — `pb.dataauth.ProductDataAuth` | 产品数据权限 | 1 字段

---

## 主题页

| 主题 | 涵盖内容 |
|------|----------|
| [[旗舰版开发基础]] | 环境搭建、日志、Token 认证、数据库、YMS 配置 |
| [[页面脚本]] | 9 个代码片段合集：保存/按钮/字段/搜索/API/状态/生命周期/参照/跳转 |
| [[BIP后端开发模板]] | BIP V5 后端客开代码模板：OpenAPI/查询/实体/插件/规则/推单 |
| [[问题处理]] | 启动报错、API 报错、影像上传、权限、界面问题等 |
| [[低代码开发体系]] | 低代码开发完整能力体系：概念→架构→模块→流程→学习路径 |
| [[BIP核心概念术语]] | 19 个平台核心术语官方定义速查 |

---

## 素材摘要

### 一、平台概念与概览

- [[2026-05-29-低代码开发能力介绍]] — 低代码开发能力总览：19 个核心名词、11 大能力模块、适用场景、架构、学习路径

#### 开发平台
- [[2026-05-28-bip-dev-overview]] — DEV 开发平台课件（97 页）：零代码/低代码/专业开发三种模式、同源架构、AI 辅助开发
- [[2026-05-28-bip-ybdkfnl1]] — YonBuilder开发能力（12K 字）：低代码开发全生命周期能力概览
- [[2026-05-28-bip-ybdyygj11]] — YonBuilder应用构建（47K 字）：实体建模到页面组装全流程

#### 开发框架
- [[2026-05-28-bip-dev-framework]] — 开发框架（MDF/YNF/MDD/YPD）四大框架对比
- [[2026-05-28-bip-pro-dev-intro]] — 专业开发介绍：产品概述、术语、技术架构、项目结构、开发流程
- [[2026-05-28-bip-dev-system]] — 开发体系总览：YDS模式、远程/本地调试、API网关、集成总线
- [[2026-05-28-bip-hdbcmx11]] — 后端编程模型（66K 字最大篇）：基于 Spring 的 BIP 后端开发架构

#### 升级版
- [[2026-05-29-应用构建升级版快速入门]] — 智能生成表单、数据驱动建模、业务流/工作流
- [[2026-05-30-应用构建升级版操作指南]] — 零代码/低代码/专业开发三模式协同
- [[2026-05-30-应用构建升级版开发指南]] — 升级版开发完整指南

---

### 二、环境与入门

#### 环境准备
- [[2026-05-29-环境准备]] — 产品规格（低代码/沙箱）、节点权限、6大中心地址、5 FAQ
- [[2026-05-28-bip-env-prep]] — 环境准备说明：四种部署方案、hosts配置、公有云沙箱
- [[2026-05-27-env-setup]] — 旗舰版环境搭建
- [[2026-05-28-bip-yds-setup]] — 基于YDS环境搭建(BIP5)：引擎创建、RDBGA调试
- [[2026-05-28-bip-upgrade-yds]] — 升级到YDS：前后端脚手架搭建、ynpm/Maven配置
- [[2026-05-28-bip-ynf-env-setup]] — YNF 前端环境搭建：ynf-dx-cli 脚手架

#### 入门文档
- [[2026-05-30-入门必读]] — 低代码开发入门必读概念和注意事项
- [[2026-05-30-入门必读-后端]] — 专业开发后端入门必读
- [[2026-05-28-bip-dev-entry]] — 单据开发入门：对象建模、页面建模、62 张截图
- [[2026-05-28-bip-zerocode-dev]] — 零代码开发用户手册（29 页）
- [[2026-05-28-bip-lowcode-dev]] — 低代码开发用户手册（57 页 PDF）
- [[2026-05-28-bip-pro-dev-manual]] — 专业开发用户手册（17 页 PDF）

#### 快速入门（7篇）
- [[2026-05-29-创建应用]] — 应用管理：新建/编辑/删除/权限/五大设计模块
- [[2026-05-29-单据入门]] — 单卡/主子表/树形表页面创建+发布授权+6 FAQ
- [[2026-05-29-对象建模]] — 业务对象/实体/引用接口/字段类型/场景支持/枚举/特征+11 FAQ
- [[2026-05-29-业务流入门]] — 推单/拉单/回写完整教程+5 FAQ
- [[2026-05-29-审批流入门]] — 审批流搭建：分支/审批人/字段权限/退回方式+5 FAQ
- [[2026-05-28-bip-yds-app-dev]] — 新应用开发（YDS）：编码规则、审批流、打印、公式，54 张截图
- [[2026-05-28-bip-app-creation]] — 应用创建：领域注册、菜单管理、应用编码规范

---

### 三、对象建模与基础数据

#### 对象建模
- [[2026-05-30-对象建模]] — 🆕 完整操作指南：业务对象/实体/引用接口/字段类型/场景支持
- [[2026-05-28-bip-metadata-bizobj]] — 元数据及业务对象（36K 字）：元数据定义、业务对象/实体创建
- [[2026-05-28-bip-custom-archive]] — 自定义档案（24K 字）：自定义基础数据、枚举档案
- [[2026-05-28-bip-transaction-type]] — 交易类型（7K 字）：单据类型定义与配置

#### 特征
- [[2026-05-28-bip-feature-dev]] — 特征开发（34K 字）：动态属性扩展机制
- [[2026-05-30-客户档案扩展开发]] — 实体扩展字段/平行表扩展子表/DynamicProxy

#### 编码规则
- [[2026-05-28-bip-coding-rules]] — 编码规则（17K 字）：编码元素拼接、序列号生成
- [[2026-05-28-bip-coding-rules-dev]] — 编码规则开发（6K 字）：自定义编码规则与流水号

#### 组织权限
- [[2026-05-28-bip-org-management]] — 组织管理（46K 字）：五大业务模块、技术架构
- [[2026-05-28-bip-main-org-config]] — 主组织配置方案：多组织数据隔离
- [[2026-05-28-bip-auth-management]] — 权限管理（51K 字最大篇）：BIP-AUTH 三位一体
- [[2026-05-28-bip-field-permission]] — 字段权限开发：四种权限级别及优先级
- [[2026-05-28-bip-data-permission]] — 数据权限开发（27K 字）：维度/范围/受控对象
- [[2026-05-28-bip-org-permission]] — 组织权限开发：用户-角色-组织三维授权
- [[2026-05-30-数据权限]] — 🆕 数据权限维度/范围/受控对象配置操作指南

#### 基础数据
- [[2026-05-28-bip-data-hierarchy]] — 基础数据分级管理（19K 字）：集团-分子公司数据共享隔离
- [[2026-05-28-bip-app-modeling-1]] — APP 数字化建模（1）组织建模与权限
- [[2026-05-28-bip-app-modeling-2]] — APP 数字化建模（2）流程建模与业务对象
- [[2026-05-28-bip-app-modeling-3]] — APP 数字化建模（3）基础数据与系统管理
- [[2026-05-28-bip-app-modeling-4]] — APP 数字化建模（4）国际化合规与最佳实践

#### 全球化
- [[2026-05-28-bip-i18n]] — 多语红皮书：资源多语、内容多语、多语 SDK
- [[2026-05-28-bip-multi-lang-dev]] — 多语开发实战：抽取工具、前后端 API、缓存兼容
- [[2026-05-28-bip-exchange-rate]] — 汇率计算指南：标价法、exchRateOps、OpenAPI 调用

---

### 四、页面建模与 UI

#### 设计器与模板
- [[2026-05-30-页面设计器介绍]] — 🆕 设计器布局、组件区/属性区/层级导航
- [[2026-05-30-系统预置模板]] — 🆕 8种页面模板完整教程+30+FAQ（单卡/一主多子/列表/树形表/左树右卡等）
- [[2026-05-28-bip-ui-template]] — UI模板（13K 字）：页面显示隐藏字段、表单布局调整
- [[2026-05-28-bip-gztkk11]] — 数字化工作台开发（7K 字）：React 磁贴组件开发

#### 参照
- [[2026-05-30-参照页面建模]] — 🆕 表参照/树参照/树表参照、参照带入、过滤、数据权限
- [[2026-05-28-bip-refer-ext-intro]] — 参照扩展开发介绍（7.5K 字）：自定义参照、过滤规则

#### 公式
- [[2026-05-30-公式]] — 🆕 YonBuilder 公式功能：字段计算、数据联动、业务规则
- [[2026-05-30-聚合及数学公式使用]] — 🆕 SUM、AVG、COUNT、MAX、MIN 等
- [[2026-05-30-字符串及时间公式]] — 🆕 字符串函数和时间日期函数
- [[2026-05-30-系统及业务函数使用]] — 🆕 日期/组织/用户等上下文函数
- [[2026-05-28-bip-formula-component]] — 公式组件（12K 字）：可视化公式配置、UI 模板拖拽计算
- [[2026-05-28-bip-formula-dev]] — 公式开发（15K 字）：自定义公式函数、Java 计算逻辑

#### 导入导出
- [[2026-05-28-bip-import-workbench]] — 统一导入工作台（11K 字）：Excel 模板导入、数据校验
- [[2026-05-28-bip-export-workbench]] — 导出工作台配置：自定义导出类型与模板

#### 打印
- [[2026-05-30-打印模板]] — 🆕 打印模板创建与设计、数据源绑定
- [[2026-05-28-bip-cloud-print]] — 云打印（18K 字）：打印模板设计、云端打印
- [[2026-05-28-bip-print-ext-dev]] — 打印扩展开发（6K 字）：自定义打印模板与数据源

---

### 五、前端脚本开发

#### 基础与生命周期
- [[2026-05-30-生命周期和监听事件]] — 🆕 customInit/afterMount/modeChange/beforeSave/afterSave
- [[2026-05-28-bip-frontend-script-mdf]] — 前端脚本MDF模型：BaseModel/viewModel/GridModel/ReferModel
- [[2026-05-28-bip-mdf-frontend]] — 前端开发（MDF）：扩展脚本命名/结构/cb.define
- [[2026-05-28-bip-ynf-frontend]] — 前端开发（YNF）：index.extend.js 四函数结构

#### 数据模型（6篇）
- [[2026-05-30-表格模型GridModel]] — 🆕 表格数据操作、行/列/单元格样式控制
- [[2026-05-30-树模型TreeModel]] — 🆕 树形数据模型
- [[2026-05-30-枚举模型ListModel]] — 🆕 枚举/列表数据模型
- [[2026-05-30-过滤模型FilterModel]] — 🆕 过滤条件数据模型
- [[2026-05-30-参照模型ReferModel]] — 🆕 参照数据模型
- [[2026-05-30-标签模型TagModel]] — 🆕 标签数据模型

#### 代码片段与工具
- [[2026-05-27-bip-save-events]] — 保存事件代码片段
- [[2026-05-27-bip-button-events]] — 按钮点击事件
- [[2026-05-27-bip-field-change]] — 字段值改变
- [[2026-05-27-bip-search]] — 搜索查询
- [[2026-05-27-bip-api-call]] — 常用 API 调用
- [[2026-05-27-bip-state-control]] — 状态控制
- [[2026-05-27-bip-lifecycle]] — 页面生命周期
- [[2026-05-27-bip-refer]] — 参照弹窗
- [[2026-05-27-bip-page-jump]] — 页面跳转
- [[2026-05-30-工具类]] — 🆕 cb.utils 前端工具类
- [[2026-05-30-上下文]] — 🆕 InvocationInfoProxy 上下文信息
- [[2026-05-30-模态框]] — 🆕 模态框打开/关闭/数据传递
- [[2026-05-30-前端开发场景示例]] — 🆕 前端开发常见场景代码示例
- [[2026-05-30-子表控制行按钮显示]] — 🆕 beforeSetActionsState 控制子表行按钮显隐（社区）
- [[2026-05-30-左树右卡左树过滤]] — 🆕 TreeModel beforeLoad 过滤左树数据（社区）
- [[2026-05-30-详情导出排序]] — 🆕 详情页导出排序实现（社区）
- [[2026-05-30-卡片表格自动增行]] — 🆕 卡片页子表自动增行（社区）
- [[2026-05-30-自建参照控制数据权限]] — 🆕 自建id字段+标签实现数据权限管控（社区）
- [[2026-05-30-YDS下载脚本报NULL异常]] — 🆕 YDS脚本下载NULL异常排查（社区问题处理）
- [[2026-05-30-自定义按钮防止重复点击]] — 🆕 自定义按钮防重复点击方案（社区）
- [[2026-05-30-全局缓存Cache]] — 🆕 前端全局缓存 Cache 使用方法（社区）
- [[2026-05-30-网络请求Proxy]] — 🆕 前端网络请求 Proxy 使用方法（社区）
- [[2026-05-30-常用工具Utils]] — 🆕 前端常用工具 Utils 使用方法（社区）
- [[2026-05-30-获取上下文方法]] — 🆕 前端获取上下文 InvocationInfoProxy（社区）
- [[2026-05-30-提示信息ToastConfirm]] — 🆕 Toast/Confirm 提示信息组件（社区）
- [[2026-05-30-弹窗Modal]] — 🆕 弹窗 Modal 使用方法（社区）
- [[2026-05-30-页面管理Page]] — 🆕 页面管理 Page 使用方法（社区）
- [[2026-05-30-参照单选引用选择参考]] — 🆕 参照常用单选引用选择参考（社区）
- [[2026-05-30-上下文Context]] — 🆕 Context 上下文方法汇总（社区）
- [[2026-05-30-白名单]] — 🆕 白名单配置说明（社区）
- [[2026-05-30-新增字段后保存不上]] — 🆕 新增字段保存失败问题排查（社区问题处理）
- [[2026-05-30-常见入口类]] — 🆕 常见 API 入口类说明（社区）
- [[2026-05-30-获取开放平台Token]] — 🆕 获取开放平台 Token 方法（社区）

#### MDF & YNF 示例
- [[2026-05-28-bip-mdf-example]] — 前端典型示例（MDF）：FilterViewModel、GridModel 样式
- [[2026-05-28-bip-ynf-app-dev]] — 新应用开发（YNF）：新一代 YNF+YPD 框架，77 张截图
- [[2026-05-28-bip-ynf-example]] — 前端典型示例（YNF）：样式扩展、FilterStore、自定义组件

---

### 六、后端脚本开发

#### 入门与基础
- [[2026-05-28-bip-backend-script-intro]] — 后端脚本入门：AbstractTrigger/AbstractAPIHandler、调试
- [[2026-05-28-bip-entity-operations]] — 实体操作：ObjectStore CRUD、YonQL查询、多表关联
- [[2026-05-30-实体操作]] — 🆕 实体操作详解

#### 进阶开发
- [[2026-05-30-后端脚本进阶开发]] — 🆕 远程调用/消息触达/调度任务/事件订阅/规则链
- [[2026-05-28-bip-backend-script-advanced]] — 后端脚本进阶：openLinker/postman、sendMessage

#### 插件与组件
- [[2026-05-28-bip-backend-plugin]] — 后端插件开发（YDS）：YPD 框架、23 个动作码方法表
- [[2026-05-28-bip-hszj11]] — 函数组件（24K 字）：前后端函数编写、AbstractTrigger
- [[2026-05-28-bip-ybdzjhkf11]] — YonBuilder组件化开发（21K 字）：可复用前端自定义组件

#### 专业开发（YPD）
- [[2026-05-28-bip-ypdzykf11]] — YPD专业开发（26K 字）：面向深度定制的专业脚手架
- [[2026-05-28-bip-ymskfgc11]] — YMS开发过程（49K 字）：微服务脚手架创建/配置/部署

#### 扩展示例
- [[2026-05-28-maogeping-bip-v5-code-reference]] — 毛戈平 BIP V5 客开完整代码参考（16 章）
- [[2026-05-30-客户档案扩展开发]] — 实体扩展/平行表/DynamicProxy 校验/Java 规则
- [[2026-05-28-bip-customer-archive-ext]] — 客户档案扩展开发：实体扩展字段、元数据平行表
- [[2026-05-30-其他扩展技巧]] — 🆕 客开实用扩展技巧汇总

#### R6 脚手架升级
- [[2026-05-28-bip-hdjsjsjfa11]] — R6后端脚手架升级方案（4K 字）
- [[2026-05-28-bip-hdjsjsjczzn1]] — R6后端脚手架升级操作指南（8K 字）
- [[2026-05-28-bip-hdjsjefbbg1]] — R6后端脚手架二方包坐标变更清单（34K 字）

---

### 七、流程与自动化

#### 工作流（审批流）
- [[2026-05-29-审批流入门]] — 🆕 审批流完整教程：单据构建→流程配置→测试+5 FAQ
- [[2026-05-28-bip-cloud-approval]] — 云审批（21K 字）：多级审批/会签/转审/加签
- [[2026-05-28-bip-workflow-dev]] — 工作流开发（16K 字）：引擎接入、节点配置与二次开发

#### 业务流
- [[2026-05-29-业务流入门]] — 🆕 推单/拉单/回写完整教程+5 FAQ
- [[2026-05-30-业务流]] — 🆕 业务流完整操作：单据转换规则、分单规则
- [[2026-05-28-bip-business-flow]] — 业务流（50K 字）：推单/生单/转单机制与开发接入
- [[2026-05-28-bip-dev-push-dev]] — 开发单据推开发单据：自建单据间业务流转
- [[2026-05-28-bip-dev-push-std]] — 开发单据推原厂单据（11K 字）：自建→标准产品
- [[2026-05-28-bip-std-push-dev]] — 原厂单据推开发单据：标准产品→自建

#### 规则引擎
- [[2026-05-28-bip-rule-engine]] — 规则引擎（7.5K 字）：规则链配置、触发条件与执行逻辑
- [[2026-05-28-bip-rule-engine-dev]] — 规则引擎开发：自定义规则开发、规则链编排与调试

---

### 八、API 与集成

- [[2026-05-30-API发布]] — 🆕 开放平台API发布：分组、调试、限流、文档
- [[2026-05-28-bip-api-publish]] — API发布：分组、发布、调试、限流
- [[2026-05-28-bip-jkkkyfb11]] — 接口开发及发布（2K 字）：API 接口开发与发布
- [[2026-05-28-bip-dyybopenapi1]] — 生态开发事务一致性（17K 字）：ISV 分布式事务

---

### 九、发布与迁移

#### 应用发布
- [[2026-05-30-发布管理]] — 🆕 分组管理→页面发布→菜单管理→角色授权
- [[2026-05-28-bip-app-publish]] — 应用发布：分组管理、功能节点、工作台、权限分配

#### 配置迁移
- [[2026-05-30-配置迁移]] — 🆕 传输包构建/部署、环境校验、24种数据类型
- [[2026-05-28-bip-config-migration]] — 配置迁移：传输包构建/部署、环境校验、数据对照
- [[2026-05-28-bip-kfxgqyyds1]] — 开发成果迁移YDS（4K 字）：代码和配置跨环境迁移
- [[2026-05-28-bip-sjqy11]] — 数据迁移红皮书（10K 字）：数据导出导入跨环境同步

#### 出盘部署
- [[2026-05-28-bip-yprbdcp11]] — YPR打包出盘红皮书（15K 字）
- [[2026-05-28-bip-isvstzpin1]] — 公有云ISV生态产品制品（4K 字）
- [[2026-05-28-bip-isvstzpan1]] — 公有云ISV生态产品制盘及安装（14K 字）
- [[2026-05-28-bip-r6-engine-deploy]] — R6 专业版引擎部署（YPD）：Web 平台创建引擎

#### 开发管理
- [[2026-05-28-bip-dev-mgmt-tool]] — 开发管理工具（25 页 PDF）：产品包管理、数据传输工具

---

### 十、平台服务

#### 消息平台
- [[2026-05-28-bip-xxkf11]] — 消息开发（51K 字）：同租户/跨租户工作通知、Api函数/SDK
- [[2026-05-28-bip-kzhtz11]] — 跨租户工作通知（4K 字）：采购商→供应商
- [[2026-05-28-bip-xxkk11]] — 消息集成开发（6K 字）：三方系统待办对接、businessKey 机制

#### 事件中心
- [[2026-05-28-bip-sjkfzx11]] — 事件中心开发（25K 字）：Kafka 事件驱动、三种推送模式
- [[2026-05-28-bip-sjzxkf11]] — 事件中心开发介绍（7K 字）：EOS 对接、数据库存储表

#### 调度任务
- [[2026-05-28-bip-ddrw111]] — 调度任务概念与 API（12K 字）：分布式 Quartz 调度
- [[2026-05-28-bip-ddrwkf11]] — 调度任务开发（5K 字）：异步/同步/后端函数三种方式

#### 文件服务
- [[2026-05-28-bip-wjfwkf11]] — 文件服务开发（7K 字）：文件上传下载 SDK 与 OpenAPI

#### 日志服务
- [[2026-05-27-bip-log]] — BIP 日志记录方案
- [[2026-05-28-bip-rzfw11]] — 日志服务（14K 字）：操作日志/业务日志、MQ→ES 数据流转
- [[2026-05-28-bip-czrz11]] — 日志开发（6K 字）：BillPlugin 集成日志服务

#### 监控与预警
- [[2026-05-28-bip-ymckf11]] — YMC开发实践（4K 字）：CPU/内存/JVM/慢查询排查、Arthas
- [[2026-05-28-bip-hbjkjs11]] — 哈勃监控技术（17K 字）：Prometheus/ES/Kafka、火焰图
- [[2026-05-28-bip-yjfw11]] — 预警服务（6K 字）：预警类型/任务配置、RESTful API
- [[2026-05-28-bip-yjrwkf11]] — 预警任务开发（12K 字）：同步/异步协议、自定义消息接收人

#### 其他服务
- [[2026-05-28-bip-qyhx11]] — 企业画像（32K 字）：数据分析构建企业全景视图
- [[2026-05-28-bip-qklyfw11]] — 区块链云服务（24K 字）
- [[2026-05-27-yht-access-token]] — 获取 yht_access_token

---

### 十一、开发规范与标准

#### 前端规范
- [[2026-05-28-bip-qdkfgf11]] — 前端开发规范红皮书（25K 字）：iuap 前端编码规范
- [[2026-05-28-bip-yckzjbkf11]] — 原厂扩展脚本开发（4K 字）：前端原厂扩展脚本管理

#### 后端规范
- [[2026-05-28-bip-hdkfgd11]] — 后端开发规范红皮书（44K 字）：iuap 后端 Java 编码规范

#### 数据库规范
- [[2026-05-28-bip-sjkgf11]] — 数据库规范红皮书（40K 字）：SQL/索引/表结构设计标准
- [[2026-05-28-bip-fbssw11]] — 分布式事务（28K 字）：微服务跨服务数据一致性
- [[2026-05-28-bip-dsjkbcmx11]] — 多数据库编程模型（43K 字）：多数据源切换与逻辑数据源
- [[2026-05-28-bip-sjk-dsjkspgf1]] — ISV多数据库适配规范（10K 字）：MySQL/PostgreSQL/Oracle

#### 安全规范
- [[2026-05-28-bip-aqgf11]] — 安全规范红皮书（108K 字）：安全编码规范、认证授权标准
- [[2026-05-28-bip-aqqxgzfa11]] — 安全权限改造方案（9K 字）：权限模型升级与迁移

#### 中间件实践
- [[2026-05-28-bip-fbsskk11]] — 分布式锁 yms-lock 实践（11K 字）
- [[2026-05-28-bip-rpcdev11]] — RPC接口开发与调用 iris（10K 字）
- [[2026-05-28-bip-rpcreq11]] — 数据库操作 yms-jdbc 实践（21K 字）
- [[2026-05-28-bip-isvjsjsp1]] — HTTP请求 yms-http 实践（10K 字）
- [[2026-05-28-bip-zdycx11]] — 上下文开发实践（16K 字）：InvocationInfoProxy
- [[2026-05-28-bip-ymsexecutors]] — 线程池 yms-executors 实践（15K 字）

#### 扩展开发
- [[2026-05-28-bip-ybdyckzkf11]] — YonBuilder原厂扩展开发MDD（12K 字）

---

### 十二、运维与部署

#### CTP 平台
- [[2026-05-28-bip-ctp-platform]] — CTP 技术平台底座（64 页课件）：云原生持续交付、YMS、信创适配

#### DevOps
- [[2026-05-28-bip-dlsx11]] — DevOps流水线（35K 字）：CI/CD 持续集成与部署
- [[2026-05-28-bip-dyscs11]] — DevOps云上调试（7K 字）：云端远程代码调试
- [[2026-05-28-bip-rqyjs111]] — 容器云技术（18K 字）：Kubernetes/Docker 容器化部署

---

### 十三、NCC/高级版电子书 ⚠️

> ⚠️ **YonBIP 高级版（NCC）** — 与旗舰版（BIP）属不同产品线。共 64 章。

- [[2026-05-30-NCC电子书索引]] — 📖 NCC 电子书完整目录

#### 1 基础篇
- [[2026-05-30-NCC-前言]]、[[2026-05-30-NCC-总体架构|架构]]、[[2026-05-30-NCC-开发环境搭建|环境]]、[[2026-05-30-NCC-常用数据表|数据表]]、[[2026-05-30-NCC-系统升级|升级]]、[[2026-05-30-NCC-前后端调试技巧|调试]]、[[2026-05-30-NCC-Java编码规范|Java]]、[[2026-05-30-NCC-多语言|多语]]、[[2026-05-30-NCC-数据库设计及SQL规范|SQL]]、[[2026-05-30-NCC-正则表达式|正则]]、[[2026-05-30-NCC-元数据建模|元数据]]、[[2026-05-30-NCC-模板设置|模板]]、[[2026-05-30-NCC-参照|参照]]、[[2026-05-30-NCC-公式|公式]]、[[2026-05-30-NCC-输出及打印|打印]]、[[2026-05-30-NCC-业务参数设置|参数]]、[[2026-05-30-NCC-业务日志|日志]]、[[2026-05-30-NCC-自定义项开发及配置|自定义项]]、[[2026-05-30-NCC-预警|预警]]、[[2026-05-30-NCC-基础数据常用接口|接口]]、[[2026-05-30-NCC-ES6与React基础|ES6]]、[[2026-05-30-NCC-平台常用基础组件|基础组件]]、[[2026-05-30-NCC-平台常用高阶组件|高阶组件]]、[[2026-05-30-NCC-小应用小部件|小部件]]

#### 2 进阶篇
- [[2026-05-30-NCC-流程平台概述|流程概述]]、[[2026-05-30-NCC-编码规则|编码规则]]、[[2026-05-30-NCC-审批流开发介绍|审批流]]、[[2026-05-30-NCC-业务流开发介绍|业务流]]、[[2026-05-30-NCC-交易类型扩展|交易类型]]、[[2026-05-30-NCC-拉单|拉单]]、[[2026-05-30-NCC-Action鉴权注册|鉴权]]、[[2026-05-30-NCC-管控模式|管控]]、[[2026-05-30-NCC-数据权限|数据权限]]、[[2026-05-30-NCC-OpenAPI]]、[[2026-05-30-NCC-业务插件|插件]]、[[2026-05-30-NCC-单点登录|SSO]]、[[2026-05-30-NCC-导入导出|导入导出]]、[[2026-05-30-NCC-数据报表开发|报表]]、[[2026-05-30-NCC-外部交换平台|交换]]、[[2026-05-30-NCC-业务消息|消息]]、[[2026-05-30-NCC-后台任务|后台任务]]

#### 3 高阶篇 + 4 低代码 + 5 实战 + 6 附录
- [[2026-05-30-NCC-分层开发总览|分层开发]]、[[2026-05-30-NCC-前端多层扩展|前端扩展]]、[[2026-05-30-NCC-后端BP业务规则扩展|BP扩展]]、[[2026-05-30-NCC-流程扩展开发|流程扩展]]、[[2026-05-30-NCC-云原生及NCC分布式事务|云原生]]、[[2026-05-30-NCC-如何导脚本|导脚本]]、[[2026-05-30-NCC-业务形态开发介绍|业务形态]]、[[2026-05-30-NCC-多版本多时区多币种|多版本]]
- [[2026-05-30-NCC-低代码平台总体介绍|低代码概述]]、[[2026-05-30-NCC-低代码与标品代码对比|低代码对比]]、[[2026-05-30-NCC-单表单据开发|单表]]、[[2026-05-30-NCC-主从单据开发|主从]]、[[2026-05-30-NCC-树表单据开发|树表]]、[[2026-05-30-NCC-树卡单据开发|树卡]]、[[2026-05-30-NCC-移动应用开发|移动]]、[[2026-05-30-NCC-场景化开发|场景化]]
- [[2026-05-30-NCC-主子开发实战|主子实战]]、[[2026-05-30-NCC-基本档案开发实战|档案实战]]、[[2026-05-30-NCC-UFIND函数开发实战|UFIND]]、[[2026-05-30-NCC-IUFO函数开发实战|IUFO]]、[[2026-05-30-NCC-财务自助分析开发实战|财务分析]]
- [[2026-05-30-NCC-常见问题100问|100问]]

### 十四、问题处理与参考

#### 问题处理（22篇）
22 篇问题排查文档，涵盖启动报错、API 权限、影像上传、界面配置等。
→ 详见 [[问题处理]] 主题页

#### 旗舰版技术参考（95+篇）
覆盖：后端函数（Controller 调用、API 推送、异步执行）、OpenAPI 调用、文件/影像上传、
单据操作（下推、联查、跳转、转单）、查询方法（YonQL、QuerySchema）、YDS 工具（出盘制盘、
远程调试、VS Code）、编码规则、审批流、规则链、事件订阅、中间表、翻译服务、跨域处理等。
→ 详见 `wiki/sources/` 下对应文件
