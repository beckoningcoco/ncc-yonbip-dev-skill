# |<<

**已完成报账单明细 (sscrp_detail_done / nc.vo.sscrp.rpbill.RPDetailVODone)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5614.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 主键 | pk_detail | varchar(50) | √ | 主键 (UFID) |
| 2 | pk_bill | 报账单主键 | pk_bill | varchar(20) |  | 主键 (UFID) |
| 3 | code | 字段编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | value | 字段值 | value | varchar(1000) |  | 字符串 (String) |
| 5 | pk_publicfield | 公共字段 | pk_publicfield | varchar(50) |  | 字符串 (String) |