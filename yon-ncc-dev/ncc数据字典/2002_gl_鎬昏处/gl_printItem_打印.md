# |<<

**打印 (gl_printItem / nc.vo.gl.print.printItem)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2445.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printitem | 打印项标识 | pk_printitem | char(20) | √ | 主键 (UFID) |
| 2 | itemcode | 打印项编码 | itemcode | varchar(15) |  | 字符串 (String) |
| 3 | itemname | 打印项名称 | itemname | varchar(50) |  | 字符串 (String) |
| 4 | printobjectcode | 打印对象 | printobjectcode | varchar(16) |  | 字符串 (String) |
| 5 | glqueryvo | 查询条件 | glqueryvo | image |  | 图片类型 (IMAGE) |
| 6 | glprintvo | 打印条件 | glprintvo | image |  | 图片类型 (IMAGE) |
| 7 | pk_creator | 创建人 | pk_creator | char(20) |  | 主键 (UFID) |
| 8 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 9 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 10 | pk_setofbook | 核算账簿 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 11 | reserve1 | 预留字段1 | reserve1 | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | reserve2 | 预留字段2 | reserve2 | varchar(60) |  | 字符串 (String) |
| 13 | reserve3 | 预留字段3 | reserve3 | varchar(60) |  | 字符串 (String) |
| 14 | reserve4 | 预留字段4 | reserve4 | varchar(60) |  | 字符串 (String) |
| 15 | reserve5 | 预留字段5 | reserve5 | varchar(60) |  | 字符串 (String) |
| 16 | memo | 备注 | memo | varchar(300) |  | 字符串 (String) |
| 17 | ispublic | 是否公用 | ispublic | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 19 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |