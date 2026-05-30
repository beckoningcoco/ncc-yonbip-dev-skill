# |<<

**异常信息 (bd_errormsg / nc.vo.bd.errorlog.ErrorMsgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/834.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_errormsg | 异常信息主键 | pk_errormsg | char(20) | √ | 主键 (UFID) |
| 2 | errormsg | 异常信息 | errormsg | varchar(1000) |  | 字符串 (String) |
| 3 | recordtime | 记录时间 | recordtime | char(19) |  | 日期时间 (UFDateTime) |