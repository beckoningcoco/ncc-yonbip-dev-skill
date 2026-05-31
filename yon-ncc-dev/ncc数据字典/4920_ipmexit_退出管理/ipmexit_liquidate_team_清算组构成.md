# |<<

**清算组构成 (ipmexit_liquidate_team / nc.vo.ipmexit.exitliquidate.ExitLiquidateTeamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3277.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_team | 清算组主键 | pk_team | char(20) | √ | 主键 (UFID) |
| 2 | vname | 清算人名称 | vname | varchar(100) |  | 字符串 (String) |
| 3 | vtype | 清算人类型 | vtype | varchar(50) |  | 清算人类型 (LiquidatorType) |  | 1=负责人; |