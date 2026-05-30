# |<<

**担保合同 (gpmc_GuaContract / nc.vo.gpmc.gpm.contract.GuaContractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2521.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_guacontract | 主键 | pk_guacontract | char(20) | √ | 主键 (UFID) |
| 2 | pk_version | 版本pk | pk_version | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | vbillno | 单据编号 | vbillno | varchar(200) |  | 字符串 (String) |
| 7 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(200) |  | 字符串 (String) |
| 8 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(200) |  | 字符串 (String) |
| 9 | busistatus | 单据状态 | busistatus | int |  | 单据状态 (BusistatusEnum) |  | -1=待提交; |