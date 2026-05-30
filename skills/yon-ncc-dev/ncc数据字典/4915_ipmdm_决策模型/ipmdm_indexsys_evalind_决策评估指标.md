# |<<

**决策评估指标 (ipmdm_indexsys_evalind / nc.vo.ipmdm.indexsys.IndexSysEvalindVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3242.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indexsys_evalind | 决策评估指标主键 | pk_indexsys_evalind | varchar(50) | √ | 字符串 (String) |
| 2 | pk_eval_indicators | 决策评估指标 | pk_eval_indicators | varchar(20) |  | 决策评估指标 (EvalIndicatorsVO) |
| 3 | name | 指标名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | code | 指标编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | vmemo | 指标描述 | vmemo | varchar(200) |  | 备注 (Memo) |
| 6 | enablestate | 启用标记 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bisleaf | 叶子节点 | bisleaf | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | vlevel | 层级 | vlevel | varchar(50) |  | 字符串 (String) |
| 9 | parentlevelcode | 上层编码 | parentlevelcode | varchar(50) |  | 字符串 (String) |
| 10 | vlevelcode | 层级编码 | vlevelcode | varchar(50) |  | 字符串 (String) |
| 11 | nfull_score | 指标满分 | nfull_score | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nlowest_score | 最低分要求 | nlowest_score | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | vcoring_criteria | 评分标准 | vcoring_criteria | varchar(200) |  | 备注 (Memo) |
| 14 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 19 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 20 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 21 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 22 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 23 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 24 | bedit | bedit | bedit | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | sunfullsorce | 下级满分 | sunfullsorce | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |