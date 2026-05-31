# |<<

**生产计划体系成员 (org_produpmember / nc.vo.org.productionplan.ProduPMemberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prodmember | 生产计划体系成员主键 | pk_prodmember | char(20) | √ | 主键 (UFID) |
| 2 | pk_prod | 生产计划体系主键 | pk_prod | varchar(20) |  | 生产计划体系 (productionplan) |
| 3 | pk_org | 对应组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 5 | pk_fathermember | 上级成员 | pk_fathermember | varchar(20) |  | 生产计划体系成员 (productionplanmember) |
| 6 | virtualorg | 虚组织 | virtualorg | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | idx | 排列顺序 | idx | int |  | 整数 (Integer) |
| 8 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |