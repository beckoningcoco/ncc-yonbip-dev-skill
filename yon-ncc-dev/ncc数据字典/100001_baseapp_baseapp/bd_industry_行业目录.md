# |<<

**行业目录 (bd_industry / nc.vo.bd.industry.IndustryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/865.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_industry | 行业目录主键 | pk_industry | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 编码 | code | varchar(20) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | parent_id | 父行业 | parent_id | varchar(20) |  | 行业目录 (industry) |
| 7 | isdefault | 是否预置 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | issystem | 是否系统 | issystem | varchar(50) |  | 字符串 (String) |
| 9 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |