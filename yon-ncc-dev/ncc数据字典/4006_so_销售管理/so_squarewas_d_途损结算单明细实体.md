# |<<

**途损结算单明细实体 (so_squarewas_d / nc.vo.so.m33.m4453.entity.SquareDetailWasVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csalesquaredid | 途损结算单明细实体 | csalesquaredid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 结算财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 3 | csalesquareid | 途损结算单主实体 | csalesquareid | char(20) |  | 主键 (UFID) |
| 4 | csalesquarebid | 途损结算单子实体 | csalesquarebid | char(20) |  | 主键 (UFID) |
| 5 | csquarebillid | 途损单主实体 | csquarebillid | char(20) |  | 主键 (UFID) |
| 6 | csquarebillbid | 途损单子实体 | csquarebillbid | char(20) |  | 主键 (UFID) |
| 7 | dbilldate | 途损单单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | processeid | 结算批次号 | processeid | varchar(20) |  | 主键 (UFID) |
| 9 | fsquaretype | 结算类型 | fsquaretype | int |  | 结算类型 (SquareType) |  | 0=无; |