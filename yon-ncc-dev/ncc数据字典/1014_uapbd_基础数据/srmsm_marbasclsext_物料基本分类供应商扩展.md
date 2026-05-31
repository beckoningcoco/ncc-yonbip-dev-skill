# |<<

**物料基本分类供应商扩展 (srmsm_marbasclsext / nc.vo.bd.marbasclsext.entity.MarBasClsExtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marbasclsext | 物料基本分类供应商扩展主键 | pk_marbasclsext | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 业务单元 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | cmarbasclsid | 物料基本分类主键 | cmarbasclsid | varchar(20) |  | 字符串 (String) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | bispurcls | 电子采购分类 | bispurcls | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bisqualify | 资质要求 | bisqualify | char(1) |  | 布尔类型 (UFBoolean) |