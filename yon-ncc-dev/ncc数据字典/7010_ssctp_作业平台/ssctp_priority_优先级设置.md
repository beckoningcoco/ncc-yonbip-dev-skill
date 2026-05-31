# |<<

**优先级设置 (ssctp_priority / nc.vo.ssctp.sscbd.SSCPriorityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5659.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priority | 主键 | pk_priority | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | pk_workinggroup | 作业组 | pk_workinggroup | varchar(50) |  | 字符串 (String) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | formula | 优先级条件 | formula | varchar(2000) |  | 字符串 (String) |
| 7 | formulashow | 优先级条件显示名称 | formulashow | varchar(2000) |  | 字符串 (String) |
| 8 | ordernum | 优先级顺序 | ordernum | int |  | 整数 (Integer) |
| 9 | upgraderule | 晋级模式 | upgraderule | varchar(50) |  | 晋级模式 (upgraderule) |  | none=无; |