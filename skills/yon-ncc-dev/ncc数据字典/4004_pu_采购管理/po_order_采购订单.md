# |<<

**采购订单 (po_order / nc.vo.pu.m21.entity.OrderHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4603.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order | 采购订单 | pk_order | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | vbillcode | 订单编号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 订单日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | pk_freecust | 散户 | pk_freecust | varchar(20) |  | 散户 (freecustom) |
| 8 | pk_supplier | 供应商 | pk_supplier | varchar(20) | √ | 供应商基本信息 (supplier) |
| 9 | pk_bankdoc | 开户银行 | pk_bankdoc | varchar(20) |  | 客商银行账户 (custsupbank) |
| 10 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 11 | cemployeeid | 采购员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | vtrantypecode | 订单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 13 | pk_recvcustomer | 收货客户 | pk_recvcustomer | varchar(20) |  | 客户基本信息 (customer) |
| 14 | pk_invcsupllier | 开票供应商 | pk_invcsupllier | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | pk_deliveradd | 供应商发货地址 | pk_deliveradd | varchar(20) |  | 供应商发货地址 (supaddress) |
| 16 | pk_transporttype | 运输方式 | pk_transporttype | varchar(20) |  | 运输方式 (transporttype) |
| 17 | pk_payterm | 付款协议 | pk_payterm | varchar(20) |  | 付款协议 (payment) |
| 18 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 19 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 20 | forderstatus | 单据状态 | forderstatus | int |  | 订单状态 (orderstatus) | 0 | 0=自由; |