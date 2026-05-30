# |<<

**经济财务指标 (ipmbd_enterprise_financial / nc.vo.ipmbd.enterpriseperson.EnterprisePersionFinancialVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3222.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financial | 经济财务指标主键 | pk_financial | char(20) | √ | 主键 (UFID) |
| 2 | cycle | 周期 | cycle | varchar(50) |  | 字符串 (String) |
| 3 | norigtotalassetsmny | 资产总额(万元) | norigtotalassetsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | nbasetotalassetsmny | 资产总额组织本币(万元) | nbasetotalassetsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | ngptotalassetsmny | 资产总额集团本币(万元) | ngptotalassetsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nalltotalassetsmny | 资产总额全局本币(万元) | nalltotalassetsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | norigownerequitymny | 所有者权益(万元) | norigownerequitymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nbaseownerequitymny | 所有者权益织本币(万元) | nbaseownerequitymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ngpownerequitymny | 所有者权益集团本币(万元) | ngpownerequitymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nallownerequitymny | 所有者权益全局本币(万元) | nallownerequitymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | norigincomemny | 营业收入(万元) | norigincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nbaseincomemny | 营业收入织本币(万元) | nbaseincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ngpincomemny | 营业收入集团本币(万元) | ngpincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nallincomemny | 营业收入全局本币(万元) | nallincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | norigprofittotalmny | 利润总额(万元) | norigprofittotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nbaseprofittotalmny | 利润总额组织本币(万元) | nbaseprofittotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ngpprofittotalmny | 利润总额集团本币(万元) | ngpprofittotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nallprofittotalmny | 利润总额全局本币(万元) | nallprofittotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | norignetprofitmny | 净利润(万元) | norignetprofitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nbasenetprofitmny | 净利润组织本币(万元) | nbasenetprofitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ngpnetprofitmny | 净利润集团本币(万元) | ngpnetprofitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nallnetprofitmny | 净利润全局本币(万元) | nallnetprofitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 24 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 25 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 26 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 27 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 28 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 29 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 30 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 31 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 32 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 33 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 34 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 35 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 36 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 37 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 38 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 39 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 40 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 41 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 42 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 43 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 44 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 45 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 46 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |