# |<<

**汇总项目 (fa_gatheritem / nc.vo.fa.option.GatheritemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2025.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheritem | 主键 | pk_gatheritem | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_accbook | 账簿 | pk_accbook | varchar(20) |  | 字符串 (String) |
| 4 | pk_period | 会计期间 | pk_period | varchar(20) |  | 会计期间档案 (accperiod) |
| 5 | accyear | 会计年度 | accyear | varchar(20) |  | 字符串 (String) |
| 6 | period | 会计月份 | period | varchar(50) |  | 字符串 (String) |
| 7 | item_name | 项目名称 | item_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | item_code | 项目编码 | item_code | varchar(20) |  | 字符串 (String) |
| 9 | system_flag | 是否系统项目 | system_flag | int |  | 整数 (Integer) |
| 10 | level1 | 起始级次 | level1 | int |  | 整数 (Integer) |
| 11 | level2 | 终止级次 | level2 | int |  | 整数 (Integer) |
| 12 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |