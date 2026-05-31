# |<<

**预留出入库执行名细 (ic_resexec / nc.vo.ic.reserve.entity.ReserveExecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2964.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resexec | 预留出入库执行名细 | pk_resexec | char(20) | √ | 主键 (UFID) |
| 2 | pk_prereserve | 预计入预留 | pk_prereserve | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_onhanddim | 现存量维度 | pk_onhanddim | varchar(20) |  | 现存量维度 (OnhandDimVO) |
| 5 | ilogno | 线索号 | ilogno | int |  | 整数 (Integer) |
| 6 | nrsoutnum | 预留出库数量 | nrsoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nrsinnum | 预留入库数量 | nrsinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | cbilltype | 出入库单据类型 | cbilltype | varchar(20) |  | 字符串 (String) |
| 9 | cbillid | 出入库单据 | cbillid | varchar(20) |  | 主键 (UFID) |
| 10 | cbillbid | 出入库单据明细 | cbillbid | varchar(20) |  | 主键 (UFID) |
| 11 | fresstate | 预留状态 | fresstate | int |  | 预留状态 (ReserveState) |  | 1=预留; |