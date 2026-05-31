# |<<

**价格结算单 (po_pricesettle / nc.vo.pu.m24.entity.PricestlHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricesettle | 价格结算单 | pk_pricesettle | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | vbillcode | 价格结算单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | pk_storeorg | 库存组织最新版本 | pk_storeorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | pk_storeorg_v | 库存组织 | pk_storeorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | pk_employee | 采购员 | pk_employee | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 11 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 12 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 13 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 14 | ccurrencyid | 本币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 15 | fbillstatus | 单据状态 | fbillstatus | int |  | 价格结算单单据状态 (PricestlBillStatue) |  | 0=自由; |