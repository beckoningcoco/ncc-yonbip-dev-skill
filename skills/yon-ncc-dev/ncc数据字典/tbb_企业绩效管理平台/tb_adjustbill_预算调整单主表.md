# |<<

**预算调整单主表 (tb_adjustbill / nc.vo.tb.adjbill.AdjustBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustbill | 调整单主键 | pk_adjustbill | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(30) |  | 字符串 (String) |
| 3 | vbilltype | 单据类型 | vbilltype | varchar(10) |  | 单据类型 (tbb_billtype) |  | 0=预算调整单; |