# |<<

**对账日志 (bcs_dzlog / nc.vo.bcs.vouch.BCSDzLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/277.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 对账日志主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_taskdef | 任务模板 | pk_taskdef | varchar(20) |  | 字符串 (String) |
| 3 | pk_year | 会计期间 | pk_year | varchar(20) |  | 字符串 (String) |
| 4 | pk_month | 会计月 | pk_month | varchar(20) |  | 字符串 (String) |
| 5 | pk_curr | 币种 | pk_curr | varchar(20) |  | 字符串 (String) |
| 6 | pk_rule | 规则 | pk_rule | varchar(20) |  | 字符串 (String) |
| 7 | rulets | 规则时间 | rulets | char(19) |  | 日期 (UFDate) |
| 8 | pk_selforg | 本方单位 | pk_selforg | varchar(20) |  | 字符串 (String) |
| 9 | selforgts | 本方单位时间 | selforgts | char(19) |  | 日期 (UFDate) |
| 10 | pk_countorg | 对方单位 | pk_countorg | varchar(20) |  | 字符串 (String) |
| 11 | countorgts | 对方单位时间 | countorgts | char(19) |  | 日期 (UFDate) |
| 12 | combkey | 对账组合键 | combkey | varchar(100) |  | 字符串 (String) |