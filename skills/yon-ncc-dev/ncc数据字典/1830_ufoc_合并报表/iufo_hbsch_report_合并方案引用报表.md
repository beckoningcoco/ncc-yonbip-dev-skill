# |<<

**合并方案引用报表 (iufo_hbsch_report / nc.vo.hbbb.hbscheme.HBSchemeReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3452.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbscheme_report | 主键 | pk_hbscheme_report | char(20) | √ | 主键 (UFID) |
| 2 | pk_hbscheme | 合并方案主键 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 3 | pk_report | 报表主键 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | position | 位标 | position | int |  | 整数 (Integer) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |