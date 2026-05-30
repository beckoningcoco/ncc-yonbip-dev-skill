# |<<

**账簿信息明细 (fa_accbookinfo_b / nc.vo.fa.accbookinfo.AccbookBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1982.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accbookinfo_b | 主键 | pk_accbookinfo_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_category | 资产类别 | pk_category | varchar(20) | √ | 资产类别 (assetcategory) |
| 5 | servicemonth | 使用月限 | servicemonth | int |  | 整数 (Integer) |
| 6 | pk_depmethod | 折旧方法 | pk_depmethod | varchar(20) |  | 折旧方法 (depmethod) |
| 7 | salvagerate | 净残值率[%] | salvagerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | depmethodattr | 折旧属性 | depmethodattr | int | √ | 折旧属性 (depmethodAttr) | 2 | 0=入账当期不提，减少当期提，价值调整按调整前提; |