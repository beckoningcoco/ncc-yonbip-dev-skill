# |<<

**我的报表库分类 (iufo_replib_sort / nc.vo.iufo.portal.RepLibrarySortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_replib_sort | 主键 | pk_replib_sort | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_user | 收件人 | pk_user | varchar(20) |  | 用户 (user) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 8 | pk_parent | 上级分类 | pk_parent | varchar(50) |  | 字符串 (String) |
| 9 | deledir | 是否可删除 | deledir | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |