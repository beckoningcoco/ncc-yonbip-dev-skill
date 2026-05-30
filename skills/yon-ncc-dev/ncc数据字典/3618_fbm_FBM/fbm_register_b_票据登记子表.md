# |<<

**票据登记子表 (fbm_register_b / nc.vo.fbm.register.RegisterBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2154.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register_b | 主键 | pk_register_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_register | 主表主键 | pk_register | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_guarantee | 担保合同 | pk_guarantee | varchar(20) |  | 担保合同 (GuaContractVO) |
| 7 | pk_gpmcurr | 担保合同币种 | pk_gpmcurr | varchar(20) |  | 币种 (currtype) |
| 8 | guantype | 担保方式 | guantype | int |  | 担保方式 (DebttypeEnum) |  | 1=保证; |