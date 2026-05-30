# |<<

**委收资金信息实体 (fts_gatheringfund / nc.vo.fts.commissiongathering.GatherFundVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2312.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheringfund | 委收资金信息实体标识 | pk_gatheringfund | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 主键 (UFID) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 主键 (UFID) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 主键 (UFID) |
| 5 | pk_bankaccount_r | 收款银行账号 | pk_bankaccount_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 6 | getmode | 收款方式 | getmode | varchar(30) |  | 收款方式 (gatheringtype) |  | direct=直接收款; |