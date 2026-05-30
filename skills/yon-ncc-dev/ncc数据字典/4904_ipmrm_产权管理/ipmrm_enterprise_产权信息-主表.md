# |<<

**产权信息-主表 (ipmrm_enterprise / nc.vo.ipmrm.enterpriseinfo.EnterpriseinfoHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3372.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enterprise | 产权信息主表主键 | pk_enterprise | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 法人组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 法人组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | bill_date | 单据日期 | bill_date | char(19) |  | 日期 (UFDate) |
| 7 | pk_enterprise_person | 企业编码 | pk_enterprise_person | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 8 | enterprise_code | 企业参照用编码 | enterprise_code | varchar(50) |  | 字符串 (String) |
| 9 | enterprise_name | 企业名称 | enterprise_name | varchar(500) |  | 字符串 (String) |
| 10 | enterprise_short | 企业简称 | enterprise_short | varchar(200) |  | 字符串 (String) |
| 11 | superior_enterprise | 上级企业 | superior_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 12 | setup_date | 成立日期 | setup_date | char(19) |  | 日期 (UFDate) |
| 13 | enterprise_introduct | 企业简介 | enterprise_introduct | varchar(2048) |  | 备注 (Memo) |
| 14 | scope_business | 经营范围 | scope_business | varchar(2048) |  | 备注 (Memo) |
| 15 | legal_behalf | 法人代表 | legal_behalf | varchar(50) |  | 字符串 (String) |
| 16 | legal_pid | 法人身份证号码 | legal_pid | varchar(50) |  | 字符串 (String) |
| 17 | industry | 所属行业 | industry | varchar(20) |  | 经济行业(自定义档案) (Defdoc-SYS005_0xx) |
| 18 | economic_type | 经济类型 | economic_type | varchar(20) |  | 经济类型(自定义档案) (Defdoc-SYS004_0xx) |
| 19 | enterprise_level | 企业级次 | enterprise_level | varchar(50) |  | 企业级次 (EnterpriseLevel) |  | 1=一级; |