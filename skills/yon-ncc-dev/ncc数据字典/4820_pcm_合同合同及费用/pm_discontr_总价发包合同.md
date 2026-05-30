# |<<

**总价发包合同 (pm_discontr / nc.vo.pcm.discontr.DiscontrHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4449.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discontr | 总价发包合同主键 | pk_discontr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 6 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 7 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | busi_type | 业务流程 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 9 | bill_code | 合同编码 | bill_code | varchar(300) |  | 字符串 (String) |
| 10 | contr_name | 合同名称 | contr_name | varchar(300) |  | 字符串 (String) |
| 11 | pk_contracttype | 合同类型 | pk_contracttype | varchar(20) |  | 合同类型 (pmcontracttype) |
| 12 | bill_status | 合同状态 | bill_status | int |  | 合同状态 (contractstatus) |  | -1=自由态; |