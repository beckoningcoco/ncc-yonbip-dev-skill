# |<<

**自由报表-节点 (iufo_freereport / nc.vo.iufo.freereport.FreeReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3433.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 报表主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | code | 报表编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 报表名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_dir | 报表分类 | pk_dir | varchar(20) |  | 自由报表分类 (FreeReportDir) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |