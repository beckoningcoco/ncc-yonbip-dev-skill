# |<<

**产品 (srmsm_supplierext_p / nc.vo.bd.supplierext.entity.SupplierExtPVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierext_p | 可供货产品主键 | pk_supplierext_p | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | cmarbasclassid | 物料分类编码 | cmarbasclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 5 | cmaterialid | 物料编码 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmarbasclassqualify | 资质要求 | cmarbasclassqualify | varchar(1000) |  | 字符串 (String) |
| 7 | pk_purchaseorg | 可供采购组织 | pk_purchaseorg | varchar(20) |  | 组织 (org) |
| 8 | vbmemo | 备注 | vbmemo | varchar(200) |  | 备注 (Memo) |
| 9 | vprodfunc | 物料用途 | vprodfunc | varchar(50) |  | 字符串 (String) |
| 10 | vprodyear | 产能(年) | vprodyear | varchar(50) |  | 字符串 (String) |
| 11 | vorgmarsource | 主要材料来源 | vorgmarsource | varchar(50) |  | 字符串 (String) |
| 12 | vprovidecycle | 供货周期 | vprovidecycle | varchar(50) |  | 字符串 (String) |
| 13 | csrcid | 来源单据id | csrcid | varchar(20) |  | 字符串 (String) |
| 14 | csrcbid | 来源单据bid | csrcbid | varchar(20) |  | 字符串 (String) |
| 15 | dproducedate | 产品投产日期 | dproducedate | char(19) |  | 日期 (UFDate) |