# |<<

**产出物价值调整单 (pm_proadapt / nc.vo.ppm.productadapt.ProAdaptHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4501.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_proadapt | 产出物价值调整单主键 | pk_proadapt | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 3 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 4 | ductorg | 产出物组织名称 | ductorg | varchar(20) |  | 字符串 (String) |
| 5 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 9 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 10 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 11 | bill_status | 单据状态 | bill_status | int |  | 产出物调整单状态 (proadaptstatus) |  | -1=自由态; |