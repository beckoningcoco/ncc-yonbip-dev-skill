# |<<

**批量调整规则 (ufoc_batchadjvouchrule / nc.vo.ufoc.batchadjvouchrule.BatchAdjvouchruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5863.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchrule | 主键 | pk_batchrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 5 | pk_adjscheme | 调整方案 | pk_adjscheme | varchar(20) |  | 报表调整方案 (adjscheme) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | mainorg | 主组织 | mainorg | varchar(20) |  | 组织 (org) |
| 8 | roothbscheme | 根合并方案 | roothbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 9 | def1 | 自定义1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def2 | 自定义2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def3 | 自定义3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def4 | 自定义4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def5 | 自定义5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |