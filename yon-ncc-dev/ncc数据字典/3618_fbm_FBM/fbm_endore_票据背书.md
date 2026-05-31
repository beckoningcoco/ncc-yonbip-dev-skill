# |<<

**票据背书 (fbm_endore / nc.vo.fbm.endore.EndoreVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2130.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_endore | 主键 | pk_endore | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型主属性 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 4 | pk_register | 登记表主键 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 5 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 主键 (UFID) |
| 6 | endorser | 背书单位 | endorser | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | endorsee | 被背书单位 | endorsee | varchar(20) |  | 客商 (custsupplier) |
| 8 | endoretype | 背书类型 | endoretype | varchar(50) |  | 背书类型 (EndoreTypeEnum) |  | ININ=法人内部交换; |