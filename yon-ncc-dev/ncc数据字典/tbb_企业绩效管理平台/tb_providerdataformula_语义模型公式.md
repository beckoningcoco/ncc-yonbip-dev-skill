# |<<

**语义模型公式 (tb_providerdataformula / nc.vo.tb.rule.excel.ProviderDataFormulaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_providedata | 主键 | pk_providedata | char(20) | √ | 主键 (UFID) |
| 2 | pk_workbook | 关联套表 | pk_workbook | varchar(50) |  | 字符串 (String) |
| 3 | pk_worksheet | 关联sheet | pk_worksheet | varchar(50) |  | 字符串 (String) |
| 4 | startrow | 起始行 | startrow | int |  | 整数 (Integer) |
| 5 | startcol | 起始列 | startcol | int |  | 整数 (Integer) |
| 6 | formula | 公式内容 | formula | varchar(2000) |  | 字符串 (String) |
| 7 | colcount | 列宽(没用到) | colcount | int |  | 整数 (Integer) |
| 8 | createddate | 创建时间 | createddate | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifiedby | 修改人 | modifiedby | varchar(20) |  | 用户 (user) |
| 10 | modifieddate | 修改时间 | modifieddate | char(19) |  | 日期时间 (UFDateTime) |
| 11 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 12 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | def1 | 自定义1 | def1 | varchar(50) |  | 字符串 (String) |
| 14 | def2 | 自定义2 | def2 | varchar(50) |  | 字符串 (String) |
| 15 | def3 | 自定义3 | def3 | varchar(50) |  | 字符串 (String) |
| 16 | def4 | 自定义4 | def4 | varchar(50) |  | 字符串 (String) |
| 17 | def5 | 自定义5 | def5 | varchar(50) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |