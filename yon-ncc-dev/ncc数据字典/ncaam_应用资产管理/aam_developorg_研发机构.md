# |<<

**研发机构 (aam_developorg / nc.vo.ncaam.developorg.DevelopOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_developorg | 机构主键 | pk_developorg | char(20) | √ | 主键 (UFID) |
| 2 | orgcode | 机构编码 | orgcode | varchar(50) | √ | 字符串 (String) |
| 3 | orgname | 机构名称 | orgname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | orgtype | 机构类别 | orgtype | varchar(50) | √ | 研发机构类别 (DevelopOrgTypeEnum) |  | 1=内部-核心研发; |