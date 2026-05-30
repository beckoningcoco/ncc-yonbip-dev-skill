# |<<

**我的账簿 (gl_styleandquery / nc.vo.gl.myBook.styleandquery)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2480.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_styleandquery | 我的帐簿标识 | pk_styleandquery | char(20) | √ | 主键 (UFID) |
| 2 | pk_sob | SOB标识 | pk_sob | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | nodecode | 功能节点号 | nodecode | char(20) |  | 主键 (UFID) |
| 5 | operator | 操作员 | operator | char(20) |  | 主键 (UFID) |
| 6 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 7 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 8 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |