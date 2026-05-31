# |<<

**齐套分析日志 (mm_salog / nc.vo.mmpub.setanalysis.entity.SaLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3771.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 主键 | pk_log | varchar(20) | √ | 字符串 (String) |
| 2 | computecode | 分析标识 | computecode | varchar(30) |  | 字符串 (String) |
| 3 | pk_analysis | 分析对象 | pk_analysis | varchar(50) |  | 字符串 (String) |
| 4 | vbillcode | 单据号 | vbillcode | varchar(20) |  | 字符串 (String) |
| 5 | vbilltype | 单据类型 | vbilltype | varchar(20) |  | 字符串 (String) |
| 6 | vbillid | 单据主键 | vbillid | varchar(20) |  | 字符串 (String) |
| 7 | vbillbid | 子表主键 | vbillbid | varchar(20) |  | 字符串 (String) |
| 8 | vfailreason | 原因 | vfailreason | varchar(1000) |  | 字符串 (String) |
| 9 | fstatus | 级别 | fstatus | int |  | 日志级别 (SaLogEnum) |  | 1=错误; |