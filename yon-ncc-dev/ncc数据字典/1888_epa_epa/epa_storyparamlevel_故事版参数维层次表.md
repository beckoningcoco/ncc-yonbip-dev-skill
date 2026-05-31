# |<<

**故事版参数维层次表 (epa_storyparamlevel / nc.vo.epa.query.storyBoard.StoryParamLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1867.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | refpk | 层次pk | refpk | varchar(500) |  | 字符串 (String) |
| 3 | refname | 层次name | refname | varchar(500) |  | 字符串 (String) |
| 4 | dimpk | 维度pk | dimpk | varchar(500) |  | 字符串 (String) |
| 5 | dimname | 维度name | dimname | varchar(500) |  | 字符串 (String) |
| 6 | selectedvalue | selectedvalue | selectedvalue | varchar(500) |  | 字符串 (String) |
| 7 | showconditon | 参数维是否显示 | showconditon | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_storyboardid | 故事版pk | pk_storyboardid | char(20) |  | 主键 (UFID) |
| 9 | pk_sheet | sheet页pk | pk_sheet | char(20) |  | 主键 (UFID) |
| 10 | chartids | 故事版参数维影响图表 | chartids | image |  | BLOB (BLOB) |
| 11 | levelcode | levelCode | levelcode | varchar(50) |  | 字符串 (String) |
| 12 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |
| 13 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 14 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 15 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 16 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |