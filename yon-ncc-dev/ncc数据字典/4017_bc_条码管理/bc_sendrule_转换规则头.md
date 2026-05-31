# |<<

**转换规则头 (bc_sendrule / nc.vo.bcsi.entity.BcsiRuleHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/245.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | 主键 | pk_rule | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | NC单据标识 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 3 | cbilltypename | NC单据名称 | cbilltypename | varchar(50) |  | 字符串 (String) |
| 4 | ftype | 数据方向 | ftype | int |  | EsendType (EsendType) |  | 1=NC系统>>外系统; |