# |<<

**映射规则明细 (sscrp_fieldmap_b / nc.vo.sscrp.fieldmap.FieldMapRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5616.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fieldmap_b | 主键 | pk_fieldmap_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 序号 | rowno | int |  | 整数 (Integer) |
| 3 | destcode | 目标字段编码 | destcode | varchar(256) |  | 字符串 (String) |
| 4 | destname | 目标字段名称 | destname | varchar(256) |  | 字符串 (String) |
| 5 | rpcardshowflag | 报账卡片显示 | rpcardshowflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | taskcardshowflag | 任务卡片显示 | taskcardshowflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | cardshowname | 卡片显示名称 | cardshowname | varchar(256) |  | 多语文本 (MultiLangText) |
| 8 | cardshowlenth | 卡片显示宽度(列) | cardshowlenth | int |  | 整数 (Integer) |
| 9 | ruletype | 规则类型 | ruletype | int |  | 整数 (Integer) |
| 10 | ruledata | 规则 | ruledata | varchar(512) |  | 字符串 (String) |
| 11 | rulename | 规则名称 | rulename | varchar(256) |  | 字符串 (String) |
| 12 | pk_sscpublicfield | 对应公共字段 | pk_sscpublicfield | varchar(20) |  | 公共字段 (sscrp_publicfield) |
| 13 | rplistshowflag | 报账列表显示 | rplistshowflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | tasklistshowflag | 任务列表显示 | tasklistshowflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | detailshowformula | 显示公式 | detailshowformula | varchar(512) |  | 字符串 (String) |
| 16 | fuzzymatch | 模糊匹配 | fuzzymatch | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | isdef | 是否自定义 | isdef | char(1) |  | 布尔类型 (UFBoolean) |