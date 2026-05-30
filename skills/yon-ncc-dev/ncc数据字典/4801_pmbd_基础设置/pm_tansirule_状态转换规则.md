# |<<

**状态转换规则 (pm_tansirule / nc.vo.pmbd.pmtransirule.TransiRuleHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4539.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transi | 主键 | pk_transi | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | bill_type | 单据类型编码 | bill_type | varchar(4) |  | 字符串 (String) |
| 6 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 8 | pk_state_after | 处理后状态 | pk_state_after | varchar(20) |  | 项目状态 (projectstateVO) |
| 9 | pre_flag | 预制标志 | pre_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |