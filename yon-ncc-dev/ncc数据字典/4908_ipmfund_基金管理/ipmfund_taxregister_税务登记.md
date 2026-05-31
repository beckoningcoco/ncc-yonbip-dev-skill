# |<<

**税务登记 (ipmfund_taxregister / nc.vo.ipmfund.taxregister.TaxregisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3341.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxregister | 税务登记主键 | pk_taxregister | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | vbillname | 单据名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 7 | pk_taxpayer | 纳税人名称 | pk_taxpayer | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 8 | legal_behalf | 法人代表 | legal_behalf | varchar(50) |  | 字符串 (String) |
| 9 | taxregistercode | 税务登记代码 | taxregistercode | varchar(50) |  | 字符串 (String) |
| 10 | legal_pid | 法人身份证号码 | legal_pid | varchar(50) |  | 字符串 (String) |
| 11 | social_credit_code | 统一社会信用代码 | social_credit_code | varchar(50) |  | 字符串 (String) |
| 12 | org_institut_code | 组织机构代码 | org_institut_code | varchar(50) |  | 字符串 (String) |
| 13 | regist_code | 注册号 | regist_code | varchar(50) |  | 字符串 (String) |
| 14 | registertype | 登记类型 | registertype | varchar(50) |  | 字符串 (String) |
| 15 | accountype | 核算方式 | accountype | varchar(50) |  | 核算方式 (AccounType) |  | 1=独立核算; |