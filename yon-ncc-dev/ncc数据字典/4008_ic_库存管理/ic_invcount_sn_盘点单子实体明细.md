# |<<

**盘点单子实体明细 (ic_invcount_sn / nc.vo.ic.m4r.entity.InvCountBodySNVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2917.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cspeciallid | 盘点单品表主键 | cspeciallid | char(20) | √ | 主键 (UFID) |
| 2 | vbarcode | 主条码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 3 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 4 | vboxbarcode | 箱条码 | vboxbarcode | varchar(50) |  | 字符串 (String) |
| 5 | vsncode | 序列号 | vsncode | varchar(128) |  | 字符串 (String) |
| 6 | nonhandnum | 账面主数量 | nonhandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | ncountnum | 盘点主数量 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_onhanddim | 结存纬度主键 | pk_onhanddim | varchar(20) |  | 主键 (UFID) |
| 9 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 10 | nonhandastnum | 账面数量 | nonhandastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ncountastnum | 盘点数量 | ncountastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | biscount | 是否实盘 | biscount | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bisonhand | 是否账面 | bisonhand | char(1) |  | 布尔类型 (UFBoolean) |