# |<<

**反馈记录 (phm_progress_record / nc.vo.phm.progress.record.ProgressRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_record | 记录主键 | pk_record | char(20) | √ | 主键 (UFID) |
| 2 | pk_plan_item | 计划记录主键 | pk_plan_item | varchar(20) |  | 前期计划条目 (EarlyPlanItem) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 5 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 6 | bill_code | 单据号 | bill_code | varchar(50) |  | 字符串 (String) |
| 7 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 8 | transi_type | 交易类型 | transi_type | varchar(50) |  | 字符串 (String) |
| 9 | pk_transitype | 交易类型主键 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |