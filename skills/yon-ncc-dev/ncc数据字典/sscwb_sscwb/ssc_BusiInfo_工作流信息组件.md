# |<<

**工作流信息组件 (ssc_BusiInfo / nc.vo.ssc.wf.BusiInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5510.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 主键 | pk | char(20) | √ | 主键 (UFID) |
| 2 | pk_bill | 单据主键 | pk_bill | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | state | 里程碑状态 | state | varchar(50) |  | 字符串 (String) |
| 5 | busicode | 业务操作 | busicode | varchar(50) |  | 字符串 (String) |
| 6 | operator | 操作人 | operator | varchar(50) |  | 字符串 (String) |
| 7 | operatime | 操作时间 | operatime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | orderno | 顺序号 | orderno | int |  | 整数 (Integer) |
| 9 | flag | 有效标示 | flag | char(1) |  | 布尔类型 (UFBoolean) |