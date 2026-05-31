# |<<

**巡检标准 (emm_routeinspectstd / nc.vo.emm.inspectstd.RouteInspStdHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1829.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_routeinspstd | 巡检标准主键 | pk_routeinspstd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | bill_code | 编码 | bill_code | varchar(50) |  | 字符串 (String) |
| 6 | bill_type | 单据类型 | bill_type | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | inspect_obj | 巡检对象 | inspect_obj | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | pk_sealer | 启用人 | pk_sealer | varchar(20) |  | 用户 (user) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |