# |<<

**积数调整子实体 (fac_jstz_b / nc.vo.fac.aggregate.JsAdjustmentBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2099.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aggregateadj_b | 积数调整子实体标识 | pk_aggregateadj_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_aggregateadj_h | 积数调整主实体 | pk_aggregateadj_h | varchar(20) |  | 积数调整 (aggregateadj) |
| 3 | adjustdate | 调整日期 | adjustdate | char(19) |  | 日期 (UFDate) |
| 4 | balance | 余额 | balance | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | dqxbalance | 倒起息余额 | dqxbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | intbalance | 计息余额 | intbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | intaggregate | 计息积数 | intaggregate | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | adjustment | 调整积数 | adjustment | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | adjustedaggregate | 调整后积数 | adjustedaggregate | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | resetflag | 积数归零标志 | resetflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |