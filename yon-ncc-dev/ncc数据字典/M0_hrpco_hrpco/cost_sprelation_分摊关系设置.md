# |<<

**分摊关系设置 (cost_sprelation / nc.vo.hrpco.sprelation.SprelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1630.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gpspmethod_h | 主键 | pk_gpspmethod_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_soucodept | 源科室编码 | pk_soucodept | varchar(20) |  | 科室档案 (CodepartVO) |
| 6 | pk_coprojectage | 成本项目中介编码 | pk_coprojectage | varchar(20) |  | 成本分摊中介子表 (CospagencyinfoVO) |
| 7 | pk_codeptage | 科室中介编码 | pk_codeptage | varchar(20) |  | 科室分摊中介子表 (DeptspagencyinfoVO) |
| 8 | pk_destcopeart | 目的成本科室编码 | pk_destcopeart | varchar(20) |  | 科室档案 (CodepartVO) |
| 9 | venablestate | 是否封存 | venablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | vmemo | 备注 | vmemo | varchar(200) |  | 备注 (Memo) |
| 11 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 12 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 13 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 33 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 34 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 35 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 36 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |