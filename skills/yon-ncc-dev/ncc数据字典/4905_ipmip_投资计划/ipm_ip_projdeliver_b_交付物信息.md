# |<<

**交付物信息 (ipm_ip_projdeliver_b / nc.vo.ipmip.projdeliver.ProjDeliverBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3188.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projdeliver_b | 投资项目交付单子表主键 | pk_projdeliver_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | delivername | 交付物名称 | delivername | varchar(400) |  | 字符串 (String) |
| 4 | specs | 规格 | specs | varchar(400) |  | 字符串 (String) |
| 5 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 6 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 7 | numbers | 数量 | numbers | int |  | 整数 (Integer) |
| 8 | norigdelivermny | 交付物价值 | norigdelivermny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nbasedelivermny | 交付物价值组织本币 | nbasedelivermny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ngpdelivermny | 交付物价值集团本币 | ngpdelivermny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nalldelivermny | 交付物价值全局本币 | nalldelivermny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | bisassets | 是否生成资产卡片 | bisassets | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_assetorg | 资产组织 | pk_assetorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 14 | pk_assetorg_v | 资产组织版本 | pk_assetorg_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 15 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 16 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 17 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 18 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 19 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 20 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 21 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 22 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 23 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 24 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 25 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 26 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 27 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 28 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 29 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 30 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 31 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 32 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 33 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 34 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 35 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 36 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 37 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 38 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |