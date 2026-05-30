# |<<

**预留 (ic_reserve / nc.vo.ic.reserve.entity.ReserveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2963.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reserve | 预留 | pk_reserve | char(20) | √ | 主键 (UFID) |
| 2 | vrescode | 预留记录号 | vrescode | varchar(40) |  | 字符串 (String) |
| 3 | vreqbillcode | 需求单据号 | vreqbillcode | varchar(40) |  | 字符串 (String) |
| 4 | creqbillrowno | 需求单据行号 | creqbillrowno | varchar(40) |  | 字符串 (String) |
| 5 | creqbillid | 需求单据头 | creqbillid | varchar(20) |  | 主键 (UFID) |
| 6 | creqbillbid | 需求单据明细 | creqbillbid | varchar(20) |  | 主键 (UFID) |
| 7 | creqbilltype | 需求单据类型 | creqbilltype | varchar(50) |  | 需求类型 (RequireType) |  | 30=销售订单; |