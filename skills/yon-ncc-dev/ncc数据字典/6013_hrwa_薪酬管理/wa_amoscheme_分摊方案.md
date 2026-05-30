# |<<

**分摊方案 (wa_amoscheme / nc.vo.wa.amoscheme.AmoSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6319.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_amoscheme | 分摊方案主键 | pk_amoscheme | char(20) | √ | 主键 (UFID) |
| 2 | name | 方案名称 | name | varchar(128) | √ | 多语文本 (MultiLangText) |
| 3 | fratio | 分摊比例(%) | fratio | decimal(9, 6) |  | 数值 (UFDouble) |
| 4 | vmemo | 备注 | vmemo | varchar(100) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 7 | pk_billtypecode | 薪资单据 | pk_billtypecode | char(20) | √ | 单据类型 (BilltypeVO) |
| 8 | classid | 薪资方案主键 | classid | char(20) | √ | 主键 (UFID) |
| 9 | cyear | 薪资年度 | cyear | varchar(50) |  | 字符串 (String) |
| 10 | cperiod | 薪资月度 | cperiod | varchar(50) |  | 字符串 (String) |
| 11 | type | 分摊组织类型 | type | int | √ | 分摊组织类型 (AmoOrgTypeEnum) |  | 1=财务组织; |