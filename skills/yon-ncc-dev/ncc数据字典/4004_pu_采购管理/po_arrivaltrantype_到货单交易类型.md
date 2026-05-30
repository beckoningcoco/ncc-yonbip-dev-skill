# |<<

**到货单交易类型 (po_arrivaltrantype / nc.vo.pu.m23trantype.entity.ArrivalTranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4584.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arrivaltrantype | 到货单交易类型 | pk_arrivaltrantype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) | √ | 字符串 (String) |
| 4 | ctrantypeid | 交易类型 | ctrantypeid | char(20) |  | 主键 (UFID) |
| 5 | bneedcheck | 需要自动报检 | bneedcheck | char(1) | √ | 布尔类型 (UFBoolean) |