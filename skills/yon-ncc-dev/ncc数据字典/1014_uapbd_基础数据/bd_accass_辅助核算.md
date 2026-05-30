# |<<

**辅助核算 (bd_accass / nc.vo.bd.account.AccAssVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/296.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accass | 主键 | pk_accass | char(20) | √ | 主键 (UFID) |
| 2 | pk_entity | 辅助项目 | pk_entity | char(20) | √ | 会计辅助核算项目 (accassitem) |
| 3 | pk_accchart | 创建科目表 | pk_accchart | varchar(20) |  | 科目表 (accchart) |
| 4 | id | 序号 | id | smallint |  | 整数 (Integer) |
| 5 | isempty | 允许为空 | isempty | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isnonleafused | 允许录入非末级 | isnonleafused | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | issumprint | 汇总打印 | issumprint | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isbalancecontrol | 余额方向控制 | isbalancecontrol | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | num | 被引用数量 | num | int |  | 整数 (Integer) | 1 |
| 10 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |