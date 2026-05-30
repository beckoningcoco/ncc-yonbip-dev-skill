# |<<

**分析报表 (iufo_anarep / nc.vo.iufo.anareport.AnaReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3390.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 分析报表id | id | char(20) | √ | 主键 (UFID) |
| 2 | pk_dir | 报表分类 | pk_dir | varchar(20) |  | 分析报表分类 (AnaReportDir) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | reportcode | 报表编码 | reportcode | varchar(50) |  | 字符串 (String) |
| 6 | name | 报表名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | note | 说明 | note | varchar(200) |  | 备注 (Memo) |
| 8 | reportinfo | 格式定义 | reportinfo | image |  | BLOB (BLOB) |
| 9 | sysinit | 系统预置 | sysinit | varchar(50) |  | 字符串 (String) |
| 10 | modelcode | 模块编码 | modelcode | varchar(50) |  | 字符串 (String) |
| 11 | datasource | 数据源 | datasource | varchar(50) |  | 数据源 (数据源枚举) |  | 0=当前数据源; |