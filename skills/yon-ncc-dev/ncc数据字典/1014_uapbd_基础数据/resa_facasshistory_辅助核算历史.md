# |<<

**辅助核算历史 (resa_facasshistory / nc.vo.resa.factor.history.FactorAssHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4902.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_facasshistory | 标识 | pk_facasshistory | char(40) | √ | 主键 (UFID) |
| 2 | pk_factorass | 辅助核素标识 | pk_factorass | varchar(20) |  | 关联辅助核算 (FactorAss) |
| 3 | pk_factorasoa | 要素关联信息标识 | pk_factorasoa | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 4 | pk_entity | 辅助项目 | pk_entity | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 5 | pk_factorchart | 创建要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 6 | seqno | 序号 | seqno | int |  | 整数 (Integer) |
| 7 | isempty | 允许为空 | isempty | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isnonleafused | 允许录入非末级 | isnonleafused | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | issumprint | 汇总打印 | issumprint | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | isbalancecontrol | 余额方向控制 | isbalancecontrol | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | num | 引用标识 | num | int |  | 整数 (Integer) |
| 12 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |