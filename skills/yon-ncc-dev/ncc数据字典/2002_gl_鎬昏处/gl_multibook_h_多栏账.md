# |<<

**多栏账 (gl_multibook_h / nc.vo.gl.multbook.gl_multbook_h)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2435.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_multicol | 多栏账主键 | pk_multicol | char(20) | √ | 多栏账分析 (gl_multibook_b2) |
| 2 | multicolname | 多栏账名称 | multicolname | varchar(40) |  | 字符串 (String) |
| 3 | remark | 备注 | remark | varchar(40) |  | 字符串 (String) |
| 4 | format | 格式 | format | int |  | 整数 (Integer) |
| 5 | statcoltype | 统计栏目类型 | statcoltype | int |  | 整数 (Integer) |
| 6 | analycoltype | 分析栏目类型 | analycoltype | varchar(20) |  | 多栏账分析 (gl_multibook_b2) |
| 7 | analymode | 分析方式 | analymode | int |  | 整数 (Integer) |
| 8 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 9 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 10 | pk_setofbook | 核算账簿 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 11 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 12 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |