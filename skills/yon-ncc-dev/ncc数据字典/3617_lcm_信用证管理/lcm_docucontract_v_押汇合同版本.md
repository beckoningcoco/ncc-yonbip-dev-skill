# |<<

**押汇合同版本 (lcm_docucontract_v / nc.vo.lcm.docucontractv.DocuContractVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3562.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本PK | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_contract | 合同主键 | pk_contract | varchar(50) | √ | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | isinitial | 期初标识 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_apply | 申请单号 | pk_apply | varchar(20) |  | 押汇申请 (lcm_locuapply) |
| 8 | contractcode | 合同编号 | contractcode | varchar(255) |  | 字符串 (String) |
| 9 | contstatus | 合同状态 | contstatus | varchar(50) |  | 合同状态 (ContStatusEnum) |  | NOCOMMIT=待提交; |