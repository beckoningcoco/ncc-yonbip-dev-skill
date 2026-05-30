# |<<

**物料成本分类 (bd_marcostclass / nc.vo.bd.material.marcostclass.MarCostClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/882.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marcostclass | 物料成本分类主键 | pk_marcostclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | pk_father | 分类上级 | pk_father | varchar(20) |  | 物料成本分类 (marcostclass) |
| 5 | code | 物料成本分类编码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 物料成本分类名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | finalcostobj | 最终成本对象 | finalcostobj | char(1) | √ | 布尔类型 (UFBoolean) |
| 8 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (enablestate) | 2 | 1=未启用; |