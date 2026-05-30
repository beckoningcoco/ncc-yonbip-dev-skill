# |<<

**计划模板定义 (pd_plantemplate / nc.vo.pd.pd0304.PlanTemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4364.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cplantemplateid | 计划模板 | cplantemplateid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vtemplatecode | 模板编码 | vtemplatecode | varchar(40) | √ | 字符串 (String) |
| 6 | vtemplatename | 模板名称 | vtemplatename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | iday | 天 | iday | int |  | 整数 (Integer) |
| 8 | iweek | 周 | iweek | int |  | 整数 (Integer) |
| 9 | ixun | 旬 | ixun | int |  | 整数 (Integer) |
| 10 | imonth | 月 | imonth | int |  | 整数 (Integer) |
| 11 | iseason | 季 | iseason | int |  | 整数 (Integer) |
| 12 | iyear | 年 | iyear | int |  | 整数 (Integer) |
| 13 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
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
| 34 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 35 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 36 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 37 | modifiedtime | 修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |