# |<<

**智能审批监控信息表 (ssctp_approvemonitor / nc.vo.ssctp.sscapv.monitor.SSCApproveMonitorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approvemonitor | 主键 | pk_approvemonitor | char(20) | √ | 主键 (UFID) |
| 2 | approverule | 规则名称 | approverule | varchar(200) |  | 字符串 (String) |
| 3 | pk_approverule | 规则主键 | pk_approverule | varchar(20) |  | 智能审批规则 (ssctp_approverule) |
| 4 | expreason | 异常原因 | expreason | varchar(200) |  | 字符串 (String) |
| 5 | expuntreated | 异常待处理 | expuntreated | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | resultsflag | 执行结果 | resultsflag | varchar(20) |  | 执行结果 (resultsflag) |  | Y=成功; |