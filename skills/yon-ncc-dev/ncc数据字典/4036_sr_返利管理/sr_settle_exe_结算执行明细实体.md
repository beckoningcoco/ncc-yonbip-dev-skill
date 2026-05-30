# |<<

**结算执行明细实体 (sr_settle_exe / nc.vo.sr.settle.entity.SettleExeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5482.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settle_exe | 结算执行明细 | pk_settle_exe | char(20) | √ | 主键 (UFID) |
| 2 | cdestid | 下游单据主实体 | cdestid | varchar(20) |  | 主键 (UFID) |
| 3 | cdestbid | 下游单据子实体 | cdestbid | varchar(20) |  | 主键 (UFID) |
| 4 | pk_settle | 结算单主实体 | pk_settle | varchar(20) |  | 主键 (UFID) |
| 5 | pk_settle_b | 结算单子实体 | pk_settle_b | varchar(20) |  | 主键 (UFID) |