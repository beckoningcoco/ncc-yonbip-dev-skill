# |<<

**平均汇率 (bd_avgrate / nc.vo.bd.currinfo.AvgRateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/344.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_avgrate | 平均汇率主键 | pk_avgrate | char(20) | √ | 主键 (UFID) |
| 2 | avgrate_month | 会计月平均汇率 | avgrate_month | int |  | 平均汇率计算规则 (avgraterule) |  | 0=(偏移各期间汇率之和+当前期间汇率)/(偏移期间个数+1); |