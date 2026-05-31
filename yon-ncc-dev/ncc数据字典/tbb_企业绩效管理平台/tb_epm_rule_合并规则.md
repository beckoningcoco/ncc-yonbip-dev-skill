# |<<

**合并规则 (tb_epm_rule / nc.vo.tb.rule.consolidation.ConsolidationBusiRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5718.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objname | objname | objname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | objcode | objcode | objcode | varchar(50) |  | 字符串 (String) |
| 4 | descript | 描述 | descript | varchar(500) |  | 字符串 (String) |
| 5 | groupdim | 分组维度 | groupdim | varchar(400) |  | 字符串 (String) |
| 6 | pk_cube | 应用模型 | pk_cube | varchar(50) |  | 字符串 (String) |
| 7 | isctlinvest | 控制投资 | isctlinvest | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | ruletype | 规则类型 | ruletype | varchar(20) |  | 字符串 (String) |
| 9 | syscode | 创建系统 | syscode | varchar(10) |  | 字符串 (String) |
| 10 | pk_group | pk_group | pk_group | varchar(20) |  | 字符串 (String) |
| 11 | pk_org | pk_org | pk_org | varchar(20) |  | 字符串 (String) |
| 12 | createdby | createdby | createdby | varchar(20) |  | 字符串 (String) |
| 13 | createddate | createddate | createddate | varchar(19) |  | 字符串 (String) |
| 14 | modifiedby | modifiedby | modifiedby | varchar(20) |  | 字符串 (String) |
| 15 | modifieddate | modifieddate | modifieddate | varchar(19) |  | 字符串 (String) |
| 16 | datatype | datatype | datatype | varchar(10) |  | 字符串 (String) |
| 17 | adjusttype | adjusttype | adjusttype | varchar(30) |  | 字符串 (String) |
| 18 | pk_meetrule | pk_meetrule | pk_meetrule | varchar(20) |  | 字符串 (String) |
| 19 | adjust_type | adjust_type | adjust_type | varchar(30) |  | 字符串 (String) |
| 20 | adjust_maxbalance | adjust_maxbalance | adjust_maxbalance | decimal(33, 8) |  | 数值 (UFDouble) |
| 21 | adjust_datatype | adjust_datatype | adjust_datatype | varchar(10) |  | 字符串 (String) |
| 22 | adjust_firstentity | adjust_firstentity | adjust_firstentity | varchar(20) |  | 字符串 (String) |
| 23 | adjust_endentity | adjust_endentity | adjust_endentity | varchar(20) |  | 字符串 (String) |
| 24 | meet_type | meet_type | meet_type | varchar(10) |  | 字符串 (String) |
| 25 | meet_maxbalance | meet_maxbalance | meet_maxbalance | decimal(33, 8) |  | 数值 (UFDouble) |
| 26 | meet_datatype | meet_datatype | meet_datatype | varchar(10) |  | 字符串 (String) |
| 27 | meet_firstentity | meet_firstentity | meet_firstentity | varchar(20) |  | 字符串 (String) |
| 28 | meet_endentity | meet_endentity | meet_endentity | varchar(20) |  | 字符串 (String) |
| 29 | isequalscountevail | isequalscountevail | isequalscountevail | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | issinglevouch | issinglevouch | issinglevouch | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |
| 32 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 33 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 34 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 35 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |