# |<<

**自由报表分类 (iufo_freerep_dir / nc.vo.iufo.freereport.FreeReportDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3431.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dir | 自由报表分类 | pk_dir | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_parent | 上级分类 | pk_parent | varchar(20) |  | 自由报表分类 (FreeReportDir) |
| 5 | code | 分类编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | sysinit | 系统预置 | sysinit | char(50) |  | 字符串 (String) |
| 8 | modulecode | 所属模块 | modulecode | varchar(50) |  | 字符串 (String) |
| 9 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 10 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 11 | seq | 序号 | seq | varchar(20) |  | 字符串 (String) |
| 12 | assetlayer | 资产层级 | assetlayer | varchar(10) |  | 字符串 (String) | 4 |
| 13 | assetindustry | 资产行业 | assetindustry | varchar(20) |  | 字符串 (String) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |