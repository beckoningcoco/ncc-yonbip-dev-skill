# |<<

**标准工作包 (pam_std_job / nc.vo.am.stdjob.StdJobHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4329.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_std_job | 标准工作包主键 | pk_std_job | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | bill_code | 标准工作包编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | std_job_name | 标准工作包名称 | std_job_name | varchar(400) |  | 多语文本 (MultiLangText) |
| 7 | transi_type | 交易类型 | transi_type | varchar(20) |  | 字符串 (String) |
| 8 | pk_transitype | 交易类型主键 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 10 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |