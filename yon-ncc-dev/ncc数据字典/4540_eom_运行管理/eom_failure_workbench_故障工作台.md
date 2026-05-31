# |<<

**故障工作台 (eom_failure_workbench / nc.vo.eom.failureworkbench.FailureWorkbenchHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1836.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failure | 故障记录主键 | pk_failure | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | bill_code | 单据号 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 故障记录状态 (FailureStatus) |  | -1=暂存态; |