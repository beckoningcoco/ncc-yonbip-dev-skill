# |<<

**支付确认单 (ebank_pmtconfirm / nc.vo.obm.pmtconfirm.PmtconfirmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1779.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | 主健 | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | srcbilltype | 来源单据类型 | srcbilltype | varchar(10) |  | 来源单据类型 (SrcBilltypeEnum) |  | 36K4=上收单; |