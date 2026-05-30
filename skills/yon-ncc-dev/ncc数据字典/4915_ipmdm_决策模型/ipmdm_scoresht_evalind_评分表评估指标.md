# |<<

**评分表评估指标 (ipmdm_scoresht_evalind / nc.vo.ipmdm.scoresht.ScoreShtEvalindVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scoresht_evalind | 评分表评估指标主键 | pk_scoresht_evalind | char(20) | √ | 主键 (UFID) |
| 2 | pk_eval_indicators | 决策评估指标主键 | pk_eval_indicators | varchar(20) |  | 决策评估指标 (EvalIndicatorsVO) |
| 3 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 4 | code | 指标编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 指标名称 | name | varchar(80) |  | 字符串 (String) |
| 6 | bisleaf | 叶子节点 | bisleaf | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | vlevel | 层级 | vlevel | varchar(50) |  | 字符串 (String) |
| 8 | parentlevelcode | 上层编码 | parentlevelcode | varchar(50) |  | 字符串 (String) |
| 9 | vlevelcode | 层级编码 | vlevelcode | varchar(50) |  | 字符串 (String) |
| 10 | vmemo | 指标描述 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 11 | nfull_score | 指标满分 | nfull_score | decimal(28, 2) |  | 数值 (UFDouble) |
| 12 | nlowest_score | 最低分要求 | nlowest_score | decimal(28, 2) |  | 数值 (UFDouble) |
| 13 | vcoring_criteria | 评分标准 | vcoring_criteria | varchar(2048) |  | 备注 (Memo) |
| 14 | score | 评分 | score | decimal(28, 2) |  | 数值 (UFDouble) | 0.00 |
| 15 | reason | 评分理由 | reason | varchar(2048) |  | 备注 (Memo) |
| 16 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 17 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 18 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 19 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 20 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 21 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 22 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 23 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 24 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
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
| 38 | beedit | 是否可打分 | beedit | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |