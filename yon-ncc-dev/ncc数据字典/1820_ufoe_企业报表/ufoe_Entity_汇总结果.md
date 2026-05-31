# |<<

**汇总结果 (ufoe_Entity / nc.vo.ufoe.totalresult.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5900.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | resultid | 汇总结果主键 | resultid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 汇总组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_report | 汇总报表 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 4 | keygroupvalue | 关键字组合值 | keygroupvalue | varchar(50) |  | 字符串 (String) |
| 5 | resultnote | 结果说明 | resultnote | varchar(50) |  | 执行结果说明 (TotalResultNoteEnum) |  | 1=已上报/已确认; |