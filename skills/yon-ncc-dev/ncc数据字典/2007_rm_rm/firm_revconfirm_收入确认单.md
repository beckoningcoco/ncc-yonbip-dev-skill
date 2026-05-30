# |<<

**收入确认单 (firm_revconfirm / nc.vo.rm.revconfirm.RevConfirmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2285.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_revconfirm | 收入确认单主键 | pk_revconfirm | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | billcode | 单据号 | billcode | varchar(50) | √ | 字符串 (String) |
| 6 | billdate | 单据日期 | billdate | char(19) | √ | 日期 (UFDate) |
| 7 | confirmtype | 收入确认类型 | confirmtype | int |  | 收入确认类型 (IncomeTypeEnum) |  | 1=按时点; |