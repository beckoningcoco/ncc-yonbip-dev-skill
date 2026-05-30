# |<<

**采购发票主表 (po_invoice / nc.vo.pu.m25.entity.InvoiceHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4598.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice | 采购发票 | pk_invoice | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 发票号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 发票日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | darrivedate | 票到日期 | darrivedate | varchar(19) |  | 日期 (UFDate) |
| 8 | vtrantypecode | 发票类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | ctrantypeid | 发票类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 11 | bfee | 费用发票 | bfee | char(1) |  | 布尔类型 (UFBoolean) | N |
| 12 | pk_purchaseorg | 采购组织最新版本 | pk_purchaseorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 13 | pk_purchaseorg_v | 采购组织 | pk_purchaseorg_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 14 | pk_stockorg | 库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 15 | pk_stockorg_v | 库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 16 | pk_supplier | 供应商 | pk_supplier | varchar(20) | √ | 供应商基本信息 (supplier) |
| 17 | pk_bankaccbas | 银行账户 | pk_bankaccbas | varchar(20) |  | 客商银行账户 (custsupbank) |
| 18 | pk_freecust | 散户 | pk_freecust | varchar(20) |  | 散户 (freecustom) |
| 19 | pk_bizpsn | 业务员 | pk_bizpsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 21 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 22 | pk_paytosupplier | 付款单位 | pk_paytosupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 23 | pk_payterm | 付款协议 | pk_payterm | varchar(20) |  | 付款协议 (payment) |
| 24 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 25 | nexchangerate | 汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) | 1.00 |
| 26 | bapflag | 已传应付标志 | bapflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 27 | bfrozen | 冻结 | bfrozen | char(1) |  | 布尔类型 (UFBoolean) | N |
| 28 | vfrozenreason | 最后冻结原因 | vfrozenreason | varchar(181) |  | 字符串 (String) |
| 29 | ntotalastnum | 整单数量 | ntotalastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | ntotalorigmny | 整单价税合计 | ntotalorigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 32 | pk_frozenuser | 冻结人 | pk_frozenuser | varchar(20) |  | 用户 (user) |
| 33 | tfrozentime | 冻结日期 | tfrozentime | char(19) |  | 日期 (UFDate) |
| 34 | fbillstatus | 单据状态 | fbillstatus | int |  | 单据状态 (invoicestate) | 0 | 0=自由; |