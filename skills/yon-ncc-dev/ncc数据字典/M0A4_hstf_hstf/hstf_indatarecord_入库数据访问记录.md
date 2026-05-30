# |<<

**入库数据访问记录 (hstf_indatarecord / nc.vo.hstf.instockdata.IndataRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2766.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indatarecord | DID | pk_indatarecord | char(20) | √ | 主键 (UFID) |
| 2 | optname | 操作人 | optname | varchar(50) |  | 字符串 (String) |
| 3 | opttime | 操作时间 | opttime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | pk_srcsystem | 来源系统 | pk_srcsystem | varchar(50) |  | 字符串 (String) |
| 5 | optstatus | 状态 | optstatus | int |  | 调用结果 (useresult) |  | 1=SUCCESS; |