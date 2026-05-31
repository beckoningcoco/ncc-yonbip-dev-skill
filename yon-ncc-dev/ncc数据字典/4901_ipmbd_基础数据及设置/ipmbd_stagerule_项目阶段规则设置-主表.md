# |<<

**项目阶段规则设置-主表 (ipmbd_stagerule / nc.vo.ipmbd.projectstagerule.ProjectStageRuleHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3232.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stagerule | 规则设置主键 | pk_stagerule | char(20) | √ | 主键 (UFID) |
| 2 | code | 规则编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 规则名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_billtype | 单据类型主键 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 5 | vbilltypecode | 单据类型 | vbilltypecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_transitype | 交易类型主键 | pk_transitype | varchar(50) |  | 字符串 (String) |
| 7 | vtranstypecode | 交易类型 | vtranstypecode | varchar(50) |  | 字符串 (String) |
| 8 | bispreset | 是否是预置数据 | bispreset | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | biscandelete | 是否可以删除 | biscandelete | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | enablestate | 启用标识 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 14 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 15 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 19 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 20 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 21 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 22 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 23 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 24 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 25 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 45 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 46 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 47 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 48 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |