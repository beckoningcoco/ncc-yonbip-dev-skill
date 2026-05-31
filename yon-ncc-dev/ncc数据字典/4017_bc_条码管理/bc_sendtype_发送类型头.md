# |<<

**发送类型头 (bc_sendtype / nc.vo.bcsi.entity.BcsiTypeHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/248.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_type | 主键 | pk_type | char(20) | √ | 主键 (UFID) |
| 2 | billtype | 单据类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | bisred | 是否红字 | bisred | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | vsystype | 外系统类型 | vsystype | int |  | ESysType (ESysType) |  | 1=PDA; |