# |<<

**询报价单交易类型 (purp_askbill_transtype / nc.vo.pp.m29.entity.AskBillTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4802.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_askbill_transtype | 询报价单交易类型主键 | pk_askbill_transtype | char(20) | √ | 主键 (UFID) |
| 2 | ctrantypeid | 交易类型 | ctrantypeid | char(20) |  | 主键 (UFID) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |