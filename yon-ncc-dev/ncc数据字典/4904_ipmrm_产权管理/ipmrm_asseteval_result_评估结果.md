# |<<

**评估结果 (ipmrm_asseteval_result / nc.vo.ipmrm.asseteval.AssetEvalResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3359.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetseval_result | 资产评估结果主键 | pk_assetseval_result | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | vmemo | 备注 | vmemo | varchar(200) |  | 备注 (Memo) |
| 4 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 5 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 6 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 7 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 8 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 9 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 10 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 11 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 12 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 13 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 14 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 15 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 16 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 19 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 20 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 21 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 22 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 23 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 24 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 25 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 26 | pk_assetevalresult | 资产评估结果项目 | pk_assetevalresult | varchar(20) |  | 资产评估结果项目 (AssertEvalResultVO) |
| 27 | nbookmny | 帐面价值（万元） | nbookmny | decimal(28, 6) |  | 数值 (UFDouble) |
| 28 | norigbookmny | 帐面价值（组织原币） | norigbookmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nbasebookmny | 帐面价值（组织本币） | nbasebookmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | ngpbookmny | 帐面价值（集团本币） | ngpbookmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nallbookmny | 帐面价值（全局本币） | nallbookmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nevalmny | 评估价值（万元） | nevalmny | decimal(28, 6) |  | 数值 (UFDouble) |
| 33 | norigevalmny | 评估价值（组织原币） | norigevalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nbaseevalmny | 评估价值（组织本币） | nbaseevalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | ngpevalmny | 评估价值（集团本币） | ngpevalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nallevalmny | 评估价值（全局本币） | nallevalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nincrdecrmny | 增减值（万元） | nincrdecrmny | decimal(28, 6) |  | 数值 (UFDouble) |
| 38 | norigincrdecrmny | 增减值（组织原币） | norigincrdecrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | nbaseincrdecrmny | 增减值（组织本币） | nbaseincrdecrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | ngpincrdecrmny | 增减值（集团本币） | ngpincrdecrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nallincrdecrmny | 增减值（全局本币） | nallincrdecrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nincr_decr_rate | 增减率 | nincr_decr_rate | decimal(28, 2) |  | 数值 (UFDouble) |
| 43 | code | 评估结果项目编码 | code | varchar(50) |  | 字符串 (String) |
| 44 | name | 评估结果项目名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 45 | sortid | 评估结果项目排序 | sortid | int |  | 整数 (Integer) |
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