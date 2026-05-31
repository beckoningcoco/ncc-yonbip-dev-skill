# |<<

**分配默认值模板 (bd_assign_temp / nc.vo.bd.assign.AssigntempVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/335.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign_temp | 主键 | pk_assign_temp | char(20) | √ | 字符串 (String) |
| 2 | code | 模板编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 模板名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_assign_tab | 档案页签 | pk_assign_tab | char(20) | √ | 字符串 (String) |
| 5 | memo | 备注 | memo | varchar(1000) |  | 字符串 (String) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | defvalues | 默认值 | defvalues | image |  | BLOB (BLOB) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |