# |<<

**报表数据升迁表头 (bgr_reportmig_head / nc.vo.ufoe.datamig.ReportMigHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1184.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datamig_head | 升迁数据主键 | pk_datamig_head | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 报表任务pk | pk_task | varchar(50) |  | 字符串 (String) |
| 3 | taskname | 报表任务名称 | taskname | varchar(50) |  | 字符串 (String) |
| 4 | expfilename | 导出文件名称 | expfilename | varchar(200) |  | 字符串 (String) |
| 5 | pk_workbook | 套表pk | pk_workbook | char(20) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 7 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 10 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 11 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 12 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 13 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 14 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 15 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 16 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 17 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 18 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |