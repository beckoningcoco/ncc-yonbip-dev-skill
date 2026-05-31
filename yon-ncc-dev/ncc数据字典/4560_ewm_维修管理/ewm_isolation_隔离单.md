# |<<

**隔离单 (ewm_isolation / nc.vo.ewm.isolation.IsolationHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1925.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_isolation | 隔离单主键 | pk_isolation | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 6 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 7 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 8 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | bill_code | 隔离单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 10 | bill_name | 隔离名称 | bill_name | varchar(200) |  | 字符串 (String) |
| 11 | bill_status | 单据状态 | bill_status | int |  | 执行状态 (enum) |  | 0=自由态; |