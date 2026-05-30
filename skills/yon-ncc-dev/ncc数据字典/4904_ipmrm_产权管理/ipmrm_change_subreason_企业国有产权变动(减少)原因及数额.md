# |<<

**企业国有产权变动(减少)原因及数额 (ipmrm_change_subreason / nc.vo.ipmrm.changeequity.ChangeSubReasonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3371.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_change_sub | 企业国有产权变动(减少)原因及数额主键 | pk_change_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_subreason | 变动(减少)原因 | pk_subreason | varchar(20) |  | 企业国有产权变动(减少)原因设置 (EquitySubReasonVO) |
| 3 | norigstatecapitalmny | 变动（减少）国家资本 | norigstatecapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | nbasestatecapitalmny | 变动（减少）国家资本组织本币 | nbasestatecapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | ngpstatecapitalmny | 变动（减少）国家资本集团本币 | ngpstatecapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nallstatecapitalmny | 变动（减少）国家资本全局本币 | nallstatecapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | noriglegalcapitalmny | 变动（减少）国有法人资本 | noriglegalcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nbaselegalcapitalmny | 变动（减少）国有法人资本组织本币 | nbaselegalcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ngplegalcapitalmny | 变动（减少）国有法人资本集团本币 | ngplegalcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nalllegalcapitalmny | 变动（减少）国有法人资本全局本币 | nalllegalcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | supportsum | 是否支持合计 | supportsum | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | bissum | 是否合计数 | bissum | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 14 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 15 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 16 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 17 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 18 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 19 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 20 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 21 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 22 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 23 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 24 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 25 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 26 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 27 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 28 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 29 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 30 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 31 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 32 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 33 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 34 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 35 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 36 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 37 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |