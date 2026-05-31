# |<<

**工作负责人变更 (ewm_perm_prinalter / nc.vo.ewm.permit.PermitPrinAlterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1941.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_perm_prinalter | 工作负责人变更主键 | pk_perm_prinalter | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 3 | pk_oldprin | 原工作负责人 | pk_oldprin | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | pk_newprin | 新工作负责人 | pk_newprin | varchar(20) |  | 人员基本信息 (psndoc) |
| 5 | alter_time | 变更时间 | alter_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | linestatus | 行状态 | linestatus | int |  | 行状态 (LineStatusEnum) |  | 0=已确认; |