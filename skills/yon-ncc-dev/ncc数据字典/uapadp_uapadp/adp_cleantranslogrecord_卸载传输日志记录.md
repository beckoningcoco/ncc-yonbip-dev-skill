# |<<

**卸载传输日志记录 (adp_cleantranslogrecord / nc.vo.uap.distribution.cleantranslogconfig.CleanTransLogRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | recordid | 记录ID | recordid | char(20) | √ | 主键 (UFID) |
| 2 | starttime | 开始时间 | starttime | char(19) |  | 日期时间 (UFDateTime) |
| 3 | endtime | 结束时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | runstatus | 运行状态 | runstatus | int |  | 运行状态 (cleanlogrunstatus) |  | 1=正常运行; |