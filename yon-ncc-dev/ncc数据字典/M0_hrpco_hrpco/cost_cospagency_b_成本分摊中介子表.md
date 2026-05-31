# |<<

**成本分摊中介子表 (cost_cospagency_b / nc.vo.hrpco.cospagency.CospagencyinfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1605.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cospagency_b | 子表主键 | pk_cospagency_b | char(20) | √ | 主键 (UFID) |
| 2 | vcrowno | 行号 | vcrowno | varchar(50) |  | 字符串 (String) |
| 3 | vagencycode | 成本项目中介编码 | vagencycode | varchar(50) |  | 字符串 (String) |
| 4 | agencyname | 成本项目中介名称 | agencyname | varchar(50) |  | 字符串 (String) |
| 5 | upercent | 百分比(%) | upercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | venablestate | 是否启用 | venablestate | varchar(50) |  | 字符串 (String) |
| 7 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 8 | pk_coproject | 成本项目 | pk_coproject | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 9 | pk_codept | 科室编码 | pk_codept | varchar(20) |  | 科室档案 (CodepartVO) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 12 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 13 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 14 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |