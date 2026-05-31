# |<<

**供应商资质档案 (bd_supqualidoc / nc.vo.bd.supplier.supqualidoc.SupQualiDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/984.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supqualidoc | 主键 | pk_supqualidoc | char(20) | √ | 主键 (UFID) |
| 2 | code | 资质编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 资质名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 6 | pk_qualitype | 资质分类 | pk_qualitype | varchar(20) | √ | 供应商资质分类 (supqualitype) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |