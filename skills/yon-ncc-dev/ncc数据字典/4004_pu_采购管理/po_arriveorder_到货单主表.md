# |<<

**到货单主表 (po_arriveorder / nc.vo.pu.m23.entity.ArriveHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4586.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arriveorder | 到货单 | pk_arriveorder | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_purchaseorg | 采购组织最新版本 | pk_purchaseorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 6 | pk_purchaseorg_v | 采购组织 | pk_purchaseorg_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 7 | vbillcode | 到货单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | dbilldate | 到货日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | pk_freecust | 散户 | pk_freecust | varchar(20) |  | 散户 (freecustom) |
| 10 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 12 | vtrantypecode | 到货类型编码编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 13 | pk_transporttype | 运输方式 | pk_transporttype | varchar(20) |  | 运输方式 (transporttype) |
| 14 | pk_receivepsndoc | 收货人 | pk_receivepsndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 16 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | pk_pupsndoc | 采购员 | pk_pupsndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | fbillstatus | 单据状态 | fbillstatus | int |  | 单据状态 (ArriveStatusEnum) | 0 | 0=自由; |