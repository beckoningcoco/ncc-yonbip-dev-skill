# |<<

**药品基本信息 (bd_material_2 / nc.vo.drugbd.dataio.MaterialVO2)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/888.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 主键 (UFID) |
| 2 | pk_source | 原始版本 | pk_source | varchar(20) |  | 物料基本信息 (material_v) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 5 | code | 物料编码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 物料名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | ename | 英语名称 | ename | varchar(200) |  | 字符串 (String) |
| 8 | version | 版本号 | version | int |  | 整数 (Integer) | 1 |
| 9 | latest | 是否最新 | latest | char(1) |  | 布尔类型 (UFBoolean) | N |
| 10 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) | √ | 物料基本分类 (marbasclass) |
| 11 | pk_measdoc | 主计量单位 | pk_measdoc | varchar(20) | √ | 计量单位 (measdoc) |
| 12 | materialmnecode | 助记码 | materialmnecode | varchar(50) |  | 字符串 (String) |
| 13 | materialshortname | 物料简称 | materialshortname | varchar(200) |  | 字符串 (String) |
| 14 | materialspec | 规格 | materialspec | varchar(400) |  | 字符串 (String) |
| 15 | ematerialspec | 英文规格 | ematerialspec | varchar(400) |  | 字符串 (String) |
| 16 | materialtype | 型号 | materialtype | varchar(400) |  | 字符串 (String) |
| 17 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 18 | materialmgt | 实物物料管理模式 | materialmgt | smallint |  | 实物物料管理模式 (materialmgt) |  | 1=周转材料; |