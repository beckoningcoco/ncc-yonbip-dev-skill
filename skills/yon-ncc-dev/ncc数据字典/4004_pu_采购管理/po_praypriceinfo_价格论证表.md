# |<<

**价格论证表 (po_praypriceinfo / nc.vo.pu.m20.entity.PrayPriceInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4622.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceinfo | 价格论证表 | pk_priceinfo | varchar(20) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | pk_material | 物料版本 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | pk_srcmaterial | 物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | nlatestprice | 最新价 | nlatestprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_supplier1 | 第一供应商 | pk_supplier1 | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | pk_supplier2 | 第二供应商 | pk_supplier2 | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | pk_supplier3 | 第三供应商 | pk_supplier3 | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | nquoteprice1 | 报价1 | nquoteprice1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nquoteprice2 | 报价2 | nquoteprice2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nquoteprice3 | 报价3 | nquoteprice3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 15 | nauditprice | 审定结果 | nauditprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | dfromdate | 报价起始日期 | dfromdate | char(19) |  | 日期 (UFDate) |
| 17 | dtodate | 报价结束日期 | dtodate | char(19) |  | 日期 (UFDate) |
| 18 | dcurdate | 汇率日期 | dcurdate | char(19) |  | 日期 (UFDate) |
| 19 | pk_praybill_b | 请购单行主键 | pk_praybill_b | varchar(20) |  | 字符串 (String) |
| 20 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |