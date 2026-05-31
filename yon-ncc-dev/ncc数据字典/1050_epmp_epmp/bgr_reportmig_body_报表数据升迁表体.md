# |<<

**报表数据升迁表体 (bgr_reportmig_body / nc.vo.ufoe.datamig.ReportMigBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1182.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datamig_body | 数据升迁表体主键 | pk_datamig_body | char(20) | √ | 主键 (UFID) |
| 2 | period | 期间 | period | varchar(50) |  | 字符串 (String) |
| 3 | datafilename | 导出文件名称 | datafilename | varchar(200) |  | 字符串 (String) |
| 4 | filepath | 文件路径 | filepath | varchar(200) |  | 字符串 (String) |
| 5 | pk_datamig_head | 表头任务pk | pk_datamig_head | varchar(20) |  | 报表数据升迁表头 (ReportMigHead) |
| 6 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 7 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 8 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 9 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 10 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 11 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 12 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 13 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 14 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 15 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |