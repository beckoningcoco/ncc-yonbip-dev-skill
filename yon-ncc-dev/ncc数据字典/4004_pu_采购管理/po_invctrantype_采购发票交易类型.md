# |<<

**采购发票交易类型 (po_invctrantype / nc.vo.pu.m25trantype.entity.InvcTranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invctrantype | 采购发票交易类型主键 | pk_invctrantype | char(20) | √ | 主键 (UFID) |
| 2 | itoarapmode | 传应付控制 | itoarapmode | int | √ | 传应付控制方式 (SendControlMode) |  | 0=入库匹配; |