# |<<

**所有权调入 (pam_redeploy_in / nc.vo.aum.deploy.in.DeployInHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4299.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_redeploy_in | 调入单主键 | pk_redeploy_in | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | bill_code | 调入单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 5 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |