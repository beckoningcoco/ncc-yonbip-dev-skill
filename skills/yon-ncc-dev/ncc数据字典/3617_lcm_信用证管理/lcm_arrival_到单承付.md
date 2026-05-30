# |<<

**到单承付 (lcm_arrival / nc.vo.lcm.open.arrival.InvoiceArrivalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3555.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arrival | 主键 | pk_arrival | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtypecode | 单据类型编号 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 6 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 7 | isinitial | 期初 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_register | 信用证号 | pk_register | varchar(20) |  | 开证登记 (lcm_openregister) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | lcamount | 金额 | lcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | pk_openbank | 开证行 | pk_openbank | varchar(20) |  | 银行档案 (bankdoc) |
| 12 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | cashway | 兑付方式 | cashway | int |  | 兑付方式 (LCPaytype) |  | 1=即期付款; |