# |<<

**供货能力分类 (bd_supabclass / nc.vo.bd.supplier.supplyabilityclass.SupplyAbilityClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/969.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supabclass | 供货能力分类主键 | pk_supabclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | code | 供货能力分类编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 供货能力分类名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | pid | 上级供货能力分类 | pid | varchar(20) |  | 供货能力分类 (supply_ability_class) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | gradesys | 等级体系 | gradesys | varchar(20) |  | 供应商等级体系设置 (supplier_grade_sys) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |