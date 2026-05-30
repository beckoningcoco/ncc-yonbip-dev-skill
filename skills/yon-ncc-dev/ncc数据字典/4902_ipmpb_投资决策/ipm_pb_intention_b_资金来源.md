# |<<

**资金来源 (ipm_pb_intention_b / nc.vo.ipmpb.intention.IntentionBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3196.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intention_b | 子表主键 | pk_intention_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_capitalsource | 资金来源类型 | pk_capitalsource | varchar(20) |  | 资金来源(投资) (CapitalSourceVO) |
| 3 | norigfundsmny | 资金数额 | norigfundsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | nbasefundsmny | 资金数额组织本币 | nbasefundsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | ngpfundsmny | 资金数额集团本币 | ngpfundsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nallfundsmny | 资金数额全局本币 | nallfundsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | norigownfundsmny | 已到位资金数额 | norigownfundsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nbaseownfundsmny | 已到位资金数额组织本币 | nbaseownfundsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ngpownfundsmny | 已到位资金数额集团本币 | ngpownfundsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nallownfundsmny | 已到位资金数额全局本币 | nallownfundsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 12 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 13 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 14 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 19 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 20 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 21 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 22 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 23 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 24 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 25 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 26 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 27 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 28 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 29 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 30 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 31 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 32 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 33 | vmemo | 备注 | vmemo | varchar(200) |  | 字符串 (String) |
| 34 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |