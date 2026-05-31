# |<<

**关联辅助核算 (resa_factorass / nc.vo.resa.factor.FactorAssVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4906.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factorass | 标识 | pk_factorass | char(20) | √ | 主键 (UFID) |
| 2 | pk_entity | 辅助项目 | pk_entity | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 3 | pk_factorchart | 创建要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 4 | seqno | 序号 | seqno | int |  | 整数 (Integer) |
| 5 | isempty | 允许为空 | isempty | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isnonleafused | 允许录入非末级 | isnonleafused | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | issumprint | 汇总打印 | issumprint | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isbalancecontrol | 余额方向控制 | isbalancecontrol | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | num | 引用标识 | num | int |  | 整数 (Integer) | 1 |
| 10 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |