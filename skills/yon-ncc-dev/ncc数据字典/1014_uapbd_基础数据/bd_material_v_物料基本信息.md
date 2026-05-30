# |<<

**物料基本信息 (bd_material_v / nc.vo.bd.material.MaterialVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/890.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_source | 原始版本 | pk_source | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 5 | code | 物料编码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 物料名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | version | 版本 | version | int | √ | 整数 (Integer) |
| 8 | materialspec | 规格 | materialspec | varchar(400) |  | 字符串 (String) |
| 9 | materialtype | 型号 | materialtype | varchar(400) |  | 字符串 (String) |
| 10 | materialshortname | 物料简称 | materialshortname | varchar(200) |  | 字符串 (String) |
| 11 | materialbarcode | 条形码 | materialbarcode | varchar(30) |  | 字符串 (String) |
| 12 | materialmnecode | 助记码 | materialmnecode | varchar(50) |  | 字符串 (String) |
| 13 | graphid | 图号 | graphid | varchar(50) |  | 字符串 (String) |
| 14 | pk_measdoc | 主计量单位 | pk_measdoc | char(20) | √ | 计量单位 (measdoc) |
| 15 | pk_marbasclass | 物料分类 | pk_marbasclass | char(20) | √ | 物料基本分类 (marbasclass) |
| 16 | pk_prodline | 产品线 | pk_prodline | varchar(20) |  | 产品线 (prodline) |
| 17 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 18 | fee | 服务类 | fee | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | discountflag | 价格折扣 | discountflag | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | setpartsflag | 成套件 | setpartsflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | prodarea | 产地 | prodarea | varchar(20) |  | 产地(自定义档案) (Defdoc-BD007_0xx) |
| 22 | prolifeperiod | 产品生命周期 | prolifeperiod | int |  | 产品生命周期 (prolifeperiod) |  | 0=试销期; |