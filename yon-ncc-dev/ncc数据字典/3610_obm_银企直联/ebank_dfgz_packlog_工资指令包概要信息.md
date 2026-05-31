# |<<

**工资指令包概要信息 (ebank_dfgz_packlog / nc.vo.obm.payroll.DfgzPackLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1761.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 主键 | pk_log | char(20) | √ | 主键 (UFID) |
| 2 | yurref | 支付参考号 | yurref | varchar(30) |  | 字符串 (String) |
| 3 | paypackageid | 发送批次号 | paypackageid | varchar(30) |  | 字符串 (String) |
| 4 | senddate | 发送时间 | senddate | char(19) |  | 日期时间 (UFDateTime) |
| 5 | headpackageid | 主包流水号 | headpackageid | varchar(50) |  | 字符串 (String) |
| 6 | persontotal | 支付人数 | persontotal | int |  | 整数 (Integer) |
| 7 | totalsum | 支付金额 | totalsum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | tranflag | 支付状态 | tranflag | int |  | 整数 (Integer) |
| 9 | tranmsg | 支付状态信息 | tranmsg | varchar(400) |  | 字符串 (String) |
| 10 | retcode | 银行返回错误码 | retcode | varchar(40) |  | 字符串 (String) |
| 11 | errmsg | 银行返回错误描述 | errmsg | varchar(400) |  | 字符串 (String) |