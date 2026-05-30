# |<<

**押汇合同 (lcm_docucontract / nc.vo.lcm.docucontract.DocuContractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3561.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 合同主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | isinitial | 期初标识 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_apply | 申请单号 | pk_apply | varchar(20) |  | 押汇申请 (lcm_locuapply) |
| 7 | contractcode | 合同编号 | contractcode | varchar(255) |  | 字符串 (String) |
| 8 | contstatus | 合同状态 | contstatus | varchar(50) |  | 合同状态 (ContStatusEnum) |  | NOCOMMIT=待提交; |