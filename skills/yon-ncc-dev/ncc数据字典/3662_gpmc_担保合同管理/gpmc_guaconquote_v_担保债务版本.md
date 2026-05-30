# |<<

**担保债务版本 (gpmc_guaconquote_v / nc.vo.gpmc.gpm.guacontractquote.GuaContractQuoteVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2520.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 主键 | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_guacontractquote | 担保债务pk | pk_guacontractquote | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 8 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | busistatus | 单据状态 | busistatus | int |  | 担保债务单据状态 (GpmcQuoteBillStatusEnum) |  | -1=自由; |