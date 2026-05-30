# |<<

**DepartClass (cost_departclass_h / nc.vo.hrpco.departclass.DepartClass)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1611.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_departclass | 主键 | pk_departclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 6 | name | 名称 | name | varchar(50) | √ | 字符串 (String) |
| 7 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | parentcode | 上级分类编码 | parentcode | varchar(20) |  | DepartClass (DepartClass) |
| 10 | parentname | 上级分类名称 | parentname | varchar(20) |  | DepartClass (DepartClass) |
| 11 | enablestate | 启用状态 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 13 | grade | 级次 | grade | int |  | 整数 (Integer) |
| 14 | inforesourse | 信息来源 | inforesourse | varchar(50) |  | 字符串 (String) |
| 15 | innercode | 内联码 | innercode | varchar(50) |  | 字符串 (String) |
| 16 | father_pk | 上级 | father_pk | varchar(20) |  | DepartClass (DepartClass) |
| 17 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 37 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 38 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 39 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 40 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |