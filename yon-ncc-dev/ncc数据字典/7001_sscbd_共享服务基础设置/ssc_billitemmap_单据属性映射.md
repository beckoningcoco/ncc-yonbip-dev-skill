# |<<

**单据属性映射 (ssc_billitemmap / nc.vo.ssc.task.base.BillItemMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5503.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billitemmap | 实体标识 | pk_billitemmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 3 | pk_transactype | 交易类型 | pk_transactype | varchar(50) |  | 字符串 (String) |
| 4 | billitem | 单据属性 | billitem | varchar(50) |  | 字符串 (String) |
| 5 | sscitem | 共享服务中心属性 | sscitem | varchar(50) |  | 字符串 (String) |
| 6 | convertor | 转换类 | convertor | varchar(200) |  | 字符串 (String) |