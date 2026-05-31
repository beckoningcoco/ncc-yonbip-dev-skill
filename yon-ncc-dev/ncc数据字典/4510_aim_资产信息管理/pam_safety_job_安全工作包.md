# |<<

**安全工作包 (pam_safety_job / nc.vo.aim.safetyjob.SafetyJobHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4321.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_safety_job | 安全工作包主键 | pk_safety_job | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | bill_code | 编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | bill_name | 名称 | bill_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 7 | requirepermit | 需要许可 | requirepermit | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 9 | transi_type | 交易类型 | transi_type | varchar(20) |  | 字符串 (String) |
| 10 | pk_transitype | 交易类型主键 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |