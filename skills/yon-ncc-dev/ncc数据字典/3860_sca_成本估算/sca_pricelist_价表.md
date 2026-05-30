# |<<

**价表 (sca_pricelist / nc.vo.sca.pricelist.entity.PriceListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5060.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricelist | 价表ID | pk_pricelist | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | costdomainid | 成本域 | costdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 6 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 7 | effectivedate | 生效时间 | effectivedate | char(20) |  | 日期时间 (UFDateTime) |
| 8 | invaliddate | 失效时间 | invaliddate | char(20) |  | 日期时间 (UFDateTime) |
| 9 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 15 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 16 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 17 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 18 | pricetype | 价表类型 | pricetype | int |  | 价表类型 (pricelisttypeenum) |  | 1=计划价价表; |