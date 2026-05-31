# |<<

**供应商资质分类 (bd_supqualitype / nc.vo.bd.supplier.supqualitype.SupQualiTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/986.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supqualitype | 主键 | pk_supqualitype | char(20) | √ | 主键 (UFID) |
| 2 | code | 资质分类编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 资质分类名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 6 | pk_parentqualitype | 上级资质分类 | pk_parentqualitype | varchar(20) |  | 供应商资质分类 (supqualitype) |
| 7 | innercode | 内码 | innercode | varchar(200) |  | 字符串 (String) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |