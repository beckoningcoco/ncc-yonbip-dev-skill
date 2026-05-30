# |<<

**合并步骤状态 (iufo_step_status / nc.vo.hbbb.hbflow.HBStepStatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3509.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_status | 主键 | pk_status | char(20) | √ | 主键 (UFID) |
| 2 | pk_hbstep | 步骤主键 | pk_hbstep | varchar(50) |  | 字符串 (String) |
| 3 | aloneid | aloneid | aloneid | varchar(50) |  | 字符串 (String) |
| 4 | executor | 最后执行人 | executor | varchar(20) |  | 用户 (user) |
| 5 | executime | 最后执行时间 | executime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | exceptioninfo | 执行异常信息 | exceptioninfo | varchar(50) |  | 字符串 (String) |
| 7 | stepstatus | 步骤状态 | stepstatus | varchar(20) |  | 步骤状态 (stepstatus) |  | 0=初始; |