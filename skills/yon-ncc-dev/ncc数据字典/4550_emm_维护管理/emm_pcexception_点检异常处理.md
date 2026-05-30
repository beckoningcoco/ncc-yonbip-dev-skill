# |<<

**点检异常处理 (emm_pcexception / nc.vo.emm.pcexception.PCExceptionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1805.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pointcheck | 主表主键 | pk_pointcheck | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | bill_code | 单据号 | bill_code | varchar(50) |  | 字符串 (String) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |