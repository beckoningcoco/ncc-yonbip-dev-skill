# 项目客开知识 - hawk_xieheyunwei_ncc2111

> 本文件记录 `hawk_xieheyunwei_ncc2111` 项目特有的NCC客开知识，供开发参考。

---

## 天九 NCC 2312 测试环境

| 配置项 | 值 |
|--------|-----|
| **地址** | http://172.16.26.10:8099/yonbip/resources/workbench/public/common/main/index.html#/ |
| **版本** | NCC 2312 |
| **环境** | 测试环境 |
| **Home 路径** | E:\\NCProject\\NCC2312\\tianjiu\\biphome_20260331 |

---

## 一、项目模块结构

| 模块 | 说明 | 路径 |
|------|------|------|
| arap | 应付应收模块 | `hawk_xieheyunwei_ncc2111/arap` |
| ia | 存货核算模块 | `hawk_xieheyunwei_ncc2111/ia` |
| ic | 库存管理模块 | `hawk_xieheyunwei_ncc2111/ic` |
| erm | 报销管理模块 | `hawk_xieheyunwei_ncc2111/erm` |
| pu | 采购管理模块 | `hawk_xieheyunwei_ncc2111/pu` |
| cmp | 基础平台模块 | `hawk_xieheyunwei_ncc2111/cmp` |
| fct | 财务核算模块 | `hawk_xieheyunwei_ncc2111/fct` |
| ct | 合同管理模块 | `hawk_xieheyunwei_ncc2111/ct` |
| epmp | 全面预算管理 | `hawk_xieheyunwei_ncc2111/epmp` |
| sscivm | 发票管理模块 | `hawk_xieheyunwei_ncc2111/sscivm` |
| cdmc | 合同文档管理 | `hawk_xieheyunwei_ncc2111/cdmc` |

---

## 二、EAM集成相关

### 2.1 EAM入库明细联查

**功能**: 根据EAM入库明细关联主键，联查暂估应付单和采购入库单

**关键字段**:
| 表名 | 字段 | 说明 |
|------|------|------|
| bd_inventorydetail | pk_inventorydetail | EAM入库明细主键 |
| bd_inventoryitem | def2 | EAM入库单号 |
| ap_payablebill | def4 | 存储EAM单据号(暂估应付单) |
| ap_payableitem | def13 | EAM单据号(暂估应付单行) |
| ap_payitem/ap_payableitem | def77/def78 | EAM主键字段(付款单/应付单行) |
| ia_i2bill | vdef8 | 存储EAM入库单号(采购入库单) |

**类**:
- `nc.bs.impl.paybill.PaybillLinkImpl` - 联查服务实现
  - `LinkExtPayment(List<String> eamPks)` - 联查暂估应付单
  - `LinkInvPurbill(List<String> eamPks)` - 联查采购入库单
- `nc.bs.itf.paybill.IPaybillLinkService` - 联查服务接口
- `nccloud.web.arap.paybill.action.ExtPaymentLinkAction` - 前端联查Action

### 2.2 EAM相关VO

| VO类 | 说明 | 路径 |
|------|------|------|
| AggInventorydetailVO | EAM入库明细聚合VO | arap/src/public/nc/vo/inventorydetails/ |
| InventorydetailVO | EAM入库明细表头VO | arap/src/public/nc/vo/inventorydetails/ |
| InventoryitemVO | EAM入库明细表体VO | arap/src/public/nc/vo/inventorydetails/ |

**EAM入库明细相关表**:
- `bd_inventorydetail` - EAM入库明细主表
- `bd_inventoryitem` - EAM入库明细子表

---

## 三、中间表相关

### 3.1 携程中间表 (xc_middle)

**用途**: 携程差旅数据集成

**相关类**:
- `nc.bs.arap.background.XCSendEmailBackGround` - 携程发送邮件后台任务
- `nccloud.web.arap.paybill.action.ExtPaymentLinkAction` - 携程差旅单据联查

**相关VO**:
| VO类 | 说明 |
|------|------|
| FilghtVO | 机票数据 |
| HotelVO | 酒店数据 |
| TrainVO | 火车票数据 |
| UseCarVO | 用车数据 |
| XCSendEmailLogVO | 携程发送邮件日志 |

### 3.2 AL中间表 (al_middle)

**用途**: 差旅报销数据集成

---

## 四、单据类型（客户化）

### 4.1 应付/付款单相关

| 单据类型代码 | 说明 |
|-------------|------|
| F1-Cxx-006 | 预付款申请单 |
| F1-Cxx-007 | 暂估应付单 |
| F1-Cxx-044 | 差旅费-机票 |
| F1-Cxx-045 | 差旅费-酒店 |
| F3-Cxx-006 | 费用报销单 |
| F3-Cxx-010 | 费用报销单 |
| F3-Cxx-13 | 预算控制单据 |
| F3-Cxx-14 | 预算控制单据 |
| F3-Cxx-15 | 差旅费-火车 |

### 4.2 报销单相关

| 单据类型代码 | 说明 |
|-------------|------|
| 264X-Cxx-02 | 差旅费报销单 |
| 264X-Cxx-05 | 差旅费报销单 |
| 264X-Cxx-08 | 差旅费报销单(特殊校验) |

---

## 五、业务插件

### 5.1 ARAP模块业务插件

| 类名 | 说明 |
|------|------|
| `BillAutoVolBudgetListener` | 自动预算占用监听器 |
| `BillAutoVolBudgetListenerPayable` | 应付单预算占用监听 |
| `OtherModuleDataHandleListener` | 其他模块数据处理监听 |
| `ArapFKInvoiceAbstractListener` | 发票风控抽象监听器(付款) |
| `ArapYFInvoiceAbstractListener` | 发票风控抽象监听器(应付) |
| `PaybillWriteBackAuditTeamListener` | 付款单回写审计团队 |
| `PayableWriteBackAuditTeamListener` | 应付单回写审计团队 |
| `ARBillCustomerCheckListener` | AR单据客户校验 |
| `ZJPlanUnapproveListener` | 资金计划取消审批监听 |

### 5.2 ERM模块业务插件

| 类名 | 说明 |
|------|------|
| `JkWriteBackListener` | 借款回写监听 |
| `JkBxHkWriteBackAuditTeamListener` | 借款报销回写审计团队 |
| `CheckJKBXOrgAndJKBXRListener` | 校验借款报销组织和人员 |
| `ErmBxInvoiceAbstractListener` | 报销发票风控抽象监听 |

### 5.3 FCT模块业务插件

| 类名 | 说明 |
|------|------|
| `ApPayBillAddHandler` | 付款单新增处理(合同应用) |
| `ApPayBillRewriteHandler` | 付款单重写处理 |
| `ApPayBillEffectHandler` | 付款单生效处理 |
| `ApPayBillUnEffectHandler` | 付款单取消生效 |
| `ApPayBillDeleteHandler` | 付款单删除处理 |
| `PayableBillInsertHandler` | 应付单新增处理 |
| `PayableBillEffectHandler` | 应付单生效处理 |
| `PayableBillUnEffectHandler` | 应付单取消生效 |
| `ReceivablebillInsertHandler` | 应收单新增处理 |
| `ReceivablebillUpdateHandler` | 应收单更新处理 |
| `ArGatherBillAddHandler` | 收款单新增处理 |
| `ArGatherBillUpdateHandler` | 收款单更新处理 |
| `UpdateApContractListener` | 更新AP合同监听 |
| `UpdateArContractListener` | 更新AR合同监听 |

---

## 六、后台任务

### 6.1 ARAP模块后台任务

| 类名 | 说明 |
|------|------|
| `BusinessBackgroundWrok` | 定时查询AL/XC中间表,处理差旅报销单据 |
| `XCSendEmailBackGround` | 携程发送邮件后台任务 |

### 6.2 EPMP模块后台任务

| 类名 | 说明 |
|------|------|
| `IdCtrlschemeVOQueryLysPlugin` | 预算控制方案查询后台任务 |

### 6.3 SSCIVM模块后台任务

| 类名 | 说明 |
|------|------|
| `InvoicePollPlugin` | 发票轮询插件 |
| `InvoiceYcfpPlugin` | 异常发票插件 |

### 6.4 CDMC模块后台任务

| 类名 | 说明 |
|------|------|
| `ContractFileUploadPlugin` | 合同文件上传插件 |

### 6.5 OBM模块后台任务

| 类名 | 说明 |
|------|------|
| `LinkYhhdTask` | 银行回单联查任务 |
| `LinkYhhdTaskNdz` | 银企联查任务 |
| `LinkYhhdTaskNdz_PZ` | 银企联查凭证任务 |
| `AccessoryPush` | 附件推送 |
| `LinkYhhdAndBillTaskPlugin` | 银行回单联查单据插件 |

---

## 七、VO与表名对照

### 7.1 客户化VO

| VO类 | 表名 | 说明 |
|------|------|------|
| AggInventorydetailVO | bd_inventorydetail/bd_inventoryitem | EAM入库明细 |
| FilghtVO | 中间表(机票) | 携程机票数据 |
| HotelVO | 中间表(酒店) | 携程酒店数据 |
| TrainVO | 中间表(火车) | 携程火车票数据 |
| UseCarVO | 中间表(用车) | 携程用车数据 |
| XCSendEmailLogVO | xc_middle | 携程发送邮件日志 |

### 7.2 ERM模块VO

| VO类 | 表名 | 说明 |
|------|------|------|
| JKBXHeaderVO | erm_jkbx | 借款报销表头 |
| JKBXVO | erm_jkbx | 借款报销聚合VO |

---

## 八、数据库表名速查

| 表名 | 说明 |
|------|------|
| ap_paybill | 付款单表 |
| ap_payablebill | 应付单表 |
| ap_payitem | 付款单明细 |
| ap_payableitem | 应付单明细 |
| bd_inventorydetail | EAM入库明细主表 |
| bd_inventoryitem | EAM入库明细子表 |
| xc_middle | 携程中间表 |
| al_middle | AL中间表 |
| cne_yw_epmplog_h | 预算执行日志主表 |
| cne_yw_epmplog_b | 预算执行日志明细表 |
| ia_i2bill | 采购入库单表头(存货核算) |
| ia_i2bill_b | 采购入库单表体(存货核算) |

---

## 九、常用服务接口

| 接口名 | 说明 |
|--------|------|
| IPaybillLinkService | 联查服务接口 |
| IBusinessService | 对公付款单单据号携带固定字段接口 |
| ITranslateEstiPayableService | 预算拨款单据转换接口 |
| IRiskInvoiceVerifyService | 风险发票验证服务 |
| IMessageSendDDService | 钉钉消息发送服务 |
| PayBillsSaveService | 付款单保存服务 |
| IFytzService | 费用通知单服务 |
| IMaterOutPushWMSService | 材料出库推送WMS |
| IPurchaseinPushWMSService | 采购入库推送WMS |

---

## 十、开发规范

### 10.1 包路径前缀

客户化包路径前缀为 `hk`：

```
nc.hk.{层}.{模块}.{业务组件}.{功能}
```

- 层：`bs`（业务组件层）、`bd`（基础数据层）、`ui`（表现层）、`pf`（平台层）
- 模块：`so`（销售）、`pu`（采购）、`ic`（库存）、`ar`（应收）、`ap`（应付）、`pm`（项目管理）等

### 10.2 服务调用

| 端 | 调用方式 |
|------|----------|
| client端 | `ServiceLocator.find(XxxItf.class)` |
| public/private端 | `NCLocator.getInstance().lookup(XxxItf.class)` |