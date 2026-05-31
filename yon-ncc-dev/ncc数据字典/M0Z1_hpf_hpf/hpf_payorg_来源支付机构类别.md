# |<<

**来源支付机构类别 (hpf_payorg / nc.vo.hpf.hpfpayorg.PayOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2642.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payorg | 主键 | pk_payorg | char(20) | √ | 主键 (UFID) |
| 2 | syscode | 业务单元编码 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | id | id | id | char(20) |  | 主键 (UFID) |
| 7 | code | 支付机构编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | name | 支付机构名称 | name | varchar(100) |  | 字符串 (String) |
| 9 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 10 | superiorname | 上级名称 | superiorname | varchar(50) |  | 字符串 (String) |
| 11 | superiorcode | 上级编码 | superiorcode | varchar(50) |  | 字符串 (String) |
| 12 | source | 来源 | source | varchar(50) |  | 数据来源 (DataSource) |  | 1=HIS系统; |