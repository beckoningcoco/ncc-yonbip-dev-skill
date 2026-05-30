# |<<

**EIS消息 (eip_eis / nc.vo.eip.eis.EISVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1785.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eis | 主键 | pk_eis | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | msgstatus | 状态 | msgstatus | int |  | 整数 (Integer) |
| 4 | receipt | 回执 | receipt | varchar(50) |  | 字符串 (String) |
| 5 | data | 数据 | data | varchar(50) |  | 字符串 (String) |