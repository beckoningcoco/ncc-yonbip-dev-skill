# |<<

**步骤状态表头 (bcs_stepstatus / nc.vo.bcs.hbflow.BCSStepStatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/284.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stepstatus | 主键 | pk_stepstatus | char(20) | √ | 主键 (UFID) |
| 2 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(50) |  | 字符串 (String) |
| 3 | pk_mvtype | 业务方案 | pk_mvtype | varchar(50) |  | 字符串 (String) |
| 4 | version | 版本 | version | varchar(50) |  | 字符串 (String) |
| 5 | curren | 币种 | curren | varchar(50) |  | 字符串 (String) |
| 6 | pk_scope | 合并范围 | pk_scope | varchar(50) |  | 字符串 (String) |
| 7 | uniqkey | 时间属性 | uniqkey | varchar(100) |  | 字符串 (String) |
| 8 | otherdim | 其它维度 | otherdim | varchar(1000) |  | 字符串 (String) |