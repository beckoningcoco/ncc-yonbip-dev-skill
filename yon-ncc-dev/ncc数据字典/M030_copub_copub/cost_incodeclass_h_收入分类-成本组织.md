# |<<

**收入分类-成本组织 (cost_incodeclass_h / nc.vo.hrpco.incodeclass.IncodeclassorgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1614.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomeclass | 主键 | pk_incomeclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | name | 收入分类名称 | name | varchar(50) | √ | 字符串 (String) |
| 6 | code | 收入分类编号 | code | varchar(50) | √ | 字符串 (String) |
| 7 | father_pk | 上级 | father_pk | varchar(20) |  | 收入分类-成本组织 (incodeclass) |
| 8 | innercode | 内联码 | innercode | varchar(50) |  | 字符串 (String) |
| 9 | parentid | 上级分类编码 | parentid | varchar(20) |  | 主键 (UFID) |
| 10 | parentname | 上级分类名称 | parentname | varchar(50) |  | 字符串 (String) |
| 11 | enablestate | 启用状态 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | grade | 级次 | grade | int |  | 整数 (Integer) |
| 13 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 14 | inforesourse | 信息来源 | inforesourse | varchar(50) |  | 字符串 (String) |
| 15 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 35 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 36 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 37 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 38 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |