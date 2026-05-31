# |<<

**委外订单 (sc_order / nc.vo.sc.m61.entity.SCOrderHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5025.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order | 委外订单 | pk_order | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | pk_stockorg | 库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_stockorg_v | 库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | pk_financeorg | 财务组织最新版本 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_financeorg_v | 财务组织 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | vbillcode | 订单编号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 10 | dbilldate | 订单日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 11 | pk_supplier | 加工商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | pk_invcsupllier | 开票供应商 | pk_invcsupllier | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | cwarehouseid | 委外仓 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 14 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 16 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | ctrantypeid | 订单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | vtrantypecode | 订单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 19 | pk_bankdoc | 开户银行 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 20 | pk_recvcustomer | 收货客户 | pk_recvcustomer | varchar(20) |  | 客户基本信息 (customer) |
| 21 | pk_transporttype | 运输方式 | pk_transporttype | varchar(20) |  | 运输方式 (transporttype) |
| 22 | pk_payterm | 付款协议 | pk_payterm | varchar(20) |  | 付款协议 (payment) |
| 23 | fstatusflag | 单据状态 | fstatusflag | int |  | 委外单据状态 (enum) |  | 0=自由; |