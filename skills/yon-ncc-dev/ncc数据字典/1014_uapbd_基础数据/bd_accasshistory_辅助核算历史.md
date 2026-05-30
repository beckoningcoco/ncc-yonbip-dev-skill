# |<<

**辅助核算历史 (bd_accasshistory / nc.vo.bd.account.history.AccAssHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/297.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accasshistory | 主键 | pk_accasshistory | char(40) | √ | 主键 (UFID) |
| 2 | pk_accass | 辅助核算主键 | pk_accass | char(20) | √ | 辅助核算 (accass) |
| 3 | pk_accasoa | 科目关联表主键 | pk_accasoa | char(20) | √ | 会计科目 (accasoa) |
| 4 | pk_entity | 辅助项目 | pk_entity | char(20) | √ | 会计辅助核算项目 (accassitem) |
| 5 | pk_accchart | 创建科目表 | pk_accchart | varchar(20) |  | 科目表 (accchart) |
| 6 | id | 序号 | id | smallint |  | 整数 (Integer) |
| 7 | isempty | 是否允许为空 | isempty | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isnonleafused | 是否允许录入非末级 | isnonleafused | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | issumprint | 是否汇总打印 | issumprint | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | isbalancecontrol | 是否余额方向控制 | isbalancecontrol | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | num | 被引用数量 | num | int |  | 整数 (Integer) | 1 | [0 , ] |
| 12 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |