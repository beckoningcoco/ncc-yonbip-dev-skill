# |<<

**对方科目对照关系设置 (gl_notrecaccrelation / nc.vo.gl.reconcile.notrecaccrelation.NotRecAccRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2438.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notrecaccrel | 主键 | pk_notrecaccrel | char(20) | √ | 主键 (UFID) |
| 2 | srcacccode | 来源科目编码 | srcacccode | varchar(20) | √ | 会计科目 (accasoa) |
| 3 | srcaccpk | 来源科目主键 | srcaccpk | varchar(50) |  | 字符串 (String) |
| 4 | inflfactor | 影响因素 | inflfactor | varchar(420) |  | 总账影响因素 (influecefactor) |
| 5 | desacccode | 目的科目编码-默认值 | desacccode | varchar(20) | √ | 会计科目 (accasoa) |
| 6 | desaccpk | 目的科目主键 | desaccpk | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织 (org) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |