# |<<

**押汇合同 (batm_LocuContract / nc.vo.batm.lcmvo.LocuContractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/231.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 合同主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | contractcode | 合同编号 | contractcode | varchar(50) |  | 字符串 (String) |
| 6 | contstatus | 合同状态 | contstatus | varchar(50) |  | 字符串 (String) |
| 7 | pk_creditbank | 押汇银行 | pk_creditbank | varchar(20) |  | 银行档案 (bankdoc) |
| 8 | pk_debitorg | 押汇人 | pk_debitorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | cctype | 授信类型 | cctype | varchar(50) |  | 授信类型 (BeCreditTypeEnum) |  | 1=企业授信; |