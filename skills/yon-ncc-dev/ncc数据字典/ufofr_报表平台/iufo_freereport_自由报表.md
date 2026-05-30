# |<<

**自由报表 (iufo_freereport / nc.vo.iufo.freereport.FreeReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3432.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 自由报表ID | id | char(20) | √ | 主键 (UFID) |
| 2 | pk_dir | 报表分类 | pk_dir | varchar(20) |  | 自由报表分类 (FreeReportDir) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | reportcode | 自由报表编码 | reportcode | varchar(50) |  | 字符串 (String) |
| 6 | name | 自由报表名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 8 | reportinfo | 格式定义 | reportinfo | image |  | BLOB (BLOB) |
| 9 | sysinit | 系统预置 | sysinit | char(50) |  | 字符串 (String) |
| 10 | modelcode | 模块编码 | modelcode | varchar(15) |  | 字符串 (String) |
| 11 | datasource | 数据源 | datasource | varchar(200) |  | 字符串 (String) |
| 12 | assetlayer | 资产层级 | assetlayer | varchar(10) |  | 字符串 (String) | 4 |
| 13 | assetindustry | 资产行业 | assetindustry | varchar(20) |  | 字符串 (String) |
| 14 | forbidnccflag | 禁止轻量端设计 | forbidnccflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 15 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | creator | 创建用户 | creator | varchar(20) |  | 用户 (user) |
| 21 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | modifier | 修改用户 | modifier | varchar(20) |  | 用户 (user) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |