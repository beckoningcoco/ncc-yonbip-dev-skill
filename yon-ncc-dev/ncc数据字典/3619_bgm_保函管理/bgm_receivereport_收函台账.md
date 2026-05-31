# |<<

**收函台账 (bgm_receivereport / nc.vo.bgm.receivereport.ReceiveReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1181.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receivereport | 收函台账主键 | pk_receivereport | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | glno | 保函编号 | glno | varchar(50) |  | 字符串 (String) |
| 6 | glstatus | 保函状态 | glstatus | int |  | 保函状态 (GlstatusEnum) |  | 0=无状态; |