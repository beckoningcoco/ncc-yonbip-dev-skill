# |<<

**数据源 (iufo_datasource / nc.vo.iufo.datasource.DataSourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3411.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datasource | 数据源PK | pk_datasource | varchar(50) | √ | 字符串 (String) |
| 2 | dsname | 数据源名称 | dsname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | ds_type | 类型 | ds_type | varchar(50) |  | 数据源类型 (enum) |
| 4 | ds_addr | 地址 | ds_addr | varchar(50) |  | 字符串 (String) |
| 5 | login_name | 登录用户 | login_name | varchar(50) |  | 字符串 (String) |
| 6 | login_passw | 登录密码 | login_passw | varchar(50) |  | 字符串 (String) |
| 7 | db_pass | 数据库密码 | db_pass | varchar(128) |  | 字符串 (String) |
| 8 | account_name | 系统名称 | account_name | varchar(50) |  | 帐套类型 (accuntenum) |
| 9 | aspserver | ASP地址 | aspserver | varchar(50) |  | 字符串 (String) |
| 10 | ver | 版本 | ver | varchar(32) |  | 字符串 (String) |
| 11 | year | 年 | year | decimal(4, 0) |  | 年度枚举 (yearenum) |
| 12 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 13 | default_account | 默认 | default_account | varchar(50) |  | 字符串 (String) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 15 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 16 | def1 | 自定义项1 | def1 | varchar(200) |  | 字符串 (String) |
| 17 | def2 | 自定义项2 | def2 | varchar(200) |  | 字符串 (String) |
| 18 | def3 | 自定义项3 | def3 | varchar(200) |  | 字符串 (String) |
| 19 | def4 | 自定义项4 | def4 | varchar(200) |  | 字符串 (String) |
| 20 | def5 | 自定义项5 | def5 | varchar(200) |  | 字符串 (String) |
| 21 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 候修改者 | modifier | varchar(20) |  | 用户 (user) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |