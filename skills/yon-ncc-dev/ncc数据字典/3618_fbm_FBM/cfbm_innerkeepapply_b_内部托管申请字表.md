# |<<

**内部托管申请字表 (cfbm_innerkeepapply_b / nc.vo.cfbm.innerkeepapply.InnerKeepApplyBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1414.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerkeepapply_b | 主键 | pk_innerkeepapply_b | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 7 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 8 | registerstatus | 票据状态 | registerstatus | varchar(50) |  | 字符串 (String) |
| 9 | fbmbilltype | 票据类型 | fbmbilltype | varchar(20) |  | 票据类型 (notetype) |
| 10 | returnresult | 中心处理结果 | returnresult | varchar(50) |  | 中心处理结果 (ReturnResultEnum) |  | receive=接收; |