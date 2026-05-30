# |<<

**智能审批操作日志信息 (ssctp_approve_log / nc.vo.ssctp.sscapv.monitor.SSCApproveLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5633.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approve_log | 主键 | pk_approve_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_billid | 单据主键 | pk_billid | varchar(20) | √ | 字符串 (String) |
| 3 | actiontype | 执行动作 | actiontype | varchar(50) |  | 字符串 (String) |
| 4 | result | 执行结果 | result | varchar(20) |  | 执行结果 (resultsflag) |  | Y=成功; |