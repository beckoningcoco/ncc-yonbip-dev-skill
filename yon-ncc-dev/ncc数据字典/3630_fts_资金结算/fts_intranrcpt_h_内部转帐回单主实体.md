# |<<

**内部转帐回单主实体 (fts_intranrcpt_h / nc.vo.fts.innertransfer.receipt.InnerTransferRcptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2316.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intranrcpt_h | 内部转帐回单号标识 | pk_intranrcpt_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtype | 单据类型编码 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | transtype | 转帐类型 | transtype | varchar(50) |  | 转账类型 (transfertype) |  | SCenterReceiveNSUnit=同中心收方发起转账; |