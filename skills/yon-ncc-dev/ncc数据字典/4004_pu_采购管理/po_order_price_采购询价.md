# |<<

**采购询价 (po_order_price / nc.vo.pu.m21.entity.OrderPriceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4610.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order_price | 采购询价 | pk_order_price | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 采购组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 3 | pk_psfinanceorg | 结算财务组织(OID) | pk_psfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_arrvstoorg | 收货库存组织(OID) | pk_arrvstoorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_srcmaterial | 物料信息 | pk_srcmaterial | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 8 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |